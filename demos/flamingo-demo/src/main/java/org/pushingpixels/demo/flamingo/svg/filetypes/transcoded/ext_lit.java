package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_lit implements ResizableIcon {
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, 644.1119995117188), new Point2D.Double(486.30999755859375, 742.0850219726562), new float[] {0.0f,0.005f,1.0f}, new Color[] {new Color(116, 45, 45, 255),new Color(130, 113, 0, 255),new Color(255, 238, 145, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
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
generalPath.moveTo(21.4f, 91.6f);
generalPath.lineTo(21.4f, 76.1f);
generalPath.lineTo(24.6f, 76.1f);
generalPath.lineTo(24.6f, 89.0f);
generalPath.lineTo(32.5f, 89.0f);
generalPath.lineTo(32.5f, 91.6f);
generalPath.lineTo(21.4f, 91.6f);
generalPath.closePath();
generalPath.moveTo(34.7f, 91.6f);
generalPath.lineTo(34.7f, 76.0f);
generalPath.lineTo(37.9f, 76.0f);
generalPath.lineTo(37.9f, 91.6f);
generalPath.lineTo(34.7f, 91.6f);
generalPath.closePath();
generalPath.moveTo(44.5f, 91.6f);
generalPath.lineTo(44.5f, 78.6f);
generalPath.lineTo(39.8f, 78.6f);
generalPath.lineTo(39.8f, 76.0f);
generalPath.lineTo(52.4f, 76.0f);
generalPath.lineTo(52.4f, 78.6f);
generalPath.lineTo(47.7f, 78.6f);
generalPath.lineTo(47.7f, 91.5f);
generalPath.lineTo(44.5f, 91.5f);
generalPath.closePath();
shape = generalPath;
paint = new Color(254, 254, 254, 255);
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
generalPath.moveTo(62.7f, 34.5f);
generalPath.curveTo(62.4f, 33.8f, 62.0f, 33.3f, 61.4f, 32.8f);
generalPath.curveTo(61.300003f, 33.3f, 61.100002f, 33.899998f, 60.800003f, 34.399998f);
generalPath.lineTo(44.4f, 59.6f);
generalPath.curveTo(43.800003f, 60.5f, 42.4f, 60.8f, 41.4f, 60.5f);
generalPath.lineTo(15.300001f, 53.2f);
generalPath.curveTo(13.700001f, 52.8f, 11.900002f, 51.9f, 11.800001f, 50.100002f);
generalPath.curveTo(11.700001f, 49.4f, 11.800001f, 49.2f, 12.200001f, 48.9f);
generalPath.curveTo(12.6f, 48.600002f, 13.000001f, 48.7f, 13.400001f, 48.800003f);
generalPath.lineTo(38.0f, 55.6f);
generalPath.curveTo(41.6f, 56.6f, 42.6f, 55.899998f, 45.2f, 51.899998f);
generalPath.lineTo(60.2f, 28.799997f);
generalPath.curveTo(61.0f, 27.599997f, 61.2f, 26.199997f, 60.7f, 24.999998f);
generalPath.curveTo(60.3f, 23.799997f, 59.3f, 22.899998f, 57.9f, 22.499998f);
generalPath.lineTo(36.4f, 16.499998f);
generalPath.curveTo(35.9f, 16.399998f, 35.4f, 16.399998f, 34.9f, 16.299997f);
generalPath.lineTo(35.0f, 16.199997f);
generalPath.curveTo(31.7f, 14.199997f, 30.4f, 17.999996f, 28.7f, 19.399998f);
generalPath.curveTo(28.1f, 19.899998f, 27.2f, 20.299997f, 27.0f, 20.799997f);
generalPath.curveTo(26.8f, 21.299997f, 26.9f, 21.799997f, 26.7f, 22.299997f);
generalPath.curveTo(26.1f, 23.699997f, 24.2f, 26.099997f, 23.300001f, 26.799997f);
generalPath.curveTo(22.7f, 27.199997f, 22.000002f, 27.299997f, 21.6f, 27.899998f);
generalPath.curveTo(21.300001f, 28.299997f, 21.4f, 28.999998f, 21.2f, 29.599998f);
generalPath.curveTo(20.7f, 30.899998f, 19.0f, 33.1f, 17.800001f, 34.199997f);
generalPath.curveTo(17.400002f, 34.6f, 16.7f, 34.899998f, 16.400002f, 35.399998f);
generalPath.curveTo(16.100002f, 35.8f, 16.2f, 36.499996f, 15.900002f, 36.999996f);
generalPath.curveTo(15.200002f, 38.399998f, 13.600001f, 40.399998f, 12.300001f, 41.499996f);
generalPath.curveTo(11.600001f, 42.099995f, 10.900002f, 42.399998f, 10.600001f, 43.099995f);
generalPath.curveTo(10.400002f, 43.399994f, 10.600001f, 43.899994f, 10.400002f, 44.299995f);
generalPath.curveTo(10.100001f, 44.999996f, 9.800001f, 45.499996f, 9.600001f, 45.999996f);
generalPath.curveTo(8.900002f, 46.999996f, 8.500001f, 48.199997f, 8.600001f, 49.599995f);
generalPath.curveTo(8.800001f, 52.799995f, 11.300001f, 55.899994f, 14.100001f, 56.699993f);
generalPath.lineTo(40.3f, 64.0f);
generalPath.curveTo(42.7f, 64.7f, 45.8f, 63.5f, 47.1f, 61.4f);
generalPath.lineTo(62.1f, 38.300003f);
generalPath.curveTo(62.899998f, 37.000004f, 63.1f, 35.700005f, 62.699997f, 34.500004f);
generalPath.closePath();
generalPath.moveTo(32.5f, 26.2f);
generalPath.lineTo(33.6f, 24.6f);
generalPath.curveTo(33.899998f, 24.1f, 34.6f, 23.9f, 35.0f, 24.0f);
generalPath.lineTo(52.2f, 28.8f);
generalPath.curveTo(52.7f, 28.9f, 52.9f, 29.4f, 52.600002f, 29.9f);
generalPath.lineTo(51.500004f, 31.5f);
generalPath.curveTo(51.200005f, 32.0f, 50.500004f, 32.2f, 50.100002f, 32.1f);
generalPath.lineTo(32.9f, 27.3f);
generalPath.curveTo(32.4f, 27.099998f, 32.2f, 26.599998f, 32.5f, 26.199999f);
generalPath.closePath();
generalPath.moveTo(28.1f, 32.600002f);
generalPath.lineTo(29.2f, 31.000002f);
generalPath.curveTo(29.5f, 30.500002f, 30.2f, 30.300001f, 30.6f, 30.400002f);
generalPath.lineTo(47.800003f, 35.2f);
generalPath.curveTo(48.300003f, 35.3f, 48.500004f, 35.8f, 48.200005f, 36.3f);
generalPath.lineTo(47.100006f, 37.899998f);
generalPath.curveTo(46.800007f, 38.399998f, 46.100006f, 38.6f, 45.700005f, 38.499996f);
generalPath.lineTo(28.500004f, 33.699997f);
generalPath.curveTo(28.000004f, 33.6f, 27.800003f, 33.1f, 28.100004f, 32.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(305.1709899902344, 859.4439697265625), new Point2D.Double(305.1709899902344, 814.6840209960938), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9622655009227857f, 0.27211230353260446f, 0.27211230353260446f, -0.9622655009227857f, -485.17203323389003f, 762.9451758873668f));
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 234, 134, 255),new Color(134, 114, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.13099998235702515;
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
		return 0.7437919974327087;
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
	private ext_lit() {
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
       ext_lit base = new ext_lit();
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
       ext_lit base = new ext_lit();
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
        return ext_lit::new;
    }
}

