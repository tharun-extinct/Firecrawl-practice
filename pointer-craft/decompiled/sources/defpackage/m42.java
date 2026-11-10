package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m42 extends ts0 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public as0 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public m42() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.ts0
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ts0
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.ts0
    public final void Q(kv2 kv2Var, boolean z) {
        if (this.T == null) {
            return;
        }
        as0 as0Var = this.t0;
        kv2Var.getClass();
        int iC = kv2.c(as0Var);
        if (this.u0 == 1) {
            this.Y = iC;
            this.Z = 0;
            L(this.T.m());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iC;
        O(this.T.s());
        L(0);
    }

    public final void R(int i) {
        this.t0.q(i);
        this.v0 = true;
    }

    public final void S(int i) {
        as0 as0Var;
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            as0Var = this.I;
            this.t0 = as0Var;
        } else {
            as0Var = this.J;
            this.t0 = as0Var;
        }
        arrayList.add(as0Var);
        as0[] as0VarArr = this.Q;
        int length = as0VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            as0VarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.ts0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.ts0
    public final as0 t(int i) {
        int iD = du4.D(i);
        if (iD != 1) {
            if (iD != 2) {
                if (iD != 3) {
                    if (iD != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }

    @Override // defpackage.ts0
    public final void y(kv2 kv2Var, boolean z) {
        us0 us0Var = this.T;
        if (us0Var == null) {
            return;
        }
        Object objT = us0Var.t(2);
        Object objT2 = us0Var.t(4);
        us0 us0Var2 = this.T;
        boolean z2 = us0Var2 != null && us0Var2.p0[0] == 2;
        if (this.u0 == 0) {
            objT = us0Var.t(3);
            objT2 = us0Var.t(5);
            us0 us0Var3 = this.T;
            z2 = us0Var3 != null && us0Var3.p0[1] == 2;
        }
        if (this.v0) {
            as0 as0Var = this.t0;
            if (as0Var.r) {
                eu4 eu4VarM = kv2Var.m(as0Var);
                kv2Var.n(eu4VarM, this.t0.n());
                if (this.r0 != -1) {
                    if (z2) {
                        kv2Var.x(kv2Var.m(objT2), eu4VarM, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    eu4 eu4VarM2 = kv2Var.m(objT2);
                    kv2Var.x(eu4VarM, kv2Var.m(objT), 0, 5);
                    kv2Var.x(eu4VarM2, eu4VarM, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            eu4 eu4VarM3 = kv2Var.m(this.t0);
            kv2Var.v(eu4VarM3, kv2Var.m(objT), this.r0, 8);
            if (z2) {
                kv2Var.x(kv2Var.m(objT2), eu4VarM3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            eu4 eu4VarM4 = kv2Var.m(this.t0);
            eu4 eu4VarM5 = kv2Var.m(objT2);
            kv2Var.v(eu4VarM4, eu4VarM5, -this.s0, 8);
            if (z2) {
                kv2Var.x(eu4VarM4, kv2Var.m(objT), 0, 5);
                kv2Var.x(eu4VarM5, eu4VarM4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            eu4 eu4VarM6 = kv2Var.m(this.t0);
            eu4 eu4VarM7 = kv2Var.m(objT2);
            float f = this.q0;
            nr nrVarQ = kv2Var.q();
            nrVarQ.n.l(eu4VarM6, -1.0f);
            nrVarQ.n.l(eu4VarM7, f);
            kv2Var.r(nrVarQ);
        }
    }
}
