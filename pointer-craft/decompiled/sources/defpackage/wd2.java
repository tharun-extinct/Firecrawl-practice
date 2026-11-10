package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd2 implements zn3 {
    public final qo5 g;
    public final j51 y;

    public wd2(qo5 qo5Var, j51 j51Var) {
        this.g = qo5Var;
        this.y = j51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd2)) {
            return false;
        }
        wd2 wd2Var = (wd2) obj;
        return yf2.p(this.g, wd2Var.g) && yf2.p(this.y, wd2Var.y);
    }

    @Override // defpackage.zn3
    public final float g(fl2 fl2Var) {
        qo5 qo5Var = this.g;
        j51 j51Var = this.y;
        return j51Var.y0(qo5Var.n(j51Var, fl2Var));
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    @Override // defpackage.zn3
    public final float n() {
        qo5 qo5Var = this.g;
        j51 j51Var = this.y;
        return j51Var.y0(qo5Var.y(j51Var));
    }

    @Override // defpackage.zn3
    public final float r() {
        qo5 qo5Var = this.g;
        j51 j51Var = this.y;
        return j51Var.y0(qo5Var.g(j51Var));
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.g + ", density=" + this.y + ")";
    }

    @Override // defpackage.zn3
    public final float y(fl2 fl2Var) {
        qo5 qo5Var = this.g;
        j51 j51Var = this.y;
        return j51Var.y0(qo5Var.r(j51Var, fl2Var));
    }
}
