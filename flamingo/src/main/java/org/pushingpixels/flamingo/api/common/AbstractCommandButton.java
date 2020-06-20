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

import org.pushingpixels.flamingo.api.common.model.ActionButtonModel;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.internal.ui.common.BasicCommandButtonUI;
import org.pushingpixels.flamingo.internal.ui.common.CommandButtonUI;
import org.pushingpixels.neon.api.icon.ResizableIcon;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 * Base class for command buttons. Note that while this class is a part of public API, it is highly
 * recommended to use the {@link Command} instance used to project the command button
 * on screen for any dynamic manipulation of the state.
 *
 * In the next major release this class will be folded into {@link JCommandButton}. Do not extend this
 * class directly. Instead, extend {@link JCommandButton} or, better yet, work with {@link Command}s.
 *
 * @author Kirill Grouchnikov
 */
public abstract class AbstractCommandButton extends RichTooltipManager.JTrackableComponent {
    public static final int DEFAULT_HORIZONTAL_ALIGNMENT = SwingConstants.CENTER;
    public static final double DEFAULT_GAP_SCALE_FACTOR = 1.0;

    protected Projection<AbstractCommandButton, ? extends Command, CommandButtonPresentationModel> projection;
    protected Command command;
    protected CommandButtonPresentationModel commandPresentation;

    /**
     * Associated icon.
     *
     * @see #setIcon(ResizableIcon)
     * @see #getIcon()
     */
    private ResizableIcon icon;

    /**
     * Associated disabled icon.
     *
     * @see #setDisabledIcon(ResizableIcon)
     * @see #getDisabledIcon()
     */
    private ResizableIcon disabledIcon;

    /**
     * The button text.
     *
     * @see #setText(String)
     * @see #getText()
     */
    private String text;

    /**
     * The button action model.
     *
     * @see #getActionModel()
     * @see #setActionModel(ActionButtonModel)
     */
    private ActionButtonModel actionModel;

    /**
     * Additional text. It is up to the presentation layer to decide whether to display this
     * text (depending on the layout and available space).
     *
     * @see #setExtraText(String)
     * @see #getExtraText()
     */
    private String extraText;

    /**
     * Current presentation state of <code>this</code> button.
     *
     * @see #setPresentationState(CommandButtonPresentationState)
     * @see #getPresentationState()
     */
    private CommandButtonPresentationState presentationState;

    /**
     * The dimension of the icon of the associated command button in the
     * {@link CommandButtonPresentationState#FIT_TO_ICON} state.
     *
     * @see #getIconDimension()
     * @see #setIconDimension(int)
     */
    private int iconDimension;

    /**
     * Indication whether this button is flat.
     *
     * @see #setFlat(boolean)
     * @see #isFlat()
     */
    private boolean isFlat;

    /**
     * Horizontal alignment of the content.
     *
     * @see #setHorizontalAlignment(int)
     * @see #getHorizontalAlignment()
     */
    private int horizontalAlignment;

    /**
     * Scale factor for horizontal gaps.
     *
     * @see #setHGapScaleFactor(double)
     * @see #getHGapScaleFactor()
     */
    private double hgapScaleFactor;

    /**
     * Scale factor for vertical gaps.
     *
     * @see #setVGapScaleFactor(double)
     * @see #getVGapScaleFactor()
     */
    private double vgapScaleFactor;

    /**
     * Rich tooltip for the action area.
     *
     * @see #setActionRichTooltip(RichTooltip)
     * @see #getRichTooltip(MouseEvent)
     */
    private RichTooltip actionRichTooltip;

    /**
     * Location order kind for buttons placed in command button strips or for
     * buttons that need the visuals of segmented strips.
     *
     * @see #setLocationOrderKind(CommandButtonLocationOrderKind)
     * @see #getLocationOrderKind()
     */
    private CommandButtonLocationOrderKind locationOrderKind;

    /**
     * Action handler for the button.
     */
    private ActionHandler actionHandler;

    /**
     * Key tip for the action area.
     *
     * @see #setActionKeyTip(String)
     * @see #getActionKeyTip()
     */
    private String actionKeyTip;

    /**
     * Enumerates the available values for the location order kind. This is used
     * for buttons placed in command button strips or for buttons that need the
     * visuals of segmented strips.
     *
     * @author Kirill Grouchnikov
     */
    public enum CommandButtonLocationOrderKind {
        /**
         * Indicates that this button is the only button in the strip.
         */
        ONLY,

