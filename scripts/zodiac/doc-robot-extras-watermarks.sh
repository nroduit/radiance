#
#  Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
#
#  Redistribution and use in source and binary forms, with or without
#  modification, are permitted provided that the following conditions are met:
#
#   o Redistributions of source code must retain the above copyright notice,
#     this list of conditions and the following disclaimer.
#
#   o Redistributions in binary form must reproduce the above copyright notice,
#     this list of conditions and the following disclaimer in the documentation
#     and/or other materials provided with the distribution.
#
#   o Neither the name of the copyright holder nor the names of
#     its contributors may be used to endorse or promote products derived
#     from this software without specific prior written permission.
#
#  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
#  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
#  THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
#  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
#  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
#  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
#  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
#  OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
#  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
#  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
#  EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=3.5-SNAPSHOT
KOTLIN_VERSION=1.3.72
KOTLIN_COROUTINES_VERSION=1.3.5
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-zodiac-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar:../../build/libs-tools/kotlin-stdlib-$KOTLIN_VERSION.jar:../../build/libs-tools/kotlin-stdlib-common-$KOTLIN_VERSION.jar:../../build/libs-tools/kotlinx-coroutines-core-$KOTLIN_COROUTINES_VERSION.jar:../../build/libs-tools/kotlinx-coroutines-swing-$KOTLIN_COROUTINES_VERSION.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.BinaryWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.BrushedMetalWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.BubblesWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.CrosshatchWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.ExceedWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.FlameFractalKaleidoscopeWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.FlameFractalScripturesWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.FlameFractalSingularityWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.FlameFractalVortexWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.KatakanaWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.LatchWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.MetalWallWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.MosaicWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoiseCopperplateEngravingWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoiseFabricWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoiseMagneticFieldWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoiseMarbleVeinWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoiseMazeWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoisePlanktonWatermark ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.substance.RobotMain org.pushingpixels.tools.zodiac.substance.watermarks.NoiseWoodWatermark ../../docs/images/
