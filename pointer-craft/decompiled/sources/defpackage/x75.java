package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x75 {
    public final long g;
    public final long y;

    public x75(long j, long j2) {
        this.g = j;
        this.y = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x75)) {
            return false;
        }
        x75 x75Var = (x75) obj;
        long j = x75Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && tf5.g(this.y, x75Var.y);
    }

    public final int hashCode() {
        int i = jj0.t;
        return Long.hashCode(this.y) + (Long.hashCode(this.g) * 31);
    }

    public final String toString() {
        return xi3.a("SelectionColors(selectionHandleColor=", jj0.j(this.g), ", selectionBackgroundColor=", jj0.j(this.y), ")");
    }
}
