package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm3 extends br2 {
    public final ha4 n;
    public final ld v;

    public zm3(ha4 ha4Var) {
        ld ldVarG;
        this.n = ha4Var;
        if (v13.p(ha4Var)) {
            ldVarG = null;
        } else {
            ldVarG = nd.g();
            ld.r(ldVarG, ha4Var);
        }
        this.v = ldVarG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zm3) {
            return this.n.equals(((zm3) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // defpackage.br2
    public final k44 p() {
        ha4 ha4Var = this.n;
        return new k44(ha4Var.g, ha4Var.y, ha4Var.r, ha4Var.n);
    }
}
