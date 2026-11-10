package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ok0 implements o22 {
    public final o22 g;
    public final o22 y;

    public ok0(o22 o22Var, o22 o22Var2) {
        this.g = o22Var;
        this.y = o22Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ok0)) {
            return false;
        }
        ok0 ok0Var = (ok0) obj;
        return this.g.equals(ok0Var.g) && yf2.p(this.y, ok0Var.y);
    }

    @Override // defpackage.o22
    public final Object g(bz1 bz1Var, Object obj) {
        return this.y.g(bz1Var, this.g.g(bz1Var, obj));
    }

    public final int hashCode() {
        return (this.y.hashCode() * 31) + this.g.hashCode();
    }

    @Override // defpackage.o22
    public final boolean r(xy1 xy1Var) {
        return this.g.r(xy1Var) || this.y.r(xy1Var);
    }

    public final String toString() {
        return "[" + ((String) g(new os((byte) 3), "")) + ']';
    }

    @Override // defpackage.o22
    public final boolean y(q21 q21Var) {
        return this.g.y(q21Var) && this.y.y(q21Var);
    }
}
