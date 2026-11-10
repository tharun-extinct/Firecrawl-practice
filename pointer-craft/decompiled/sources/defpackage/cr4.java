package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cr4 {
    public static final cr4 g = new cr4();
    public static final ld n;
    public static final float r;
    public static final float y;

    static {
        float f = oe6.c;
        y = f;
        r = f;
        n = nd.g();
    }

    public static wq4 n(h02 h02Var) {
        rj0 rj0Var = (rj0) h02Var.a(tj0.g);
        wq4 wq4Var = rj0Var.o0;
        if (wq4Var != null) {
            return wq4Var;
        }
        long jN = tj0.n(rj0Var, oe6.j);
        sj0 sj0Var = oe6.g;
        long jN2 = tj0.n(rj0Var, sj0Var);
        sj0 sj0Var2 = oe6.q;
        long jN3 = tj0.n(rj0Var, sj0Var2);
        long jN4 = tj0.n(rj0Var, sj0Var2);
        long jN5 = tj0.n(rj0Var, sj0Var);
        long jC = ra.c(jj0.y(oe6.v, tj0.n(rj0Var, oe6.n)), rj0Var.b);
        sj0 sj0Var3 = oe6.y;
        long jN6 = tj0.n(rj0Var, sj0Var3);
        float f = oe6.r;
        long jY = jj0.y(f, jN6);
        sj0 sj0Var4 = oe6.x;
        long jN7 = tj0.n(rj0Var, sj0Var4);
        float f2 = oe6.l;
        wq4 wq4Var2 = new wq4(jN, jN2, jN3, jN4, jN5, jC, jY, jj0.y(f2, jN7), jj0.y(f2, tj0.n(rj0Var, sj0Var4)), jj0.y(f, tj0.n(rj0Var, sj0Var3)));
        rj0Var.o0 = wq4Var2;
        return wq4Var2;
    }

    public static void v(xd1 xd1Var, um3 um3Var, long j, long j2, long j3, float f, float f2) {
        ha4 ha4Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (um3Var == um3.j) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            k44 k44VarR = kq2.r(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            ha4Var = new ha4(k44VarR.g, k44VarR.y, k44VarR.r, k44VarR.n, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            k44 k44VarR2 = kq2.r(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            ha4Var = new ha4(k44VarR2.g, k44VarR2.y, k44VarR2.r, k44VarR2.n, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        ld ldVar = n;
        ld.r(ldVar, ha4Var);
        xd1.r0(xd1Var, ldVar, j3, null, 60);
        ldVar.j();
    }

    public final void g(final ja3 ja3Var, j73 j73Var, final wq4 wq4Var, final boolean z, long j, h02 h02Var, final int i) {
        int i2;
        final j73 j73Var2;
        final long j2;
        j73 j73Var3;
        long jFloatToRawIntBits;
        h02Var.Z(-290277409);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(ja3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48 | (h02Var.x(wq4Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= h02Var.l(z) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (h02Var.N(i4 & 1, (74899 & i4) != 74898)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                j2 = jr4.r;
                j73Var3 = g73.g;
            } else {
                h02Var.Q();
                j73Var3 = j73Var;
                j2 = j;
            }
            h02Var.s();
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new st4();
                h02Var.i0(objK);
            }
            st4 st4Var = (st4) objK;
            boolean z2 = (i4 & 14) == 4;
            Object objK2 = h02Var.K();
            if (z2 || objK2 == l76Var) {
                objK2 = new s12(ja3Var, st4Var, null, (byte) 17);
                h02Var.i0(objK2);
            }
            k33.b((bz1) objK2, h02Var, ja3Var);
            if (st4Var.isEmpty()) {
                jFloatToRawIntBits = j2;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(yb1.y(j2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(yb1.g(j2))) & 4294967295L);
            }
            ho1 ho1Var = mq4.g;
            mq2.y(h02Var, og0.a(cc6.j(mq4.t(j73Var3, yb1.y(jFloatToRawIntBits), yb1.g(jFloatToRawIntBits)), ja3Var), z ? wq4Var.g : wq4Var.x, vn4.y(oe6.a, h02Var)));
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            j2 = j;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: zq4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.j.g(ja3Var, j73Var2, wq4Var, z, j2, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public final void r(final kr4 kr4Var, final j73 j73Var, final boolean z, final wq4 wq4Var, final bz1 bz1Var, final cz1 cz1Var, final float f, final float f2, h02 h02Var, final int i, final int i2) {
        int i3;
        int i4;
        h02 h02Var2;
        h02Var.Z(133396521);
        if ((i & 6) == 0) {
            i3 = (h02Var.j(kr4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var.r(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= h02Var.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= h02Var.x(wq4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= h02Var.j(bz1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= h02Var.j(cz1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= h02Var.r(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= h02Var.r(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= h02Var.l(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (h02Var.l(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (h02Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jG = wq4Var.g(z, false);
            final long jG2 = wq4Var.g(z, true);
            long j = z ? wq4Var.v : wq4Var.a;
            long j2 = z ? wq4Var.r : wq4Var.j;
            j73 j73VarN = kr4Var.u == um3.j ? mq4.q(j73Var, jr4.g).n(mq4.y) : mq4.n(mq4.r(j73Var, 1.0f), jr4.g);
            int i5 = i3 & 112;
            boolean zJ = (i5 == 32) | h02Var.j(kr4Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zJ || objK == l76Var) {
                objK = new tn((Object) kr4Var, (byte) 16);
                h02Var.i0(objK);
            }
            j73 j73VarN2 = j73VarN.n(ra.G(g73.g, (cz1) objK));
            boolean zJ2 = (i5 == 32) | h02Var.j(kr4Var) | h02Var.v(jG) | h02Var.v(jG2) | h02Var.v(j) | h02Var.v(j2) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576) | ((i3 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objK2 = h02Var.K();
            if (zJ2 || objK2 == l76Var) {
                h02Var2 = h02Var;
                final long j3 = j;
                final long j4 = j2;
                xy1 xy1Var = new xy1() { // from class: ar4
                    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
                    /* JADX WARN: Code duplicated, block: B:135:0x0327  */
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        float fE;
                        long j5;
                        long jN;
                        float f3;
                        um3 um3Var;
                        float f4;
                        char c;
                        bz1 bz1Var2;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        xd1 xd1Var;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        xd1 xd1Var2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        float fE2;
                        float fE3;
                        xd1 xd1Var3 = (xd1) obj;
                        boolean zY = vb1.y(Float.NaN, Float.NaN);
                        um3 um3Var2 = um3.j;
                        kr4 kr4Var2 = kr4Var;
                        if (zY) {
                            fE = (kr4Var2.u == um3Var2 ? Float.intBitsToFloat((int) (xd1Var3.n() >> 32)) : Float.intBitsToFloat((int) (xd1Var3.n() & 4294967295L))) / 2.0f;
                        } else {
                            fE = xd1Var3.e(Float.NaN);
                        }
                        cr4 cr4Var = cr4.g;
                        float[] fArr = kr4Var2.w;
                        float fY = kr4Var2.y();
                        int i6 = 0;
                        float fY0 = xd1Var3.y0(0);
                        float fY1 = xd1Var3.y0(0);
                        float fY2 = xd1Var3.y0(kr4Var2.s.d());
                        float fY3 = xd1Var3.y0(kr4Var2.p.d());
                        float fB0 = xd1Var3.B0(fE);
                        um3 um3Var3 = kr4Var2.u;
                        boolean z2 = um3Var3 == um3Var2;
                        boolean z3 = xd1Var3.getLayoutDirection() == fl2.t;
                        boolean z4 = z3 && !z2;
                        float fE4 = xd1Var3.e(fB0);
                        if (z2) {
                            j5 = 4294967295L;
                            jN = xd1Var3.n() & 4294967295L;
                        } else {
                            j5 = 4294967295L;
                            jN = xd1Var3.n() >> 32;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jN);
                        fArr.getClass();
                        if (yf2.s(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[0])) || yf2.s(0.0f, pr.f0(fArr))) {
                        }
                        float fY4 = (fArr.length == 0 || (yf2.s(fY, fArr.length != 0 ? Float.valueOf(fArr[0]) : null) || yf2.s(fY, pr.f0(fArr)))) ? du4.y(fIntBitsToFloat, 0.0f, fY, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fE4 * 2.0f)) * fY) + 0.0f + fE4;
                        int length = fArr.length;
                        float fE5 = xd1Var3.e(f2);
                        float f5 = f;
                        if (vb1.g(f5, 0.0f) > 0) {
                            if (z2) {
                                xd1Var3.e(fY1);
                                xd1Var3.e(f5);
                                fE2 = xd1Var3.e(fY3) / 2.0f;
                                fE3 = xd1Var3.e(f5);
                            } else {
                                xd1Var3.e(fY0);
                                xd1Var3.e(f5);
                                fE2 = xd1Var3.e(fY2) / 2.0f;
                                fE3 = xd1Var3.e(f5);
                            }
                            f3 = fE3 + fE2;
                        } else {
                            f3 = 0.0f;
                        }
                        long jE0 = xd1Var3.e0();
                        Float.intBitsToFloat((int) (z2 ? jE0 & j5 : jE0 >> 32));
                        float f6 = (fIntBitsToFloat - f3) - fE4;
                        bz1 bz1Var3 = bz1Var;
                        if (fY4 < f6) {
                            float f7 = z4 ? fE4 : fE5;
                            float f8 = z4 ? fE5 : fE4;
                            float f9 = fY4 + f3;
                            float f10 = fIntBitsToFloat - f9;
                            if (z2) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f9);
                                f4 = 0.0f;
                                c = ' ';
                            } else {
                                f4 = 0.0f;
                                c = ' ';
                                if (z3) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f9);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits6 << c) | (((long) iFloatToRawIntBits4) & j5);
                            if (z2) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var3.n() >> c)));
                                xd1Var2 = xd1Var3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f10);
                            } else {
                                xd1Var2 = xd1Var3;
                                if (z3) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd1Var2.n() >> c)) - f9;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (xd1Var2.n() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (xd1Var2.n() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f10);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j7 = (jFloatToRawIntBits8 & j5) | (jFloatToRawIntBits7 << c);
                            um3Var = um3Var3;
                            xd1Var3 = xd1Var2;
                            bz1Var2 = bz1Var3;
                            cr4.v(xd1Var3, um3Var, j6, j7, jG, f7, f8);
                            if (z2) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var3.e0() >> c)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fE4);
                            } else {
                                if (z3) {
                                    jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fE4)) << c) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var3.e0() & j5)))) & j5);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (xd1Var3.e0() & j5));
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fE4);
                                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                if (bz1Var2 != null) {
                                    bz1Var2.l(xd1Var3, new wi3(jFloatToRawIntBits10));
                                }
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j5) | (jFloatToRawIntBits9 << c);
                            if (bz1Var2 != null) {
                                bz1Var2.l(xd1Var3, new wi3(jFloatToRawIntBits10));
                            }
                        } else {
                            um3Var = um3Var3;
                            f4 = 0.0f;
                            c = ' ';
                            bz1Var2 = bz1Var3;
                        }
                        float f11 = fY4 - f3;
                        float f12 = !z4 ? fE4 : fE5;
                        float f13 = z4 ? fE4 : fE5;
                        float f14 = z4 ? f11 : f11 - f4;
                        if (f14 > f12) {
                            if (!z2 && z3) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var3.n() >> c)) - f11);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            }
                            long j8 = (jFloatToRawIntBits3 << c) | (((long) iFloatToRawIntBits2) & j5);
                            if (z2) {
                                xd1Var = xd1Var3;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f14)) & j5) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var3.n() >> c)))) << c);
                            } else {
                                xd1Var = xd1Var3;
                                if (z3) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (xd1Var.n() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f11);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (xd1Var.n() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c) | (((long) iFloatToRawIntBits3) & j5);
                            }
                            long j9 = jFloatToRawIntBits5;
                            xd1Var3 = xd1Var;
                            cr4.v(xd1Var3, um3Var, j8, j9, jG2, f12, f13);
                        }
                        float f15 = f4 + fE4;
                        float f16 = fIntBitsToFloat - fE4;
                        float f17 = fY4 - f3;
                        float f18 = fY4 + f3;
                        int length2 = fArr.length;
                        int i7 = 0;
                        while (i6 < length2) {
                            float f19 = fArr[i6];
                            int i8 = i7 + 1;
                            if (bz1Var2 == null || i7 != fArr.length - 1) {
                                float fE6 = lr2.e(f15, f16, f19);
                                if (fE6 < f17 || fE6 > f18) {
                                    if (z2) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var3.e0() >> c)));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fE6);
                                    } else {
                                        if (z3) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (xd1Var3.n() >> c)) - fE6;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (xd1Var3.e0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (xd1Var3.e0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fE6);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    cz1Var.x(xd1Var3, new wi3((jFloatToRawIntBits2 & j5) | (jFloatToRawIntBits << c)), new jj0((fE6 < f4 || fE6 > f11) ? j3 : j4));
                                } else {
                                    f15 = f15;
                                    f17 = f17;
                                }
                            } else {
                                f15 = f15;
                                f17 = f17;
                            }
                            i6++;
                            i7 = i8;
                            f15 = f15;
                            f17 = f17;
                        }
                        return og5.g;
                    }
                };
                h02Var2.i0(xy1Var);
                objK2 = xy1Var;
            } else {
                h02Var2 = h02Var;
            }
            ue5.v(j73VarN2, (xy1) objK2, h02Var2, 0);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: br4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.j.r(kr4Var, j73Var, z, wq4Var, bz1Var, cz1Var, f, f2, (h02) obj, aq2.J(i | 1), aq2.J(i2));
                    return og5.g;
                }
            };
        }
    }

    public final void y(final kr4 kr4Var, j73 j73Var, final boolean z, final wq4 wq4Var, bz1 bz1Var, cz1 cz1Var, float f, float f2, h02 h02Var, final int i) {
        int i2;
        final j73 j73Var2;
        final bz1 bz1Var2;
        final cz1 cz1Var2;
        final float f3;
        final float f4;
        int i3;
        bz1 bz1Var3;
        float f5;
        cz1 cz1Var3;
        j73 j73Var3;
        float f6;
        h02Var.Z(49984771);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(kr4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= h02Var.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= h02Var.x(wq4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= h02Var.x(this) ? 67108864 : 33554432;
        }
        if (h02Var.N(i5 & 1, (38347923 & i5) != 38347922)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && h02Var.x(wq4Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objK = h02Var.K();
                l76 l76Var = oo0.g;
                if (z2 || objK == l76Var) {
                    objK = new db((byte) 7, wq4Var, z);
                    h02Var.i0(objK);
                }
                bz1 bz1Var4 = (bz1) objK;
                i3 = i5 & (-57345);
                Object objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    objK2 = om0.a;
                    h02Var.i0(objK2);
                }
                float f7 = jr4.n;
                bz1Var3 = bz1Var4;
                f5 = jr4.v;
                cz1Var3 = (cz1) objK2;
                j73Var3 = g73.g;
                f6 = f7;
            } else {
                h02Var.Q();
                i3 = i5 & (-57345);
                j73Var3 = j73Var;
                bz1Var3 = bz1Var;
                cz1Var3 = cz1Var;
                f6 = f;
                f5 = f2;
            }
            h02Var.s();
            int i6 = i3 << 3;
            r(kr4Var, j73Var3, z, wq4Var, bz1Var3, cz1Var3, f6, f5, h02Var, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            j73Var2 = j73Var3;
            f4 = f5;
            f3 = f6;
            cz1Var2 = cz1Var3;
            bz1Var2 = bz1Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            bz1Var2 = bz1Var;
            cz1Var2 = cz1Var;
            f3 = f;
            f4 = f2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: yq4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.j.y(kr4Var, j73Var2, z, wq4Var, bz1Var2, cz1Var2, f3, f4, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