        /**
         * Indicates that this button is the first button in the strip.
         */
        FIRST,

        /**
         * Indicates that this button is in the middle of the strip.
         */
        MIDDLE,

        /**
         * Indicates that this button is the last button in the strip.
         */
        LAST
    }

    public AbstractCommandButton(Projection<AbstractCommandButton, ? extends Command, CommandButtonPresentationModel> projection) {
        this.projection = projection;
        this.command = projection.getContentModel();
        this.commandPresentation = projection.getPresentationModel();

        this.setText(command.getText());
        this.setExtraText(command.getExtraText());

        this.setIcon((command.getIconFactory() != null)
                ? command.getIconFactory().createNewIcon()
                : null);
        this.setDisabledIcon((command.getDisabledIconFactory() != null)
                ? command.getDisabledIconFactory().createNewIcon()
                : null);

        boolean hasAction = (command.getAction() != null);

        if (hasAction) {
            this.addCommandListener(command.getAction());
            this.setActionRichTooltip(command.getActionRichTooltip());
            this.setActionKeyTip(commandPresentation.getActionKeyTip());
        }

        if (!commandPresentation.isToDismissPopupsOnActivation()) {
            this.putClientProperty(BasicCommandButtonUI.DONT_DISPOSE_POPUPS, Boolean.TRUE);
        }

        this.setPresentationState(commandPresentation.getPresentationState());
        this.setHorizontalAlignment(commandPresentation.getHorizontalAlignment());
        this.setHGapScaleFactor(commandPresentation.getHorizontalGapScaleFactor());
        this.setVGapScaleFactor(commandPresentation.getVerticalGapScaleFactor());
        this.setFlat(commandPresentation.isFlat());
        this.setFocusable(commandPresentation.isFocusable());
        if (commandPresentation.getIconDimension() != null) {
            this.setIconDimension(commandPresentation.getIconDimension());
        }

        this.actionHandler = new ActionHandler();
        this.setOpaque(false);
    }

    /**
     * Sets the new UI delegate.
     *
     * @param ui New UI delegate.
     */
    public void setUI(CommandButtonUI ui) {
        super.setUI(ui);
    }

    /**
     * Returns the UI delegate for this button.
     *
     * @return The UI delegate for this button.
     */
    public CommandButtonUI getUI() {
        return (CommandButtonUI) ui;
    }

    public CommandButtonProjection<? extends Command> getProjection() {
        return (CommandButtonProjection<? extends Command>) this.projection;
    }

    /**
     * Sets new presentation state for <code>this</code> button. Fires a
     * <code>presentationState</code> property change event.
     *
     * @param state New presentation state.
     * @see #getPresentationState()
     */
    public void setPresentationState(CommandButtonPresentationState state) {
        CommandButtonPresentationState old = this.presentationState;
        this.presentationState = state;

        this.firePropertyChange("presentationState", old, this.presentationState);
    }

    /**
     * Returns the associated icon.
     *
     * @return The associated icon.
     * @see #getDisabledIcon()
     * @see #setIcon(ResizableIcon)
     */
    public ResizableIcon getIcon() {
        return icon;
    }

    /**
     * Sets new icon for this button. Fires an <code>icon</code> property change
     * event.
     *
     * @param defaultIcon New default icon for this button.
     * @see #setDisabledIcon(ResizableIcon)
     * @see #getIcon()
     */
    public void setIcon(ResizableIcon defaultIcon) {
        ResizableIcon oldValue = this.icon;
        this.icon = defaultIcon;

        firePropertyChange("icon", oldValue, defaultIcon);
        if (defaultIcon != oldValue) {
            if (defaultIcon == null || oldValue == null
                    || defaultIcon.getIconWidth() != oldValue.getIconWidth()
                    || defaultIcon.getIconHeight() != oldValue.getIconHeight()) {
                revalidate();
            }
            repaint();
        }
    }

    /**
     * Sets the disabled icon for this button.
     *
     * @param disabledIcon Disabled icon for this button.
     * @see #setIcon(ResizableIcon)
     * @see #getDisabledIcon()
     */
    public void setDisabledIcon(ResizableIcon disabledIcon) {
        this.disabledIcon = disabledIcon;
    }

    /**
     * Returns the associated disabled icon.
     *
     * @return The associated disabled icon.
     * @see #setDisabledIcon(ResizableIcon)
     * @see #getIcon()
     */
    public ResizableIcon getDisabledIcon() {
        return disabledIcon;
    }

