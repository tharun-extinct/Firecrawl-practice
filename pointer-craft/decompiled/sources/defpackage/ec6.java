package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ec6 {
    public static final sj0 a;
    public static final float b;
    public static final float c;
    public static final sj0 f;
    public static final in4 g = in4.s;
    public static final float h;
    public static final sj0 i;
    public static final float j;
    public static final float l;
    public static final sj0 m;
    public static final sj0 n;
    public static final sj0 o;
    public static final sj0 p;
    public static final sj0 q;
    public static final float r;
    public static final float s;
    public static final nf5 t;
    public static final sj0 u;
    public static final float v;
    public static final sj0 w;
    public static final sj0 x;
    public static final sj0 y;
    public static final sj0 z;

    static {
        sj0 sj0Var = sj0.i;
        y = sj0Var;
        r = 0.38f;
        n = sj0Var;
        v = 0.12f;
        x = sj0Var;
        l = 0.12f;
        j = 8.0f;
        t = nf5.q;
        a = sj0.f;
        sj0 sj0Var2 = sj0.c;
        m = sj0Var2;
        sj0 sj0Var3 = sj0.b;
        q = sj0Var3;
        w = sj0.p;
        c = 1.0f;
        i = sj0Var;
        b = 0.38f;
        s = 18.0f;
        p = sj0.u;
        u = sj0Var3;
        z = sj0Var;
        h = 0.38f;
        o = sj0Var2;
        f = sj0Var3;
    }

    public static final void a(String str, String str2) {
        str.getClass();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                a11.x(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(us5.m(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void g(final String str, final xy1 xy1Var, j73 j73Var, boolean z2, k85 k85Var, final bz1 bz1Var, boolean z3, zm5 zm5Var, vj2 vj2Var, si2 si2Var, boolean z4, int i2, int i3, cn4 cn4Var, t45 t45Var, h02 h02Var, final int i4, final int i5, final int i6) {
        int i7;
        j73 j73Var2;
        int i8;
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        boolean z7;
        final boolean z8;
        final k85 k85Var2;
        final zm5 zm5Var2;
        final si2 si2Var2;
        final int i16;
        final int i17;
        final cn4 cn4Var2;
        final t45 t45Var2;
        final boolean z9;
        final boolean z10;
        final vj2 vj2Var2;
        u34 u34VarP;
        j73 j73Var3;
        int i18;
        zm5 zm5Var3;
        cn4 cn4VarY;
        int i19;
        k85 k85Var3;
        vj2 vj2Var3;
        boolean z11;
        int i20;
        t45 t45VarC;
        si2 si2Var3;
        boolean z12;
        Object objK;
        ja3 ja3Var;
        long jY;
        h02Var.Z(1901501544);
        if ((i4 & 6) == 0) {
            i7 = (h02Var.x(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        int i21 = i6 & 4;
        if (i21 == 0) {
            if ((i4 & 384) == 0) {
                j73Var2 = j73Var;
                i7 |= h02Var.x(j73Var2) ? 256 : 128;
            }
            i8 = i7 | 918645760;
            i9 = i5 | 438;
            i10 = i6 & 8192;
            if (i10 != 0) {
                i12 = i5 | 3510;
                z5 = z3;
            } else {
                z5 = z3;
                if (h02Var.l(z5)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i12 = i9 | i11;
            }
            i13 = 1794048 | i12;
            i14 = 131072 & i6;
            if (i14 != 0) {
                if ((12582912 & i5) == 0) {
                    z6 = z4;
                    if (h02Var.l(z6)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i13 |= i15;
                }
                int i22 = i13 | 838860800;
                if ((i8 & 306783379) == 306783378 || (i22 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (h02Var.N(i8 & 1, z7)) {
                    h02Var.S();
                    if ((i4 & 1) != 0 || h02Var.k()) {
                        if (i21 != 0) {
                            j73Var3 = g73.g;
                        } else {
                            j73Var3 = j73Var2;
                        }
                        k85 k85Var4 = (k85) h02Var.a(g75.g);
                        if (i10 != 0) {
                            z5 = false;
                        }
                        zm5 zm5Var4 = aj6.p;
                        vj2 vj2Var4 = vj2.y;
                        si2 si2Var4 = si2.y;
                        if (i14 != 0) {
                            z6 = false;
                        }
                        if (z6) {
                            i18 = 1;
                        } else {
                            i18 = Integer.MAX_VALUE;
                        }
                        zm5Var3 = zm5Var4;
                        cn4VarY = vn4.y(yc6.y, h02Var);
                        i19 = 1;
                        j73Var2 = j73Var3;
                        k85Var3 = k85Var4;
                        vj2Var3 = vj2Var4;
                        z11 = z5;
                        i20 = i18;
                        t45VarC = t32.c(h02Var);
                        si2Var3 = si2Var4;
                        z12 = true;
                    } else {
                        h02Var.Q();
                        z12 = z2;
                        k85Var3 = k85Var;
                        zm5Var3 = zm5Var;
                        vj2Var3 = vj2Var;
                        si2Var3 = si2Var;
                        i20 = i2;
                        i19 = i3;
                        cn4VarY = cn4Var;
                        z11 = z5;
                        t45VarC = t45Var;
                    }
                    boolean z13 = z6;
                    h02Var.s();
                    h02Var.X(1310051731);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = du4.n(h02Var);
                    }
                    ja3Var = (ja3) objK;
                    h02Var.b(false);
                    h02Var.X(1981927842);
                    jY = k85Var3.y();
                    if (jY == 16) {
                        jY = t45VarC.v(z12, z11, ((Boolean) xf6.g(ja3Var, h02Var, 0).getValue()).booleanValue());
                    }
                    long j2 = jY;
                    h02Var.b(false);
                    og0.y(y75.g.g(t45VarC.m), ue5.m0(1874034984, new gn3(j73Var2, bz1Var, z11, t45VarC, str, xy1Var, z12, k85Var3.n(new k85(j2, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214)), vj2Var3, si2Var3, z13, i20, i19, zm5Var3, ja3Var, cn4VarY), h02Var), h02Var, 56);
                    k85Var2 = k85Var3;
                    z10 = z11;
                    z8 = z12;
                    si2Var2 = si2Var3;
                    z9 = z13;
                    i16 = i20;
                    i17 = i19;
                    zm5Var2 = zm5Var3;
                    t45Var2 = t45VarC;
                    vj2Var2 = vj2Var3;
                    cn4Var2 = cn4VarY;
                } else {
                    h02Var.Q();
                    z8 = z2;
                    k85Var2 = k85Var;
                    zm5Var2 = zm5Var;
                    si2Var2 = si2Var;
                    i16 = i2;
                    i17 = i3;
                    cn4Var2 = cn4Var;
                    t45Var2 = t45Var;
                    z9 = z6;
                    z10 = z5;
                    vj2Var2 = vj2Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    final j73 j73Var4 = j73Var2;
                    u34VarP.n = new bz1() { // from class: cn3
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i4 | 1);
                            int iJ2 = aq2.J(i5);
                            String str2 = str;
                            xy1 xy1Var2 = xy1Var;
                            j73 j73Var5 = j73Var4;
                            boolean z14 = z8;
                            k85 k85Var5 = k85Var2;
                            bz1 bz1Var2 = bz1Var;
                            boolean z15 = z10;
                            zm5 zm5Var5 = zm5Var2;
                            vj2 vj2Var5 = vj2Var2;
                            si2 si2Var5 = si2Var2;
                            boolean z16 = z9;
                            int i23 = i16;
                            boolean z17 = i17;
                            cn4 cn4Var3 = cn4Var2;
                            t45 t45Var3 = t45Var2;
                            int i24 = i6;
                            ec6.g(str2, xy1Var2, j73Var5, z14, k85Var5, bz1Var2, z15, zm5Var5, vj2Var5, si2Var5, z16, i23, z17 ? 1 : 0, cn4Var3, t45Var3, (h02) obj, iJ, iJ2, i24);
                            return og5.g;
                        }
                    };
                }
            }
            i13 = 14376960 | i12;
            z6 = z4;
            int i23 = i13 | 838860800;
            if ((i8 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (h02Var.N(i8 & 1, z7)) {
                h02Var.S();
                if ((i4 & 1) != 0) {
                    if (i21 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    k85 k85Var5 = (k85) h02Var.a(g75.g);
                    if (i10 != 0) {
                        z5 = false;
                    }
                    zm5 zm5Var5 = aj6.p;
                    vj2 vj2Var5 = vj2.y;
                    si2 si2Var5 = si2.y;
                    if (i14 != 0) {
                        z6 = false;
                    }
                    if (z6) {
                        i18 = 1;
                    } else {
                        i18 = Integer.MAX_VALUE;
                    }
                    zm5Var3 = zm5Var5;
                    cn4VarY = vn4.y(yc6.y, h02Var);
                    i19 = 1;
                    j73Var2 = j73Var3;
                    k85Var3 = k85Var5;
                    vj2Var3 = vj2Var5;
                    z11 = z5;
                    i20 = i18;
                    t45VarC = t32.c(h02Var);
                    si2Var3 = si2Var5;
                    z12 = true;
                } else {
                    if (i21 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    k85 k85Var6 = (k85) h02Var.a(g75.g);
                    if (i10 != 0) {
                        z5 = false;
                    }
                    zm5 zm5Var6 = aj6.p;
                    vj2 vj2Var6 = vj2.y;
                    si2 si2Var6 = si2.y;
                    if (i14 != 0) {
                        z6 = false;
                    }
                    if (z6) {
                        i18 = 1;
                    } else {
                        i18 = Integer.MAX_VALUE;
                    }
                    zm5Var3 = zm5Var6;
                    cn4VarY = vn4.y(yc6.y, h02Var);
                    i19 = 1;
                    j73Var2 = j73Var3;
                    k85Var3 = k85Var6;
                    vj2Var3 = vj2Var6;
                    z11 = z5;
                    i20 = i18;
                    t45VarC = t32.c(h02Var);
                    si2Var3 = si2Var6;
                    z12 = true;
                }
                boolean z14 = z6;
                h02Var.s();
                h02Var.X(1310051731);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = du4.n(h02Var);
                }
                ja3Var = (ja3) objK;
                h02Var.b(false);
                h02Var.X(1981927842);
                jY = k85Var3.y();
                if (jY == 16) {
                    jY = t45VarC.v(z12, z11, ((Boolean) xf6.g(ja3Var, h02Var, 0).getValue()).booleanValue());
                }
                long j3 = jY;
                h02Var.b(false);
                og0.y(y75.g.g(t45VarC.m), ue5.m0(1874034984, new gn3(j73Var2, bz1Var, z11, t45VarC, str, xy1Var, z12, k85Var3.n(new k85(j3, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214)), vj2Var3, si2Var3, z14, i20, i19, zm5Var3, ja3Var, cn4VarY), h02Var), h02Var, 56);
                k85Var2 = k85Var3;
                z10 = z11;
                z8 = z12;
                si2Var2 = si2Var3;
                z9 = z14;
                i16 = i20;
                i17 = i19;
                zm5Var2 = zm5Var3;
                t45Var2 = t45VarC;
                vj2Var2 = vj2Var3;
                cn4Var2 = cn4VarY;
            } else {
                h02Var.Q();
                z8 = z2;
                k85Var2 = k85Var;
                zm5Var2 = zm5Var;
                si2Var2 = si2Var;
                i16 = i2;
                i17 = i3;
                cn4Var2 = cn4Var;
                t45Var2 = t45Var;
                z9 = z6;
                z10 = z5;
                vj2Var2 = vj2Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                final j73 j73Var5 = j73Var2;
                u34VarP.n = new bz1() { // from class: cn3
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i4 | 1);
                        int iJ2 = aq2.J(i5);
                        String str2 = str;
                        xy1 xy1Var2 = xy1Var;
                        j73 j73Var6 = j73Var5;
                        boolean z15 = z8;
                        k85 k85Var7 = k85Var2;
                        bz1 bz1Var2 = bz1Var;
                        boolean z16 = z10;
                        zm5 zm5Var7 = zm5Var2;
                        vj2 vj2Var7 = vj2Var2;
                        si2 si2Var7 = si2Var2;
                        boolean z17 = z9;
                        int i24 = i16;
                        boolean z18 = i17;
                        cn4 cn4Var3 = cn4Var2;
                        t45 t45Var3 = t45Var2;
                        int i25 = i6;
                        ec6.g(str2, xy1Var2, j73Var6, z15, k85Var7, bz1Var2, z16, zm5Var7, vj2Var7, si2Var7, z17, i24, z18 ? 1 : 0, cn4Var3, t45Var3, (h02) obj, iJ, iJ2, i25);
                        return og5.g;
                    }
                };
            }
        }
        i7 |= 384;
        j73Var2 = j73Var;
        i8 = i7 | 918645760;
        i9 = i5 | 438;
        i10 = i6 & 8192;
        if (i10 != 0) {
            i12 = i5 | 3510;
            z5 = z3;
        } else {
            z5 = z3;
            if (h02Var.l(z5)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i12 = i9 | i11;
        }
        i13 = 1794048 | i12;
        i14 = 131072 & i6;
        if (i14 != 0) {
            if ((12582912 & i5) == 0) {
                z6 = z4;
                if (h02Var.l(z6)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i13 |= i15;
            }
            int i24 = i13 | 838860800;
            if ((i8 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (h02Var.N(i8 & 1, z7)) {
                h02Var.S();
                if ((i4 & 1) != 0) {
                    if (i21 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    k85 k85Var7 = (k85) h02Var.a(g75.g);
                    if (i10 != 0) {
                        z5 = false;
                    }
                    zm5 zm5Var7 = aj6.p;
                    vj2 vj2Var7 = vj2.y;
                    si2 si2Var7 = si2.y;
                    if (i14 != 0) {
                        z6 = false;
                    }
                    if (z6) {
                        i18 = 1;
                    } else {
                        i18 = Integer.MAX_VALUE;
                    }
                    zm5Var3 = zm5Var7;
                    cn4VarY = vn4.y(yc6.y, h02Var);
                    i19 = 1;
                    j73Var2 = j73Var3;
                    k85Var3 = k85Var7;
                    vj2Var3 = vj2Var7;
                    z11 = z5;
                    i20 = i18;
                    t45VarC = t32.c(h02Var);
                    si2Var3 = si2Var7;
                    z12 = true;
                } else {
                    if (i21 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    k85 k85Var8 = (k85) h02Var.a(g75.g);
                    if (i10 != 0) {
                        z5 = false;
                    }
                    zm5 zm5Var8 = aj6.p;
                    vj2 vj2Var8 = vj2.y;
                    si2 si2Var8 = si2.y;
                    if (i14 != 0) {
                        z6 = false;
                    }
                    if (z6) {
                        i18 = 1;
                    } else {
                        i18 = Integer.MAX_VALUE;
                    }
                    zm5Var3 = zm5Var8;
                    cn4VarY = vn4.y(yc6.y, h02Var);
                    i19 = 1;
                    j73Var2 = j73Var3;
                    k85Var3 = k85Var8;
                    vj2Var3 = vj2Var8;
                    z11 = z5;
                    i20 = i18;
                    t45VarC = t32.c(h02Var);
                    si2Var3 = si2Var8;
                    z12 = true;
                }
                boolean z15 = z6;
                h02Var.s();
                h02Var.X(1310051731);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = du4.n(h02Var);
                }
                ja3Var = (ja3) objK;
                h02Var.b(false);
                h02Var.X(1981927842);
                jY = k85Var3.y();
                if (jY == 16) {
                    jY = t45VarC.v(z12, z11, ((Boolean) xf6.g(ja3Var, h02Var, 0).getValue()).booleanValue());
                }
                long j4 = jY;
                h02Var.b(false);
                og0.y(y75.g.g(t45VarC.m), ue5.m0(1874034984, new gn3(j73Var2, bz1Var, z11, t45VarC, str, xy1Var, z12, k85Var3.n(new k85(j4, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214)), vj2Var3, si2Var3, z15, i20, i19, zm5Var3, ja3Var, cn4VarY), h02Var), h02Var, 56);
                k85Var2 = k85Var3;
                z10 = z11;
                z8 = z12;
                si2Var2 = si2Var3;
                z9 = z15;
                i16 = i20;
                i17 = i19;
                zm5Var2 = zm5Var3;
                t45Var2 = t45VarC;
                vj2Var2 = vj2Var3;
                cn4Var2 = cn4VarY;
            } else {
                h02Var.Q();
                z8 = z2;
                k85Var2 = k85Var;
                zm5Var2 = zm5Var;
                si2Var2 = si2Var;
                i16 = i2;
                i17 = i3;
                cn4Var2 = cn4Var;
                t45Var2 = t45Var;
                z9 = z6;
                z10 = z5;
                vj2Var2 = vj2Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                final j73 j73Var6 = j73Var2;
                u34VarP.n = new bz1() { // from class: cn3
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i4 | 1);
                        int iJ2 = aq2.J(i5);
                        String str2 = str;
                        xy1 xy1Var2 = xy1Var;
                        j73 j73Var7 = j73Var6;
                        boolean z16 = z8;
                        k85 k85Var9 = k85Var2;
                        bz1 bz1Var2 = bz1Var;
                        boolean z17 = z10;
                        zm5 zm5Var9 = zm5Var2;
                        vj2 vj2Var9 = vj2Var2;
                        si2 si2Var9 = si2Var2;
                        boolean z18 = z9;
                        int i25 = i16;
                        boolean z19 = i17;
                        cn4 cn4Var3 = cn4Var2;
                        t45 t45Var3 = t45Var2;
                        int i26 = i6;
                        ec6.g(str2, xy1Var2, j73Var7, z16, k85Var9, bz1Var2, z17, zm5Var9, vj2Var9, si2Var9, z18, i25, z19 ? 1 : 0, cn4Var3, t45Var3, (h02) obj, iJ, iJ2, i26);
                        return og5.g;
                    }
                };
            }
        }
        i13 = 14376960 | i12;
        z6 = z4;
        int i25 = i13 | 838860800;
        if ((i8 & 306783379) == 306783378) {
            z7 = true;
        } else {
            z7 = true;
        }
        if (h02Var.N(i8 & 1, z7)) {
            h02Var.S();
            if ((i4 & 1) != 0) {
                if (i21 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                k85 k85Var9 = (k85) h02Var.a(g75.g);
                if (i10 != 0) {
                    z5 = false;
                }
                zm5 zm5Var9 = aj6.p;
                vj2 vj2Var9 = vj2.y;
                si2 si2Var9 = si2.y;
                if (i14 != 0) {
                    z6 = false;
                }
                if (z6) {
                    i18 = 1;
                } else {
                    i18 = Integer.MAX_VALUE;
                }
                zm5Var3 = zm5Var9;
                cn4VarY = vn4.y(yc6.y, h02Var);
                i19 = 1;
                j73Var2 = j73Var3;
                k85Var3 = k85Var9;
                vj2Var3 = vj2Var9;
                z11 = z5;
                i20 = i18;
                t45VarC = t32.c(h02Var);
                si2Var3 = si2Var9;
                z12 = true;
            } else {
                if (i21 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                k85 k85Var10 = (k85) h02Var.a(g75.g);
                if (i10 != 0) {
                    z5 = false;
                }
                zm5 zm5Var10 = aj6.p;
                vj2 vj2Var10 = vj2.y;
                si2 si2Var10 = si2.y;
                if (i14 != 0) {
                    z6 = false;
                }
                if (z6) {
                    i18 = 1;
                } else {
                    i18 = Integer.MAX_VALUE;
                }
                zm5Var3 = zm5Var10;
                cn4VarY = vn4.y(yc6.y, h02Var);
                i19 = 1;
                j73Var2 = j73Var3;
                k85Var3 = k85Var10;
                vj2Var3 = vj2Var10;
                z11 = z5;
                i20 = i18;
                t45VarC = t32.c(h02Var);
                si2Var3 = si2Var10;
                z12 = true;
            }
            boolean z16 = z6;
            h02Var.s();
            h02Var.X(1310051731);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            ja3Var = (ja3) objK;
            h02Var.b(false);
            h02Var.X(1981927842);
            jY = k85Var3.y();
            if (jY == 16) {
                jY = t45VarC.v(z12, z11, ((Boolean) xf6.g(ja3Var, h02Var, 0).getValue()).booleanValue());
            }
            long j5 = jY;
            h02Var.b(false);
            og0.y(y75.g.g(t45VarC.m), ue5.m0(1874034984, new gn3(j73Var2, bz1Var, z11, t45VarC, str, xy1Var, z12, k85Var3.n(new k85(j5, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214)), vj2Var3, si2Var3, z16, i20, i19, zm5Var3, ja3Var, cn4VarY), h02Var), h02Var, 56);
            k85Var2 = k85Var3;
            z10 = z11;
            z8 = z12;
            si2Var2 = si2Var3;
            z9 = z16;
            i16 = i20;
            i17 = i19;
            zm5Var2 = zm5Var3;
            t45Var2 = t45VarC;
            vj2Var2 = vj2Var3;
            cn4Var2 = cn4VarY;
        } else {
            h02Var.Q();
            z8 = z2;
            k85Var2 = k85Var;
            zm5Var2 = zm5Var;
            si2Var2 = si2Var;
            i16 = i2;
            i17 = i3;
            cn4Var2 = cn4Var;
            t45Var2 = t45Var;
            z9 = z6;
            z10 = z5;
            vj2Var2 = vj2Var;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            final j73 j73Var7 = j73Var2;
            u34VarP.n = new bz1() { // from class: cn3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i4 | 1);
                    int iJ2 = aq2.J(i5);
                    String str2 = str;
                    xy1 xy1Var2 = xy1Var;
                    j73 j73Var8 = j73Var7;
                    boolean z17 = z8;
                    k85 k85Var11 = k85Var2;
                    bz1 bz1Var2 = bz1Var;
                    boolean z18 = z10;
                    zm5 zm5Var11 = zm5Var2;
                    vj2 vj2Var11 = vj2Var2;
                    si2 si2Var11 = si2Var2;
                    boolean z19 = z9;
                    int i26 = i16;
                    boolean z110 = i17;
                    cn4 cn4Var3 = cn4Var2;
                    t45 t45Var3 = t45Var2;
                    int i27 = i6;
                    ec6.g(str2, xy1Var2, j73Var8, z17, k85Var11, bz1Var2, z18, zm5Var11, vj2Var11, si2Var11, z19, i26, z110 ? 1 : 0, cn4Var3, t45Var3, (h02) obj, iJ, iJ2, i27);
                    return og5.g;
                }
            };
        }
    }

    public static final boolean j(int i2) {
        return i2 == 0;
    }

    public static final String l(c52 c52Var, int i2) {
        c52Var.getClass();
        String str = (String) pr.a0((i2 * 2) + 1, c52Var.j);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i2 + ']');
    }

    public static final c52 n(fa4 fa4Var) {
        fa4Var.getClass();
        return new c52((String[]) ((ArrayList) fa4Var.t).toArray(new String[0]));
    }

    public static final void r(fa4 fa4Var, String str, String str2) {
        fa4Var.getClass();
        str2.getClass();
        ArrayList arrayList = (ArrayList) fa4Var.t;
        arrayList.add(str);
        arrayList.add(tx4.q0(str2).toString());
    }

    public static final void t(String str) {
        str.getClass();
        if (str.length() <= 0) {
            l0.u("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                a11.x(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final String v(c52 c52Var, int i2) {
        c52Var.getClass();
        String str = (String) pr.a0(i2 * 2, c52Var.j);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i2 + ']');
    }

    public static final fa4 x(c52 c52Var) {
        fa4 fa4Var = new fa4((byte) 15);
        ArrayList arrayList = (ArrayList) fa4Var.t;
        String[] strArr = c52Var.j;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return fa4Var;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x025c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0286  */
    /* JADX WARN: Code duplicated, block: B:164:0x028a  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:173:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:181:0x0313  */
    /* JADX WARN: Code duplicated, block: B:184:0x0331  */
    /* JADX WARN: Code duplicated, block: B:187:0x0346  */
    /* JADX WARN: Code duplicated, block: B:189:0x034c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0351  */
    /* JADX WARN: Code duplicated, block: B:194:0x0357  */
    /* JADX WARN: Code duplicated, block: B:197:0x035e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0398  */
    /* JADX WARN: Code duplicated, block: B:200:0x039c  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:211:0x0421  */
    /* JADX WARN: Code duplicated, block: B:212:0x0425  */
    /* JADX WARN: Code duplicated, block: B:217:0x0440  */
    /* JADX WARN: Code duplicated, block: B:220:0x0460  */
    /* JADX WARN: Code duplicated, block: B:223:0x0479  */
    /* JADX WARN: Code duplicated, block: B:224:0x047c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0480  */
    /* JADX WARN: Code duplicated, block: B:227:0x0483  */
    /* JADX WARN: Code duplicated, block: B:230:0x0491  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:234:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:235:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:240:0x0500  */
    /* JADX WARN: Code duplicated, block: B:243:0x0512  */
    /* JADX WARN: Code duplicated, block: B:245:0x051d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0521  */
    /* JADX WARN: Code duplicated, block: B:250:0x052a  */
    /* JADX WARN: Code duplicated, block: B:252:0x052e  */
    /* JADX WARN: Code duplicated, block: B:256:0x0537  */
    /* JADX WARN: Code duplicated, block: B:258:0x053b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0576  */
    /* JADX WARN: Code duplicated, block: B:262:0x057a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0587  */
    /* JADX WARN: Code duplicated, block: B:267:0x0595  */
    /* JADX WARN: Code duplicated, block: B:269:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:271:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:273:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:274:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:279:0x061a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0636  */
    public static final void y(final bz1 bz1Var, cz1 cz1Var, bz1 bz1Var2, final bz1 bz1Var3, final bz1 bz1Var4, final bz1 bz1Var5, bz1 bz1Var6, final boolean z2, final j55 j55Var, final c55 c55Var, final xy1 xy1Var, final nm0 nm0Var, bz1 bz1Var7, zn3 zn3Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        int i5;
        bz1 bz1Var8;
        cz1 cz1Var2;
        bz1 bz1Var9;
        bz1 bz1Var10;
        h02 h02Var2;
        k00 k00Var;
        k00 k00Var2;
        on0 on0Var;
        c63 c63Var;
        boolean z3;
        float fA;
        float fE;
        float f2;
        bz1 bz1Var11;
        k00 k00Var3;
        float f3;
        float f4;
        float f5;
        j73 j73VarI0;
        int iS;
        boolean z4;
        int iS2;
        c55 c55Var2;
        boolean z5;
        Object objK;
        int iS3;
        int iS4;
        int iS5;
        int iS6;
        int iS7;
        zn3 zn3Var2 = zn3Var;
        k00 k00Var4 = hi0.w;
        k00 k00Var5 = hi0.t;
        h02Var.Z(753699262);
        int i6 = i2 & 6;
        g73 g73Var = g73.g;
        if (i6 == 0) {
            i4 = i2 | (h02Var.x(g73Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.j(bz1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var.j(cz1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var.j(bz1Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= h02Var.j(bz1Var3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= h02Var.j(bz1Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= h02Var.j(bz1Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= h02Var.j(bz1Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= h02Var.l(z2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= h02Var.x(j55Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? h02Var.x(c55Var) : h02Var.j(c55Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= h02Var.j(nm0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= h02Var.j(bz1Var7) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= h02Var.x(zn3Var2) ? 16384 : 8192;
        }
        int i7 = i5;
        if (h02Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            float fT = zi6.t(h02Var);
            int i8 = i7 & 14;
            boolean zR = ((i7 & 57344) == 16384) | ((i7 & 112) == 32) | ((i4 & 234881024) == 67108864) | ((i4 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && h02Var.x(c55Var))) | h02Var.r(fT);
            Object objK2 = h02Var.K();
            l76 l76Var = oo0.g;
            if (zR || objK2 == l76Var) {
                k00Var = k00Var4;
                h02Var2 = h02Var;
                in3 in3Var = new in3(xy1Var, z2, j55Var, c55Var, zn3Var2, fT);
                h02Var2.i0(in3Var);
                objK2 = in3Var;
            } else {
                k00Var = k00Var4;
                h02Var2 = h02Var;
            }
            in3 in3Var2 = (in3) objK2;
            fl2 fl2Var = (fl2) h02Var2.a(hp0.c);
            int iS8 = pw5.s(h02Var2);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, r19);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z6 = h02Var2.S;
            sx1 sx1Var = um2.Z;
            if (z6) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            on0 on0Var2 = tg1.w;
            xs2.E(on0Var2, h02Var2, in3Var2);
            on0 on0Var3 = tg1.q;
            xs2.E(on0Var3, h02Var2, tr3VarQ);
            on0 on0Var4 = tg1.c;
            if (h02Var2.S) {
                k00Var2 = r18;
            } else {
                k00Var2 = k00Var5;
                if (!yf2.p(h02Var2.K(), Integer.valueOf(iS8))) {
                }
                on0Var = tg1.m;
                xs2.E(on0Var, h02Var2, j73VarW);
                nm0Var.l(h02Var2, Integer.valueOf((i7 >> 6) & 14));
                c63Var = c63.g;
                if (bz1Var3 != null) {
                    h02Var2.X(2145628269);
                    j73 j73VarN = ue5.X(g73Var, "Leading").n(c63Var);
                    t33 t33VarR = z50.r(k00Var, false);
                    iS7 = pw5.s(h02Var2);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, j73VarN);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR);
                    xs2.E(on0Var3, h02Var2, tr3VarQ2);
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS7))) {
                        du4.f(iS7, h02Var2, iS7, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW2);
                    bz1Var3.l(h02Var2, Integer.valueOf((i4 >> 12) & 14));
                    h02Var2.b(true);
                    z3 = false;
                    h02Var2.b(false);
                } else {
                    z3 = false;
                    h02Var2.X(2145874285);
                    h02Var2.b(false);
                }
                if (bz1Var4 != null) {
                    h02Var2.X(2145917003);
                    j73 j73VarN2 = ue5.X(r19, "Trailing").n(c63Var);
                    t33 t33VarR2 = z50.r(k00Var, z3);
                    iS6 = pw5.s(h02Var2);
                    tr3 tr3VarQ3 = h02Var2.q();
                    j73 j73VarW3 = m50.W(h02Var2, j73VarN2);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR2);
                    xs2.E(on0Var3, h02Var2, tr3VarQ3);
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS6))) {
                        du4.f(iS6, h02Var2, iS6, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW3);
                    bz1Var4.l(h02Var2, Integer.valueOf((i4 >> 15) & 14));
                    h02Var2.b(true);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(2146164941);
                    h02Var2.b(z3);
                }
                zn3Var2 = zn3Var;
                fA = ue5.A(zn3Var2, fl2Var);
                fE = ue5.e(zn3Var2, fl2Var);
                if (bz1Var3 != null) {
                    fA -= fT;
                    if (fA < 0.0f) {
                        fA = 0.0f;
                    }
                }
                f2 = fA;
                if (bz1Var4 != null) {
                    fE -= fT;
                    if (fE < 0.0f) {
                        fE = 0.0f;
                    }
                }
                if (bz1Var5 != null) {
                    h02Var2.X(2146868920);
                    j73 j73VarI1 = ue5.i0(mq4.c(mq4.v(ue5.X(r19, "Prefix"), 24.0f, Float.NaN)), f2, 0.0f, 2.0f, 0.0f, 10);
                    k00Var3 = k00Var2;
                    t33 t33VarR3 = z50.r(k00Var3, false);
                    iS5 = pw5.s(h02Var2);
                    tr3 tr3VarQ4 = h02Var2.q();
                    j73 j73VarW4 = m50.W(h02Var2, j73VarI1);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR3);
                    xs2.E(on0Var3, h02Var2, tr3VarQ4);
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS5))) {
                        du4.f(iS5, h02Var2, iS5, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW4);
                    bz1Var11 = bz1Var5;
                    bz1Var11.l(h02Var2, Integer.valueOf((i4 >> 18) & 14));
                    h02Var2.b(true);
                    h02Var2.b(false);
                } else {
                    bz1Var11 = bz1Var5;
                    k00Var3 = k00Var2;
                    h02Var2.X(2147196621);
                    h02Var2.b(false);
                }
                if (bz1Var6 != null) {
                    h02Var2.X(2147239866);
                    f3 = fE;
                    j73 j73VarI2 = ue5.i0(mq4.c(mq4.v(ue5.X(r19, "Suffix"), 24.0f, Float.NaN)), 2.0f, 0.0f, f3, 0.0f, 10);
                    t33 t33VarR4 = z50.r(k00Var3, false);
                    iS4 = pw5.s(h02Var2);
                    tr3 tr3VarQ5 = h02Var2.q();
                    j73 j73VarW5 = m50.W(h02Var2, j73VarI2);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR4);
                    xs2.E(on0Var3, h02Var2, tr3VarQ5);
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS4))) {
                        du4.f(iS4, h02Var2, iS4, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW5);
                    bz1Var10 = bz1Var6;
                    bz1Var10.l(h02Var2, Integer.valueOf((i4 >> 21) & 14));
                    h02Var2.b(true);
                    h02Var2.b(false);
                } else {
                    f3 = fE;
                    bz1Var10 = bz1Var6;
                    h02Var2.X(-2147401651);
                    h02Var2.b(false);
                }
                j73 j73VarC = mq4.c(mq4.v(r19, 24.0f, Float.NaN));
                if (bz1Var11 == null) {
                    f4 = f2;
                } else {
                    f4 = 0.0f;
                }
                if (bz1Var10 == null) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                j73VarI0 = ue5.i0(j73VarC, f4, 0.0f, f5, 0.0f, 10);
                if (cz1Var != null) {
                    h02Var2.X(-2147031666);
                    cz1Var2 = cz1Var;
                    cz1Var2.x(ue5.X(r19, "Hint").n(j73VarI0), h02Var2, Integer.valueOf((i4 >> 3) & 112));
                    h02Var2.b(false);
                } else {
                    cz1Var2 = cz1Var;
                    h02Var2.X(-2146940371);
                    h02Var2.b(false);
                }
                j73 j73VarN3 = ue5.X(r19, "TextField").n(j73VarI0);
                t33 t33VarR5 = z50.r(k00Var3, true);
                iS = pw5.s(h02Var2);
                tr3 tr3VarQ6 = h02Var2.q();
                j73 j73VarW6 = m50.W(h02Var2, j73VarN3);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR5);
                xs2.E(on0Var3, h02Var2, tr3VarQ6);
                if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS))) {
                    du4.f(iS, h02Var2, iS, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW6);
                du4.o((i4 >> 3) & 14, bz1Var, h02Var2, true);
                if (bz1Var2 != null) {
                    h02Var2.X(-2146287790);
                    if (i8 != 4) {
                        if ((i7 & 8) != 0) {
                            c55Var2 = c55Var;
                            if (h02Var2.j(c55Var2)) {
                            }
                            objK = h02Var2.K();
                            if (z5 || objK == l76Var) {
                                objK = new dn3(c55Var2, (byte) 0);
                                h02Var2.i0(objK);
                            }
                            j73 j73VarN4 = ue5.X(mq4.c(ra.G(r19, new th0((my1) objK, (byte) 3))), "Label").n(r19);
                            t33 t33VarR6 = z50.r(k00Var3, false);
                            iS3 = pw5.s(h02Var2);
                            tr3 tr3VarQ7 = h02Var2.q();
                            j73 j73VarW7 = m50.W(h02Var2, j73VarN4);
                            h02Var2.b0();
                            if (h02Var2.S) {
                                h02Var2.m(sx1Var);
                            } else {
                                h02Var2.l0();
                            }
                            xs2.E(on0Var2, h02Var2, t33VarR6);
                            xs2.E(on0Var3, h02Var2, tr3VarQ7);
                            if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS3))) {
                                du4.f(iS3, h02Var2, iS3, on0Var4);
                            }
                            xs2.E(on0Var, h02Var2, j73VarW7);
                            bz1Var9 = bz1Var2;
                            bz1Var9.l(h02Var2, Integer.valueOf((i4 >> 9) & 14));
                            h02Var2.b(true);
                            h02Var2.b(false);
                        } else {
                            c55Var2 = c55Var;
                        }
                        z5 = false;
                        objK = h02Var2.K();
                        if (z5) {
                            objK = new dn3(c55Var2, (byte) 0);
                            h02Var2.i0(objK);
                        } else {
                            objK = new dn3(c55Var2, (byte) 0);
                            h02Var2.i0(objK);
                        }
                        j73 j73VarN5 = ue5.X(mq4.c(ra.G(r19, new th0((my1) objK, (byte) 3))), "Label").n(r19);
                        t33 t33VarR7 = z50.r(k00Var3, false);
                        iS3 = pw5.s(h02Var2);
                        tr3 tr3VarQ8 = h02Var2.q();
                        j73 j73VarW8 = m50.W(h02Var2, j73VarN5);
                        h02Var2.b0();
                        if (h02Var2.S) {
                            h02Var2.m(sx1Var);
                        } else {
                            h02Var2.l0();
                        }
                        xs2.E(on0Var2, h02Var2, t33VarR7);
                        xs2.E(on0Var3, h02Var2, tr3VarQ8);
                        if (h02Var2.S) {
                            du4.f(iS3, h02Var2, iS3, on0Var4);
                        } else {
                            du4.f(iS3, h02Var2, iS3, on0Var4);
                        }
                        xs2.E(on0Var, h02Var2, j73VarW8);
                        bz1Var9 = bz1Var2;
                        bz1Var9.l(h02Var2, Integer.valueOf((i4 >> 9) & 14));
                        h02Var2.b(true);
                        h02Var2.b(false);
                    } else {
                        c55Var2 = c55Var;
                    }
                    z5 = true;
                    objK = h02Var2.K();
                    if (z5) {
                        objK = new dn3(c55Var2, (byte) 0);
                        h02Var2.i0(objK);
                    } else {
                        objK = new dn3(c55Var2, (byte) 0);
                        h02Var2.i0(objK);
                    }
                    j73 j73VarN6 = ue5.X(mq4.c(ra.G(r19, new th0((my1) objK, (byte) 3))), "Label").n(r19);
                    t33 t33VarR8 = z50.r(k00Var3, false);
                    iS3 = pw5.s(h02Var2);
                    tr3 tr3VarQ9 = h02Var2.q();
                    j73 j73VarW9 = m50.W(h02Var2, j73VarN6);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR8);
                    xs2.E(on0Var3, h02Var2, tr3VarQ9);
                    if (h02Var2.S) {
                        du4.f(iS3, h02Var2, iS3, on0Var4);
                    } else {
                        du4.f(iS3, h02Var2, iS3, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW9);
                    bz1Var9 = bz1Var2;
                    bz1Var9.l(h02Var2, Integer.valueOf((i4 >> 9) & 14));
                    h02Var2.b(true);
                    h02Var2.b(false);
                } else {
                    bz1Var9 = bz1Var2;
                    h02Var2.X(-2145892819);
                    h02Var2.b(false);
                }
                if (bz1Var7 != null) {
                    h02Var2.X(-2145844304);
                    j73 j73VarD0 = ue5.d0(mq4.c(mq4.v(ue5.X(r19, "Supporting"), 16.0f, Float.NaN)), new bo3(16.0f, 4.0f, 16.0f, 0.0f));
                    t33 t33VarR9 = z50.r(k00Var3, false);
                    iS2 = pw5.s(h02Var2);
                    tr3 tr3VarQ10 = h02Var2.q();
                    j73 j73VarW10 = m50.W(h02Var2, j73VarD0);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR9);
                    xs2.E(on0Var3, h02Var2, tr3VarQ10);
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS2))) {
                        du4.f(iS2, h02Var2, iS2, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW10);
                    bz1Var8 = bz1Var7;
                    bz1Var8.l(h02Var2, Integer.valueOf((i7 >> 9) & 14));
                    z4 = true;
                    h02Var2.b(true);
                    h02Var2.b(false);
                } else {
                    bz1Var8 = bz1Var7;
                    z4 = true;
                    h02Var2.X(-2145508915);
                    h02Var2.b(false);
                }
                h02Var2.b(z4);
            }
            du4.f(iS8, h02Var2, iS8, on0Var4);
            on0Var = tg1.m;
            xs2.E(on0Var, h02Var2, j73VarW);
            nm0Var.l(h02Var2, Integer.valueOf((i7 >> 6) & 14));
            c63Var = c63.g;
            if (bz1Var3 != null) {
                h02Var2.X(2145628269);
                j73 j73VarN7 = ue5.X(g73Var, "Leading").n(c63Var);
                t33 t33VarR10 = z50.r(k00Var, false);
                iS7 = pw5.s(h02Var2);
                tr3 tr3VarQ11 = h02Var2.q();
                j73 j73VarW11 = m50.W(h02Var2, j73VarN7);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR10);
                xs2.E(on0Var3, h02Var2, tr3VarQ11);
                if (h02Var2.S) {
                    du4.f(iS7, h02Var2, iS7, on0Var4);
                } else {
                    du4.f(iS7, h02Var2, iS7, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW11);
                bz1Var3.l(h02Var2, Integer.valueOf((i4 >> 12) & 14));
                h02Var2.b(true);
                z3 = false;
                h02Var2.b(false);
            } else {
                z3 = false;
                h02Var2.X(2145874285);
                h02Var2.b(false);
            }
            if (bz1Var4 != null) {
                h02Var2.X(2145917003);
                j73 j73VarN8 = ue5.X(r19, "Trailing").n(c63Var);
                t33 t33VarR11 = z50.r(k00Var, z3);
                iS6 = pw5.s(h02Var2);
                tr3 tr3VarQ12 = h02Var2.q();
                j73 j73VarW12 = m50.W(h02Var2, j73VarN8);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR11);
                xs2.E(on0Var3, h02Var2, tr3VarQ12);
                if (h02Var2.S) {
                    du4.f(iS6, h02Var2, iS6, on0Var4);
                } else {
                    du4.f(iS6, h02Var2, iS6, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW12);
                bz1Var4.l(h02Var2, Integer.valueOf((i4 >> 15) & 14));
                h02Var2.b(true);
                h02Var2.b(false);
            } else {
                h02Var2.X(2146164941);
                h02Var2.b(z3);
            }
            zn3Var2 = zn3Var;
            fA = ue5.A(zn3Var2, fl2Var);
            fE = ue5.e(zn3Var2, fl2Var);
            if (bz1Var3 != null) {
                fA -= fT;
                if (fA < 0.0f) {
                    fA = 0.0f;
                }
            }
            f2 = fA;
            if (bz1Var4 != null) {
                fE -= fT;
                if (fE < 0.0f) {
                    fE = 0.0f;
                }
            }
            if (bz1Var5 != null) {
                h02Var2.X(2146868920);
                j73 j73VarI3 = ue5.i0(mq4.c(mq4.v(ue5.X(r19, "Prefix"), 24.0f, Float.NaN)), f2, 0.0f, 2.0f, 0.0f, 10);
                k00Var3 = k00Var2;
                t33 t33VarR12 = z50.r(k00Var3, false);
                iS5 = pw5.s(h02Var2);
                tr3 tr3VarQ13 = h02Var2.q();
                j73 j73VarW13 = m50.W(h02Var2, j73VarI3);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR12);
                xs2.E(on0Var3, h02Var2, tr3VarQ13);
                if (h02Var2.S) {
                    du4.f(iS5, h02Var2, iS5, on0Var4);
                } else {
                    du4.f(iS5, h02Var2, iS5, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW13);
                bz1Var11 = bz1Var5;
                bz1Var11.l(h02Var2, Integer.valueOf((i4 >> 18) & 14));
                h02Var2.b(true);
                h02Var2.b(false);
            } else {
                bz1Var11 = bz1Var5;
                k00Var3 = k00Var2;
                h02Var2.X(2147196621);
                h02Var2.b(false);
            }
            if (bz1Var6 != null) {
                h02Var2.X(2147239866);
                f3 = fE;
                j73 j73VarI4 = ue5.i0(mq4.c(mq4.v(ue5.X(r19, "Suffix"), 24.0f, Float.NaN)), 2.0f, 0.0f, f3, 0.0f, 10);
                t33 t33VarR13 = z50.r(k00Var3, false);
                iS4 = pw5.s(h02Var2);
                tr3 tr3VarQ14 = h02Var2.q();
                j73 j73VarW14 = m50.W(h02Var2, j73VarI4);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR13);
                xs2.E(on0Var3, h02Var2, tr3VarQ14);
                if (h02Var2.S) {
                    du4.f(iS4, h02Var2, iS4, on0Var4);
                } else {
                    du4.f(iS4, h02Var2, iS4, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW14);
                bz1Var10 = bz1Var6;
                bz1Var10.l(h02Var2, Integer.valueOf((i4 >> 21) & 14));
                h02Var2.b(true);
                h02Var2.b(false);
            } else {
                f3 = fE;
                bz1Var10 = bz1Var6;
                h02Var2.X(-2147401651);
                h02Var2.b(false);
            }
            j73 j73VarC2 = mq4.c(mq4.v(r19, 24.0f, Float.NaN));
            if (bz1Var11 == null) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            if (bz1Var10 == null) {
                f5 = f3;
            } else {
                f5 = 0.0f;
            }
            j73VarI0 = ue5.i0(j73VarC2, f4, 0.0f, f5, 0.0f, 10);
            if (cz1Var != null) {
                h02Var2.X(-2147031666);
                cz1Var2 = cz1Var;
                cz1Var2.x(ue5.X(r19, "Hint").n(j73VarI0), h02Var2, Integer.valueOf((i4 >> 3) & 112));
                h02Var2.b(false);
            } else {
                cz1Var2 = cz1Var;
                h02Var2.X(-2146940371);
                h02Var2.b(false);
            }
            j73 j73VarN9 = ue5.X(r19, "TextField").n(j73VarI0);
            t33 t33VarR14 = z50.r(k00Var3, true);
            iS = pw5.s(h02Var2);
            tr3 tr3VarQ15 = h02Var2.q();
            j73 j73VarW15 = m50.W(h02Var2, j73VarN9);
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            xs2.E(on0Var2, h02Var2, t33VarR14);
            xs2.E(on0Var3, h02Var2, tr3VarQ15);
            if (h02Var2.S) {
                du4.f(iS, h02Var2, iS, on0Var4);
            } else {
                du4.f(iS, h02Var2, iS, on0Var4);
            }
            xs2.E(on0Var, h02Var2, j73VarW15);
            du4.o((i4 >> 3) & 14, bz1Var, h02Var2, true);
            if (bz1Var2 != null) {
                h02Var2.X(-2146287790);
                if (i8 != 4) {
                    if ((i7 & 8) != 0) {
                        c55Var2 = c55Var;
                        if (h02Var2.j(c55Var2)) {
                        }
                        objK = h02Var2.K();
                        if (z5) {
                            objK = new dn3(c55Var2, (byte) 0);
                            h02Var2.i0(objK);
                        } else {
                            objK = new dn3(c55Var2, (byte) 0);
                            h02Var2.i0(objK);
                        }
                        j73 j73VarN10 = ue5.X(mq4.c(ra.G(r19, new th0((my1) objK, (byte) 3))), "Label").n(r19);
                        t33 t33VarR15 = z50.r(k00Var3, false);
                        iS3 = pw5.s(h02Var2);
                        tr3 tr3VarQ16 = h02Var2.q();
                        j73 j73VarW16 = m50.W(h02Var2, j73VarN10);
                        h02Var2.b0();
                        if (h02Var2.S) {
                            h02Var2.m(sx1Var);
                        } else {
                            h02Var2.l0();
                        }
                        xs2.E(on0Var2, h02Var2, t33VarR15);
                        xs2.E(on0Var3, h02Var2, tr3VarQ16);
                        if (h02Var2.S) {
                            du4.f(iS3, h02Var2, iS3, on0Var4);
                        } else {
                            du4.f(iS3, h02Var2, iS3, on0Var4);
                        }
                        xs2.E(on0Var, h02Var2, j73VarW16);
                        bz1Var9 = bz1Var2;
                        bz1Var9.l(h02Var2, Integer.valueOf((i4 >> 9) & 14));
                        h02Var2.b(true);
                        h02Var2.b(false);
                    } else {
                        c55Var2 = c55Var;
                    }
                    z5 = false;
                    objK = h02Var2.K();
                    if (z5) {
                        objK = new dn3(c55Var2, (byte) 0);
                        h02Var2.i0(objK);
                    } else {
                        objK = new dn3(c55Var2, (byte) 0);
                        h02Var2.i0(objK);
                    }
                    j73 j73VarN11 = ue5.X(mq4.c(ra.G(r19, new th0((my1) objK, (byte) 3))), "Label").n(r19);
                    t33 t33VarR16 = z50.r(k00Var3, false);
                    iS3 = pw5.s(h02Var2);
                    tr3 tr3VarQ17 = h02Var2.q();
                    j73 j73VarW17 = m50.W(h02Var2, j73VarN11);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var2, h02Var2, t33VarR16);
                    xs2.E(on0Var3, h02Var2, tr3VarQ17);
                    if (h02Var2.S) {
                        du4.f(iS3, h02Var2, iS3, on0Var4);
                    } else {
                        du4.f(iS3, h02Var2, iS3, on0Var4);
                    }
                    xs2.E(on0Var, h02Var2, j73VarW17);
                    bz1Var9 = bz1Var2;
                    bz1Var9.l(h02Var2, Integer.valueOf((i4 >> 9) & 14));
                    h02Var2.b(true);
                    h02Var2.b(false);
                } else {
                    c55Var2 = c55Var;
                }
                z5 = true;
                objK = h02Var2.K();
                if (z5) {
                    objK = new dn3(c55Var2, (byte) 0);
                    h02Var2.i0(objK);
                } else {
                    objK = new dn3(c55Var2, (byte) 0);
                    h02Var2.i0(objK);
                }
                j73 j73VarN12 = ue5.X(mq4.c(ra.G(r19, new th0((my1) objK, (byte) 3))), "Label").n(r19);
                t33 t33VarR17 = z50.r(k00Var3, false);
                iS3 = pw5.s(h02Var2);
                tr3 tr3VarQ18 = h02Var2.q();
                j73 j73VarW18 = m50.W(h02Var2, j73VarN12);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR17);
                xs2.E(on0Var3, h02Var2, tr3VarQ18);
                if (h02Var2.S) {
                    du4.f(iS3, h02Var2, iS3, on0Var4);
                } else {
                    du4.f(iS3, h02Var2, iS3, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW18);
                bz1Var9 = bz1Var2;
                bz1Var9.l(h02Var2, Integer.valueOf((i4 >> 9) & 14));
                h02Var2.b(true);
                h02Var2.b(false);
            } else {
                bz1Var9 = bz1Var2;
                h02Var2.X(-2145892819);
                h02Var2.b(false);
            }
            if (bz1Var7 != null) {
                h02Var2.X(-2145844304);
                j73 j73VarD1 = ue5.d0(mq4.c(mq4.v(ue5.X(r19, "Supporting"), 16.0f, Float.NaN)), new bo3(16.0f, 4.0f, 16.0f, 0.0f));
                t33 t33VarR18 = z50.r(k00Var3, false);
                iS2 = pw5.s(h02Var2);
                tr3 tr3VarQ19 = h02Var2.q();
                j73 j73VarW19 = m50.W(h02Var2, j73VarD1);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var2, h02Var2, t33VarR18);
                xs2.E(on0Var3, h02Var2, tr3VarQ19);
                if (h02Var2.S) {
                    du4.f(iS2, h02Var2, iS2, on0Var4);
                } else {
                    du4.f(iS2, h02Var2, iS2, on0Var4);
                }
                xs2.E(on0Var, h02Var2, j73VarW19);
                bz1Var8 = bz1Var7;
                bz1Var8.l(h02Var2, Integer.valueOf((i7 >> 9) & 14));
                z4 = true;
                h02Var2.b(true);
                h02Var2.b(false);
            } else {
                bz1Var8 = bz1Var7;
                z4 = true;
                h02Var2.X(-2145508915);
                h02Var2.b(false);
            }
            h02Var2.b(z4);
        } else {
            bz1Var8 = bz1Var7;
            cz1Var2 = cz1Var;
            bz1Var9 = bz1Var2;
            bz1Var10 = bz1Var6;
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            final bz1 bz1Var12 = bz1Var9;
            final bz1 bz1Var13 = bz1Var10;
            final cz1 cz1Var3 = cz1Var2;
            final zn3 zn3Var3 = zn3Var2;
            final bz1 bz1Var14 = bz1Var8;
            u34VarP.n = new bz1() { // from class: en3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i2 | 1);
                    int iJ2 = aq2.J(i3);
                    ec6.y(bz1Var, cz1Var3, bz1Var12, bz1Var3, bz1Var4, bz1Var5, bz1Var13, z2, j55Var, c55Var, xy1Var, nm0Var, bz1Var14, zn3Var3, (h02) obj, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }
}
