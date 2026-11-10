package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kv1 implements iv1 {
    public final float[] g;
    public final float[] y;

    public kv1(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            l0.u("Array lengths must match and be nonzero");
            throw null;
        }
        this.g = fArr;
        this.y = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        return Arrays.equals(this.g, kv1Var.g) && Arrays.equals(this.y, kv1Var.y);
    }

    @Override // defpackage.iv1
    public final float g(float f) {
        return c93.C(f, this.y, this.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + (Arrays.hashCode(this.g) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.g);
        string.getClass();
        String string2 = Arrays.toString(this.y);
        string2.getClass();
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + "}";
    }

    @Override // defpackage.iv1
    public final float y(float f) {
        return c93.C(f, this.g, this.y);
    }
}
