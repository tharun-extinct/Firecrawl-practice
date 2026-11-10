package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fb2 extends o73 {
    public final ve2 g;
    public final hb2 y;

    public fb2(ve2 ve2Var, hb2 hb2Var) {
        this.g = ve2Var;
        this.y = hb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb2)) {
            return false;
        }
        fb2 fb2Var = (fb2) obj;
        return yf2.p(this.g, fb2Var.g) && yf2.p(this.y, fb2Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        gb2 gb2Var = (gb2) i73Var;
        o41 o41VarG = this.y.g(this.g);
        gb2Var.R0(gb2Var.k);
        gb2Var.k = o41VarG;
        gb2Var.Q0(o41VarG);
    }

    @Override // defpackage.o73
    public final i73 l() {
        o41 o41VarG = this.y.g(this.g);
        gb2 gb2Var = new gb2();
        gb2Var.k = o41VarG;
        gb2Var.Q0(o41VarG);
        return gb2Var;
    }
}
