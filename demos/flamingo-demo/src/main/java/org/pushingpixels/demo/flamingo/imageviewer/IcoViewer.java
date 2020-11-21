package org.pushingpixels.demo.flamingo.imageviewer;

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbFileSelector;
import org.pushingpixels.flamingo.api.common.AbstractFileViewPanel;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.IcoWrapperResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class IcoViewer extends JFrame {
    private BreadcrumbFileSelector bar;

    private AbstractFileViewPanel<File> fileViewPanel;

    private JSlider iconSizeSlider;

    private int currIconSize;

    private IcoViewer() {
        super("ICO Viewer");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.bar = new BreadcrumbFileSelector();

        this.bar.getModel()
                .addPathListener(
                        event -> SwingUtilities.invokeLater(() -> {
                            final List<BreadcrumbItem<File>> newPath = event.getSource().getItems();
                            System.out.println("New path is ");
                            for (BreadcrumbItem<File> item : newPath) {
                                // String[] values = item.getValue();
                                System.out.println("\t" + item.getData().getAbsolutePath());
                            }

                            if (newPath.size() > 0) {
                                SwingWorker<List<StringValuePair<File>>, Void> worker = new
                                        SwingWorker<>() {
                                            @Override
                                            protected List<StringValuePair<File>> doInBackground() {
                                                return bar.getCallback().getLeafs(newPath);
                                            }

                                            @Override
                                            protected void done() {
                                                try {
                                                    fileViewPanel.setFolder(get());
                                                } catch (Exception exc) {
                                                }
                                            }
                                        };
                                worker.execute();
                            }
                        }));

        this.setLayout(new BorderLayout());
        this.add(bar, BorderLayout.NORTH);

        int initialSize = 32;
        this.fileViewPanel = new AbstractFileViewPanel<>(32) {
            @Override
            protected InputStream getLeafContent(File leaf) {
                try {
                    return new FileInputStream(leaf);
                } catch (Exception exc) {
                    exc.printStackTrace();
                    return null;
                }
            }

            @Override
            protected ResizableIcon getResizableIcon(AbstractFileViewPanel.Leaf leaf,
                    InputStream stream, CommandButtonPresentationState state, Dimension dimension) {
                int prefSize = state.getPreferredIconSize();
                if (prefSize > 0) {
                    dimension = new Dimension(prefSize, prefSize);
                }
                return IcoWrapperResizableIcon.getIcon(stream, dimension);
            }

            @Override
            protected boolean toShowFile(StringValuePair<File> pair) {
                String name = pair.getKey().toLowerCase();
                return name.endsWith(".ico");

            }
        };

        JScrollPane jsp = new JScrollPane(this.fileViewPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(jsp, BorderLayout.CENTER);

        this.iconSizeSlider = new JSlider();
        this.iconSizeSlider.setMinimum(16);
        this.iconSizeSlider.setMaximum(256);
        this.iconSizeSlider.setSnapToTicks(true);
        this.iconSizeSlider.setPaintLabels(true);
        this.iconSizeSlider.setPaintTicks(true);
        this.iconSizeSlider.setMajorTickSpacing(64);
        this.iconSizeSlider.setMinorTickSpacing(16);
        this.iconSizeSlider.setValue(initialSize);
        this.currIconSize = initialSize;
        this.iconSizeSlider.addChangeListener(changeEvent -> {
            if (!iconSizeSlider.getModel().getValueIsAdjusting()) {
                int newValue = iconSizeSlider.getValue();
                if (newValue != currIconSize) {
                    currIconSize = newValue;
                    SwingUtilities.invokeLater(() -> {
                        fileViewPanel.getProjection().getPresentationModel()
                                .setCommandIconDimension(currIconSize);
                        invalidate();
                        doLayout();
                    });
                }
            }
        });
        this.add(this.iconSizeSlider, BorderLayout.SOUTH);
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            IcoViewer test = new IcoViewer();
            test.setSize(800, 650);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
