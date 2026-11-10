package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class uj0 {
    public final String g;
    public final int r;
    public final long y;

    public uj0(String str, long j, int i) {
        this.g = str;
        this.y = j;
        this.r = i;
        if (str.length() == 0) {
            l0.u("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            l0.u("The id must be between -1 and 63");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        if (this.r == uj0Var.r && this.g.equals(uj0Var.g)) {
            return m50.I(this.y, uj0Var.y);
        }
        return false;
    }

    public float g(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    public int hashCode() {
        return xi3.v(this.g.hashCode() * 31, 31, this.y) + this.r;
    }

    public long n(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = ij3.l;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = ij3.x;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    public boolean r() {
        return false;
    }

    public final String toString() {
        return this.g + " (id=" + this.r + ", model=" + m50.c0(this.y) + ")";
    }

    public float v(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = ij3.l;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = ij3.x;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    public long x(float f, float f2, float f3, float f4, uj0 uj0Var) {
        float[] fArr = ij3.n;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fZ = lr2.z(f5);
        float fZ2 = lr2.z(f6);
        float fZ3 = lr2.z(f7);
        float[] fArr2 = ij3.v;
        return ra.r((fArr2[6] * fZ3) + (fArr2[3] * fZ2) + (fArr2[0] * fZ), (fArr2[7] * fZ3) + (fArr2[4] * fZ2) + (fArr2[1] * fZ), (fArr2[8] * fZ3) + (fArr2[5] * fZ2) + (fArr2[2] * fZ), f4, uj0Var);
    }

    public float y(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }
}
