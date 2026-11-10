package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gx4 {
    public final String g;
    public final int r;
    public final uz5 y;

    public gx4(String str, uz5 uz5Var, int i) {
        this.g = str;
        this.y = uz5Var;
        this.r = i;
    }

    public static gx4 g(gx4 gx4Var, String str, uz5 uz5Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = gx4Var.g;
        }
        if ((i2 & 2) != 0) {
            uz5Var = gx4Var.y;
        }
        if ((i2 & 4) != 0) {
            i = gx4Var.r;
        }
        return new gx4(str, uz5Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx4)) {
            return false;
        }
        gx4 gx4Var = (gx4) obj;
        return this.g.equals(gx4Var.g) && this.y.equals(gx4Var.y) && this.r == gx4Var.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Step(label=");
        sb.append(this.g);
        sb.append(", buttonType=");
        sb.append(this.y);
        sb.append(", delay=");
        return xi3.m(sb, this.r, ")");
    }
}
