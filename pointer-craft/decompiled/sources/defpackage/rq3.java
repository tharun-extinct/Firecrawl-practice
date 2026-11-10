package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq3 extends fr3 {
    public final float n;
    public final float r;

    public rq3(float f, float f2) {
        super(3);
        this.r = f;
        this.n = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq3)) {
            return false;
        }
        rq3 rq3Var = (rq3) obj;
        return Float.compare(this.r, rq3Var.r) == 0 && Float.compare(this.n, rq3Var.n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.r) * 31);
    }

    public final String toString() {
        return "MoveTo(x=" + this.r + ", y=" + this.n + ")";
    }
}
