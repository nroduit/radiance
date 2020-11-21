/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.demo.plasma.common

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.demo.plasma.RadianceLogo
import org.pushingpixels.ember.setDecorationType
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbFileSelector
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.plasma.bcb.addDelayedPathListener
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.substance.api.ComponentState
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        JFrame.setDefaultLookAndFeelDecorated(true)
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val frame = JFrame("File explorer")
        val bar = BreadcrumbFileSelector()
        val filePanel = ExplorerFileViewPanel(bar, CommandButtonPresentationState.BIG)

        // Configure the breadcrumb bar to update the file panel every time
        // the path changes
        bar.model.addDelayedPathListener { ev ->
            val newPath = ev.source.items
            if (newPath.size > 0) {
                // Kick the loading of the path leaf content off the UI thread and then
                // pipe it back to the UI thread in setFolder call.
                filePanel.setFolder(withContext(Dispatchers.Default) {
                    bar.callback.getLeafs(newPath)
                })
            }
        }

        frame.layout = BorderLayout()
        bar.setDecorationType(SubstanceSlices.DecorationAreaType.HEADER)
        frame.add(bar, BorderLayout.NORTH)

        frame.add(JScrollPane(filePanel), BorderLayout.CENTER)

        val controls = JPanel(FlowLayout(FlowLayout.RIGHT))
        val setPath = JButton("Select and set path...")
        setPath.addDelayedActionListener {
            val folderChooser = JFileChooser()
            folderChooser.fileSelectionMode = JFileChooser.DIRECTORIES_ONLY
            if (folderChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                val selected = folderChooser.selectedFile
                bar.setPath(selected)
            }
        }
        controls.add(setPath)

        val states = JComboBox<CommandButtonPresentationState>(DefaultComboBoxModel(
                arrayOf<CommandButtonPresentationState>(
                        CommandButtonPresentationState.BIG, CommandButtonPresentationState.TILE,
                        CommandButtonPresentationState.MEDIUM, CommandButtonPresentationState.SMALL)))
        states.addItemListener {
            filePanel.cancelMainWorker()
            filePanel.projection.presentationModel.commandPresentationState = states.getItemAt(states.selectedIndex)
        }
        controls.add(states)

        frame.add(controls, BorderLayout.SOUTH)

        frame.iconImage = RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin()!!.getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED))
        frame.setSize(600, 400)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
