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
public class ext_mpp implements ResizableIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.029f,0.462f,0.998f}, new Color[] {new Color(35, 84, 39, 255),new Color(78, 176, 86, 255),new Color(100, 214, 109, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(0.32499998807907104, 49.99700164794922), new Point2D.Double(72.07499694824219, 49.99700164794922), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(7, 114, 101, 0),new Color(0, 106, 105, 0),new Color(0, 56, 54, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(8.2f, 91.1f);
generalPath.lineTo(8.2f, 71.2f);
generalPath.lineTo(14.2f, 71.2f);
generalPath.lineTo(17.8f, 84.7f);
generalPath.lineTo(21.4f, 71.2f);
generalPath.lineTo(27.4f, 71.2f);
generalPath.lineTo(27.4f, 91.0f);
generalPath.lineTo(23.699999f, 91.0f);
generalPath.lineTo(23.699999f, 75.4f);
generalPath.lineTo(19.699999f, 91.0f);
generalPath.lineTo(15.799999f, 91.0f);
generalPath.lineTo(11.799999f, 75.4f);
generalPath.lineTo(11.799999f, 91.0f);
generalPath.lineTo(8.2f, 91.0f);
generalPath.closePath();
generalPath.moveTo(31.5f, 91.1f);
generalPath.lineTo(31.5f, 71.2f);
generalPath.lineTo(38.0f, 71.2f);
generalPath.curveTo(40.5f, 71.2f, 42.1f, 71.299995f, 42.8f, 71.5f);
generalPath.curveTo(43.899998f, 71.8f, 44.899998f, 72.4f, 45.7f, 73.4f);
generalPath.curveTo(46.5f, 74.4f, 46.9f, 75.700005f, 46.9f, 77.3f);
generalPath.curveTo(46.9f, 78.5f, 46.7f, 79.5f, 46.2f, 80.4f);
generalPath.curveTo(45.7f, 81.3f, 45.2f, 81.9f, 44.5f, 82.4f);
generalPath.curveTo(43.8f, 82.9f, 43.1f, 83.200005f, 42.4f, 83.3f);
generalPath.curveTo(41.4f, 83.5f, 40.0f, 83.600006f, 38.2f, 83.600006f);
generalPath.lineTo(35.600002f, 83.600006f);
generalPath.lineTo(35.600002f, 91.100006f);
generalPath.lineTo(31.500002f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(35.5f, 74.6f);
generalPath.lineTo(35.5f, 80.2f);
generalPath.lineTo(37.7f, 80.2f);
generalPath.curveTo(39.3f, 80.2f, 40.4f, 80.1f, 40.9f, 79.899994f);
generalPath.curveTo(41.4f, 79.7f, 41.9f, 79.399994f, 42.2f, 78.899994f);
generalPath.curveTo(42.5f, 78.49999f, 42.7f, 77.899994f, 42.7f, 77.399994f);
generalPath.curveTo(42.7f, 76.7f, 42.5f, 76.09999f, 42.100002f, 75.59999f);
generalPath.curveTo(41.7f, 75.09999f, 41.100002f, 74.79999f, 40.500004f, 74.69999f);
generalPath.curveTo(40.000004f, 74.59999f, 39.100002f, 74.59999f, 37.600002f, 74.59999f);
generalPath.lineTo(35.500004f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(50.1f, 91.1f);
generalPath.lineTo(50.1f, 71.2f);
generalPath.lineTo(56.6f, 71.2f);
generalPath.curveTo(59.1f, 71.2f, 60.699997f, 71.299995f, 61.399998f, 71.5f);
generalPath.curveTo(62.499996f, 71.8f, 63.499996f, 72.4f, 64.299995f, 73.4f);
generalPath.curveTo(65.1f, 74.4f, 65.49999f, 75.700005f, 65.49999f, 77.3f);
generalPath.curveTo(65.49999f, 78.5f, 65.299995f, 79.5f, 64.799995f, 80.4f);
generalPath.curveTo(64.399994f, 81.200005f, 63.799995f, 81.9f, 63.099995f, 82.4f);
generalPath.curveTo(62.399994f, 82.9f, 61.699993f, 83.200005f, 60.999996f, 83.3f);
generalPath.curveTo(59.999996f, 83.5f, 58.599995f, 83.600006f, 56.799995f, 83.600006f);
generalPath.lineTo(54.199997f, 83.600006f);
generalPath.lineTo(54.199997f, 91.100006f);
generalPath.lineTo(50.1f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(54.1f, 74.6f);
generalPath.lineTo(54.1f, 80.2f);
generalPath.lineTo(56.3f, 80.2f);
generalPath.curveTo(57.899998f, 80.2f, 59.0f, 80.1f, 59.5f, 79.899994f);
generalPath.curveTo(60.0f, 79.7f, 60.5f, 79.399994f, 60.8f, 78.899994f);
generalPath.curveTo(61.1f, 78.49999f, 61.3f, 77.899994f, 61.3f, 77.399994f);
generalPath.curveTo(61.3f, 76.7f, 61.1f, 76.09999f, 60.7f, 75.59999f);
generalPath.curveTo(60.3f, 75.09999f, 59.7f, 74.79999f, 59.100002f, 74.69999f);
generalPath.curveTo(58.600002f, 74.59999f, 57.7f, 74.59999f, 56.2f, 74.59999f);
generalPath.lineTo(54.100002f, 74.59999f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(15.1f, 24.0f);
generalPath.lineTo(40.6f, 19.2f);
generalPath.lineTo(40.6f, 62.0f);
generalPath.lineTo(15.099998f, 57.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(27.84600067138672, 19.200000762939453), new Point2D.Double(27.84600067138672, 62.0), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(58.4f, 57.8f);
generalPath.lineTo(36.8f, 57.8f);
generalPath.curveTo(35.7f, 57.8f, 34.899998f, 56.899998f, 34.899998f, 55.899998f);
generalPath.lineTo(34.899998f, 25.4f);
generalPath.curveTo(34.899998f, 24.3f, 35.8f, 23.5f, 36.8f, 23.5f);
generalPath.lineTo(58.5f, 23.5f);
generalPath.curveTo(59.6f, 23.5f, 60.4f, 24.4f, 60.4f, 25.4f);
generalPath.lineTo(60.4f, 56.0f);
generalPath.curveTo(60.300003f, 57.0f, 59.5f, 57.8f, 58.4f, 57.8f);
generalPath.closePath();
generalPath.moveTo(36.8f, 25.2f);
generalPath.curveTo(36.7f, 25.2f, 36.6f, 25.300001f, 36.6f, 25.400002f);
generalPath.lineTo(36.6f, 56.0f);
generalPath.curveTo(36.6f, 56.1f, 36.699997f, 56.2f, 36.8f, 56.2f);
generalPath.lineTo(58.5f, 56.2f);
generalPath.curveTo(58.6f, 56.2f, 58.7f, 56.100002f, 58.7f, 56.0f);
generalPath.lineTo(58.7f, 25.4f);
generalPath.curveTo(58.7f, 25.3f, 58.600002f, 25.199999f, 58.5f, 25.199999f);
generalPath.lineTo(36.8f, 25.199999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.577999114990234, 23.542999267578125), new Point2D.Double(47.577999114990234, 57.84600067138672), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(55.3f, 42.2f);
generalPath.lineTo(52.399998f, 42.2f);
generalPath.lineTo(52.399998f, 32.2f);
generalPath.lineTo(39.1f, 32.2f);
generalPath.lineTo(39.1f, 29.300001f);
generalPath.lineTo(55.3f, 29.300001f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.16899871826172, 29.270999908447266), new Point2D.Double(47.16899871826172, 42.17300033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.7f, 44.7f);
generalPath.lineTo(48.6f, 39.0f);
generalPath.lineTo(58.699997f, 39.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(53.6510009765625, 39.0260009765625), new Point2D.Double(53.6510009765625, 44.691001892089844), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.5f, 47.7f);
generalPath.lineTo(46.0f, 42.2f);
generalPath.lineTo(51.4f, 47.7f);
generalPath.lineTo(46.0f, 53.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.974998474121094, 42.18199920654297), new Point2D.Double(45.974998474121094, 53.13100051879883), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.0f, 34.1f);
generalPath.curveTo(30.6f, 33.699997f, 30.0f, 33.3f, 29.3f, 33.199997f);
generalPath.curveTo(28.699999f, 32.999996f, 27.9f, 32.999996f, 27.199999f, 32.999996f);
generalPath.curveTo(25.8f, 33.099995f, 23.199999f, 33.299995f, 23.199999f, 33.299995f);
generalPath.lineTo(23.099998f, 47.199997f);
generalPath.lineTo(25.699999f, 47.399998f);
generalPath.lineTo(25.699999f, 42.499996f);
generalPath.curveTo(25.699999f, 42.499996f, 27.199999f, 42.699997f, 28.599998f, 42.399998f);
generalPath.curveTo(29.399998f, 42.199997f, 29.999998f, 41.8f, 30.399998f, 41.499996f);
generalPath.curveTo(30.799997f, 41.099995f, 31.199997f, 40.499996f, 31.499998f, 40.099995f);
generalPath.curveTo(31.899998f, 39.399994f, 31.999998f, 38.699993f, 31.999998f, 37.599995f);
generalPath.curveTo(32.199997f, 36.099995f, 31.799997f, 34.899994f, 30.999998f, 34.099995f);
generalPath.closePath();
generalPath.moveTo(28.9f, 39.0f);
generalPath.curveTo(28.4f, 40.1f, 27.1f, 40.1f, 27.1f, 40.1f);
generalPath.lineTo(25.800001f, 40.1f);
generalPath.lineTo(25.800001f, 35.699997f);
generalPath.curveTo(25.800001f, 35.699997f, 26.7f, 35.6f, 27.500002f, 35.699997f);
generalPath.curveTo(27.900002f, 35.799995f, 28.300001f, 35.899998f, 28.400002f, 35.999996f);
generalPath.curveTo(29.100002f, 36.499996f, 29.400002f, 37.999996f, 28.900002f, 38.999996f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.484f,0.931f,0.998f}, new Color[] {new Color(204, 248, 210, 255),new Color(66, 155, 78, 255),new Color(45, 113, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_mpp() {
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
       ext_mpp base = new ext_mpp();
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
       ext_mpp base = new ext_mpp();
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
        return ext_mpp::new;
    }
}

