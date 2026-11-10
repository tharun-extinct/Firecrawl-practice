package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq3 extends fr3 {
    public final float r;

    public xq3(float f) {
        super(3);
        this.r = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq3) && Float.compare(this.r, ((xq3) obj).r) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.r);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.r + ")";
    }
}
