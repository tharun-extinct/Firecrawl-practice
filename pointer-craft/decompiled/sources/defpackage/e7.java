package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e7 implements d53 {
    public final j00 g;
    public final int r;
    public final j00 y;

    public e7(j00 j00Var, j00 j00Var2, int i) {
        this.g = j00Var;
        this.y = j00Var2;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return this.g.equals(e7Var.g) && this.y.equals(e7Var.y) && this.r == e7Var.r;
    }

    @Override // defpackage.d53
    public final int g(ne2 ne2Var, long j, int i) {
        int iG = this.y.g(0, ne2Var.y());
        return ne2Var.y + iG + (-this.g.g(0, i)) + this.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + fj.y(this.y.g, Float.hashCode(this.g.g) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.g);
        sb.append(", anchorAlignment=");
        sb.append(this.y);
        sb.append(", offset=");
        return fj.x(sb, this.r, ')');
    }
}
