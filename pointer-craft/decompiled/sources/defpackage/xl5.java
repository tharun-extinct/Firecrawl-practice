package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl5 {
    public final Object g;
    public boolean r;
    public final vl5 y;

    public xl5(Object obj) {
        vl5 vl5Var = new vl5();
        this.g = obj;
        this.y = vl5Var;
        this.r = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xl5) {
            xl5 xl5Var = (xl5) obj;
            if (this.g.equals(xl5Var.g) && this.y == xl5Var.y && this.r == xl5Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + du4.r(0, (this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Entry(key=" + this.g + ", store=" + this.y + ", refCount=0, isDisposable=" + this.r + ")";
    }
}
