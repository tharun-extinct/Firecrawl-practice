package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uz0 {
    public long g;
    public float y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz0)) {
            return false;
        }
        uz0 uz0Var = (uz0) obj;
        return this.g == uz0Var.g && Float.compare(this.y, uz0Var.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Long.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.g + ", dataPoint=" + this.y + ")";
    }
}
