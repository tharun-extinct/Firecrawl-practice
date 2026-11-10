package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.fi0;
import defpackage.gi0;
import defpackage.lr2;
import defpackage.mq2;
import defpackage.p24;
import defpackage.qi;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int h = 0;
    public final ArrayList a;
    public float b;
    public final RectF c;
    public final int i;
    public final ValueAnimator j;
    public final int m;
    public double p;
    public final float q;
    public boolean s;
    public boolean t;
    public int u;
    public final Paint w;
    public int z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.j = valueAnimator;
        this.a = new ArrayList();
        Paint paint = new Paint();
        this.w = paint;
        this.c = new RectF();
        this.z = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.l, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        mq2.h(context, R.attr.motionDurationLong2, 200);
        lr2.E(context, R.attr.motionEasingEmphasizedInterpolator, qi.y);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.i = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.q = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        g(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.h;
                this.g.y(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new fi0());
    }

    public final void g(float f) {
        this.j.cancel();
        y(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.z;
        int iRound = this.u;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.p)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.p))) + f3;
        Paint paint = this.w;
        paint.setStrokeWidth(0.0f);
        int i2 = this.m;
        canvas.drawCircle(fCos, fSin, i2, paint);
        double dSin = Math.sin(this.p);
        double d = iRound - i2;
        paint.setStrokeWidth(this.i);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.p) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.q, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.j.isRunning()) {
            return;
        }
        g(this.b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.s = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.s;
            if (this.t) {
                this.z = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.u) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.s;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.b != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            g(f);
            z3 = true;
        }
        this.s = z4 | z3;
        return true;
    }

    public final void y(float f) {
        float f2 = f % 360.0f;
        this.b = f2;
        this.p = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.z;
        int iRound = this.u;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.p)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.p))) + height;
        float f5 = this.m;
        this.c.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ClockFaceView clockFaceView = (ClockFaceView) ((gi0) obj);
            if (Math.abs(clockFaceView.N - f2) > 0.001f) {
                clockFaceView.N = f2;
                clockFaceView.w();
            }
        }
        invalidate();
    }
}
