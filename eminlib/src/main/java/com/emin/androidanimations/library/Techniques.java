
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.emin.androidanimations.library;


import com.emin.androidanimations.library.attention.BounceAnimator;
import com.emin.androidanimations.library.attention.FlashAnimator;
import com.emin.androidanimations.library.attention.PulseAnimator;
import com.emin.androidanimations.library.attention.RubberBandAnimator;
import com.emin.androidanimations.library.attention.ShakeAnimator;
import com.emin.androidanimations.library.attention.StandUpAnimator;
import com.emin.androidanimations.library.attention.SwingAnimator;
import com.emin.androidanimations.library.attention.TadaAnimator;
import com.emin.androidanimations.library.attention.WaveAnimator;
import com.emin.androidanimations.library.attention.WobbleAnimator;
import com.emin.androidanimations.library.bouncing_entrances.BounceInAnimator;
import com.emin.androidanimations.library.bouncing_entrances.BounceInDownAnimator;
import com.emin.androidanimations.library.bouncing_entrances.BounceInLeftAnimator;
import com.emin.androidanimations.library.bouncing_entrances.BounceInRightAnimator;
import com.emin.androidanimations.library.bouncing_entrances.BounceInUpAnimator;
import com.emin.androidanimations.library.fading_entrances.FadeInAnimator;
import com.emin.androidanimations.library.fading_entrances.FadeInDownAnimator;
import com.emin.androidanimations.library.fading_entrances.FadeInLeftAnimator;
import com.emin.androidanimations.library.fading_entrances.FadeInRightAnimator;
import com.emin.androidanimations.library.fading_entrances.FadeInUpAnimator;
import com.emin.androidanimations.library.fading_exits.FadeOutAnimator;
import com.emin.androidanimations.library.fading_exits.FadeOutDownAnimator;
import com.emin.androidanimations.library.fading_exits.FadeOutLeftAnimator;
import com.emin.androidanimations.library.fading_exits.FadeOutRightAnimator;
import com.emin.androidanimations.library.fading_exits.FadeOutUpAnimator;
import com.emin.androidanimations.library.flippers.FlipInXAnimator;
import com.emin.androidanimations.library.flippers.FlipOutXAnimator;
import com.emin.androidanimations.library.flippers.FlipOutYAnimator;
import com.emin.androidanimations.library.rotating_entrances.RotateInAnimator;
import com.emin.androidanimations.library.rotating_entrances.RotateInDownLeftAnimator;
import com.emin.androidanimations.library.rotating_entrances.RotateInDownRightAnimator;
import com.emin.androidanimations.library.rotating_entrances.RotateInUpLeftAnimator;
import com.emin.androidanimations.library.rotating_entrances.RotateInUpRightAnimator;
import com.emin.androidanimations.library.rotating_exits.RotateOutAnimator;
import com.emin.androidanimations.library.rotating_exits.RotateOutDownLeftAnimator;
import com.emin.androidanimations.library.rotating_exits.RotateOutDownRightAnimator;
import com.emin.androidanimations.library.rotating_exits.RotateOutUpLeftAnimator;
import com.emin.androidanimations.library.rotating_exits.RotateOutUpRightAnimator;
import com.emin.androidanimations.library.sliders.SlideInDownAnimator;
import com.emin.androidanimations.library.sliders.SlideInLeftAnimator;
import com.emin.androidanimations.library.sliders.SlideInRightAnimator;
import com.emin.androidanimations.library.sliders.SlideInUpAnimator;
import com.emin.androidanimations.library.sliders.SlideOutDownAnimator;
import com.emin.androidanimations.library.sliders.SlideOutLeftAnimator;
import com.emin.androidanimations.library.sliders.SlideOutRightAnimator;
import com.emin.androidanimations.library.sliders.SlideOutUpAnimator;
import com.emin.androidanimations.library.zooming_entrances.ZoomInAnimator;
import com.emin.androidanimations.library.zooming_entrances.ZoomInDownAnimator;
import com.emin.androidanimations.library.zooming_entrances.ZoomInLeftAnimator;
import com.emin.androidanimations.library.zooming_entrances.ZoomInRightAnimator;
import com.emin.androidanimations.library.zooming_entrances.ZoomInUpAnimator;
import com.emin.androidanimations.library.zooming_exits.ZoomOutAnimator;
import com.emin.androidanimations.library.zooming_exits.ZoomOutDownAnimator;
import com.emin.androidanimations.library.zooming_exits.ZoomOutLeftAnimator;
import com.emin.androidanimations.library.zooming_exits.ZoomOutRightAnimator;
import com.emin.androidanimations.library.zooming_exits.ZoomOutUpAnimator;

public enum Techniques {


    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),


    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),

    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);


    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}