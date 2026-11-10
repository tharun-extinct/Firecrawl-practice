package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xc6 {
    public static final float a;
    public static final sj0 g;
    public static final sj0 j;
    public static final sj0 l;
    public static final nf5 n;
    public static final float r;
    public static final sj0 t;
    public static final sj0 v;
    public static final float x;
    public static final float y;

    static {
        sj0 sj0Var = sj0.i;
        g = sj0Var;
        y = 0.38f;
        r = 0.12f;
        n = nf5.q;
        v = sj0.s;
        x = 1.0f;
        l = sj0.f;
        j = sj0.c;
        t = sj0Var;
        a = 18.0f;
    }

    public static int a(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, na6 na6Var, cr crVar) throws q76 {
        if ((i >>> 3) == 0) {
            zm5.g("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZ = z(bArr, i2, crVar);
            na6Var.r(i, Long.valueOf(crVar.y));
            return iZ;
        }
        if (i4 == 1) {
            na6Var.r(i, Long.valueOf(f(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iS = s(bArr, i2, crVar);
            int i5 = crVar.g;
            if (i5 < 0) {
                zm5.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iS) {
                zm5.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                na6Var.r(i, l56.t);
            } else {
                na6Var.r(i, l56.m(bArr, iS, i5));
            }
            return iS + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                na6Var.r(i, Integer.valueOf(a(i2, bArr)));
                return i2 + 4;
            }
            zm5.g("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        na6 na6VarY = na6.y();
        int i7 = crVar.n + 1;
        crVar.n = i7;
        if (i7 >= 100) {
            zm5.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iS2 = s(bArr, i2, crVar);
            int i9 = crVar.g;
            if (i9 == i6) {
                i8 = i9;
                i2 = iS2;
                break;
            }
            i2 = b(i9, bArr, iS2, i3, na6VarY, crVar);
            i8 = i9;
        }
        crVar.n--;
        if (i2 > i3 || i8 != i6) {
            zm5.g("Failed to parse the message.");
            return 0;
        }
        na6Var.r(i, na6VarY);
        return i2;
    }

    public static int c(byte[] bArr, int i, h76 h76Var, cr crVar) throws q76 {
        a76 a76Var = (a76) h76Var;
        int iS = s(bArr, i, crVar);
        int i2 = crVar.g + iS;
        while (iS < i2) {
            iS = s(bArr, iS, crVar);
            a76Var.l(crVar.g);
        }
        if (iS == i2) {
            return iS;
        }
        zm5.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static long f(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static final void g(j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        j73 j73Var2;
        nm0 nm0Var2;
        h02Var.Z(790527681);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                tp3 tp3Var = new tp3(null, hi0.B);
                h02Var.i0(tp3Var);
                objK = tp3Var;
            }
            ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new ef(ob3Var, (byte) 27);
                h02Var.i0(objK2);
            }
            my1 my1Var = (my1) objK2;
            wv3 wv3Var = x31.g;
            yy yyVarY = az5.y(cz5.y, h02Var, 6);
            j73Var2 = j73Var;
            nm0Var2 = nm0Var;
            og0.r(new m14[]{f45.y.g(hh6.n(my1Var, h02Var, 2)), f45.g.g(yyVarY)}, ue5.m0(1070596993, new vb0(j73Var2, ob3Var, nm0Var2, yyVarY, my1Var), h02Var), h02Var, 56);
        } else {
            j73Var2 = j73Var;
            nm0Var2 = nm0Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new df(j73Var2, nm0Var2, i, b);
        }
    }

    public static int h(Object obj, r96 r96Var, byte[] bArr, int i, int i2, int i3, cr crVar) throws q76 {
        e96 e96Var = (e96) r96Var;
        int i4 = crVar.n + 1;
        crVar.n = i4;
        if (i4 >= 100) {
            zm5.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iP = e96Var.p(obj, bArr, i, i2, i3, crVar);
        crVar.n--;
        crVar.r = obj;
        return iP;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[PHI: r5
  0x009f: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009a, B:47:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b7 A[SYNTHETIC] */
    public static int i(byte[] bArr, int i, cr crVar) throws q76 {
        int iS = s(bArr, i, crVar);
        int i2 = crVar.g;
        if (i2 < 0) {
            zm5.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            crVar.r = "";
            return iS;
        }
        int i3 = cb6.g;
        int length = bArr.length;
        if ((((length - iS) - i2) | iS | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iS), Integer.valueOf(i2)));
        }
        int i4 = iS + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iS < i4) {
            byte b = bArr[iS];
            if (b < 0) {
                break;
            }
            iS++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iS < i4) {
            int i6 = iS + 1;
            byte b2 = bArr[iS];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                iS = i6;
                while (iS < i4) {
                    byte b3 = bArr[iS];
                    if (b3 < 0) {
                        break;
                    }
                    iS++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            zm5.g("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b4 = bArr[i6];
                        int i7 = iS + 3;
                        byte b5 = bArr[iS + 2];
                        iS += 4;
                        byte b6 = bArr[i7];
                        if (!ed6.y(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !ed6.y(b5) && !ed6.y(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        zm5.g("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        zm5.g("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = iS + 2;
                    byte b7 = bArr[i6];
                    iS += 3;
                    byte b8 = bArr[i10];
                    if (!ed6.y(b7)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!ed6.y(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!ed6.y(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        } else if (b7 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!ed6.y(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!ed6.y(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        }
                    }
                    zm5.g("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    zm5.g("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                iS += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || ed6.y(b9)) {
                    zm5.g("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        crVar.r = new String(cArr, 0, i5);
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c34, ho0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList j(lr4 lr4Var, int i, Integer num) {
        ?? c34Var = new c34(lr4Var);
        i = lr4Var.s(i);
        c02 c02VarG = lr4Var.g(i);
        while (i >= 0) {
            c34Var.x(lr4Var.t(i), lr4Var.m(i) ? lr4Var.b(lr4Var.y, i) : oo0.g, lr4Var.g.l(i), num);
            if (i >= 0) {
                c02 c02Var = c02VarG;
                c02VarG = lr4Var.g(i);
                i = lr4Var.s(i);
                num = c02Var;
            } else {
                num = c02VarG;
            }
        }
        return (ArrayList) c34Var.g;
    }

    public static final Integer l(lr4 lr4Var, to0 to0Var, int i, int i2) {
        Integer numL;
        int[] iArr = lr4Var.y;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (lr4Var.a(i) && lr4Var.t(i) == 206 && yf2.p(lr4Var.b(iArr, i), qo0.v)) {
                Object objJ = lr4Var.j(i, 0);
                l02 l02Var = objJ instanceof l02 ? (l02) objJ : null;
                j64 j64Var = l02Var != null ? l02Var.g : null;
                e02 e02Var = j64Var instanceof e02 ? (e02) j64Var : null;
                if (e02Var != null && e02Var.j == to0Var) {
                    return Integer.valueOf(i);
                }
            }
            if (lr4Var.n(i) && (numL = l(lr4Var, to0Var, i + 1, i3)) != null) {
                return Integer.valueOf(numL.intValue());
            }
            i = i3;
        }
    }

    public static int m(r96 r96Var, byte[] bArr, int i, int i2, int i3, cr crVar) throws q76 {
        y66 y66VarX = r96Var.x();
        int iH = h(y66VarX, r96Var, bArr, i, i2, i3, crVar);
        r96Var.g(y66VarX);
        crVar.r = y66VarX;
        return iH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [c34, ho0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [c02] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List n(pr4 pr4Var, Integer num, int i, Integer num2) {
        int iD;
        int iP;
        xa3 xa3Var;
        if (pr4Var.f || pr4Var.i() == 0) {
            return pi1.j;
        }
        ?? c34Var = new c34(pr4Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = pr4Var.o;
            if (iD < 0) {
                iD = pr4Var.D(pr4Var.y, i);
            }
        }
        if (num == 0) {
            int iM = pr4Var.t - pr4Var.M(pr4Var.y, pr4Var.s(i));
            ha3 ha3Var = pr4Var.u;
            num = Integer.valueOf(iM + ((ha3Var == null || (xa3Var = (xa3) ha3Var.y(i)) == null) ? 0 : xa3Var.y));
        }
        int iS = pr4Var.s(i) * 5;
        int[] iArr = pr4Var.y;
        if (iS < iArr.length) {
            iP = pr4Var.p(i);
        } else {
            int iD2 = iD >= 0 ? pr4Var.D(iArr, iD) : iD;
            iP = pr4Var.p(iD);
            int i2 = iD;
            iD = iD2;
            i = i2;
        }
        while (i >= 0) {
            c34Var.x(iP, (pr4Var.y[(pr4Var.s(i) * 5) + 1] & 536870912) != 0 ? pr4Var.u(i) : oo0.g, pr4Var.N(i), num);
            num = pr4Var.y(i);
            if (iD >= 0) {
                int iD3 = pr4Var.D(pr4Var.y, iD);
                iP = pr4Var.p(iD);
                int i3 = iD;
                iD = iD3;
                i = i3;
            } else {
                i = iD;
            }
        }
        return (ArrayList) c34Var.g;
    }

    public static int o(Object obj, r96 r96Var, byte[] bArr, int i, int i2, cr crVar) throws q76 {
        int iP = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iP = p(i3, bArr, iP, crVar);
            i3 = crVar.g;
        }
        int i4 = iP;
        if (i3 < 0 || i3 > i2 - i4) {
            zm5.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = crVar.n + 1;
        crVar.n = i5;
        if (i5 >= 100) {
            zm5.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        r96Var.t(obj, bArr, i4, i6, crVar);
        crVar.n--;
        crVar.r = obj;
        return i6;
    }

    public static int p(int i, byte[] bArr, int i2, cr crVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            crVar.g = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
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

    public static int q(r96 r96Var, byte[] bArr, int i, int i2, cr crVar) throws q76 {
        y66 y66VarX = r96Var.x();
        int iO = o(y66VarX, r96Var, bArr, i, i2, crVar);
        r96Var.g(y66VarX);
        crVar.r = y66VarX;
        return iO;
    }

    public static final List r(lr4 lr4Var) {
        boolean z = lr4Var.x;
        int[] iArr = lr4Var.y;
        if (z || lr4Var.r == 0) {
            return pi1.j;
        }
        c34 c34Var = new c34(lr4Var);
        int iS = lr4Var.t;
        Object objValueOf = Integer.valueOf(lr4Var.q - or4.n(iArr, iS));
        while (iS >= 0) {
            c34Var.x(lr4Var.t(iS), lr4Var.m(iS) ? lr4Var.b(iArr, iS) : oo0.g, lr4Var.g.l(iS), objValueOf);
            objValueOf = lr4Var.g(iS);
            iS = lr4Var.s(iS);
        }
        return (ArrayList) c34Var.g;
    }

    public static int s(byte[] bArr, int i, cr crVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return p(b, bArr, i2, crVar);
        }
        crVar.g = b;
        return i2;
    }

    public static int t(byte[] bArr, int i, cr crVar) throws q76 {
        int iS = s(bArr, i, crVar);
        int i2 = crVar.g;
        if (i2 < 0) {
            zm5.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iS) {
            zm5.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            crVar.r = l56.t;
            return iS;
        }
        crVar.r = l56.m(bArr, iS, i2);
        return iS + i2;
    }

    public static int u(int i, byte[] bArr, int i2, int i3, h76 h76Var, cr crVar) {
        a76 a76Var = (a76) h76Var;
        int iS = s(bArr, i2, crVar);
        a76Var.l(crVar.g);
        while (iS < i3) {
            int iS2 = s(bArr, iS, crVar);
            if (i != crVar.g) {
                break;
            }
            iS = s(bArr, iS2, crVar);
            a76Var.l(crVar.g);
        }
        return iS;
    }

    public static List v(pr4 pr4Var) {
        return n(pr4Var, null, pr4Var.z, null);
    }

    public static int w(r96 r96Var, int i, byte[] bArr, int i2, int i3, h76 h76Var, cr crVar) throws q76 {
        int iQ = q(r96Var, bArr, i2, i3, crVar);
        h76Var.add(crVar.r);
        while (iQ < i3) {
            int iS = s(bArr, iQ, crVar);
            if (i != crVar.g) {
                break;
            }
            iQ = q(r96Var, bArr, iS, i3, crVar);
            h76Var.add(crVar.r);
        }
        return iQ;
    }

    public static final Integer x(mr4 mr4Var, to0 to0Var) {
        lr4 lr4VarN = mr4Var.n();
        try {
            return l(lr4VarN, to0Var, 0, lr4VarN.r);
        } finally {
            lr4VarN.r();
        }
    }

    public static final void y(j73 j73Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(155925518);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        byte b = 3;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean z = h02Var.a(f45.g) != null;
            boolean z2 = h02Var.a(f45.y) != null;
            if (z && z2) {
                h02Var.X(-1977187922);
                t33 t33VarR = z50.r(hi0.t, true);
                int iHashCode = Long.hashCode(h02Var.T);
                tr3 tr3VarQ = h02Var.q();
                j73 j73VarW = m50.W(h02Var, j73Var);
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
                nm0Var.l(h02Var, Integer.valueOf((i2 >> 3) & 14));
                h02Var.b(true);
                h02Var.b(false);
            } else if (z) {
                h02Var.X(-1976997706);
                hh6.g(j73Var, nm0Var, h02Var, i2 & 126);
                h02Var.b(false);
            } else if (z2) {
                h02Var.X(-1976846922);
                x31.n(j73Var, nm0Var, h02Var, i2 & 126);
                h02Var.b(false);
            } else {
                h02Var.X(-1976716505);
                g(j73Var, nm0Var, h02Var, i2 & 126);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new df(j73Var, nm0Var, i, b);
        }
    }

    public static int z(byte[] bArr, int i, cr crVar) {
        long j2 = bArr[i];
        int i2 = i + 1;
        if (j2 >= 0) {
            crVar.y = j2;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        crVar.y = j3;
        return i3;
    }
}
