package defpackage;

import android.content.res.Configuration;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lf6 {
    public static final ug5 g = new ug5((byte) 2);
    public static ha2 y;

    public static final void g(boolean z, xy1 xy1Var, j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        xy1 xy1Var2;
        nm0 nm0Var2;
        j73 j73Var2;
        int i2;
        ob3 ob3Var;
        boolean z2 = z;
        h02Var.Z(1597265892);
        int i3 = i | (h02Var.l(z2) ? 4 : 2) | 384;
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object obj = (Configuration) h02Var.a(sa.g);
            View view = (View) h02Var.a(sa.x);
            boolean zX = h02Var.x(obj) | h02Var.x(view);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zX || objK == l76Var) {
                objK = new jo5(view);
                h02Var.i0(objK);
            }
            jo5 jo5Var = (jo5) objK;
            j51 j51Var = (j51) h02Var.a(hp0.j);
            int iV = j51Var.V(48.0f);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(null);
                h02Var.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new qp3(0);
                h02Var.i0(objK3);
            }
            qp3 qp3Var = (qp3) objK3;
            Object objK4 = h02Var.K();
            if (objK4 == l76Var) {
                objK4 = new qp3(0);
                h02Var.i0(objK4);
            }
            qp3 qp3Var2 = (qp3) objK4;
            Object objK5 = h02Var.K();
            if (objK5 == l76Var) {
                objK5 = new rt1();
                h02Var.i0(objK5);
            }
            rt1 rt1Var = (rt1) objK5;
            yt4 yt4Var = (yt4) h02Var.a(hp0.s);
            String strB = aq2.b(R.string.m3c_dropdown_menu_expanded, h02Var);
            String strB2 = aq2.b(R.string.m3c_dropdown_menu_collapsed, h02Var);
            String strB3 = aq2.b(R.string.m3c_dropdown_menu_toggle, h02Var);
            Object objK6 = h02Var.K();
            if (objK6 == l76Var) {
                objK6 = kq2.M(new hm1());
                h02Var.i0(objK6);
            }
            ob3 ob3Var3 = (ob3) objK6;
            Object objK7 = h02Var.K();
            if (objK7 == l76Var) {
                objK7 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK7);
            }
            ob3 ob3Var4 = (ob3) objK7;
            int i4 = i3 & 14;
            boolean zX2 = (i4 == 4) | h02Var.x(jo5Var) | h02Var.x(j51Var);
            Object objK8 = h02Var.K();
            if (zX2 || objK8 == l76Var) {
                i2 = i4;
                Object pm1Var = new pm1(rt1Var, z, ob3Var4, strB, strB2, strB3, yt4Var, ob3Var3, xy1Var, qp3Var, qp3Var2);
                rt1Var = rt1Var;
                z2 = z;
                h02Var.i0(pm1Var);
                objK8 = pm1Var;
            } else {
                z2 = z;
                i2 = i4;
            }
            pm1 pm1Var2 = (pm1) objK8;
            boolean zJ = h02Var.j(jo5Var) | h02Var.n(iV);
            Object objK9 = h02Var.K();
            if (zJ || objK9 == l76Var) {
                ob3Var = ob3Var2;
                Object lm1Var = new lm1(jo5Var, iV, ob3Var, qp3Var, qp3Var2);
                h02Var.i0(lm1Var);
                objK9 = lm1Var;
            } else {
                ob3Var = ob3Var2;
            }
            g73 g73Var = g73.g;
            j73 j73VarN = k33.N(g73Var, (xy1) objK9);
            t33 t33VarR = z50.r(hi0.t, false);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarN);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            nm0Var2 = nm0Var;
            nm0Var2.x(pm1Var2, h02Var, 48);
            h02Var.b(true);
            if (z2) {
                h02Var.X(209894723);
                boolean zJ2 = h02Var.j(jo5Var) | h02Var.n(iV);
                Object objK10 = h02Var.K();
                if (zJ2 || objK10 == l76Var) {
                    objK10 = new s80(jo5Var, iV, ob3Var, qp3Var2);
                    h02Var.i0(objK10);
                }
                mf6.y((my1) objK10, h02Var, 0);
                h02Var.b(false);
            } else {
                h02Var.X(210228190);
                h02Var.b(false);
            }
            int i5 = i2;
            boolean z3 = i5 == 4;
            Object objK11 = h02Var.K();
            if (z3 || objK11 == l76Var) {
                objK11 = new hq0((byte) 3, rt1Var, z2);
                h02Var.i0(objK11);
            }
            k33.z((my1) objK11, h02Var);
            Object objK12 = h02Var.K();
            if (objK12 == l76Var) {
                xy1Var2 = xy1Var;
                objK12 = new mm1(xy1Var2, (byte) 0);
                h02Var.i0(objK12);
            } else {
                xy1Var2 = xy1Var;
            }
            y94.n(z2, (my1) objK12, h02Var, i5);
            j73Var2 = g73Var;
        } else {
            xy1Var2 = xy1Var;
            nm0Var2 = nm0Var;
            h02Var.Q();
            j73Var2 = j73Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new yw(z2, xy1Var2, j73Var2, nm0Var2, i);
        }
    }
}
