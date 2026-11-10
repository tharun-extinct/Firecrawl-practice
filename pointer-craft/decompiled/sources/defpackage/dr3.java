package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dr3 extends fr3 {
    public final float r;

    public dr3(float f) {
        super(3);
        this.r = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr3) && Float.compare(this.r, ((dr3) obj).r) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.r);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.r + ")";
    }
}
