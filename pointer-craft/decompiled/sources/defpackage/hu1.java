package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hu1 extends p41 implements ej4, a32, zo0, ti3, hd5 {
    public static final d52 D = new d52((byte) 11);
    public kr2 A;
    public gh3 B;
    public final cu1 C;
    public final xy1 d;
    public gt1 e;
    public ja3 k;

    public hu1(ja3 ja3Var, int i, w wVar) {
        this.k = ja3Var;
        this.d = wVar;
        cu1 cu1Var = new cu1(i, new v30(2, this, hu1.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 3), 10);
        Q0(cu1Var);
        this.C = cu1Var;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void K0() {
        kr2 kr2Var = this.A;
        if (kr2Var != null) {
            kr2Var.y();
        }
        this.A = null;
    }

    @Override // defpackage.ti3
    public final void N() {
        u54 u54Var = new u54();
        mq2.b(this, new p2(u54Var, this, (byte) 26));
        kr2 kr2Var = (kr2) u54Var.j;
        if (this.C.V0().y()) {
            kr2 kr2Var2 = this.A;
            if (kr2Var2 != null) {
                kr2Var2.y();
            }
            if (kr2Var != null) {
                kr2Var.g();
            } else {
                kr2Var = null;
            }
            this.A = kr2Var;
        }
    }

    public final void T0(ja3 ja3Var, ue2 ue2Var) {
        if (!this.h) {
            ja3Var.r(ue2Var);
            return;
        }
        dh2 dh2Var = (dh2) ((ku0) E0()).j.h(d52.m);
        m50.T(E0(), null, new c(ja3Var, ue2Var, dh2Var != null ? dh2Var.A(new m(ja3Var, ue2Var, (byte) 23)) : null, null, (byte) 24), 3);
    }

    public final void U0() {
        ah3 ah3Var;
        if (this.h) {
            if (!this.j.h) {
                mc2.y("visitAncestors called on an unattached node");
            }
            i73 i73Var = this.j.q;
            um2 um2VarV = k33.V(this);
            while (um2VarV != null) {
                if ((um2VarV.M.x.m & 262144) != 0) {
                    while (i73Var != null) {
                        if ((i73Var.a & 262144) != 0) {
                            i73 i73VarQ = i73Var;
                            rb3 rb3Var = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof hd5) {
                                    if (iu1.o == ((hd5) i73VarQ).s()) {
                                        return;
                                    }
                                }
                                if ((i73VarQ.a & 262144) != 0 && (i73VarQ instanceof p41)) {
                                    int i = 0;
                                    for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                        if ((i73Var2.a & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                i73VarQ = i73Var2;
                                            } else {
                                                if (rb3Var == null) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var.y(i73Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var);
                            }
                        }
                        i73Var = i73Var.q;
                    }
                }
                um2VarV = um2VarV.o();
                i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
            }
        }
    }

    public final void V0(ja3 ja3Var) {
        gt1 gt1Var;
        if (yf2.p(this.k, ja3Var)) {
            return;
        }
        ja3 ja3Var2 = this.k;
        if (ja3Var2 != null && (gt1Var = this.e) != null) {
            ja3Var2.r(new ht1(gt1Var));
        }
        this.e = null;
        this.k = ja3Var;
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        boolean zY = this.C.V0().y();
        ci2[] ci2VarArr = lj4.g;
        mj4 mj4Var = kj4.q;
        ci2 ci2Var = lj4.g[4];
        Boolean boolValueOf = Boolean.valueOf(zY);
        mj4Var.getClass();
        nj4Var.g(mj4Var, boolValueOf);
        nj4Var.g(yi4.f, new p1(null, new w9(0, this, hu1.class, "requestFocus", "requestFocus()Z", 0, (byte) 2)));
    }

    @Override // defpackage.a32
    public final void o(gh3 gh3Var) {
        this.B = gh3Var;
        if (this.C.V0().y()) {
            if (!gh3Var.Y0().h) {
                U0();
                return;
            }
            gh3 gh3Var2 = this.B;
            if (gh3Var2 == null || !gh3Var2.Y0().h) {
                return;
            }
            U0();
        }
    }

    @Override // defpackage.hd5
    public final Object s() {
        return D;
    }
}
