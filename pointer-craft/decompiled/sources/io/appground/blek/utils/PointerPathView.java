package io.appground.blek.utils;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.imageview.ShapeableImageView;
import defpackage.av3;
import defpackage.c61;
import defpackage.dy;
import defpackage.iv4;
import defpackage.k33;
import defpackage.ku0;
import defpackage.m50;
import defpackage.mu0;
import defpackage.na1;
import defpackage.p03;
import defpackage.x21;
import defpackage.xy1;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class PointerPathView extends ShapeableImageView {
    public static final /* synthetic */ int R = 0;
    public final short C;
    public final byte D;
    public final float E;
    public final short F;
    public final LinkedList G;
    public final Paint H;
    public final Paint I;
    public iv4 J;
    public ku0 K;
    public ValueAnimator L;
    public float M;
    public int N;
    public float O;
    public float P;
    public xy1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerPathView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.C = (short) 2000;
        this.D = (byte) 50;
        float f = (4.0f * context.getResources().getDisplayMetrics().density) + 0.5f;
        this.E = f;
        this.F = (short) 300;
        this.G = new LinkedList();
        Paint paint = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
        typedArrayObtainStyledAttributes.getClass();
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        this.H = paint;
        Paint paint2 = new Paint();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
        typedArrayObtainStyledAttributes2.getClass();
        int color2 = typedArrayObtainStyledAttributes2.getColor(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.I = paint2;
        x21 x21Var = na1.g;
        this.K = k33.x(p03.g);
        this.N = 255;
        this.O = -1.0f;
        this.P = -1.0f;
    }

    public final xy1 getOnPointerCaptureChange() {
        return this.Q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (k33.M(this.K)) {
            return;
        }
        x21 x21Var = na1.g;
        this.K = k33.x(p03.g);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.L = null;
        iv4 iv4Var = this.J;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        k33.d(this.K, null);
        this.G.clear();
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        iv4 iv4Var;
        canvas.getClass();
        super.onDraw(canvas);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedList linkedList = this.G;
        Iterator it = linkedList.iterator();
        it.getClass();
        mu0 mu0Var = null;
        av3 av3Var = null;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            av3 av3Var2 = (av3) next;
            long jG = jCurrentTimeMillis - av3Var2.g();
            long j = this.C;
            if (jG >= j) {
                it.remove();
            } else {
                float f = j;
                int i = 255 - ((int) ((255 * jG) / f));
                float f2 = this.E;
                float f3 = f2 - ((jG * f2) / f);
                Paint paint = this.H;
                paint.setAlpha(i);
                paint.setStrokeWidth(f3);
                if (av3Var != null && !av3Var2.n()) {
                    canvas.drawLine(av3Var.y(), av3Var.r(), av3Var2.y(), av3Var2.r(), paint);
                }
                av3Var = av3Var2;
            }
        }
        if (!linkedList.isEmpty() && ((iv4Var = this.J) == null || iv4Var.d0())) {
            this.J = m50.T(this.K, null, new dy((Object) this, mu0Var, (byte) 25), 3);
        }
        if (this.O < 0.0f || this.P < 0.0f || this.M <= 0.0f) {
            return;
        }
        int i2 = this.N;
        Paint paint2 = this.I;
        paint2.setAlpha(i2);
        canvas.drawCircle(this.O, this.P, this.M, paint2);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || Build.VERSION.SDK_INT < 26 || !hasPointerCapture()) {
            return;
        }
        releasePointerCapture();
    }

    @Override // android.view.View
    public final void onPointerCaptureChange(boolean z) {
        super.onPointerCaptureChange(z);
        xy1 xy1Var = this.Q;
        if (xy1Var != null) {
            xy1Var.a(Boolean.valueOf(z));
        }
        if (!z || hasFocus()) {
            return;
        }
        requestFocus();
    }

    public final void setOnPointerCaptureChange(xy1 xy1Var) {
        this.Q = xy1Var;
    }

    public final void v(float f, float f2, boolean z) {
        this.G.add(new av3(f, f2, System.currentTimeMillis(), z));
        invalidate();
    }

    public final void x(float f, float f2) {
        this.O = f;
        this.P = f2;
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.E * 4.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(this.F);
        valueAnimatorOfFloat.addUpdateListener(new c61((Object) this, (byte) 3));
        valueAnimatorOfFloat.start();
        this.L = valueAnimatorOfFloat;
    }
}
