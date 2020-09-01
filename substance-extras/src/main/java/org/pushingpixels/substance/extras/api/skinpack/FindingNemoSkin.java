/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.substance.extras.api.skinpack;

import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.extras.api.colorschemepack.MixColorScheme;
import org.pushingpixels.substance.extras.api.painterpack.fill.MixDelegateFillPainter;
import org.pushingpixels.substance.internal.colorscheme.SaturatedColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

import java.awt.*;

/**
 * <code>Finding Nemo</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class FindingNemoSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Finding Nemo";

    /**
     * Creates a new <code>Finding Nemo</code> skin.
     */
    public FindingNemoSkin() {
        SubstanceColorScheme activeScheme = new MixColorScheme(
                "Finding Nemo Active", new PurpleColorScheme(),
                new BarbyPinkColorScheme()).saturate(0.5);
        SubstanceColorScheme defaultScheme = new MixColorScheme(
                "Finding Nemo Default", new AquaColorScheme(),
                new BottleGreenColorScheme()).saturate(0.3).tint(0.2);

        SubstanceColorScheme disabledScheme = new SaturatedColorScheme(
                defaultScheme, -0.3) {
            Color foreColor = new Color(70, 158, 210);

            @Override
            public Color getForegroundColor() {
                return foreColor;
            }
        };
        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, defaultScheme, disabledScheme);
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        // mark title panes and headers as decoration areas
        this.registerAsDecorationArea(defaultScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of headers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100), DecorationAreaType.HEADER);
        this.addOverlayPainter(new BottomLineOverlayPainter(scheme ->
                        SubstanceColorUtilities.getAlphaColor(scheme.getDarkColor(), 128)),
                DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new MixDelegateFillPainter("Mixed Glass",
                new GlassFillPainter());
        this.decorationPainter = new ArcDecorationPainter();
        this.borderPainter = new ClassicBorderPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
