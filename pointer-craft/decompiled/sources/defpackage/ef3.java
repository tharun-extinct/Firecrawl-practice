package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class ef3 {
    public static final qe5 g = new qe5(256, (cg1) null, 6);

    public static final void g(we1 we1Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        te1 te1Var;
        Object ye3Var;
        Object obj;
        h02Var.Z(-383087355);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(we1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (objK == obj2) {
                objK = new te1();
                h02Var.i0(objK);
            }
            te1 te1Var2 = (te1) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj2) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            ox0 ox0Var = (ox0) objK2;
            boolean z = h02Var.a(hp0.c) == fl2.t;
            r54 r54Var = new r54();
            r54 r54Var2 = new r54();
            r54 r54Var3 = new r54();
            j51 j51Var = (j51) h02Var.a(hp0.j);
            r54Var.j = j51Var.e(12.0f);
            r54Var2.j = j51Var.e(24.0f);
            r54Var3.j = j51Var.e(48.0f);
            boolean zR = we1Var.r();
            int i4 = i3 & 14;
            boolean zL = h02Var.l(z) | h02Var.r(r54Var.j) | h02Var.r(r54Var2.j) | h02Var.r(r54Var3.j) | h02Var.j(ox0Var) | (i4 == 4);
            Object objK3 = h02Var.K();
            if (zL || objK3 == obj2) {
                te1Var = te1Var2;
                obj = obj2;
                ye3Var = new ye3(te1Var, ox0Var, we1Var, z, r54Var, r54Var2, r54Var3, null);
                h02Var.i0(ye3Var);
            } else {
                te1Var = te1Var2;
                ye3Var = objK3;
                obj = obj2;
            }
            y94.c(0, (bz1) ye3Var, h02Var, zR);
            Boolean boolValueOf = Boolean.valueOf(((xe1) we1Var.y.j.getValue()) == xe1.j);
            boolean z2 = i4 == 4;
            Object objK4 = h02Var.K();
            if (z2 || objK4 == obj) {
                objK4 = new ko(we1Var, te1Var, null, (byte) 12);
                h02Var.i0(objK4);
            }
            k33.b((bz1) objK4, h02Var, boolValueOf);
            nm0Var.x(te1Var, h02Var, Integer.valueOf((i3 & 112) | 6));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk((byte) 8, i, we1Var, nm0Var);
        }
    }

    public static final float j(o84 o84Var, te1 te1Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o84Var.d & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (te1Var.r.d() / fIntBitsToFloat);
    }

    public static final float l(o84 o84Var, te1 te1Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o84Var.d >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return ((te1Var.y.d() * (te1Var.g() ? 1 : -1)) / fIntBitsToFloat) + 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:103:0x0249 A[PHI: r28
  0x0249: PHI (r28v7 boolean) = (r28v4 boolean), (r28v8 boolean) binds: [B:102:0x0247, B:100:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x024b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0256  */
    /* JADX WARN: Code duplicated, block: B:111:0x028d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0293  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:125:0x02be  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0300  */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0327  */
    /* JADX WARN: Code duplicated, block: B:152:0x0337  */
    /* JADX WARN: Code duplicated, block: B:154:0x0345  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x0218  */
    /* JADX WARN: Code duplicated, block: B:93:0x021e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239  */
    public static final void n(final nm0 nm0Var, j73 j73Var, we1 we1Var, final boolean z, long j, final nm0 nm0Var2, h02 h02Var, final int i) {
        final j73 j73Var2;
        final long j2;
        int i2;
        long jY;
        j73 j73Var3;
        Object re1Var;
        int i3;
        Object obj;
        int iS;
        boolean zR;
        boolean z2;
        boolean zJ;
        Object objK;
        Object obj2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objK2;
        boolean z6;
        Object objK3;
        boolean zX;
        Object objK4;
        boolean zX2;
        Object objK5;
        int iS2;
        we1 we1Var2 = we1Var;
        h02Var.Z(-1907430816);
        int i4 = i | 48;
        if ((i & 384) == 0) {
            i4 |= h02Var.x(we1Var2) ? 256 : 128;
        }
        int i5 = i4 | (h02Var.l(z) ? 2048 : 1024) | 8192;
        if (h02Var.N(i5 & 1, (74899 & i5) != 74898)) {
            h02Var.S();
            int i6 = i & 1;
            g73 g73Var = g73.g;
            if (i6 == 0 || h02Var.k()) {
                float f = qe1.g;
                i2 = i5 & (-57345);
                jY = jj0.y(0.32f, tj0.v(y94.m, h02Var));
                j73Var3 = g73Var;
            } else {
                h02Var.Q();
                i2 = i5 & (-57345);
                j73Var3 = j73Var;
                jY = j;
            }
            h02Var.s();
            Object objK6 = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK6 == l76Var) {
                objK6 = k33.E(h02Var);
                h02Var.i0(objK6);
            }
            Object obj3 = (ox0) objK6;
            Object objB = aq2.b(R.string.navigation_menu, h02Var);
            j51 j51Var = (j51) h02Var.a(hp0.j);
            Object objK7 = h02Var.K();
            if (objK7 == l76Var) {
                objK7 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK7);
            }
            ob3 ob3Var = (ob3) objK7;
            boolean zX3 = h02Var.x(j51Var);
            Object objK8 = h02Var.K();
            if (zX3 || objK8 == l76Var) {
                objK8 = new pp3(0.0f);
                h02Var.i0(objK8);
            }
            pp3 pp3Var = (pp3) objK8;
            f83 f83Var = f83.j;
            zu4 zu4VarF = jr2.F(f83Var, h02Var);
            zu4 zu4VarF2 = jr2.F(f83Var, h02Var);
            zu4 zu4VarF3 = jr2.F(f83.m, h02Var);
            int i7 = (i2 & 896) ^ 384;
            boolean zX4 = ((i7 > 256 && h02Var.x(we1Var2)) || (i2 & 384) == 256) | h02Var.x(j51Var) | h02Var.j(zu4VarF2) | h02Var.j(zu4VarF3) | h02Var.j(zu4VarF);
            Object objK9 = h02Var.K();
            if (zX4 || objK9 == l76Var) {
                i3 = i2;
                we1Var2 = we1Var;
                re1Var = new re1(we1Var2, j51Var, zu4VarF2, zu4VarF3, zu4VarF);
                h02Var.i0(re1Var);
            } else {
                we1Var2 = we1Var;
                i3 = i2;
                re1Var = objK9;
            }
            k33.z((my1) re1Var, h02Var);
            j73 j73VarV = og0.v(j73Var3.n(mq4.r), we1Var2.y, h02Var.a(hp0.c) == fl2.t, z);
            k00 k00Var = hi0.t;
            t33 t33VarR = z50.r(k00Var, false);
            int iS3 = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarV);
            jo0.n.getClass();
            h02Var.b0();
            j73 j73Var4 = j73Var3;
            boolean z7 = h02Var.S;
            my1 my1Var = um2.Z;
            if (z7) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, t33VarR);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S) {
                obj = l76Var;
            } else {
                obj = l76Var;
                if (!yf2.p(h02Var.K(), Integer.valueOf(iS3))) {
                }
                on0 on0Var4 = tg1.m;
                xs2.E(on0Var4, h02Var, j73VarW);
                t33 t33VarR2 = z50.r(k00Var, false);
                iS = pw5.s(h02Var);
                tr3 tr3VarQ2 = h02Var.q();
                j73 j73VarW2 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33VarR2);
                xs2.E(on0Var2, h02Var, tr3VarQ2);
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                    du4.f(iS, h02Var, iS, on0Var3);
                }
                xs2.E(on0Var4, h02Var, j73VarW2);
                nm0Var2.l(h02Var, 6);
                h02Var.b(true);
                zR = we1Var2.r();
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zJ = z2 | ((i7 <= 256 && h02Var.x(we1Var2)) || (i3 & 384) == 256) | h02Var.j(r28);
                objK = h02Var.K();
                if (zJ) {
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if (objK == obj2) {
                    }
                    my1 my1Var2 = (my1) objK;
                    boolean zX5 = h02Var.x(pp3Var);
                    if (i7 > 256 || !h02Var.x(we1Var2)) {
                        z3 = zR;
                        if ((i3 & 384) != 256) {
                            z4 = false;
                        }
                        z5 = zX5 | z4;
                        objK2 = h02Var.K();
                        if (z5 || objK2 == obj2) {
                            objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                            h02Var.i0(objK2);
                        }
                        int i8 = i3;
                        Object obj4 = obj2;
                        long j3 = jY;
                        x(z3, my1Var2, (my1) objK2, j3, h02Var, 0);
                        z6 = (i7 <= 256 && h02Var.x(we1Var2)) || (i8 & 384) == 256;
                        objK3 = h02Var.K();
                        if (z6 || objK3 == obj4) {
                            objK3 = new z6(we1Var2, (byte) 25);
                            h02Var.i0(objK3);
                        }
                        j73 j73VarS = yf2.S(g73Var, (xy1) objK3);
                        zX = h02Var.x(objB) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i8 & 384) == 256) | h02Var.j(obj3);
                        objK4 = h02Var.K();
                        if (zX || objK4 == obj4) {
                            objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                            h02Var.i0(objK4);
                        }
                        j73 j73VarG = dj4.g(j73VarS, false, (xy1) objK4);
                        zX2 = h02Var.x(pp3Var) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i8 & 384) == 256);
                        objK5 = h02Var.K();
                        if (zX2 || objK5 == obj4) {
                            objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                            h02Var.i0(objK5);
                        }
                        t33 t33Var = (t33) objK5;
                        iS2 = pw5.s(h02Var);
                        tr3 tr3VarQ3 = h02Var.q();
                        j73 j73VarW3 = m50.W(h02Var, j73VarG);
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(my1Var);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(on0Var, h02Var, t33Var);
                        xs2.E(on0Var2, h02Var, tr3VarQ3);
                        if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                            du4.f(iS2, h02Var, iS2, on0Var3);
                        }
                        xs2.E(on0Var4, h02Var, j73VarW3);
                        nm0Var.l(h02Var, 6);
                        h02Var.b(true);
                        h02Var.b(true);
                        j2 = j3;
                        j73Var2 = j73Var4;
                    } else {
                        z3 = zR;
                    }
                    z4 = true;
                    z5 = zX5 | z4;
                    objK2 = h02Var.K();
                    if (z5) {
                        objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                        h02Var.i0(objK2);
                    }
                    int i9 = i3;
                    Object obj5 = obj2;
                    long j4 = jY;
                    x(z3, my1Var2, (my1) objK2, j4, h02Var, 0);
                    if (i7 <= 256) {
                    }
                    objK3 = h02Var.K();
                    if (z6) {
                        objK3 = new z6(we1Var2, (byte) 25);
                        h02Var.i0(objK3);
                    } else {
                        objK3 = new z6(we1Var2, (byte) 25);
                        h02Var.i0(objK3);
                    }
                    j73 j73VarS2 = yf2.S(g73Var, (xy1) objK3);
                    zX = h02Var.x(objB) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i9 & 384) == 256) | h02Var.j(obj3);
                    objK4 = h02Var.K();
                    if (zX) {
                        objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                        h02Var.i0(objK4);
                    } else {
                        objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                        h02Var.i0(objK4);
                    }
                    j73 j73VarG2 = dj4.g(j73VarS2, false, (xy1) objK4);
                    zX2 = h02Var.x(pp3Var) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i9 & 384) == 256);
                    objK5 = h02Var.K();
                    if (zX2) {
                        objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                        h02Var.i0(objK5);
                    } else {
                        objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                        h02Var.i0(objK5);
                    }
                    t33 t33Var2 = (t33) objK5;
                    iS2 = pw5.s(h02Var);
                    tr3 tr3VarQ4 = h02Var.q();
                    j73 j73VarW4 = m50.W(h02Var, j73VarG2);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, t33Var2);
                    xs2.E(on0Var2, h02Var, tr3VarQ4);
                    if (h02Var.S) {
                        du4.f(iS2, h02Var, iS2, on0Var3);
                    } else {
                        du4.f(iS2, h02Var, iS2, on0Var3);
                    }
                    xs2.E(on0Var4, h02Var, j73VarW4);
                    nm0Var.l(h02Var, 6);
                    h02Var.b(true);
                    h02Var.b(true);
                    j2 = j4;
                    j73Var2 = j73Var4;
                }
                objK = new ab1((byte) 1, we1Var2, r28, z);
                h02Var.i0(objK);
                my1 my1Var3 = (my1) objK;
                boolean zX6 = h02Var.x(pp3Var);
                if (i7 > 256) {
                    z3 = zR;
                    if ((i3 & 384) != 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z3 = zR;
                    if ((i3 & 384) != 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                z5 = zX6 | z4;
                objK2 = h02Var.K();
                if (z5) {
                    objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                    h02Var.i0(objK2);
                }
                int i10 = i3;
                Object obj6 = obj2;
                long j5 = jY;
                x(z3, my1Var3, (my1) objK2, j5, h02Var, 0);
                if (i7 <= 256) {
                }
                objK3 = h02Var.K();
                if (z6) {
                    objK3 = new z6(we1Var2, (byte) 25);
                    h02Var.i0(objK3);
                } else {
                    objK3 = new z6(we1Var2, (byte) 25);
                    h02Var.i0(objK3);
                }
                j73 j73VarS3 = yf2.S(g73Var, (xy1) objK3);
                zX = h02Var.x(objB) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i10 & 384) == 256) | h02Var.j(obj3);
                objK4 = h02Var.K();
                if (zX) {
                    objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                    h02Var.i0(objK4);
                } else {
                    objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                    h02Var.i0(objK4);
                }
                j73 j73VarG3 = dj4.g(j73VarS3, false, (xy1) objK4);
                zX2 = h02Var.x(pp3Var) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i10 & 384) == 256);
                objK5 = h02Var.K();
                if (zX2) {
                    objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                    h02Var.i0(objK5);
                } else {
                    objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                    h02Var.i0(objK5);
                }
                t33 t33Var3 = (t33) objK5;
                iS2 = pw5.s(h02Var);
                tr3 tr3VarQ5 = h02Var.q();
                j73 j73VarW5 = m50.W(h02Var, j73VarG3);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33Var3);
                xs2.E(on0Var2, h02Var, tr3VarQ5);
                if (h02Var.S) {
                    du4.f(iS2, h02Var, iS2, on0Var3);
                } else {
                    du4.f(iS2, h02Var, iS2, on0Var3);
                }
                xs2.E(on0Var4, h02Var, j73VarW5);
                nm0Var.l(h02Var, 6);
                h02Var.b(true);
                h02Var.b(true);
                j2 = j5;
                j73Var2 = j73Var4;
            }
            du4.f(iS3, h02Var, iS3, on0Var3);
            on0 on0Var5 = tg1.m;
            xs2.E(on0Var5, h02Var, j73VarW);
            t33 t33VarR3 = z50.r(k00Var, false);
            iS = pw5.s(h02Var);
            tr3 tr3VarQ6 = h02Var.q();
            j73 j73VarW6 = m50.W(h02Var, g73Var);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR3);
            xs2.E(on0Var2, h02Var, tr3VarQ6);
            if (h02Var.S) {
                du4.f(iS, h02Var, iS, on0Var3);
            } else {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            xs2.E(on0Var5, h02Var, j73VarW6);
            nm0Var2.l(h02Var, 6);
            h02Var.b(true);
            zR = we1Var2.r();
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            zJ = z2 | ((i7 <= 256 && h02Var.x(we1Var2)) || (i3 & 384) == 256) | h02Var.j(r28);
            objK = h02Var.K();
            if (zJ) {
                obj2 = obj;
                if (objK == obj2) {
                }
                my1 my1Var4 = (my1) objK;
                boolean zX7 = h02Var.x(pp3Var);
                if (i7 > 256) {
                    z3 = zR;
                    if ((i3 & 384) != 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z3 = zR;
                    if ((i3 & 384) != 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                z5 = zX7 | z4;
                objK2 = h02Var.K();
                if (z5) {
                    objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                    h02Var.i0(objK2);
                }
                int i11 = i3;
                Object obj7 = obj2;
                long j6 = jY;
                x(z3, my1Var4, (my1) objK2, j6, h02Var, 0);
                if (i7 <= 256) {
                }
                objK3 = h02Var.K();
                if (z6) {
                    objK3 = new z6(we1Var2, (byte) 25);
                    h02Var.i0(objK3);
                } else {
                    objK3 = new z6(we1Var2, (byte) 25);
                    h02Var.i0(objK3);
                }
                j73 j73VarS4 = yf2.S(g73Var, (xy1) objK3);
                zX = h02Var.x(objB) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i11 & 384) == 256) | h02Var.j(obj3);
                objK4 = h02Var.K();
                if (zX) {
                    objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                    h02Var.i0(objK4);
                } else {
                    objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                    h02Var.i0(objK4);
                }
                j73 j73VarG4 = dj4.g(j73VarS4, false, (xy1) objK4);
                zX2 = h02Var.x(pp3Var) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i11 & 384) == 256);
                objK5 = h02Var.K();
                if (zX2) {
                    objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                    h02Var.i0(objK5);
                } else {
                    objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                    h02Var.i0(objK5);
                }
                t33 t33Var4 = (t33) objK5;
                iS2 = pw5.s(h02Var);
                tr3 tr3VarQ7 = h02Var.q();
                j73 j73VarW7 = m50.W(h02Var, j73VarG4);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33Var4);
                xs2.E(on0Var2, h02Var, tr3VarQ7);
                if (h02Var.S) {
                    du4.f(iS2, h02Var, iS2, on0Var3);
                } else {
                    du4.f(iS2, h02Var, iS2, on0Var3);
                }
                xs2.E(on0Var5, h02Var, j73VarW7);
                nm0Var.l(h02Var, 6);
                h02Var.b(true);
                h02Var.b(true);
                j2 = j6;
                j73Var2 = j73Var4;
            } else {
                obj2 = obj;
            }
            objK = new ab1((byte) 1, we1Var2, r28, z);
            h02Var.i0(objK);
            my1 my1Var5 = (my1) objK;
            boolean zX8 = h02Var.x(pp3Var);
            if (i7 > 256) {
                z3 = zR;
                if ((i3 & 384) != 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z3 = zR;
                if ((i3 & 384) != 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            z5 = zX8 | z4;
            objK2 = h02Var.K();
            if (z5) {
                objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                h02Var.i0(objK2);
            } else {
                objK2 = new rg((Object) we1Var2, (Object) pp3Var, (byte) 20);
                h02Var.i0(objK2);
            }
            int i12 = i3;
            Object obj8 = obj2;
            long j7 = jY;
            x(z3, my1Var5, (my1) objK2, j7, h02Var, 0);
            if (i7 <= 256) {
            }
            objK3 = h02Var.K();
            if (z6) {
                objK3 = new z6(we1Var2, (byte) 25);
                h02Var.i0(objK3);
            } else {
                objK3 = new z6(we1Var2, (byte) 25);
                h02Var.i0(objK3);
            }
            j73 j73VarS5 = yf2.S(g73Var, (xy1) objK3);
            zX = h02Var.x(objB) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i12 & 384) == 256) | h02Var.j(obj3);
            objK4 = h02Var.K();
            if (zX) {
                objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                h02Var.i0(objK4);
            } else {
                objK4 = new bc(objB, (Object) we1Var2, obj3, (byte) 8);
                h02Var.i0(objK4);
            }
            j73 j73VarG5 = dj4.g(j73VarS5, false, (xy1) objK4);
            zX2 = h02Var.x(pp3Var) | ((i7 <= 256 && h02Var.x(we1Var2)) || (i12 & 384) == 256);
            objK5 = h02Var.K();
            if (zX2) {
                objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                h02Var.i0(objK5);
            } else {
                objK5 = new cf3(we1Var2, ob3Var, pp3Var);
                h02Var.i0(objK5);
            }
            t33 t33Var5 = (t33) objK5;
            iS2 = pw5.s(h02Var);
            tr3 tr3VarQ8 = h02Var.q();
            j73 j73VarW8 = m50.W(h02Var, j73VarG5);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33Var5);
            xs2.E(on0Var2, h02Var, tr3VarQ8);
            if (h02Var.S) {
                du4.f(iS2, h02Var, iS2, on0Var3);
            } else {
                du4.f(iS2, h02Var, iS2, on0Var3);
            }
            xs2.E(on0Var5, h02Var, j73VarW8);
            nm0Var.l(h02Var, 6);
            h02Var.b(true);
            h02Var.b(true);
            j2 = j7;
            j73Var2 = j73Var4;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            j2 = j;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final we1 we1Var3 = we1Var2;
            u34VarP.n = new bz1() { // from class: ue3
                @Override // defpackage.bz1
                public final Object l(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    ef3.n(nm0Var, j73Var2, we1Var3, z, j2, nm0Var2, (h02) obj9, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final void r(we1 we1Var, j73 j73Var, cn4 cn4Var, long j, long j2, qo5 qo5Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        qo5 qo5Var2;
        cn4 cn4VarY;
        long j3;
        long jY;
        int i3;
        h02Var.Z(-1620540727);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(we1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        int i4 = i2 | 196608;
        if ((1572864 & i) == 0) {
            qo5Var2 = qo5Var;
            i4 |= h02Var.x(qo5Var2) ? 1048576 : 524288;
        } else {
            qo5Var2 = qo5Var;
        }
        if ((12582912 & i) == 0) {
            i4 |= h02Var.j(nm0Var) ? 8388608 : 4194304;
        }
        if (h02Var.N(i4 & 1, (4793491 & i4) != 4793490)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                float f = qe1.g;
                cn4VarY = vn4.y(ra.e, h02Var);
                long jV = tj0.v(ra.D, h02Var);
                i3 = i4 & (-65409);
                j3 = jV;
                jY = tj0.y(jV, h02Var);
            } else {
                h02Var.Q();
                i3 = i4 & (-65409);
                cn4VarY = cn4Var;
                j3 = j;
                jY = j2;
            }
            int i5 = i3;
            h02Var.s();
            g(we1Var, ue5.m0(797187326, new bf3(qo5Var2, j73Var, cn4VarY, j3, jY, we1Var, nm0Var), h02Var), h02Var, (i5 & 14) | 48);
        } else {
            h02Var.Q();
            cn4VarY = cn4Var;
            j3 = j;
            jY = j2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tq1(we1Var, j73Var, cn4VarY, j3, jY, qo5Var, nm0Var, i, (byte) 1);
        }
    }

    public static final we1 t(h02 h02Var) {
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (objK == obj) {
            objK = new pc3((byte) 8);
            h02Var.i0(objK);
        }
        xy1 xy1Var = (xy1) objK;
        Object[] objArr = new Object[0];
        ji jiVar = new ji((Object) new on0((byte) 13), (Object) new ue1(xy1Var, (byte) 0), (byte) 29);
        boolean zX = h02Var.x(xy1Var);
        Object objK2 = h02Var.K();
        if (zX || objK2 == obj) {
            objK2 = new y61(xy1Var);
            h02Var.i0(objK2);
        }
        return (we1) xq2.d(objArr, jiVar, (my1) objK2, h02Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void v(nm0 nm0Var, boolean z, my1 my1Var, j73 j73Var, bz1 bz1Var, bz1 bz1Var2, cn4 cn4Var, m11 m11Var, h02 h02Var, int i, int i2) {
        int i3;
        bz1 bz1Var3;
        int i4;
        boolean z2;
        cn4 cn4Var2;
        m11 m11Var2;
        bz1 bz1Var4;
        u34 u34VarP;
        bz1 bz1Var5;
        int i5;
        bz1 bz1Var6;
        m11 m11VarG;
        cn4 cn4Var3;
        Object objK;
        long j;
        h02Var.Z(-583709666);
        if ((i & 48) == 0) {
            i3 = i | (h02Var.l(z) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i6 = i3 | (h02Var.j(my1Var) ? 256 : 128) | (h02Var.x(j73Var) ? 2048 : 1024);
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((i & 196608) == 0) {
                bz1Var3 = bz1Var2;
                i6 |= h02Var.j(bz1Var3) ? 131072 : 65536;
            }
            i4 = i6 | 105381888;
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i4 & 1, z2)) {
                h02Var.S();
                if ((i & 1) != 0 || h02Var.k()) {
                    if (i7 != 0) {
                        bz1Var5 = null;
                    } else {
                        bz1Var5 = bz1Var3;
                    }
                    cn4 cn4VarY = vn4.y(ra.k, h02Var);
                    i5 = i4 & (-33030145);
                    bz1Var6 = bz1Var5;
                    m11VarG = qe3.g(h02Var);
                    cn4Var3 = cn4VarY;
                } else {
                    h02Var.Q();
                    i5 = i4 & (-33030145);
                    cn4Var3 = cn4Var;
                    m11VarG = m11Var;
                    bz1Var6 = bz1Var3;
                }
                h02Var.s();
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new pc3((byte) 7);
                    h02Var.i0(objK);
                }
                j73 j73VarR = mq4.r(mq4.v(dj4.g(j73Var, false, (xy1) objK), ra.f, Float.NaN), 1.0f);
                int i8 = i5 >> 3;
                m11VarG.getClass();
                h02Var.X(-433512770);
                if (z) {
                    j = m11VarG.v;
                } else {
                    j = m11VarG.x;
                }
                ob3 ob3VarQ = kq2.Q(new jj0(j), h02Var);
                h02Var.b(false);
                bz1 bz1Var7 = bz1Var6;
                cn4 cn4Var4 = cn4Var3;
                uz4.y(z, my1Var, j73VarR, false, cn4Var4, ((jj0) ob3VarQ.getValue()).g, 0.0f, null, null, ue5.m0(-1173018444, new df3(bz1Var, m11VarG, z, bz1Var6, nm0Var), h02Var), h02Var, i8 & 126, 968);
                cn4Var2 = cn4Var4;
                m11Var2 = m11VarG;
                bz1Var4 = bz1Var7;
            } else {
                h02Var.Q();
                cn4Var2 = cn4Var;
                m11Var2 = m11Var;
                bz1Var4 = bz1Var3;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new l90(nm0Var, z, my1Var, j73Var, bz1Var, bz1Var4, cn4Var2, m11Var2, i, i2);
            }
        }
        i6 |= 196608;
        bz1Var3 = bz1Var2;
        i4 = i6 | 105381888;
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i4 & 1, z2)) {
            h02Var.S();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    bz1Var5 = null;
                } else {
                    bz1Var5 = bz1Var3;
                }
                cn4 cn4VarY2 = vn4.y(ra.k, h02Var);
                i5 = i4 & (-33030145);
                bz1Var6 = bz1Var5;
                m11VarG = qe3.g(h02Var);
                cn4Var3 = cn4VarY2;
            } else {
                if (i7 != 0) {
                    bz1Var5 = null;
                } else {
                    bz1Var5 = bz1Var3;
                }
                cn4 cn4VarY3 = vn4.y(ra.k, h02Var);
                i5 = i4 & (-33030145);
                bz1Var6 = bz1Var5;
                m11VarG = qe3.g(h02Var);
                cn4Var3 = cn4VarY3;
            }
            h02Var.s();
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new pc3((byte) 7);
                h02Var.i0(objK);
            }
            j73 j73VarR2 = mq4.r(mq4.v(dj4.g(j73Var, false, (xy1) objK), ra.f, Float.NaN), 1.0f);
            int i9 = i5 >> 3;
            m11VarG.getClass();
            h02Var.X(-433512770);
            if (z) {
                j = m11VarG.v;
            } else {
                j = m11VarG.x;
            }
            ob3 ob3VarQ2 = kq2.Q(new jj0(j), h02Var);
            h02Var.b(false);
            bz1 bz1Var8 = bz1Var6;
            cn4 cn4Var5 = cn4Var3;
            uz4.y(z, my1Var, j73VarR2, false, cn4Var5, ((jj0) ob3VarQ2.getValue()).g, 0.0f, null, null, ue5.m0(-1173018444, new df3(bz1Var, m11VarG, z, bz1Var6, nm0Var), h02Var), h02Var, i9 & 126, 968);
            cn4Var2 = cn4Var5;
            m11Var2 = m11VarG;
            bz1Var4 = bz1Var8;
        } else {
            h02Var.Q();
            cn4Var2 = cn4Var;
            m11Var2 = m11Var;
            bz1Var4 = bz1Var3;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new l90(nm0Var, z, my1Var, j73Var, bz1Var, bz1Var4, cn4Var2, m11Var2, i, i2);
        }
    }

    public static final void x(final boolean z, final my1 my1Var, final my1 my1Var2, final long j, h02 h02Var, final int i) {
        int i2;
        h02Var.Z(2106487387);
        if ((i & 6) == 0) {
            i2 = (h02Var.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.v(j) ? 2048 : 1024;
        }
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            String strB = aq2.b(R.string.close_drawer, h02Var);
            j73 j73VarG = g73.g;
            l76 l76Var = oo0.g;
            if (z) {
                h02Var.X(598792893);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objK = h02Var.K();
                if (z2 || objK == l76Var) {
                    objK = new a73(my1Var, b);
                    h02Var.i0(objK);
                }
                j73 j73VarG2 = b05.g(j73VarG, my1Var, (PointerInputEventHandler) objK);
                boolean zX = (i3 == 32) | h02Var.x(strB);
                Object objK2 = h02Var.K();
                if (zX || objK2 == l76Var) {
                    objK2 = new xf(strB, my1Var, (byte) 17);
                    h02Var.i0(objK2);
                }
                j73VarG = dj4.g(j73VarG2, true, (xy1) objK2);
                h02Var.b(false);
            } else {
                h02Var.X(599116967);
                h02Var.b(false);
            }
            j73 j73VarN = mq4.r.n(j73VarG);
            int i4 = ((i2 & 7168) == 2048 ? (byte) 1 : (byte) 0) | ((i2 & 896) != 256 ? (byte) 0 : (byte) 1);
            Object objK3 = h02Var.K();
            if (i4 != 0 || objK3 == l76Var) {
                objK3 = new xy1() { // from class: ve3
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        xd1.B((xd1) obj, j, 0L, 0L, ((Number) my1Var2.g()).floatValue(), 118);
                        return og5.g;
                    }
                };
                h02Var.i0(objK3);
            }
            ue5.v(j73VarN, (xy1) objK3, h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: we3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ef3.x(z, my1Var, my1Var2, j, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final void y(final te1 te1Var, final qo5 qo5Var, final j73 j73Var, final cn4 cn4Var, final long j, final long j2, final jq1 jq1Var, final nm0 nm0Var, h02 h02Var, final int i) {
        int i2;
        h02Var.Z(1560288494);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(te1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(qo5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(cn4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.v(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.v(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.r(0.0f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= (16777216 & i) == 0 ? h02Var.x(jq1Var) : h02Var.j(jq1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= h02Var.j(nm0Var) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (h02Var.N(i3 & 1, (i3 & 38347923) != 38347922)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            j51 j51Var = (j51) h02Var.a(hp0.j);
            float f = ra.A;
            float fE = j51Var.e(f);
            boolean z = h02Var.a(hp0.c) == fl2.t;
            j73 j73VarL = g73.g;
            if (te1Var != null) {
                j73VarL = yf2.L(j73VarL, new te3(te1Var, z, (byte) 1));
            }
            int i4 = i3 >> 6;
            uz4.g(yf2.L(mq4.m(j73Var, 240.0f, 0.0f, f, 10), new se3(jq1Var, fE, z, (byte) 1)).n(j73VarL).n(mq4.y), cn4Var, j, j2, 0.0f, 0.0f, null, ue5.m0(-315420087, new ze3(te1Var, z, f, jq1Var, fE, qo5Var, nm0Var), h02Var), h02Var, (i4 & 112) | 12582912 | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 96);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: re3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ef3.y(te1Var, qo5Var, j73Var, cn4Var, j, j2, jq1Var, nm0Var, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