    /**
     * Return the current presentation state of <code>this</code> button.
     *
     * @return The current presentation state of <code>this</code> button.
     * @see #setPresentationState(CommandButtonPresentationState)
     */
    public CommandButtonPresentationState getPresentationState() {
        return this.presentationState;
    }

    /**
     * Returns the extra text of this button.
     *
     * @return Extra text of this button.
     * @see #setExtraText(String)
     */
    public String getExtraText() {
        return this.extraText;
    }

    /**
     * Sets the extra text for this button. Fires an <code>extraText</code>
     * property change event.
     *
     * @param extraText Extra text for this button.
     * @see #getExtraText()
     */
    public void setExtraText(String extraText) {
        String oldValue = this.extraText;
        this.extraText = extraText;
        firePropertyChange("extraText", oldValue, extraText);

        if (accessibleContext != null) {
            accessibleContext.firePropertyChange(
                    AccessibleContext.ACCESSIBLE_VISIBLE_DATA_PROPERTY,
                    oldValue, extraText);
        }
        if ((extraText == null) || (oldValue == null)
                || !extraText.equals(oldValue)) {
            revalidate();
            repaint();
        }
    }

    /**
     * Returns the text of this button.
     *
     * @return The text of this button.
     * @see #setText(String)
     */
    public String getText() {
        return this.text;
    }

    /**
     * Sets the new text for this button. Fires a <code>text</code> property
     * change event.
     *
     * @param text The new text for this button.
     * @see #getText()
     */
    public void setText(String text) {
        String oldValue = this.text;
        this.text = text;
        firePropertyChange("text", oldValue, text);

        if (accessibleContext != null) {
            accessibleContext.firePropertyChange(
                    AccessibleContext.ACCESSIBLE_VISIBLE_DATA_PROPERTY,
                    oldValue, text);
        }
        if ((text == null) || (oldValue == null) || !text.equals(oldValue)) {
            revalidate();
            repaint();
        }
    }

    /**
     * Updates the dimension of the icon of the associated command button in the
     * {@link CommandButtonPresentationState#FIT_TO_ICON} state. Fires an
     * <code>iconDimension</code> property change event.
     *
     * @param dimension New dimension of the icon of the associated command button in
     *                  the {@link CommandButtonPresentationState#FIT_TO_ICON} state.
     * @see #getIconDimension()
     */
    public void setIconDimension(int dimension) {
        if (this.iconDimension != dimension) {
            int old = this.iconDimension;
            this.iconDimension = dimension;
            this.firePropertyChange("iconDimension", old, this.iconDimension);
        }
    }

    /**
     * Returns the dimension of the icon of the associated command button in the
     * {@link CommandButtonPresentationState#FIT_TO_ICON} state.
     *
     * @return The dimension of the icon of the associated command button in the
     * {@link CommandButtonPresentationState#FIT_TO_ICON} state.
     * @see #setIconDimension(int)
     */
    public int getIconDimension() {
        return this.iconDimension;
    }

    /**
     * Returns indication whether this button has flat appearance.
     *
     * @return <code>true</code> if this button has flat appearance,
     * <code>false</code> otherwise.
     * @see #setFlat(boolean)
     */
    public boolean isFlat() {
        return this.isFlat;
    }

    /**
     * Sets the flat appearance of this button. Fires a <code>flat</code>
     * property change event.
     *
     * @param isFlat If <code>true</code>, this button will have flat appearance,
     *               otherwise this button will not have flat appearance.
     * @see #isFlat()
     */
    public void setFlat(boolean isFlat) {
        boolean old = this.isFlat;
        this.isFlat = isFlat;
        if (old != this.isFlat) {
            this.firePropertyChange("flat", old, this.isFlat);
        }

        if (old != isFlat) {
            repaint();
        }
    }

    /**
     * Returns the action model for this button.
     *
     * @return The action model for this button.
     * @see #setActionModel(ActionButtonModel)
     */
    public ActionButtonModel getActionModel() {
        return this.actionModel;
    }

    /**
     * Sets the new action model for this button. Fires an
     * <code>actionModel</code> property change event.
     *
     * @param newModel The new action model for this button.
     * @see #getActionModel()
     */
    public void setActionModel(ActionButtonModel newModel) {
        ButtonModel oldModel = getActionModel();

        if (oldModel != null) {
            oldModel.removeChangeListener(this.actionHandler);
            oldModel.removeActionListener(this.actionHandler);
        }

        actionModel = newModel;

        if (newModel != null) {
            newModel.addChangeListener(this.actionHandler);
            newModel.addActionListener(this.actionHandler);
        }

        firePropertyChange("actionModel", oldModel, newModel);
        if (newModel != oldModel) {
            revalidate();
            repaint();
        }
    }

