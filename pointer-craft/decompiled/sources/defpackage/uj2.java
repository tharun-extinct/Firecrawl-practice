package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uj2 {
    public final boolean g;
    public final boolean r;
    public final boolean y;

    public uj2(boolean z, boolean z2, boolean z3) {
        this.g = z;
        this.y = z2;
        this.r = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj2)) {
            return false;
        }
        uj2 uj2Var = (uj2) obj;
        return this.g == uj2Var.g && this.y == uj2Var.y && this.r == uj2Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + xi3.l(Boolean.hashCode(this.g) * 31, 31, this.y);
    }

    public final String toString() {
        return "KeyboardModifiers(shift=" + this.g + ", altRight=" + this.y + ", altLeft=" + this.r + ")";
    }
}
