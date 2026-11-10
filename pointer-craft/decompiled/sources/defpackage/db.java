package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class db implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ db(boolean z, ob3 ob3Var) {
        this.j = (byte) 3;
        this.t = z;
        this.a = ob3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ha2 ha2VarQ;
        byte b = this.j;
        og5 og5Var = og5.g;
        boolean z = this.t;
        Object obj3 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gb.y((j73) obj3, (h02) obj, aq2.J(1), z ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                vd6.r((b65) obj3, z, (h02) obj, aq2.J(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oy0.g(aq2.J(49), (nm0) obj3, (h02) obj, z);
                break;
            case 3:
                ob3 ob3Var = (ob3) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    if (!z) {
                        ha2VarQ = ((Boolean) ob3Var.getValue()).booleanValue() ? js2.q() : y94.D();
                    } else if (((Boolean) ob3Var.getValue()).booleanValue()) {
                        ha2VarQ = xa6.m;
                        if (ha2VarQ == null) {
                            ga2 ga2Var = new ga2("Outlined.VerticalAlignTop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i = fj5.g;
                            cu4 cu4Var = new cu4(jj0.y);
                            kq3 kq3Var = new kq3();
                            kq3Var.j(8.0f, 11.0f);
                            kq3Var.v(3.0f);
                            kq3Var.w(10.0f);
                            kq3Var.v(2.0f);
                            kq3Var.q(11.0f);
                            kq3Var.v(3.0f);
                            kq3Var.l(-4.0f, -4.0f);
                            kq3Var.l(-4.0f, 4.0f);
                            kq3Var.g();
                            kq3Var.j(4.0f, 3.0f);
                            kq3Var.w(2.0f);
                            kq3Var.v(16.0f);
                            kq3Var.q(3.0f);
                            kq3Var.n(4.0f);
                            kq3Var.g();
                            ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
                            ha2VarQ = ga2Var.y();
                            xa6.m = ha2VarQ;
                        }
                    } else {
                        ha2VarQ = wa6.y;
                        if (ha2VarQ == null) {
                            ga2 ga2Var2 = new ga2("Outlined.VerticalAlignBottom", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = fj5.g;
                            cu4 cu4Var2 = new cu4(jj0.y);
                            kq3 kq3Var2 = new kq3();
                            kq3Var2.j(16.0f, 13.0f);
                            kq3Var2.v(-3.0f);
                            kq3Var2.q(3.0f);
                            kq3Var2.v(-2.0f);
                            kq3Var2.w(10.0f);
                            kq3Var2.n(8.0f);
                            kq3Var2.l(4.0f, 4.0f);
                            kq3Var2.l(4.0f, -4.0f);
                            kq3Var2.g();
                            kq3Var2.j(4.0f, 19.0f);
                            kq3Var2.w(2.0f);
                            kq3Var2.v(16.0f);
                            kq3Var2.w(-2.0f);
                            kq3Var2.n(4.0f);
                            kq3Var2.g();
                            ga2.g(ga2Var2, kq3Var2.g, 0, cu4Var2);
                            ha2VarQ = ga2Var2.y();
                            wa6.y = ha2VarQ;
                        }
                    }
                    t92.g(ha2VarQ, null, null, ((rj0) h02Var.a(tj0.g)).g, h02Var, 48, 4);
                }
                break;
            case 4:
                sk2 sk2Var = (sk2) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var2, 48);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    g73 g73Var = g73.g;
                    j73 j73VarW = m50.W(h02Var2, g73Var);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, kb4VarG);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    g75.y(nc6.q(sk2Var, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                    if (z) {
                        h02Var2.X(-1861114665);
                        xs2.y(ue5.g0(g73Var, 4.0f, 0.0f, 2), h02Var2, 6, 0);
                    } else {
                        h02Var2.X(-1859936520);
                    }
                    h02Var2.b(false);
                    h02Var2.b(true);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                rz5.r(z, (my1) obj3, (h02) obj, aq2.J(1));
                break;
            case 6:
                g61 g61Var = (g61) obj3;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    String str = g61Var.j;
                    if (str == null) {
                        str = "";
                    }
                    g75.y(str, null, 0L, 0L, z ? qv1.f : null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262078);
                }
                break;
            case 7:
                xd1 xd1Var = (xd1) obj;
                cr4 cr4Var = cr4.g;
                xd1.F(xd1Var, ((wq4) obj3).g(z, true), xd1Var.e(cr4.y) / 2.0f, ((wi3) obj2).g, null, 120);
                break;
            case 8:
                ((Integer) obj2).getClass();
                aq2.l((c85) obj3, z, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                hf6.n((ne5) obj3, (h02) obj, aq2.J(1), z ? 1 : 0);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ db(Object obj, int i, int i2, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i2;
    }

    public /* synthetic */ db(Object obj, boolean z, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = z;
    }

    public /* synthetic */ db(boolean z, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.t = z;
        this.a = jz1Var;
    }

    public /* synthetic */ db(byte b, Object obj, boolean z) {
        this.j = b;
        this.a = obj;
        this.t = z;
    }
}
