package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ig4 extends o73 {
    public final rf4 g;
    public final boolean y;

    public ig4(rf4 rf4Var, boolean z) {
        this.g = rf4Var;
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ig4)) {
            return false;
        }
        ig4 ig4Var = (ig4) obj;
        return yf2.p(this.g, ig4Var.g) && this.y == ig4Var.y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + xi3.l(this.g.hashCode() * 31, 31, false);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        nf4 nf4Var = (nf4) i73Var;
        nf4Var.o = this.g;
        nf4Var.f = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        nf4 nf4Var = new nf4();
        nf4Var.o = this.g;
        nf4Var.f = this.y;
        return nf4Var;
    }
}
