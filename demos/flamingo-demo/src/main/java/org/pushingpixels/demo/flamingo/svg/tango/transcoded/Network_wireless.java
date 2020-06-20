package org.pushingpixels.demo.flamingo.svg.tango.transcoded;

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
public class Network_wireless implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.4064171f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.769554f, 44.565483f);
generalPath.curveTo(36.780075f, 45.361816f, 35.53091f, 46.099186f, 33.495064f, 46.498383f);
generalPath.curveTo(31.459217f, 46.89758f, 28.947906f, 46.89758f, 26.91206f, 46.498383f);
generalPath.curveTo(24.876213f, 46.099186f, 23.627047f, 45.361816f, 23.63757f, 44.565483f);
generalPath.curveTo(23.627047f, 43.76915f, 24.876213f, 43.03178f, 26.91206f, 42.632584f);
generalPath.curveTo(28.947906f, 42.233387f, 31.459217f, 42.233387f, 33.495064f, 42.632584f);
generalPath.curveTo(35.53091f, 43.03178f, 36.780075f, 43.76915f, 36.769554f, 44.565483f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, new Point2D.Double(30.203561782836914, 44.56548309326172), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
paint = new RadialGradientPaint(new Point2D.Double(24.445690155029297, 35.878170013427734), 20.530962f, new Point2D.Double(24.445690155029297, 35.878170013427734), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(220, 220, 220, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9950579404830933f, -1.6515269512350966E-32f, 0.0f, 1.9950579404830933f, -24.324880599975586f, -35.700870513916016f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(155, 155, 155, 255);
stroke = new BasicStroke(1.0f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.224903f, 38.95567f);
generalPath.lineTo(24.819939f, 24.359674f);
generalPath.lineTo(30.135763f, 38.95567f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6892200112342834f, 0.0f, 0.0f, 0.6892200112342834f, 5.768155097961426f, 11.069000244140625f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.910667f, 18.60456f);
generalPath.curveTo(30.91601f, 19.799059f, 30.281818f, 20.905113f, 29.248234f, 21.503908f);
generalPath.curveTo(28.21465f, 22.102705f, 26.939678f, 22.102705f, 25.906094f, 21.503908f);
generalPath.curveTo(24.872509f, 20.905113f, 24.238317f, 19.799059f, 24.24366f, 18.60456f);
generalPath.curveTo(24.238317f, 17.410063f, 24.872509f, 16.304008f, 25.906094f, 15.705213f);
generalPath.curveTo(26.939678f, 15.106417f, 28.21465f, 15.106417f, 29.248234f, 15.705213f);
generalPath.curveTo(30.281818f, 16.304008f, 30.91601f, 17.410063f, 30.910667f, 18.60456f);
generalPath.closePath();
shape = generalPath;
paint = new Color(239, 41, 41, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(2.38230299949646f, 0.0f, 0.0f, 2.38230299949646f, -40.92229080200195f, -20.430070877075195f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(27.577173233032227, 16.04913330078125), 3.8335035f, new Point2D.Double(27.577173233032227, 16.04913330078125), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 41, 41, 255),new Color(239, 41, 41, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.243453025817871f, 2.1067840215472386E-16f, -2.1067840215472386E-16f, 1.243453025817871f, -6.713754177093506f, -3.742846965789795f));
stroke = new BasicStroke(1.1812764f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.910667f, 18.60456f);
generalPath.curveTo(30.91601f, 19.799059f, 30.281818f, 20.905113f, 29.248234f, 21.503908f);
generalPath.curveTo(28.21465f, 22.102705f, 26.939678f, 22.102705f, 25.906094f, 21.503908f);
generalPath.curveTo(24.872509f, 20.905113f, 24.238317f, 19.799059f, 24.24366f, 18.60456f);
generalPath.curveTo(24.238317f, 17.410063f, 24.872509f, 16.304008f, 25.906094f, 15.705213f);
generalPath.curveTo(26.939678f, 15.106417f, 28.21465f, 15.106417f, 29.248234f, 15.705213f);
generalPath.curveTo(30.281818f, 16.304008f, 30.91601f, 17.410063f, 30.910667f, 18.60456f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(4.6576080322265625f, 0.0f, 0.0f, 4.6576080322265625f, -103.66899871826172f, -62.761131286621094f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(27.577173233032227, 15.048257827758789), 3.8335035f, new Point2D.Double(27.577173233032227, 15.048257827758789), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 41, 41, 255),new Color(239, 41, 41, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.243453025817871f, 2.1067840215472386E-16f, -2.1067840215472386E-16f, 1.243453025817871f, -6.713754177093506f, -3.742846965789795f));
stroke = new BasicStroke(0.60420674f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.910667f, 18.60456f);
generalPath.curveTo(30.91601f, 19.799059f, 30.281818f, 20.905113f, 29.248234f, 21.503908f);
generalPath.curveTo(28.21465f, 22.102705f, 26.939678f, 22.102705f, 25.906094f, 21.503908f);
generalPath.curveTo(24.872509f, 20.905113f, 24.238317f, 19.799059f, 24.24366f, 18.60456f);
generalPath.curveTo(24.238317f, 17.410063f, 24.872509f, 16.304008f, 25.906094f, 15.705213f);
generalPath.curveTo(26.939678f, 15.106417f, 28.21465f, 15.106417f, 29.248234f, 15.705213f);
generalPath.curveTo(30.281818f, 16.304008f, 30.91601f, 17.410063f, 30.910667f, 18.60456f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.1764706f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.5677410364151f, 0.0f, 0.0f, 1.5677410364151f, -22.256559371948242f, -31.995590209960938f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.769554f, 44.565483f);
generalPath.curveTo(36.780075f, 45.361816f, 35.53091f, 46.099186f, 33.495064f, 46.498383f);
generalPath.curveTo(31.459217f, 46.89758f, 28.947906f, 46.89758f, 26.91206f, 46.498383f);
generalPath.curveTo(24.876213f, 46.099186f, 23.627047f, 45.361816f, 23.63757f, 44.565483f);
generalPath.curveTo(23.627047f, 43.76915f, 24.876213f, 43.03178f, 26.91206f, 42.632584f);
generalPath.curveTo(28.947906f, 42.233387f, 31.459217f, 42.233387f, 33.495064f, 42.632584f);
generalPath.curveTo(35.53091f, 43.03178f, 36.780075f, 43.76915f, 36.769554f, 44.565483f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, new Point2D.Double(30.203561782836914, 44.56548309326172), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, 2.2203589742633353E-14f, 29.481779098510742f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,0,2,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.812107f, 28.571856f);
generalPath.lineTo(26.719572f, 29.426992f);
generalPath.lineTo(22.44389f, 32.334457f);
generalPath.lineTo(28.258818f, 33.873703f);
generalPath.lineTo(21.07567f, 36.781166f);
generalPath.lineTo(29.627037f, 37.636303f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999976f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.597388744354248, 4.70600700378418, 37.69658660888672, 37.69658660888672, 8.485278129577637, 8.485278129577637);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
        return 3.9147281646728516;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.0233452320098877;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 41.061927795410156;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.38325500488281;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Network_wireless() {
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
       Network_wireless base = new Network_wireless();
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
       Network_wireless base = new Network_wireless();
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
        return Network_wireless::new;
    }
}

