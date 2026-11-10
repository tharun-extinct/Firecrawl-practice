package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d7 implements c53 {
    public final i00 g;
    public final int r;
    public final i00 y;

    public d7(i00 i00Var, i00 i00Var2, int i) {
        this.g = i00Var;
        this.y = i00Var2;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return this.g.equals(d7Var.g) && this.y.equals(d7Var.y) && this.r == d7Var.r;
    }

    @Override // defpackage.c53
    public final int g(ne2 ne2Var, long j, int i, fl2 fl2Var) {
        int iG = this.y.g(0, ne2Var.n(), fl2Var);
        int i2 = -this.g.g(0, i, fl2Var);
        fl2 fl2Var2 = fl2.j;
        int i3 = this.r;
        if (fl2Var != fl2Var2) {
            i3 = -i3;
        }
        return ne2Var.g + iG + i2 + i3;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + fj.y(this.y.g, Float.hashCode(this.g.g) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.g);
        sb.append(", anchorAlignment=");
        sb.append(this.y);
        sb.append(", offset=");
        return fj.x(sb, this.r, ')');
    }
}
