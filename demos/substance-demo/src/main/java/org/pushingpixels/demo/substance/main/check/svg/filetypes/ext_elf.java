package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_elf implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.6f, 91.9f);
generalPath.lineTo(11.6f, 71.9f);
generalPath.lineTo(26.5f, 71.9f);
generalPath.lineTo(26.5f, 75.3f);
generalPath.lineTo(15.6f, 75.3f);
generalPath.lineTo(15.6f, 79.700005f);
generalPath.lineTo(25.7f, 79.700005f);
generalPath.lineTo(25.7f, 83.100006f);
generalPath.lineTo(15.6f, 83.100006f);
generalPath.lineTo(15.6f, 88.600006f);
generalPath.lineTo(26.8f, 88.600006f);
generalPath.lineTo(26.8f, 92.0f);
generalPath.lineTo(11.6f, 92.0f);
generalPath.closePath();
generalPath.moveTo(30.4f, 91.9f);
generalPath.lineTo(30.4f, 72.0f);
generalPath.lineTo(34.4f, 72.0f);
generalPath.lineTo(34.4f, 88.5f);
generalPath.lineTo(44.5f, 88.5f);
generalPath.lineTo(44.5f, 91.9f);
generalPath.lineTo(30.4f, 91.9f);
generalPath.closePath();
generalPath.moveTo(47.4f, 91.9f);
generalPath.lineTo(47.4f, 71.9f);
generalPath.lineTo(61.100002f, 71.9f);
generalPath.lineTo(61.100002f, 75.3f);
generalPath.lineTo(51.4f, 75.3f);
generalPath.lineTo(51.4f, 80.0f);
generalPath.lineTo(59.800003f, 80.0f);
generalPath.lineTo(59.800003f, 83.4f);
generalPath.lineTo(51.4f, 83.4f);
generalPath.lineTo(51.4f, 91.9f);
generalPath.lineTo(47.4f, 91.9f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 31.3f);
generalPath.lineTo(23.2f, 31.3f);
generalPath.lineTo(23.2f, 34.899998f);
generalPath.lineTo(17.800001f, 34.899998f);
generalPath.lineTo(17.800001f, 36.0f);
generalPath.lineTo(15.0f, 36.0f);
generalPath.lineTo(15.0f, 37.0f);
generalPath.lineTo(17.8f, 37.0f);
generalPath.lineTo(17.8f, 38.3f);
generalPath.lineTo(23.199999f, 38.3f);
generalPath.lineTo(23.199999f, 44.6f);
generalPath.lineTo(17.8f, 44.6f);
generalPath.lineTo(17.8f, 45.899998f);
generalPath.lineTo(15.0f, 45.899998f);
generalPath.lineTo(15.0f, 46.899998f);
generalPath.lineTo(17.8f, 46.899998f);
generalPath.lineTo(17.8f, 48.0f);
generalPath.lineTo(23.199999f, 48.0f);
generalPath.lineTo(23.199999f, 54.7f);
generalPath.lineTo(17.8f, 54.7f);
generalPath.lineTo(17.8f, 55.9f);
generalPath.lineTo(15.0f, 55.9f);
generalPath.lineTo(15.0f, 56.9f);
generalPath.lineTo(17.8f, 56.9f);
generalPath.lineTo(17.8f, 58.100002f);
generalPath.lineTo(23.199999f, 58.100002f);
generalPath.lineTo(23.199999f, 63.0f);
generalPath.lineTo(49.3f, 63.0f);
generalPath.lineTo(49.3f, 58.1f);
generalPath.lineTo(54.2f, 58.1f);
generalPath.lineTo(54.2f, 56.899998f);
generalPath.lineTo(57.0f, 56.899998f);
generalPath.lineTo(57.0f, 55.899998f);
generalPath.lineTo(54.2f, 55.899998f);
generalPath.lineTo(54.2f, 54.699997f);
generalPath.lineTo(49.3f, 54.699997f);
generalPath.lineTo(49.3f, 48.0f);
generalPath.lineTo(54.2f, 48.0f);
generalPath.lineTo(54.2f, 46.9f);
generalPath.lineTo(57.0f, 46.9f);
generalPath.lineTo(57.0f, 45.9f);
generalPath.lineTo(54.2f, 45.9f);
generalPath.lineTo(54.2f, 44.600002f);
generalPath.lineTo(49.3f, 44.600002f);
generalPath.lineTo(49.3f, 38.300003f);
generalPath.lineTo(54.2f, 38.300003f);
generalPath.lineTo(54.2f, 37.0f);
generalPath.lineTo(57.0f, 37.0f);
generalPath.lineTo(57.0f, 36.0f);
generalPath.lineTo(54.2f, 36.0f);
generalPath.lineTo(54.2f, 34.9f);
generalPath.lineTo(49.3f, 34.9f);
generalPath.lineTo(49.3f, 31.300001f);
generalPath.closePath();
generalPath.moveTo(44.3f, 39.9f);
generalPath.curveTo(43.2f, 39.9f, 42.3f, 39.0f, 42.3f, 37.9f);
generalPath.curveTo(42.3f, 36.800003f, 43.2f, 35.9f, 44.3f, 35.9f);
generalPath.curveTo(45.399998f, 35.9f, 46.3f, 36.800003f, 46.3f, 37.9f);
generalPath.curveTo(46.3f, 39.0f, 45.399998f, 39.9f, 44.3f, 39.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 63.0), new Point2D.Double(36.0, 31.28700065612793), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_elf() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_elf base = new ext_elf();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_elf base = new ext_elf();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_elf::new;
    }
}

