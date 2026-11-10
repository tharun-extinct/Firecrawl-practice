package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia2 {
    public final ha2 g;
    public final int y;

    public ia2(ha2 ha2Var, int i) {
        this.g = ha2Var;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia2)) {
            return false;
        }
        ia2 ia2Var = (ia2) obj;
        return this.g.equals(ia2Var.g) && this.y == ia2Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.g + ", configFlags=" + this.y + ")";
    }
}
