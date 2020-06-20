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
package org.pushingpixels.flamingo.api.common;

import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.common.popup.model.AbstractPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.flamingo.api.common.projection.CommandPopupMenuProjection;
import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceCommandButtonUI;
import org.pushingpixels.flamingo.internal.ui.common.CommandButtonUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.RibbonApplicationMenuPanelProjection;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * Command button. Note that while this class is a part of public API, it is highly
 * recommended to use the {@link Command} instance used to project the command button
 * on screen for any dynamic manipulation of the state.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandButton extends AbstractCommandButton {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "CommandButtonUI";

    /**
     * Associated popup callback. May be <code>null</code>.
     *
     * @see #setPopupCallback(PopupPanelCallback)
     * @see #getPopupCallback()
     */
    private PopupPanelCallback popupCallback;

    /**
     * The command button kind of this button.
     *
     * @see #setCommandButtonKind(CommandButtonKind)
     * @see #getCommandButtonKind()
     */
    private CommandButtonKind commandButtonKind;

    /**
     * The popup orientation kind of this button.
     *
     * @see #setPopupOrientationKind(CommandButtonPresentationModel.PopupOrientationKind)
     * @see #getPopupOrientationKind()
     */
    private CommandButtonPresentationModel.PopupOrientationKind popupOrientationKind;

    /**
     * The popup horizontal gravity of this button.
     *
     * @see #setPopupHorizontalGravity(CommandButtonPresentationModel.PopupHorizontalGravity)
     * @see #getPopupHorizontalGravity()
     */
    private CommandButtonPresentationModel.PopupHorizontalGravity popupHorizontalGravity;

    /**
     * Indicates the auto-repeat action mode. When the button is not in the
     * auto-repeat action mode, the registered action listeners are activated
     * when the mouse is released (just as with the base {@link AbstractButton}
     * ). When the button is in auto-repeat mode, the registered action
     * listeners are activated when the mouse is pressed. In addition, if the
     * mouse is still pressed after {@link #getAutoRepeatInitialInterval()}, the
     * action listeners will be activated every
     * {@link #getAutoRepeatSubsequentInterval()} until the button is disabled
     * or the mouse is released.
     *
     * @see #autoRepeatInitialInterval
     * @see #autoRepeatSubsequentInterval
     * @see #setAutoRepeatAction(boolean)
     * @see #isAutoRepeatAction()
     */
    private boolean isAutoRepeatAction;

    /**
     * The initial interval for invoking the registered action listeners in the
     * auto-repeat action mode.
     *
     * @see #isAutoRepeatAction
     * @see #autoRepeatSubsequentInterval
     * @see #getAutoRepeatInitialInterval()
     * @see #setAutoRepeatActionIntervals(int, int)
     */
    private int autoRepeatInitialInterval;

    /**
     * The subsequent interval for invoking the registered action listeners in
     * the auto-repeat action mode.
     *
     * @see #isAutoRepeatAction
     * @see #autoRepeatInitialInterval
     * @see #getAutoRepeatSubsequentInterval()
     * @see #setAutoRepeatActionIntervals(int, int)
     */
    private int autoRepeatSubsequentInterval;

    /**
     * Indicates that rollover should result in firing the action. Used in
     * conjunction with the {@link #isAutoRepeatAction} can model quick pan
     * buttons such as breadcrumb bar scrollers.
     *
     * @see #setFireActionOnRollover(boolean)
     * @see #isFireActionOnRollover()
     */
    private boolean isFireActionOnRollover;

    /**
     * Popup model of this button.
     *
     * @see #setPopupModel(PopupButtonModel)
     * @see #getPopupModel()
     */
    private PopupButtonModel popupModel;

    /**
     * Default popup handler for this button.
     */
    private PopupHandler popupHandler;

    /**
     * Rich tooltip for the popup area of this button.
     *
     * @see #setPopupRichTooltip(RichTooltip)
     * @see #getRichTooltip(MouseEvent)
     */
    private RichTooltip popupRichTooltip;

    /**
     * Key tip for the popup area of this button.
     *
     * @see #setPopupKeyTip(String)
     * @see #getPopupKeyTip()
     */
    private String popupKeyTip;

    /**
     * Enumerates the available command button kinds.
     *
     * @author Kirill Grouchnikov
     */
    public enum CommandButtonKind {
        /**
         * Command button that has only action area.
         */
        ACTION_ONLY(true, false),

        /**
         * Command button that has only popup area.
         */
        POPUP_ONLY(false, true),

        /**
         * Command button that has both action and popup areas, with the main
         * text click activating the action.
         */
        ACTION_AND_POPUP_MAIN_ACTION(true, true),

        /**
         * Command button that has both action and popup areas, with the main
         * text click activating the popup.
         */
        ACTION_AND_POPUP_MAIN_POPUP(true, true);

        /**
         * <code>true</code> if the command button kind has an action.
         */
        private boolean hasAction;

        /**
         * <code>true</code> if the command button kind has a popup.
         */
        private boolean hasPopup;

        /**
         * Constructs a new command button kind.
         *
         * @param hasAction Indicates whether the command button kind has an action.
         * @param hasPopup  Indicates whether the command button kind has a popup.
         */
        CommandButtonKind(boolean hasAction, boolean hasPopup) {
            this.hasAction = hasAction;
            this.hasPopup = hasPopup;
        }

        /**
         * Returns indication whether this command button kind has an action.
         *
         * @return <code>true</code> if the command button kind has an action,
         * <code>false</code> otherwise.
         */
        public boolean hasAction() {
            return hasAction;
        }

        /**
         * Returns indication whether this command button kind has a popup.
         *
         * @return <code>true</code> if the command button kind has a popup,
         * <code>false</code> otherwise.
         */
        public boolean hasPopup() {
            return hasPopup;
        }
    }

    /**
     * Extension of the default button model that supports the
     * {@link PopupButtonModel} interface.
     *
     * @author Kirill Grouchnikov
     */
    private static class DefaultPopupButtonModel extends DefaultButtonModel
            implements PopupButtonModel {
        /**
         * Identifies the "popup showing" bit in the bitmask, which indicates
         * that the visibility status of the associated popup.
         */
        public final static int POPUP_SHOWING = 1 << 8;

        private JCommandButton commandButton;

        /**
         * Creates a new default popup button model.
         */
        public DefaultPopupButtonModel(JCommandButton commandButton) {
            super();
            this.commandButton = commandButton;
        }

        @Override
        public void addPopupActionListener(PopupActionListener l) {
            listenerList.add(PopupActionListener.class, l);
        }

        @Override
        public void removePopupActionListener(PopupActionListener l) {
            listenerList.remove(PopupActionListener.class, l);
        }

        /**
         * Notifies all listeners that have registered interest for notification
         * on this event type.
         *
         * @param e the <code>ActionEvent</code> to deliver to listeners
         * @see EventListenerList
         */
        protected void firePopupActionPerformed(ActionEvent e) {
            // Guaranteed to return a non-null array
            Object[] listeners = listenerList.getListenerList();
            // Process the listeners last to first, notifying
            // those that are interested in this event
            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == PopupActionListener.class) {
                    ((PopupActionListener) listeners[i + 1]).actionPerformed(e);
                }
            }
        }

        @Override
        public void setPressed(boolean b) {
            if ((isPressed() == b) || !isEnabled()) {
                return;
            }

            if (b) {
                stateMask |= PRESSED;
            } else {
                stateMask &= ~PRESSED;
            }

            if (isPressed() && isArmed()) {
                // fire the popup action on button press and not on button
                // release - like the comboboxes
                int modifiers = 0;
                AWTEvent currentEvent = EventQueue.getCurrentEvent();
                if (currentEvent instanceof InputEvent) {
                    modifiers = ((InputEvent) currentEvent).getModifiersEx();
                } else if (currentEvent instanceof ActionEvent) {
                    modifiers = ((ActionEvent) currentEvent).getModifiers();
                }
                this.commandButton.getUI().setInnerFocusOnAction(false);
                firePopupActionPerformed(new ActionEvent(this,
                        ActionEvent.ACTION_PERFORMED, getActionCommand(),
                        EventQueue.getMostRecentEventTime(), modifiers));
            }

            fireStateChanged();
        }

        @Override
        public boolean isPopupShowing() {
            return (stateMask & POPUP_SHOWING) != 0;
        }

        @Override
        public void setPopupShowing(boolean b) {
            // System.out.println(this.isPopupShowing() + "-->" + b);
            if (this.isPopupShowing() == b) {
                return;
            }

            if (b) {
                stateMask |= POPUP_SHOWING;
            } else {
                stateMask &= ~POPUP_SHOWING;
            }

            fireStateChanged();
        }
    }

    @SuppressWarnings("unchecked")
    public JCommandButton(Projection<AbstractCommandButton, ? extends Command,
            CommandButtonPresentationModel> projection) {
        super(projection);

        ActionButtonModel actionButtonModel = new ActionRepeatableButtonModel(this);
        actionButtonModel.setEnabled(command.isActionEnabled());
        actionButtonModel.setSelected(command.isToggleSelected());
        this.setActionModel(actionButtonModel);

        // important - handler creation must be done before setting
        // the popup model so that it can be registered to track the
        // changes
        this.popupHandler = new PopupHandler();
        PopupButtonModel popupButtonModel = new DefaultPopupButtonModel(this);
        popupButtonModel.setEnabled(projection.getContentModel().isSecondaryEnabled());
        this.setPopupModel(popupButtonModel);

        boolean hasAction = (command.getAction() != null);
        boolean hasPopup = (command.getSecondaryContentModel() != null);

        if (hasPopup) {
            if (command.getSecondaryContentModel() != null) {
                CommandMenuContentModel popupMenuContentModel =
                        command.getSecondaryContentModel();
                AbstractPopupMenuPresentationModel popupMenuPresentationModel =
                        commandPresentation.getPopupMenuPresentationModel();
                if (popupMenuContentModel instanceof RibbonApplicationMenu) {
                    RibbonApplicationMenuCommandButtonProjection ribbonApplicationMenuProjection =
                            (RibbonApplicationMenuCommandButtonProjection) this.projection;
                    if (popupMenuPresentationModel == null) {
                        popupMenuPresentationModel =
                                CommandPopupMenuPresentationModel.builder().build();
                    }
                    RibbonApplicationMenuPanelProjection menuPanelProjection =
                            new RibbonApplicationMenuPanelProjection(
                                    (RibbonApplicationMenu) popupMenuContentModel,
                                    (CommandPopupMenuPresentationModel) popupMenuPresentationModel);
                    menuPanelProjection.setCommandOverlays(
                            ribbonApplicationMenuProjection.getCommandOverlays());
                    menuPanelProjection.setSecondaryLevelCommandPresentationState(
                            ribbonApplicationMenuProjection.getSecondaryLevelCommandPresentationState());
                    this.setPopupCallback((JCommandButton commandButton)
                            -> menuPanelProjection.buildComponent());
                } else if (popupMenuContentModel != null) {
                    CommandButtonProjection<? extends Command> commandProjection =
                            (CommandButtonProjection<? extends Command>) this.projection;
                    if (popupMenuPresentationModel == null) {
                        popupMenuPresentationModel =
                                CommandPopupMenuPresentationModel.builder().build();
                    }
                    CommandPopupMenuProjection commandPopupMenuProjection =
                            new CommandPopupMenuProjection(popupMenuContentModel,
                                    (CommandPopupMenuPresentationModel) popupMenuPresentationModel);
                    commandPopupMenuProjection.setCommandOverlays(
                            this.projection.getCommandOverlays());
                    if (commandProjection.getPopupMenuSupplier() != null) {
                        commandPopupMenuProjection.setComponentSupplier(
                                (Projection.ComponentSupplier<JCommandPopupMenu,
                                        CommandMenuContentModel,
                                        CommandPopupMenuPresentationModel>) commandProjection.getPopupMenuSupplier());
                    }
                    if (commandProjection.getPopupMenuCustomizer() != null) {
                        commandPopupMenuProjection.setComponentCustomizer(
                                (Projection.ComponentCustomizer<JCommandPopupMenu>) commandProjection.getPopupMenuCustomizer());
                    }
                    this.setPopupCallback((JCommandButton commandButton)
                            -> commandPopupMenuProjection.buildComponent());
                }
            }
            this.setPopupRichTooltip(command.getSecondaryRichTooltip());
            this.setPopupKeyTip(commandPresentation.getPopupKeyTip());
        }

        if (hasAction && hasPopup) {
            this.setCommandButtonKind(commandPresentation.isTextClickAction()
                    ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                    : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        } else if (hasPopup) {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        } else {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
        }

        if (commandPresentation.isAutoRepeatAction()) {
            this.setAutoRepeatAction(true);
            if (commandPresentation.hasAutoRepeatIntervalsSet()) {
                this.setAutoRepeatActionIntervals(
                        commandPresentation.getAutoRepeatInitialInterval(),
                        commandPresentation.getAutoRepeatSubsequentInterval());
            }
        }

        this.setFireActionOnRollover(commandPresentation.isFireActionOnRollover());
        this.getActionModel().setFireActionOnPress(commandPresentation.isFireActionOnPress());

        this.setPopupOrientationKind(commandPresentation.getPopupOrientationKind());
        this.setPopupHorizontalGravity(commandPresentation.getPopupHorizontalGravity());

        if (command.getActionPreview() != null) {
            this.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = false;

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        command.getActionPreview().onCommandPreviewCanceled(command);
                    }
                    if (!wasRollover && isRollover) {
                        command.getActionPreview().onCommandPreviewActivated(command);
                    }
                    wasRollover = isRollover;
                }
            });
        }

        this.updateUI();
    }

    /**
     * Returns the command button kind of this button.
     *
     * @return Command button kind of this button.
     * @see #setCommandButtonKind(CommandButtonKind)
     */
    public CommandButtonKind getCommandButtonKind() {
        return this.commandButtonKind;
    }

    /**
     * Sets the kind for this button. Fires a <code>commandButtonKind</code>
     * property change event.
     *
     * @param commandButtonKind The new button kind.
     * @see #getCommandButtonKind()
     */
    public void setCommandButtonKind(CommandButtonKind commandButtonKind) {
        CommandButtonKind old = this.commandButtonKind;
        this.commandButtonKind = commandButtonKind;
        if (old != this.commandButtonKind) {
            firePropertyChange("commandButtonKind", old, this.commandButtonKind);
        }
    }

    /**
     * Returns the popup orientation kind of this button.
     *
     * @return Popup orientation kind of this button.
     * @see #setPopupOrientationKind(CommandButtonPresentationModel.PopupOrientationKind)
     */
    public CommandButtonPresentationModel.PopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
    }

    /**
     * Sets the popup orientation for this button. Fires a
     * <code>popupOrientationKind</code> property change event.
     *
     * @param popupOrientationKind The new popup orientation kind.
     * @see #getPopupOrientationKind()
     */
    public void setPopupOrientationKind(
            CommandButtonPresentationModel.PopupOrientationKind popupOrientationKind) {
        CommandButtonPresentationModel.PopupOrientationKind old = this.popupOrientationKind;
        this.popupOrientationKind = popupOrientationKind;
        if (old != this.popupOrientationKind) {
            firePropertyChange("popupOrientationKind", old, this.popupOrientationKind);
        }
    }

    /**
     * Returns the popup horizontal gravity of this button.
     *
     * @return Popup horizontal gravity of this button.
     * @see #setPopupHorizontalGravity(CommandButtonPresentationModel.PopupHorizontalGravity)
     */
    public CommandButtonPresentationModel.PopupHorizontalGravity getPopupHorizontalGravity() {
        return this.popupHorizontalGravity;
    }

    /**
     * Sets the popup horizontal gravity for this button. Fires a
     * <code>popupHorizontalGravity</code> property change event.
     *
     * @param popupHorizontalGravity The new popup horizontal gravity.
     * @see #getPopupHorizontalGravity()
     */
    public void setPopupHorizontalGravity(
            CommandButtonPresentationModel.PopupHorizontalGravity popupHorizontalGravity) {
        CommandButtonPresentationModel.PopupHorizontalGravity old = this.popupHorizontalGravity;
        this.popupHorizontalGravity = popupHorizontalGravity;
        if (old != this.popupHorizontalGravity) {
            firePropertyChange("popupHorizontalGravity", old, this.popupHorizontalGravity);
        }
    }

    @Override
    public void updateUI() {
        setUI(SubstanceCommandButtonUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Returns the associated popup callback.
     *
     * @return The associated popup callback.
     * @see #setPopupCallback(PopupPanelCallback)
     */
    public PopupPanelCallback getPopupCallback() {
        return this.popupCallback;
    }

    /**
     * Sets new popup callback for <code>this</code> button.
     *
     * @param popupCallback New popup callback for <code>this</code> button.
     * @see #getPopupCallback()
     */
    public void setPopupCallback(PopupPanelCallback popupCallback) {
        this.popupCallback = popupCallback;

        if (command != null) {
            boolean hasAction = (command.getAction() != null);
            boolean hasPopup = (this.popupCallback != null);

            if (hasPopup) {
                this.setPopupRichTooltip(command.getSecondaryRichTooltip());
                this.setPopupKeyTip(commandPresentation.getPopupKeyTip());
            }

            if (hasAction && hasPopup) {
                this.setCommandButtonKind(commandPresentation.isTextClickAction()
                        ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                        : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasPopup) {
                this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
            } else {
                this.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
            }
        }
    }

    /**
     * Sets the auto-repeat action indication.
     *
     * @param isAutoRepeatAction If <code>true</code>, pressing the button will activate
     *                           auto-repeat action mode. When the button is not in the
     *                           auto-repeat action mode, the registered action listeners are
     *                           activated when the mouse is released (just as with the base
     *                           {@link AbstractButton}). When the button is in auto-repeat
     *                           mode, the registered action listeners are activated when the
     *                           mouse is pressed. In addition, is the mouse is still pressed
     *                           after {@link #getAutoRepeatInitialInterval()}, the action
     *                           listeners will be activated every
     *                           {@link #getAutoRepeatSubsequentInterval()} until the button is
     *                           disabled or the mouse is released.
     * @see #setAutoRepeatActionIntervals(int, int)
     * @see #isAutoRepeatAction()
     */
    public void setAutoRepeatAction(boolean isAutoRepeatAction) {
        this.isAutoRepeatAction = isAutoRepeatAction;
    }

    /**
     * Sets the intervals for the auto-repeat action mode.
     *
     * @param initial    The initial interval for invoking the registered action
     *                   listeners in the auto-repeat action mode.
     * @param subsequent The subsequent interval for invoking the registered action
     *                   listeners in the auto-repeat action mode.
     * @see #setAutoRepeatAction(boolean)
     * @see #isAutoRepeatAction()
     * @see #getAutoRepeatInitialInterval()
     * @see #getAutoRepeatSubsequentInterval()
     */
    public void setAutoRepeatActionIntervals(int initial, int subsequent) {
        this.autoRepeatInitialInterval = initial;
        this.autoRepeatSubsequentInterval = subsequent;
    }

    /**
     * Returns indication whether the button is in auto-repeat action mode.
     *
     * @return <code>true</code> if the button is in auto-repeat action mode,
     * <code>false</code> otherwise.
     * @see #setAutoRepeatAction(boolean)
     * @see #setAutoRepeatActionIntervals(int, int)
     * @see #getAutoRepeatInitialInterval()
     * @see #getAutoRepeatSubsequentInterval()
     */
    public boolean isAutoRepeatAction() {
        return this.isAutoRepeatAction;
    }

    /**
     * Returns the initial interval for invoking the registered action listeners
     * in the auto-repeat action mode.
     *
     * @return The initial interval for invoking the registered action listeners
     * in the auto-repeat action mode.
     * @see #setAutoRepeatActionIntervals(int, int)
     * @see #setAutoRepeatAction(boolean)
     * @see #isAutoRepeatAction()
     * @see #getAutoRepeatSubsequentInterval()
     */
    public int getAutoRepeatInitialInterval() {
        return autoRepeatInitialInterval;
    }

    /**
     * Returns the subsequent interval for invoking the registered action
     * listeners in the auto-repeat action mode.
     *
     * @return The subsequent interval for invoking the registered action
     * listeners in the auto-repeat action mode.
     * @see #setAutoRepeatActionIntervals(int, int)
     * @see #setAutoRepeatAction(boolean)
     * @see #isAutoRepeatAction()
     * @see #getAutoRepeatInitialInterval()
     */
    public int getAutoRepeatSubsequentInterval() {
        return autoRepeatSubsequentInterval;
    }

    /**
     * Sets action-on-rollover mode. When this mode is on, button will fire
     * action events when it gets rollover (instead of press). Combine with
     * {@link #setAutoRepeatAction(boolean)} passing <code>true</code> to get
     * auto-repeat action fired on rollover (useful for quicker manipulation of
     * scroller buttons, for example).
     *
     * @param isFireActionOnRollover If <code>true</code>, the button is moved into the
     *                               action-on-rollover mode.
     * @see #isFireActionOnRollover()
     */
    public void setFireActionOnRollover(boolean isFireActionOnRollover) {
        this.isFireActionOnRollover = isFireActionOnRollover;
    }

    /**
     * Returns indication whether this button is in action-on-rollover mode.
     *
     * @return <code>true</code> if this button is in action-on-rollover mode,
     * <code>false</code> otherwise.
     * @see #setFireActionOnRollover(boolean)
     */
    public boolean isFireActionOnRollover() {
        return this.isFireActionOnRollover;
    }

    /**
     * Returns the popup model of this button.
     *
     * @return The popup model of this button.
     * @see #setPopupModel(PopupButtonModel)
     */
    public PopupButtonModel getPopupModel() {
        return this.popupModel;
    }

    /**
     * Sets the new popup model for this button. Fires a <code>popupModel</code>
     * property change event.
     *
     * @param newModel The new popup model for this button.
     * @see #getPopupModel()
     */
    public void setPopupModel(PopupButtonModel newModel) {
        PopupButtonModel oldModel = getPopupModel();

        if (oldModel != null) {
            oldModel.removeChangeListener(this.popupHandler);
            oldModel.removeActionListener(this.popupHandler);
        }

        this.popupModel = newModel;

        if (newModel != null) {
            newModel.addChangeListener(this.popupHandler);
            newModel.addActionListener(this.popupHandler);
        }

        firePropertyChange("popupModel", oldModel, newModel);
        if (newModel != oldModel) {
            revalidate();
            repaint();
        }
    }

    @Override
    public void setEnabled(boolean b) {
        if (this.popupModel != null) {
            if (!b && this.popupModel.isRollover()) {
                this.popupModel.setRollover(false);
            }
        }
        super.setEnabled(b);
        if (this.popupModel != null) {
            this.popupModel.setEnabled(b);
        }
    }

    /**
     * Default popup handler.
     *
     * @author Kirill Grouchnikov
     */
    class PopupHandler implements PopupActionListener, ChangeListener {
        public void stateChanged(ChangeEvent e) {
            fireStateChanged();
            repaint();
        }

        public void actionPerformed(ActionEvent event) {
            firePopupActionPerformed(event);
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * <code>event</code> parameter.
     *
     * @param event the <code>ActionEvent</code> object
     * @see EventListenerList
     */
    protected void firePopupActionPerformed(ActionEvent event) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        ActionEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == PopupActionListener.class) {
                // Lazily create the event:
                if (e == null) {
                    String actionCommand = event.getActionCommand();
                    e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                            actionCommand, event.getWhen(), event
                            .getModifiers());
                }
                ((PopupActionListener) listeners[i + 1]).actionPerformed(e);
            }
        }
    }

    @Override
    boolean hasRichTooltips() {
        return super.hasRichTooltips() || (this.popupRichTooltip != null);
    }

    /**
     * Sets the rich tooltip for the popup area of this button.
     *
     * @param richTooltip Rich tooltip for the popup area of this button.
     * @see #getRichTooltip(MouseEvent)
     * @see #setActionRichTooltip(RichTooltip)
     */
    public void setPopupRichTooltip(RichTooltip richTooltip) {
        this.popupRichTooltip = richTooltip;
    }

    @Override
    public RichTooltip getRichTooltip(MouseEvent event) {
        CommandButtonUI ui = this.getUI();
        if (ui.getLayoutInfo().actionClickArea.contains(event.getPoint())) {
            return super.getRichTooltip(event);
        }
        if (ui.getLayoutInfo().popupClickArea.contains(event.getPoint())) {
            return this.popupRichTooltip;
        }
        return null;
    }

    /**
     * Returns the key tip for the popup area of this button.
     *
     * @return The key tip for the popup area of this button.
     * @see #setPopupKeyTip(String)
     * @see #getActionKeyTip()
     */
    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    /**
     * Sets the key tip for the popup area of this button. Fires a
     * <code>popupKeyTip</code> property change event.
     *
     * @param popupKeyTip The key tip for the popup area of this button.
     * @see #getPopupKeyTip()
     * @see #setActionKeyTip(String)
     */
    public void setPopupKeyTip(String popupKeyTip) {
        String old = this.popupKeyTip;
        this.popupKeyTip = popupKeyTip;
        this.firePropertyChange("popupKeyTip", old, this.popupKeyTip);
    }

    /**
     * Programmatically perform a "click" on the popup area. This does the same
     * thing as if the user had pressed and released the popup area of the
     * button.
     */
    public void doPopupClick() {
        Dimension size = getSize();
        PopupButtonModel popupModel = this.getPopupModel();
        popupModel.setArmed(true);
        popupModel.setPressed(true);
        paintImmediately(new Rectangle(0, 0, size.width, size.height));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
        }
        popupModel.setPressed(false);
        popupModel.setArmed(false);
        popupModel.setPopupShowing(true);
        paintImmediately(new Rectangle(0, 0, size.width, size.height));
    }

    public boolean isPopupVisible() {
        List<PopupPanelManager.PopupInfo> popupInfos =
                PopupPanelManager.defaultManager().getShownPath();
        for (PopupPanelManager.PopupInfo popupInfo : popupInfos) {
            if (popupInfo.getPopupOriginator() == this) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a rollover action listener that will be called when the rollover
     * state of this button becomes active.
     *
     * @param l The rollover action listener to add.
     * @see #removeRolloverActionListener(RolloverActionListener)
     */
    public void addRolloverActionListener(RolloverActionListener l) {
        this.listenerList.add(RolloverActionListener.class, l);
    }

    /**
     * Removes the specified rollover action listener.
     *
     * @param l The listener to remove.
     * @see #addRolloverActionListener(RolloverActionListener)
     */
    public void removeRolloverActionListener(RolloverActionListener l) {
        this.listenerList.remove(RolloverActionListener.class, l);
    }

    /**
     * Programmatically perform a "rollover" on the action area. This does the
     * same thing as if the user had moved the mouse over the action area of the
     * button.
     */
    public void doActionRollover() {
        ActionEvent ae = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                this.getActionModel().getActionCommand());
        // Guaranteed to return a non-null array
        RolloverActionListener[] listeners = this.getListeners(RolloverActionListener.class);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 1; i >= 0; i--) {
            (listeners[i]).actionPerformed(ae);
        }
    }
}
