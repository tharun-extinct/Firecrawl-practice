package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym2 {
    public boolean a;
    public boolean c;
    public final um2 g;
    public int i;
    public int j;
    public boolean l;
    public boolean m;
    public int q;
    public boolean r;
    public fz2 s;
    public int t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public qm2 n = qm2.q;
    public final s33 b = new s33(this);

    public ym2(um2 um2Var) {
        this.g = um2Var;
    }

    public final gh3 g() {
        return this.g.M.n;
    }

    public final void j(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (z && !this.c) {
                n(this.i + 1);
            } else {
                if (z || this.c) {
                    return;
                }
                n(this.i - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (z && !this.w) {
                n(this.i + 1);
            } else {
                if (z || this.w) {
                    return;
                }
                n(this.i - 1);
            }
        }
    }

    public final void n(int i) {
        int i2 = this.i;
        this.i = i;
        if ((i2 == 0) != (i == 0)) {
            um2 um2VarO = this.g.o();
            ym2 ym2Var = um2VarO != null ? um2VarO.N : null;
            if (ym2Var != null) {
                int i3 = ym2Var.i;
                if (i == 0) {
                    ym2Var.n(i3 - 1);
                } else {
                    ym2Var.n(i3 + 1);
                }
            }
        }
    }

    public final void r(int i) {
        int i2 = this.q;
        this.q = i;
        if ((i2 == 0) != (i == 0)) {
            um2 um2VarO = this.g.o();
            ym2 ym2Var = um2VarO != null ? um2VarO.N : null;
            if (ym2Var != null) {
                int i3 = ym2Var.q;
                if (i == 0) {
                    ym2Var.r(i3 - 1);
                } else {
                    ym2Var.r(i3 + 1);
                }
            }
        }
    }

    public final void t() {
        s33 s33Var = this.b;
        ym2 ym2Var = s33Var.w;
        Object obj = s33Var.e;
        um2 um2Var = this.g;
        if ((obj != null || ym2Var.g().a() != null) && s33Var.d) {
            s33Var.d = false;
            s33Var.e = ym2Var.g().a();
            um2 um2VarO = um2Var.o();
            if (um2VarO != null) {
                um2.X(um2VarO, false, 7);
            }
        }
        fz2 fz2Var = this.s;
        if (fz2Var == null || !fz2Var.V0()) {
            return;
        }
        if (y94.H(um2Var)) {
            um2 um2VarO2 = um2Var.o();
            if (um2VarO2 != null) {
                um2.X(um2VarO2, false, 7);
                return;
            }
            return;
        }
        um2 um2VarO3 = um2Var.o();
        if (um2VarO3 != null) {
            um2.V(um2VarO3, false, 7);
        }
    }

    public final void v(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.a) {
                r(this.q + 1);
            } else {
                if (z || this.a) {
                    return;
                }
                r(this.q - 1);
            }
        }
    }

    public final void x(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (z && !this.m) {
                r(this.q + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                r(this.q - 1);
            }
        }
    }

    public final void y() {
        qm2 qm2Var = this.g.N.n;
        qm2 qm2Var2 = qm2.a;
        qm2 qm2Var3 = qm2.m;
        if (qm2Var == qm2Var2 || qm2Var == qm2Var3) {
            if (this.b.I) {
                x(true);
            } else {
                v(true);
            }
        }
        if (qm2Var == qm2Var3) {
            fz2 fz2Var = this.s;
            if (fz2Var == null || !fz2Var.v0()) {
                l(true);
            } else {
                j(true);
            }
        }
    }
}
