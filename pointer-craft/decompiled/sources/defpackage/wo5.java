package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class wo5 extends xo5 {
    public final WindowInsetsAnimation v;

    public wo5(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.v = windowInsetsAnimation;
    }

    @Override // defpackage.xo5
    public final float g() {
        return this.v.getAlpha();
    }

    @Override // defpackage.xo5
    public final int n() {
        return this.v.getTypeMask();
    }

    @Override // defpackage.xo5
    public final float r() {
        return this.v.getInterpolatedFraction();
    }

    @Override // defpackage.xo5
    public final void v(float f) {
        this.v.setFraction(f);
    }

    @Override // defpackage.xo5
    public final long y() {
        return this.v.getDurationMillis();
    }
}
