package defpackage;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hc6 {
    public static ha2 g;

    public static final void g(String str, j73 j73Var, k85 k85Var, long j, n85[] n85VarArr, h02 h02Var, int i) {
        j73 j73Var2;
        n85[] n85VarArr2;
        int i2;
        j73 j73Var3;
        n85[] n85VarArr3;
        str.getClass();
        h02Var.Z(-883868554);
        int i3 = i | (h02Var.x(str) ? 4 : 2) | 48 | (h02Var.x(k85Var) ? 256 : 128) | (h02Var.v(j) ? 2048 : 1024) | 8192;
        byte b = 0;
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                n85[] n85VarArr4 = {new n85(kq2.G(15)), new n85(kq2.G(12)), new n85(kq2.G(9))};
                i2 = i3 & (-57345);
                j73Var3 = g73.g;
                n85VarArr3 = n85VarArr4;
            } else {
                h02Var.Q();
                i2 = i3 & (-57345);
                j73Var3 = j73Var;
                n85VarArr3 = n85VarArr;
            }
            int i4 = i2;
            h02Var.s();
            q75 q75VarL = tx5.l(h02Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(null);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            boolean zJ = ((i4 & 14) == 4) | h02Var.j(n85VarArr3) | h02Var.x(q75VarL) | ((((i4 & 896) ^ 384) > 256 && h02Var.x(k85Var)) || (i4 & 384) == 256);
            Object objK2 = h02Var.K();
            if (zJ || objK2 == l76Var) {
                v80 v80Var = new v80((Serializable) str, (Object[]) n85VarArr3, (Object) q75VarL, (Object) k85Var, ob3Var, (byte) 2);
                h02Var.i0(v80Var);
                objK2 = v80Var;
            }
            j73 j73VarG = ra.G(j73Var3, (cz1) objK2);
            boolean z = (i4 & 7168) == 2048;
            Object objK3 = h02Var.K();
            if (z || objK3 == l76Var) {
                objK3 = new hi2(ob3Var, j, b);
                h02Var.i0(objK3);
            }
            ue5.v(j73VarG, (xy1) objK3, h02Var, 0);
            n85VarArr2 = n85VarArr3;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            n85VarArr2 = n85VarArr;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new gi2(str, j73Var2, k85Var, j, n85VarArr2, i);
        }
    }

    public static String j(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strA;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strA = "null";
            } else {
                try {
                    strA = obj.toString();
                } catch (Exception e) {
                    String strI = du4.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI), (Throwable) e);
                    strA = xi3.a("<", strI, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strA;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final ha2 l() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(19.0f, 6.41f);
        kq3Var.x(17.59f, 5.0f);
        kq3Var.x(12.0f, 10.59f);
        kq3Var.x(6.41f, 5.0f);
        kq3Var.x(5.0f, 6.41f);
        kq3Var.x(10.59f, 12.0f);
        kq3Var.x(5.0f, 17.59f);
        kq3Var.x(6.41f, 19.0f);
        kq3Var.x(12.0f, 13.41f);
        kq3Var.x(17.59f, 19.0f);
        kq3Var.x(19.0f, 17.59f);
        kq3Var.x(13.41f, 12.0f);
        kq3Var.x(19.0f, 6.41f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final void n(j73 j73Var, cn4 cn4Var, long j, zn3 zn3Var, nm0 nm0Var, h02 h02Var, int i) {
        cn4 cn4Var2;
        cn4 cn4Var3;
        h02Var.Z(738803211);
        int i2 = i | (h02Var.x(j73Var) ? 4 : 2) | 432 | (h02Var.v(j) ? 2048 : 1024) | (h02Var.x(zn3Var) ? 16384 : 8192);
        if (h02Var.N(i2 & 1, (599187 & i2) != 599186)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                cn4Var3 = yf2.b;
            } else {
                h02Var.Q();
                cn4Var3 = cn4Var;
            }
            h02Var.s();
            uz4.g(j73Var, cn4Var3, j, 0L, 0.0f, 0.0f, null, ue5.m0(-1867124656, new ta(zn3Var, nm0Var, (byte) 17), h02Var), h02Var, ((i2 >> 3) & 896) | (i2 & 14) | 12582960 | 1572864, 56);
            cn4Var2 = cn4Var3;
        } else {
            h02Var.Q();
            cn4Var2 = cn4Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new gi2(j73Var, cn4Var2, j, zn3Var, nm0Var, i);
        }
    }

    public static final void r(zf5 zf5Var, j73 j73Var, uj2 uj2Var, xy1 xy1Var, h02 h02Var, int i) {
        int i2;
        final float f;
        long j;
        j75 j75VarG;
        zf5 zf5Var2 = zf5Var;
        String str = zf5Var2.y;
        String str2 = zf5Var2.r;
        String str3 = zf5Var2.n;
        j73Var.getClass();
        uj2Var.getClass();
        boolean z = uj2Var.g;
        xy1Var.getClass();
        h02Var.Z(899240184);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(zf5Var2) : h02Var.j(zf5Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? h02Var.x(uj2Var) : h02Var.j(uj2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(xy1Var) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = kq2.M(Boolean.FALSE);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            j14 j14Var = tj0.g;
            long j2 = ((rj0) h02Var.a(j14Var)).g;
            long j3 = ((rj0) h02Var.a(j14Var)).y;
            boolean z2 = uj2Var.y || uj2Var.r;
            if (!z2 || !z || str3.length() <= 0) {
                if (!z2 || str2.length() <= 0) {
                    str3 = (!z || str.length() <= 0) ? zf5Var2.g : str;
                } else {
                    str3 = str2;
                }
            }
            q75 q75VarL = tx5.l(h02Var);
            j14 j14Var2 = hp0.j;
            float fE = ((j51) h02Var.a(j14Var2)).e(32.0f);
            final float fE2 = ((j51) h02Var.a(j14Var2)).e(64.0f);
            int iZ = k33.Z(2.0f * fE);
            int iZ2 = k33.Z(fE);
            if (!((iZ >= 0) & (iZ2 >= 0))) {
                oc2.g("width and height must be >= 0");
            }
            long j4 = zs0.j(iZ, iZ, iZ2, iZ2);
            long jG = kq2.G(30);
            long jG2 = kq2.G(12);
            long jG3 = kq2.G(2);
            k85 k85Var = new k85(j3, 0L, null, null, null, null, 0L, null, 3, 0L, 16744446);
            h02Var.X(-1744080703);
            float fR = n85.r(jG);
            long j5 = j4;
            float fR2 = n85.r(jG2);
            float fR3 = n85.r(jG3);
            while (true) {
                f = fE;
                if (fR < fR2) {
                    j = j2;
                    j75VarG = q75.g(q75VarL, new cj(str3), k85.g(k85Var, 0L, kq2.O(fR2, 4294967296L), null, null, 0L, 0L, null, 16777213), j5, 1980);
                    h02Var.b(false);
                    break;
                }
                float f2 = fR3;
                cj cjVar = new cj(str3);
                k85 k85Var2 = k85Var;
                k85 k85VarG = k85.g(k85Var2, 0L, kq2.O(fR, 4294967296L), null, null, 0L, 0L, null, 16777213);
                q75 q75Var = q75VarL;
                long j6 = j5;
                j75 j75VarG2 = q75.g(q75Var, cjVar, k85VarG, j6, 1980);
                j = j2;
                j5 = j6;
                long j7 = j75VarG2.r;
                if (((int) (j7 >> 32)) <= ws0.t(j5) && ((int) (4294967295L & j7)) <= ws0.j(j5) && !j75VarG2.n()) {
                    h02Var.b(false);
                    j75VarG = j75VarG2;
                    break;
                }
                fR -= f2;
                q75VarL = q75Var;
                k85Var = k85Var2;
                fE = f;
                fR3 = f2;
                j2 = j;
            }
            int i3 = i2 & 7168;
            boolean z3 = i3 == 2048;
            Object objK2 = h02Var.K();
            if (z3 || objK2 == obj) {
                objK2 = new y80((byte) 5, xy1Var, ob3Var);
                h02Var.i0(objK2);
            }
            my1 my1Var = (my1) objK2;
            boolean z4 = i3 == 2048;
            Object objK3 = h02Var.K();
            if (z4 || objK3 == obj) {
                objK3 = new d80((byte) 2, xy1Var, ob3Var);
                h02Var.i0(objK3);
            }
            xy1 xy1Var2 = (xy1) objK3;
            my1Var.getClass();
            xy1Var2.getClass();
            j73 j73VarG = b05.g(j73Var, og5.g, new uw0(my1Var, xy1Var2, (byte) 1));
            boolean zBooleanValue = ((Boolean) ob3Var.getValue()).booleanValue();
            j73 j73VarI = g73.g;
            if (zBooleanValue) {
                h02Var.X(881443972);
                final long j8 = j;
                boolean zV = h02Var.v(j8) | h02Var.r(f) | h02Var.r(fE2) | h02Var.j(j75VarG);
                Object objK4 = h02Var.K();
                if (zV || objK4 == obj) {
                    final j75 j75Var = j75VarG;
                    objK4 = new xy1() { // from class: ii2
                        @Override // defpackage.xy1
                        public final Object a(Object obj2) {
                            wm2 wm2Var = (wm2) obj2;
                            wm2Var.getClass();
                            wm2Var.g();
                            pb0 pb0Var = wm2Var.j;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (pb0Var.n() >> 32)) / 2.0f;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pb0Var.n() & 4294967295L)) / 2.0f;
                            float f3 = fE2;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - f3)) & 4294967295L);
                            long j9 = j8;
                            float f4 = f;
                            xd1.F(wm2Var, j9, f4, jFloatToRawIntBits, null, 120);
                            long jE0 = pb0Var.e0();
                            j75 j75Var2 = j75Var;
                            vx5.N(wm2Var, j75Var2, 0L, wi3.n(jE0, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits((((int) (j75Var2.r & 4294967295L)) / 2.0f) + f3)) & 4294967295L)), 250);
                            return og5.g;
                        }
                    };
                    h02Var.i0(objK4);
                }
                j73VarI = a11.i(j73VarI, (xy1) objK4);
                h02Var.b(false);
            } else {
                h02Var.X(881462400);
                h02Var.b(false);
            }
            j73 j73VarN = j73VarG.n(j73VarI);
            zf5Var2 = zf5Var;
            y(str3, j73VarN, zf5Var2.j, ((Boolean) ob3Var.getValue()).booleanValue(), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g6((Object) zf5Var2, j73Var, (Object) uj2Var, (jz1) xy1Var, i, (byte) 5);
        }
    }

    public static final void v(zf5 zf5Var, j73 j73Var, boolean z, xy1 xy1Var, h02 h02Var, int i) {
        j73Var.getClass();
        xy1Var.getClass();
        h02Var.Z(-273358703);
        int i2 = i | (h02Var.x(zf5Var) ? 4 : 2) | (h02Var.x(j73Var) ? 32 : 16) | (h02Var.l(z) ? 256 : 128) | (h02Var.j(xy1Var) ? 2048 : 1024);
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ob3 ob3VarQ = kq2.Q(Boolean.valueOf(z), h02Var);
            String str = zf5Var.g;
            int i3 = i2 & 7168;
            boolean zX = h02Var.x(ob3VarQ) | (i3 == 2048);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zX || objK == obj) {
                objK = new y80((byte) 6, xy1Var, ob3VarQ);
                h02Var.i0(objK);
            }
            my1 my1Var = (my1) objK;
            boolean z2 = i3 == 2048;
            Object objK2 = h02Var.K();
            if (z2 || objK2 == obj) {
                objK2 = new tf(xy1Var, (byte) 4);
                h02Var.i0(objK2);
            }
            xy1 xy1Var2 = (xy1) objK2;
            my1Var.getClass();
            xy1Var2.getClass();
            y(str, b05.g(j73Var, og5.g, new uw0(my1Var, xy1Var2, b)), zf5Var.j, z, h02Var, (i2 << 3) & 7168);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new yw(zf5Var, j73Var, z, xy1Var, i);
        }
    }

    public static final long x(xo3 xo3Var) {
        return k33.a0(((pp3) xo3Var.n.n).d() * xo3Var.i()) + (((long) xo3Var.m()) * ((long) xo3Var.i()));
    }

    public static final void y(String str, j73 j73Var, ag5 ag5Var, boolean z, h02 h02Var, int i) {
        int i2;
        long j;
        long j2;
        h02Var.Z(237663760);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (h02Var.x(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.n(ag5Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.l(z) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                h02Var.X(2135136607);
                j = jr2.u(h02Var).x;
                h02Var.b(false);
            } else {
                h02Var.X(2135207752);
                int iOrdinal = ag5Var.ordinal();
                if (iOrdinal == 0) {
                    h02Var.X(761616864);
                    j = jr2.u(h02Var).F;
                    h02Var.b(false);
                } else if (iOrdinal != 1) {
                    h02Var.X(761614330);
                    h02Var.b(false);
                    up.y();
                    return;
                } else {
                    h02Var.X(761619559);
                    j = jr2.u(h02Var).H;
                    h02Var.b(false);
                }
                h02Var.b(false);
            }
            if (z) {
                h02Var.X(2135447165);
                j2 = jr2.u(h02Var).l;
                h02Var.b(false);
            } else {
                h02Var.X(2135520015);
                int iOrdinal2 = ag5Var.ordinal();
                if (iOrdinal2 == 0) {
                    h02Var.X(761626944);
                    j2 = jr2.u(h02Var).u;
                    h02Var.b(false);
                } else if (iOrdinal2 != 1) {
                    h02Var.X(761624403);
                    h02Var.b(false);
                    up.y();
                    return;
                } else {
                    h02Var.X(761629632);
                    j2 = jr2.u(h02Var).u;
                    h02Var.b(false);
                }
                h02Var.b(false);
            }
            j73 j73VarN = mq4.v(j73Var, 48.0f, Float.NaN).n(mq4.y);
            bo3 bo3Var = b80.g;
            n(j73VarN, null, j, new bo3(4.0f, bo3Var.y, 4.0f, bo3Var.n), ue5.m0(780837749, new uk(str, j2, b), h02Var), h02Var, 1769472);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g81(str, j73Var, ag5Var, z, i);
        }
    }
}
