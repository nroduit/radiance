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
package org.pushingpixels.demo.substance.main.samples.substance.api;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.substance.main.check.svg.flags.mx;
import org.pushingpixels.demo.substance.main.check.svg.flags.se;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.MenuGutterFillKind;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.GlobalScope#setMenuGutterFillKind(MenuGutterFillKind)} API.
 *
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.GlobalScope#setMenuGutterFillKind(MenuGutterFillKind)
 */
public class SetMenuGutterFillKind extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetMenuGutterFillKind() {
        super("Menu gutter fill kind");

        setLayout(new BorderLayout());

        // create sample menu bar with one menu and a few menu items
        JMenuBar jmb = new JMenuBar();
        JMenu menu = new JMenu("menu");
        menu.add(new JMenuItem("test item 1", mx.of(16, 16)));
        menu.add(new JMenuItem("test item 2"));
        menu.add(new JMenuItem("test item 3"));
        menu.addSeparator();
        menu.add(new JMenuItem("test menu item 4"));
        menu.add(new JMenuItem("test menu item 5", se.of(16, 16)));
        menu.add(new JMenuItem("test menu item 6"));
        jmb.add(menu);

        setJMenuBar(jmb);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JComboBox<MenuGutterFillKind> menuGutterFillCombo = new JComboBox<>(
                new MenuGutterFillKind[] {
                        MenuGutterFillKind.NONE,
                        MenuGutterFillKind.SOFT,
                        MenuGutterFillKind.HARD,
                        MenuGutterFillKind.SOFT_FILL,
                        MenuGutterFillKind.HARD_FILL});
        menuGutterFillCombo.setRenderer(new SubstanceDefaultComboBoxRenderer(menuGutterFillCombo) {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                MenuGutterFillKind mgfk = (MenuGutterFillKind) value;
                return super.getListCellRendererComponent(list, mgfk.name().toLowerCase(), index,
                        isSelected, cellHasFocus);
            }
        });
        menuGutterFillCombo.setSelectedItem(MenuGutterFillKind.HARD);
        // based on the selected item, set the global menu gutter fill kind
        menuGutterFillCombo.addActionListener(actionEvent -> SubstanceCortex.GlobalScope
                .setMenuGutterFillKind((MenuGutterFillKind) menuGutterFillCombo.getSelectedItem()));
        controls.add(new JLabel("Menu fill"));
        controls.add(menuGutterFillCombo);

        this.add(controls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new SetMenuGutterFillKind().setVisible(true);
        });
    }
}
