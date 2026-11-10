package defpackage;

import android.view.View;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tg6 {
    public static ha2 g = null;
    public static final float y = 32.0f;

    public static final void g(my1 my1Var, o91 o91Var, nm0 nm0Var, h02 h02Var, int i) {
        Object jbVar;
        my1 my1Var2 = my1Var;
        o91 o91Var2 = o91Var;
        h02Var.Z(826668973);
        int i2 = (h02Var.j(my1Var2) ? 4 : 2) | i | (h02Var.x(o91Var2) ? 32 : 16);
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) h02Var.a(sa.x);
            j51 j51Var = (j51) h02Var.a(hp0.j);
            fl2 fl2Var = (fl2) h02Var.a(hp0.c);
            f02 f02VarH = pw5.H(h02Var);
            ob3 ob3VarQ = kq2.Q(nm0Var, h02Var);
            Object[] objArr = new Object[0];
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = new h6((byte) 1);
                h02Var.i0(objK);
            }
            UUID uuid = (UUID) xq2.f(objArr, (my1) objK, h02Var);
            o91Var2.getClass();
            boolean zN = h02Var.n(2) | h02Var.x(view) | h02Var.x(j51Var) | h02Var.x(null);
            Object objK2 = h02Var.K();
            if (zN || objK2 == obj) {
                p91 p91Var = new p91(my1Var2, o91Var2, view, fl2Var, j51Var, uuid);
                nm0 nm0Var2 = new nm0(-1338939603, true, new hb(ob3VarQ, b));
                l91 l91Var = p91Var.i;
                l91Var.setParentCompositionContext(f02VarH);
                l91Var.p.setValue(nm0Var2);
                l91Var.o = true;
                l91Var.n();
                h02Var.i0(p91Var);
                objK2 = p91Var;
            }
            p91 p91Var2 = (p91) objK2;
            boolean zJ = h02Var.j(p91Var2);
            Object objK3 = h02Var.K();
            if (zJ || objK3 == obj) {
                objK3 = new ib(p91Var2, (byte) 0);
                h02Var.i0(objK3);
            }
            k33.j(p91Var2, (xy1) objK3, h02Var);
            boolean zJ2 = h02Var.j(p91Var2) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | h02Var.n(fl2Var.ordinal());
            Object objK4 = h02Var.K();
            if (zJ2 || objK4 == obj) {
                jbVar = new jb((Object) p91Var2, (Object) my1Var, (Object) o91Var, (Object) fl2Var, (byte) 0);
                my1Var2 = my1Var;
                o91Var2 = o91Var;
                h02Var.i0(jbVar);
            } else {
                my1Var2 = my1Var;
                jbVar = objK4;
                o91Var2 = o91Var;
            }
            k33.z((my1) jbVar, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2(my1Var2, o91Var2, nm0Var, i);
        }
    }

    public static final ha2 r() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.HealthAndSafety", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(10.5f, 13.0f);
        kq3Var.n(8.0f);
        kq3Var.w(-3.0f);
        kq3Var.v(2.5f);
        kq3Var.q(7.5f);
        kq3Var.v(3.0f);
        kq3Var.q(10.0f);
        kq3Var.n(16.0f);
        kq3Var.w(3.0f);
        kq3Var.v(-2.5f);
        kq3Var.w(2.5f);
        kq3Var.v(-3.0f);
        kq3Var.q(13.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 2.0f);
        kq3Var.x(4.0f, 5.0f);
        kq3Var.w(6.09f);
        kq3Var.r(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        kq3Var.r(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        kq3Var.q(5.0f);
        kq3Var.x(12.0f, 2.0f);
        kq3Var.g();
        kq3Var.j(18.0f, 11.09f);
        kq3Var.r(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        kq3Var.r(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        kq3Var.w(-4.7f);
        kq3Var.l(6.0f, -2.25f);
        kq3Var.l(6.0f, 2.25f);
        kq3Var.q(11.09f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final void y(j73 j73Var, bz1 bz1Var, h02 h02Var, int i) {
        h02Var.Z(1090521195);
        int i2 = (h02Var.x(j73Var) ? 4 : 2) | i | (h02Var.j(bz1Var) ? 32 : 16);
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = mb.y;
                h02Var.i0(objK);
            }
            t33 t33Var = (t33) objK;
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73Var);
            jo0.n.getClass();
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33Var);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.o((i3 >> 6) & 14, bz1Var, h02Var, true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ta(b, i, j73Var, bz1Var);
        }
    }
}
