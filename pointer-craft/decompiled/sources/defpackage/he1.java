package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class he1 extends Drawable implements Animatable {
    public static final mf0 z = new mf0(Float.class, "growFraction", 2);
    public float b;
    public ArrayList c;
    public boolean i;
    public final Context j;
    public ObjectAnimator m;
    public int p;
    public ObjectAnimator q;
    public final qf0 t;
    public final float w = -1.0f;
    public final Paint s = new Paint();
    public final Rect u = new Rect();
    public xi a = new xi();

    public he1(Context context, qf0 qf0Var) {
        this.j = context;
        this.t = qf0Var;
        setAlpha(255);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.q;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    public final boolean n(boolean z2, boolean z3, boolean z4) {
        xi xiVar = this.a;
        ContentResolver contentResolver = this.j.getContentResolver();
        xiVar.getClass();
        return v(z2, z3, z4 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public final float r() {
        float f = this.w;
        if (f > 0.0f) {
            return f;
        }
        boolean z2 = this instanceof e61;
        qf0 qf0Var = this.t;
        if (qf0Var.g(z2) && qf0Var.w != 0) {
            xi xiVar = this.a;
            ContentResolver contentResolver = this.j.getContentResolver();
            xiVar.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                int i = (int) ((((z2 ? qf0Var.a : qf0Var.m) * 1000.0f) / qf0Var.w) * f2);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i)) / i;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.s.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return n(z2, z3, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        v(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        v(false, true, false);
    }

    public boolean v(boolean z2, boolean z3, boolean z4) {
        ObjectAnimator objectAnimator = this.m;
        byte b = 0;
        mf0 mf0Var = z;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, mf0Var, 0.0f, 1.0f);
            this.m = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.m.setInterpolator(qi.y);
            ObjectAnimator objectAnimator2 = this.m;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                l0.u("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.m = objectAnimator2;
            objectAnimator2.addListener(new ge1(this, b));
        }
        byte b2 = 1;
        if (this.q == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, mf0Var, 1.0f, 0.0f);
            this.q = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.q.setInterpolator(qi.y);
            ObjectAnimator objectAnimator3 = this.q;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                l0.u("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.q = objectAnimator3;
            objectAnimator3.addListener(new ge1(this, b2));
        }
        if (isVisible() || z2) {
            ObjectAnimator objectAnimator4 = z2 ? this.m : this.q;
            ObjectAnimator objectAnimator5 = z2 ? this.q : this.m;
            if (!z4) {
                if (objectAnimator5.isRunning()) {
                    boolean z5 = this.i;
                    this.i = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.i = z5;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z6 = this.i;
                    this.i = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.i = z6;
                }
                return super.setVisible(z2, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z7 = !z2 || super.setVisible(z2, false);
                qf0 qf0Var = this.t;
                if (!z2 ? qf0Var.j != 0 : qf0Var.l != 0) {
                    boolean z8 = this.i;
                    this.i = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.i = z8;
                    return z7;
                }
                if (z3 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z7;
                }
                objectAnimator4.resume();
                return z7;
            }
        }
        return false;
    }

    public final void x(ky kyVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.contains(kyVar)) {
            return;
        }
        this.c.remove(kyVar);
        if (this.c.isEmpty()) {
            this.c = null;
        }
    }

    public final float y() {
        qf0 qf0Var = this.t;
        if (qf0Var.l == 0 && qf0Var.j == 0) {
            return 1.0f;
        }
        return this.b;
    }
}
