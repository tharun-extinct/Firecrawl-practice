package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class io5 implements d53 {
    public final j00 g;
    public final int y;

    public io5(j00 j00Var, int i) {
        this.g = j00Var;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io5)) {
            return false;
        }
        io5 io5Var = (io5) obj;
        return this.g.equals(io5Var.g) && this.y == io5Var.y;
    }

    @Override // defpackage.d53
    public final int g(ne2 ne2Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.y;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : xs2.w(this.g.g(i, i2), i3, (i2 - i3) - i);
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Float.hashCode(this.g.g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.g);
        sb.append(", margin=");
        return fj.x(sb, this.y, ')');
    }
}
