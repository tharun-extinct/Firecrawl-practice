package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tw4 extends vw4 {
    public final Object g;
    public final Object y;

    public tw4(Object obj, Object obj2) {
        this.g = obj;
        this.y = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw4)) {
            return false;
        }
        tw4 tw4Var = (tw4) obj;
        return this.g.equals(tw4Var.g) && this.y.equals(tw4Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "Invalid(fromState=" + this.g + ", event=" + this.y + ")";
    }
}
