package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zm2 implements qy4, v33 {
    public final /* synthetic */ cn2 j;
    public final /* synthetic */ in2 t;

    public zm2(in2 in2Var) {
        this.t = in2Var;
        this.j = in2Var.i;
    }

    @Override // defpackage.j51
    public final float B0(float f) {
        return f / this.j.y();
    }

    @Override // defpackage.qy4
    public final List J(bz1 bz1Var, Object obj) {
        in2 in2Var = this.t;
        um2 um2Var = in2Var.j;
        hb3 hb3Var = in2Var.c;
        um2 um2Var2 = (um2) hb3Var.l(obj);
        if (um2Var2 != null && ((qb3) um2Var.b()).j.m(um2Var2) < in2Var.m) {
            return um2Var2.c();
        }
        hb3 hb3Var2 = in2Var.u;
        hb3 hb3Var3 = in2Var.s;
        rb3 rb3Var = in2Var.z;
        if (rb3Var.a < in2Var.q) {
            mc2.g("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        um2 um2Var3 = (um2) hb3Var.l(obj);
        int i = rb3Var.a;
        int i2 = in2Var.q;
        if (i == i2) {
            rb3Var.y(obj);
        } else {
            Object[] objArr = rb3Var.j;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        in2Var.q++;
        boolean zY = hb3Var3.y(obj);
        if (zY || um2Var3 != null) {
            if (!zY && um2Var3 != null) {
                in2Var.m(((qb3) um2Var.b()).j.m(um2Var3), ((qb3) um2Var.b()).j.a);
                in2Var.o++;
                hb3Var.q(obj);
                hb3Var3.c(obj, um2Var3);
                hb3Var2.c(obj, in2Var.r(obj));
                if (um2Var.J()) {
                    in2Var.t();
                }
            }
            um2 um2Var4 = (um2) hb3Var3.l(obj);
            an2 an2Var = um2Var4 != null ? (an2) in2Var.w.l(um2Var4) : null;
            if (an2Var != null && an2Var.n) {
                in2Var.c(um2Var4, obj, false, bz1Var);
            }
            if ((an2Var != null ? an2Var.x : null) != null) {
                in2Var.g(an2Var, true);
            }
        } else {
            in2Var.q(obj, bz1Var, false);
            hb3Var2.c(obj, in2Var.r(obj));
        }
        um2 um2Var5 = (um2) hb3Var3.l(obj);
        if (um2Var5 == null) {
            return pi1.j;
        }
        List listT0 = um2Var5.N.b.t0();
        qb3 qb3Var = (qb3) listT0;
        int i3 = qb3Var.j.a;
        for (int i4 = 0; i4 < i3; i4++) {
            ((s33) qb3Var.get(i4)).w.y = true;
        }
        return listT0;
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
        return this.j.U(i, i2, map, xy1Var, xy1Var2);
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
        return this.j.y() * f;
    }

    @Override // defpackage.j51
    public final long f(float f) {
        return this.j.f(f);
    }

    @Override // defpackage.rf2
    public final fl2 getLayoutDirection() {
        return this.j.j;
    }

    @Override // defpackage.j51
    public final long h0(long j) {
        return this.j.h0(j);
    }

    @Override // defpackage.j51
    public final float j0(long j) {
        return this.j.j0(j);
    }

    @Override // defpackage.v33
    public final u33 k0(int i, int i2, Map map, xy1 xy1Var) {
        return this.j.U(i, i2, map, null, xy1Var);
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
        return this.j.a;
    }

    @Override // defpackage.j51
    public final float y() {
        return this.j.t;
    }

    @Override // defpackage.j51
    public final float y0(int i) {
        return this.j.y0(i);
    }
}
