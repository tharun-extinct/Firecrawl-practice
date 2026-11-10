package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wx3 implements jk4 {
    public final String g;
    public final tx3 y;

    public wx3(String str, tx3 tx3Var) {
        this.g = str;
        this.y = tx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx3)) {
            return false;
        }
        wx3 wx3Var = (wx3) obj;
        return this.g.equals(wx3Var.g) && this.y.equals(wx3Var.y);
    }

    @Override // defpackage.jk4
    public final String g() {
        return this.g;
    }

    public final int hashCode() {
        return (this.y.hashCode() * 31) + this.g.hashCode();
    }

    @Override // defpackage.jk4
    public final String n(int i) {
        v();
        throw null;
    }

    @Override // defpackage.jk4
    public final int r() {
        return 0;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.g + ')';
    }

    public final void v() {
        throw new IllegalStateException(du4.b(new StringBuilder("Primitive descriptor "), this.g, " does not have elements"));
    }

    @Override // defpackage.jk4
    public final jk4 x(int i) {
        v();
        throw null;
    }

    @Override // defpackage.jk4
    public final tx3 y() {
        return this.y;
    }
}
