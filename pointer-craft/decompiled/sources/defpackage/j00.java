package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j00 {
    public final float g;

    public j00(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j00) && Float.compare(this.g, ((j00) obj).g) == 0;
    }

    public final int g(int i, int i2) {
        return Math.round((1.0f + this.g) * ((i2 - i) / 2.0f));
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "Vertical(bias=" + this.g + ")";
    }
}
