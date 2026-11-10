package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oy0 {
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void g(int i, nm0 nm0Var, h02 h02Var, boolean z) {
        h02Var.Z(196311415);
        int i2 = i | 6;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new ad2();
                h02Var.i0(objK);
            }
            wt3.g((ad2) objK, nm0Var, h02Var, 48);
            z = true;
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new db(z, (jz1) nm0Var, i, (byte) 2);
        }
    }

    public static Animator n(Context context, int i) {
        return AnimatorInflater.loadAnimator(context, i);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0234  */
    /* JADX WARN: Code duplicated, block: B:153:0x0260  */
    /* JADX WARN: Code duplicated, block: B:154:0x0264  */
    /* JADX WARN: Code duplicated, block: B:159:0x027f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0299  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:174:0x030d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0326  */
    /* JADX WARN: Code duplicated, block: B:179:0x032b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0330  */
    /* JADX WARN: Code duplicated, block: B:184:0x0335  */
    /* JADX WARN: Code duplicated, block: B:187:0x033e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0378  */
    /* JADX WARN: Code duplicated, block: B:190:0x037c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0397  */
    /* JADX WARN: Code duplicated, block: B:197:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:199:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:201:0x0401  */
    /* JADX WARN: Code duplicated, block: B:202:0x0405  */
    /* JADX WARN: Code duplicated, block: B:207:0x0420  */
    /* JADX WARN: Code duplicated, block: B:209:0x043c  */
    /* JADX WARN: Code duplicated, block: B:212:0x045a  */
    /* JADX WARN: Code duplicated, block: B:214:0x046b  */
    /* JADX WARN: Code duplicated, block: B:216:0x046f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0478  */
    /* JADX WARN: Code duplicated, block: B:221:0x047c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0485  */
    /* JADX WARN: Code duplicated, block: B:227:0x0489  */
    /* JADX WARN: Code duplicated, block: B:230:0x04be  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:234:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:236:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:239:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:242:0x0514  */
    /* JADX WARN: Code duplicated, block: B:243:0x0517  */
    /* JADX WARN: Code duplicated, block: B:245:0x051b  */
    /* JADX WARN: Code duplicated, block: B:246:0x051e  */
    /* JADX WARN: Code duplicated, block: B:249:0x052c  */
    /* JADX WARN: Code duplicated, block: B:250:0x054e  */
    /* JADX WARN: Code duplicated, block: B:253:0x057c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0580  */
    /* JADX WARN: Code duplicated, block: B:259:0x059b  */
    /* JADX WARN: Code duplicated, block: B:262:0x05af  */
    /* JADX WARN: Code duplicated, block: B:264:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:265:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:270:0x060a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0626  */
    public static final void r(bz1 bz1Var, final bz1 bz1Var2, cz1 cz1Var, final bz1 bz1Var3, final bz1 bz1Var4, bz1 bz1Var5, final bz1 bz1Var6, final boolean z, final j55 j55Var, final c55 c55Var, final nm0 nm0Var, bz1 bz1Var7, zn3 zn3Var, h02 h02Var, final int i, final int i2) {
        int i3;
        int i4;
        bz1 bz1Var8;
        cz1 cz1Var2;
        k00 k00Var;
        on0 on0Var;
        c63 c63Var;
        boolean z2;
        float fA;
        float fE;
        float fT;
        float f;
        float f2;
        k00 k00Var2;
        j73 j73VarI0;
        float f3;
        float f4;
        j73 j73VarI1;
        int iS;
        boolean z3;
        int iS2;
        c55 c55Var2;
        boolean z4;
        Object objK;
        int iS3;
        int iS4;
        int iS5;
        int iS6;
        int iS7;
        final bz1 bz1Var9 = bz1Var;
        final bz1 bz1Var10 = bz1Var5;
        zn3 zn3Var2 = zn3Var;
        k00 k00Var3 = hi0.w;
        k00 k00Var4 = hi0.t;
        h02Var.Z(-1086465551);
        int i5 = i & 6;
        g73 g73Var = g73.g;
        if (i5 == 0) {
            i3 = i | (h02Var.x(g73Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var.j(bz1Var9) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= h02Var.j(bz1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= h02Var.j(cz1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= h02Var.j(bz1Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= h02Var.j(bz1Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= h02Var.j(bz1Var10) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= h02Var.j(bz1Var6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= h02Var.l(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= h02Var.x(j55Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? h02Var.x(c55Var) : h02Var.j(c55Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var.j(bz1Var7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var.x(zn3Var2) ? 2048 : 1024;
        }
        int i7 = i4;
        if (h02Var.N(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            float fJ = zi6.j(h02Var);
            int i8 = i7 & 14;
            boolean zR = ((i7 & 7168) == 2048) | ((i6 & 234881024) == 67108864) | ((i6 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && h02Var.x(c55Var))) | h02Var.r(fJ);
            Object objK2 = h02Var.K();
            Object obj = oo0.g;
            if (zR || objK2 == obj) {
                Object l55Var = new l55(z, j55Var, c55Var, zn3Var2, fJ);
                h02Var.i0(l55Var);
                objK2 = l55Var;
            }
            l55 l55Var2 = (l55) objK2;
            fl2 fl2Var = (fl2) h02Var.a(hp0.c);
            int iS8 = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, r26);
            jo0.n.getClass();
            h02Var.b0();
            boolean z5 = h02Var.S;
            my1 my1Var = um2.Z;
            if (z5) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var2 = tg1.w;
            xs2.E(on0Var2, h02Var, l55Var2);
            on0 on0Var3 = tg1.q;
            xs2.E(on0Var3, h02Var, tr3VarQ);
            on0 on0Var4 = tg1.c;
            if (h02Var.S) {
                k00Var = r18;
            } else {
                k00Var = k00Var4;
                if (!yf2.p(h02Var.K(), Integer.valueOf(iS8))) {
                }
                on0Var = tg1.m;
                xs2.E(on0Var, h02Var, j73VarW);
                nm0Var.l(h02Var, Integer.valueOf((r17 >> 3) & 14));
                c63Var = c63.g;
                if (bz1Var3 != null) {
                    h02Var.X(-1445181094);
                    j73 j73VarX = ue5.X(r26, "Leading");
                    f72 f72Var = ye2.g;
                    j73 j73VarN = j73VarX.n(c63Var);
                    t33 t33VarR = z50.r(k00Var3, false);
                    iS7 = pw5.s(h02Var);
                    tr3 tr3VarQ2 = h02Var.q();
                    j73 j73VarW2 = m50.W(h02Var, j73VarN);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR);
                    xs2.E(on0Var3, h02Var, tr3VarQ2);
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS7))) {
                        du4.f(iS7, h02Var, iS7, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW2);
                    bz1Var3.l(h02Var, Integer.valueOf((i6 >> 12) & 14));
                    h02Var.b(true);
                    z2 = false;
                    h02Var.b(false);
                } else {
                    z2 = false;
                    h02Var.X(-1444935078);
                    h02Var.b(false);
                }
                if (bz1Var4 != null) {
                    h02Var.X(-1444892360);
                    j73 j73VarX2 = ue5.X(r26, "Trailing");
                    f72 f72Var2 = ye2.g;
                    j73 j73VarN2 = j73VarX2.n(c63Var);
                    t33 t33VarR2 = z50.r(r16, z2);
                    iS6 = pw5.s(h02Var);
                    tr3 tr3VarQ3 = h02Var.q();
                    j73 j73VarW3 = m50.W(h02Var, j73VarN2);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR2);
                    xs2.E(on0Var3, h02Var, tr3VarQ3);
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS6))) {
                        du4.f(iS6, h02Var, iS6, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW3);
                    bz1Var4.l(h02Var, Integer.valueOf((i6 >> 15) & 14));
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1444644422);
                    h02Var.b(z2);
                }
                zn3Var2 = zn3Var;
                fA = ue5.A(zn3Var2, fl2Var);
                fE = ue5.e(zn3Var2, fl2Var);
                fT = zi6.t(h02Var);
                if (bz1Var3 != null) {
                    fA -= fT;
                    if (fA < 0.0f) {
                        fA = 0.0f;
                    }
                }
                f = fA;
                if (bz1Var4 != null) {
                    fE -= fT;
                    if (fE < 0.0f) {
                        fE = 0.0f;
                    }
                }
                f2 = fE;
                if (bz1Var5 != null) {
                    h02Var.X(-1443868027);
                    j73 j73VarI2 = ue5.i0(mq4.c(mq4.v(ue5.X(r26, "Prefix"), 24.0f, Float.NaN)), f, 0.0f, 2.0f, 0.0f, 10);
                    k00Var2 = k00Var;
                    t33 t33VarR3 = z50.r(k00Var2, false);
                    iS5 = pw5.s(h02Var);
                    tr3 tr3VarQ4 = h02Var.q();
                    j73 j73VarW4 = m50.W(h02Var, j73VarI2);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR3);
                    xs2.E(on0Var3, h02Var, tr3VarQ4);
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS5))) {
                        du4.f(iS5, h02Var, iS5, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW4);
                    bz1Var10 = bz1Var5;
                    bz1Var10.l(h02Var, Integer.valueOf((i6 >> 18) & 14));
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    bz1Var10 = bz1Var5;
                    k00Var2 = k00Var;
                    h02Var.X(-1443540326);
                    h02Var.b(false);
                }
                if (bz1Var6 != null) {
                    h02Var.X(-1443497081);
                    j73 j73VarI3 = ue5.i0(mq4.c(mq4.v(ue5.X(r26, "Suffix"), 24.0f, Float.NaN)), 2.0f, 0.0f, f2, 0.0f, 10);
                    t33 t33VarR4 = z50.r(k00Var2, false);
                    iS4 = pw5.s(h02Var);
                    tr3 tr3VarQ5 = h02Var.q();
                    j73 j73VarW5 = m50.W(h02Var, j73VarI3);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR4);
                    xs2.E(on0Var3, h02Var, tr3VarQ5);
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS4))) {
                        du4.f(iS4, h02Var, iS4, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW5);
                    bz1Var6.l(h02Var, Integer.valueOf((i6 >> 21) & 14));
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1443171302);
                    h02Var.b(false);
                }
                j73VarI0 = ue5.i0(r26, f, 0.0f, f2, 0.0f, 10);
                if (bz1Var2 != null) {
                    h02Var.X(-1442671489);
                    j73 j73VarX3 = ue5.X(g73Var, "Label");
                    if (i8 != 4) {
                        if ((i7 & 8) != 0) {
                            c55Var2 = c55Var;
                            if (h02Var.j(c55Var2)) {
                            }
                            objK = h02Var.K();
                            if (z4 || objK == obj) {
                                objK = new dn3(c55Var2, (byte) 1);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN3 = mq4.c(ra.G(j73VarX3, new th0((my1) objK, (byte) 3))).n(j73VarI0);
                            t33 t33VarR5 = z50.r(k00Var2, false);
                            iS3 = pw5.s(h02Var);
                            tr3 tr3VarQ6 = h02Var.q();
                            j73 j73VarW6 = m50.W(h02Var, j73VarN3);
                            h02Var.b0();
                            if (h02Var.S) {
                                h02Var.m(my1Var);
                            } else {
                                h02Var.l0();
                            }
                            xs2.E(on0Var2, h02Var, t33VarR5);
                            xs2.E(on0Var3, h02Var, tr3VarQ6);
                            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS3))) {
                                du4.f(iS3, h02Var, iS3, on0Var4);
                            }
                            xs2.E(on0Var, h02Var, j73VarW6);
                            bz1Var2.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
                            h02Var.b(true);
                            h02Var.b(false);
                        } else {
                            c55Var2 = c55Var;
                        }
                        z4 = false;
                        objK = h02Var.K();
                        if (z4) {
                            objK = new dn3(c55Var2, (byte) 1);
                            h02Var.i0(objK);
                        } else {
                            objK = new dn3(c55Var2, (byte) 1);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN4 = mq4.c(ra.G(j73VarX3, new th0((my1) objK, (byte) 3))).n(j73VarI0);
                        t33 t33VarR6 = z50.r(k00Var2, false);
                        iS3 = pw5.s(h02Var);
                        tr3 tr3VarQ7 = h02Var.q();
                        j73 j73VarW7 = m50.W(h02Var, j73VarN4);
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(my1Var);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(on0Var2, h02Var, t33VarR6);
                        xs2.E(on0Var3, h02Var, tr3VarQ7);
                        if (h02Var.S) {
                            du4.f(iS3, h02Var, iS3, on0Var4);
                        } else {
                            du4.f(iS3, h02Var, iS3, on0Var4);
                        }
                        xs2.E(on0Var, h02Var, j73VarW7);
                        bz1Var2.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
                        h02Var.b(true);
                        h02Var.b(false);
                    } else {
                        c55Var2 = c55Var;
                    }
                    z4 = true;
                    objK = h02Var.K();
                    if (z4) {
                        objK = new dn3(c55Var2, (byte) 1);
                        h02Var.i0(objK);
                    } else {
                        objK = new dn3(c55Var2, (byte) 1);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN5 = mq4.c(ra.G(j73VarX3, new th0((my1) objK, (byte) 3))).n(j73VarI0);
                    t33 t33VarR7 = z50.r(k00Var2, false);
                    iS3 = pw5.s(h02Var);
                    tr3 tr3VarQ8 = h02Var.q();
                    j73 j73VarW8 = m50.W(h02Var, j73VarN5);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR7);
                    xs2.E(on0Var3, h02Var, tr3VarQ8);
                    if (h02Var.S) {
                        du4.f(iS3, h02Var, iS3, on0Var4);
                    } else {
                        du4.f(iS3, h02Var, iS3, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW8);
                    bz1Var2.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1442276518);
                    h02Var.b(false);
                }
                j73 j73VarC = mq4.c(mq4.v(g73Var, 24.0f, Float.NaN));
                if (bz1Var10 == null) {
                    f3 = f;
                } else {
                    f3 = 0.0f;
                }
                if (bz1Var6 == null) {
                    f4 = f2;
                } else {
                    f4 = 0.0f;
                }
                j73VarI1 = ue5.i0(j73VarC, f3, 0.0f, f4, 0.0f, 10);
                if (cz1Var != null) {
                    h02Var.X(-1441906533);
                    cz1Var2 = cz1Var;
                    cz1Var2.x(ue5.X(g73Var, "Hint").n(j73VarI1), h02Var, Integer.valueOf((i6 >> 6) & 112));
                    h02Var.b(false);
                } else {
                    cz1Var2 = cz1Var;
                    h02Var.X(-1441815238);
                    h02Var.b(false);
                }
                j73 j73VarN6 = ue5.X(g73Var, "TextField").n(j73VarI1);
                t33 t33VarR8 = z50.r(k00Var2, true);
                iS = pw5.s(h02Var);
                tr3 tr3VarQ9 = h02Var.q();
                j73 j73VarW9 = m50.W(h02Var, j73VarN6);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR8);
                xs2.E(on0Var3, h02Var, tr3VarQ9);
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                    du4.f(iS, h02Var, iS, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW9);
                bz1Var9 = bz1Var;
                du4.o((i6 >> 3) & 14, bz1Var9, h02Var, true);
                if (bz1Var7 != null) {
                    h02Var.X(-1441566587);
                    j73 j73VarD0 = ue5.d0(mq4.c(mq4.v(ue5.X(g73Var, "Supporting"), 16.0f, Float.NaN)), new bo3(16.0f, 4.0f, 16.0f, 0.0f));
                    t33 t33VarR9 = z50.r(k00Var2, false);
                    iS2 = pw5.s(h02Var);
                    tr3 tr3VarQ10 = h02Var.q();
                    j73 j73VarW10 = m50.W(h02Var, j73VarD0);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR9);
                    xs2.E(on0Var3, h02Var, tr3VarQ10);
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                        du4.f(iS2, h02Var, iS2, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW10);
                    bz1Var8 = bz1Var7;
                    bz1Var8.l(h02Var, Integer.valueOf((r17 >> 6) & 14));
                    z3 = true;
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    bz1Var8 = bz1Var7;
                    z3 = true;
                    h02Var.X(-1441177382);
                    h02Var.b(false);
                }
                h02Var.b(z3);
            }
            du4.f(iS8, h02Var, iS8, on0Var4);
            on0Var = tg1.m;
            xs2.E(on0Var, h02Var, j73VarW);
            nm0Var.l(h02Var, Integer.valueOf((r17 >> 3) & 14));
            c63Var = c63.g;
            if (bz1Var3 != null) {
                h02Var.X(-1445181094);
                j73 j73VarX4 = ue5.X(r26, "Leading");
                f72 f72Var3 = ye2.g;
                j73 j73VarN7 = j73VarX4.n(c63Var);
                t33 t33VarR10 = z50.r(k00Var3, false);
                iS7 = pw5.s(h02Var);
                tr3 tr3VarQ11 = h02Var.q();
                j73 j73VarW11 = m50.W(h02Var, j73VarN7);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR10);
                xs2.E(on0Var3, h02Var, tr3VarQ11);
                if (h02Var.S) {
                    du4.f(iS7, h02Var, iS7, on0Var4);
                } else {
                    du4.f(iS7, h02Var, iS7, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW11);
                bz1Var3.l(h02Var, Integer.valueOf((i6 >> 12) & 14));
                h02Var.b(true);
                z2 = false;
                h02Var.b(false);
            } else {
                z2 = false;
                h02Var.X(-1444935078);
                h02Var.b(false);
            }
            if (bz1Var4 != null) {
                h02Var.X(-1444892360);
                j73 j73VarX5 = ue5.X(r26, "Trailing");
                f72 f72Var4 = ye2.g;
                j73 j73VarN8 = j73VarX5.n(c63Var);
                t33 t33VarR11 = z50.r(r16, z2);
                iS6 = pw5.s(h02Var);
                tr3 tr3VarQ12 = h02Var.q();
                j73 j73VarW12 = m50.W(h02Var, j73VarN8);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR11);
                xs2.E(on0Var3, h02Var, tr3VarQ12);
                if (h02Var.S) {
                    du4.f(iS6, h02Var, iS6, on0Var4);
                } else {
                    du4.f(iS6, h02Var, iS6, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW12);
                bz1Var4.l(h02Var, Integer.valueOf((i6 >> 15) & 14));
                h02Var.b(true);
                h02Var.b(false);
            } else {
                h02Var.X(-1444644422);
                h02Var.b(z2);
            }
            zn3Var2 = zn3Var;
            fA = ue5.A(zn3Var2, fl2Var);
            fE = ue5.e(zn3Var2, fl2Var);
            fT = zi6.t(h02Var);
            if (bz1Var3 != null) {
                fA -= fT;
                if (fA < 0.0f) {
                    fA = 0.0f;
                }
            }
            f = fA;
            if (bz1Var4 != null) {
                fE -= fT;
                if (fE < 0.0f) {
                    fE = 0.0f;
                }
            }
            f2 = fE;
            if (bz1Var5 != null) {
                h02Var.X(-1443868027);
                j73 j73VarI4 = ue5.i0(mq4.c(mq4.v(ue5.X(r26, "Prefix"), 24.0f, Float.NaN)), f, 0.0f, 2.0f, 0.0f, 10);
                k00Var2 = k00Var;
                t33 t33VarR12 = z50.r(k00Var2, false);
                iS5 = pw5.s(h02Var);
                tr3 tr3VarQ13 = h02Var.q();
                j73 j73VarW13 = m50.W(h02Var, j73VarI4);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR12);
                xs2.E(on0Var3, h02Var, tr3VarQ13);
                if (h02Var.S) {
                    du4.f(iS5, h02Var, iS5, on0Var4);
                } else {
                    du4.f(iS5, h02Var, iS5, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW13);
                bz1Var10 = bz1Var5;
                bz1Var10.l(h02Var, Integer.valueOf((i6 >> 18) & 14));
                h02Var.b(true);
                h02Var.b(false);
            } else {
                bz1Var10 = bz1Var5;
                k00Var2 = k00Var;
                h02Var.X(-1443540326);
                h02Var.b(false);
            }
            if (bz1Var6 != null) {
                h02Var.X(-1443497081);
                j73 j73VarI5 = ue5.i0(mq4.c(mq4.v(ue5.X(r26, "Suffix"), 24.0f, Float.NaN)), 2.0f, 0.0f, f2, 0.0f, 10);
                t33 t33VarR13 = z50.r(k00Var2, false);
                iS4 = pw5.s(h02Var);
                tr3 tr3VarQ14 = h02Var.q();
                j73 j73VarW14 = m50.W(h02Var, j73VarI5);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR13);
                xs2.E(on0Var3, h02Var, tr3VarQ14);
                if (h02Var.S) {
                    du4.f(iS4, h02Var, iS4, on0Var4);
                } else {
                    du4.f(iS4, h02Var, iS4, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW14);
                bz1Var6.l(h02Var, Integer.valueOf((i6 >> 21) & 14));
                h02Var.b(true);
                h02Var.b(false);
            } else {
                h02Var.X(-1443171302);
                h02Var.b(false);
            }
            j73VarI0 = ue5.i0(r26, f, 0.0f, f2, 0.0f, 10);
            if (bz1Var2 != null) {
                h02Var.X(-1442671489);
                j73 j73VarX6 = ue5.X(g73Var, "Label");
                if (i8 != 4) {
                    if ((i7 & 8) != 0) {
                        c55Var2 = c55Var;
                        if (h02Var.j(c55Var2)) {
                        }
                        objK = h02Var.K();
                        if (z4) {
                            objK = new dn3(c55Var2, (byte) 1);
                            h02Var.i0(objK);
                        } else {
                            objK = new dn3(c55Var2, (byte) 1);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN9 = mq4.c(ra.G(j73VarX6, new th0((my1) objK, (byte) 3))).n(j73VarI0);
                        t33 t33VarR14 = z50.r(k00Var2, false);
                        iS3 = pw5.s(h02Var);
                        tr3 tr3VarQ15 = h02Var.q();
                        j73 j73VarW15 = m50.W(h02Var, j73VarN9);
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(my1Var);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(on0Var2, h02Var, t33VarR14);
                        xs2.E(on0Var3, h02Var, tr3VarQ15);
                        if (h02Var.S) {
                            du4.f(iS3, h02Var, iS3, on0Var4);
                        } else {
                            du4.f(iS3, h02Var, iS3, on0Var4);
                        }
                        xs2.E(on0Var, h02Var, j73VarW15);
                        bz1Var2.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
                        h02Var.b(true);
                        h02Var.b(false);
                    } else {
                        c55Var2 = c55Var;
                    }
                    z4 = false;
                    objK = h02Var.K();
                    if (z4) {
                        objK = new dn3(c55Var2, (byte) 1);
                        h02Var.i0(objK);
                    } else {
                        objK = new dn3(c55Var2, (byte) 1);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN10 = mq4.c(ra.G(j73VarX6, new th0((my1) objK, (byte) 3))).n(j73VarI0);
                    t33 t33VarR15 = z50.r(k00Var2, false);
                    iS3 = pw5.s(h02Var);
                    tr3 tr3VarQ16 = h02Var.q();
                    j73 j73VarW16 = m50.W(h02Var, j73VarN10);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var2, h02Var, t33VarR15);
                    xs2.E(on0Var3, h02Var, tr3VarQ16);
                    if (h02Var.S) {
                        du4.f(iS3, h02Var, iS3, on0Var4);
                    } else {
                        du4.f(iS3, h02Var, iS3, on0Var4);
                    }
                    xs2.E(on0Var, h02Var, j73VarW16);
                    bz1Var2.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    c55Var2 = c55Var;
                }
                z4 = true;
                objK = h02Var.K();
                if (z4) {
                    objK = new dn3(c55Var2, (byte) 1);
                    h02Var.i0(objK);
                } else {
                    objK = new dn3(c55Var2, (byte) 1);
                    h02Var.i0(objK);
                }
                j73 j73VarN11 = mq4.c(ra.G(j73VarX6, new th0((my1) objK, (byte) 3))).n(j73VarI0);
                t33 t33VarR16 = z50.r(k00Var2, false);
                iS3 = pw5.s(h02Var);
                tr3 tr3VarQ17 = h02Var.q();
                j73 j73VarW17 = m50.W(h02Var, j73VarN11);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR16);
                xs2.E(on0Var3, h02Var, tr3VarQ17);
                if (h02Var.S) {
                    du4.f(iS3, h02Var, iS3, on0Var4);
                } else {
                    du4.f(iS3, h02Var, iS3, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW17);
                bz1Var2.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
                h02Var.b(true);
                h02Var.b(false);
            } else {
                h02Var.X(-1442276518);
                h02Var.b(false);
            }
            j73 j73VarC2 = mq4.c(mq4.v(g73Var, 24.0f, Float.NaN));
            if (bz1Var10 == null) {
                f3 = f;
            } else {
                f3 = 0.0f;
            }
            if (bz1Var6 == null) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            j73VarI1 = ue5.i0(j73VarC2, f3, 0.0f, f4, 0.0f, 10);
            if (cz1Var != null) {
                h02Var.X(-1441906533);
                cz1Var2 = cz1Var;
                cz1Var2.x(ue5.X(g73Var, "Hint").n(j73VarI1), h02Var, Integer.valueOf((i6 >> 6) & 112));
                h02Var.b(false);
            } else {
                cz1Var2 = cz1Var;
                h02Var.X(-1441815238);
                h02Var.b(false);
            }
            j73 j73VarN12 = ue5.X(g73Var, "TextField").n(j73VarI1);
            t33 t33VarR17 = z50.r(k00Var2, true);
            iS = pw5.s(h02Var);
            tr3 tr3VarQ18 = h02Var.q();
            j73 j73VarW18 = m50.W(h02Var, j73VarN12);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var2, h02Var, t33VarR17);
            xs2.E(on0Var3, h02Var, tr3VarQ18);
            if (h02Var.S) {
                du4.f(iS, h02Var, iS, on0Var4);
            } else {
                du4.f(iS, h02Var, iS, on0Var4);
            }
            xs2.E(on0Var, h02Var, j73VarW18);
            bz1Var9 = bz1Var;
            du4.o((i6 >> 3) & 14, bz1Var9, h02Var, true);
            if (bz1Var7 != null) {
                h02Var.X(-1441566587);
                j73 j73VarD1 = ue5.d0(mq4.c(mq4.v(ue5.X(g73Var, "Supporting"), 16.0f, Float.NaN)), new bo3(16.0f, 4.0f, 16.0f, 0.0f));
                t33 t33VarR18 = z50.r(k00Var2, false);
                iS2 = pw5.s(h02Var);
                tr3 tr3VarQ19 = h02Var.q();
                j73 j73VarW19 = m50.W(h02Var, j73VarD1);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var2, h02Var, t33VarR18);
                xs2.E(on0Var3, h02Var, tr3VarQ19);
                if (h02Var.S) {
                    du4.f(iS2, h02Var, iS2, on0Var4);
                } else {
                    du4.f(iS2, h02Var, iS2, on0Var4);
                }
                xs2.E(on0Var, h02Var, j73VarW19);
                bz1Var8 = bz1Var7;
                bz1Var8.l(h02Var, Integer.valueOf((r17 >> 6) & 14));
                z3 = true;
                h02Var.b(true);
                h02Var.b(false);
            } else {
                bz1Var8 = bz1Var7;
                z3 = true;
                h02Var.X(-1441177382);
                h02Var.b(false);
            }
            h02Var.b(z3);
        } else {
            bz1Var8 = bz1Var7;
            cz1Var2 = cz1Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final cz1 cz1Var3 = cz1Var2;
            final zn3 zn3Var3 = zn3Var2;
            final bz1 bz1Var11 = bz1Var8;
            u34VarP.n = new bz1() { // from class: f55
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(i | 1);
                    int iJ2 = aq2.J(i2);
                    oy0.r(bz1Var9, bz1Var2, cz1Var3, bz1Var3, bz1Var4, bz1Var10, bz1Var6, z, j55Var, c55Var, nm0Var, bz1Var11, zn3Var3, (h02) obj2, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }

    public static final void y(final String str, final xy1 xy1Var, final j73 j73Var, boolean z, final boolean z2, k85 k85Var, final bz1 bz1Var, final bz1 bz1Var2, zm5 zm5Var, vj2 vj2Var, si2 si2Var, int i, int i2, cn4 cn4Var, final t45 t45Var, h02 h02Var, final int i3) {
        h02 h02Var2;
        final boolean z3;
        final k85 k85Var2;
        final zm5 zm5Var2;
        final vj2 vj2Var2;
        final si2 si2Var2;
        final int i4;
        final int i5;
        final cn4 cn4Var2;
        k85 k85Var3;
        int i6;
        zm5 zm5Var3;
        int i7;
        cn4 cn4VarY;
        vj2 vj2Var3;
        si2 si2Var3;
        boolean z4;
        h02Var.Z(-154966360);
        int i8 = i3 | (h02Var.x(str) ? 4 : 2) | (h02Var.x(j73Var) ? 256 : 128) | 113314816;
        if (h02Var.N(i8 & 1, ((306783379 & i8) == 306783378 && ((22 | (h02Var.x(t45Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            h02Var.S();
            if ((i3 & 1) == 0 || h02Var.k()) {
                k85Var3 = (k85) h02Var.a(g75.g);
                zm5 zm5Var4 = aj6.p;
                vj2 vj2Var4 = vj2.y;
                si2 si2Var4 = si2.y;
                i6 = Integer.MAX_VALUE;
                zm5Var3 = zm5Var4;
                i7 = 1;
                cn4VarY = vn4.y(ib6.n, h02Var);
                vj2Var3 = vj2Var4;
                si2Var3 = si2Var4;
                z4 = true;
            } else {
                h02Var.Q();
                z4 = z;
                k85Var3 = k85Var;
                zm5Var3 = zm5Var;
                vj2Var3 = vj2Var;
                si2Var3 = si2Var;
                i6 = i;
                i7 = i2;
                cn4VarY = cn4Var;
            }
            h02Var.s();
            h02Var.X(488210003);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var.b(false);
            h02Var.X(1401227490);
            long jY = k85Var3.y();
            if (jY == 16) {
                jY = t45Var.v(z4, false, ((Boolean) xf6.g(ja3Var, h02Var, 0).getValue()).booleanValue());
            }
            long j = jY;
            h02Var.b(false);
            k85 k85VarN = k85Var3.n(new k85(j, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214));
            k85 k85Var4 = k85Var3;
            h02Var2 = h02Var;
            og0.y(y75.g.g(t45Var.m), ue5.m0(1459735400, new i55(j73Var, t45Var, str, xy1Var, z4, z2, k85VarN, vj2Var3, si2Var3, i6, i7, zm5Var3, ja3Var, bz1Var, bz1Var2, cn4VarY), h02Var2), h02Var2, 56);
            z3 = z4;
            i5 = i7;
            cn4Var2 = cn4VarY;
            k85Var2 = k85Var4;
            si2Var2 = si2Var3;
            zm5Var2 = zm5Var3;
            i4 = i6;
            vj2Var2 = vj2Var3;
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
            z3 = z;
            k85Var2 = k85Var;
            zm5Var2 = zm5Var;
            vj2Var2 = vj2Var;
            si2Var2 = si2Var;
            i4 = i;
            i5 = i2;
            cn4Var2 = cn4Var;
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, xy1Var, j73Var, z3, z2, k85Var2, bz1Var, bz1Var2, zm5Var2, vj2Var2, si2Var2, i4, i5, cn4Var2, t45Var, i3) { // from class: g55
                public final /* synthetic */ j73 a;
                public final /* synthetic */ zm5 b;
                public final /* synthetic */ bz1 c;
                public final /* synthetic */ cn4 h;
                public final /* synthetic */ bz1 i;
                public final /* synthetic */ String j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ t45 o;
                public final /* synthetic */ si2 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ vj2 s;
                public final /* synthetic */ xy1 t;
                public final /* synthetic */ int u;
                public final /* synthetic */ k85 w;
                public final /* synthetic */ boolean z;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(806903857);
                    String str2 = this.j;
                    xy1 xy1Var2 = this.t;
                    j73 j73Var2 = this.a;
                    boolean z5 = this.m;
                    boolean z6 = this.q;
                    k85 k85Var5 = this.w;
                    bz1 bz1Var3 = this.c;
                    bz1 bz1Var4 = this.i;
                    zm5 zm5Var5 = this.b;
                    vj2 vj2Var5 = this.s;
                    si2 si2Var5 = this.p;
                    int i9 = this.u;
                    boolean z7 = this.z;
                    cn4 cn4Var3 = this.h;
                    t45 t45Var2 = this.o;
                    oy0.y(str2, xy1Var2, j73Var2, z5, z6, k85Var5, bz1Var3, bz1Var4, zm5Var5, vj2Var5, si2Var5, i9, z7 ? 1 : 0, cn4Var3, t45Var2, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }
}
