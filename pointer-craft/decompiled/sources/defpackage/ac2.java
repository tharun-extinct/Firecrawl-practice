package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements oi {
    public final nf1 g;
    public final y64 y;

    public ac2(nf1 nf1Var, y64 y64Var) {
        this.g = nf1Var;
        this.y = y64Var;
        if (nf1Var instanceof qe5) {
            qe5 qe5Var = (qe5) nf1Var;
            if (qe5Var.g != 0 || qe5Var.y != 0) {
                return;
            }
        } else if (nf1Var instanceof zs4) {
            if (((zs4) nf1Var).g != 0) {
                return;
            }
        } else if (!(nf1Var instanceof ck2) || ((ck2) nf1Var).g.g != 0) {
            return;
        }
        l0.u("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ac2)) {
            return false;
        }
        ac2 ac2Var = (ac2) obj;
        return ac2Var.g.equals(this.g) && ac2Var.y == this.y;
    }

    @Override // defpackage.oi
    public final jj5 g(te5 te5Var) {
        return new oj5(this.g.g(te5Var), this.y);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }
}
