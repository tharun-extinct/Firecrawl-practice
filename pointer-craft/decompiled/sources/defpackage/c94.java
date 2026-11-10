package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c94 extends uj0 {
    public static final uo1 p = new uo1(26);
    public final float[] a;
    public final y84 b;
    public final sb1 c;
    public final b94 i;
    public final float[] j;
    public final ub5 l;
    public final sb1 m;
    public final fn5 n;
    public final b94 q;
    public final boolean s;
    public final float[] t;
    public final float v;
    public final y84 w;
    public final float x;

    /* JADX WARN: Code duplicated, block: B:41:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0230  */
    /* JADX WARN: Code duplicated, block: B:65:0x0248  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public c94(String str, float[] fArr, fn5 fn5Var, float[] fArr2, sb1 sb1Var, sb1 sb1Var2, float f, float f2, ub5 ub5Var, int i) {
        char c;
        float f3;
        float[] fArr3;
        float f4;
        float[] fArr4;
        c94 c94Var;
        double d;
        boolean z;
        int i2;
        super(str, 12884901888L, i);
        this.n = fn5Var;
        this.v = f;
        this.x = f2;
        this.l = ub5Var;
        this.m = sb1Var;
        byte b = 1;
        this.q = new b94(this, b);
        byte b2 = 0;
        this.w = new y84(this, b2);
        this.c = sb1Var2;
        this.i = new b94(this, b2);
        this.b = new y84(this, b);
        if (fArr.length != 6 && fArr.length != 9) {
            l0.u("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr5 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr5[0] = f5 / f7;
            fArr5[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr5[2] = f8 / f10;
            fArr5[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr5[4] = f11 / f13;
            fArr5[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 6);
        }
        this.j = fArr5;
        if (fArr2 == null) {
            float f14 = fArr5[0];
            float f15 = fArr5[1];
            float f16 = fArr5[2];
            float f17 = fArr5[3];
            float f18 = fArr5[4];
            float f19 = fArr5[5];
            f3 = 1.0f;
            float f20 = fn5Var.g;
            c = 1;
            float f21 = fn5Var.y;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.t = fArr3;
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                l0.u(xi3.j("Transform must have 9 entries! Has ", fArr2.length));
                throw null;
            }
            this.t = fArr2;
            fArr3 = fArr2;
        }
        this.a = v70.e(fArr3);
        float fN = xs2.n(fArr5);
        float[] fArr6 = wj0.g;
        if (fN / xs2.n(wj0.y) > 0.9f) {
            float[] fArr7 = wj0.g;
            float f38 = fArr5[0];
            float f39 = fArr7[0];
            float f40 = fArr5[c];
            float f41 = fArr7[c];
            float f42 = fArr5[2];
            float f43 = fArr7[2];
            float f44 = fArr5[3];
            float f45 = fArr7[3];
            float f46 = fArr5[4];
            float f47 = fArr7[4];
            float f48 = fArr5[5];
            float f49 = fArr7[5];
            f4 = 0.0f;
            float[] fArr8 = new float[6];
            fArr8[0] = f38 - f39;
            fArr8[c] = f40 - f41;
            fArr8[2] = f42 - f43;
            fArr8[3] = f44 - f45;
            fArr8[4] = f46 - f47;
            fArr8[5] = f48 - f49;
            float f50 = fArr8[0];
            float f51 = fArr8[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr8[2];
                float f53 = fArr8[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr8[4];
                    float f55 = fArr8[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr4 = wj0.g;
                if (fArr5 == fArr4) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr5[i2], fArr4[i2]) != 0 || Math.abs(fArr5[i2] - fArr4[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (v70.w(fn5Var, c93.u)) {
                            float[] fArr9 = wj0.g;
                            c94Var = wj0.v;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(sb1Var.n(d) - c94Var.m.n(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (v70.w(fn5Var, c93.u) && f == f4 && f2 == f3) {
                    float[] fArr10 = wj0.g;
                    c94Var = wj0.v;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(sb1Var.n(d) - c94Var.m.n(d)) > 0.001d && Math.abs(sb1Var2.n(d) - c94Var.c.n(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.s = z;
        }
        f4 = 0.0f;
        int i3 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr4 = wj0.g;
            if (fArr5 == fArr4) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr5[i2], fArr4[i2]) != 0) {
                        }
                        i2++;
                    } else if (v70.w(fn5Var, c93.u)) {
                        float[] fArr11 = wj0.g;
                        c94Var = wj0.v;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(sb1Var.n(d) - c94Var.m.n(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (v70.w(fn5Var, c93.u)) {
                float[] fArr12 = wj0.g;
                c94Var = wj0.v;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(sb1Var.n(d) - c94Var.m.n(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.s = z;
    }

    @Override // defpackage.uj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c94.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        c94 c94Var = (c94) obj;
        if (Float.compare(c94Var.v, this.v) != 0 || Float.compare(c94Var.x, this.x) != 0 || !yf2.p(this.n, c94Var.n) || !Arrays.equals(this.j, c94Var.j)) {
            return false;
        }
        ub5 ub5Var = c94Var.l;
        ub5 ub5Var2 = this.l;
        if (ub5Var2 != null) {
            return yf2.p(ub5Var2, ub5Var);
        }
        if (ub5Var == null) {
            return true;
        }
        if (yf2.p(this.m, c94Var.m)) {
            return yf2.p(this.c, c94Var.c);
        }
        return false;
    }

    @Override // defpackage.uj0
    public final float g(int i) {
        return this.x;
    }

    @Override // defpackage.uj0
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.j) + ((this.n.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.v;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.x;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        ub5 ub5Var = this.l;
        int iHashCode2 = iFloatToIntBits2 + (ub5Var != null ? ub5Var.hashCode() : 0);
        if (ub5Var != null) {
            return iHashCode2;
        }
        return this.c.hashCode() + ((this.m.hashCode() + (iHashCode2 * 31)) * 31);
    }

    @Override // defpackage.uj0
    public final long n(float f, float f2, float f3) {
        double d = f;
        y84 y84Var = this.b;
        float fN = (float) y84Var.n(d);
        float fN2 = (float) y84Var.n(f2);
        float fN3 = (float) y84Var.n(f3);
        float[] fArr = this.t;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fN3) + ((fArr[3] * fN2) + (fArr[0] * fN)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fN3) + (fArr[4] * fN2) + (fArr[1] * fN))));
    }

    @Override // defpackage.uj0
    public final boolean r() {
        return this.s;
    }

    @Override // defpackage.uj0
    public final float v(float f, float f2, float f3) {
        double d = f;
        y84 y84Var = this.b;
        float fN = (float) y84Var.n(d);
        float fN2 = (float) y84Var.n(f2);
        float fN3 = (float) y84Var.n(f3);
        float[] fArr = this.t;
        return (fArr[8] * fN3) + (fArr[5] * fN2) + (fArr[2] * fN);
    }

    @Override // defpackage.uj0
    public final long x(float f, float f2, float f3, float f4, uj0 uj0Var) {
        float[] fArr = this.a;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        y84 y84Var = this.w;
        return ra.r((float) y84Var.n(f5), (float) y84Var.n(f6), (float) y84Var.n(f7), f4, uj0Var);
    }

    @Override // defpackage.uj0
    public final float y(int i) {
        return this.v;
    }

    public c94(String str, float[] fArr, fn5 fn5Var, final ub5 ub5Var, int i) {
        double d;
        sb1 sb1Var;
        sb1 sb1Var2;
        double d2 = ub5Var.g;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = d2 == -3.0d;
        double d3 = ub5Var.l;
        double d4 = ub5Var.x;
        if (z) {
            d = -3.0d;
            final byte b3 = 4;
            sb1Var = new sb1() { // from class: a94
                @Override // defpackage.sb1
                public final double n(double d5) {
                    byte b4 = b3;
                    ub5 ub5Var2 = ub5Var;
                    switch (b4) {
                        case 0:
                            float[] fArr2 = wj0.g;
                            return wj0.g(ub5Var2, d5);
                        case 1:
                            float[] fArr3 = wj0.g;
                            return wj0.r(ub5Var2, d5);
                        case 2:
                            double d6 = ub5Var2.y;
                            return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                        case 3:
                            double d7 = ub5Var2.y;
                            double d8 = ub5Var2.r;
                            double d9 = ub5Var2.n;
                            return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                        case 4:
                            float[] fArr4 = wj0.g;
                            return wj0.y(ub5Var2, d5);
                        case 5:
                            float[] fArr5 = wj0.g;
                            return wj0.n(ub5Var2, d5);
                        case 6:
                            double d10 = ub5Var2.y;
                            double d11 = ub5Var2.r;
                            double d12 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = ub5Var2.y;
                            double d14 = ub5Var2.r;
                            double d15 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final byte b4 = 5;
                sb1Var = new sb1() { // from class: a94
                    @Override // defpackage.sb1
                    public final double n(double d5) {
                        byte b5 = b4;
                        ub5 ub5Var2 = ub5Var;
                        switch (b5) {
                            case 0:
                                float[] fArr2 = wj0.g;
                                return wj0.g(ub5Var2, d5);
                            case 1:
                                float[] fArr3 = wj0.g;
                                return wj0.r(ub5Var2, d5);
                            case 2:
                                double d6 = ub5Var2.y;
                                return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                            case 3:
                                double d7 = ub5Var2.y;
                                double d8 = ub5Var2.r;
                                double d9 = ub5Var2.n;
                                return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                            case 4:
                                float[] fArr4 = wj0.g;
                                return wj0.y(ub5Var2, d5);
                            case 5:
                                float[] fArr5 = wj0.g;
                                return wj0.n(ub5Var2, d5);
                            case 6:
                                double d10 = ub5Var2.y;
                                double d11 = ub5Var2.r;
                                double d12 = ub5Var2.n;
                                return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = ub5Var2.y;
                                double d14 = ub5Var2.r;
                                double d15 = ub5Var2.n;
                                return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final byte b5 = 6;
                sb1Var = new sb1() { // from class: a94
                    @Override // defpackage.sb1
                    public final double n(double d5) {
                        byte b6 = b5;
                        ub5 ub5Var2 = ub5Var;
                        switch (b6) {
                            case 0:
                                float[] fArr2 = wj0.g;
                                return wj0.g(ub5Var2, d5);
                            case 1:
                                float[] fArr3 = wj0.g;
                                return wj0.r(ub5Var2, d5);
                            case 2:
                                double d6 = ub5Var2.y;
                                return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                            case 3:
                                double d7 = ub5Var2.y;
                                double d8 = ub5Var2.r;
                                double d9 = ub5Var2.n;
                                return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                            case 4:
                                float[] fArr4 = wj0.g;
                                return wj0.y(ub5Var2, d5);
                            case 5:
                                float[] fArr5 = wj0.g;
                                return wj0.n(ub5Var2, d5);
                            case 6:
                                double d10 = ub5Var2.y;
                                double d11 = ub5Var2.r;
                                double d12 = ub5Var2.n;
                                return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = ub5Var2.y;
                                double d14 = ub5Var2.r;
                                double d15 = ub5Var2.n;
                                return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                        }
                    }
                };
            } else {
                final byte b6 = 7;
                sb1Var = new sb1() { // from class: a94
                    @Override // defpackage.sb1
                    public final double n(double d5) {
                        byte b7 = b6;
                        ub5 ub5Var2 = ub5Var;
                        switch (b7) {
                            case 0:
                                float[] fArr2 = wj0.g;
                                return wj0.g(ub5Var2, d5);
                            case 1:
                                float[] fArr3 = wj0.g;
                                return wj0.r(ub5Var2, d5);
                            case 2:
                                double d6 = ub5Var2.y;
                                return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                            case 3:
                                double d7 = ub5Var2.y;
                                double d8 = ub5Var2.r;
                                double d9 = ub5Var2.n;
                                return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                            case 4:
                                float[] fArr4 = wj0.g;
                                return wj0.y(ub5Var2, d5);
                            case 5:
                                float[] fArr5 = wj0.g;
                                return wj0.n(ub5Var2, d5);
                            case 6:
                                double d10 = ub5Var2.y;
                                double d11 = ub5Var2.r;
                                double d12 = ub5Var2.n;
                                return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = ub5Var2.y;
                                double d14 = ub5Var2.r;
                                double d15 = ub5Var2.n;
                                return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            sb1Var2 = new sb1() { // from class: a94
                @Override // defpackage.sb1
                public final double n(double d5) {
                    byte b7 = b;
                    ub5 ub5Var2 = ub5Var;
                    switch (b7) {
                        case 0:
                            float[] fArr2 = wj0.g;
                            return wj0.g(ub5Var2, d5);
                        case 1:
                            float[] fArr3 = wj0.g;
                            return wj0.r(ub5Var2, d5);
                        case 2:
                            double d6 = ub5Var2.y;
                            return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                        case 3:
                            double d7 = ub5Var2.y;
                            double d8 = ub5Var2.r;
                            double d9 = ub5Var2.n;
                            return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                        case 4:
                            float[] fArr4 = wj0.g;
                            return wj0.y(ub5Var2, d5);
                        case 5:
                            float[] fArr5 = wj0.g;
                            return wj0.n(ub5Var2, d5);
                        case 6:
                            double d10 = ub5Var2.y;
                            double d11 = ub5Var2.r;
                            double d12 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = ub5Var2.y;
                            double d14 = ub5Var2.r;
                            double d15 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            sb1Var2 = new sb1() { // from class: a94
                @Override // defpackage.sb1
                public final double n(double d5) {
                    byte b7 = b2;
                    ub5 ub5Var2 = ub5Var;
                    switch (b7) {
                        case 0:
                            float[] fArr2 = wj0.g;
                            return wj0.g(ub5Var2, d5);
                        case 1:
                            float[] fArr3 = wj0.g;
                            return wj0.r(ub5Var2, d5);
                        case 2:
                            double d6 = ub5Var2.y;
                            return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                        case 3:
                            double d7 = ub5Var2.y;
                            double d8 = ub5Var2.r;
                            double d9 = ub5Var2.n;
                            return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                        case 4:
                            float[] fArr4 = wj0.g;
                            return wj0.y(ub5Var2, d5);
                        case 5:
                            float[] fArr5 = wj0.g;
                            return wj0.n(ub5Var2, d5);
                        case 6:
                            double d10 = ub5Var2.y;
                            double d11 = ub5Var2.r;
                            double d12 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = ub5Var2.y;
                            double d14 = ub5Var2.r;
                            double d15 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final byte b7 = 2;
            sb1Var2 = new sb1() { // from class: a94
                @Override // defpackage.sb1
                public final double n(double d5) {
                    byte b8 = b7;
                    ub5 ub5Var2 = ub5Var;
                    switch (b8) {
                        case 0:
                            float[] fArr2 = wj0.g;
                            return wj0.g(ub5Var2, d5);
                        case 1:
                            float[] fArr3 = wj0.g;
                            return wj0.r(ub5Var2, d5);
                        case 2:
                            double d6 = ub5Var2.y;
                            return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                        case 3:
                            double d7 = ub5Var2.y;
                            double d8 = ub5Var2.r;
                            double d9 = ub5Var2.n;
                            return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                        case 4:
                            float[] fArr4 = wj0.g;
                            return wj0.y(ub5Var2, d5);
                        case 5:
                            float[] fArr5 = wj0.g;
                            return wj0.n(ub5Var2, d5);
                        case 6:
                            double d10 = ub5Var2.y;
                            double d11 = ub5Var2.r;
                            double d12 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = ub5Var2.y;
                            double d14 = ub5Var2.r;
                            double d15 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                    }
                }
            };
        } else {
            final byte b8 = 3;
            sb1Var2 = new sb1() { // from class: a94
                @Override // defpackage.sb1
                public final double n(double d5) {
                    byte b9 = b8;
                    ub5 ub5Var2 = ub5Var;
                    switch (b9) {
                        case 0:
                            float[] fArr2 = wj0.g;
                            return wj0.g(ub5Var2, d5);
                        case 1:
                            float[] fArr3 = wj0.g;
                            return wj0.r(ub5Var2, d5);
                        case 2:
                            double d6 = ub5Var2.y;
                            return d5 >= ub5Var2.v ? Math.pow((d6 * d5) + ub5Var2.r, ub5Var2.g) : ub5Var2.n * d5;
                        case 3:
                            double d7 = ub5Var2.y;
                            double d8 = ub5Var2.r;
                            double d9 = ub5Var2.n;
                            return d5 >= ub5Var2.v ? Math.pow((d7 * d5) + d8, ub5Var2.g) + ub5Var2.x : (d9 * d5) + ub5Var2.l;
                        case 4:
                            float[] fArr4 = wj0.g;
                            return wj0.y(ub5Var2, d5);
                        case 5:
                            float[] fArr5 = wj0.g;
                            return wj0.n(ub5Var2, d5);
                        case 6:
                            double d10 = ub5Var2.y;
                            double d11 = ub5Var2.r;
                            double d12 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d12 ? (Math.pow(d5, 1.0d / ub5Var2.g) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = ub5Var2.y;
                            double d14 = ub5Var2.r;
                            double d15 = ub5Var2.n;
                            return d5 >= ub5Var2.v * d15 ? (Math.pow(d5 - ub5Var2.x, 1.0d / ub5Var2.g) - d14) / d13 : (d5 - ub5Var2.l) / d15;
                    }
                }
            };
        }
        this(str, fArr, fn5Var, null, sb1Var, sb1Var2, 0.0f, 1.0f, ub5Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c94(String str, float[] fArr, fn5 fn5Var, final double d, float f, float f2, int i) {
        sb1 sb1Var;
        sb1 sb1Var2 = p;
        if (d == 1.0d) {
            sb1Var = sb1Var2;
        } else {
            final byte b = 0;
            sb1Var = new sb1() { // from class: z84
                @Override // defpackage.sb1
                public final double n(double d2) {
                    switch (b) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final byte b2 = 1;
            sb1Var2 = new sb1() { // from class: z84
                @Override // defpackage.sb1
                public final double n(double d2) {
                    switch (b2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        sb1 sb1Var3 = sb1Var2;
        this(str, fArr, fn5Var, null, sb1Var, sb1Var3, f, f2, new ub5(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
