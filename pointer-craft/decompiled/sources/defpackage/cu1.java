package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class cu1 extends i73 implements zo0, ti3, l73, o41 {
    public tc4 A;
    public boolean d;
    public final int e;
    public final bz1 f;
    public boolean k;
    public final boolean o;

    public cu1(int i, bz1 bz1Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        bz1Var = (i2 & 4) != 0 ? null : bz1Var;
        this.o = z;
        this.f = bz1Var;
        this.e = i;
    }

    public static boolean Z0(cu1 cu1Var) {
        return cu1Var.Y0(7);
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // defpackage.i73
    public final void J0() {
        nt1 nt1Var;
        int iOrdinal = V0().ordinal();
        if (iOrdinal == 0) {
            nt1Var = (nt1) ((ba) k33.W(this)).getFocusOwner();
            nt1Var.y(8, true, false);
            if (this.o) {
                nt1Var.g.K();
            }
            nt1Var.n.g();
        } else if (iOrdinal == 1) {
            lt1 focusOwner = ((ba) k33.W(this)).getFocusOwner();
            cu1 cu1VarH = og0.h(this);
            if (cu1VarH != null && cu1VarH.o) {
                nt1 nt1Var2 = (nt1) focusOwner;
                nt1Var2.g.K();
                nt1Var2.n.g();
            }
        } else if (iOrdinal == 2) {
            nt1Var = (nt1) ((ba) k33.W(this)).getFocusOwner();
            nt1Var.y(8, true, false);
            if (this.o) {
                nt1Var.g.K();
            }
            nt1Var.n.g();
        } else if (iOrdinal != 3) {
            uo1.g();
            return;
        }
        tc4 tc4Var = this.A;
        if (tc4Var != null) {
            ((ro) tc4Var).f0();
        }
        this.A = null;
    }

    @Override // defpackage.i73
    public final void K0() {
        if (V0().y()) {
            ((nt1) ((ba) k33.W(this)).getFocusOwner()).y(8, true, true);
        }
    }

    @Override // defpackage.ti3
    public final void N() {
        W0();
    }

    public final boolean Q0(int i) {
        int iOrdinal = v70.I(this, i).ordinal();
        if (iOrdinal == 0) {
            return v70.J(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        uo1.g();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [i73] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [i73] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [rb3] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void R0(xt1 xt1Var, xt1 xt1Var2) {
        ah3 ah3Var;
        bz1 bz1Var;
        nt1 nt1Var = (nt1) ((ba) k33.W(this)).getFocusOwner();
        cu1 cu1VarX = nt1Var.x();
        if (!xt1Var.equals(xt1Var2) && (bz1Var = this.f) != null) {
            bz1Var.l(xt1Var, xt1Var2);
        }
        i73 i73Var = this.j;
        if (!i73Var.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var2 = this.j;
        um2 um2VarV = k33.V(this);
        while (um2VarV != null) {
            if ((um2VarV.M.x.m & 5120) != 0) {
                while (i73Var2 != null) {
                    int i = i73Var2.a;
                    if ((i & 5120) != 0) {
                        if (i73Var2 != i73Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? Q = i73Var2;
                            ?? rb3Var = 0;
                            while (Q != 0) {
                                if (Q instanceof ct1) {
                                    ct1 ct1Var = (ct1) Q;
                                    if (cu1VarX == nt1Var.x()) {
                                        ct1Var.c0(xt1Var2);
                                    }
                                } else if ((Q.a & 4096) != 0 && (Q instanceof p41)) {
                                    i73 i73Var3 = ((p41) Q).f;
                                    int i2 = 0;
                                    Q = Q;
                                    rb3Var = rb3Var;
                                    while (i73Var3 != null) {
                                        if ((i73Var3.a & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                rb3Var = rb3Var;
                                                Q = i73Var3;
                                            } else {
                                                if (rb3Var == 0) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var.y(i73Var3);
                                            }
                                        }
                                        i73Var3 = i73Var3.w;
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Q = k33.Q(rb3Var);
                            }
                        }
                    }
                    i73Var2 = i73Var2.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var2 = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [rb3] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final pt1 S0() {
        boolean z;
        ah3 ah3Var;
        pt1 pt1Var = new pt1();
        pt1Var.g = true;
        rt1 rt1Var = rt1.y;
        pt1Var.y = rt1Var;
        pt1Var.r = rt1Var;
        pt1Var.n = rt1Var;
        pt1Var.v = rt1Var;
        pt1Var.x = rt1Var;
        pt1Var.l = rt1Var;
        pt1Var.j = rt1Var;
        pt1Var.t = rt1Var;
        pt1Var.a = new q21((byte) 15);
        pt1Var.m = new q21((byte) 16);
        pt1Var.q = l76.a;
        int i = this.e;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((ed2) ((gd2) ((fd2) v70.b(this, hp0.w))).g.getValue()).g == 1);
        } else {
            if (i != 2) {
                l0.z("Unknown Focusability");
                return null;
            }
            z = false;
        }
        pt1Var.g = z;
        i73 i73Var = this.j;
        if (!i73Var.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var2 = this.j;
        um2 um2VarV = k33.V(this);
        loop0: while (um2VarV != null) {
            if ((um2VarV.M.x.m & 3072) != 0) {
                while (i73Var2 != null) {
                    int i2 = i73Var2.a;
                    if ((i2 & 3072) != 0) {
                        if (i73Var2 != i73Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? rb3Var = 0;
                            ?? Q = i73Var2;
                            while (Q != 0) {
                                if (Q instanceof qt1) {
                                    ((qt1) Q).Y(pt1Var);
                                } else if ((Q.a & 2048) != 0 && (Q instanceof p41)) {
                                    i73 i73Var3 = ((p41) Q).f;
                                    int i3 = 0;
                                    while (i73Var3 != null) {
                                        if ((i73Var3.a & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                Q = Q;
                                                rb3Var = rb3Var;
                                                rb3Var = rb3Var;
                                                Q = i73Var3;
                                            } else {
                                                if (rb3Var == 0) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var.y(i73Var3);
                                            }
                                        } else {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                        }
                                        i73Var3 = i73Var3.w;
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    if (i3 == 1) {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    } else {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                }
                                Q = k33.Q(rb3Var);
                            }
                        }
                    }
                    i73Var2 = i73Var2.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var2 = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
        return pt1Var;
    }

    public final k44 T0(bl2 bl2Var) {
        k44 k44Var = S0().q;
        if (k44Var != l76.a) {
            return bl2Var == null ? k44Var : k44Var.t(bl2Var.C(k33.U(this), 0L));
        }
        return bl2Var != null ? bl2Var.H(k33.U(this), false) : kq2.r(0L, y94.N(k33.U(this).a));
    }

    public final iq2 U0() {
        ah3 ah3Var;
        Object obj;
        if (!this.j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var = this.j.q;
        um2 um2VarV = k33.V(this);
        loop0: while (um2VarV != null) {
            if ((um2VarV.M.x.m & 8388640) != 0) {
                while (i73Var != null) {
                    int i = i73Var.a;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(i73Var instanceof iq2)) {
                                if (i73Var instanceof p41) {
                                    i73Var = null;
                                    for (i73 i73Var2 = ((p41) i73Var).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                        if (i73Var2 instanceof iq2) {
                                            i73Var = i73Var2;
                                        }
                                    }
                                } else {
                                    i73Var = null;
                                }
                            }
                            iq2 iq2Var = (iq2) i73Var;
                            if (iq2Var != null) {
                                return iq2Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (i73Var instanceof l73) {
                                obj = i73Var;
                            } else if (i73Var instanceof p41) {
                                obj = null;
                                for (i73 i73Var3 = ((p41) i73Var).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                    if (i73Var3 instanceof l73) {
                                        obj = i73Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            l73 l73Var = (l73) obj;
                            if (l73Var != null && l73Var.a().g(yf2.y)) {
                                return (iq2) l73Var.a().c();
                            }
                        }
                    }
                    i73Var = i73Var.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
        return null;
    }

    public final xt1 V0() {
        cu1 cu1VarX;
        ah3 ah3Var;
        boolean z = this.h;
        xt1 xt1Var = xt1.a;
        if (!z || (cu1VarX = ((nt1) ((ba) k33.W(this)).getFocusOwner()).x()) == null) {
            return xt1Var;
        }
        if (this == cu1VarX) {
            return xt1.j;
        }
        if (cu1VarX.h) {
            if (!cu1VarX.j.h) {
                mc2.y("visitAncestors called on an unattached node");
            }
            i73 i73Var = cu1VarX.j.q;
            um2 um2VarV = k33.V(cu1VarX);
            while (um2VarV != null) {
                if ((um2VarV.M.x.m & 1024) != 0) {
                    while (i73Var != null) {
                        if ((i73Var.a & 1024) != 0) {
                            i73 i73VarQ = i73Var;
                            rb3 rb3Var = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof cu1) {
                                    if (this == ((cu1) i73VarQ)) {
                                        return xt1.t;
                                    }
                                } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                    int i = 0;
                                    for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                        if ((i73Var2.a & 1024) != 0) {
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
        return xt1Var;
    }

    public final void W0() {
        int iOrdinal = V0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                uo1.g();
                return;
            }
        }
        u54 u54Var = new u54();
        mq2.b(this, new p2(u54Var, this, (byte) 25));
        Object obj = u54Var.j;
        if (obj == null) {
            yf2.Y("focusProperties");
            throw null;
        }
        if (((ot1) obj).y()) {
            return;
        }
        ((nt1) ((ba) k33.W(this)).getFocusOwner()).y(8, true, true);
    }

    public final boolean Y0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return S0().g ? Q0(i) : kq2.e(this, i, new i30(i, (byte) 7));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.i73
    public final void I0() {
    }

    public final void X0() {
    }
}
