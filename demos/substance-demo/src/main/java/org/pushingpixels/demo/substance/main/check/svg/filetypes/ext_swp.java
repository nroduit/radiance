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
public class ext_swp implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(61.5f, 53.4f);
generalPath.curveTo(61.5f, 51.4f, 59.9f, 49.800003f, 57.9f, 49.800003f);
generalPath.lineTo(14.1f, 49.800003f);
generalPath.curveTo(12.1f, 49.800003f, 10.5f, 51.4f, 10.5f, 53.4f);
generalPath.lineTo(10.5f, 58.4f);
generalPath.curveTo(10.5f, 60.4f, 12.1f, 62.0f, 14.1f, 62.0f);
generalPath.lineTo(57.9f, 62.0f);
generalPath.curveTo(59.9f, 62.0f, 61.5f, 60.4f, 61.5f, 58.4f);
generalPath.lineTo(61.5f, 53.4f);
generalPath.closePath();
generalPath.moveTo(42.6f, 57.9f);
generalPath.curveTo(41.5f, 57.9f, 40.6f, 57.0f, 40.6f, 55.9f);
generalPath.curveTo(40.6f, 54.800003f, 41.5f, 53.9f, 42.6f, 53.9f);
generalPath.curveTo(43.699997f, 53.9f, 44.6f, 54.800003f, 44.6f, 55.9f);
generalPath.curveTo(44.699997f, 57.0f, 43.8f, 57.9f, 42.6f, 57.9f);
generalPath.closePath();
generalPath.moveTo(48.8f, 57.9f);
generalPath.curveTo(47.7f, 57.9f, 46.8f, 57.0f, 46.8f, 55.9f);
generalPath.curveTo(46.8f, 54.800003f, 47.7f, 53.9f, 48.8f, 53.9f);
generalPath.curveTo(49.899998f, 53.9f, 50.8f, 54.800003f, 50.8f, 55.9f);
generalPath.curveTo(50.8f, 57.0f, 49.899998f, 57.9f, 48.8f, 57.9f);
generalPath.closePath();
generalPath.moveTo(54.899998f, 57.9f);
generalPath.curveTo(53.8f, 57.9f, 52.899998f, 57.0f, 52.899998f, 55.9f);
generalPath.curveTo(52.899998f, 54.800003f, 53.8f, 53.9f, 54.899998f, 53.9f);
generalPath.curveTo(55.999996f, 53.9f, 56.899998f, 54.800003f, 56.899998f, 55.9f);
generalPath.curveTo(56.899998f, 57.0f, 55.999996f, 57.9f, 54.899998f, 57.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.494999885559082, 55.8849983215332), new Point2D.Double(61.505001068115234, 55.8849983215332), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.1f, 47.7f);
generalPath.lineTo(57.9f, 47.7f);
generalPath.curveTo(58.9f, 47.7f, 59.800003f, 48.0f, 60.600002f, 48.4f);
generalPath.lineTo(56.4f, 39.5f);
generalPath.curveTo(55.2f, 36.9f, 53.300003f, 35.9f, 51.300003f, 35.9f);
generalPath.lineTo(46.500004f, 35.9f);
generalPath.lineTo(39.600002f, 42.9f);
generalPath.curveTo(39.100002f, 43.4f, 38.600002f, 43.800003f, 37.9f, 44.100002f);
generalPath.curveTo(37.300003f, 44.4f, 36.600002f, 44.500004f, 35.9f, 44.500004f);
generalPath.curveTo(35.2f, 44.500004f, 34.5f, 44.400005f, 33.9f, 44.100002f);
generalPath.lineTo(33.7f, 44.100002f);
generalPath.curveTo(33.2f, 43.800003f, 32.7f, 43.500004f, 32.2f, 43.100002f);
generalPath.lineTo(25.300001f, 36.100002f);
generalPath.lineTo(20.5f, 36.100002f);
generalPath.curveTo(18.5f, 36.100002f, 16.7f, 37.2f, 15.4f, 39.7f);
generalPath.lineTo(11.2f, 48.6f);
generalPath.curveTo(12.2f, 48.0f, 13.099999f, 47.699997f, 14.1f, 47.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.354000091552734, 42.19200134277344), new Point2D.Double(60.645999908447266, 42.19200134277344), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.2f, 32.6f);
generalPath.curveTo(46.4f, 32.399998f, 46.600002f, 32.1f, 46.8f, 31.699999f);
generalPath.curveTo(46.899998f, 31.4f, 47.0f, 30.999998f, 47.0f, 30.699999f);
generalPath.curveTo(47.0f, 30.3f, 46.9f, 29.999998f, 46.8f, 29.699999f);
generalPath.curveTo(46.7f, 29.4f, 46.5f, 29.099998f, 46.2f, 28.9f);
generalPath.curveTo(45.9f, 28.6f, 45.7f, 28.4f, 45.3f, 28.3f);
generalPath.curveTo(45.0f, 28.199999f, 44.7f, 28.099998f, 44.3f, 28.099998f);
generalPath.curveTo(43.899998f, 28.099998f, 43.6f, 28.199999f, 43.3f, 28.3f);
generalPath.lineTo(42.399998f, 28.9f);
generalPath.lineTo(38.499996f, 32.9f);
generalPath.lineTo(38.499996f, 20.5f);
generalPath.curveTo(38.499996f, 20.1f, 38.399998f, 19.8f, 38.299995f, 19.5f);
generalPath.curveTo(38.199997f, 19.2f, 37.999996f, 18.9f, 37.699997f, 18.6f);
generalPath.curveTo(37.499996f, 18.300001f, 37.199997f, 18.1f, 36.799995f, 18.0f);
generalPath.curveTo(36.499996f, 17.9f, 36.199997f, 17.8f, 35.799995f, 17.8f);
generalPath.curveTo(35.399994f, 17.8f, 35.099995f, 17.9f, 34.799995f, 18.0f);
generalPath.lineTo(33.899994f, 18.6f);
generalPath.curveTo(33.699993f, 18.9f, 33.499992f, 19.1f, 33.299995f, 19.5f);
generalPath.curveTo(33.199997f, 19.8f, 33.099995f, 20.2f, 33.099995f, 20.5f);
generalPath.lineTo(33.099995f, 32.8f);
generalPath.lineTo(29.199995f, 28.8f);
generalPath.curveTo(28.999994f, 28.599998f, 28.699995f, 28.4f, 28.299995f, 28.199999f);
generalPath.curveTo(27.999996f, 28.099998f, 27.699995f, 27.999998f, 27.299995f, 27.999998f);
generalPath.curveTo(26.899996f, 27.999998f, 26.599995f, 28.099998f, 26.299995f, 28.199999f);
generalPath.curveTo(25.999996f, 28.3f, 25.699995f, 28.499998f, 25.399996f, 28.8f);
generalPath.curveTo(25.199995f, 29.0f, 24.999996f, 29.3f, 24.799995f, 29.599998f);
generalPath.curveTo(24.699995f, 29.899998f, 24.599995f, 30.3f, 24.599995f, 30.599998f);
generalPath.curveTo(24.599995f, 30.999998f, 24.699995f, 31.3f, 24.799995f, 31.599998f);
generalPath.curveTo(24.899996f, 31.899998f, 25.099995f, 32.199997f, 25.399996f, 32.5f);
generalPath.lineTo(33.799995f, 41.1f);
generalPath.curveTo(33.999996f, 41.3f, 34.299995f, 41.5f, 34.699997f, 41.699997f);
generalPath.curveTo(34.999996f, 41.799995f, 35.299995f, 41.899998f, 35.699997f, 41.899998f);
generalPath.curveTo(36.1f, 41.899998f, 36.399998f, 41.8f, 36.699997f, 41.699997f);
generalPath.curveTo(36.999996f, 41.6f, 37.299995f, 41.399998f, 37.6f, 41.1f);
generalPath.lineTo(46.199997f, 32.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.006000518798828, 29.917999267578125), new Point2D.Double(46.992000579833984, 29.917999267578125), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(5.6f, 85.4f);
generalPath.lineTo(9.5f, 85.0f);
generalPath.curveTo(9.7f, 86.3f, 10.2f, 87.3f, 10.9f, 87.9f);
generalPath.curveTo(11.599999f, 88.5f, 12.599999f, 88.8f, 13.799999f, 88.8f);
generalPath.curveTo(15.099999f, 88.8f, 16.099998f, 88.5f, 16.699999f, 88.0f);
generalPath.curveTo(17.4f, 87.4f, 17.699999f, 86.8f, 17.699999f, 86.1f);
generalPath.curveTo(17.699999f, 85.6f, 17.599998f, 85.2f, 17.3f, 84.9f);
generalPath.curveTo(17.0f, 84.6f, 16.5f, 84.3f, 15.799999f, 84.0f);
generalPath.curveTo(15.299999f, 83.8f, 14.199999f, 83.5f, 12.599999f, 83.1f);
generalPath.curveTo(10.4f, 82.6f, 8.9f, 81.9f, 7.9999995f, 81.1f);
generalPath.curveTo(6.799999f, 80.0f, 6.2f, 78.7f, 6.2f, 77.1f);
generalPath.curveTo(6.2f, 76.1f, 6.5f, 75.1f, 7.1f, 74.2f);
generalPath.curveTo(7.7f, 73.299995f, 8.5f, 72.6f, 9.6f, 72.2f);
generalPath.curveTo(10.700001f, 71.7f, 12.0f, 71.5f, 13.5f, 71.5f);
generalPath.curveTo(16.0f, 71.5f, 17.9f, 72.1f, 19.2f, 73.2f);
generalPath.curveTo(20.500002f, 74.299995f, 21.1f, 75.799995f, 21.2f, 77.6f);
generalPath.lineTo(17.2f, 77.799995f);
generalPath.curveTo(17.0f, 76.799995f, 16.7f, 75.99999f, 16.1f, 75.6f);
generalPath.curveTo(15.5f, 75.1f, 14.700001f, 74.9f, 13.5f, 74.9f);
generalPath.curveTo(12.3f, 74.9f, 11.4f, 75.1f, 10.7f, 75.6f);
generalPath.curveTo(10.3f, 75.9f, 10.099999f, 76.299995f, 10.099999f, 76.799995f);
generalPath.curveTo(10.099999f, 77.299995f, 10.299999f, 77.7f, 10.7f, 77.99999f);
generalPath.curveTo(11.2f, 78.399994f, 12.5f, 78.899994f, 14.4f, 79.299995f);
generalPath.curveTo(16.3f, 79.7f, 17.8f, 80.2f, 18.8f, 80.7f);
generalPath.curveTo(19.8f, 81.2f, 20.5f, 81.899994f, 21.0f, 82.7f);
generalPath.curveTo(21.5f, 83.5f, 21.8f, 84.6f, 21.8f, 85.899994f);
generalPath.curveTo(21.8f, 86.99999f, 21.5f, 88.09999f, 20.8f, 89.09999f);
generalPath.curveTo(20.199999f, 90.09999f, 19.3f, 90.79999f, 18.099998f, 91.29999f);
generalPath.curveTo(16.899998f, 91.79999f, 15.499998f, 91.999985f, 13.699999f, 91.999985f);
generalPath.curveTo(11.199999f, 91.999985f, 9.199999f, 91.39999f, 7.8999987f, 90.19998f);
generalPath.curveTo(6.5999985f, 89.29998f, 5.7999988f, 87.59998f, 5.5999985f, 85.39998f);
generalPath.closePath();
generalPath.moveTo(28.1f, 91.9f);
generalPath.lineTo(23.3f, 71.9f);
generalPath.lineTo(27.4f, 71.9f);
generalPath.lineTo(30.4f, 85.700005f);
generalPath.lineTo(34.1f, 71.9f);
generalPath.lineTo(39.0f, 71.9f);
generalPath.lineTo(42.5f, 85.9f);
generalPath.lineTo(45.6f, 71.9f);
generalPath.lineTo(49.699997f, 71.9f);
generalPath.lineTo(44.799995f, 91.9f);
generalPath.lineTo(40.499996f, 91.9f);
generalPath.lineTo(36.499996f, 76.9f);
generalPath.lineTo(32.499996f, 91.9f);
generalPath.lineTo(28.099997f, 91.9f);
generalPath.closePath();
generalPath.moveTo(51.7f, 91.9f);
generalPath.lineTo(51.7f, 71.9f);
generalPath.lineTo(58.2f, 71.9f);
generalPath.curveTo(60.7f, 71.9f, 62.3f, 72.0f, 63.0f, 72.200005f);
generalPath.curveTo(64.1f, 72.50001f, 65.1f, 73.200005f, 65.9f, 74.200005f);
generalPath.curveTo(66.700005f, 75.200005f, 67.1f, 76.50001f, 67.1f, 78.100006f);
generalPath.curveTo(67.1f, 79.3f, 66.9f, 80.40001f, 66.4f, 81.200005f);
generalPath.curveTo(66.0f, 82.00001f, 65.4f, 82.700005f, 64.700005f, 83.200005f);
generalPath.curveTo(64.00001f, 83.700005f, 63.300003f, 84.00001f, 62.600006f, 84.200005f);
generalPath.curveTo(61.600006f, 84.4f, 60.200005f, 84.50001f, 58.400005f, 84.50001f);
generalPath.lineTo(55.800007f, 84.50001f);
generalPath.lineTo(55.800007f, 92.100006f);
generalPath.lineTo(51.70001f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(55.8f, 75.2f);
generalPath.lineTo(55.8f, 80.899994f);
generalPath.lineTo(58.0f, 80.899994f);
generalPath.curveTo(59.6f, 80.899994f, 60.7f, 80.799995f, 61.2f, 80.59999f);
generalPath.curveTo(61.7f, 80.399994f, 62.2f, 80.09999f, 62.5f, 79.59999f);
generalPath.curveTo(62.8f, 79.19999f, 63.0f, 78.59999f, 63.0f, 77.99999f);
generalPath.curveTo(63.0f, 77.299995f, 62.8f, 76.69999f, 62.4f, 76.19999f);
generalPath.curveTo(62.0f, 75.69999f, 61.4f, 75.39999f, 60.800003f, 75.29999f);
generalPath.curveTo(60.300003f, 75.19999f, 59.300003f, 75.19999f, 57.9f, 75.19999f);
generalPath.lineTo(55.800003f, 75.19999f);
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
	private ext_swp() {
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
       ext_swp base = new ext_swp();
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
       ext_swp base = new ext_swp();
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
        return ext_swp::new;
    }
}

