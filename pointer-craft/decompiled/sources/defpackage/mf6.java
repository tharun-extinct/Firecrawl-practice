package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mf6 {
    public static final tn1 g;
    public static final tn1[] r;
    public static final tn1 y;

    static {
        tn1 tn1Var = new tn1("CLIENT_TELEMETRY", 1L);
        g = tn1Var;
        tn1 tn1Var2 = new tn1("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        y = tn1Var2;
        r = new tn1[]{tn1Var, tn1Var2};
    }

    public static final void g(j73 j73Var, float f, nm0 nm0Var, h02 h02Var, int i) {
        j73 j73Var2;
        h02Var.Z(1844783038);
        int i2 = i | 54;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            f = th4.y;
            g73 g73Var = g73.g;
            j73 j73VarN = gc6.n(mq4.y(g73Var, 0.0f, 40.0f, 1), tf2.j);
            kb4 kb4VarG = jb4.g(new yq(-f, true, new l0((byte) 2)), hi0.u, h02Var, 48);
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
            xs2.E(tg1.w, h02Var, kb4VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new z83();
                h02Var.i0(objK);
            }
            nm0Var.x((z83) objK, h02Var, 54);
            h02Var.b(true);
            j73Var2 = g73Var;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
        }
        float f2 = f;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ar1(j73Var2, f2, nm0Var, i, (byte) 2);
        }
    }

    public static final void n(bz1 bz1Var, nm0 nm0Var, zn3 zn3Var, h02 h02Var, int i) {
        h02Var.Z(-1069265073);
        int i2 = (h02Var.j(bz1Var) ? 4 : 2) | i | (h02Var.j(nm0Var) ? 32 : 16) | (h02Var.x(zn3Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            k00 k00Var = hi0.w;
            j73 j73VarD0 = ue5.d0(g73.g, zn3Var);
            t33 t33VarR = z50.r(k00Var, false);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarD0);
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
            g75.g(of5.g(xc6.n, h02Var), ue5.m0(-1372614088, new u43((Object) bz1Var, nm0Var, (Object) jr2.F(f83.t, h02Var), (byte) 3), h02Var), h02Var, 48);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) bz1Var, (Object) nm0Var, (Object) zn3Var, i, (byte) 24);
        }
    }

    public static final void r(z83 z83Var, boolean z, xy1 xy1Var, cn4 cn4Var, j73 j73Var, boolean z2, qh4 qh4Var, z40 z40Var, zn3 zn3Var, bz1 bz1Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        cn4 cn4Var2;
        j73 j73Var2;
        boolean z3;
        qh4 qh4Var2;
        z40 z40Var2;
        zn3 zn3Var2;
        bz1 bz1Var2;
        long j;
        z40 z40Var3;
        qh4 qh4Var3;
        int i3;
        j73 j73Var3;
        bz1 bz1Var3;
        zn3 zn3Var3;
        boolean z4;
        z40 z40Var4;
        long j2;
        long j3;
        long j4;
        h02Var.Z(697872538);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(z83Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(xy1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            cn4Var2 = cn4Var;
            i2 |= h02Var.x(cn4Var2) ? 2048 : 1024;
        } else {
            cn4Var2 = cn4Var;
        }
        int i4 = 221184 | i2;
        if ((1572864 & i) == 0) {
            i4 = 745472 | i2;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = 905969664 | i4;
        if (h02Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                th4 th4Var = th4.g;
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                qh4 qh4Var4 = rj0Var.n0;
                if (qh4Var4 == null) {
                    sj0 sj0Var = xc6.l;
                    long jN = tj0.n(rj0Var, sj0Var);
                    long jN2 = tj0.n(rj0Var, xc6.j);
                    sj0 sj0Var2 = xc6.v;
                    long jN3 = tj0.n(rj0Var, sj0Var2);
                    long j5 = jj0.l;
                    long jN4 = tj0.n(rj0Var, xc6.t);
                    long jN5 = tj0.n(rj0Var, sj0Var2);
                    long jN6 = tj0.n(rj0Var, sj0Var);
                    sj0 sj0Var3 = xc6.g;
                    long jN7 = tj0.n(rj0Var, sj0Var3);
                    float f = xc6.y;
                    long jY = jj0.y(f, jN7);
                    long jN8 = tj0.n(rj0Var, sj0Var2);
                    float f2 = xc6.r;
                    qh4 qh4Var5 = new qh4(jN, jN2, jN3, j5, jN4, jN5, jN6, jY, jj0.y(f2, jN8), j5, jj0.y(f, tj0.n(rj0Var, sj0Var3)), jj0.y(f2, tj0.n(rj0Var, sj0Var2)));
                    rj0Var.n0 = qh4Var5;
                    qh4Var4 = qh4Var5;
                }
                if (z) {
                    j = qh4Var4.r;
                } else {
                    j = !z ? qh4Var4.x : qh4Var4.q;
                }
                z40 z40VarX = gp4.x(th4.y, j);
                bo3 bo3Var = th4.n;
                nm0 nm0VarM0 = ue5.m0(1181873313, new uh4(z), h02Var);
                qh4 qh4Var6 = qh4Var4;
                z40Var3 = z40VarX;
                qh4Var3 = qh4Var6;
                i3 = i5 & (-33030145);
                j73Var3 = g73.g;
                bz1Var3 = nm0VarM0;
                zn3Var3 = bo3Var;
                z4 = true;
            } else {
                h02Var.Q();
                z4 = z2;
                qh4Var3 = qh4Var;
                z40Var3 = z40Var;
                zn3Var3 = zn3Var;
                bz1Var3 = bz1Var;
                i3 = i5 & (-33030145);
                j73Var3 = j73Var;
            }
            h02Var.s();
            h02Var.X(-1615180959);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = du4.n(h02Var);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var.b(false);
            qh4Var3.getClass();
            if (z4 && z) {
                z40Var4 = z40Var3;
                j2 = qh4Var3.g;
            } else {
                z40Var4 = z40Var3;
                if (!z4 || z) {
                    j2 = (z4 || !z) ? qh4Var3.a : qh4Var3.l;
                } else {
                    j2 = qh4Var3.n;
                }
            }
            if (z4 && z) {
                j3 = j2;
                j4 = qh4Var3.y;
            } else {
                j3 = j2;
                if (!z4 || z) {
                    j4 = (z4 || !z) ? qh4Var3.m : qh4Var3.j;
                } else {
                    j4 = qh4Var3.v;
                }
            }
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = new qp3(0);
                h02Var.i0(objK2);
            }
            qp3 qp3Var = (qp3) objK2;
            boolean zX = h02Var.x(ja3Var);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = new s12(ja3Var, qp3Var, null, (byte) 13);
                h02Var.i0(objK3);
            }
            k33.b((bz1) objK3, h02Var, ja3Var);
            z40 z40Var5 = z40Var4;
            zn3 zn3Var4 = zn3Var3;
            bz1 bz1Var4 = bz1Var3;
            uz4.r(z, xy1Var, mq4.g(ra.G(z83Var.g(j73Var3, 1.0f, true), new h81((byte) 1, qp3Var, z)), b80.r, b80.n), z4, cn4Var2, j3, j4, z40Var5, ja3Var, ue5.m0(1717860164, new u43((Object) bz1Var3, nm0Var, (Object) zn3Var3, (byte) 2), h02Var), h02Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | ((i3 << 3) & 57344));
            z3 = z4;
            z40Var2 = z40Var5;
            qh4Var2 = qh4Var3;
            zn3Var2 = zn3Var4;
            bz1Var2 = bz1Var4;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            z3 = z2;
            qh4Var2 = qh4Var;
            z40Var2 = z40Var;
            zn3Var2 = zn3Var;
            bz1Var2 = bz1Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new jw0(z83Var, z, xy1Var, cn4Var, j73Var2, z3, qh4Var2, z40Var2, zn3Var2, bz1Var2, nm0Var, i);
        }
    }

    public static final void v(View view, j51 j51Var, my1 my1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1319522472);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j51Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var) ? 256 : 128;
        }
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = h02Var.j(view) | ((i2 & 896) == 256);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new m(view, my1Var, (byte) 22);
                h02Var.i0(objK);
            }
            k33.t(view, j51Var, (xy1) objK, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(view, j51Var, my1Var, i, (byte) 6);
        }
    }

    public static final void y(my1 my1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1646555525);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (h02Var.j(my1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            v((View) h02Var.a(sa.x), (j51) h02Var.a(hp0.j), my1Var, h02Var, (i2 << 6) & 896);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ms(my1Var, i, b);
        }
    }
}
