package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g00 implements r6 {
    public final float g;

    public g00(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g00) && Float.compare(this.g, ((g00) obj).g) == 0;
    }

    @Override // defpackage.r6
    public final int g(int i, int i2, fl2 fl2Var) {
        return Math.round((1.0f + this.g) * ((i2 - i) / 2.0f));
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.g + ")";
    }
}
