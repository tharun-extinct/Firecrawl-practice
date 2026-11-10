package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qe5 implements nf1 {
    public final int g;
    public final cg1 r;
    public final int y;

    public qe5(int i, cg1 cg1Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? dg1.g : cg1Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qe5) {
            qe5 qe5Var = (qe5) obj;
            if (qe5Var.g == this.g && qe5Var.y == this.y && yf2.p(qe5Var.r, this.r)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oi
    public final jj5 g(te5 te5Var) {
        return new w20(this.g, this.y, this.r);
    }

    public final int hashCode() {
        return ((this.r.hashCode() + (this.g * 31)) * 31) + this.y;
    }

    public qe5(int i, int i2, cg1 cg1Var) {
        this.g = i;
        this.y = i2;
        this.r = cg1Var;
    }

    @Override // defpackage.nf1, defpackage.oi
    public final lj5 g(te5 te5Var) {
        return new w20(this.g, this.y, this.r);
    }
}
