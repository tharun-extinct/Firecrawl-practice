package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import io.appground.blek.R;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gy3 {
    public static final o05 g = new o05(new yj2((byte) 7));

    public static final void g(int i, h02 h02Var) {
        h02Var.Z(125442040);
        if (h02Var.N(i & 1, i != 0)) {
            Context context = (Context) h02Var.a(sa.y);
            String strI = xs2.I(R.string.message_purchase_pending, h02Var);
            g73 g73Var = g73.g;
            g75.y(strI, ue5.i0(mq4.r(g73Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).m, h02Var, 48, 0, 130044);
            boolean zJ = h02Var.j(context);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new mn(context, (byte) 5);
                h02Var.i0(objK);
            }
            c93.i((my1) objK, mq4.r(g73Var, 1.0f), false, null, null, null, null, pz5.r, h02Var, 805306416, 508);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vq0(i, (byte) 11);
        }
    }

    public static final z14 l(b30 b30Var) {
        int iHashCode;
        b30Var.getClass();
        String str = b30Var.r.g.z;
        if (str == null || ((iHashCode = str.hashCode()) == 2114 ? !str.equals("BD") : !(iHashCode == 2153 ? str.equals("CL") : iHashCode == 2552 ? str.equals("PH") : iHashCode == 2686 && str.equals("TR")))) {
            return z14.j;
        }
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        return sharedPreferences.getLong("first_start_time", System.currentTimeMillis()) % 2 == 0 ? z14.t : z14.a;
    }

    public static final void n(lz3 lz3Var, boolean z, my1 my1Var, h02 h02Var, int i) {
        String strJ;
        h02Var.Z(-101872147);
        int i2 = (h02Var.x(lz3Var) ? 4 : 2) | i | (h02Var.l(z) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = lz3Var.l;
            String str = lz3Var.n;
            boolean z3 = lz3Var.t != null;
            if (z2) {
                h02Var.X(1669016418);
                strJ = xs2.J(z3 ? R.string.upgrade_start_subscription : R.string.upgrade_subscribe_price, new Object[]{str}, h02Var);
                h02Var.b(false);
            } else {
                h02Var.X(1669259024);
                strJ = xs2.J(R.string.upgrade_buy_one_time, new Object[]{str}, h02Var);
                h02Var.b(false);
            }
            int i3 = i2 >> 3;
            r(z, my1Var, ue5.i0(g73.g, 0.0f, 8.0f, 0.0f, 0.0f, 13), ue5.m0(-1654293618, new r80(lz3Var, z2, strJ), h02Var), h02Var, (i3 & 14) | 3456 | (i3 & 112));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r80(lz3Var, z, my1Var, i);
        }
    }

    public static final void r(boolean z, my1 my1Var, j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        my1 my1Var2;
        j73 j73Var2;
        h02 h02Var2 = h02Var;
        h02Var2.Z(1771232551);
        if ((i & 6) == 0) {
            i2 = (h02Var2.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            my1Var2 = my1Var;
            i2 |= h02Var2.j(my1Var2) ? 32 : 16;
        } else {
            my1Var2 = my1Var;
        }
        if ((i & 384) == 0) {
            j73Var2 = j73Var;
            i2 |= h02Var2.x(j73Var2) ? 256 : 128;
        } else {
            j73Var2 = j73Var;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var2.j(nm0Var) ? 2048 : 1024;
        }
        if (!h02Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            h02Var2.Q();
        } else if (z) {
            h02Var2.X(-1179111047);
            int i3 = i2 >> 3;
            c93.x(my1Var2, j73Var2, false, null, null, null, null, null, ue5.m0(-366686596, new qh(nm0Var, (byte) 3), h02Var2), h02Var2, (i3 & 14) | 805306368 | (i3 & 112), 508);
            h02Var2 = h02Var2;
            h02Var2.b(false);
        } else {
            h02Var2.X(-1178975887);
            int i4 = i2 >> 3;
            c93.i(my1Var, j73Var, false, null, null, null, null, ue5.m0(1849957713, new qh(nm0Var, (byte) 4), h02Var2), h02Var2, (i4 & 14) | 805306368 | (i4 & 112), 508);
            h02Var2.b(false);
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new g81(z, my1Var, j73Var, nm0Var, i);
        }
    }

    public static final void v(int i, int i2, h02 h02Var) {
        h02Var.Z(-1902421421);
        int i3 = (h02Var.n(i) ? 4 : 2) | i2;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            g75.y(xs2.I(i, h02Var), ue5.i0(mq4.r(g73.g, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((rj0) h02Var.a(tj0.g)).f, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).m, h02Var, 48, 0, 130040);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xy0(i, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0292  */
    /* JADX WARN: Code duplicated, block: B:102:0x0294  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0337  */
    /* JADX WARN: Code duplicated, block: B:124:0x035d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0361  */
    /* JADX WARN: Code duplicated, block: B:127:0x038b  */
    /* JADX WARN: Code duplicated, block: B:129:0x038e  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0252  */
    /* JADX WARN: Code duplicated, block: B:93:0x026d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0281  */
    /* JADX WARN: Code duplicated, block: B:97:0x0287  */
    /* JADX WARN: Code duplicated, block: B:98:0x0289  */
    public static final void x(final lz3[] lz3VarArr, fz3 fz3Var, boolean z, boolean z2, boolean z3, my1 my1Var, final xy1 xy1Var, h02 h02Var, final int i, final int i2) {
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        my1 my1Var2;
        int i10;
        int i11;
        boolean z6;
        final fz3 fz3Var2;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final my1 my1Var3;
        u34 u34VarP;
        fz3 fz3Var3;
        boolean z10;
        boolean z11;
        l76 l76Var;
        my1 my1Var4;
        g73 g73Var;
        fz3 fz3Var4;
        boolean z12;
        int length;
        int i12;
        int i13;
        my1 my1Var5;
        boolean z13;
        int iOrdinal;
        lz3 lz3Var;
        boolean z14;
        boolean z15;
        boolean zJ;
        Object objK;
        Object objK2;
        int i14;
        h02 h02Var2 = h02Var;
        lz3VarArr.getClass();
        xy1Var.getClass();
        h02Var2.Z(-523190937);
        int i15 = (h02Var2.j(lz3VarArr) ? 4 : 2) | i;
        int i16 = i2 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i & 48) == 0) {
            i15 |= h02Var2.n(fz3Var == null ? -1 : fz3Var.ordinal()) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                z4 = z;
                i15 |= h02Var2.l(z4) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i15 | 3072;
                z5 = z2;
            } else {
                z5 = z2;
                if (h02Var2.l(z5)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 = i15 | i4;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                i8 = i5 | 24576;
            } else {
                if (h02Var2.l(z3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i8 = i5 | i7;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                i11 = i8 | 196608;
                my1Var2 = my1Var;
            } else {
                my1Var2 = my1Var;
                if (h02Var2.j(my1Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i11 = i8 | i10;
            }
            if ((1572864 & i) == 0) {
                if (h02Var2.j(xy1Var)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i11 |= i14;
            }
            if ((599187 & i11) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (h02Var2.N(i11 & 1, z6)) {
                if (i16 != 0) {
                    fz3Var3 = fz3.t;
                } else {
                    fz3Var3 = fz3Var;
                }
                if (i17 != 0) {
                    z4 = false;
                }
                if (i3 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                if (i6 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                l76Var = oo0.g;
                if (i9 != 0) {
                    objK2 = h02Var2.K();
                    if (objK2 == l76Var) {
                        objK2 = new yj2((byte) 8);
                        h02Var2.i0(objK2);
                    }
                    my1Var4 = (my1) objK2;
                } else {
                    my1Var4 = my1Var2;
                }
                g73Var = g73.g;
                j73 j73VarP = gp4.P(gc6.y(ue5.i0(g73Var, 24.0f, 0.0f, 24.0f, 0.0f, 10)), gp4.O(h02Var2), true);
                ek0 ek0VarG = ck0.g(new yq(4.0f, true, new l0((byte) 2)), hi0.o, h02Var2, 54);
                int iHashCode = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ = h02Var2.q();
                j73 j73VarW = m50.W(h02Var2, j73VarP);
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
                h02Var2.X(828422699);
                xs2.y(ue5.i0(yf2.M(g73Var, 1.5f, 1.5f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1048572), 0.0f, 8.0f, 0.0f, 0.0f, 13), h02Var2, 6, 0);
                mq2.y(h02Var2, mq4.n(g73Var, 12.0f));
                fz3Var4 = fz3Var3;
                z12 = false;
                g75.y(xs2.I(R.string.dialog_premium_upgrade_title, h02Var2), mq4.r(g73Var, 1.0f), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, k85.g(((mf5) h02Var2.a(of5.g)).l, ((rj0) h02Var2.a(tj0.g)).g, 0L, qv1.h, null, 0L, 0L, null, 16777210), h02Var, 48, 0, 130044);
                h02Var2 = h02Var;
                y13.y(xs2.I(R.string.dialog_premium_upgrade_message, h02Var2), ue5.i0(g73Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), pz5.g, h02Var2, 432, 0);
                if (z4) {
                    h02Var2.X(829252723);
                    mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                    g(0, h02Var2);
                    h02Var2.b(false);
                    h02Var2.b(false);
                    my1Var5 = my1Var4;
                } else {
                    h02Var2.X(829373809);
                    h02Var2.b(false);
                    h02Var2.X(-804528711);
                    length = lz3VarArr.length;
                    i12 = 0;
                    i13 = 0;
                    while (i13 < length) {
                        lz3Var = lz3VarArr[i13];
                        int i18 = i12 + 1;
                        if (i12 == 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if ((i11 & 3670016) == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zJ = z15 | h02Var2.j(lz3Var);
                        objK = h02Var2.K();
                        if (zJ || objK == l76Var) {
                            objK = new o82((Object) xy1Var, (Object) lz3Var, (byte) 9);
                            h02Var2.i0(objK);
                        }
                        n(lz3Var, z14, (my1) objK, h02Var2, 0);
                        i13++;
                        i12 = i18;
                        z12 = false;
                    }
                    h02Var2.b(z12);
                    if (lz3VarArr.length == 0) {
                        h02Var2.X(829887789);
                        mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                        iOrdinal = fz3Var4.ordinal();
                        if (iOrdinal != 0 || iOrdinal == 1) {
                            my1Var5 = my1Var4;
                            h02Var2.X(-804508332);
                            b04.g(ue5.e0(g73Var, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, h02Var, 6, 62);
                            h02Var2 = h02Var;
                            z13 = false;
                            h02Var2.b(false);
                        } else if (iOrdinal == 2) {
                            h02Var2.X(830200052);
                            v(R.string.message_error_price_unavailable, 0, h02Var2);
                            my1 my1Var6 = my1Var4;
                            c93.x(my1Var6, mq4.r(g73Var, 1.0f), false, null, null, null, null, null, pz5.y, h02Var, ((i11 >> 15) & 14) | 805306416, 508);
                            my1Var5 = my1Var6;
                            h02Var2 = h02Var;
                            z13 = false;
                            h02Var2.b(false);
                        } else if (iOrdinal != 3) {
                            h02Var2.X(-804511352);
                            h02Var2.b(false);
                            up.y();
                            return;
                        } else {
                            h02Var2.X(-804489170);
                            z13 = false;
                            v(R.string.message_error_billing_unavailable, 0, h02Var2);
                            h02Var2.b(false);
                            my1Var5 = my1Var4;
                        }
                        h02Var2.b(z13);
                    } else {
                        my1Var5 = my1Var4;
                        if (z10) {
                            h02Var2.X(830753991);
                            mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                            b04.g(ue5.e0(g73Var, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, h02Var, 6, 62);
                            h02Var2 = h02Var;
                            z13 = false;
                            h02Var2.b(false);
                        } else {
                            z13 = false;
                            if (z11) {
                                h02Var2.X(830914571);
                                mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                                v(R.string.message_error_purchase_failed, 0, h02Var2);
                                h02Var2.b(false);
                            } else {
                                h02Var2.X(831043345);
                                h02Var2.b(false);
                            }
                        }
                    }
                    h02Var2.b(z13);
                }
                h02Var2.b(true);
                z9 = z10;
                z8 = z4;
                z7 = z11;
                my1Var3 = my1Var5;
                fz3Var2 = fz3Var4;
            } else {
                h02Var2.Q();
                fz3Var2 = fz3Var;
                z7 = z3;
                z8 = z4;
                z9 = z5;
                my1Var3 = my1Var2;
            }
            u34VarP = h02Var2.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: dy3
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gy3.x(lz3VarArr, fz3Var2, z8, z9, z7, my1Var3, xy1Var, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i15 |= 384;
        z4 = z;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i15 | 3072;
            z5 = z2;
        } else {
            z5 = z2;
            if (h02Var2.l(z5)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i15 | i4;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            i8 = i5 | 24576;
        } else {
            if (h02Var2.l(z3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i8 = i5 | i7;
        }
        i9 = i2 & 32;
        if (i9 != 0) {
            i11 = i8 | 196608;
            my1Var2 = my1Var;
        } else {
            my1Var2 = my1Var;
            if (h02Var2.j(my1Var2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i11 = i8 | i10;
        }
        if ((1572864 & i) == 0) {
            if (h02Var2.j(xy1Var)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((599187 & i11) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (h02Var2.N(i11 & 1, z6)) {
            if (i16 != 0) {
                fz3Var3 = fz3.t;
            } else {
                fz3Var3 = fz3Var;
            }
            if (i17 != 0) {
                z4 = false;
            }
            if (i3 != 0) {
                z10 = false;
            } else {
                z10 = z5;
            }
            if (i6 != 0) {
                z11 = false;
            } else {
                z11 = z3;
            }
            l76Var = oo0.g;
            if (i9 != 0) {
                objK2 = h02Var2.K();
                if (objK2 == l76Var) {
                    objK2 = new yj2((byte) 8);
                    h02Var2.i0(objK2);
                }
                my1Var4 = (my1) objK2;
            } else {
                my1Var4 = my1Var2;
            }
            g73Var = g73.g;
            j73 j73VarP2 = gp4.P(gc6.y(ue5.i0(g73Var, 24.0f, 0.0f, 24.0f, 0.0f, 10)), gp4.O(h02Var2), true);
            ek0 ek0VarG2 = ck0.g(new yq(4.0f, true, new l0((byte) 2)), hi0.o, h02Var2, 54);
            int iHashCode2 = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ2 = h02Var2.q();
            j73 j73VarW2 = m50.W(h02Var2, j73VarP2);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG2);
            xs2.E(tg1.q, h02Var2, tr3VarQ2);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode2));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW2);
            h02Var2.X(828422699);
            xs2.y(ue5.i0(yf2.M(g73Var, 1.5f, 1.5f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1048572), 0.0f, 8.0f, 0.0f, 0.0f, 13), h02Var2, 6, 0);
            mq2.y(h02Var2, mq4.n(g73Var, 12.0f));
            fz3Var4 = fz3Var3;
            z12 = false;
            g75.y(xs2.I(R.string.dialog_premium_upgrade_title, h02Var2), mq4.r(g73Var, 1.0f), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, k85.g(((mf5) h02Var2.a(of5.g)).l, ((rj0) h02Var2.a(tj0.g)).g, 0L, qv1.h, null, 0L, 0L, null, 16777210), h02Var, 48, 0, 130044);
            h02Var2 = h02Var;
            y13.y(xs2.I(R.string.dialog_premium_upgrade_message, h02Var2), ue5.i0(g73Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), pz5.g, h02Var2, 432, 0);
            if (z4) {
                h02Var2.X(829252723);
                mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                g(0, h02Var2);
                h02Var2.b(false);
                h02Var2.b(false);
                my1Var5 = my1Var4;
            } else {
                h02Var2.X(829373809);
                h02Var2.b(false);
                h02Var2.X(-804528711);
                length = lz3VarArr.length;
                i12 = 0;
                i13 = 0;
                while (i13 < length) {
                    lz3Var = lz3VarArr[i13];
                    int i19 = i12 + 1;
                    if (i12 == 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if ((i11 & 3670016) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zJ = z15 | h02Var2.j(lz3Var);
                    objK = h02Var2.K();
                    if (zJ) {
                        objK = new o82((Object) xy1Var, (Object) lz3Var, (byte) 9);
                        h02Var2.i0(objK);
                    } else {
                        objK = new o82((Object) xy1Var, (Object) lz3Var, (byte) 9);
                        h02Var2.i0(objK);
                    }
                    n(lz3Var, z14, (my1) objK, h02Var2, 0);
                    i13++;
                    i12 = i19;
                    z12 = false;
                }
                h02Var2.b(z12);
                if (lz3VarArr.length == 0) {
                    h02Var2.X(829887789);
                    mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                    iOrdinal = fz3Var4.ordinal();
                    if (iOrdinal != 0) {
                        my1Var5 = my1Var4;
                        h02Var2.X(-804508332);
                        b04.g(ue5.e0(g73Var, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, h02Var, 6, 62);
                        h02Var2 = h02Var;
                        z13 = false;
                        h02Var2.b(false);
                    } else {
                        my1Var5 = my1Var4;
                        h02Var2.X(-804508332);
                        b04.g(ue5.e0(g73Var, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, h02Var, 6, 62);
                        h02Var2 = h02Var;
                        z13 = false;
                        h02Var2.b(false);
                    }
                    h02Var2.b(z13);
                } else {
                    my1Var5 = my1Var4;
                    if (z10) {
                        h02Var2.X(830753991);
                        mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                        b04.g(ue5.e0(g73Var, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, h02Var, 6, 62);
                        h02Var2 = h02Var;
                        z13 = false;
                        h02Var2.b(false);
                    } else {
                        z13 = false;
                        if (z11) {
                            h02Var2.X(830914571);
                            mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                            v(R.string.message_error_purchase_failed, 0, h02Var2);
                            h02Var2.b(false);
                        } else {
                            h02Var2.X(831043345);
                            h02Var2.b(false);
                        }
                    }
                }
                h02Var2.b(z13);
            }
            h02Var2.b(true);
            z9 = z10;
            z8 = z4;
            z7 = z11;
            my1Var3 = my1Var5;
            fz3Var2 = fz3Var4;
        } else {
            h02Var2.Q();
            fz3Var2 = fz3Var;
            z7 = z3;
            z8 = z4;
            z9 = z5;
            my1Var3 = my1Var2;
        }
        u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: dy3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gy3.x(lz3VarArr, fz3Var2, z8, z9, z7, my1Var3, xy1Var, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final void y(final b30 b30Var, my1 my1Var, z14 z14Var, final String str, h02 h02Var, int i) {
        boolean z;
        boolean z2;
        Object qcVar;
        b30Var.getClass();
        v20 v20Var = b30Var.r;
        my1Var.getClass();
        str.getClass();
        h02Var.Z(2111641152);
        int i2 = (h02Var.j(b30Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        int i3 = i2 | (h02Var.n(z14Var.ordinal()) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= h02Var.x(str) ? 2048 : 1024;
        }
        int i4 = i3;
        if (h02Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            yl0 yl0VarF = gp4.F((Context) h02Var.a(sa.y));
            String str2 = v20.r;
            ob3 ob3VarL = v13.l(b30Var.v(str2), null, h02Var, 48, 2);
            ob3 ob3VarL2 = v13.l(b30Var.v("premium_yearly"), null, h02Var, 48, 2);
            boolean zX = h02Var.x((jz3) ob3VarL2.getValue()) | h02Var.x((jz3) ob3VarL.getValue()) | ((i4 & 896) == 256);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zX || objK == obj) {
                objK = pt4.y(new lt((Object) z14Var, (Object) ob3VarL, (Object) ob3VarL2, (byte) 13));
                h02Var.i0(objK);
            }
            bw4 bw4Var = (bw4) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = UUID.randomUUID();
                h02Var.i0(objK2);
            }
            final UUID uuid = (UUID) objK2;
            yl0 yl0Var = yl0VarF;
            ob3 ob3VarL3 = v13.l(pw5.j(v20Var.g.E), fz3.j, h02Var, 48, 2);
            v20Var.getClass();
            str2.getClass();
            w10 w10Var = v20Var.g;
            w10Var.getClass();
            HashMap map = w10Var.h;
            Object obj2 = map.get(str2);
            obj2.getClass();
            j10 j10Var = new j10((ew4) obj2, (byte) 0);
            Object obj3 = map.get("premium_yearly");
            obj3.getClass();
            qs1 qs1Var = new qs1(j10Var, new j10((ew4) obj3, (byte) 0), new t20(3, null, (byte) 1), (byte) 0);
            Boolean bool = Boolean.FALSE;
            ob3 ob3VarL4 = v13.l(qs1Var, bool, h02Var, 48, 2);
            if (((Boolean) ob3VarL4.getValue()).booleanValue() || ((lz3[]) bw4Var.getValue()).length == 0) {
                uuid = uuid;
                yl0Var = yl0Var;
                z = false;
                h02Var.X(-481776638);
                h02Var.b(false);
            } else {
                h02Var.X(-482078392);
                boolean zJ = ((i4 & 7168) == 2048) | ((i4 & 14) == 4 || h02Var.j(b30Var)) | h02Var.j(uuid) | h02Var.x(ob3VarL) | h02Var.x(ob3VarL2);
                Object objK3 = h02Var.K();
                if (zJ || objK3 == obj) {
                    qcVar = new qc(b30Var, str, uuid, ob3VarL, ob3VarL2, (byte) 8);
                    h02Var.i0(qcVar);
                } else {
                    qcVar = objK3;
                }
                k33.j(uuid, (xy1) qcVar, h02Var);
                z = false;
                h02Var.b(false);
            }
            boolean zX2 = h02Var.x(uuid);
            Object objK4 = h02Var.K();
            if (zX2 || objK4 == obj) {
                objK4 = Long.valueOf(SystemClock.elapsedRealtime());
                h02Var.i0(objK4);
            }
            final long jLongValue = ((Number) objK4).longValue();
            final ob3 ob3VarQ = kq2.Q(Boolean.valueOf(!(((lz3[]) bw4Var.getValue()).length == 0 ? true : z)), h02Var);
            Boolean bool2 = (Boolean) ob3VarL4.getValue();
            bool2.getClass();
            final ob3 ob3VarQ2 = kq2.Q(bool2, h02Var);
            int i5 = i4 & 14;
            int i6 = i4 & 7168;
            boolean zX3 = h02Var.x(ob3VarQ2) | h02Var.x(ob3VarQ) | (i5 == 4 || h02Var.j(b30Var)) | h02Var.j(uuid) | h02Var.v(jLongValue) | (i6 == 2048);
            Object objK5 = h02Var.K();
            if (zX3 || objK5 == obj) {
                z2 = false;
                objK5 = new xy1() { // from class: cy3
                    @Override // defpackage.xy1
                    public final Object a(Object obj4) {
                        ((wa1) obj4).getClass();
                        return new fy3(b30Var, uuid, jLongValue, str, ob3VarQ2, ob3VarQ);
                    }
                };
                h02Var.i0(objK5);
            } else {
                z2 = false;
            }
            k33.j(uuid, (xy1) objK5, h02Var);
            Object objK6 = h02Var.K();
            if (objK6 == obj) {
                objK6 = k33.E(h02Var);
                h02Var.i0(objK6);
            }
            ox0 ox0Var = (ox0) objK6;
            Object objK7 = h02Var.K();
            if (objK7 == obj) {
                objK7 = kq2.M(bool);
                h02Var.i0(objK7);
            }
            ob3 ob3Var = (ob3) objK7;
            Object objK8 = h02Var.K();
            if (objK8 == obj) {
                objK8 = kq2.M(bool);
                h02Var.i0(objK8);
            }
            ob3 ob3Var2 = (ob3) objK8;
            lz3[] lz3VarArr = (lz3[]) bw4Var.getValue();
            fz3 fz3Var = (fz3) ob3VarL3.getValue();
            boolean zBooleanValue = ((Boolean) ob3VarL4.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ob3Var.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) ob3Var2.getValue()).booleanValue();
            boolean z3 = (i5 == 4 || h02Var.j(b30Var)) ? true : z2;
            Object objK9 = h02Var.K();
            if (z3 || objK9 == obj) {
                objK9 = new o82((Object) b30Var, (Object) ob3Var2, (byte) 8);
                h02Var.i0(objK9);
            }
            my1 my1Var2 = (my1) objK9;
            boolean zJ2 = h02Var.j(ox0Var) | ((i5 == 4 || h02Var.j(b30Var)) ? true : z2) | h02Var.j(yl0Var) | h02Var.j(uuid) | (i6 == 2048 ? true : z2) | ((i4 & 112) != 32 ? z2 : true);
            Object objK10 = h02Var.K();
            if (zJ2 || objK10 == obj) {
                Object wd0Var = new wd0(ox0Var, ob3Var, ob3Var2, b30Var, yl0Var, uuid, str, my1Var);
                h02Var.i0(wd0Var);
                objK10 = wd0Var;
            }
            x(lz3VarArr, fz3Var, zBooleanValue, zBooleanValue2, zBooleanValue3, my1Var2, (xy1) objK10, h02Var, 0, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ws(b30Var, my1Var, z14Var, str, i, (byte) 2);
        }
    }
}
