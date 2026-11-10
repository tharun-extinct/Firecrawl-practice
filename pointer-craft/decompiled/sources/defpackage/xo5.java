package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo5 {
    public final int g;
    public final long n;
    public final Interpolator r;
    public float y;

    public xo5(int i, Interpolator interpolator, long j) {
        this.g = i;
        this.r = interpolator;
        this.n = j;
    }

    public float g() {
        return 1.0f;
    }

    public int n() {
        return this.g;
    }

    public float r() {
        float f = this.y;
        Interpolator interpolator = this.r;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public void v(float f) {
        this.y = f;
    }

    public long y() {
        return this.n;
    }
}
