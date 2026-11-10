package defpackage;

import io.appground.blek.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vx5 {
    public static int A(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ly2 ly2Var = (ly2) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            iJ = L(bArr, iJ, crVar);
            ly2Var.y(crVar.y);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int B(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ce2 ce2Var = (ce2) df2Var;
        int iJ = J(bArr, i2, crVar);
        ce2Var.y(ri0.y(crVar.g));
        while (iJ < i3) {
            int iJ2 = J(bArr, iJ, crVar);
            if (i != crVar.g) {
                break;
            }
            iJ = J(bArr, iJ2, crVar);
            ce2Var.y(ri0.y(crVar.g));
        }
        return iJ;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ly2 ly2Var = (ly2) df2Var;
        int iL = L(bArr, i2, crVar);
        ly2Var.y(ri0.r(crVar.y));
        while (iL < i3) {
            int iJ = J(bArr, iL, crVar);
            if (i != crVar.g) {
                break;
            }
            iL = L(bArr, iJ, crVar);
            ly2Var.y(ri0.r(crVar.y));
        }
        return iL;
    }

    public static int D(byte[] bArr, int i, cr crVar) throws hg2 {
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g;
        if (i2 < 0) {
            throw hg2.n();
        }
        if (i2 == 0) {
            crVar.r = "";
            return iJ;
        }
        crVar.r = new String(bArr, iJ, i2, ff2.g);
        return iJ + i2;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) throws hg2 {
        int iJ = J(bArr, i2, crVar);
        int i4 = crVar.g;
        if (i4 < 0) {
            throw hg2.n();
        }
        if (i4 == 0) {
            df2Var.add("");
        } else {
            df2Var.add(new String(bArr, iJ, i4, ff2.g));
            iJ += i4;
        }
        while (iJ < i3) {
            int iJ2 = J(bArr, iJ, crVar);
            if (i != crVar.g) {
                break;
            }
            iJ = J(bArr, iJ2, crVar);
            int i5 = crVar.g;
            if (i5 < 0) {
                throw hg2.n();
            }
            if (i5 == 0) {
                df2Var.add("");
            } else {
                df2Var.add(new String(bArr, iJ, i5, ff2.g));
                iJ += i5;
            }
        }
        return iJ;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) throws hg2 {
        int iJ = J(bArr, i2, crVar);
        int i4 = crVar.g;
        if (i4 < 0) {
            throw hg2.n();
        }
        if (i4 == 0) {
            df2Var.add("");
        } else {
            int i5 = iJ + i4;
            if (!ei5.v(bArr, iJ, i5)) {
                throw hg2.y();
            }
            df2Var.add(new String(bArr, iJ, i4, ff2.g));
            iJ = i5;
        }
        while (iJ < i3) {
            int iJ2 = J(bArr, iJ, crVar);
            if (i != crVar.g) {
                break;
            }
            iJ = J(bArr, iJ2, crVar);
            int i6 = crVar.g;
            if (i6 < 0) {
                throw hg2.n();
            }
            if (i6 == 0) {
                df2Var.add("");
            } else {
                int i7 = iJ + i6;
                if (!ei5.v(bArr, iJ, i7)) {
                    throw hg2.y();
                }
                df2Var.add(new String(bArr, iJ, i6, ff2.g));
                iJ = i7;
            }
        }
        return iJ;
    }

    public static int G(byte[] bArr, int i, cr crVar) throws hg2 {
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g;
        if (i2 < 0) {
            throw hg2.n();
        }
        if (i2 == 0) {
            crVar.r = "";
            return iJ;
        }
        crVar.r = ei5.g.y(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int H(int i, byte[] bArr, int i2, int i3, pg5 pg5Var, cr crVar) throws hg2 {
        if ((i >>> 3) == 0) {
            throw hg2.g();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iL = L(bArr, i2, crVar);
            pg5Var.n(i, Long.valueOf(crVar.y));
            return iL;
        }
        if (i4 == 1) {
            pg5Var.n(i, Long.valueOf(q(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = J(bArr, i2, crVar);
            int i5 = crVar.g;
            if (i5 < 0) {
                throw hg2.n();
            }
            if (i5 > bArr.length - iJ) {
                throw hg2.x();
            }
            if (i5 == 0) {
                pg5Var.n(i, ea0.t);
            } else {
                pg5Var.n(i, ea0.n(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw hg2.g();
            }
            pg5Var.n(i, Integer.valueOf(a(i2, bArr)));
            return i2 + 4;
        }
        pg5 pg5VarR = pg5.r();
        int i6 = (i & (-8)) | 4;
        int i7 = crVar.n + 1;
        crVar.n = i7;
        if (i7 >= 100) {
            throw new hg2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iJ2 = J(bArr, i2, crVar);
            i8 = crVar.g;
            if (i8 == i6) {
                i2 = iJ2;
                break;
            }
            i2 = H(i8, bArr, iJ2, i3, pg5VarR, crVar);
        }
        crVar.n--;
        if (i2 > i3 || i8 != i6) {
            throw hg2.v();
        }
        pg5Var.n(i, pg5VarR);
        return i2;
    }

    public static int I(int i, byte[] bArr, int i2, cr crVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            crVar.g = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            crVar.g = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            crVar.g = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            crVar.g = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                crVar.g = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int J(byte[] bArr, int i, cr crVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return I(b, bArr, i2, crVar);
        }
        crVar.g = b;
        return i2;
    }

    public static int K(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ce2 ce2Var = (ce2) df2Var;
        int iJ = J(bArr, i2, crVar);
        ce2Var.y(crVar.g);
        while (iJ < i3) {
            int iJ2 = J(bArr, iJ, crVar);
            if (i != crVar.g) {
                break;
            }
            iJ = J(bArr, iJ2, crVar);
            ce2Var.y(crVar.g);
        }
        return iJ;
    }

    public static int L(byte[] bArr, int i, cr crVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            crVar.y = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        crVar.y = j2;
        return i3;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ly2 ly2Var = (ly2) df2Var;
        int iL = L(bArr, i2, crVar);
        ly2Var.y(crVar.y);
        while (iL < i3) {
            int iJ = J(bArr, iL, crVar);
            if (i != crVar.g) {
                break;
            }
            iL = L(bArr, iJ, crVar);
            ly2Var.y(crVar.y);
        }
        return iL;
    }

    public static void N(xd1 xd1Var, j75 j75Var, long j, long j2, int i) {
        h93 h93Var = j75Var.y;
        i75 i75Var = j75Var.g;
        long jY = (i & 2) != 0 ? jj0.j : j;
        ju4 ju4Var = i75Var.y.g;
        ym4 ym4Var = ju4Var.c;
        l45 l45Var = ju4Var.w;
        yd1 yd1Var = ju4Var.b;
        ro roVarE = xd1Var.E();
        long jG = roVarE.G();
        roVarE.b().q();
        try {
            y22 y22Var = (y22) roVarE.t;
            y22Var.D(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            if (j75Var.n() && i75Var.x != 3) {
                long j3 = j75Var.r;
                ((ro) y22Var.t).b().x(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            k85 k85Var = i75Var.y;
            z60 z60VarR = k85Var.g.g.r();
            if (z60VarR == null || jY != 16) {
                nb0 nb0VarB = xd1Var.E().b();
                if (jY == 16) {
                    jY = k85Var.y();
                }
                h93Var.t(nb0VarB, kh6.x(Float.NaN, jY), ym4Var, l45Var, yd1Var);
            } else {
                q62.v(h93Var, xd1Var.E().b(), z60VarR, Float.isNaN(Float.NaN) ? k85Var.g.g.g() : Float.NaN, ym4Var, l45Var, yd1Var);
            }
        } finally {
            du4.d(roVarE, jG);
        }
    }

    public static int O(Object obj, le4 le4Var, byte[] bArr, int i, int i2, int i3, cr crVar) throws hg2 {
        o53 o53Var = (o53) le4Var;
        int i4 = crVar.n + 1;
        crVar.n = i4;
        if (i4 >= 100) {
            throw new hg2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iD = o53Var.D(obj, bArr, i, i2, i3, crVar);
        crVar.n--;
        crVar.r = obj;
        return iD;
    }

    public static int P(Object obj, le4 le4Var, byte[] bArr, int i, int i2, cr crVar) throws hg2 {
        int I = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            I = I(i3, bArr, I, crVar);
            i3 = crVar.g;
        }
        int i4 = I;
        if (i3 < 0 || i3 > i2 - i4) {
            throw hg2.x();
        }
        int i5 = crVar.n + 1;
        crVar.n = i5;
        if (i5 >= 100) {
            throw new hg2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        le4Var.t(obj, bArr, i4, i6, crVar);
        crVar.n--;
        crVar.r = obj;
        return i6;
    }

    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int b(le4 le4Var, int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) throws hg2 {
        int i4 = (i & (-8)) | 4;
        b12 b12VarN = le4Var.n();
        int iO = O(b12VarN, le4Var, bArr, i2, i3, i4, crVar);
        le4Var.y(b12VarN);
        crVar.r = b12VarN;
        df2Var.add(b12VarN);
        while (iO < i3) {
            int iJ = J(bArr, iO, crVar);
            if (i != crVar.g) {
                break;
            }
            b12 b12VarN2 = le4Var.n();
            iO = O(b12VarN2, le4Var, bArr, iJ, i3, i4, crVar);
            le4Var.y(b12VarN2);
            crVar.r = b12VarN2;
            df2Var.add(b12VarN2);
        }
        return iO;
    }

    public static float c(int i, byte[] bArr) {
        return Float.intBitsToFloat(a(i, bArr));
    }

    public static int d(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ly2 ly2Var = (ly2) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            iJ = L(bArr, iJ, crVar);
            ly2Var.y(ri0.r(crVar.y));
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int e(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ce2 ce2Var = (ce2) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            iJ = J(bArr, iJ, crVar);
            ce2Var.y(crVar.g);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int f(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        hq1 hq1Var = (hq1) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            hq1Var.y(Float.intBitsToFloat(a(iJ, bArr)));
            iJ += 4;
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static final void g(final il2 il2Var, xy1 xy1Var, h02 h02Var, int i) {
        h02Var.Z(1517283188);
        byte b = 2;
        int i2 = (h02Var.x(il2Var) ? 4 : 2) | i | (h02Var.j(xy1Var) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                StringBuilder sb = new StringBuilder();
                if (il2Var.v.length() > 0) {
                    sb.append(new Locale(il2Var.v).getDisplayLanguage());
                }
                objK = sb.toString();
                h02Var.i0(objK);
            }
            String str = (String) objK;
            nm0 nm0VarM0 = ue5.m0(1078084178, new bz1() { // from class: vk0
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    byte b4 = b2;
                    og5 og5Var = og5.g;
                    il2 il2Var2 = il2Var;
                    switch (b4) {
                        case 0:
                            h02 h02Var2 = (h02) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!h02Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                h02Var2.Q();
                            } else {
                                g75.y(il2Var2.y, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                            }
                            break;
                        default:
                            h02 h02Var3 = (h02) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                h02Var3.Q();
                            } else {
                                g75.y(xs2.J(R.string.community_layouts_created_by, new Object[]{il2Var2.r}, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                            }
                            break;
                    }
                    return og5Var;
                }
            }, h02Var);
            int i3 = ((i2 & 112) == 32 ? (byte) 1 : (byte) 0) | ((i2 & 14) == 4 ? (byte) 1 : (byte) 0);
            Object objK2 = h02Var.K();
            if (i3 != 0 || objK2 == l76Var) {
                objK2 = new p2(xy1Var, il2Var, (byte) 17);
                h02Var.i0(objK2);
            }
            lr2.r(nm0VarM0, ue5.I(g73.g, false, null, null, (my1) objK2, 15), ue5.m0(1147732052, new bz1() { // from class: vk0
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    byte b4 = b3;
                    og5 og5Var = og5.g;
                    il2 il2Var2 = il2Var;
                    switch (b4) {
                        case 0:
                            h02 h02Var2 = (h02) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!h02Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                h02Var2.Q();
                            } else {
                                g75.y(il2Var2.y, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                            }
                            break;
                        default:
                            h02 h02Var3 = (h02) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                h02Var3.Q();
                            } else {
                                g75.y(xs2.J(R.string.community_layouts_created_by, new Object[]{il2Var2.r}, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                            }
                            break;
                    }
                    return og5Var;
                }
            }, h02Var), ue5.m0(1182555989, new wo(str, b), h02Var), ry5.g, null, null, 0.0f, h02Var, 28038, 480);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ta((byte) 7, i, il2Var, xy1Var);
        }
    }

    public static int h(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ce2 ce2Var = (ce2) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            ce2Var.y(a(iJ, bArr));
            iJ += 4;
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int i(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        hq1 hq1Var = (hq1) df2Var;
        hq1Var.y(c(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iJ = J(bArr, i4, crVar);
            if (i != crVar.g) {
                break;
            }
            hq1Var.y(Float.intBitsToFloat(a(iJ, bArr)));
            i4 = iJ + 4;
        }
        return i4;
    }

    public static double j(int i, byte[] bArr) {
        return Double.longBitsToDouble(q(i, bArr));
    }

    public static int k(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ce2 ce2Var = (ce2) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            iJ = J(bArr, iJ, crVar);
            ce2Var.y(ri0.y(crVar.g));
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int l(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) throws hg2 {
        int iJ = J(bArr, i2, crVar);
        int i4 = crVar.g;
        if (i4 < 0) {
            throw hg2.n();
        }
        if (i4 > bArr.length - iJ) {
            throw hg2.x();
        }
        if (i4 == 0) {
            df2Var.add(ea0.t);
        } else {
            df2Var.add(ea0.n(bArr, iJ, i4));
            iJ += i4;
        }
        while (iJ < i3) {
            int iJ2 = J(bArr, iJ, crVar);
            if (i != crVar.g) {
                break;
            }
            iJ = J(bArr, iJ2, crVar);
            int i5 = crVar.g;
            if (i5 < 0) {
                throw hg2.n();
            }
            if (i5 > bArr.length - iJ) {
                throw hg2.x();
            }
            if (i5 == 0) {
                df2Var.add(ea0.t);
            } else {
                df2Var.add(ea0.n(bArr, iJ, i5));
                iJ += i5;
            }
        }
        return iJ;
    }

    public static int m(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ce2 ce2Var = (ce2) df2Var;
        ce2Var.y(a(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iJ = J(bArr, i4, crVar);
            if (i != crVar.g) {
                break;
            }
            ce2Var.y(a(iJ, bArr));
            i4 = iJ + 4;
        }
        return i4;
    }

    public static final long n(int i) {
        long j = ((long) i) << 32;
        int i2 = fi2.Q;
        return j;
    }

    public static int o(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ly2 ly2Var = (ly2) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            ly2Var.y(q(iJ, bArr));
            iJ += 8;
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int p(le4 le4Var, int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) throws hg2 {
        int iS = s(le4Var, bArr, i2, i3, crVar);
        df2Var.add(crVar.r);
        while (iS < i3) {
            int iJ = J(bArr, iS, crVar);
            if (i != crVar.g) {
                break;
            }
            iS = s(le4Var, bArr, iJ, i3, crVar);
            df2Var.add(crVar.r);
        }
        return iS;
    }

    public static long q(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static final void r(zk0 zk0Var, xy1 xy1Var, h02 h02Var, int i) {
        zk0 zk0Var2;
        int i2;
        zk0 zk0Var3;
        zk0 zk0Var4;
        h02 h02Var2 = h02Var;
        on0 on0Var = tg1.m;
        on0 on0Var2 = tg1.c;
        on0 on0Var3 = tg1.q;
        on0 on0Var4 = tg1.w;
        k00 k00Var = hi0.w;
        k00 k00Var2 = hi0.t;
        xy1Var.getClass();
        h02Var2.Z(1883495173);
        int i3 = i | 2 | (h02Var2.j(xy1Var) ? 32 : 16);
        if (h02Var2.N(i3 & 1, (i3 & 19) != 18)) {
            h02Var2.S();
            if ((i & 1) == 0 || h02Var2.k()) {
                wl5 wl5VarG = rx2.g(h02Var2);
                if (wl5VarG == null) {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-15);
                    zk0Var3 = (zk0) js2.A(v54.g(zk0.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var2), xs2.k(wl5VarG), h02Var2);
                }
            } else {
                h02Var2.Q();
                i2 = i3 & (-15);
                zk0Var3 = zk0Var;
            }
            h02Var2.s();
            yk0 yk0Var = (yk0) zk0Var3.r.getValue();
            boolean z = yk0Var.n;
            List list = yk0Var.y;
            g73 g73Var = g73.g;
            e60 e60Var = e60.g;
            sx1 sx1Var = um2.Z;
            if (z) {
                h02Var2.X(1752185112);
                ho1 ho1Var = mq4.r;
                t33 t33VarR = z50.r(k00Var2, false);
                int iHashCode = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ = h02Var2.q();
                j73 j73VarW = m50.W(h02Var2, ho1Var);
                jo0.n.getClass();
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var4, h02Var2, t33VarR);
                xs2.E(on0Var3, h02Var2, tr3VarQ);
                xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode));
                xs2.D(h02Var2);
                xs2.E(on0Var, h02Var2, j73VarW);
                b04.g(e60Var.g(g73Var, k00Var), 0L, 0.0f, 0L, 0, 0.0f, h02Var2, 0, 62);
                h02Var2.b(true);
                h02Var2.b(false);
            } else {
                if (list != null) {
                    h02Var2.X(1752384752);
                    y(list, xy1Var, h02Var2, i2 & 112);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(1752549703);
                    ho1 ho1Var2 = mq4.r;
                    t33 t33VarR2 = z50.r(k00Var2, false);
                    zk0 zk0Var5 = zk0Var3;
                    int iHashCode2 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, ho1Var2);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var4, h02Var2, t33VarR2);
                    xs2.E(on0Var3, h02Var2, tr3VarQ2);
                    xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var2);
                    xs2.E(on0Var, h02Var2, j73VarW2);
                    zk0Var4 = zk0Var5;
                    g75.y(xs2.I(R.string.community_layouts_error, h02Var2), e60Var.g(ue5.e0(g73Var, 16.0f), k00Var), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 261116);
                    h02Var2 = h02Var;
                    h02Var2.b(true);
                    h02Var2.b(false);
                }
                zk0Var2 = zk0Var4;
            }
            zk0Var4 = zk0Var3;
            zk0Var2 = zk0Var4;
        } else {
            h02Var2.Q();
            zk0Var2 = zk0Var;
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ta((byte) 6, i, zk0Var2, xy1Var);
        }
    }

    public static int s(le4 le4Var, byte[] bArr, int i, int i2, cr crVar) throws hg2 {
        b12 b12VarN = le4Var.n();
        int iP = P(b12VarN, le4Var, bArr, i, i2, crVar);
        le4Var.y(b12VarN);
        crVar.r = b12VarN;
        return iP;
    }

    public static int t(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ob1 ob1Var = (ob1) df2Var;
        ob1Var.y(j(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iJ = J(bArr, i4, crVar);
            if (i != crVar.g) {
                break;
            }
            ob1Var.y(Double.longBitsToDouble(q(iJ, bArr)));
            i4 = iJ + 8;
        }
        return i4;
    }

    public static int u(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        s40 s40Var = (s40) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            iJ = L(bArr, iJ, crVar);
            s40Var.y(crVar.y != 0);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }

    public static int v(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        s40 s40Var = (s40) df2Var;
        int iL = L(bArr, i2, crVar);
        s40Var.y(crVar.y != 0);
        while (iL < i3) {
            int iJ = J(bArr, iL, crVar);
            if (i != crVar.g) {
                break;
            }
            iL = L(bArr, iJ, crVar);
            s40Var.y(crVar.y != 0);
        }
        return iL;
    }

    public static int w(int i, byte[] bArr, int i2, int i3, df2 df2Var, cr crVar) {
        ly2 ly2Var = (ly2) df2Var;
        ly2Var.y(q(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iJ = J(bArr, i4, crVar);
            if (i != crVar.g) {
                break;
            }
            ly2Var.y(q(iJ, bArr));
            i4 = iJ + 8;
        }
        return i4;
    }

    public static int x(byte[] bArr, int i, cr crVar) throws hg2 {
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g;
        if (i2 < 0) {
            throw hg2.n();
        }
        if (i2 > bArr.length - iJ) {
            throw hg2.x();
        }
        if (i2 == 0) {
            crVar.r = ea0.t;
            return iJ;
        }
        crVar.r = ea0.n(bArr, iJ, i2);
        return iJ + i2;
    }

    public static final void y(List list, xy1 xy1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1332709326);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(list) : h02Var.j(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2;
            ho1 ho1Var = mq4.r;
            bo3 bo3VarB = ue5.b(1, 0.0f);
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && h02Var.j(list))) | ((i3 & 112) == 32);
            Object objK = h02Var.K();
            if (z || objK == oo0.g) {
                objK = new m(list, xy1Var, (byte) 13);
                h02Var.i0(objK);
            }
            aq2.g(ho1Var, null, bo3VarB, null, null, null, false, null, (xy1) objK, h02Var, 390, 506);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ej(list, xy1Var, i);
        }
    }

    public static int z(byte[] bArr, int i, df2 df2Var, cr crVar) throws hg2 {
        ob1 ob1Var = (ob1) df2Var;
        int iJ = J(bArr, i, crVar);
        int i2 = crVar.g + iJ;
        while (iJ < i2) {
            ob1Var.y(Double.longBitsToDouble(q(iJ, bArr)));
            iJ += 8;
        }
        if (iJ == i2) {
            return iJ;
        }
        throw hg2.x();
    }
}
