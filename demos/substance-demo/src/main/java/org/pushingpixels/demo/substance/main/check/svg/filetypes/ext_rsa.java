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
public class ext_rsa implements ResizableIcon {
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
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(51.4f, 37.7f);
generalPath.lineTo(48.5f, 37.7f);
generalPath.lineTo(48.5f, 32.0f);
generalPath.curveTo(48.5f, 25.6f, 43.3f, 20.3f, 36.8f, 20.3f);
generalPath.curveTo(30.3f, 20.3f, 25.1f, 25.6f, 25.1f, 32.0f);
generalPath.lineTo(25.1f, 37.7f);
generalPath.lineTo(22.2f, 37.7f);
generalPath.curveTo(21.1f, 37.7f, 20.2f, 38.600002f, 20.2f, 39.7f);
generalPath.lineTo(20.2f, 59.5f);
generalPath.curveTo(20.2f, 60.6f, 21.1f, 61.5f, 22.2f, 61.5f);
generalPath.lineTo(51.300003f, 61.5f);
generalPath.curveTo(52.4f, 61.5f, 53.300003f, 60.6f, 53.300003f, 59.5f);
generalPath.lineTo(53.300003f, 39.8f);
generalPath.curveTo(53.4f, 38.6f, 52.500004f, 37.7f, 51.4f, 37.7f);
generalPath.closePath();
generalPath.moveTo(39.3f, 54.2f);
generalPath.curveTo(39.5f, 54.9f, 39.0f, 55.5f, 38.3f, 55.5f);
generalPath.lineTo(35.3f, 55.5f);
generalPath.curveTo(34.6f, 55.5f, 34.1f, 54.8f, 34.3f, 54.2f);
generalPath.lineTo(35.3f, 50.5f);
generalPath.curveTo(34.2f, 49.9f, 33.399998f, 48.8f, 33.399998f, 47.4f);
generalPath.curveTo(33.399998f, 45.4f, 34.999996f, 43.9f, 36.899998f, 43.9f);
generalPath.curveTo(38.8f, 43.9f, 40.399998f, 45.5f, 40.399998f, 47.4f);
generalPath.curveTo(40.399998f, 48.800003f, 39.6f, 50.0f, 38.499996f, 50.5f);
generalPath.lineTo(39.299995f, 54.2f);
generalPath.closePath();
generalPath.moveTo(42.6f, 37.7f);
generalPath.lineTo(31.0f, 37.7f);
generalPath.lineTo(31.0f, 32.0f);
generalPath.curveTo(31.0f, 28.8f, 33.6f, 26.2f, 36.8f, 26.2f);
generalPath.curveTo(40.0f, 26.2f, 42.6f, 28.800001f, 42.6f, 32.0f);
generalPath.lineTo(42.6f, 37.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
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
// _0_4
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
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.6f, 91.9f);
generalPath.lineTo(9.6f, 71.9f);
generalPath.lineTo(18.1f, 71.9f);
generalPath.curveTo(20.2f, 71.9f, 21.800001f, 72.1f, 22.8f, 72.4f);
generalPath.curveTo(23.799997f, 72.700005f, 24.5f, 73.4f, 25.099998f, 74.3f);
generalPath.curveTo(25.699999f, 75.200005f, 25.999998f, 76.3f, 25.999998f, 77.5f);
generalPath.curveTo(25.999998f, 79.0f, 25.599998f, 80.2f, 24.699999f, 81.2f);
generalPath.curveTo(23.8f, 82.2f, 22.499998f, 82.799995f, 20.699999f, 83.1f);
generalPath.curveTo(21.599998f, 83.6f, 22.3f, 84.2f, 22.9f, 84.799995f);
generalPath.curveTo(23.5f, 85.399994f, 24.199999f, 86.49999f, 25.199999f, 88.1f);
generalPath.lineTo(27.599998f, 92.0f);
generalPath.lineTo(22.8f, 92.0f);
generalPath.lineTo(19.9f, 87.6f);
generalPath.curveTo(18.9f, 86.0f, 18.1f, 85.1f, 17.8f, 84.7f);
generalPath.curveTo(17.499998f, 84.299995f, 17.0f, 84.0f, 16.599998f, 83.899994f);
generalPath.curveTo(16.199999f, 83.7f, 15.499998f, 83.7f, 14.599998f, 83.7f);
generalPath.lineTo(13.799998f, 83.7f);
generalPath.lineTo(13.799998f, 92.1f);
generalPath.lineTo(9.6f, 92.1f);
generalPath.closePath();
generalPath.moveTo(13.700001f, 80.3f);
generalPath.lineTo(16.7f, 80.3f);
generalPath.curveTo(18.6f, 80.3f, 19.900002f, 80.200005f, 20.300001f, 80.100006f);
generalPath.curveTo(20.800001f, 79.90001f, 21.2f, 79.700005f, 21.400002f, 79.3f);
generalPath.curveTo(21.600002f, 78.9f, 21.800001f, 78.4f, 21.800001f, 77.8f);
generalPath.curveTo(21.800001f, 77.100006f, 21.6f, 76.600006f, 21.300001f, 76.200005f);
generalPath.curveTo(20.900002f, 75.8f, 20.400002f, 75.50001f, 19.800001f, 75.4f);
generalPath.curveTo(19.500002f, 75.4f, 18.500002f, 75.3f, 16.800001f, 75.3f);
generalPath.lineTo(13.600001f, 75.3f);
generalPath.lineTo(13.600001f, 80.3f);
generalPath.closePath();
generalPath.moveTo(28.800001f, 85.4f);
generalPath.lineTo(32.7f, 85.0f);
generalPath.curveTo(32.9f, 86.3f, 33.4f, 87.3f, 34.100002f, 87.9f);
generalPath.curveTo(34.800003f, 88.5f, 35.800003f, 88.8f, 37.000004f, 88.8f);
generalPath.curveTo(38.300003f, 88.8f, 39.300003f, 88.5f, 39.900005f, 88.0f);
generalPath.curveTo(40.600006f, 87.4f, 40.900005f, 86.8f, 40.900005f, 86.1f);
generalPath.curveTo(40.900005f, 85.6f, 40.800007f, 85.2f, 40.500004f, 84.9f);
generalPath.curveTo(40.200005f, 84.6f, 39.700005f, 84.3f, 39.000004f, 84.0f);
generalPath.curveTo(38.500004f, 83.8f, 37.400005f, 83.5f, 35.800003f, 83.1f);
generalPath.curveTo(33.600002f, 82.6f, 32.100002f, 81.9f, 31.200003f, 81.1f);
generalPath.curveTo(30.000002f, 80.0f, 29.400003f, 78.7f, 29.400003f, 77.1f);
generalPath.curveTo(29.400003f, 76.1f, 29.700003f, 75.1f, 30.300003f, 74.2f);
generalPath.curveTo(30.900003f, 73.299995f, 31.700003f, 72.6f, 32.800003f, 72.2f);
generalPath.curveTo(33.9f, 71.7f, 35.200005f, 71.5f, 36.700005f, 71.5f);
generalPath.curveTo(39.200005f, 71.5f, 41.100006f, 72.1f, 42.400005f, 73.2f);
generalPath.curveTo(43.700005f, 74.299995f, 44.300007f, 75.799995f, 44.400005f, 77.6f);
generalPath.lineTo(40.400005f, 77.799995f);
generalPath.curveTo(40.200005f, 76.799995f, 39.900005f, 75.99999f, 39.300007f, 75.6f);
generalPath.curveTo(38.70001f, 75.1f, 37.900005f, 74.9f, 36.70001f, 74.9f);
generalPath.curveTo(35.500008f, 74.9f, 34.60001f, 75.1f, 33.90001f, 75.6f);
generalPath.curveTo(33.500008f, 75.9f, 33.30001f, 76.299995f, 33.30001f, 76.799995f);
generalPath.curveTo(33.30001f, 77.299995f, 33.50001f, 77.7f, 33.90001f, 77.99999f);
generalPath.curveTo(34.40001f, 78.399994f, 35.70001f, 78.899994f, 37.60001f, 79.299995f);
generalPath.curveTo(39.50001f, 79.7f, 41.00001f, 80.2f, 42.00001f, 80.7f);
generalPath.curveTo(43.00001f, 81.2f, 43.700012f, 81.899994f, 44.200012f, 82.7f);
generalPath.curveTo(44.700012f, 83.5f, 45.00001f, 84.6f, 45.00001f, 85.899994f);
generalPath.curveTo(45.00001f, 86.99999f, 44.700012f, 88.09999f, 44.00001f, 89.09999f);
generalPath.curveTo(43.400013f, 90.09999f, 42.50001f, 90.79999f, 41.30001f, 91.29999f);
generalPath.curveTo(40.10001f, 91.79999f, 38.700012f, 91.999985f, 36.90001f, 91.999985f);
generalPath.curveTo(34.40001f, 91.999985f, 32.40001f, 91.39999f, 31.10001f, 90.19998f);
generalPath.curveTo(29.90001f, 89.29998f, 29.10001f, 87.59998f, 28.80001f, 85.39998f);
generalPath.closePath();
generalPath.moveTo(66.6f, 91.9f);
generalPath.lineTo(62.199997f, 91.9f);
generalPath.lineTo(60.399998f, 87.3f);
generalPath.lineTo(52.399998f, 87.3f);
generalPath.lineTo(50.699997f, 91.9f);
generalPath.lineTo(46.399998f, 91.9f);
generalPath.lineTo(54.199997f, 71.9f);
generalPath.lineTo(58.499996f, 71.9f);
generalPath.lineTo(66.6f, 91.9f);
generalPath.closePath();
generalPath.moveTo(59.1f, 84.0f);
generalPath.lineTo(56.3f, 76.6f);
generalPath.lineTo(53.7f, 84.0f);
generalPath.lineTo(59.100002f, 84.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_rsa() {
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
       ext_rsa base = new ext_rsa();
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
       ext_rsa base = new ext_rsa();
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
        return ext_rsa::new;
    }
}

