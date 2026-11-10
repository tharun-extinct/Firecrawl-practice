package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ek2 {
    public final int g;
    public final int y;

    public ek2(int i, int i2) {
        this.g = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek2)) {
            return false;
        }
        ek2 ek2Var = (ek2) obj;
        return this.g == ek2Var.g && this.y == ek2Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return du4.q(this.g, this.y, "KeystrokeProgress(sent=", ", total=", ")");
    }
}
