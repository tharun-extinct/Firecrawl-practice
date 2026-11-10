package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zy0 extends zw0 {
    public zy0(cx0 cx0Var, cx0 cx0Var2, cx0 cx0Var3, cx0 cx0Var4) {
        super(cx0Var, cx0Var2, cx0Var3, cx0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy0)) {
            return false;
        }
        zy0 zy0Var = (zy0) obj;
        return yf2.p(this.g, zy0Var.g) && yf2.p(this.y, zy0Var.y) && yf2.p(this.r, zy0Var.r) && yf2.p(this.n, zy0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + this.g + ", topEnd = " + this.y + ", bottomEnd = " + this.r + ", bottomStart = " + this.n + ")";
    }
}
