package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gi4 {
    public final n74 g;
    public final long r;
    public final int y;

    public gi4(n74 n74Var, int i, long j) {
        this.g = n74Var;
        this.y = i;
        this.r = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi4)) {
            return false;
        }
        gi4 gi4Var = (gi4) obj;
        return this.g == gi4Var.g && this.y == gi4Var.y && this.r == gi4Var.r;
    }

    public final int hashCode() {
        return Long.hashCode(this.r) + du4.r(this.y, this.g.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.g + ", offset=" + this.y + ", selectableId=" + this.r + ")";
    }
}
