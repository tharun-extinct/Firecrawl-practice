package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he0 extends o73 {
    public final l1 g;

    public he0(l1 l1Var) {
        this.g = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof he0) {
            return this.g == ((he0) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ge0 ge0Var = (ge0) i73Var;
        ge0Var.o = this.g;
        br2.d(ge0Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        ge0 ge0Var = new ge0();
        ge0Var.o = this.g;
        return ge0Var;
    }
}
