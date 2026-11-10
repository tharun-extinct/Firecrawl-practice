package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mg5 extends o73 {
    public final op1 g;

    public mg5(op1 op1Var) {
        this.g = op1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mg5) {
            return ((mg5) obj).g.equals(this.g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ng5 ng5Var = (ng5) i73Var;
        op1 op1Var = ng5Var.k;
        op1 op1Var2 = this.g;
        if (op1Var2.equals(op1Var)) {
            return;
        }
        ng5Var.k = op1Var2;
        ng5Var.R0();
    }

    @Override // defpackage.o73
    public final i73 l() {
        ng5 ng5Var = new ng5();
        ng5Var.k = this.g;
        return ng5Var;
    }
}
