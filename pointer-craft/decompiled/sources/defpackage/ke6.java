package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ke6 {
    public static ha2 g;
    public static ha2 y;

    public static final void g(List list, xl4 xl4Var, xy1 xy1Var, xy1 xy1Var2, my1 my1Var, xy1 xy1Var3, h02 h02Var, int i) {
        h02 h02Var2 = h02Var;
        list.getClass();
        xy1Var.getClass();
        xy1Var2.getClass();
        my1Var.getClass();
        xy1Var3.getClass();
        h02Var2.Z(1242573043);
        int i2 = i | (h02Var2.x(list) ? 4 : 2) | (h02Var2.n(xl4Var.ordinal()) ? 32 : 16) | (h02Var2.j(xy1Var) ? 256 : 128) | (h02Var2.j(xy1Var2) ? 2048 : 1024) | (h02Var2.j(my1Var) ? 16384 : 8192) | (h02Var2.j(xy1Var3) ? 131072 : 65536);
        if (h02Var2.N(i2 & 1, (74899 & i2) != 74898)) {
            ek0 ek0VarG = ck0.g(v70.n, hi0.o, h02Var2, 48);
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
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            q62.y(0.0f, 0.0f, list.indexOf(xl4Var), 817892352, jj0.j, 0L, uz5.g, ue5.m0(-700466319, new r2((Object) list, (Object) xl4Var, (jz1) xy1Var, (byte) 29), h02Var2), null, h02Var, null, null);
            m50.p(ue5.i0(g73Var, 16.0f, 0.0f, 16.0f, 8.0f, 2), 0.0f, 0L, h02Var, 6, 6);
            y94.l(xl4Var, mq4.r, null, "settings_content", ue5.m0(1883685967, new ya4((Object) xy1Var3, (Object) my1Var, (Object) xy1Var2, (byte) 10), h02Var), h02Var, ((i2 >> 3) & 14) | 27696, 4);
            h02Var2 = h02Var;
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new x61(list, xl4Var, xy1Var, xy1Var2, my1Var, xy1Var3, i);
        }
    }

    public static final ha2 r() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(16.0f, 9.0f);
        kq3Var.w(10.0f);
        kq3Var.n(8.0f);
        kq3Var.q(9.0f);
        kq3Var.v(8.0f);
        kq3Var.t(-1.5f, -6.0f);
        kq3Var.v(-5.0f);
        kq3Var.l(-1.0f, 1.0f);
        kq3Var.n(5.0f);
        kq3Var.w(2.0f);
        kq3Var.v(14.0f);
        kq3Var.q(4.0f);
        kq3Var.v(-3.5f);
        kq3Var.l(-1.0f, -1.0f);
        kq3Var.g();
        kq3Var.j(18.0f, 7.0f);
        kq3Var.n(6.0f);
        kq3Var.w(12.0f);
        kq3Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kq3Var.v(8.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3Var.q(7.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final void y(nm3 nm3Var, ma4 ma4Var, my1 my1Var, h02 h02Var, int i) {
        h02Var.Z(929962124);
        int i2 = i | (h02Var.j(nm3Var) ? 4 : 2) | (h02Var.x(ma4Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        if (!h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            h02Var.Q();
        } else if (nm3Var instanceof im3) {
            h02Var.X(1963007414);
            yf6.n(nm3Var, my1Var, h02Var, ((i2 >> 3) & 112) | (i2 & 14));
            h02Var.b(false);
        } else {
            h02Var.X(1962694810);
            uz4.g(ue5.f0(g73.g, 16.0f, 1.0f), ma4Var, ((rj0) h02Var.a(tj0.g)).D, 0L, 0.0f, 0.0f, null, ue5.m0(-854556394, new ta(nm3Var, my1Var, (byte) 29), h02Var), h02Var, (i2 & 112) | 12582912, 120);
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mm4((Object) nm3Var, (Object) ma4Var, (Object) my1Var, i, (byte) 0);
        }
    }
}
