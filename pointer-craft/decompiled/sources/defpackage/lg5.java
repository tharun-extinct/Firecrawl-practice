package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg5 implements qo5 {
    public final qo5 g;
    public final qo5 y;

    public lg5(qo5 qo5Var, qo5 qo5Var2) {
        this.g = qo5Var;
        this.y = qo5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg5)) {
            return false;
        }
        lg5 lg5Var = (lg5) obj;
        return yf2.p(lg5Var.g, this.g) && yf2.p(lg5Var.y, this.y);
    }

    @Override // defpackage.qo5
    public final int g(j51 j51Var) {
        return Math.max(this.g.g(j51Var), this.y.g(j51Var));
    }

    public final int hashCode() {
        return (this.y.hashCode() * 31) + this.g.hashCode();
    }

    @Override // defpackage.qo5
    public final int n(j51 j51Var, fl2 fl2Var) {
        return Math.max(this.g.n(j51Var, fl2Var), this.y.n(j51Var, fl2Var));
    }

    @Override // defpackage.qo5
    public final int r(j51 j51Var, fl2 fl2Var) {
        return Math.max(this.g.r(j51Var, fl2Var), this.y.r(j51Var, fl2Var));
    }

    public final String toString() {
        return "(" + this.g + " ∪ " + this.y + ")";
    }

    @Override // defpackage.qo5
    public final int y(j51 j51Var) {
        return Math.max(this.g.y(j51Var), this.y.y(j51Var));
    }
}
