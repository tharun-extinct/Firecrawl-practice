package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class e61 extends he1 {
    public static final d61 E = new d61(0);
    public ValueAnimator A;
    public TimeInterpolator B;
    public TimeInterpolator C;
    public TimeInterpolator D;
    public boolean d;
    public final ValueAnimator e;
    public final ye1 f;
    public final kf0 h;
    public float k;
    public final wu4 o;

    public e61(Context context, final qf0 qf0Var, kf0 kf0Var) {
        super(context, qf0Var);
        this.d = false;
        this.h = kf0Var;
        ye1 ye1Var = new ye1();
        this.f = ye1Var;
        ye1Var.l = true;
        wu4 wu4Var = new wu4(this, E);
        this.o = wu4Var;
        xu4 xu4Var = new xu4();
        xu4Var.g(1.0f);
        xu4Var.y(50.0f);
        wu4Var.w = xu4Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.e = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b61
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                qf0 qf0Var2 = qf0Var;
                if (!qf0Var2.g(true) || qf0Var2.w == 0) {
                    return;
                }
                e61 e61Var = this.g;
                if (e61Var.isVisible()) {
                    e61Var.invalidateSelf();
                }
            }
        });
        if (qf0Var.g(true) && qf0Var.w != 0) {
            valueAnimator.start();
        }
        if (this.b != 1.0f) {
            this.b = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.u)) {
            canvas.save();
            Rect bounds = getBounds();
            float fY = y();
            ObjectAnimator objectAnimator = this.m;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.q;
            this.h.y(canvas, bounds, fY, z, objectAnimator2 != null && objectAnimator2.isRunning());
            float fR = r();
            ye1 ye1Var = this.f;
            ye1Var.v = fR;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.s;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            qf0 qf0Var = this.t;
            ye1Var.r = qf0Var.v[0];
            int i = qf0Var.t;
            if (i > 0) {
                this.h.x(canvas, paint, ye1Var.y, 1.0f, qf0Var.x, this.p, (int) ((js2.x(ye1Var.y, 0.0f, 0.01f) * i) / 0.01f));
            } else {
                this.h.x(canvas, paint, 0.0f, 1.0f, qf0Var.x, this.p, 0);
            }
            int i2 = this.p;
            kf0 kf0Var = this.h;
            kf0Var.v(canvas, paint, ye1Var, i2);
            int i3 = qf0Var.v[0];
            kf0Var.getClass();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h.l();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h.l();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.o.n();
        this.f.y = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        qf0 qf0Var = this.t;
        float f2 = (f < qf0Var.i * 10000.0f || f > qf0Var.b * 10000.0f) ? 0.0f : 1.0f;
        boolean z = this.d;
        ye1 ye1Var = this.f;
        wu4 wu4Var = this.o;
        if (z) {
            wu4Var.n();
            ye1Var.y = f / 10000.0f;
            invalidateSelf();
            ye1Var.n = f2;
            invalidateSelf();
        } else {
            int iWidth = getBounds().width();
            int iHeight = getBounds().height();
            if (iWidth > 0 && iHeight > 0) {
                float fMin = (float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d));
                if (fMin <= 0.0f) {
                    wu4Var.getClass();
                    l0.u("Minimum visible change must be positive.");
                    return false;
                }
                wu4Var.a = fMin;
            }
            wu4Var.y = ye1Var.y * 10000.0f;
            wu4Var.r = true;
            wu4Var.g(f);
        }
        return true;
    }

    @Override // defpackage.he1
    public final boolean v(boolean z, boolean z2, boolean z3) {
        boolean zV = super.v(z, z2, z3);
        xi xiVar = this.a;
        ContentResolver contentResolver = this.j.getContentResolver();
        xiVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.d = true;
            return zV;
        }
        this.d = false;
        this.o.w.y(50.0f / f);
        return zV;
    }
}
