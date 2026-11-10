package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eg2 implements v33, rf2 {
    public final /* synthetic */ rf2 j;
    public final fl2 t;

    public eg2(rf2 rf2Var, fl2 fl2Var) {
        this.j = rf2Var;
        this.t = fl2Var;
    }

    @Override // defpackage.j51
    public final float B0(float f) {
        return this.j.B0(f);
    }

    @Override // defpackage.j51
    public final int K(long j) {
        return this.j.K(j);
    }

    @Override // defpackage.j51
    public final float M(long j) {
        return this.j.M(j);
    }

    @Override // defpackage.v33
    public final u33 U(int i, int i2, Map map, xy1 xy1Var, xy1 xy1Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mc2.y("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dg2(i, i2, map, xy1Var);
    }

    @Override // defpackage.j51
    public final int V(float f) {
        return this.j.V(f);
    }

    @Override // defpackage.j51
    public final long d(long j) {
        return this.j.d(j);
    }

    @Override // defpackage.j51
    public final float e(float f) {
        return this.j.e(f);
    }

    @Override // defpackage.j51
    public final long f(float f) {
        return this.j.f(f);
    }

    @Override // defpackage.rf2
    public final fl2 getLayoutDirection() {
        return this.t;
    }

    @Override // defpackage.j51
    public final long h0(long j) {
        return this.j.h0(j);
    }

    @Override // defpackage.j51
    public final float j0(long j) {
        return this.j.j0(j);
    }

    @Override // defpackage.j51
    public final long s0(float f) {
        return this.j.s0(f);
    }

    @Override // defpackage.rf2
    public final boolean u() {
        return this.j.u();
    }

    @Override // defpackage.j51
    public final float w() {
        return this.j.w();
    }

    @Override // defpackage.j51
    public final float y() {
        return this.j.y();
    }

    @Override // defpackage.j51
    public final float y0(int i) {
        return this.j.y0(i);
    }
}
