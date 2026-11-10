package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xj5 {
    public final boolean g;
    public final float[] j;
    public final float[] l;
    public final uz0[] n;
    public final int r;
    public int v;
    public final float[] x;
    public final wj5 y;

    public xj5(boolean z, wj5 wj5Var) {
        int i;
        this.g = z;
        this.y = wj5Var;
        if (z && wj5Var.equals(wj5.j)) {
            l0.z("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = wj5Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                up.y();
                throw null;
            }
            i = 2;
        }
        this.r = i;
        this.n = new uz0[20];
        this.x = new float[20];
        this.l = new float[20];
        this.j = new float[3];
    }

    public final void g(float f, long j) {
        int i = (this.v + 1) % 20;
        this.v = i;
        uz0[] uz0VarArr = this.n;
        uz0 uz0Var = uz0VarArr[i];
        if (uz0Var != null) {
            uz0Var.g = j;
            uz0Var.y = f;
        } else {
            uz0 uz0Var2 = new uz0();
            uz0Var2.g = j;
            uz0Var2.y = f;
            uz0VarArr[i] = uz0Var2;
        }
    }

    public final void n() {
        uz0[] uz0VarArr = this.n;
        pr.T(0, uz0VarArr.length, null, uz0VarArr);
        this.v = 0;
    }

    public final float r(float f) {
        if (f <= 0.0f) {
            mc2.y("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fY = y();
        if (fY == 0.0f || Float.isNaN(fY)) {
            return 0.0f;
        }
        if (fY <= 0.0f) {
            float f2 = -f;
            if (fY < f2) {
                return f2;
            }
        } else if (fY > f) {
            return f;
        }
        return fY;
    }

    public final float y() {
        boolean z;
        wj5 wj5Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.v;
        uz0[] uz0VarArr = this.n;
        uz0 uz0Var = uz0VarArr[i3];
        if (uz0Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        uz0 uz0Var2 = uz0Var;
        do {
            uz0 uz0Var3 = uz0VarArr[i3];
            z = this.g;
            wj5Var = this.y;
            float[] fArr3 = this.x;
            fArr = this.l;
            if (uz0Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = uz0Var.g;
                i = i4;
                f = 0.0f;
                long j2 = uz0Var3.g;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - uz0Var2.g);
                uz0Var2 = (wj5Var == wj5.j || z) ? uz0Var3 : uz0Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = uz0Var3.y;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.r) {
            return f;
        }
        int iOrdinal = wj5Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.j;
                ua6.j(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                up.y();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public /* synthetic */ xj5() {
        this(false, wj5.j);
    }

    public xj5(boolean z) {
        this(z, wj5.t);
    }
}
