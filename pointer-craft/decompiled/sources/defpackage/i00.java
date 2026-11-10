package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements r6 {
    public final float g;

    public i00(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i00) && Float.compare(this.g, ((i00) obj).g) == 0;
    }

    @Override // defpackage.r6
    public final int g(int i, int i2, fl2 fl2Var) {
        float f = (i2 - i) / 2.0f;
        fl2 fl2Var2 = fl2.j;
        float f2 = this.g;
        if (fl2Var != fl2Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.g + ")";
    }
}
