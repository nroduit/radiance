## Substance look and feel - highlight painters

The base class for Substance highlight painters is `org.pushingpixels.substance.api.painter.highlight.SubstanceHighlightPainter`. The highlight painter is used to paint the highlights of renderer-based UI components (such as trees, tables, lists), as well as highlights of menu items. It can also be used to paint visuals of third-party components (see [skinning primer](custom-skinning.md) for more information). This allows providing a consistent and pluggable appearance to those components. In addition, it provides an external API for applications that wish to skin custom components in a visually consistent manner.

The only painting method in `org.pushingpixels.substance.api.painter.highlight.SubstanceHighlightPainter` is

```java
  /**
   * Paints the highlight.
   *
   * @param graphics
   *            Graphics context.
   * @param comp
   *            Component.
   * @param width
   *            Width.
   * @param height
   *            Height.
   * @param colorScheme
   *            The color scheme for painting the highlight.
   */
  public void paintHighlight(Graphics2D graphics, Component comp, int width,
      int height, SubstanceColorScheme colorScheme);
```

The `width` and `height` parameters specify the rectangle to highlight (the highlight painters are only used on rectangular areas), while the `colorScheme` specifies the Substance color scheme to be used to compute the highlight colors. Specific implementations are encouraged to maintain an internal cache of computed images, at least for small sizes.

### Management API

If you wish to use the highlight painter of the current skin to provide additional custom painting in your application, call:

* `SubstanceCortex.GlobalScope.getCurrentSkin()` to retrieve the current skin.
* `SubstanceSkin.getHighlightPainter()` to retrieve the highlight painter of the current skin.
* `SubstanceHighlightPainter.paintHighlight()` to paint the highlight background on the specific graphics context.
