package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bz2 extends zy2 implements p33 {
    public final gh3 B;
    public LinkedHashMap D;
    public u33 F;
    public final ta3 G;
    public long C = 0;
    public final cz2 E = new cz2(this);

    public bz2(gh3 gh3Var) {
        this.B = gh3Var;
        ta3 ta3Var = mi3.g;
        this.G = new ta3();
    }

    @Override // defpackage.zy2
    public final boolean A0() {
        return this.F != null;
    }

    @Override // defpackage.zy2
    public final um2 E0() {
        return this.B.B;
    }

    @Override // defpackage.zy2
    public final u33 F0() {
        u33 u33Var = this.F;
        if (u33Var != null) {
            return u33Var;
        }
        mc2.r("LookaheadDelegate has not been measured yet when measureResult is requested.");
        up.q();
        return null;
    }

    @Override // defpackage.zy2
    public final zy2 G0() {
        gh3 gh3Var = this.B.D;
        if (gh3Var != null) {
            return gh3Var.W0();
        }
        return null;
    }

    @Override // defpackage.zy2
    public final long H0() {
        return this.C;
    }

    @Override // defpackage.zy2
    public final void L0() {
        l0(this.C, 0.0f, null);
    }

    public final int N0(v6 v6Var) {
        ta3 ta3Var = this.G;
        int iN = ta3Var.n(v6Var);
        if (iN >= 0) {
            return ta3Var.r[iN];
        }
        return Integer.MIN_VALUE;
    }

    public final gh3 O0() {
        return this.B;
    }

    public final cz2 P0() {
        return this.E;
    }

    public void Q0() {
        F0().n();
    }

    public final void R0(long j) {
        if (!je2.y(this.C, j)) {
            this.C = j;
            gh3 gh3Var = this.B;
            fz2 fz2Var = gh3Var.B.N.s;
            if (fz2Var != null) {
                fz2Var.I0();
            }
            zy2.J0(gh3Var);
        }
        if (this.o) {
            return;
        }
        w0(F0());
    }

    public final long S0(bz2 bz2Var, boolean z) {
        long jN = 0;
        while (!this.equals(bz2Var)) {
            if (!this.u || !z) {
                jN = je2.n(jN, this.C);
            }
            gh3 gh3Var = this.B.D;
            gh3Var.getClass();
            this = gh3Var.W0();
            this.getClass();
        }
        return jN;
    }

    public final void T0(u33 u33Var) {
        LinkedHashMap linkedHashMap;
        if (u33Var != null) {
            o0((((long) u33Var.g()) & 4294967295L) | (((long) u33Var.y()) << 32));
        } else {
            o0(0L);
        }
        if (!yf2.p(this.F, u33Var) && u33Var != null && ((((linkedHashMap = this.D) != null && !linkedHashMap.isEmpty()) || !u33Var.r().isEmpty()) && !yf2.p(u33Var.r(), this.D))) {
            fz2 fz2Var = this.B.B.N.s;
            fz2Var.getClass();
            fz2Var.e.l();
            LinkedHashMap linkedHashMap2 = this.D;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.D = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(u33Var.r());
        }
        this.F = u33Var;
    }

    @Override // defpackage.us3, defpackage.p33
    public final Object a() {
        return this.B.a();
    }

    @Override // defpackage.rf2
    public final fl2 getLayoutDirection() {
        return this.B.B.G;
    }

    @Override // defpackage.us3
    public final void l0(long j, float f, xy1 xy1Var) {
        R0(j);
        if (this.h) {
            return;
        }
        Q0();
    }

    @Override // defpackage.zy2, defpackage.rf2
    public final boolean u() {
        return true;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.B.w();
    }

    @Override // defpackage.zy2
    public final zy2 x0() {
        gh3 gh3Var = this.B.C;
        if (gh3Var != null) {
            return gh3Var.W0();
        }
        return null;
    }

    @Override // defpackage.j51
    public final float y() {
        return this.B.y();
    }

    @Override // defpackage.zy2
    public final bl2 z0() {
        return this.E;
    }
}
