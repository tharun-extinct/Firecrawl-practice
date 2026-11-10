package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er3 extends fr3 {
    public final float r;

    public er3(float f) {
        super(3);
        this.r = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er3) && Float.compare(this.r, ((er3) obj).r) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.r);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.r + ")";
    }
}
