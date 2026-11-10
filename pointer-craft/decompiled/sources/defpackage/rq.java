package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rq {
    public final float[] a;
    public final boolean b;
    public final float c;
    public final float g;
    public final float i;
    public float j;
    public final float l;
    public final float m;
    public final float n;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public float t;
    public final float v;
    public final float w;
    public final float x;
    public final float y;

    public rq(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float[] fArr;
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = f5;
        this.x = f6;
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f8 > 0.0f : !(i != 5 || f8 >= 0.0f));
        float f9 = z2 ? -1.0f : 1.0f;
        this.w = f9;
        float f10 = 1.0f / (f2 - f);
        this.m = f10;
        float[] fArr2 = new float[101];
        this.a = fArr2;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
            float fHypot = (float) Math.hypot(f8, f7);
            this.l = fHypot;
            this.q = fHypot * f10;
            this.s = f7 * f10;
            this.p = f8 * f10;
            this.c = Float.NaN;
            this.i = Float.NaN;
            z = true;
        } else {
            this.c = f7 * f9;
            this.i = f8 * (-f9);
            this.s = z2 ? f5 : f3;
            this.p = z2 ? f4 : f6;
            float f11 = f5 - f3;
            float f12 = f4 - f6;
            float f13 = f12;
            float fHypot2 = 0.0f;
            float f14 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((((double) i4) * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float fSin = ((float) Math.sin(d)) * f11;
                float fCos = ((float) Math.cos(d)) * f12;
                fHypot2 += (float) Math.hypot(fSin - f14, fCos - f13);
                fArr = dt5.y;
                fArr[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f14 = fSin;
                f13 = fCos;
                i3 = i2;
            }
            this.l = fHypot2;
            int i5 = i2;
            while (true) {
                fArr[i5] = fArr[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f15 = i6 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f15);
                if (iBinarySearch >= 0) {
                    fArr2[i6] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr2[i6] = 0.0f;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    float f16 = i8;
                    float f17 = fArr[i8];
                    fArr2[i6] = (((f15 - f17) / (fArr[i7 - i2] - f17)) + f16) / 90.0f;
                }
            }
            this.q = this.l * this.m;
            z = z3;
        }
        this.b = z;
    }

    public final float g() {
        float f = this.c * this.t;
        return f * this.w * (this.q / ((float) Math.hypot(f, (-this.i) * this.j)));
    }

    public final void r(float f) {
        float f2 = (this.w == -1.0f ? this.y - f : f - this.g) * this.m;
        float fY = 0.0f;
        if (f2 > 0.0f) {
            fY = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.a;
                float f4 = fArr[i];
                fY = du4.y(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fY * 1.5707964f;
        this.j = (float) Math.sin(d);
        this.t = (float) Math.cos(d);
    }

    public final float y() {
        float f = this.c * this.t;
        float f2 = (-this.i) * this.j;
        return f2 * this.w * (this.q / ((float) Math.hypot(f, f2)));
    }
}
