package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q80 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ q80(byte b, boolean z) {
        this.j = b;
        this.t = z;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        long j;
        byte b = this.j;
        boolean z = this.t;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var, 48);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    g73 g73Var = g73.g;
                    j73 j73VarW = m50.W(h02Var, g73Var);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, kb4VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    ha2 ha2VarY = ig6.j;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3Var = new kq3();
                        kq3Var.j(19.0f, 13.0f);
                        kq3Var.v(-6.0f);
                        kq3Var.w(6.0f);
                        kq3Var.v(-2.0f);
                        kq3Var.w(-6.0f);
                        kq3Var.n(5.0f);
                        kq3Var.w(-2.0f);
                        kq3Var.v(6.0f);
                        kq3Var.q(5.0f);
                        kq3Var.v(2.0f);
                        kq3Var.w(6.0f);
                        kq3Var.v(6.0f);
                        kq3Var.w(2.0f);
                        kq3Var.g();
                        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        ig6.j = ha2VarY;
                    }
                    t92.g(ha2VarY, "Add action", mq4.j(g73Var, sr.g), 0L, h02Var, 48, 8);
                    gp4.r(nb4.g, this.t, null, null, null, null, ny5.w, h02Var, 1572870, 30);
                    h02Var.b(true);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    t92.g(z ? xx5.g() : y94.D(), null, null, 0L, h02Var2, 48, 12);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    ha2 ha2VarG = py5.g();
                    if (z) {
                        h02Var3.X(2031163886);
                        j = ((rj0) h02Var3.a(tj0.g)).g;
                    } else {
                        h02Var3.X(2031164878);
                        j = ((jj0) h02Var3.a(mt0.g)).g;
                    }
                    h02Var3.b(false);
                    t92.g(ha2VarG, null, null, j, h02Var3, 48, 4);
                }
                break;
            default:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else if (!z) {
                    h02Var4.X(1274100249);
                    h02Var4.b(false);
                } else {
                    h02Var4.X(1273983007);
                    ha2 ha2VarY2 = zb6.g;
                    if (ha2VarY2 == null) {
                        ga2 ga2Var2 = new ga2("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = fj5.g;
                        cu4 cu4Var2 = new cu4(jj0.y);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new rq3(9.0f, 16.17f));
                        arrayList.add(new qq3(4.83f, 12.0f));
                        arrayList.add(new yq3(-1.42f, 1.41f));
                        arrayList.add(new qq3(9.0f, 19.0f));
                        arrayList.add(new qq3(21.0f, 7.0f));
                        arrayList.add(new yq3(-1.41f, -1.41f));
                        arrayList.add(nq3.r);
                        ga2.g(ga2Var2, arrayList, 0, cu4Var2);
                        ha2VarY2 = ga2Var2.y();
                        zb6.g = ha2VarY2;
                    }
                    t92.g(ha2VarY2, null, null, 0L, h02Var4, 48, 12);
                    h02Var4.b(false);
                }
                break;
        }
        return og5Var;
    }
}
