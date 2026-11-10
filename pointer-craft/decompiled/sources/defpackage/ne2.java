package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne2 {
    public static final ne2 v = new ne2(0, 0, 0, 0);
    public final int g;
    public final int n;
    public final int r;
    public final int y;

    public ne2(int i, int i2, int i3, int i4) {
        this.g = i;
        this.y = i2;
        this.r = i3;
        this.n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne2)) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return this.g == ne2Var.g && this.y == ne2Var.y && this.r == ne2Var.r && this.n == ne2Var.n;
    }

    public final long g() {
        return (((long) ((y() / 2) + this.y)) & 4294967295L) | (((long) ((n() / 2) + this.g)) << 32);
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + du4.r(this.r, du4.r(this.y, Integer.hashCode(this.g) * 31, 31), 31);
    }

    public final int n() {
        return this.r - this.g;
    }

    public final long r() {
        return (((long) this.g) << 32) | (((long) this.y) & 4294967295L);
    }

    public final String toString() {
        StringBuilder sbS = du4.s(this.g, this.y, "IntRect.fromLTRB(", ", ", ", ");
        sbS.append(this.r);
        sbS.append(", ");
        sbS.append(this.n);
        sbS.append(")");
        return sbS.toString();
    }

    public final int y() {
        return this.n - this.y;
    }
}
