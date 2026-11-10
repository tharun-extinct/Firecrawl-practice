package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k44 {
    public static final k44 v = new k44(0.0f, 0.0f, 0.0f, 0.0f);
    public final float g;
    public final float n;
    public final float r;
    public final float y;

    public k44(float f, float f2, float f3, float f4) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k44)) {
            return false;
        }
        k44 k44Var = (k44) obj;
        return Float.compare(this.g, k44Var.g) == 0 && Float.compare(this.y, k44Var.y) == 0 && Float.compare(this.r, k44Var.r) == 0 && Float.compare(this.n, k44Var.n) == 0;
    }

    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.g) & (fIntBitsToFloat < this.r) & (fIntBitsToFloat2 >= this.y) & (fIntBitsToFloat2 < this.n);
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31);
    }

    public final k44 j(float f, float f2) {
        return new k44(this.g + f, this.y + f2, this.r + f, this.n + f2);
    }

    public final boolean l(k44 k44Var) {
        return (this.g < k44Var.r) & (k44Var.g < this.r) & (this.y < k44Var.n) & (k44Var.y < this.n);
    }

    public final long n() {
        return (((long) Float.floatToRawIntBits(this.g)) << 32) | (((long) Float.floatToRawIntBits(this.y)) & 4294967295L);
    }

    public final long r() {
        float f = this.r - this.g;
        return (((long) Float.floatToRawIntBits(this.n - this.y)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final k44 t(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new k44(Float.intBitsToFloat(i) + this.g, Float.intBitsToFloat(i2) + this.y, Float.intBitsToFloat(i) + this.r, Float.intBitsToFloat(i2) + this.n);
    }

    public final String toString() {
        String strV = et2.v(this.g);
        String strV2 = et2.v(this.y);
        String strV3 = et2.v(this.r);
        String strV4 = et2.v(this.n);
        StringBuilder sbZ = du4.z("Rect.fromLTRB(", strV, ", ", strV2, ", ");
        sbZ.append(strV3);
        sbZ.append(", ");
        sbZ.append(strV4);
        sbZ.append(")");
        return sbZ.toString();
    }

    public final k44 v(k44 k44Var) {
        return new k44(Math.max(this.g, k44Var.g), Math.max(this.y, k44Var.y), Math.min(this.r, k44Var.r), Math.min(this.n, k44Var.n));
    }

    public final boolean x() {
        return (this.g >= this.r) | (this.y >= this.n);
    }

    public final long y() {
        float f = this.r;
        float f2 = this.g;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.n;
        float f5 = this.y;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }
}
