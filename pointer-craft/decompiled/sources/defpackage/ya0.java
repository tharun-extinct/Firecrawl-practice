package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 {
    public final float g;
    public final float n;
    public final float r;
    public final float v;
    public final float x;
    public final float y;

    public ya0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = f5;
        this.x = f6;
    }

    public static ya0 g(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        y(i, rm5.m, fArr, fArr2);
        return new ya0(fArr2[0], fArr2[1], fArr[0], fArr[4], fArr[5], fArr[6]);
    }

    public static int n(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        rm5 rm5Var = rm5.m;
        float f9 = f2;
        if (f9 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return y94.E(f3);
        }
        float f10 = 0.0f;
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f11 = 0.0f;
        boolean z = true;
        ya0 ya0Var = null;
        float f12 = f9;
        while (Math.abs(f11 - f9) >= 0.4f) {
            float f13 = 100.0f;
            float f14 = 1000.0f;
            float f15 = f10;
            float f16 = 1000.0f;
            ya0 ya0Var2 = null;
            while (true) {
                if (Math.abs(f15 - f13) <= 0.01f) {
                    f4 = fMin;
                    f5 = f9;
                    f10 = f10;
                    f6 = f12;
                    f7 = 2.0f;
                    break;
                }
                float f17 = ((f13 - f15) / 2.0f) + f15;
                f10 = f10;
                int iV = r(f17, f12, fMin).v(rm5.m);
                float fI = y94.I(iV);
                float fAbs = Math.abs(f3 - fI);
                if (fAbs < 0.2f) {
                    ya0 ya0VarG = g(iV);
                    f7 = 2.0f;
                    f5 = f9;
                    ya0 ya0VarR = r(ya0VarG.r, ya0VarG.y, fMin);
                    f4 = fMin;
                    float f18 = ya0VarG.n - ya0VarR.n;
                    float f19 = ya0VarG.v - ya0VarR.v;
                    float f20 = ya0VarG.x - ya0VarR.x;
                    double dSqrt = Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18));
                    f8 = fI;
                    f6 = f12;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f16 = fPow;
                        ya0Var2 = ya0VarG;
                        f14 = fAbs;
                    }
                } else {
                    f4 = fMin;
                    f5 = f9;
                    f8 = fI;
                    f6 = f12;
                    f7 = 2.0f;
                }
                if (f14 == f10 && f16 == f10) {
                    break;
                }
                if (f8 < f3) {
                    f15 = f17;
                } else {
                    f13 = f17;
                }
                f12 = f6;
                f10 = f10;
                f9 = f5;
                fMin = f4;
            }
            if (!z) {
                if (ya0Var2 == null) {
                    f9 = f6;
                } else {
                    f11 = f6;
                    ya0Var = ya0Var2;
                    f9 = f5;
                }
                f12 = ((f9 - f11) / f7) + f11;
            } else {
                if (ya0Var2 != null) {
                    return ya0Var2.v(rm5Var);
                }
                f12 = ((f5 - f11) / f7) + f11;
                z = false;
                f9 = f5;
            }
            fMin = f4;
        }
        return ya0Var == null ? y94.E(f3) : ya0Var.v(rm5Var);
    }

    public static ya0 r(float f, float f2, float f3) {
        rm5 rm5Var = rm5.m;
        float f4 = rm5Var.n;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = rm5Var.g + 4.0f;
        float f6 = rm5Var.t * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * rm5Var.n) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new ya0(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static void y(int i, rm5 rm5Var, float[] fArr, float[] fArr2) {
        float fJ = y94.J(Color.red(i));
        float fJ2 = y94.J(Color.green(i));
        float fJ3 = y94.J(Color.blue(i));
        float[][] fArr3 = y94.n;
        float[] fArr4 = fArr3[0];
        float f = (fArr4[2] * fJ3) + (fArr4[1] * fJ2) + (fArr4[0] * fJ);
        fArr2[0] = f;
        float[] fArr5 = fArr3[1];
        float f2 = (fArr5[2] * fJ3) + (fArr5[1] * fJ2) + (fArr5[0] * fJ);
        fArr2[1] = f2;
        float[] fArr6 = fArr3[2];
        float f3 = (fJ3 * fArr6[2]) + (fJ2 * fArr6[1]) + (fJ * fArr6[0]);
        fArr2[2] = f3;
        float[][] fArr7 = y94.g;
        float[] fArr8 = fArr7[0];
        float f4 = (fArr8[2] * f3) + (fArr8[1] * f2) + (fArr8[0] * f);
        float[] fArr9 = fArr7[1];
        float f5 = (fArr9[2] * f3) + (fArr9[1] * f2) + (fArr9[0] * f);
        float[] fArr10 = fArr7[2];
        float f6 = (f3 * fArr10[2]) + (f2 * fArr10[1]) + (f * fArr10[0]);
        float[] fArr11 = rm5Var.l;
        float f7 = rm5Var.t;
        float f8 = rm5Var.n;
        float f9 = rm5Var.g;
        float f10 = fArr11[0] * f4;
        float f11 = fArr11[1] * f5;
        float f12 = fArr11[2] * f6;
        float f13 = rm5Var.j;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * rm5Var.y) / f9, rm5Var.a * f8)) * 100.0f;
        float f20 = f9 + 4.0f;
        float fSqrt = (4.0f / f8) * ((float) Math.sqrt(fPow4 / 100.0f)) * f20 * f7;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rm5Var.x), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rm5Var.v) * rm5Var.r) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float fSqrt2 = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float f21 = fSqrt2 * f7;
        float fSqrt3 = ((float) Math.sqrt((fPow5 * f8) / f20)) * 50.0f;
        float f22 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * f21) + 1.0f)) * 43.85965f;
        double d2 = f19;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt2;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fSqrt;
            fArr[2] = f21;
            fArr[3] = fSqrt3;
            fArr[4] = f22;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int v(rm5 rm5Var) {
        float fSqrt;
        float f = this.y;
        double d = f;
        float f2 = this.r;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f3 = rm5Var.x;
        float f4 = rm5Var.j;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.g * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = rm5Var.g * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) rm5Var.n)) / ((double) rm5Var.a)));
        float f5 = fCos * 3846.1538f * rm5Var.v * rm5Var.r;
        float f6 = fPow2 / rm5Var.y;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = rm5Var.l;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = y94.y;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return zj0.g(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
