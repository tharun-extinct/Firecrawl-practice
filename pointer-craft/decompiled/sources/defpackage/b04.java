package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b04 {
    public static final hy0 g = i83.g;
    public static final hy0 y = i83.r;

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0212  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void g(j73 j73Var, long j, float f, long j2, int i, float f2, h02 h02Var, final int i2, final int i3) {
        j73 j73Var2;
        int i4;
        float f3;
        int i5;
        boolean z;
        h02 h02Var2;
        final long j3;
        final j73 j73Var3;
        final long j4;
        final float f4;
        final int i6;
        final float f5;
        u34 u34VarP;
        j73 j73Var4;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final by4 by4Var;
        final bc2 bc2VarX;
        final bc2 bc2VarX2;
        final bc2 bc2VarX3;
        boolean z2;
        boolean zX;
        Object objK;
        final long j6;
        final float f7;
        final long j7;
        h02Var.Z(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            j73Var2 = j73Var;
        } else if ((i2 & 6) == 0) {
            j73Var2 = j73Var;
            i4 = (h02Var.x(j73Var2) ? 4 : 2) | i2;
        } else {
            j73Var2 = j73Var;
            i4 = i2;
        }
        long jV = j;
        int i10 = i4 | (((i3 & 2) == 0 && h02Var.v(jV)) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i10 |= h02Var.r(f3) ? 256 : 128;
            }
            i5 = i10 | 222208;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i5 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0 || h02Var.k()) {
                    if (i9 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jV = tj0.v(a11.d, h02Var);
                        i5 &= -113;
                    }
                    if (i11 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = jj0.l;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    h02Var.Q();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    j73Var4 = j73Var2;
                }
                h02Var.s();
                by4Var = new by4(((j51) h02Var.a(hp0.j)).e(f3), 0.0f, i8, 0, 26);
                ec2 ec2VarG = og0.G(1, h02Var);
                bc2VarX = og0.x(ec2VarG, 0.0f, 1080.0f, m50.Q(m50.e0(6000, 0, dg1.r, 2), 6), h02Var, 4536, 8);
                rn3 rn3Var = new rn3((byte) 5);
                bk2 bk2Var = new bk2();
                rn3Var.a(bk2Var);
                bc2VarX2 = og0.x(ec2VarG, 0.0f, 360.0f, m50.Q(new ck2(bk2Var), 6), h02Var, 4536, 8);
                bk2 bk2Var2 = new bk2();
                bk2Var2.g = (short) 6000;
                bk2Var2.g(Float.valueOf(0.87f), 3000).y = y;
                bk2Var2.g(Float.valueOf(0.1f), 6000);
                bc2VarX3 = og0.x(ec2VarG, 0.1f, 0.87f, m50.Q(new ck2(bk2Var2), 6), h02Var, 4536, 8);
                h02Var2 = h02Var;
                j73 j73VarJ = mq4.j(dj4.g(j73Var4, true, new rn3((byte) 6)), 40.0f);
                boolean zX2 = h02Var2.x(bc2VarX3);
                j73 j73Var5 = j73Var4;
                if ((i7 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zX = z2 | zX2 | h02Var2.x(bc2VarX) | h02Var2.x(bc2VarX2) | h02Var2.v(j5) | h02Var2.j(by4Var) | ((((i7 & 112) ^ 48) <= 32 && h02Var2.v(jV)) || (i7 & 48) == 32);
                objK = h02Var2.K();
                if (!zX || objK == oo0.g) {
                    j6 = jV;
                    f7 = f3;
                    j7 = j5;
                    objK = new xy1() { // from class: tz3
                        @Override // defpackage.xy1
                        public final Object a(Object obj) {
                            long j8 = j7;
                            by4 by4Var2 = by4Var;
                            long j9 = j6;
                            xd1 xd1Var = (xd1) obj;
                            float fFloatValue = ((Number) bc2VarX3.getValue()).floatValue() * 360.0f;
                            boolean z3 = i8;
                            float f8 = f6;
                            if (z3 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                                f8 += f7;
                            }
                            float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) bc2VarX2.getValue()).floatValue() + ((Number) bc2VarX.getValue()).floatValue();
                            long jE0 = xd1Var.e0();
                            ro roVarE = xd1Var.E();
                            long jG = roVarE.G();
                            roVarE.b().q();
                            try {
                                ((y22) roVarE.t).e(fFloatValue2, jE0);
                                b04.v(xd1Var, Math.min(fFloatValue, fB0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f), j8, by4Var2);
                                b04.v(xd1Var, 0.0f, fFloatValue, j9, by4Var2);
                                return og5.g;
                            } finally {
                                du4.d(roVarE, jG);
                            }
                        }
                    };
                    h02Var2.i0(objK);
                } else {
                    j6 = jV;
                    f7 = f3;
                    j7 = j5;
                }
                ue5.v(j73VarJ, (xy1) objK, h02Var2, 0);
                j73Var3 = j73Var5;
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j3 = j7;
                j4 = j6;
            } else {
                h02Var2 = h02Var;
                h02Var2.Q();
                j3 = j2;
                j73Var3 = j73Var2;
                j4 = jV;
                f4 = f3;
                i6 = i;
                f5 = f2;
            }
            u34VarP = h02Var2.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: uz3
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i2 | 1);
                        j73 j73Var6 = j73Var3;
                        long j8 = j4;
                        float f8 = f4;
                        long j9 = j3;
                        boolean z3 = i6;
                        float f9 = f5;
                        b04.g(j73Var6, j8, f8, j9, z3 ? 1 : 0, f9, (h02) obj, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i10 |= 384;
        f3 = f;
        i5 = i10 | 222208;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i5 & 1, z)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 2) != 0) {
                    jV = tj0.v(a11.d, h02Var);
                    i5 &= -113;
                }
                if (i11 != 0) {
                    f3 = 4.0f;
                }
                j5 = jj0.l;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            } else {
                if (i9 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 2) != 0) {
                    jV = tj0.v(a11.d, h02Var);
                    i5 &= -113;
                }
                if (i11 != 0) {
                    f3 = 4.0f;
                }
                j5 = jj0.l;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            }
            h02Var.s();
            by4Var = new by4(((j51) h02Var.a(hp0.j)).e(f3), 0.0f, i8, 0, 26);
            ec2 ec2VarG2 = og0.G(1, h02Var);
            bc2VarX = og0.x(ec2VarG2, 0.0f, 1080.0f, m50.Q(m50.e0(6000, 0, dg1.r, 2), 6), h02Var, 4536, 8);
            rn3 rn3Var2 = new rn3((byte) 5);
            bk2 bk2Var3 = new bk2();
            rn3Var2.a(bk2Var3);
            bc2VarX2 = og0.x(ec2VarG2, 0.0f, 360.0f, m50.Q(new ck2(bk2Var3), 6), h02Var, 4536, 8);
            bk2 bk2Var4 = new bk2();
            bk2Var4.g = (short) 6000;
            bk2Var4.g(Float.valueOf(0.87f), 3000).y = y;
            bk2Var4.g(Float.valueOf(0.1f), 6000);
            bc2VarX3 = og0.x(ec2VarG2, 0.1f, 0.87f, m50.Q(new ck2(bk2Var4), 6), h02Var, 4536, 8);
            h02Var2 = h02Var;
            j73 j73VarJ2 = mq4.j(dj4.g(j73Var4, true, new rn3((byte) 6)), 40.0f);
            boolean zX3 = h02Var2.x(bc2VarX3);
            j73 j73Var6 = j73Var4;
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zX = z2 | zX3 | h02Var2.x(bc2VarX) | h02Var2.x(bc2VarX2) | h02Var2.v(j5) | h02Var2.j(by4Var) | ((((i7 & 112) ^ 48) <= 32 && h02Var2.v(jV)) || (i7 & 48) == 32);
            objK = h02Var2.K();
            if (zX) {
                j6 = jV;
                f7 = f3;
                j7 = j5;
                objK = new xy1() { // from class: tz3
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        long j8 = j7;
                        by4 by4Var2 = by4Var;
                        long j9 = j6;
                        xd1 xd1Var = (xd1) obj;
                        float fFloatValue = ((Number) bc2VarX3.getValue()).floatValue() * 360.0f;
                        boolean z3 = i8;
                        float f8 = f6;
                        if (z3 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                            f8 += f7;
                        }
                        float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) bc2VarX2.getValue()).floatValue() + ((Number) bc2VarX.getValue()).floatValue();
                        long jE0 = xd1Var.e0();
                        ro roVarE = xd1Var.E();
                        long jG = roVarE.G();
                        roVarE.b().q();
                        try {
                            ((y22) roVarE.t).e(fFloatValue2, jE0);
                            b04.v(xd1Var, Math.min(fFloatValue, fB0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f), j8, by4Var2);
                            b04.v(xd1Var, 0.0f, fFloatValue, j9, by4Var2);
                            return og5.g;
                        } finally {
                            du4.d(roVarE, jG);
                        }
                    }
                };
                h02Var2.i0(objK);
            } else {
                j6 = jV;
                f7 = f3;
                j7 = j5;
                objK = new xy1() { // from class: tz3
                    @Override // defpackage.xy1
                    public final Object a(Object obj) {
                        long j8 = j7;
                        by4 by4Var2 = by4Var;
                        long j9 = j6;
                        xd1 xd1Var = (xd1) obj;
                        float fFloatValue = ((Number) bc2VarX3.getValue()).floatValue() * 360.0f;
                        boolean z3 = i8;
                        float f8 = f6;
                        if (z3 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                            f8 += f7;
                        }
                        float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) bc2VarX2.getValue()).floatValue() + ((Number) bc2VarX.getValue()).floatValue();
                        long jE0 = xd1Var.e0();
                        ro roVarE = xd1Var.E();
                        long jG = roVarE.G();
                        roVarE.b().q();
                        try {
                            ((y22) roVarE.t).e(fFloatValue2, jE0);
                            b04.v(xd1Var, Math.min(fFloatValue, fB0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f), j8, by4Var2);
                            b04.v(xd1Var, 0.0f, fFloatValue, j9, by4Var2);
                            return og5.g;
                        } finally {
                            du4.d(roVarE, jG);
                        }
                    }
                };
                h02Var2.i0(objK);
            }
            ue5.v(j73VarJ2, (xy1) objK, h02Var2, 0);
            j73Var3 = j73Var6;
            i6 = i8;
            f5 = f6;
            f4 = f7;
            j3 = j7;
            j4 = j6;
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
            j3 = j2;
            j73Var3 = j73Var2;
            j4 = jV;
            f4 = f3;
            i6 = i;
            f5 = f2;
        }
        u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: uz3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i2 | 1);
                    j73 j73Var7 = j73Var3;
                    long j8 = j4;
                    float f8 = f4;
                    long j9 = j3;
                    boolean z3 = i6;
                    float f9 = f5;
                    b04.g(j73Var7, j8, f8, j9, z3 ? 1 : 0, f9, (h02) obj, iJ, i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(j73 j73Var, long j, long j2, int i, float f, h02 h02Var, final int i2) {
        j73 j73Var2;
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        long jV;
        long jV2;
        int i4;
        float f3;
        final int i5;
        final float f4;
        long j5;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        h02Var.Z(567589233);
        int i6 = i2 | 27792;
        if (h02Var.N(i6 & 1, (i6 & 9363) != 9362)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                jV = tj0.v(a11.d, h02Var);
                jV2 = tj0.v(a11.e, h02Var);
                i4 = 1;
                f3 = 4.0f;
            } else {
                h02Var.Q();
                jV = j;
                jV2 = j2;
                i4 = i;
                f3 = f;
            }
            h02Var.s();
            ec2 ec2VarG = og0.G(1, h02Var);
            bk2 bk2Var = new bk2();
            bk2Var.g = (short) 1750;
            ak2 ak2VarG = bk2Var.g(fValueOf2, 0);
            hy0 hy0Var = g;
            ak2VarG.y = hy0Var;
            bk2Var.g(fValueOf, 1000);
            final long j6 = jV2;
            final bc2 bc2VarX = og0.x(ec2VarG, 0.0f, 1.0f, m50.Q(new ck2(bk2Var), 6), h02Var, 4536, 8);
            bk2 bk2Var2 = new bk2();
            bk2Var2.g = (short) 1750;
            bk2Var2.g(fValueOf2, 250).y = hy0Var;
            bk2Var2.g(fValueOf, 1250);
            final bc2 bc2VarX2 = og0.x(ec2VarG, 0.0f, 1.0f, m50.Q(new ck2(bk2Var2), 6), h02Var, 4536, 8);
            bk2 bk2Var3 = new bk2();
            bk2Var3.g = (short) 1750;
            bk2Var3.g(fValueOf2, 650).y = hy0Var;
            bk2Var3.g(fValueOf, 1500);
            final bc2 bc2VarX3 = og0.x(ec2VarG, 0.0f, 1.0f, m50.Q(new ck2(bk2Var3), 6), h02Var, 4536, 8);
            bk2 bk2Var4 = new bk2();
            bk2Var4.g = (short) 1750;
            bk2Var4.g(fValueOf2, 900).y = hy0Var;
            bk2Var4.g(fValueOf, 1750);
            final bc2 bc2VarX4 = og0.x(ec2VarG, 0.0f, 1.0f, m50.Q(new ck2(bk2Var4), 6), h02Var, 4536, 8);
            j73Var2 = j73Var;
            j73 j73VarT = mq4.t(dj4.g(j73Var2.n(w2.y), true, new rn3((byte) 6)), 240.0f, 4.0f);
            boolean zX = h02Var.x(bc2VarX) | h02Var.v(j6) | h02Var.x(bc2VarX2) | h02Var.v(jV) | h02Var.x(bc2VarX3) | h02Var.x(bc2VarX4);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                j3 = jV;
                i5 = i4;
                f4 = f3;
                Object obj = new xy1() { // from class: a04
                    @Override // defpackage.xy1
                    public final Object a(Object obj2) {
                        long j7;
                        xd1 xd1Var = (xd1) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L));
                        boolean z = i5;
                        float fB0 = f4;
                        if (z && Float.intBitsToFloat((int) (4294967295L & xd1Var.n())) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                            fB0 += xd1Var.B0(fIntBitsToFloat);
                        }
                        float fB1 = fB0 / xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)));
                        bw4 bw4Var = bc2VarX;
                        float fFloatValue = ((Number) bw4Var.getValue()).floatValue();
                        float f5 = 1.0f - fB1;
                        long j8 = j6;
                        if (fFloatValue < f5) {
                            b04.x(xd1Var, ((Number) bw4Var.getValue()).floatValue() > 0.0f ? ((Number) bw4Var.getValue()).floatValue() + fB1 : 0.0f, 1.0f, j8, fIntBitsToFloat, z ? 1 : 0);
                        }
                        long j9 = j8;
                        float fFloatValue2 = ((Number) bw4Var.getValue()).floatValue();
                        bw4 bw4Var2 = bc2VarX2;
                        float fFloatValue3 = fFloatValue2 - ((Number) bw4Var2.getValue()).floatValue();
                        long j10 = j3;
                        if (fFloatValue3 > 0.0f) {
                            b04.x(xd1Var, ((Number) bw4Var.getValue()).floatValue(), ((Number) bw4Var2.getValue()).floatValue(), j10, fIntBitsToFloat, z ? 1 : 0);
                            j7 = j10;
                        } else {
                            j7 = j10;
                        }
                        float fFloatValue4 = ((Number) bw4Var2.getValue()).floatValue();
                        bw4 bw4Var3 = bc2VarX3;
                        if (fFloatValue4 > fB1) {
                            b04.x(xd1Var, ((Number) bw4Var3.getValue()).floatValue() > 0.0f ? ((Number) bw4Var3.getValue()).floatValue() + fB1 : 0.0f, ((Number) bw4Var2.getValue()).floatValue() < 1.0f ? ((Number) bw4Var2.getValue()).floatValue() - fB1 : 1.0f, j9, fIntBitsToFloat, z ? 1 : 0);
                            j9 = j9;
                        }
                        float fFloatValue5 = ((Number) bw4Var3.getValue()).floatValue();
                        bw4 bw4Var4 = bc2VarX4;
                        if (fFloatValue5 - ((Number) bw4Var4.getValue()).floatValue() > 0.0f) {
                            b04.x(xd1Var, ((Number) bw4Var3.getValue()).floatValue(), ((Number) bw4Var4.getValue()).floatValue(), j7, fIntBitsToFloat, z ? 1 : 0);
                            xd1Var = xd1Var;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) bw4Var4.getValue()).floatValue() > fB1) {
                            b04.x(xd1Var, 0.0f, ((Number) bw4Var4.getValue()).floatValue() < 1.0f ? ((Number) bw4Var4.getValue()).floatValue() - fB1 : 1.0f, j9, fIntBitsToFloat, z ? 1 : 0);
                        }
                        return og5.g;
                    }
                };
                j5 = j6;
                h02Var.i0(obj);
                objK = obj;
            } else {
                j5 = j6;
                j3 = jV;
                i5 = i4;
                f4 = f3;
            }
            ue5.v(j73VarT, (xy1) objK, h02Var, 0);
            i3 = i5;
            f2 = f4;
            j4 = j5;
        } else {
            j73Var2 = j73Var;
            h02Var.Q();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final j73 j73Var3 = j73Var2;
            final long j7 = j3;
            u34VarP.n = new bz1(j7, j4, i3, f2, i2) { // from class: sz3
                public final /* synthetic */ long a;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ float q;
                public final /* synthetic */ long t;

                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(7);
                    j73 j73Var4 = this.j;
                    long j8 = this.t;
                    long j9 = this.a;
                    boolean z = this.m;
                    float f5 = this.q;
                    b04.n(j73Var4, j8, j9, z ? 1 : 0, f5, (h02) obj2, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void r(final my1 my1Var, final j73 j73Var, long j, long j2, int i, float f, xy1 xy1Var, h02 h02Var, final int i2, final int i3) {
        final long jV;
        final int i4;
        int i5;
        final xy1 xy1Var2;
        final long j3;
        final long j4;
        final int i6;
        final float f2;
        xy1 xy1Var3;
        int i7;
        final float f3;
        final xy1 xy1Var4;
        final long j5;
        final long j6;
        h02Var.Z(-339970038);
        int i8 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i8 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            jV = j;
            i8 |= ((i3 & 4) == 0 && h02Var.v(jV)) ? 256 : 128;
        } else {
            jV = j;
        }
        long jV2 = j2;
        int i9 = i8 | (((i3 & 8) == 0 && h02Var.v(jV2)) ? 2048 : 1024);
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i9 | 24576;
            i4 = i;
        } else {
            i4 = i;
            i5 = i9 | (h02Var.n(i4) ? 16384 : 8192);
        }
        int i11 = i5 | 720896;
        if (h02Var.N(i11 & 1, (599187 & i11) != 599186)) {
            h02Var.S();
            int i12 = i2 & 1;
            Object obj = oo0.g;
            if (i12 == 0 || h02Var.k()) {
                if ((i3 & 4) != 0) {
                    jV = tj0.v(a11.d, h02Var);
                    i11 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jV2 = tj0.v(a11.e, h02Var);
                    i11 &= -7169;
                }
                if (i10 != 0) {
                    i4 = 1;
                }
                boolean z = ((((i11 & 896) ^ 384) > 256 && h02Var.v(jV)) || (i11 & 384) == 256) | ((i11 & 57344) == 16384);
                Object objK = h02Var.K();
                if (z || objK == obj) {
                    objK = new xy1() { // from class: xz3
                        @Override // defpackage.xy1
                        public final Object a(Object obj2) {
                            xd1 xd1Var = (xd1) obj2;
                            float fMin = Math.min(xd1Var.e(4.0f), Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)));
                            float fE = xd1Var.e(6.0f);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) - fMin) / 2.0f;
                            float f4 = fIntBitsToFloat > fE ? fE : fIntBitsToFloat;
                            fl2 layoutDirection = xd1Var.getLayoutDirection();
                            fl2 fl2Var = fl2.t;
                            long j7 = jV;
                            int i13 = i4;
                            if (layoutDirection == fl2Var) {
                                long jE0 = xd1Var.e0();
                                ro roVarE = xd1Var.E();
                                long jG = roVarE.G();
                                roVarE.b().q();
                                try {
                                    ((y22) roVarE.t).A(-1.0f, 1.0f, jE0);
                                    zq2.t(xd1Var, i13, j7, fMin, f4);
                                } finally {
                                    du4.d(roVarE, jG);
                                }
                            } else {
                                zq2.t(xd1Var, i13, j7, fMin, f4);
                            }
                            return og5.g;
                        }
                    };
                    h02Var.i0(objK);
                }
                xy1Var3 = (xy1) objK;
                i7 = i11 & (-3670017);
                f3 = 4.0f;
            } else {
                h02Var.Q();
                if ((i3 & 4) != 0) {
                    i11 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i11 &= -7169;
                }
                i7 = i11 & (-3670017);
                f3 = f;
                xy1Var3 = xy1Var;
            }
            final int i13 = i4;
            h02Var.s();
            boolean z2 = (i7 & 14) == 4;
            Object objK2 = h02Var.K();
            if (z2 || objK2 == obj) {
                objK2 = new ss(my1Var, (byte) 9);
                h02Var.i0(objK2);
            }
            final my1 my1Var2 = (my1) objK2;
            j73 j73VarN = j73Var.n(w2.y);
            boolean zX = h02Var.x(my1Var2);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = new tz2(my1Var2, (byte) 5);
                h02Var.i0(objK3);
            }
            j73 j73VarT = mq4.t(dj4.g(j73VarN, true, (xy1) objK3), 240.0f, 4.0f);
            boolean zX2 = ((((i7 & 7168) ^ 3072) > 2048 && h02Var.v(jV2)) || (i7 & 3072) == 2048) | ((i7 & 57344) == 16384) | h02Var.x(my1Var2) | ((((i7 & 896) ^ 384) > 256 && h02Var.v(jV)) || (i7 & 384) == 256) | h02Var.x(xy1Var3);
            Object objK4 = h02Var.K();
            if (zX2 || objK4 == obj) {
                xy1Var4 = xy1Var3;
                j5 = jV;
                j6 = jV2;
                objK4 = new xy1() { // from class: yz3
                    @Override // defpackage.xy1
                    public final Object a(Object obj2) {
                        xd1 xd1Var = (xd1) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L));
                        boolean z3 = i13;
                        float fB0 = f3;
                        if (z3 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                            fB0 += xd1Var.B0(fIntBitsToFloat);
                        }
                        float fB1 = fB0 / xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)));
                        float fFloatValue = ((Number) my1Var2.g()).floatValue();
                        float fMin = Math.min(fFloatValue, fB1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            b04.x(xd1Var, fMin, 1.0f, j6, fIntBitsToFloat, z3 ? 1 : 0);
                        }
                        b04.x(xd1Var, 0.0f, fFloatValue, j5, fIntBitsToFloat, z3 ? 1 : 0);
                        xy1Var4.a(xd1Var);
                        return og5.g;
                    }
                };
                h02Var.i0(objK4);
            } else {
                xy1Var4 = xy1Var3;
                j5 = jV;
                j6 = jV2;
            }
            ue5.v(j73VarT, (xy1) objK4, h02Var, 0);
            i6 = i13;
            f2 = f3;
            j4 = j6;
            j3 = j5;
            xy1Var2 = xy1Var4;
        } else {
            h02Var.Q();
            xy1Var2 = xy1Var;
            j3 = jV;
            j4 = jV2;
            i6 = i4;
            f2 = f;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: zz3
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(i2 | 1);
                    my1 my1Var3 = my1Var;
                    j73 j73Var2 = j73Var;
                    long j7 = j3;
                    long j8 = j4;
                    boolean z3 = i6;
                    float f4 = f2;
                    xy1 xy1Var5 = xy1Var2;
                    b04.r(my1Var3, j73Var2, j7, j8, z3 ? 1 : 0, f4, xy1Var5, (h02) obj2, iJ, i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void v(xd1 xd1Var, float f, float f2, long j, by4 by4Var) {
        float f3 = by4Var.g / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() >> 32)) - (2.0f * f3);
        xd1Var.C0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), by4Var);
    }

    public static final void x(xd1 xd1Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = xd1Var.getLayoutDirection() == fl2.j;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            xd1.S(xd1Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            xd1.S(xd1Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, 480);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x012e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code duplicated, block: B:93:0x019a  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void y(final my1 my1Var, j73 j73Var, long j, float f, long j2, int i, float f2, h02 h02Var, final int i2, final int i3) {
        j73 j73Var2;
        long jV;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        boolean z;
        final long j3;
        final j73 j73Var3;
        final long j4;
        final float f4;
        final int i9;
        final float f5;
        u34 u34VarP;
        j73 j73Var4;
        int i10;
        final float f6;
        final int i11;
        long jV2;
        boolean z2;
        Object objK;
        final my1 my1Var2;
        final by4 by4Var;
        boolean zX;
        Object objK2;
        boolean z3;
        boolean zV;
        Object objK3;
        final long j5;
        final long j6;
        final float f7;
        h02Var.Z(-1798883595);
        int i12 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i2 & 48) == 0) {
                j73Var2 = j73Var;
                i12 |= h02Var.x(j73Var2) ? 32 : 16;
            }
            jV = j;
            if ((i3 & 4) == 0 || !h02Var.v(jV)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i5 = i12 | i4;
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    f3 = f;
                    if (h02Var.r(f3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 1777664;
                if ((599187 & i8) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i8 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0 || h02Var.k()) {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i3 & 4) != 0) {
                            jV = tj0.v(a11.d, h02Var);
                            i8 &= -897;
                        }
                        if (i6 != 0) {
                            f3 = 4.0f;
                        }
                        i10 = i8 & (-57345);
                        f6 = 4.0f;
                        i11 = 1;
                        jV2 = tj0.v(a11.e, h02Var);
                    } else {
                        h02Var.Q();
                        if ((i3 & 4) != 0) {
                            i8 &= -897;
                        }
                        i10 = i8 & (-57345);
                        i11 = i;
                        f6 = f2;
                        j73Var4 = j73Var2;
                        jV2 = j2;
                    }
                    h02Var.s();
                    if ((i10 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objK = h02Var.K();
                    Object obj = oo0.g;
                    if (z2 || objK == obj) {
                        objK = new ss(my1Var, (byte) 8);
                        h02Var.i0(objK);
                    }
                    my1Var2 = (my1) objK;
                    by4Var = new by4(((j51) h02Var.a(hp0.j)).e(f3), 0.0f, i11, 0, 26);
                    zX = h02Var.x(my1Var2);
                    objK2 = h02Var.K();
                    if (zX || objK2 == obj) {
                        objK2 = new tz2(my1Var2, (byte) 4);
                        h02Var.i0(objK2);
                    }
                    j73 j73VarJ = mq4.j(dj4.g(j73Var4, true, (xy1) objK2), 40.0f);
                    boolean zX2 = h02Var.x(my1Var2);
                    if ((i10 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zV = z3 | zX2 | h02Var.v(jV2) | h02Var.j(by4Var) | ((((i10 & 896) ^ 384) <= 256 && h02Var.v(jV)) || (i10 & 384) == 256);
                    objK3 = h02Var.K();
                    if (!zV || objK3 == obj) {
                        j5 = jV2;
                        j6 = jV;
                        f7 = f3;
                        objK3 = new xy1() { // from class: vz3
                            @Override // defpackage.xy1
                            public final Object a(Object obj2) {
                                xd1 xd1Var = (xd1) obj2;
                                float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                                boolean z4 = i11;
                                float f8 = f6;
                                if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                                    f8 += f7;
                                }
                                float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                                float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                                float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                                long j7 = j5;
                                by4 by4Var2 = by4Var;
                                b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                                b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                                return og5.g;
                            }
                        };
                        h02Var.i0(objK3);
                    } else {
                        j5 = jV2;
                        j6 = jV;
                        f7 = f3;
                    }
                    ue5.v(j73VarJ, (xy1) objK3, h02Var, 0);
                    j73Var3 = j73Var4;
                    i9 = i11;
                    f5 = f6;
                    f4 = f7;
                    j3 = j5;
                    j4 = j6;
                } else {
                    h02Var.Q();
                    j3 = j2;
                    j73Var3 = j73Var2;
                    j4 = jV;
                    f4 = f3;
                    i9 = i;
                    f5 = f2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: wz3
                        @Override // defpackage.bz1
                        public final Object l(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iJ = aq2.J(i2 | 1);
                            my1 my1Var3 = my1Var;
                            j73 j73Var5 = j73Var3;
                            long j7 = j4;
                            float f8 = f4;
                            long j8 = j3;
                            boolean z4 = i9;
                            float f9 = f5;
                            b04.y(my1Var3, j73Var5, j7, f8, j8, z4 ? 1 : 0, f9, (h02) obj2, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i5 |= 3072;
            f3 = f;
            i8 = i5 | 1777664;
            if ((599187 & i8) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i8 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 4) != 0) {
                        jV = tj0.v(a11.d, h02Var);
                        i8 &= -897;
                    }
                    if (i6 != 0) {
                        f3 = 4.0f;
                    }
                    i10 = i8 & (-57345);
                    f6 = 4.0f;
                    i11 = 1;
                    jV2 = tj0.v(a11.e, h02Var);
                } else {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 4) != 0) {
                        jV = tj0.v(a11.d, h02Var);
                        i8 &= -897;
                    }
                    if (i6 != 0) {
                        f3 = 4.0f;
                    }
                    i10 = i8 & (-57345);
                    f6 = 4.0f;
                    i11 = 1;
                    jV2 = tj0.v(a11.e, h02Var);
                }
                h02Var.s();
                if ((i10 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK = h02Var.K();
                Object obj2 = oo0.g;
                if (z2) {
                    objK = new ss(my1Var, (byte) 8);
                    h02Var.i0(objK);
                } else {
                    objK = new ss(my1Var, (byte) 8);
                    h02Var.i0(objK);
                }
                my1Var2 = (my1) objK;
                by4Var = new by4(((j51) h02Var.a(hp0.j)).e(f3), 0.0f, i11, 0, 26);
                zX = h02Var.x(my1Var2);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new tz2(my1Var2, (byte) 4);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new tz2(my1Var2, (byte) 4);
                    h02Var.i0(objK2);
                }
                j73 j73VarJ2 = mq4.j(dj4.g(j73Var4, true, (xy1) objK2), 40.0f);
                boolean zX3 = h02Var.x(my1Var2);
                if ((i10 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zV = z3 | zX3 | h02Var.v(jV2) | h02Var.j(by4Var) | ((((i10 & 896) ^ 384) <= 256 && h02Var.v(jV)) || (i10 & 384) == 256);
                objK3 = h02Var.K();
                if (zV) {
                    j5 = jV2;
                    j6 = jV;
                    f7 = f3;
                    objK3 = new xy1() { // from class: vz3
                        @Override // defpackage.xy1
                        public final Object a(Object obj3) {
                            xd1 xd1Var = (xd1) obj3;
                            float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                            boolean z4 = i11;
                            float f8 = f6;
                            if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                                f8 += f7;
                            }
                            float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                            float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                            long j7 = j5;
                            by4 by4Var2 = by4Var;
                            b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                            b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                            return og5.g;
                        }
                    };
                    h02Var.i0(objK3);
                } else {
                    j5 = jV2;
                    j6 = jV;
                    f7 = f3;
                    objK3 = new xy1() { // from class: vz3
                        @Override // defpackage.xy1
                        public final Object a(Object obj3) {
                            xd1 xd1Var = (xd1) obj3;
                            float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                            boolean z4 = i11;
                            float f8 = f6;
                            if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                                f8 += f7;
                            }
                            float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                            float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                            long j7 = j5;
                            by4 by4Var2 = by4Var;
                            b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                            b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                            return og5.g;
                        }
                    };
                    h02Var.i0(objK3);
                }
                ue5.v(j73VarJ2, (xy1) objK3, h02Var, 0);
                j73Var3 = j73Var4;
                i9 = i11;
                f5 = f6;
                f4 = f7;
                j3 = j5;
                j4 = j6;
            } else {
                h02Var.Q();
                j3 = j2;
                j73Var3 = j73Var2;
                j4 = jV;
                f4 = f3;
                i9 = i;
                f5 = f2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: wz3
                    @Override // defpackage.bz1
                    public final Object l(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iJ = aq2.J(i2 | 1);
                        my1 my1Var3 = my1Var;
                        j73 j73Var5 = j73Var3;
                        long j7 = j4;
                        float f8 = f4;
                        long j8 = j3;
                        boolean z4 = i9;
                        float f9 = f5;
                        b04.y(my1Var3, j73Var5, j7, f8, j8, z4 ? 1 : 0, f9, (h02) obj3, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i12 |= 48;
        j73Var2 = j73Var;
        jV = j;
        if ((i3 & 4) == 0) {
            i4 = 128;
        } else {
            i4 = 128;
        }
        i5 = i12 | i4;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                f3 = f;
                if (h02Var.r(f3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i5 | 1777664;
            if ((599187 & i8) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i8 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 4) != 0) {
                        jV = tj0.v(a11.d, h02Var);
                        i8 &= -897;
                    }
                    if (i6 != 0) {
                        f3 = 4.0f;
                    }
                    i10 = i8 & (-57345);
                    f6 = 4.0f;
                    i11 = 1;
                    jV2 = tj0.v(a11.e, h02Var);
                } else {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 4) != 0) {
                        jV = tj0.v(a11.d, h02Var);
                        i8 &= -897;
                    }
                    if (i6 != 0) {
                        f3 = 4.0f;
                    }
                    i10 = i8 & (-57345);
                    f6 = 4.0f;
                    i11 = 1;
                    jV2 = tj0.v(a11.e, h02Var);
                }
                h02Var.s();
                if ((i10 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK = h02Var.K();
                Object obj3 = oo0.g;
                if (z2) {
                    objK = new ss(my1Var, (byte) 8);
                    h02Var.i0(objK);
                } else {
                    objK = new ss(my1Var, (byte) 8);
                    h02Var.i0(objK);
                }
                my1Var2 = (my1) objK;
                by4Var = new by4(((j51) h02Var.a(hp0.j)).e(f3), 0.0f, i11, 0, 26);
                zX = h02Var.x(my1Var2);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new tz2(my1Var2, (byte) 4);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new tz2(my1Var2, (byte) 4);
                    h02Var.i0(objK2);
                }
                j73 j73VarJ3 = mq4.j(dj4.g(j73Var4, true, (xy1) objK2), 40.0f);
                boolean zX4 = h02Var.x(my1Var2);
                if ((i10 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zV = z3 | zX4 | h02Var.v(jV2) | h02Var.j(by4Var) | ((((i10 & 896) ^ 384) <= 256 && h02Var.v(jV)) || (i10 & 384) == 256);
                objK3 = h02Var.K();
                if (zV) {
                    j5 = jV2;
                    j6 = jV;
                    f7 = f3;
                    objK3 = new xy1() { // from class: vz3
                        @Override // defpackage.xy1
                        public final Object a(Object obj4) {
                            xd1 xd1Var = (xd1) obj4;
                            float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                            boolean z4 = i11;
                            float f8 = f6;
                            if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                                f8 += f7;
                            }
                            float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                            float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                            long j7 = j5;
                            by4 by4Var2 = by4Var;
                            b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                            b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                            return og5.g;
                        }
                    };
                    h02Var.i0(objK3);
                } else {
                    j5 = jV2;
                    j6 = jV;
                    f7 = f3;
                    objK3 = new xy1() { // from class: vz3
                        @Override // defpackage.xy1
                        public final Object a(Object obj4) {
                            xd1 xd1Var = (xd1) obj4;
                            float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                            boolean z4 = i11;
                            float f8 = f6;
                            if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                                f8 += f7;
                            }
                            float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                            float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                            long j7 = j5;
                            by4 by4Var2 = by4Var;
                            b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                            b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                            return og5.g;
                        }
                    };
                    h02Var.i0(objK3);
                }
                ue5.v(j73VarJ3, (xy1) objK3, h02Var, 0);
                j73Var3 = j73Var4;
                i9 = i11;
                f5 = f6;
                f4 = f7;
                j3 = j5;
                j4 = j6;
            } else {
                h02Var.Q();
                j3 = j2;
                j73Var3 = j73Var2;
                j4 = jV;
                f4 = f3;
                i9 = i;
                f5 = f2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: wz3
                    @Override // defpackage.bz1
                    public final Object l(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        int iJ = aq2.J(i2 | 1);
                        my1 my1Var3 = my1Var;
                        j73 j73Var5 = j73Var3;
                        long j7 = j4;
                        float f8 = f4;
                        long j8 = j3;
                        boolean z4 = i9;
                        float f9 = f5;
                        b04.y(my1Var3, j73Var5, j7, f8, j8, z4 ? 1 : 0, f9, (h02) obj4, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i5 |= 3072;
        f3 = f;
        i8 = i5 | 1777664;
        if ((599187 & i8) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i8 & 1, z)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 4) != 0) {
                    jV = tj0.v(a11.d, h02Var);
                    i8 &= -897;
                }
                if (i6 != 0) {
                    f3 = 4.0f;
                }
                i10 = i8 & (-57345);
                f6 = 4.0f;
                i11 = 1;
                jV2 = tj0.v(a11.e, h02Var);
            } else {
                if (i13 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 4) != 0) {
                    jV = tj0.v(a11.d, h02Var);
                    i8 &= -897;
                }
                if (i6 != 0) {
                    f3 = 4.0f;
                }
                i10 = i8 & (-57345);
                f6 = 4.0f;
                i11 = 1;
                jV2 = tj0.v(a11.e, h02Var);
            }
            h02Var.s();
            if ((i10 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objK = h02Var.K();
            Object obj4 = oo0.g;
            if (z2) {
                objK = new ss(my1Var, (byte) 8);
                h02Var.i0(objK);
            } else {
                objK = new ss(my1Var, (byte) 8);
                h02Var.i0(objK);
            }
            my1Var2 = (my1) objK;
            by4Var = new by4(((j51) h02Var.a(hp0.j)).e(f3), 0.0f, i11, 0, 26);
            zX = h02Var.x(my1Var2);
            objK2 = h02Var.K();
            if (zX) {
                objK2 = new tz2(my1Var2, (byte) 4);
                h02Var.i0(objK2);
            } else {
                objK2 = new tz2(my1Var2, (byte) 4);
                h02Var.i0(objK2);
            }
            j73 j73VarJ4 = mq4.j(dj4.g(j73Var4, true, (xy1) objK2), 40.0f);
            boolean zX5 = h02Var.x(my1Var2);
            if ((i10 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            zV = z3 | zX5 | h02Var.v(jV2) | h02Var.j(by4Var) | ((((i10 & 896) ^ 384) <= 256 && h02Var.v(jV)) || (i10 & 384) == 256);
            objK3 = h02Var.K();
            if (zV) {
                j5 = jV2;
                j6 = jV;
                f7 = f3;
                objK3 = new xy1() { // from class: vz3
                    @Override // defpackage.xy1
                    public final Object a(Object obj5) {
                        xd1 xd1Var = (xd1) obj5;
                        float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                        boolean z4 = i11;
                        float f8 = f6;
                        if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                            f8 += f7;
                        }
                        float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                        long j7 = j5;
                        by4 by4Var2 = by4Var;
                        b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                        b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                        return og5.g;
                    }
                };
                h02Var.i0(objK3);
            } else {
                j5 = jV2;
                j6 = jV;
                f7 = f3;
                objK3 = new xy1() { // from class: vz3
                    @Override // defpackage.xy1
                    public final Object a(Object obj5) {
                        xd1 xd1Var = (xd1) obj5;
                        float fFloatValue = ((Number) my1Var2.g()).floatValue() * 360.0f;
                        boolean z4 = i11;
                        float f8 = f6;
                        if (z4 && Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) <= Float.intBitsToFloat((int) (xd1Var.n() >> 32))) {
                            f8 += f7;
                        }
                        float fB0 = (f8 / ((float) (((double) xd1Var.B0(Float.intBitsToFloat((int) (xd1Var.n() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fB0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fB0) * 2.0f);
                        long j7 = j5;
                        by4 by4Var2 = by4Var;
                        b04.v(xd1Var, fMin, fMin2, j7, by4Var2);
                        b04.v(xd1Var, 270.0f, fFloatValue, j6, by4Var2);
                        return og5.g;
                    }
                };
                h02Var.i0(objK3);
            }
            ue5.v(j73VarJ4, (xy1) objK3, h02Var, 0);
            j73Var3 = j73Var4;
            i9 = i11;
            f5 = f6;
            f4 = f7;
            j3 = j5;
            j4 = j6;
        } else {
            h02Var.Q();
            j3 = j2;
            j73Var3 = j73Var2;
            j4 = jV;
            f4 = f3;
            i9 = i;
            f5 = f2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: wz3
                @Override // defpackage.bz1
                public final Object l(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iJ = aq2.J(i2 | 1);
                    my1 my1Var3 = my1Var;
                    j73 j73Var5 = j73Var3;
                    long j7 = j4;
                    float f8 = f4;
                    long j8 = j3;
                    boolean z4 = i9;
                    float f9 = f5;
                    b04.y(my1Var3, j73Var5, j7, f8, j8, z4 ? 1 : 0, f9, (h02) obj5, iJ, i3);
                    return og5.g;
                }
            };
        }
    }
}
