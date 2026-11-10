package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb4 {
    public float g = 0.0f;
    public boolean y = true;
    public ay0 r = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb4)) {
            return false;
        }
        gb4 gb4Var = (gb4) obj;
        return Float.compare(this.g, gb4Var.g) == 0 && this.y == gb4Var.y && yf2.p(this.r, gb4Var.r);
    }

    public final int hashCode() {
        int iL = xi3.l(Float.hashCode(this.g) * 31, 31, this.y);
        ay0 ay0Var = this.r;
        return (iL + (ay0Var == null ? 0 : ay0Var.G.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.g + ", fill=" + this.y + ", crossAxisAlignment=" + this.r + ", flowLayoutData=null)";
    }
}
