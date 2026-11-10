package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xd2 {
    public final int g;
    public final int n;
    public final int r;
    public final int y;

    public xd2(int i, int i2, int i3, int i4) {
        this.g = i;
        this.y = i2;
        this.r = i3;
        this.n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd2)) {
            return false;
        }
        xd2 xd2Var = (xd2) obj;
        return this.g == xd2Var.g && this.y == xd2Var.y && this.r == xd2Var.r && this.n == xd2Var.n;
    }

    public final int hashCode() {
        return (((((this.g * 31) + this.y) * 31) + this.r) * 31) + this.n;
    }

    public final String toString() {
        StringBuilder sbS = du4.s(this.g, this.y, "InsetsValues(left=", ", top=", ", right=");
        sbS.append(this.r);
        sbS.append(", bottom=");
        sbS.append(this.n);
        sbS.append(")");
        return sbS.toString();
    }
}
