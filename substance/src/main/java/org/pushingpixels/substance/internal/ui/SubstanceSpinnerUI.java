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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities.TextComponentAware;
import org.pushingpixels.substance.internal.utils.border.SubstanceTextComponentBorder;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicSpinnerUI;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * UI for spinners in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceSpinnerUI extends BasicSpinnerUI {
	/**
	 * Tracks changes to editor, removing the border as necessary.
	 */
	private PropertyChangeListener substancePropertyChangeListener;

	/**
	 * The next (increment) button.
	 */
	private SubstanceSpinnerButton nextButton;

	/**
	 * The previous (decrement) button.
	 */
	private SubstanceSpinnerButton prevButton;

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceSpinnerUI();
	}

	private SubstanceSpinnerUI() {
	}

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);

		c.putClientProperty(SubstanceCoreUtilities.TEXT_COMPONENT_AWARE,
				(TextComponentAware<JSpinner>) t -> {
					JComponent editor = t.getEditor();
					if (editor instanceof JSpinner.DefaultEditor) {
						return ((JSpinner.DefaultEditor) editor).getTextField();
					}
					return null;
				});
	}

	@Override
	public void uninstallUI(JComponent c) {
		c.putClientProperty(SubstanceCoreUtilities.TEXT_COMPONENT_AWARE, null);

		super.uninstallUI(c);
	}

	@Override
	protected Component createNextButton() {
		this.nextButton = new SubstanceSpinnerButton(this.spinner, SwingConstants.NORTH);
		this.nextButton.setFont(this.spinner.getFont());
		this.nextButton.setName("Spinner.nextButton");

		Icon icon = new TransitionAwareIcon(this.nextButton, scheme -> {
			int fontSize = SubstanceSizeUtils.getComponentFontSize(nextButton);
			return SubstanceImageCreator.getArrowIcon(
					SubstanceSizeUtils.getSpinnerArrowIconWidth(fontSize),
					SubstanceSizeUtils.getSpinnerArrowIconHeight(fontSize),
					SubstanceSizeUtils.getArrowStrokeWidth(fontSize), SwingConstants.NORTH, scheme);
		}, "substance.spinner.nextButton");
		this.nextButton.setIcon(icon);

		int spinnerButtonSize = SubstanceSizeUtils
				.getScrollBarWidth(SubstanceSizeUtils.getComponentFontSize(spinner));
		this.nextButton.setPreferredSize(new Dimension(spinnerButtonSize, spinnerButtonSize));
		this.nextButton.setMinimumSize(new Dimension(5, 5));

		this.installNextButtonListeners(this.nextButton);

		Color spinnerBg = this.spinner.getBackground();
		if (!(spinnerBg instanceof UIResource)) {
			this.nextButton.setBackground(spinnerBg);
		}

		return this.nextButton;
	}

	@Override
	protected Component createPreviousButton() {
		this.prevButton = new SubstanceSpinnerButton(this.spinner, SwingConstants.SOUTH);
		this.prevButton.setFont(this.spinner.getFont());
		this.prevButton.setName("Spinner.previousButton");

		Icon icon = new TransitionAwareIcon(this.prevButton, scheme -> {
			int fontSize = SubstanceSizeUtils.getComponentFontSize(prevButton);
			float spinnerArrowIconHeight = SubstanceSizeUtils.getSpinnerArrowIconHeight(fontSize);
			return SubstanceImageCreator.getArrowIcon(
					SubstanceSizeUtils.getSpinnerArrowIconWidth(fontSize), spinnerArrowIconHeight,
					SubstanceSizeUtils.getArrowStrokeWidth(fontSize), SwingConstants.SOUTH, scheme);
		}, "substance.spinner.prevButton");
		this.prevButton.setIcon(icon);

		int spinnerButtonSize = SubstanceSizeUtils
				.getScrollBarWidth(SubstanceSizeUtils.getComponentFontSize(this.prevButton));
		this.prevButton.setPreferredSize(new Dimension(spinnerButtonSize, spinnerButtonSize));
		this.prevButton.setMinimumSize(new Dimension(5, 5));

		this.installPreviousButtonListeners(this.prevButton);

		Color spinnerBg = this.spinner.getBackground();
		if (!(spinnerBg instanceof UIResource)) {
			this.nextButton.setBackground(spinnerBg);
		}

		return this.prevButton;
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();
		JComponent editor = this.spinner.getEditor();
		if ((editor instanceof JSpinner.DefaultEditor)) {
			JTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
			if (tf != null) {
				int fontSize = SubstanceSizeUtils.getComponentFontSize(this.spinner);
				Insets ins = SubstanceSizeUtils.getSpinnerTextBorderInsets(fontSize);
				tf.setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom, ins.right));
				tf.setFont(spinner.getFont());
				tf.setOpaque(false);
			}
		}
		if (editor != null) {
			editor.setOpaque(false);
		}

		Border b = this.spinner.getBorder();
		if (b == null || b instanceof UIResource) {
			SubstanceTextComponentBorder border = new SubstanceTextComponentBorder(
					SubstanceSizeUtils.getSpinnerBorderInsets(
							SubstanceSizeUtils.getComponentFontSize(this.spinner)));
			this.spinner.setBorder(border);
		}
	}

	@Override
	protected void installListeners() {
		super.installListeners();
		this.substancePropertyChangeListener = propertyChangeEvent -> {
			if ("editor".equals(propertyChangeEvent.getPropertyName())) {
				SwingUtilities.invokeLater(() -> {
					if (spinner == null)
						return;
					JComponent editor = spinner.getEditor();
					if ((editor instanceof JSpinner.DefaultEditor)) {
						JTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
						if (tf != null) {
							Insets ins = SubstanceSizeUtils.getSpinnerTextBorderInsets(
									SubstanceSizeUtils.getComponentFontSize(spinner));
							tf.setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom, ins.right));
							tf.revalidate();
						}
					}
				});
			}

			if ("font".equals(propertyChangeEvent.getPropertyName())) {
				SwingUtilities.invokeLater(() -> {
					if (spinner != null) {
						spinner.updateUI();
					}
				});
			}

			if ("background".equals(propertyChangeEvent.getPropertyName())) {
				JComponent editor = spinner.getEditor();
				if ((editor instanceof JSpinner.DefaultEditor)) {
					JTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
					if (tf != null) {
						// Use SubstanceColorResource to distingish between
						// color set by application and color set
						// (propagated)
						// by Substance. In the second case we can replace
						// that color (even though it's not a UIResource).
						Color tfBackground = tf.getBackground();
						boolean canReplace = SubstanceCoreUtilities
								.canReplaceChildBackgroundColor(tfBackground);
						// fix for issue 387 - if spinner background
						// is null, do nothing
						if (spinner.getBackground() == null)
							canReplace = false;
						if (canReplace) {
							tf.setBackground(new SubstanceColorResource(spinner.getBackground()));
						}
					}
				}
				nextButton.setBackground(spinner.getBackground());
				prevButton.setBackground(spinner.getBackground());
			}
		};
		this.spinner.addPropertyChangeListener(this.substancePropertyChangeListener);
	}

	@Override
	protected void uninstallListeners() {
		this.spinner.removePropertyChangeListener(this.substancePropertyChangeListener);
		this.substancePropertyChangeListener = null;

		super.uninstallListeners();
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		super.paint(g, c);
		SubstanceTextUtilities.paintTextCompBackground(g, c);
	}

	@Override
	public Dimension getPreferredSize(JComponent c) {
		Dimension nextD = this.nextButton.getPreferredSize();
		Dimension previousD = this.prevButton.getPreferredSize();
		Dimension editorD = spinner.getEditor().getPreferredSize();

		Dimension size = new Dimension(editorD.width, editorD.height);
		size.width += Math.max(nextD.width, previousD.width);
		Insets insets = this.spinner.getInsets();
		size.width += insets.left + insets.right;
		size.height += insets.top + insets.bottom;
		return size;
	}

	@Override
	protected LayoutManager createLayout() {
		return new SpinnerLayoutManager();
	}

	/**
	 * Layout manager for the spinner.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class SpinnerLayoutManager implements LayoutManager {
		public void addLayoutComponent(String name, Component comp) {
		}

		public void removeLayoutComponent(Component comp) {
		}

		public Dimension minimumLayoutSize(Container parent) {
			return this.preferredLayoutSize(parent);
		}

		public Dimension preferredLayoutSize(Container parent) {
			Dimension nextD = nextButton.getPreferredSize();
			Dimension previousD = prevButton.getPreferredSize();
			Dimension editorD = spinner.getEditor().getPreferredSize();

			/*
			 * Force the editors height to be a multiple of 2
			 */
			editorD.height = ((editorD.height + 1) / 2) * 2;

			Dimension size = new Dimension(editorD.width, editorD.height);
			size.width += Math.max(nextD.width, previousD.width);
			Insets insets = parent.getInsets();
			size.width += insets.left + insets.right;
			size.height += insets.top + insets.bottom;

			Insets buttonInsets = SubstanceSizeUtils.getSpinnerArrowButtonInsets();
			size.width += (buttonInsets.left + buttonInsets.right);

			return size;
		}

		public void layoutContainer(Container parent) {
			int width = parent.getWidth();
			int height = parent.getHeight();

			Insets insets = parent.getInsets();
			Dimension nextD = nextButton.getPreferredSize();
			Dimension previousD = prevButton.getPreferredSize();
			int buttonsWidth = Math.max(nextD.width, previousD.width);
			int editorHeight = height - (insets.top + insets.bottom);

			Insets buttonInsets = SubstanceSizeUtils.getSpinnerArrowButtonInsets();

			/*
			 * Deal with the spinner's componentOrientation property.
			 */
			int editorX, editorWidth, buttonsX;
			if (parent.getComponentOrientation().isLeftToRight()) {
				editorX = insets.left;
				editorWidth = width - insets.left - buttonsWidth;
				buttonsX = width - buttonsWidth;// - buttonInsets.right;
			} else {
				buttonsX = 0;// buttonInsets.left;
				editorX = buttonsX + buttonsWidth;
				editorWidth = width - editorX - insets.right;
			}

			int nextY = 0;// buttonInsets.top;
			int nextHeight = (height / 2) + (height % 2) - nextY;
			int previousY = 0 * buttonInsets.top + nextHeight;
			int previousHeight = height - previousY;// - buttonInsets.bottom;

			spinner.getEditor().setBounds(editorX, insets.top, editorWidth, editorHeight);
			nextButton.setBounds(buttonsX, nextY, buttonsWidth, nextHeight);
			prevButton.setBounds(buttonsX, previousY, buttonsWidth, previousHeight);
			// System.out.println("next : " + nextButton.getBounds());
			// System.out.println("prev : " + prevButton.getBounds());
		}
	}
}
