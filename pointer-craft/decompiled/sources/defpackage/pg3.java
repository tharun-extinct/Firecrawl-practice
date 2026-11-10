package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pg3 {
    public final boolean g;
    public final boolean n;
    public final boolean r;
    public final boolean y;

    public pg3(boolean z, boolean z2, boolean z3, boolean z4) {
        this.g = z;
        this.y = z2;
        this.r = z3;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg3)) {
            return false;
        }
        pg3 pg3Var = (pg3) obj;
        return this.g == pg3Var.g && this.y == pg3Var.y && this.r == pg3Var.r && this.n == pg3Var.n;
    }

    public final boolean g() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.y;
        ?? r1 = this.g;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.r) {
            i2 = i + 256;
        }
        return this.n ? i2 + 4096 : i2;
    }

    public final boolean n() {
        return this.y;
    }

    public final boolean r() {
        return this.n;
    }

    public final String toString() {
        return "[ Connected=" + this.g + " Validated=" + this.y + " Metered=" + this.r + " NotRoaming=" + this.n + " ]";
    }

    public final boolean y() {
        return this.r;
    }
}
