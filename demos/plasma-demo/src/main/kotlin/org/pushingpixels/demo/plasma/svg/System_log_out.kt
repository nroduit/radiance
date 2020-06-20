package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.api.icon.ResizableIcon
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory
import org.pushingpixels.neon.api.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class System_log_out private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0
shape = RoundRectangle2D.Double(13.611804962158203, 2.568389415740967, 31.819805145263672, 41.89607620239258, 1.4142094850540161, 1.4142094850540161)
paint = RadialGradientPaint(Point2D.Double(93.78003692626953, 40.54505157470703), 16.321514f, Point2D.Double(93.78003692626953, 40.54505157470703), floatArrayOf(0.0f,1.0f), arrayOf(Color(80, 80, 80, 255),Color(24, 24, 24, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.0069069862365723f, 4.456228159406257E-16f, -5.855910929470178E-16f, 2.63726806640625f, -143.57159423828125f, -61.96371078491211f))
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,0,0,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(13.611804962158203, 2.568389415740967, 31.819805145263672, 41.89607620239258, 1.4142094850540161, 1.4142094850540161)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = Rectangle2D.Double(14.495688438415527, 31.736541748046875, 30.22881507873535, 12.020814895629883)
paint = LinearGradientPaint(Point2D.Double(30.93592071533203, 43.75735855102539), Point2D.Double(30.93592071533203, 28.112619400024414), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 126, 10, 255),Color(114, 126, 10, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6355140209197998f, 0.0f, 15.94894027709961f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.318912f, 43.75736f)
generalPath!!.lineTo(14.186329f, 3.0545251f)
generalPath!!.lineTo(33.941124f, 3.0987194f)
generalPath!!.lineTo(33.985317f, 33.018173f)
generalPath!!.lineTo(14.318912f, 43.75736f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(46.8458251953125, 19.80411720275879), Point2D.Double(18.031221389770508, 27.759069442749023), floatArrayOf(0.0f,1.0f), arrayOf(Color(78, 78, 78, 255),Color(171, 171, 171, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3368984f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0000002f,0,0,10.0f,null,0.0f)
shape = Rectangle2D.Double(14.684172630310059, 3.496565580368042, 29.719282150268555, 39.951332092285156)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2994652f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7784900069236755f, 0.0f, 0.0f, 0.7784900069236755f, -7.579814910888672f, 1.5981390476226807f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.48186f, 36.421127f)
generalPath!!.curveTo(40.50693f, 39.429993f, 37.530556f, 42.216076f, 32.67976f, 43.724407f)
generalPath!!.curveTo(27.828962f, 45.23274f, 21.845287f, 45.23274f, 16.99449f, 43.724407f)
generalPath!!.curveTo(12.143692f, 42.216076f, 9.167317f, 39.429993f, 9.192389f, 36.421127f)
generalPath!!.curveTo(9.167317f, 33.412262f, 12.143692f, 30.626177f, 16.99449f, 29.117847f)
generalPath!!.curveTo(21.845287f, 27.609516f, 27.828962f, 27.609516f, 32.67976f, 29.117847f)
generalPath!!.curveTo(37.530556f, 30.626177f, 40.50693f, 33.412262f, 40.48186f, 36.421127f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, Point2D.Double(24.837125778198242, 36.42112731933594), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 1.6735750028442167E-15f, 16.87306022644043f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(1.731798f, 17.593819f)
generalPath!!.lineTo(1.731798f, 30.355364f)
generalPath!!.lineTo(9.6641035f, 30.355364f)
generalPath!!.lineTo(9.6641035f, 36.176147f)
generalPath!!.lineTo(21.887745f, 23.952503f)
generalPath!!.lineTo(9.591343f, 11.656101f)
generalPath!!.lineTo(9.591343f, 17.597067f)
generalPath!!.lineTo(1.731798f, 17.593819f)
generalPath!!.closePath()
shape = generalPath
paint = Color(204, 0, 0, 255)
g.paint = paint
g.fill(shape)
paint = Color(164, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(1.731798f, 17.593819f)
generalPath!!.lineTo(1.731798f, 30.355364f)
generalPath!!.lineTo(9.6641035f, 30.355364f)
generalPath!!.lineTo(9.6641035f, 36.176147f)
generalPath!!.lineTo(21.887745f, 23.952503f)
generalPath!!.lineTo(9.591343f, 11.656101f)
generalPath!!.lineTo(9.591343f, 17.597067f)
generalPath!!.lineTo(1.731798f, 17.593819f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5080214f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.924008f, 12.478043f)
generalPath!!.lineTo(9.924008f, 17.865662f)
generalPath!!.lineTo(2.074615f, 17.865662f)
generalPath!!.lineTo(2.074615f, 24.53144f)
generalPath!!.curveTo(12.332521f, 20.703863f, 11.954992f, 27.773987f, 21.29428f, 23.94641f)
generalPath!!.lineTo(9.924008f, 12.478043f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(19.701141357421875, 2.8969380855560303), 17.171415f, Point2D.Double(19.701141357421875, 2.8969380855560303), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2534420490264893f, -2.296194882234285E-16f, 1.7474599398277556E-16f, 0.9538999795913696f, -15.479080200195312f, 11.276630401611328f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4812834f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(8.760064125061035, 13.663073539733887), Point2D.Double(19.75554847717285, 43.449947357177734), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.7193258f, 18.399984f)
generalPath!!.lineTo(2.7193258f, 29.53603f)
generalPath!!.lineTo(10.553144f, 29.53603f)
generalPath!!.lineTo(10.553144f, 33.79398f)
generalPath!!.lineTo(20.404596f, 23.948406f)
generalPath!!.lineTo(10.488577f, 13.684714f)
generalPath!!.lineTo(10.488577f, 18.402866f)
generalPath!!.lineTo(2.7193258f, 18.399984f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.318912f, 43.75736f)
generalPath!!.lineTo(14.274718f, 3.0545251f)
generalPath!!.lineTo(33.941124f, 3.0545251f)
generalPath!!.lineTo(33.764347f, 33.681087f)
generalPath!!.lineTo(14.318912f, 43.75736f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(27.883882522583008, 7.139606952667236), 9.722718f, Point2D.Double(27.883882522583008, 7.139606952667236), floatArrayOf(0.0f,1.0f), arrayOf(Color(78, 78, 78, 255),Color(97, 97, 97, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.530474901199341f, 5.084555975452191E-18f, -2.3829779498946678E-14f, 1.4032620191574097f, -36.79512023925781f, -9.48330307006836f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.643024f, 18.456196f)
generalPath!!.lineTo(31.565472f, 20.908972f)
generalPath!!.lineTo(30.107063f, 25.726135f)
generalPath!!.curveTo(30.107063f, 25.726135f, 30.372229f, 27.228739f, 31.145626f, 26.212273f)
generalPath!!.curveTo(31.919025f, 25.195807f, 34.11808f, 22.630219f, 33.730988f, 20.754292f)
generalPath!!.curveTo(33.443726f, 19.362175f, 32.648228f, 18.699263f, 32.648228f, 18.699263f)
generalPath!!.lineTo(29.643024f, 18.456196f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(31.852951049804688, 19.107728958129883), Point2D.Double(34.007415771484375, 24.764583587646484), floatArrayOf(0.0f,1.0f), arrayOf(Color(82, 82, 82, 255),Color(82, 82, 82, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.1161199808120728f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.477083f, 17.35134f)
generalPath!!.curveTo(31.477083f, 17.35134f, 33.640354f, 18.353058f, 33.70889f, 19.229593f)
generalPath!!.curveTo(33.81067f, 20.531315f, 29.466248f, 24.665476f, 29.466248f, 24.665476f)
generalPath!!.curveTo(28.958015f, 25.284195f, 28.118326f, 24.731768f, 28.582365f, 24.135145f)
generalPath!!.curveTo(28.582365f, 24.135145f, 32.04897f, 20.017174f, 31.830637f, 19.69363f)
generalPath!!.curveTo(31.557026f, 19.288174f, 29.863997f, 18.655067f, 29.863997f, 18.655067f)
generalPath!!.curveTo(28.84753f, 17.903769f, 30.131617f, 16.349606f, 31.477083f, 17.35134f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(31.078954696655273, 21.511184692382812), Point2D.Double(33.71065139770508, 18.06403923034668), floatArrayOf(0.0f,1.0f), arrayOf(Color(206, 206, 206, 255),Color(158, 158, 158, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()

}



	private fun innerPaint(g : Graphics2D) {
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    _paint0(g, origAlpha)


	    shape = null
	    generalPath = null
	    paint = null
	    stroke = null
	    clip = null
	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.068389415740967
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.931610107421875
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 42.89607620239258
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return System_log_out(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(System_log_out(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { System_log_out(getOrigWidth().toInt(), getOrigHeight().toInt()) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override @Synchronized fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override @Synchronized fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()
    }
}

