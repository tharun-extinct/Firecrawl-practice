package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk0 implements j73 {
    public final j73 g;
    public final j73 y;

    public pk0(j73 j73Var, j73 j73Var2) {
        this.g = j73Var;
        this.y = j73Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pk0)) {
            return false;
        }
        pk0 pk0Var = (pk0) obj;
        return this.g.equals(pk0Var.g) && yf2.p(this.y, pk0Var.y);
    }

    @Override // defpackage.j73
    public final Object g(bz1 bz1Var, Object obj) {
        return this.y.g(bz1Var, this.g.g(bz1Var, obj));
    }

    public final int hashCode() {
        return (this.y.hashCode() * 31) + this.g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) g(new os((byte) 4), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.j73
    public final boolean y(xy1 xy1Var) {
        return this.g.y(xy1Var) && this.y.y(xy1Var);
    }
}
