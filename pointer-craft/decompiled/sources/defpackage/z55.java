package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z55 implements r45 {
    public final /* synthetic */ b65 n;
    public u75 y;
    public boolean g = true;
    public up r = bi6.i;

    public z55(b65 b65Var) {
        this.n = b65Var;
    }

    @Override // defpackage.r45
    public final void g() {
        x();
    }

    @Override // defpackage.r45
    public final void n(long j, up upVar) {
        long j2;
        k75 k75VarN;
        k75 k75VarN2;
        b65 b65Var = this.n;
        if (b65Var.t() && ((p42) b65Var.s.getValue()) == null) {
            b65Var.s(p42.a);
            b65Var.u = -1;
            this.g = true;
            this.r = upVar;
            b65Var.w();
            mt2 mt2Var = b65Var.n;
            if (mt2Var == null || (k75VarN2 = mt2Var.n()) == null || !k75VarN2.r(j)) {
                j2 = j;
                mt2 mt2Var2 = b65Var.n;
                if (mt2Var2 != null && (k75VarN = mt2Var2.n()) != null) {
                    int iN = b65Var.y.n(k75VarN.y(j2, true));
                    k65 k65VarY = b65.y(b65Var.q().g, sp2.y(iN, iN));
                    b65Var.v(false);
                    y42 y42Var = b65Var.a;
                    if (y42Var != null) {
                        ((zs3) y42Var).g(0);
                    }
                    b65Var.r.a(k65VarY);
                    b65Var.o = new u75(k65VarY.y);
                }
                this.g = false;
            } else {
                if (b65Var.q().g.t.length() == 0) {
                    return;
                }
                b65Var.v(false);
                long jO = b65Var.o(k65.g(b65Var.q(), null, u75.y, 5), j, true, false, this.r, true, new z42(0));
                j2 = j;
                b65Var.i = new u75(jO);
                this.y = new u75(jO);
            }
            b65Var.p(r42.j);
            b65Var.c = j2;
            b65Var.b(new wi3(j2));
            b65Var.b = 0L;
        }
    }

    @Override // defpackage.r45
    public final void onCancel() {
        x();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    @Override // defpackage.r45
    public final void v(long j) {
        k75 k75VarN;
        u75 u75Var;
        int iY;
        long jO;
        b65 b65Var = this.n;
        if (!b65Var.t() || b65Var.q().g.t.length() == 0) {
            return;
        }
        b65Var.b = wi3.v(b65Var.b, j);
        mt2 mt2Var = b65Var.n;
        if (mt2Var != null && (k75VarN = mt2Var.n()) != null) {
            b65Var.b(new wi3(wi3.v(b65Var.c, b65Var.b)));
            if (b65Var.i == null) {
                wi3 wi3VarL = b65Var.l();
                wi3VarL.getClass();
                if (k75VarN.r(wi3VarL.g)) {
                    u75Var = b65Var.i;
                    if (u75Var != null) {
                        iY = (int) (u75Var.g >> 32);
                    } else {
                        iY = k75VarN.y(b65Var.c, false);
                    }
                    wi3 wi3VarL2 = b65Var.l();
                    wi3VarL2.getClass();
                    int iY2 = k75VarN.y(wi3VarL2.g, false);
                    if (b65Var.i != null && iY == iY2) {
                        return;
                    }
                    k65 k65VarQ = b65Var.q();
                    wi3 wi3VarL3 = b65Var.l();
                    wi3VarL3.getClass();
                    jO = b65Var.o(k65VarQ, wi3VarL3.g, false, false, this.r, true, new z42(9));
                } else {
                    int iN = b65Var.y.n(k75VarN.y(b65Var.c, true));
                    aj3 aj3Var = b65Var.y;
                    wi3 wi3VarL4 = b65Var.l();
                    wi3VarL4.getClass();
                    up upVar = iN == aj3Var.n(k75VarN.y(wi3VarL4.g, true)) ? bi6.i : bi6.b;
                    k65 k65VarQ2 = b65Var.q();
                    wi3 wi3VarL5 = b65Var.l();
                    wi3VarL5.getClass();
                    jO = b65Var.o(k65VarQ2, wi3VarL5.g, false, false, upVar, true, new z42(9));
                }
            } else {
                u75Var = b65Var.i;
                if (u75Var != null) {
                    iY = (int) (u75Var.g >> 32);
                } else {
                    iY = k75VarN.y(b65Var.c, false);
                }
                wi3 wi3VarL6 = b65Var.l();
                wi3VarL6.getClass();
                int iY3 = k75VarN.y(wi3VarL6.g, false);
                if (b65Var.i != null) {
                }
                k65 k65VarQ3 = b65Var.q();
                wi3 wi3VarL7 = b65Var.l();
                wi3VarL7.getClass();
                jO = b65Var.o(k65VarQ3, wi3VarL7.g, false, false, this.r, true, new z42(9));
            }
            this.y = new u75(jO);
            if (!u75.g(jO, b65Var.i)) {
                this.g = false;
            }
        }
        b65Var.h(false);
    }

    public final void x() {
        b65 b65Var = this.n;
        b65Var.s(null);
        b65Var.b(null);
        this.r = bi6.i;
        b65Var.h(true);
        u75 u75Var = this.y;
        boolean zR = u75.r(u75Var != null ? u75Var.g : b65Var.q().y);
        b65Var.p(zR ? r42.a : r42.t);
        mt2 mt2Var = b65Var.n;
        if (mt2Var != null) {
            mt2Var.w.setValue(Boolean.valueOf(!zR && be2.n(b65Var, true)));
        }
        mt2 mt2Var2 = b65Var.n;
        if (mt2Var2 != null) {
            mt2Var2.c.setValue(Boolean.valueOf(!zR && be2.n(b65Var, false)));
        }
        mt2 mt2Var3 = b65Var.n;
        if (mt2Var3 != null) {
            mt2Var3.i.setValue(Boolean.valueOf(zR && be2.n(b65Var, true)));
        }
        if (this.g) {
            b65Var.c(b65Var.i);
        }
        b65Var.i = null;
    }

    @Override // defpackage.r45
    public final void r() {
    }

    @Override // defpackage.r45
    public final void y() {
    }
}
