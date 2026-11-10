package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sc2 extends gh3 {
    public static final cd l0;
    public final g25 j0;
    public rc2 k0;

    static {
        cd cdVarP = ue5.p();
        int i = jj0.t;
        cdVarP.x(jj0.n);
        cdVarP.q(1.0f);
        cdVarP.w(1);
        l0 = cdVarP;
    }

    public sc2(um2 um2Var) {
        super(um2Var);
        g25 g25Var = new g25();
        g25Var.m = 0;
        this.j0 = g25Var;
        g25Var.i = this;
        this.k0 = um2Var.i != null ? new rc2(this) : null;
    }

    @Override // defpackage.p33
    public final int P(int i) {
        ji jiVarH = this.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.v(um2Var.M.n, um2Var.c(), i);
    }

    @Override // defpackage.gh3
    public final void T0() {
        if (this.k0 == null) {
            this.k0 = new rc2(this);
        }
    }

    @Override // defpackage.gh3
    public final bz2 W0() {
        return this.k0;
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        ji jiVarH = this.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.y(um2Var.M.n, um2Var.c(), i);
    }

    @Override // defpackage.gh3
    public final i73 Y0() {
        return this.j0;
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        ji jiVarH = this.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.n(um2Var.M.n, um2Var.c(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gh3
    public final void f1(fh3 fh3Var, long j, c72 c72Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        um2 um2Var;
        long jG;
        um2 um2Var2 = this.B;
        boolean z3 = false;
        if (fh3Var.b(um2Var2)) {
            if (!A1(j)) {
                i2 = i;
                if (bv3.y(i2, 1) && (Float.floatToRawIntBits(Q0(j, X0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = c72Var.a;
                    rb3 rb3VarE = um2Var2.e();
                    objArr = rb3VarE.j;
                    i3 = rb3VarE.a - 1;
                    while (i3 >= 0) {
                        um2Var = (um2) objArr[i3];
                        if (um2Var.K()) {
                            fh3Var.l(um2Var, j, c72Var, i2, z2);
                            jG = c72Var.g();
                            if (qe6.r(jG) >= 0.0f && qe6.v(jG) && !qe6.n(jG) && !fh3Var.w(c72Var, um2Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    c72Var.a = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = c72Var.a;
                rb3 rb3VarE2 = um2Var2.e();
                objArr = rb3VarE2.j;
                i3 = rb3VarE2.a - 1;
                while (i3 >= 0) {
                    um2Var = (um2) objArr[i3];
                    if (um2Var.K()) {
                        fh3Var.l(um2Var, j, c72Var, i2, z2);
                        jG = c72Var.g();
                        if (qe6.r(jG) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                c72Var.a = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = c72Var.a;
            rb3 rb3VarE3 = um2Var2.e();
            objArr = rb3VarE3.j;
            i3 = rb3VarE3.a - 1;
            while (i3 >= 0) {
                um2Var = (um2) objArr[i3];
                if (um2Var.K()) {
                    fh3Var.l(um2Var, j, c72Var, i2, z2);
                    jG = c72Var.g();
                    if (qe6.r(jG) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            c72Var.a = i6;
        }
    }

    @Override // defpackage.us3
    public final void l0(long j, float f, xy1 xy1Var) {
        p1(j, f, xy1Var, null);
        if (this.h) {
            return;
        }
        this.B.N.b.x0();
    }

    @Override // defpackage.zy2
    public final int u0(v6 v6Var) {
        rc2 rc2Var = this.k0;
        if (rc2Var != null) {
            return rc2Var.u0(v6Var);
        }
        s33 s33Var = this.B.N.b;
        vm2 vm2Var = s33Var.F;
        if (!s33Var.z) {
            if (s33Var.w.n == qm2.j) {
                vm2Var.x = true;
                if (vm2Var.y) {
                    s33Var.D = true;
                    s33Var.E = true;
                }
            } else {
                vm2Var.l = true;
            }
        }
        sc2 sc2VarI = s33Var.i();
        boolean z = sc2VarI.o;
        sc2VarI.o = true;
        s33Var.s();
        sc2VarI.o = z;
        Integer num = (Integer) vm2Var.t.get(v6Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.p33
    public final us3 v(long j) {
        p0(j);
        um2 um2Var = this.B;
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            ((um2) objArr[i2]).N.b.u = sm2.a;
        }
        s1(um2Var.D.r(this, um2Var.c(), j));
        j1();
        return this;
    }

    @Override // defpackage.p33
    public final int x(int i) {
        ji jiVarH = this.B.h();
        t33 t33VarF = jiVarH.F();
        um2 um2Var = (um2) jiVarH.t;
        return t33VarF.g(um2Var.M.n, um2Var.c(), i);
    }
}
