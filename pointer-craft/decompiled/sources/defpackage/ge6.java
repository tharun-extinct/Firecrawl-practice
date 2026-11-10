package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ge6 {
    public static ha2 n;
    public static final mj4 g = new mj4("TestTagsAsResourceId", false, new vq0((byte) 17));
    public static final mj4 y = new mj4("AccessibilityClassName", true, new od4((byte) 10));
    public static final mj4 r = new mj4("CredentialRequest", false, new vq0((byte) 18));

    public static final void g(b91 b91Var, h02 h02Var, int i) {
        int i2;
        String strI;
        h02 h02Var2 = h02Var;
        h02Var2.Z(1776923487);
        int i3 = i | (h02Var2.x(b91Var) ? 4 : 2);
        if (h02Var2.N(i3 & 1, (i3 & 3) != 2)) {
            g73 g73Var = g73.g;
            j73 j73VarG0 = ue5.g0(mq4.r(g73Var, 1.0f), 0.0f, 2.0f, 1);
            kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var2, 48);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarG0);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z = h02Var2.S;
            sx1 sx1Var = um2.Z;
            if (z) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var2, kb4VarG);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var2, tr3VarQ);
            Integer numValueOf = Integer.valueOf(iHashCode);
            on0 on0Var3 = tg1.c;
            xs2.E(on0Var3, h02Var2, numValueOf);
            xs2.D(h02Var2);
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var2, j73VarW);
            z81 z81Var = b91Var.y;
            Integer num = b91Var.n;
            r(z81Var, h02Var2, 0);
            mq2.y(h02Var2, mq4.j(g73Var, 12.0f));
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
            int iHashCode2 = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ2 = h02Var2.q();
            j73 j73VarW2 = m50.W(h02Var2, g73Var);
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            xs2.E(on0Var, h02Var2, ek0VarG);
            xs2.E(on0Var2, h02Var2, tr3VarQ2);
            du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
            xs2.E(on0Var4, h02Var2, j73VarW2);
            a91 a91Var = b91Var.g;
            a91Var.getClass();
            int iOrdinal = a91Var.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.diagnostics_step_play_store;
            } else if (iOrdinal == 1) {
                i2 = R.string.diagnostics_step_connection;
            } else if (iOrdinal == 2) {
                i2 = R.string.diagnostics_step_products;
            } else if (iOrdinal == 3) {
                i2 = R.string.diagnostics_step_purchases;
            } else {
                if (iOrdinal != 4) {
                    up.y();
                    return;
                }
                i2 = R.string.diagnostics_step_entitlement;
            }
            String strI2 = xs2.I(i2, h02Var2);
            vf1 vf1Var = of5.g;
            g75.y(strI2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).m, h02Var, 0, 0, 131070);
            h02Var2 = h02Var;
            Integer num2 = b91Var.r;
            if (num2 == null) {
                h02Var2.X(-1953701613);
                h02Var2.b(false);
            } else {
                h02Var2.X(-1953701612);
                int iIntValue = num2.intValue();
                if (num != null) {
                    h02Var2.X(-1388984784);
                    strI = xs2.J(iIntValue, new Object[]{num}, h02Var2);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(-1388893055);
                    strI = xs2.I(iIntValue, h02Var2);
                    h02Var2.b(false);
                }
                g75.y(strI, null, ((rj0) h02Var2.a(tj0.g)).u, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).q, h02Var, 0, 0, 131066);
                h02Var2 = h02Var;
                h02Var2.b(false);
            }
            h02Var2.b(true);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(b91Var, i, (byte) 23);
        }
    }

    public static final void n(c84 c84Var, my1 my1Var, my1 my1Var2, h02 h02Var, int i) {
        c84 c84Var2;
        int i2;
        g73 g73Var;
        c84 c84Var3;
        c84 c84Var4;
        float f;
        h02 h02Var2 = h02Var;
        h02Var2.Z(662199921);
        int i3 = i | (h02Var2.n(c84Var.ordinal()) ? 4 : 2) | (h02Var2.j(my1Var) ? 32 : 16) | (h02Var2.j(my1Var2) ? 256 : 128);
        if (h02Var2.N(i3 & 1, (i3 & 147) != 146)) {
            c84Var.getClass();
            switch (c84Var.ordinal()) {
                case 0:
                    i2 = R.string.diagnostics_verdict_pro_active;
                    break;
                case 1:
                    i2 = R.string.diagnostics_verdict_payment_pending;
                    break;
                case 2:
                    i2 = R.string.diagnostics_verdict_finalizing;
                    break;
                case 3:
                    i2 = R.string.diagnostics_verdict_nothing_found;
                    break;
                case 4:
                    i2 = R.string.diagnostics_verdict_unverified;
                    break;
                case 5:
                    i2 = R.string.message_error_billing_unavailable;
                    break;
                case 6:
                    i2 = R.string.diagnostics_verdict_play_unreachable;
                    break;
                default:
                    up.y();
                    return;
            }
            String strI = xs2.I(i2, h02Var2);
            vf1 vf1Var = of5.g;
            g75.y(strI, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).m, h02Var, 0, 0, 131070);
            h02Var2 = h02Var;
            g73 g73Var2 = g73.g;
            c84 c84Var5 = c84.q;
            c84 c84Var6 = c84.m;
            if (c84Var == c84Var6 || c84Var == c84Var5) {
                h02Var2.X(813556077);
                mq2.y(h02Var2, mq4.n(g73Var2, 8.0f));
                g73Var = g73Var2;
                c84Var3 = c84Var6;
                c84Var4 = c84Var5;
                g75.y(xs2.I(R.string.diagnostics_recovery_steps, h02Var2), null, ((rj0) h02Var2.a(tj0.g)).u, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).q, h02Var, 0, 0, 131066);
                h02Var2 = h02Var;
                h02Var2.b(false);
                f = 8.0f;
            } else {
                h02Var2.X(813805937);
                h02Var2.b(false);
                g73Var = g73Var2;
                c84Var4 = c84Var5;
                f = 8.0f;
                c84Var3 = c84Var6;
            }
            mq2.y(h02Var2, mq4.n(g73Var, f));
            c84Var2 = c84Var;
            if (c84Var2 == c84.t || c84Var2 == c84Var3 || c84Var2 == c84Var4) {
                h02Var2.X(813885638);
                c93.i(my1Var, mq4.r(g73Var, 1.0f), false, null, null, null, null, qz5.n, h02Var2, ((i3 >> 3) & 14) | 805306416, 508);
                h02Var2.b(false);
            } else {
                h02Var2.X(814142225);
                h02Var2.b(false);
            }
            switch (c84Var2.ordinal()) {
                case 0:
                case 1:
                    h02Var2.X(814364433);
                    h02Var2.b(false);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    h02Var2.X(814180882);
                    c93.i(my1Var2, mq4.r(g73Var, 1.0f), false, null, null, null, null, qz5.v, h02Var2, ((i3 >> 6) & 14) | 805306416, 508);
                    h02Var2.b(false);
                    break;
                default:
                    up.y();
                    return;
            }
        } else {
            c84Var2 = c84Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) c84Var2, (Object) my1Var, (jz1) my1Var2, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x03a0  */
    public static final void r(z81 z81Var, h02 h02Var, int i) {
        ha2 ha2VarY;
        ha2 ha2VarY2;
        int iOrdinal;
        boolean z;
        long j;
        boolean z2;
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1096471271);
        int i2 = (h02Var2.n(z81Var.ordinal()) ? 4 : 2) | i;
        if (h02Var2.N(i2 & 1, (i2 & 3) != 2)) {
            g73 g73Var = g73.g;
            j73 j73VarJ = mq4.j(g73Var, 20.0f);
            t33 t33VarR = z50.r(hi0.w, false);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarJ);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, t33VarR);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            if (z81Var == z81.t) {
                h02Var2.X(-1340782691);
                b04.g(mq4.j(g73Var, 14.0f), 0L, 2.0f, 0L, 0, 0.0f, h02Var, 390, 58);
                h02Var2 = h02Var;
                h02Var2.b(false);
                z2 = true;
            } else {
                h02Var2.X(-1340662690);
                int iOrdinal2 = z81Var.ordinal();
                if (iOrdinal2 == 2) {
                    ha2VarY = lb6.g;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Outlined.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3VarJ = du4.j(12.0f, 2.0f);
                        kq3VarJ.y(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        kq3VarJ.m(4.48f, 10.0f, 10.0f, 10.0f);
                        kq3VarJ.m(10.0f, -4.48f, 10.0f, -10.0f);
                        kq3VarJ.a(17.52f, 2.0f, 12.0f, 2.0f);
                        kq3VarJ.g();
                        kq3VarJ.j(12.0f, 20.0f);
                        kq3VarJ.r(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                        kq3VarJ.m(3.59f, -8.0f, 8.0f, -8.0f);
                        kq3VarJ.m(8.0f, 3.59f, 8.0f, 8.0f);
                        kq3VarJ.m(-3.59f, 8.0f, -8.0f, 8.0f);
                        kq3VarJ.g();
                        kq3VarJ.j(16.59f, 7.58f);
                        kq3VarJ.x(10.0f, 14.17f);
                        kq3VarJ.l(-2.59f, -2.58f);
                        kq3VarJ.x(6.0f, 13.0f);
                        kq3VarJ.l(4.0f, 4.0f);
                        kq3VarJ.l(8.0f, -8.0f);
                        kq3VarJ.g();
                        ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        lb6.g = ha2VarY;
                    }
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        ha2VarY2 = ke6.y;
                        if (ha2VarY2 == null) {
                            ga2 ga2Var2 = new ga2("Outlined.RadioButtonUnchecked", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = fj5.g;
                            cu4 cu4Var2 = new cu4(jj0.y);
                            kq3 kq3VarJ2 = du4.j(12.0f, 2.0f);
                            kq3VarJ2.y(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            kq3VarJ2.m(4.48f, 10.0f, 10.0f, 10.0f);
                            kq3VarJ2.m(10.0f, -4.48f, 10.0f, -10.0f);
                            kq3VarJ2.a(17.52f, 2.0f, 12.0f, 2.0f);
                            kq3VarJ2.g();
                            kq3VarJ2.j(12.0f, 20.0f);
                            kq3VarJ2.r(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                            kq3VarJ2.m(3.58f, -8.0f, 8.0f, -8.0f);
                            kq3VarJ2.m(8.0f, 3.58f, 8.0f, 8.0f);
                            kq3VarJ2.m(-3.58f, 8.0f, -8.0f, 8.0f);
                            kq3VarJ2.g();
                            ga2.g(ga2Var2, kq3VarJ2.g, 0, cu4Var2);
                            ha2VarY2 = ga2Var2.y();
                            ke6.y = ha2VarY2;
                        }
                    } else {
                        ha2VarY = jf6.r;
                        if (ha2VarY == null) {
                            ga2 ga2Var3 = new ga2("Outlined.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i5 = fj5.g;
                            cu4 cu4Var3 = new cu4(jj0.y);
                            kq3 kq3Var = new kq3();
                            kq3Var.j(11.0f, 15.0f);
                            kq3Var.v(2.0f);
                            kq3Var.w(2.0f);
                            kq3Var.v(-2.0f);
                            kq3Var.w(-2.0f);
                            kq3Var.g();
                            kq3Var.j(11.0f, 7.0f);
                            kq3Var.v(2.0f);
                            kq3Var.w(6.0f);
                            kq3Var.v(-2.0f);
                            kq3Var.x(11.0f, 7.0f);
                            kq3Var.g();
                            kq3Var.j(11.99f, 2.0f);
                            kq3Var.y(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            kq3Var.m(4.47f, 10.0f, 9.99f, 10.0f);
                            kq3Var.y(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                            kq3Var.a(17.52f, 2.0f, 11.99f, 2.0f);
                            kq3Var.g();
                            kq3Var.j(12.0f, 20.0f);
                            kq3Var.r(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                            kq3Var.m(3.58f, -8.0f, 8.0f, -8.0f);
                            kq3Var.m(8.0f, 3.58f, 8.0f, 8.0f);
                            kq3Var.m(-3.58f, 8.0f, -8.0f, 8.0f);
                            kq3Var.g();
                            ga2.g(ga2Var3, kq3Var.g, 0, cu4Var3);
                            ha2VarY = ga2Var3.y();
                            jf6.r = ha2VarY;
                        }
                    }
                    j73 j73VarJ2 = mq4.j(g73Var, 20.0f);
                    iOrdinal = z81Var.ordinal();
                    if (iOrdinal != 0 || iOrdinal == 1) {
                        z = false;
                        h02Var2.X(830182577);
                        j = ((rj0) h02Var2.a(tj0.g)).u;
                        h02Var2.b(false);
                    } else if (iOrdinal == 2) {
                        z = false;
                        h02Var2.X(830175240);
                        j = ((rj0) h02Var2.a(tj0.g)).g;
                        h02Var2.b(false);
                    } else if (iOrdinal == 3) {
                        z = false;
                        h02Var2.X(830177353);
                        j = ((rj0) h02Var2.a(tj0.g)).a;
                        h02Var2.b(false);
                    } else if (iOrdinal != 4) {
                        h02Var2.X(830173403);
                        h02Var2.b(false);
                        up.y();
                        return;
                    } else {
                        h02Var2.X(830179462);
                        j = ((rj0) h02Var2.a(tj0.g)).f;
                        z = false;
                        h02Var2.b(false);
                    }
                    t92.g(ha2VarY2, null, j73VarJ2, j, h02Var2, 432, 0);
                    h02Var2.b(z);
                    z2 = true;
                } else {
                    ha2VarY = gb6.l;
                    if (ha2VarY == null) {
                        ga2 ga2Var4 = new ga2("Outlined.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = fj5.g;
                        cu4 cu4Var4 = new cu4(jj0.y);
                        kq3 kq3Var2 = new kq3();
                        kq3Var2.j(1.0f, 21.0f);
                        kq3Var2.v(22.0f);
                        kq3Var2.x(12.0f, 2.0f);
                        kq3Var2.x(1.0f, 21.0f);
                        kq3Var2.g();
                        kq3Var2.j(13.0f, 18.0f);
                        kq3Var2.v(-2.0f);
                        kq3Var2.w(-2.0f);
                        kq3Var2.v(2.0f);
                        kq3Var2.w(2.0f);
                        kq3Var2.g();
                        du4.e(kq3Var2, 13.0f, 14.0f, -2.0f, -4.0f);
                        kq3Var2.v(2.0f);
                        kq3Var2.w(4.0f);
                        kq3Var2.g();
                        ga2.g(ga2Var4, kq3Var2.g, 0, cu4Var4);
                        ha2VarY = ga2Var4.y();
                        gb6.l = ha2VarY;
                    }
                }
                ha2VarY2 = ha2VarY;
                j73 j73VarJ3 = mq4.j(g73Var, 20.0f);
                iOrdinal = z81Var.ordinal();
                if (iOrdinal != 0) {
                    z = false;
                    h02Var2.X(830182577);
                    j = ((rj0) h02Var2.a(tj0.g)).u;
                    h02Var2.b(false);
                } else {
                    z = false;
                    h02Var2.X(830182577);
                    j = ((rj0) h02Var2.a(tj0.g)).u;
                    h02Var2.b(false);
                }
                t92.g(ha2VarY2, null, j73VarJ3, j, h02Var2, 432, 0);
                h02Var2.b(z);
                z2 = true;
            }
            h02Var2.b(z2);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(z81Var, i, (byte) 24);
        }
    }

    public static final void y(final w14 w14Var, final my1 my1Var, final my1 my1Var2, final my1 my1Var3, final my1 my1Var4, h02 h02Var, final int i) {
        nm0 nm0VarM0;
        w14Var.getClass();
        my1Var.getClass();
        my1Var2.getClass();
        my1Var3.getClass();
        my1Var4.getClass();
        h02Var.Z(2056952393);
        int i2 = (h02Var.j(w14Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(my1Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(my1Var4) ? 16384 : 8192;
        }
        int i3 = i2;
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            rf4 rf4VarO = gp4.O(h02Var);
            c84 c84Var = w14Var.y;
            byte b = 12;
            switch (c84Var == null ? -1 : v14.g[c84Var.ordinal()]) {
                case -1:
                case 5:
                case 6:
                case 7:
                    h02Var.X(-1923876739);
                    h02Var.b(false);
                    nm0VarM0 = null;
                    break;
                case 0:
                default:
                    up.y();
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                    h02Var.X(-1924045968);
                    nm0VarM0 = ue5.m0(-1524603234, new ys(my1Var, b), h02Var);
                    h02Var.b(false);
                    break;
            }
            yd6.y(my1Var4, ue5.m0(1789355643, new ys(my1Var4, (byte) 13), h02Var), null, nm0VarM0, null, qz5.r, ue5.m0(1755812886, new zy((Object) rf4VarO, (Object) w14Var, (Object) my1Var2, (Object) my1Var3, (byte) 6), h02Var), null, 0L, 0L, 0L, 0L, null, null, h02Var, ((i3 >> 12) & 14) | 1769520, 32660);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: u14
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ge6.y(w14Var, my1Var, my1Var2, my1Var3, my1Var4, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