    /**
     * Adds the specified command listener to this button.
     *
     * @param l Command listener to add.
     * @see #removeCommandListener(CommandAction)
     */
    public void addCommandListener(CommandAction l) {
        this.listenerList.add(CommandAction.class, l);
    }

    /**
     * Removes the specified command listener from this button.
     *
     * @param l Command listener to remove.
     * @see #addCommandListener(CommandAction)
     */
    public void removeCommandListener(CommandAction l) {
        this.listenerList.remove(CommandAction.class, l);
    }

    /**
     * Adds the specified change listener to this button.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from this button.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    @Override
    public void setEnabled(boolean b) {
        if (this.actionModel != null) {
            if (!b && this.actionModel.isRollover()) {
                this.actionModel.setRollover(false);
            }
        }
        super.setEnabled(b);
        if (this.actionModel != null) {
            this.actionModel.setEnabled(b);
        }
    }

    /**
     * Default action handler for this button.
     *
     * @author Kirill Grouchnikov
     */
    class ActionHandler implements ActionListener, ChangeListener {
        public void stateChanged(ChangeEvent e) {
            fireStateChanged();
            repaint();
        }

        public void actionPerformed(ActionEvent event) {
            fireActionPerformed(event);
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created.
     *
     * @see EventListenerList
     */
    protected void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent ce = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                // Lazily create the event:
                ((ChangeListener) listeners[i + 1]).stateChanged(ce);
            }
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
    protected void fireActionPerformed(ActionEvent event) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        CommandActionEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandAction.class) {
                // Lazily create the event:
                if (e == null) {
                    String actionCommand = event.getActionCommand();
                    e = new CommandActionEvent(this, ActionEvent.ACTION_PERFORMED, this.command,
                            actionCommand, event.getWhen(), event.getModifiers());
                }
                ((CommandAction) listeners[i + 1]).commandActivated(e);
            }
        }

        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ActionListener.class) {
                // Lazily create the event:
                if (e == null) {
                    String actionCommand = event.getActionCommand();
                    e = new CommandActionEvent(this, ActionEvent.ACTION_PERFORMED, this.command,
                            actionCommand, event.getWhen(), event.getModifiers());
                }
                ((ActionListener) listeners[i + 1]).actionPerformed(e);
            }
        }
    }

    /**
     * Sets new horizontal alignment for the content of this button. Fires a
     * <code>horizontalAlignment</code> property change event.
     *
     * @param alignment New horizontal alignment for the content of this button.
     * @see #getHorizontalAlignment()
     */
    public void setHorizontalAlignment(int alignment) {
        if (alignment == this.horizontalAlignment) {
            return;
        }
        int oldValue = this.horizontalAlignment;
        this.horizontalAlignment = alignment;
        firePropertyChange("horizontalAlignment", oldValue, this.horizontalAlignment);
        repaint();
    }

    /**
     * Returns the horizontal alignment for the content of this button.
     *
     * @return The horizontal alignment for the content of this button.
     * @see #setHorizontalAlignment(int)
     */
    public int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /**
     * Sets new horizontal gap scale factor for the content of this button.
     * Fires an <code>hgapScaleFactor</code> property change event.
     *
     * @param hgapScaleFactor New horizontal gap scale factor for the content of this
     *                        button.
     * @see #getHGapScaleFactor()
     * @see #setVGapScaleFactor(double)
     * @see #setGapScaleFactor(double)
     */
    public void setHGapScaleFactor(double hgapScaleFactor) {
        if (hgapScaleFactor == this.hgapScaleFactor)
            return;
        double oldValue = this.hgapScaleFactor;
        this.hgapScaleFactor = hgapScaleFactor;
        firePropertyChange("hgapScaleFactor", oldValue, this.hgapScaleFactor);
        if (this.hgapScaleFactor != oldValue) {
            revalidate();
            repaint();
        }
    }

    /**
     * Sets new vertical gap scale factor for the content of this button. Fires
     * a <code>vgapScaleFactor</code> property change event.
     *
     * @param vgapScaleFactor New vertical gap scale factor for the content of this button.
     * @see #getVGapScaleFactor()
     * @see #setHGapScaleFactor(double)
     * @see #setGapScaleFactor(double)
     */
    public void setVGapScaleFactor(double vgapScaleFactor) {
        if (vgapScaleFactor == this.vgapScaleFactor)
            return;
        double oldValue = this.vgapScaleFactor;
        this.vgapScaleFactor = vgapScaleFactor;
        firePropertyChange("vgapScaleFactor", oldValue, this.vgapScaleFactor);
        if (this.vgapScaleFactor != oldValue) {
            revalidate();
            repaint();
        }
    }

    /**
     * Sets new gap scale factor for the content of this button.
     *
     * @param gapScaleFactor New gap scale factor for the content of this button.
     * @see #getHGapScaleFactor()
     * @see #getVGapScaleFactor()
     */
    public void setGapScaleFactor(double gapScaleFactor) {
        setHGapScaleFactor(gapScaleFactor);
        setVGapScaleFactor(gapScaleFactor);
    }

    /**
     * Returns the horizontal gap scale factor for the content of this button.
     *
     * @return The horizontal gap scale factor for the content of this button.
     * @see #setHGapScaleFactor(double)
     * @see #setGapScaleFactor(double)
     * @see #getVGapScaleFactor()
     */
    public double getHGapScaleFactor() {
        return this.hgapScaleFactor;
    }

    /**
     * Returns the vertical gap scale factor for the content of this button.
     *
     * @return The vertical gap scale factor for the content of this button.
     * @see #setVGapScaleFactor(double)
     * @see #setGapScaleFactor(double)
     * @see #getHGapScaleFactor()
     */
    public double getVGapScaleFactor() {
        return this.vgapScaleFactor;
    }

    /**
     * Programmatically perform an action "click". This does the same thing as
     * if the user had pressed and released the action area of the button.
     */
    public void doActionClick() {
        Dimension size = getSize();
        ButtonModel actionModel = this.getActionModel();
        actionModel.setArmed(true);
        actionModel.setPressed(true);
        paintImmediately(new Rectangle(0, 0, size.width, size.height));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
        }
        actionModel.setPressed(false);
        actionModel.setArmed(false);
    }

    boolean hasRichTooltips() {
        return (this.actionRichTooltip != null);
    }

    /**
     * Sets the rich tooltip for the action area of this button.
     *
     * @param richTooltip Rich tooltip for the action area of this button.
     * @see #getRichTooltip(MouseEvent)
     */
    public void setActionRichTooltip(RichTooltip richTooltip) {
        this.actionRichTooltip = richTooltip;
    }

    @Override
    public RichTooltip getRichTooltip(MouseEvent mouseEvent) {
        return this.actionRichTooltip;
    }

    @Override
    public void setToolTipText(String text) {
        throw new UnsupportedOperationException("Use rich tooltip APIs");
    }

    /**
     * Returns the location order kind for buttons placed in command button
     * strips or for buttons that need the visuals of segmented strips.
     *
     * @return The location order kind for buttons placed in command button
     * strips or for buttons that need the visuals of segmented strips.
     * @see #setLocationOrderKind(CommandButtonLocationOrderKind)
     */
    public CommandButtonLocationOrderKind getLocationOrderKind() {
        return this.locationOrderKind;
    }

    /**
     * Sets the location order kind for buttons placed in command button strips
     * or for buttons that need the visuals of segmented strips. Fires a
     * <code>locationOrderKind</code> property change event.
     *
     * @param locationOrderKind The location order kind for buttons placed in command button
     *                          strips or for buttons that need the visuals of segmented
     *                          strips.
     * @see #getLocationOrderKind()
     */
    public void setLocationOrderKind(CommandButtonLocationOrderKind locationOrderKind) {
        CommandButtonLocationOrderKind old = this.locationOrderKind;
        if (old != locationOrderKind) {
            this.locationOrderKind = locationOrderKind;
            this.firePropertyChange("locationOrderKind", old, this.locationOrderKind);
        }
    }

    /**
     * Returns the key tip for the action area of this button.
     *
     * @return The key tip for the action area of this button.
     * @see #setActionKeyTip(String)
     */
    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    /**
     * Sets the key tip for the action area of this button. Fires an
     * <code>actionKeyTip</code> property change event.
     *
     * @param actionKeyTip The key tip for the action area of this button.
     * @see #getActionKeyTip()
     */
    public void setActionKeyTip(String actionKeyTip) {
        String old = this.actionKeyTip;
        this.actionKeyTip = actionKeyTip;
        this.firePropertyChange("actionKeyTip", old, this.actionKeyTip);
    }
}
