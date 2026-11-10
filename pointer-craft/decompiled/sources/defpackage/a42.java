package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class a42 implements on3 {
    public boolean A;
    public final ba a;
    public float[] b;
    public boolean c;
    public boolean d;
    public br2 f;
    public int h;
    public x32 j;
    public boolean k;
    public bz1 m;
    public my1 q;
    public boolean s;
    public final w32 t;
    public long w = 9223372034707292159L;
    public final float[] i = l33.g();
    public j51 p = y94.j();
    public fl2 u = fl2.j;
    public final pb0 z = new pb0();
    public long o = vb5.y;
    public boolean e = true;
    public final z6 B = new z6(this, 17);

    public a42(x32 x32Var, w32 w32Var, ba baVar, bz1 bz1Var, my1 my1Var) {
        this.j = x32Var;
        this.t = w32Var;
        this.a = baVar;
        this.m = bz1Var;
        this.q = my1Var;
    }

    public final float[] g() {
        float[] fArrG = this.b;
        if (fArrG == null) {
            fArrG = l33.g();
            this.b = fArrG;
        }
        if (this.d) {
            this.d = false;
            float[] fArrY = y();
            if (this.e) {
                return fArrY;
            }
            if (!ra.D(fArrY, fArrG)) {
                fArrG[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrG[0])) {
            return null;
        }
        return fArrG;
    }

    public final void l() {
        ba.u();
        if (this.s) {
            if (!vb5.g(this.o, vb5.y) && !qe2.g(this.j.h, this.w)) {
                x32 x32Var = this.j;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o >> 32)) * ((int) (this.w >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.o & 4294967295L)) * ((int) (this.w & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!wi3.y(x32Var.e, jFloatToRawIntBits)) {
                    x32Var.e = jFloatToRawIntBits;
                    x32Var.g.M(jFloatToRawIntBits);
                }
            }
            x32 x32Var2 = this.j;
            j51 j51Var = this.p;
            fl2 fl2Var = this.u;
            long j = this.w;
            long j2 = x32Var2.h;
            z32 z32Var = x32Var2.g;
            if (!qe2.g(j2, j)) {
                x32Var2.h = j;
                long j3 = x32Var2.z;
                z32Var.C((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (x32Var2.t == 9205357640488583168L) {
                    x32Var2.l = true;
                    x32Var2.g();
                }
            }
            x32Var2.y = j51Var;
            x32Var2.r = fl2Var;
            x32Var2.n = this.B;
            z32Var.s(j51Var, fl2Var, x32Var2, x32Var2.v);
            x(false);
        }
    }

    public final void n(long j) {
        boolean zU = ba.u();
        ba baVar = this.a;
        if (zU) {
            baVar.T(-4.0f);
        }
        x32 x32Var = this.j;
        if (!je2.y(x32Var.z, j)) {
            x32Var.z = j;
            x32Var.g.C((int) (j >> 32), (int) (j & 4294967295L), x32Var.h);
        }
        if (Build.VERSION.SDK_INT < 26) {
            baVar.invalidate();
            return;
        }
        ViewParent parent = baVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(baVar, baVar);
        }
    }

    public final void r() {
        if (this.s || this.c) {
            return;
        }
        this.a.invalidate();
        x(true);
    }

    public final void v(long j) {
        if (qe2.g(j, this.w)) {
            return;
        }
        if (ba.u()) {
            this.a.T(-4.0f);
        }
        this.w = j;
        r();
    }

    public final void x(boolean z) {
        if (z != this.s) {
            this.s = z;
            ba baVar = this.a;
            xa3 xa3Var = baVar.H;
            boolean z2 = baVar.J;
            if (!z) {
                if (z2) {
                    return;
                }
                xa3Var.m(this);
                xa3 xa3Var2 = baVar.I;
                if (xa3Var2 != null) {
                    xa3Var2.m(this);
                    return;
                }
                return;
            }
            if (!z2) {
                xa3Var.g(this);
                return;
            }
            xa3 xa3Var3 = baVar.I;
            if (xa3Var3 == null) {
                xa3Var3 = new xa3();
                baVar.I = xa3Var3;
            }
            xa3Var3.g(this);
        }
    }

    public final float[] y() {
        boolean z = this.k;
        float[] fArr = this.i;
        if (z) {
            x32 x32Var = this.j;
            long jV = x32Var.e;
            z32 z32Var = x32Var.g;
            if ((9223372034707292159L & jV) == 9205357640488583168L) {
                jV = mq2.v(y94.N(this.w));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jV & 4294967295L));
            float fP = z32Var.p();
            float fL = z32Var.l();
            float fO = z32Var.o();
            float fD = z32Var.D();
            float fK = z32Var.K();
            float fN = z32Var.n();
            float fI = z32Var.I();
            double d = ((double) fO) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fL * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fL * fSin);
            double d2 = ((double) fD) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fP * fCos2);
            float f10 = (f3 * fCos2) + ((-fP) * fSin2);
            double d3 = ((double) fK) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fN;
            float f16 = f14 * fN;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fN;
            float f18 = f12 * fI;
            float f19 = fCos * fCos3 * fI;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fI;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.k = false;
            this.e = sp2.z(fArr);
        }
        return fArr;
    }
}
