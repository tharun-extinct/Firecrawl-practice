package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class yj1 {
    public static final zu4 n;
    public static final zu4 v;
    public static final te5 g = new te5(vg.p, vg.u);
    public static final zu4 y = m50.b0(0.0f, 400.0f, null, 5);
    public static final zu4 r = m50.b0(0.0f, 400.0f, null, 5);

    static {
        Map map = ym5.g;
        n = m50.b0(0.0f, 400.0f, new je2(4294967297L), 1);
        v = m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1);
    }

    public static ek1 a(xy1 xy1Var) {
        Map map = ym5.g;
        return new ek1(new mc5((hn1) null, new vq4(new wj1(xy1Var, (byte) 1), m50.b0(0.0f, 400.0f, new je2(4294967297L), 1)), (wc0) null, (ae4) null, (LinkedHashMap) null, 125));
    }

    public static final void g(nc5 nc5Var, my1 my1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1186853286);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(nc5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            tp3 tp3Var = nc5Var.v;
            tp3 tp3Var2 = nc5Var.n;
            boolean z = tp3Var.getValue() != null;
            if (yf2.p(nc5Var.g.n(), tp3Var2.getValue()) && !z) {
                my1Var.g();
            }
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            Object obj = objK;
            if (objK == l76Var) {
                boolean[] zArr = {z};
                h02Var.i0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new Object[1];
                h02Var.i0(objK2);
            }
            Object[] objArr = (Object[]) objK2;
            if (!yf2.p(objArr[0], tp3Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    my1Var.g();
                }
                objArr[0] = tp3Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new pj1(nc5Var, my1Var, i);
        }
    }

    public static final dm1 j(no1 no1Var, u6 u6Var, xy1 xy1Var) {
        return new dm1(new mc5((hn1) null, (vq4) null, new wc0(u6Var, xy1Var, no1Var, true), (ae4) null, (LinkedHashMap) null, 123));
    }

    public static dm1 l(zu4 zu4Var, i00 i00Var, int i) {
        k00 k00Var;
        i00 i00Var2 = hi0.f;
        if ((i & 1) != 0) {
            Map map = ym5.g;
            zu4Var = m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            i00Var = i00Var2;
        }
        if (yf2.p(i00Var, hi0.h)) {
            k00Var = hi0.q;
        } else {
            k00Var = yf2.p(i00Var, i00Var2) ? hi0.c : hi0.w;
        }
        return j(zu4Var, k00Var, new vg(1, (byte) 21));
    }

    public static dm1 m(xy1 xy1Var) {
        Map map = ym5.g;
        return new dm1(new mc5((hn1) null, new vq4(new wj1(xy1Var, (byte) 3), m50.b0(0.0f, 400.0f, new je2(4294967297L), 1)), (wc0) null, (ae4) null, (LinkedHashMap) null, 125));
    }

    public static ek1 n(qe5 qe5Var, int i) {
        k00 k00Var;
        j00 j00Var = hi0.z;
        j00 j00Var2 = hi0.p;
        no1 no1VarB0 = qe5Var;
        if ((i & 1) != 0) {
            Map map = ym5.g;
            no1VarB0 = m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1);
        }
        j00 j00Var3 = (i & 2) != 0 ? j00Var : j00Var2;
        if (yf2.p(j00Var3, j00Var2)) {
            k00Var = hi0.a;
        } else {
            k00Var = yf2.p(j00Var3, j00Var) ? hi0.b : hi0.w;
        }
        return r(no1VarB0, k00Var, new vg(1, (byte) 20));
    }

    public static final ek1 r(no1 no1Var, u6 u6Var, xy1 xy1Var) {
        return new ek1(new mc5((hn1) null, (vq4) null, new wc0(u6Var, xy1Var, no1Var, true), (ae4) null, (LinkedHashMap) null, 123));
    }

    public static dm1 t(qe5 qe5Var, int i) {
        k00 k00Var;
        j00 j00Var = hi0.z;
        j00 j00Var2 = hi0.p;
        no1 no1VarB0 = qe5Var;
        if ((i & 1) != 0) {
            Map map = ym5.g;
            no1VarB0 = m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1);
        }
        j00 j00Var3 = (i & 2) != 0 ? j00Var : j00Var2;
        if (yf2.p(j00Var3, j00Var2)) {
            k00Var = hi0.a;
        } else {
            k00Var = yf2.p(j00Var3, j00Var) ? hi0.b : hi0.w;
        }
        return j(no1VarB0, k00Var, new vg(1, (byte) 22));
    }

    public static ek1 v(no1 no1Var, int i) {
        if ((i & 1) != 0) {
            no1Var = m50.b0(0.0f, 400.0f, null, 5);
        }
        return new ek1(new mc5(new hn1(0.0f, no1Var), (vq4) null, (wc0) null, (ae4) null, (LinkedHashMap) null, 126));
    }

    public static dm1 x(no1 no1Var, int i) {
        if ((i & 1) != 0) {
            no1Var = m50.b0(0.0f, 400.0f, null, 5);
        }
        return new dm1(new mc5(new hn1(0.0f, no1Var), (vq4) null, (wc0) null, (ae4) null, (LinkedHashMap) null, 126));
    }

    public static ek1 y(zu4 zu4Var, i00 i00Var, int i) {
        k00 k00Var;
        i00 i00Var2 = hi0.f;
        if ((i & 1) != 0) {
            Map map = ym5.g;
            zu4Var = m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            i00Var = i00Var2;
        }
        if (yf2.p(i00Var, hi0.h)) {
            k00Var = hi0.q;
        } else {
            k00Var = yf2.p(i00Var, i00Var2) ? hi0.c : hi0.w;
        }
        return r(zu4Var, k00Var, new vg(1, (byte) 19));
    }
}
