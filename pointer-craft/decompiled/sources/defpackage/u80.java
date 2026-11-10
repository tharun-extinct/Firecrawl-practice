package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u80 implements bz1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ DecimalFormat t;

    public /* synthetic */ u80(int i, DecimalFormat decimalFormat) {
        this.a = i;
        this.t = decimalFormat;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.a;
        final DecimalFormat decimalFormat = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    g73 g73Var = g73.g;
                    j73 j73VarE0 = ue5.e0(mq4.g(g73Var, 32.0f, 32.0f), 4.0f);
                    ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var, 54);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarE0);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    ha2 ha2VarY = by5.v;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3Var = new kq3();
                        kq3Var.j(12.0f, 4.0f);
                        kq3Var.l(-1.41f, 1.41f);
                        kq3Var.x(16.17f, 11.0f);
                        kq3Var.n(4.0f);
                        kq3Var.w(2.0f);
                        kq3Var.v(12.17f);
                        kq3Var.l(-5.58f, 5.59f);
                        kq3Var.x(12.0f, 20.0f);
                        kq3Var.l(8.0f, -8.0f);
                        kq3Var.g();
                        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        by5.v = ha2VarY;
                    }
                    t92.g(ha2VarY, "Next step", mq4.j(g73Var, 14.0f), ((rj0) h02Var.a(tj0.g)).t, h02Var, 432, 0);
                    y94.y(Integer.valueOf(i), null, null, null, null, null, ue5.m0(222761827, new dz1() { // from class: x80
                        @Override // defpackage.dz1
                        public final Object i(Object obj3, Object obj4, Object obj5, Object obj6) {
                            int iIntValue2 = ((Integer) obj4).intValue();
                            h02 h02Var2 = (h02) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            ((hh) obj3).getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= h02Var2.n(iIntValue2) ? 32 : 16;
                            }
                            if (h02Var2.N(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                g75.y(decimalFormat.format(((double) iIntValue2) / 1000.0d) + "s", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85.g(((mf5) h02Var2.a(of5.g)).i, 0L, kq2.G(8), null, null, 0L, 0L, null, 16777213), h02Var2, 0, 0, 131070);
                            } else {
                                h02Var2.Q();
                            }
                            return og5.g;
                        }
                    }, h02Var), h02Var, 1572864, 62);
                    h02Var.b(true);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    g75.y(decimalFormat.format(((double) i) / 1000.0d) + "s", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ u80(DecimalFormat decimalFormat, int i) {
        this.t = decimalFormat;
        this.a = i;
    }
}
