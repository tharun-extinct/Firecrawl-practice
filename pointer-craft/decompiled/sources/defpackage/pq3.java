package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq3 extends fr3 {
    public final float r;

    public pq3(float f) {
        super(3);
        this.r = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq3) && Float.compare(this.r, ((pq3) obj).r) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.r);
    }

    public final String toString() {
        return "HorizontalTo(x=" + this.r + ")";
    }
}
