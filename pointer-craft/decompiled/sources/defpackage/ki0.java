package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki0 {
    public final float g;
    public final float y;

    public ki0(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public static boolean g(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ki0)) {
            return false;
        }
        float f = this.g;
        float f2 = this.y;
        if (f > f2) {
            ki0 ki0Var = (ki0) obj;
            if (ki0Var.g > ki0Var.y) {
                return true;
            }
        }
        ki0 ki0Var2 = (ki0) obj;
        return f == ki0Var2.g && f2 == ki0Var2.y;
    }

    public final int hashCode() {
        float f = this.g;
        float f2 = this.y;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.g + ".." + this.y;
    }
}
