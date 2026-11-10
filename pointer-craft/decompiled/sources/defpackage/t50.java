package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class t50 extends o73 {
    public final k00 g;

    public t50(k00 k00Var) {
        this.g = k00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        t50 t50Var = obj instanceof t50 ? (t50) obj : null;
        return t50Var != null && this.g.equals(t50Var.g);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((u50) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        u50 u50Var = new u50();
        u50Var.o = this.g;
        return u50Var;
    }
}
