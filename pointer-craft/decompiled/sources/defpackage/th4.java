package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class th4 {
    public static final th4 g = new th4();
    public static final float y = xc6.x;
    public static final float r = xc6.a;
    public static final bo3 n = b80.y;

    public final void g(int i, h02 h02Var) {
        h02 h02Var2;
        h02Var.Z(-1273041460);
        if (h02Var.N(i & 1, (i & 3) != 2)) {
            ha2 ha2VarY = hh6.g;
            if (ha2VarY == null) {
                ga2 ga2Var = new ga2("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i2 = fj5.g;
                cu4 cu4Var = new cu4(jj0.y);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new rq3(9.0f, 16.17f));
                arrayList.add(new qq3(4.83f, 12.0f));
                arrayList.add(new yq3(-1.42f, 1.41f));
                arrayList.add(new qq3(9.0f, 19.0f));
                arrayList.add(new qq3(21.0f, 7.0f));
                arrayList.add(new yq3(-1.41f, -1.41f));
                arrayList.add(nq3.r);
                ga2.g(ga2Var, arrayList, 0, cu4Var);
                ha2VarY = ga2Var.y();
                hh6.g = ha2VarY;
            }
            h02Var2 = h02Var;
            t92.g(ha2VarY, null, mq4.j(g73.g, r), 0L, h02Var2, 48, 8);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(this, i, (byte) 26);
        }
    }

    public final void y(int i, bz1 bz1Var, h02 h02Var, boolean z) {
        bz1 bz1Var2;
        h02Var.Z(-657462570);
        byte b = 2;
        int i2 = i | (h02Var.l(z) ? 4 : 2) | 432;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            nm0 nm0Var = kn0.g;
            h02Var.X(-1416314439);
            gp4.n(z, null, yj1.v(jr2.F(f83.a, h02Var), 2).g(new ek1(new mc5((hn1) null, (vq4) null, (wc0) null, new ae4(0.0f, xs2.r(0.0f, 1.0f), jr2.F(f83.t, h02Var)), (LinkedHashMap) null, 119))), dm1.y, null, ue5.m0(2059591811, new om0(b), h02Var), h02Var, (i2 & 14) | 196608, 18);
            h02Var.b(false);
            bz1Var2 = nm0Var;
        } else {
            h02Var.Q();
            bz1Var2 = bz1Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r80((Object) this, z, (Object) bz1Var2, i, (byte) 5);
        }
    }
}
