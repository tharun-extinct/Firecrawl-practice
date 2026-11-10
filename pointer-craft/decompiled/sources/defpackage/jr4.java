package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jr4 {
    public static final float g = oe6.w;
    public static final float n;
    public static final long r;
    public static final float v;
    public static final ek5 x;
    public static final float y;

    static {
        float f = oe6.m;
        y = f;
        float f2 = oe6.t;
        r = k33.m(f, f2);
        k33.m(f2, f);
        n = 6.0f;
        v = 2.0f;
        x = new ek5(fr4.i);
    }

    public static final void g(final float f, final xy1 xy1Var, final j73 j73Var, boolean z, final my1 my1Var, wq4 wq4Var, ja3 ja3Var, final nm0 nm0Var, cz1 cz1Var, ki0 ki0Var, h02 h02Var, final int i) {
        final boolean z2;
        final wq4 wq4Var2;
        final ja3 ja3Var2;
        final cz1 cz1Var2;
        final ki0 ki0Var2;
        wq4 wq4VarN;
        ja3 ja3Var3;
        cz1 cz1VarM0;
        boolean z3;
        int i2;
        ki0 ki0Var3;
        h02Var.Z(985901935);
        int i3 = i | (h02Var.r(f) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.x(j73Var) ? 256 : 128) | 819530752;
        byte b = 1;
        if (h02Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            h02Var.S();
            int i4 = i & 1;
            l76 l76Var = oo0.g;
            if (i4 == 0 || h02Var.k()) {
                cr4 cr4Var = cr4.g;
                wq4VarN = cr4.n(h02Var);
                int i5 = i3 & (-458753);
                Object objK = h02Var.K();
                if (objK == l76Var) {
                    objK = du4.n(h02Var);
                }
                ja3Var3 = (ja3) objK;
                cz1VarM0 = ue5.m0(-294493388, new w31(wq4VarN, b), h02Var);
                z3 = true;
                i2 = i5;
                ki0Var3 = new ki0(0.0f, 1.0f);
            } else {
                h02Var.Q();
                z3 = z;
                wq4VarN = wq4Var;
                ja3Var3 = ja3Var;
                cz1VarM0 = cz1Var;
                i2 = i3 & (-458753);
                ki0Var3 = ki0Var;
            }
            h02Var.s();
            boolean zX = h02Var.x(ki0Var3);
            Object objK2 = h02Var.K();
            if (zX || objK2 == l76Var) {
                objK2 = new kr4(f, my1Var, ki0Var3);
                h02Var.i0(objK2);
            }
            kr4 kr4Var = (kr4) objK2;
            kr4Var.j = my1Var;
            kr4Var.m = xy1Var;
            kr4Var.r(f);
            y(kr4Var, j73Var, z3, null, ja3Var3, nm0Var, cz1VarM0, h02Var, ((i2 >> 3) & 1008) | 1794048);
            wq4Var2 = wq4VarN;
            z2 = z3;
            ja3Var2 = ja3Var3;
            cz1Var2 = cz1VarM0;
            ki0Var2 = ki0Var3;
        } else {
            h02Var.Q();
            z2 = z;
            wq4Var2 = wq4Var;
            ja3Var2 = ja3Var;
            cz1Var2 = cz1Var;
            ki0Var2 = ki0Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(f, xy1Var, j73Var, z2, my1Var, wq4Var2, ja3Var2, nm0Var, cz1Var2, ki0Var2, i) { // from class: dr4
                public final /* synthetic */ j73 a;
                public final /* synthetic */ cz1 b;
                public final /* synthetic */ ja3 c;
                public final /* synthetic */ nm0 i;
                public final /* synthetic */ float j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ my1 q;
                public final /* synthetic */ ki0 s;
                public final /* synthetic */ xy1 t;
                public final /* synthetic */ wq4 w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(100687873);
                    jr4.g(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final float n(float f, float[] fArr, float f2, float f3) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(lr2.e(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float fAbs2 = Math.abs(lr2.e(f2, f3, f5) - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f4 = f5;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? lr2.e(f2, f3, fValueOf.floatValue()) : f;
    }

    public static final void r(j73 j73Var, kr4 kr4Var, boolean z, ja3 ja3Var, nm0 nm0Var, cz1 cz1Var, h02 h02Var, int i) {
        int i2;
        kr4 kr4Var2;
        j73 a05Var;
        cz1 cz1Var2 = cz1Var;
        pp3 pp3Var = kr4Var.a;
        h02Var.Z(898172835);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(kr4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(ja3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(nm0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.j(cz1Var2) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z2 = false;
        if (h02Var.N(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z3 = h02Var.a(hp0.c) == fl2.t;
            kr4Var.b = z3;
            um3 um3Var = kr4Var.u;
            if (um3Var == um3.t && z3) {
                z2 = true;
            }
            g73 g73Var = g73.g;
            if (z) {
                qm1 qm1Var = new qm1(kr4Var, b);
                ju3 ju3Var = b05.g;
                a05Var = new a05(kr4Var, ja3Var, qm1Var, 4);
            } else {
                a05Var = g73Var;
            }
            um3 um3Var2 = kr4Var.u;
            boolean zBooleanValue = ((Boolean) kr4Var.z.getValue()).booleanValue();
            boolean zJ = h02Var.j(kr4Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zJ || objK == l76Var) {
                objK = new cy(kr4Var, null, b2);
                h02Var.i0(objK);
            }
            j73 j73Var2 = a05Var;
            byte b3 = 0;
            j73 j73VarY = nd1.y(g73Var, kr4Var, um3Var2, z, ja3Var, zBooleanValue, (cz1) objK, z2, 32);
            boolean z4 = z2;
            kr4Var2 = kr4Var;
            xq4 xq4Var = xq4.j;
            um3 um3Var3 = um3.j;
            j73 j73VarC = um3Var == um3Var3 ? mq4.c(ue5.X(g73Var, xq4Var)) : mq4.b(ue5.X(g73Var, xq4Var));
            f72 f72Var = ye2.g;
            j73 j73VarN = j73Var.n(c63.g);
            float f = y;
            float f2 = g;
            j73 j73VarG = dj4.g(mq4.l(j73VarN, um3Var == um3Var3 ? f2 : f, um3Var == um3Var3 ? f : f2, 0.0f, 0.0f, 12), false, new yv((byte) 2, kr4Var2, z));
            ki0 ki0Var = kr4Var2.t;
            j73 j73VarY2 = rb6.y(dj4.g(j73VarG.n(um3Var == um3Var3 ? w2.y : w2.g), true, new xc1(pp3Var.d(), new ki0(ki0Var.g, ki0Var.y), (byte) 1)), z, ja3Var);
            j73 j73Var3 = j73VarC;
            j73 j73VarN2 = ic6.r(j73VarY2, new hr4(z, kr4Var2.m, kr4Var2.t, z4, pp3Var.d(), kr4Var2.j)).n(j73Var2).n(j73VarY);
            boolean zJ2 = h02Var.j(kr4Var2);
            Object objK2 = h02Var.K();
            if (zJ2 || objK2 == l76Var) {
                objK2 = new rv2(kr4Var2, (byte) 1);
                h02Var.i0(objK2);
            }
            t33 t33Var = (t33) objK2;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarN2);
            jo0.n.getClass();
            h02Var.b0();
            boolean z5 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z5) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, t33Var);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            boolean zJ3 = h02Var.j(kr4Var2);
            Object objK3 = h02Var.K();
            if (zJ3 || objK3 == l76Var) {
                objK3 = new er4(kr4Var2, b3);
                h02Var.i0(objK3);
            }
            j73 j73VarV = uc6.v(j73Var3, (xy1) objK3);
            k00 k00Var = hi0.t;
            t33 t33VarR = z50.r(k00Var, false);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarV);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                du4.f(iS2, h02Var, iS2, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW2);
            int i4 = (i3 >> 3) & 14;
            nm0Var.x(kr4Var2, h02Var, Integer.valueOf(((i3 >> 9) & 112) | i4));
            h02Var.b(true);
            j73 j73VarX = ue5.X(g73Var, xq4.t);
            t33 t33VarR2 = z50.r(k00Var, false);
            int iS3 = pw5.s(h02Var);
            tr3 tr3VarQ3 = h02Var.q();
            j73 j73VarW3 = m50.W(h02Var, j73VarX);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR2);
            xs2.E(on0Var2, h02Var, tr3VarQ3);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS3))) {
                du4.f(iS3, h02Var, iS3, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW3);
            cz1Var2 = cz1Var;
            cz1Var2.x(kr4Var2, h02Var, Integer.valueOf(i4 | ((i3 >> 12) & 112)));
            h02Var.b(true);
            h02Var.b(true);
        } else {
            kr4Var2 = kr4Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xd0(j73Var, kr4Var2, z, ja3Var, nm0Var, cz1Var2, i);
        }
    }

    public static final void y(kr4 kr4Var, j73 j73Var, boolean z, wq4 wq4Var, ja3 ja3Var, nm0 nm0Var, cz1 cz1Var, h02 h02Var, int i) {
        int i2;
        wq4 wq4Var2;
        int i3;
        wq4 wq4VarN;
        h02Var.Z(409861960);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(kr4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.x(ja3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.j(nm0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.j(cz1Var) ? 1048576 : 524288;
        }
        if (h02Var.N(i2 & 1, (599187 & i2) != 599186)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                cr4 cr4Var = cr4.g;
                i3 = i2 & (-7169);
                wq4VarN = cr4.n(h02Var);
            } else {
                h02Var.Q();
                i3 = i2 & (-7169);
                wq4VarN = wq4Var;
            }
            h02Var.s();
            int i4 = i3 >> 3;
            r(j73Var, kr4Var, z, ja3Var, nm0Var, cz1Var, h02Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            wq4Var2 = wq4VarN;
        } else {
            h02Var.Q();
            wq4Var2 = wq4Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mz(kr4Var, j73Var, z, wq4Var2, ja3Var, nm0Var, cz1Var, i);
        }
    }
}
