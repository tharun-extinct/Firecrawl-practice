package defpackage;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fb6 {
    public static final sj0 A;
    public static final sj0 B;
    public static final sj0 C;
    public static final sj0 D;
    public static boolean E = true;
    public static Field F;
    public static boolean G;
    public static final float a;
    public static final sj0 b;
    public static final float c;
    public static final sj0 d;
    public static final sj0 e;
    public static final sj0 f;
    public static final sj0 g;
    public static final sj0 h;
    public static final sj0 i;
    public static final sj0 j;
    public static final sj0 k;
    public static final float l;
    public static final sj0 m;
    public static final sj0 n;
    public static final sj0 o;
    public static final sj0 p;
    public static final float q;
    public static final sj0 r;
    public static final sj0 s;
    public static final sj0 t;
    public static final sj0 u;
    public static final float v;
    public static final sj0 w;
    public static final sj0 x;
    public static final sj0 y;
    public static final sj0 z;

    static {
        sj0 sj0Var = sj0.b;
        g = sj0Var;
        sj0 sj0Var2 = sj0.u;
        y = sj0Var2;
        r = sj0.A;
        sj0 sj0Var3 = sj0.i;
        n = sj0Var3;
        v = 0.38f;
        x = sj0Var3;
        l = 0.38f;
        j = sj0Var3;
        t = sj0Var3;
        a = 0.38f;
        m = sj0Var3;
        q = 0.38f;
        w = sj0Var3;
        c = 0.38f;
        sj0 sj0Var4 = sj0.j;
        i = sj0Var4;
        b = sj0Var4;
        s = sj0Var3;
        p = sj0Var4;
        u = sj0Var;
        z = sj0Var4;
        h = sj0Var2;
        o = sj0Var3;
        f = sj0Var2;
        k = sj0Var;
        d = sj0Var;
        e = sj0Var3;
        A = sj0Var;
        B = sj0Var;
        C = sj0Var;
        D = sj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0178  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2 A[PHI: r2 r3 r4 r5
  0x00d2: PHI (r2v22 int) = (r2v14 int), (r2v24 int), (r2v25 int) binds: [B:91:0x00ff, B:79:0x00ce, B:80:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r3v15 cn4) = (r3v5 cn4), (r3v2 cn4), (r3v2 cn4) binds: [B:91:0x00ff, B:79:0x00ce, B:80:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r4v12 sb0) = (r4v5 sb0), (r4v2 sb0), (r4v2 sb0) binds: [B:91:0x00ff, B:79:0x00ce, B:80:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r5v10 tb0) = (r5v5 tb0), (r5v2 tb0), (r5v2 tb0) binds: [B:91:0x00ff, B:79:0x00ce, B:80:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b  */
    public static final void g(j73 j73Var, cn4 cn4Var, sb0 sb0Var, tb0 tb0Var, z40 z40Var, nm0 nm0Var, h02 h02Var, int i2, int i3) {
        int i4;
        cn4 cn4VarY;
        sb0 sb0VarX;
        tb0 tb0VarV;
        z40 z40Var2;
        boolean z2;
        cn4 cn4Var2;
        sb0 sb0Var2;
        tb0 tb0Var2;
        z40 z40Var3;
        u34 u34VarP;
        z40 z40Var4;
        cn4 cn4Var3;
        float f2;
        Object objK;
        int i5;
        h02Var.Z(1359693790);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.x(j73Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                cn4VarY = cn4Var;
                int i6 = h02Var.x(cn4VarY) ? 32 : 16;
                i4 |= i6;
            } else {
                cn4VarY = cn4Var;
            }
            i4 |= i6;
        } else {
            cn4VarY = cn4Var;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                sb0VarX = sb0Var;
                int i7 = h02Var.x(sb0VarX) ? 256 : 128;
                i4 |= i7;
            } else {
                sb0VarX = sb0Var;
            }
            i4 |= i7;
        } else {
            sb0VarX = sb0Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                tb0VarV = tb0Var;
                int i8 = h02Var.x(tb0VarV) ? 2048 : 1024;
                i4 |= i8;
            } else {
                tb0VarV = tb0Var;
            }
            i4 |= i8;
        } else {
            tb0VarV = tb0Var;
        }
        int i9 = i3 & 16;
        if (i9 == 0) {
            if ((i2 & 24576) == 0) {
                z40Var2 = z40Var;
                i4 |= h02Var.x(z40Var2) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                if (h02Var.j(nm0Var)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i4 & 1, z2)) {
                h02Var.S();
                if ((i2 & 1) != 0 || h02Var.k()) {
                    if ((i3 & 2) != 0) {
                        cn4VarY = vn4.y(gb6.y, h02Var);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        sb0VarX = eb6.x((rj0) h02Var.a(tj0.g));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        tb0VarV = eb6.v(63);
                        i4 &= -7169;
                    }
                    if (i9 != 0) {
                        z40Var4 = null;
                        cn4Var3 = cn4VarY;
                    }
                    h02Var.s();
                    long j2 = sb0VarX.g;
                    long j3 = sb0VarX.y;
                    f2 = tb0VarV.g;
                    h02Var.X(-1763481333);
                    h02Var.X(167751211);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = kq2.M(new vb1(f2));
                        h02Var.i0(objK);
                    }
                    h02Var.b(false);
                    h02Var.b(false);
                    uz4.g(j73Var, cn4Var3, j2, j3, 0.0f, ((vb1) ((ob3) objK).getValue()).j, z40Var4, ue5.m0(-97109725, new wb0(nm0Var, (byte) 0), h02Var), h02Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
                    sb0Var2 = sb0VarX;
                    tb0Var2 = tb0VarV;
                    cn4Var2 = cn4Var3;
                    z40Var3 = z40Var4;
                } else {
                    h02Var.Q();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                }
                cn4Var3 = cn4VarY;
                z40Var4 = z40Var2;
                h02Var.s();
                long j4 = sb0VarX.g;
                long j5 = sb0VarX.y;
                f2 = tb0VarV.g;
                h02Var.X(-1763481333);
                h02Var.X(167751211);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = kq2.M(new vb1(f2));
                    h02Var.i0(objK);
                }
                h02Var.b(false);
                h02Var.b(false);
                uz4.g(j73Var, cn4Var3, j4, j5, 0.0f, ((vb1) ((ob3) objK).getValue()).j, z40Var4, ue5.m0(-97109725, new wb0(nm0Var, (byte) 0), h02Var), h02Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
                sb0Var2 = sb0VarX;
                tb0Var2 = tb0VarV;
                cn4Var2 = cn4Var3;
                z40Var3 = z40Var4;
            } else {
                h02Var.Q();
                cn4Var2 = cn4VarY;
                sb0Var2 = sb0VarX;
                tb0Var2 = tb0VarV;
                z40Var3 = z40Var2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new ub0(j73Var, cn4Var2, sb0Var2, tb0Var2, z40Var3, nm0Var, i2, i3, (byte) 0);
            }
        }
        i4 |= 24576;
        z40Var2 = z40Var;
        if ((196608 & i2) == 0) {
            if (h02Var.j(nm0Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i4 & 1, z2)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if ((i3 & 2) != 0) {
                    cn4VarY = vn4.y(gb6.y, h02Var);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    sb0VarX = eb6.x((rj0) h02Var.a(tj0.g));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    tb0VarV = eb6.v(63);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    z40Var4 = null;
                    cn4Var3 = cn4VarY;
                } else {
                    cn4Var3 = cn4VarY;
                    z40Var4 = z40Var2;
                }
            } else {
                if ((i3 & 2) != 0) {
                    cn4VarY = vn4.y(gb6.y, h02Var);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    sb0VarX = eb6.x((rj0) h02Var.a(tj0.g));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    tb0VarV = eb6.v(63);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    z40Var4 = null;
                    cn4Var3 = cn4VarY;
                } else {
                    cn4Var3 = cn4VarY;
                    z40Var4 = z40Var2;
                }
            }
            h02Var.s();
            long j6 = sb0VarX.g;
            long j7 = sb0VarX.y;
            f2 = tb0VarV.g;
            h02Var.X(-1763481333);
            h02Var.X(167751211);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = kq2.M(new vb1(f2));
                h02Var.i0(objK);
            }
            h02Var.b(false);
            h02Var.b(false);
            uz4.g(j73Var, cn4Var3, j6, j7, 0.0f, ((vb1) ((ob3) objK).getValue()).j, z40Var4, ue5.m0(-97109725, new wb0(nm0Var, (byte) 0), h02Var), h02Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
            sb0Var2 = sb0VarX;
            tb0Var2 = tb0VarV;
            cn4Var2 = cn4Var3;
            z40Var3 = z40Var4;
        } else {
            h02Var.Q();
            cn4Var2 = cn4VarY;
            sb0Var2 = sb0VarX;
            tb0Var2 = tb0VarV;
            z40Var3 = z40Var2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ub0(j73Var, cn4Var2, sb0Var2, tb0Var2, z40Var3, nm0Var, i2, i3, (byte) 0);
        }
    }

    public static final void r(j73 j73Var, cn4 cn4Var, sb0 sb0Var, tb0 tb0Var, z40 z40Var, nm0 nm0Var, h02 h02Var, int i2, int i3) {
        j73 j73Var2;
        int i4;
        cn4 cn4Var2;
        sb0 sb0Var2;
        tb0 tb0Var2;
        z40 z40Var2;
        j73 j73Var3;
        j73 j73Var4;
        cn4 cn4VarY;
        int i5;
        z40 z40Var3;
        sb0 sb0Var3;
        tb0 tb0Var3;
        h02Var.Z(-1945643296);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            j73Var2 = j73Var;
        } else if ((i2 & 6) == 0) {
            j73Var2 = j73Var;
            i4 = i2 | (h02Var.x(j73Var2) ? 4 : 2);
        } else {
            j73Var2 = j73Var;
            i4 = i2;
        }
        int i7 = i4 | 9360;
        if (h02Var.N(i7 & 1, (74899 & i7) != 74898)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                j73Var4 = i6 != 0 ? g73.g : j73Var2;
                cn4VarY = vn4.y(vc6.y, h02Var);
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                sb0 sb0Var4 = rj0Var.c0;
                if (sb0Var4 == null) {
                    sj0 sj0Var = vc6.g;
                    sb0 sb0Var5 = new sb0(tj0.n(rj0Var, sj0Var), tj0.g(rj0Var, tj0.n(rj0Var, sj0Var)), tj0.n(rj0Var, sj0Var), jj0.y(0.38f, tj0.g(rj0Var, tj0.n(rj0Var, sj0Var))));
                    rj0Var.c0 = sb0Var5;
                    sb0Var4 = sb0Var5;
                }
                tb0 tb0Var4 = new tb0(0.0f, 0.0f, 0.0f, 0.0f, vc6.r, 0.0f);
                h02Var.X(2106932974);
                long jV = tj0.v(vc6.n, h02Var);
                h02Var.b(false);
                boolean zV = h02Var.v(jV);
                Object objK = h02Var.K();
                if (zV || objK == oo0.g) {
                    objK = gp4.x(vc6.v, jV);
                    h02Var.i0(objK);
                }
                i5 = i7 & (-65521);
                z40Var3 = (z40) objK;
                sb0Var3 = sb0Var4;
                tb0Var3 = tb0Var4;
            } else {
                h02Var.Q();
                int i8 = i7 & (-65521);
                sb0Var3 = sb0Var;
                tb0Var3 = tb0Var;
                z40Var3 = z40Var;
                i5 = i8;
                j73Var4 = j73Var2;
                cn4VarY = cn4Var;
            }
            h02Var.s();
            g(j73Var4, cn4VarY, sb0Var3, tb0Var3, z40Var3, nm0Var, h02Var, 524286 & i5, 0);
            j73Var3 = j73Var4;
            cn4Var2 = cn4VarY;
            sb0Var2 = sb0Var3;
            tb0Var2 = tb0Var3;
            z40Var2 = z40Var3;
        } else {
            h02Var.Q();
            cn4Var2 = cn4Var;
            sb0Var2 = sb0Var;
            tb0Var2 = tb0Var;
            z40Var2 = z40Var;
            j73Var3 = j73Var2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ub0(j73Var3, cn4Var2, sb0Var2, tb0Var2, z40Var2, nm0Var, i2, i3, (byte) 1);
        }
    }

    public static final boolean v(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static final void y(j73 j73Var, cn4 cn4Var, sb0 sb0Var, tb0 tb0Var, nm0 nm0Var, h02 h02Var, int i2) {
        cn4 cn4Var2;
        sb0 sb0Var2;
        tb0 tb0Var2;
        int i3;
        cn4 cn4Var3;
        sb0 sb0Var3;
        tb0 tb0Var3;
        h02Var.Z(-1464672362);
        int i4 = i2 | (h02Var.x(j73Var) ? 4 : 2) | 1168;
        if (h02Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                cn4 cn4VarY = vn4.y(db6.r, h02Var);
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                sb0 sb0Var4 = rj0Var.b0;
                if (sb0Var4 == null) {
                    sj0 sj0Var = db6.g;
                    long jN = tj0.n(rj0Var, sj0Var);
                    long jG = tj0.g(rj0Var, tj0.n(rj0Var, sj0Var));
                    sj0 sj0Var2 = db6.n;
                    sb0 sb0Var5 = new sb0(jN, jG, ra.c(jj0.y(db6.x, tj0.n(rj0Var, sj0Var2)), tj0.n(rj0Var, sj0Var2)), jj0.y(0.38f, tj0.g(rj0Var, tj0.n(rj0Var, sj0Var))));
                    rj0Var.b0 = sb0Var5;
                    sb0Var4 = sb0Var5;
                }
                sb0 sb0Var6 = sb0Var4;
                i3 = i4 & (-8177);
                cn4Var3 = cn4VarY;
                sb0Var3 = sb0Var6;
                tb0Var3 = new tb0(db6.y, db6.a, db6.j, db6.t, db6.l, db6.v);
            } else {
                h02Var.Q();
                sb0Var3 = sb0Var;
                tb0Var3 = tb0Var;
                i3 = i4 & (-8177);
                cn4Var3 = cn4Var;
            }
            h02Var.s();
            g(j73Var, cn4Var3, sb0Var3, tb0Var3, null, nm0Var, h02Var, (i3 & 14) | 221184, 0);
            sb0Var2 = sb0Var3;
            tb0Var2 = tb0Var3;
            cn4Var2 = cn4Var3;
        } else {
            h02Var.Q();
            cn4Var2 = cn4Var;
            sb0Var2 = sb0Var;
            tb0Var2 = tb0Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vb0(j73Var, cn4Var2, sb0Var2, tb0Var2, nm0Var, i2, (byte) 0);
        }
    }

    public float n(View view) {
        if (E) {
            try {
                return lm5.g(view);
            } catch (NoSuchMethodError unused) {
                E = false;
            }
        }
        return view.getAlpha();
    }

    public void x(View view, float f2) {
        if (E) {
            try {
                lm5.y(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                E = false;
            }
        }
        view.setAlpha(f2);
    }
}
