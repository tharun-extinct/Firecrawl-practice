package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb3 {
    public float g = 0.0f;
    public float y = 0.0f;
    public float r = 0.0f;
    public float n = 0.0f;

    public final void g(float f, float f2, float f3, float f4) {
        this.g = Math.max(f, this.g);
        this.y = Math.max(f2, this.y);
        this.r = Math.min(f3, this.r);
        this.n = Math.min(f4, this.n);
    }

    public final void r(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.g += fIntBitsToFloat;
        this.y += fIntBitsToFloat2;
        this.r += fIntBitsToFloat;
        this.n += fIntBitsToFloat2;
    }

    public final String toString() {
        String strV = et2.v(this.g);
        String strV2 = et2.v(this.y);
        String strV3 = et2.v(this.r);
        String strV4 = et2.v(this.n);
        StringBuilder sbZ = du4.z("MutableRect(", strV, ", ", strV2, ", ");
        sbZ.append(strV3);
        sbZ.append(", ");
        sbZ.append(strV4);
        sbZ.append(")");
        return sbZ.toString();
    }

    public final boolean y() {
        return (this.g >= this.r) | (this.y >= this.n);
    }
}
