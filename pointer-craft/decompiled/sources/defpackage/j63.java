package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j63 {
    public final i63 g;
    public final boolean r;
    public final int y;

    public j63(i63 i63Var, int i, boolean z) {
        i63Var.getClass();
        this.g = i63Var;
        this.y = i;
        this.r = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j63)) {
            return false;
        }
        j63 j63Var = (j63) obj;
        return this.g == j63Var.g && this.y == j63Var.y && this.r == j63Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + du4.r(this.y, this.g.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ModKey(mod=" + this.g + ", hidKey=" + this.y + ", activated=" + this.r + ")";
    }
}
