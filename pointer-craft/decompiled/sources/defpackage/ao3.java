package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ao3 extends o73 {
    public final zn3 g;

    public ao3(zn3 zn3Var) {
        this.g = zn3Var;
    }

    public final boolean equals(Object obj) {
        ao3 ao3Var = obj instanceof ao3 ? (ao3) obj : null;
        if (ao3Var == null) {
            return false;
        }
        return yf2.p(this.g, ao3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((co3) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        co3 co3Var = new co3();
        co3Var.o = this.g;
        return co3Var;
    }
}
