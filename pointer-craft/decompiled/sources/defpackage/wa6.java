package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wa6 {
    public static ha2 g;
    public static ha2 y;

    public static final void g(int i, my1 my1Var, qr0 qr0Var, jd3 jd3Var, wm4 wm4Var, h02 h02Var, int i2) {
        my1Var.getClass();
        qr0Var.getClass();
        jd3Var.getClass();
        wm4Var.getClass();
        h02Var.Z(1045275088);
        byte b = 2;
        int i3 = i2 | (h02Var.n(i) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16) | (h02Var.j(qr0Var) ? 256 : 128) | (h02Var.j(jd3Var) ? 2048 : 1024) | (h02Var.j(wm4Var) ? 16384 : 8192);
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            wl5 wl5VarG = rx2.g(h02Var);
            if (wl5VarG == null) {
                l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yv0 yv0Var = (yv0) js2.A(v54.g(yv0.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var), xs2.k(wl5VarG), h02Var);
            f34 f34Var = yv0Var.x;
            ob3 ob3VarL = v13.l(f34Var, f34Var.getValue(), h02Var, 0, 0);
            Integer numValueOf = Integer.valueOf(i);
            boolean zJ = ((i3 & 14) == 4) | h02Var.j(yv0Var);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zJ || objK == obj) {
                objK = new v2(yv0Var, i, b);
                h02Var.i0(objK);
            }
            k33.t(yv0Var, numValueOf, (xy1) objK, h02Var);
            if (((tv0) ob3VarL.getValue()).v != null) {
                h02Var.X(1277767907);
                zl2 zl2Var = ((tv0) ob3VarL.getValue()).v;
                boolean z = (i3 & 112) == 32;
                Object objK2 = h02Var.K();
                if (z || objK2 == obj) {
                    objK2 = new gv0(my1Var, null, (byte) 0);
                    h02Var.i0(objK2);
                }
                k33.b((bz1) objK2, h02Var, zl2Var);
                h02Var.b(false);
            } else {
                h02Var.X(1277843826);
                h02Var.b(false);
            }
            q04 q04Var = ((tv0) ob3VarL.getValue()).g;
            boolean zX = h02Var.x(rp2.v(q04Var));
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = new nk(rp2.v(q04Var), null, false, true, pw5.d(ek.g, new gk(pw5.d(xl4.q, xl4.w, xl4.c)), new fk(i)));
                h02Var.i0(objK3);
            }
            nk nkVar = (nk) objK3;
            c93.n(nkVar, false, qr0Var, ue5.m0(1646631249, new dv0(nkVar, jd3Var, wm4Var, b2), h02Var), ue5.m0(-451762488, new ev0(q04Var, ob3VarL, b2), h02Var), h02Var, 28216 | (i3 & 896));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g6(i, my1Var, qr0Var, jd3Var, wm4Var, i2);
        }
    }

    public static final void n(final my1 my1Var, final long j, final c73 c73Var, final qg qgVar, final nm0 nm0Var, h02 h02Var, final int i) {
        int i2;
        long j2;
        c73 c73Var2;
        fl2 fl2Var;
        boolean z;
        Object obj;
        h02Var.Z(766784632);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(my1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= h02Var.v(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            c73Var2 = c73Var;
            i2 |= h02Var.x(c73Var2) ? 256 : 128;
        } else {
            c73Var2 = c73Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? h02Var.x(qgVar) : h02Var.j(qgVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(nm0Var) ? 16384 : 8192;
        }
        if (h02Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) h02Var.a(sa.x);
            j51 j51Var = (j51) h02Var.a(hp0.j);
            fl2 fl2Var2 = (fl2) h02Var.a(hp0.c);
            f02 f02VarH = pw5.H(h02Var);
            ob3 ob3VarQ = kq2.Q(nm0Var, h02Var);
            Object[] objArr = new Object[0];
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (objK == obj2) {
                objK = new yj2((byte) 2);
                h02Var.i0(objK);
            }
            UUID uuid = (UUID) xq2.f(objArr, (my1) objK, h02Var);
            Object objK2 = h02Var.K();
            if (objK2 == obj2) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            ox0 ox0Var = (ox0) objK2;
            boolean zX = h02Var.x(view) | h02Var.x(j51Var);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj2) {
                fl2Var = fl2Var2;
                z = true;
                p63 p63Var = new p63(my1Var, c73Var2, j2, view, fl2Var, j51Var, uuid, qgVar, ox0Var);
                nm0 nm0Var2 = new nm0(-1051373467, true, new g11(ob3VarQ, (byte) 2));
                l63 l63Var = p63Var.b;
                l63Var.setParentCompositionContext(f02VarH);
                l63Var.s.setValue(nm0Var2);
                l63Var.p = true;
                l63Var.n();
                h02Var.i0(p63Var);
                obj = p63Var;
            } else {
                fl2Var = fl2Var2;
                z = true;
                obj = objK3;
            }
            final p63 p63Var2 = (p63) obj;
            boolean zJ = h02Var.j(p63Var2);
            Object objK4 = h02Var.K();
            if (zJ || objK4 == obj2) {
                objK4 = new ll2(p63Var2, (byte) 3);
                h02Var.i0(objK4);
            }
            k33.j(p63Var2, (xy1) objK4, h02Var);
            int i3 = i2;
            boolean zJ2 = h02Var.j(p63Var2) | ((i3 & 14) == 4 ? z : false) | ((i3 & 896) == 256 ? z : false) | ((i3 & 112) == 32 ? z : false) | h02Var.n(fl2Var.ordinal());
            Object objK5 = h02Var.K();
            if (zJ2 || objK5 == obj2) {
                final fl2 fl2Var3 = fl2Var;
                objK5 = new my1() { // from class: d73
                    @Override // defpackage.my1
                    public final Object g() {
                        p63Var2.l(my1Var, c73Var, j, fl2Var3);
                        return og5.g;
                    }
                };
                h02Var.i0(objK5);
            }
            k33.z((my1) objK5, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: e73
                @Override // defpackage.bz1
                public final Object l(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    wa6.n(my1Var, j, c73Var, qgVar, nm0Var, (h02) obj3, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final void r(q04 q04Var, h02 h02Var, int i) {
        q04Var.getClass();
        h02Var.Z(-161414977);
        int i2 = (h02Var.j(q04Var) ? 4 : 2) | i;
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(null);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            xy1 xy1Var = (xy1) ob3Var.getValue();
            boolean zJ = h02Var.j(q04Var);
            Object objK2 = h02Var.K();
            if (zJ || objK2 == l76Var) {
                objK2 = new mt(q04Var, ob3Var, (mu0) null, (byte) 7);
                h02Var.i0(objK2);
            }
            k33.s(xy1Var, q04Var, (bz1) objK2, h02Var);
            ho1 ho1Var = mq4.r;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new ff(ob3Var, (byte) 7);
                h02Var.i0(objK3);
            }
            qx1 qx1VarI = pw5.I(h02Var);
            Bundle bundle = Bundle.EMPTY;
            c93.g(ky0.class, ho1Var, qx1VarI, (wt2) v13.a(((gu2) h02Var.a(ix2.g)).a(), h02Var).getValue(), (xy1) objK3, h02Var, 196656);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new fv0(q04Var, i, b);
        }
    }

    public static final ha2 v() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.CameraAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(20.0f, 4.0f);
        kq3Var.v(-3.17f);
        kq3Var.x(15.0f, 2.0f);
        kq3Var.x(9.0f, 2.0f);
        kq3Var.x(7.17f, 4.0f);
        kq3Var.x(4.0f, 4.0f);
        kq3Var.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        kq3Var.w(12.0f);
        kq3Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kq3Var.v(16.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3Var.x(22.0f, 6.0f);
        kq3Var.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kq3Var.g();
        kq3Var.j(20.0f, 18.0f);
        kq3Var.x(4.0f, 18.0f);
        kq3Var.x(4.0f, 6.0f);
        kq3Var.v(4.05f);
        kq3Var.l(1.83f, -2.0f);
        kq3Var.v(4.24f);
        kq3Var.l(1.83f, 2.0f);
        kq3Var.x(20.0f, 6.0f);
        kq3Var.w(12.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 7.0f);
        kq3Var.r(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        kq3Var.m(2.24f, 5.0f, 5.0f, 5.0f);
        kq3Var.m(5.0f, -2.24f, 5.0f, -5.0f);
        kq3Var.m(-2.24f, -5.0f, -5.0f, -5.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 15.0f);
        kq3Var.r(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        kq3Var.m(1.35f, -3.0f, 3.0f, -3.0f);
        kq3Var.m(3.0f, 1.35f, 3.0f, 3.0f);
        kq3Var.m(-1.35f, 3.0f, -3.0f, 3.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final boolean x(long j) {
        if (tf5.g(j, jj0.l)) {
            return false;
        }
        uj0 uj0VarV = jj0.v(j);
        if (!m50.I(uj0VarV.y, 12884901888L)) {
            lc2.g("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(m50.c0(uj0VarV.y)));
        }
        y84 y84Var = ((c94) uj0VarV).b;
        float fN = (float) ((y84Var.n(jj0.n(j)) * 0.0722d) + (y84Var.n(jj0.x(j)) * 0.7152d) + (y84Var.n(jj0.l(j)) * 0.2126d));
        if (fN < 0.0f) {
            fN = 0.0f;
        }
        if (fN > 1.0f) {
            fN = 1.0f;
        }
        return ((double) fN) <= 0.5d;
    }

    public static final void y(q04 q04Var, h02 h02Var, int i) {
        h02Var.Z(-1448768721);
        int i2 = (h02Var.j(q04Var) ? 4 : 2) | i;
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            ho1 ho1Var = mq4.r;
            t33 t33VarR = z50.r(hi0.t, false);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, ho1Var);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            if (q04Var != null) {
                h02Var.X(-534538351);
                vf1 vf1Var = sa.y;
                yl0 yl0VarF = gp4.F((Context) h02Var.a(vf1Var));
                qr0 qr0Var = (qr0) js2.A(v54.g(qr0.class), yl0VarF, gp4.N(xs2.d(yl0VarF), h02Var), xs2.k(yl0VarF), h02Var);
                yl0 yl0VarF2 = gp4.F((Context) h02Var.a(vf1Var));
                wm4 wm4Var = (wm4) js2.A(v54.g(wm4.class), yl0VarF2, gp4.N(xs2.d(yl0VarF2), h02Var), xs2.k(yl0VarF2), h02Var);
                p04 p04VarZ = q04Var.z();
                p04VarZ.getClass();
                ua6.g(qr0Var, wm4Var, p04VarZ, h02Var, 72);
                h02Var.b(false);
            } else {
                h02Var.X(-534318065);
                b04.g(e60.g.g(g73.g, hi0.w), 0L, 0.0f, 0L, 0, 0.0f, h02Var, 0, 62);
                h02Var.b(false);
            }
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new fv0(q04Var, i, b);
        }
    }
}
