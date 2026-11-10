package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ry {
    public final float g;

    public final boolean equals(Object obj) {
        if (obj instanceof ry) {
            return Float.compare(this.g, ((ry) obj).g) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.g + ")";
    }
}
