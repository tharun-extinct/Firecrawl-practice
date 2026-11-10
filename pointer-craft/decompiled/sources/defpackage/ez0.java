package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ez0 {
    public final e24 g;
    public final boolean y;

    public ez0(e24 e24Var, boolean z) {
        this.g = e24Var;
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ez0) {
            ez0 ez0Var = (ez0) obj;
            if (ez0Var.g.equals(this.g) && ez0Var.y == this.y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.y).hashCode() ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }
}
