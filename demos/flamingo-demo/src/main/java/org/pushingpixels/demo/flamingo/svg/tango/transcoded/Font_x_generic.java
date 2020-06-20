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
public class Font_x_generic implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9409419894218445f, 0.0f, 0.0f, 1.7863709926605225f, 1.5861389636993408f, -35.5352897644043f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.138718f, 45.083183f);
generalPath.curveTo(46.174484f, 45.684956f, 41.928524f, 46.242172f, 35.008602f, 46.54384f);
generalPath.curveTo(28.088676f, 46.845505f, 19.552643f, 46.845505f, 12.632719f, 46.54384f);
generalPath.curveTo(5.7127953f, 46.242172f, 1.4668367f, 45.684956f, 1.5026016f, 45.083183f);
generalPath.curveTo(1.4668367f, 44.48141f, 5.7127953f, 43.924194f, 12.632719f, 43.622528f);
generalPath.curveTo(19.552643f, 43.32086f, 28.088676f, 43.32086f, 35.008602f, 43.622528f);
generalPath.curveTo(41.928524f, 43.924194f, 46.174484f, 44.48141f, 46.138718f, 45.083183f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(22.402997970581055, 43.07173538208008), 22.318058f, new Point2D.Double(22.402997970581055, 43.07173538208008), new float[] {0.0f,1.0f}, new Color[] {new Color(46, 52, 54, 255),new Color(46, 52, 54, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0260729789733887f, -0.004434012807905674f, 9.77009767666459E-4f, 0.07524541765451431f, -0.6261910200119019f, 41.790218353271484f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(3.488370418548584, 2.512193202972412, 41.011470794677734, 42.987239837646484, 1.9981215000152588, 1.9982975721359253);
paint = new LinearGradientPaint(new Point2D.Double(36.66853713989258, 36.38324737548828), new Point2D.Double(10.30355453491211, 7.492883205413818), new float[] {0.0f,1.0f}, new Color[] {new Color(238, 238, 236, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0249254f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(3.488370418548584, 2.512193202972412, 41.011470794677734, 42.987239837646484, 1.9981215000152588, 1.9982975721359253);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.0f, 39.008526f);
generalPath.curveTo(36.343773f, 38.775524f, 36.064167f, 38.777718f, 35.458363f, 35.375885f);
generalPath.lineTo(31.077913f, 9.0f);
generalPath.lineTo(30.2413f, 9.0f);
generalPath.lineTo(16.352156f, 32.30025f);
generalPath.curveTo(12.67072f, 38.49811f, 11.798459f, 38.635723f, 9.934442f, 39.008526f);
generalPath.lineTo(9.934442f, 40.129135f);
generalPath.lineTo(19.054985f, 40.129135f);
generalPath.lineTo(19.054985f, 39.008526f);
generalPath.curveTo(16.678362f, 38.775524f, 16.305555f, 38.917522f, 16.305555f, 37.75251f);
generalPath.curveTo(16.305555f, 36.8671f, 16.445358f, 36.447693f, 17.237564f, 34.863277f);
generalPath.lineTo(19.893793f, 30.159922f);
generalPath.lineTo(30.145905f, 30.159922f);
generalPath.lineTo(31.077913f, 35.702087f);
generalPath.curveTo(31.124516f, 36.12149f, 31.171116f, 36.540897f, 31.171116f, 36.9137f);
generalPath.curveTo(31.171116f, 38.684517f, 30.924955f, 38.728924f, 27.942526f, 39.008526f);
generalPath.lineTo(27.942526f, 40.129135f);
generalPath.lineTo(39.0f, 40.129135f);
generalPath.lineTo(39.0f, 39.008526f);
generalPath.moveTo(20.872404f, 27.919804f);
generalPath.lineTo(27.86248f, 15.803673f);
generalPath.lineTo(29.912903f, 27.919804f);
generalPath.lineTo(20.872404f, 27.919804f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.561553955078125, 12.998213768005371), new Point2D.Double(30.93592071533203, 33.68109130859375), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(52, 101, 164, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200600624084473f, 11.814530372619629f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 13.814539909362793f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 17.81454086303711f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 19.81454086303711f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200560092926025f, 21.81454086303711f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520056962966919f, 23.814550399780273f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 25.81454086303711f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 27.814550399780273f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520056962966919f, 29.814550399780273f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 31.81454086303711f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 33.81454849243164f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 35.81454086303711f));
// _0_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 37.81454849243164f));
// _0_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 39.81454849243164f));
// _0_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 15.814539909362793f));
// _0_0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 41.81454086303711f));
// _0_0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 43.81454849243164f));
// _0_0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 45.81454086303711f));
// _0_0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 15.520009994506836f, 1.1854959726333618f));
// _0_0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 21.52001953125f, 1.1854959726333618f));
// _0_0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 23.52001953125f, 1.1854959726333618f));
// _0_0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 25.52001953125f, 1.1854859590530396f));
// _0_0_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 27.520029067993164f, 1.1854859590530396f));
// _0_0_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 29.52001953125f, 1.1854959726333618f));
// _0_0_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 31.520029067993164f, 1.1854959726333618f));
// _0_0_27
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 33.5200309753418f, 1.1854859590530396f));
// _0_0_28
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 35.52001953125f, 1.1854959726333618f));
// _0_0_29
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 37.5200309753418f, 1.1854959726333618f));
// _0_0_30
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 39.52001953125f, 1.185505986213684f));
// _0_0_31
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 41.5200309753418f, 1.185505986213684f));
// _0_0_32
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 43.5200309753418f, 1.1854959726333618f));
// _0_0_33
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 19.52001953125f, 1.1854959726333618f));
// _0_0_34
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 45.52001953125f, 1.1854959726333618f));
// _0_0_35
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 47.5200309753418f, 1.1854959726333618f));
// _0_0_36
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 49.52001953125f, 1.185505986213684f));
// _0_0_37
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 17.520000457763672f, -0.8144890069961548f));
// _0_0_38
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.246136f, 9.981962f);
generalPath.curveTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f);
generalPath.curveTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f);
generalPath.curveTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f);
generalPath.curveTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f);
generalPath.curveTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f);
generalPath.curveTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f);
generalPath.closePath();
shape = generalPath;
paint = new Color(136, 138, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_39
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0249996f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(4.487087726593018, 3.5124998092651367, 39.01362228393555, 41.0338134765625);
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
        return 2.9663472175598145;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.9997305870056152;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 42.06730270385742;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.00027084350586;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Font_x_generic() {
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
       Font_x_generic base = new Font_x_generic();
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
       Font_x_generic base = new Font_x_generic();
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
        return Font_x_generic::new;
    }
}

