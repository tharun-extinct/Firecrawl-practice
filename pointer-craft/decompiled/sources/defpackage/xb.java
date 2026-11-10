package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xb {
    public final float g;
    public final float y;

    public xb(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return Float.compare(this.g, xbVar.g) == 0 && Float.compare(this.y, xbVar.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.g + ", velocityCoefficient=" + this.y + ")";
    }
}
