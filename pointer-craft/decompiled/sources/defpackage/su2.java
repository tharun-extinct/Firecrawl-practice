package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su2 implements qo5 {
    public final qo5 g;
    public final int y;

    public su2(qo5 qo5Var, int i) {
        this.g = qo5Var;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su2)) {
            return false;
        }
        su2 su2Var = (su2) obj;
        return yf2.p(this.g, su2Var.g) && this.y == su2Var.y;
    }

    @Override // defpackage.qo5
    public final int g(j51 j51Var) {
        if ((this.y & 32) != 0) {
            return this.g.g(j51Var);
        }
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.qo5
    public final int n(j51 j51Var, fl2 fl2Var) {
        if (((fl2Var == fl2.j ? 8 : 2) & this.y) != 0) {
            return this.g.n(j51Var, fl2Var);
        }
        return 0;
    }

    @Override // defpackage.qo5
    public final int r(j51 j51Var, fl2 fl2Var) {
        if (((fl2Var == fl2.j ? 4 : 1) & this.y) != 0) {
            return this.g.r(j51Var, fl2Var);
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.y;
        int i2 = kq2.y;
        if ((i & i2) == i2) {
            kq2.Z(sb, "Start");
        }
        int i3 = kq2.n;
        if ((i & i3) == i3) {
            kq2.Z(sb, "Left");
        }
        if ((i & 16) == 16) {
            kq2.Z(sb, "Top");
        }
        int i4 = kq2.r;
        if ((i & i4) == i4) {
            kq2.Z(sb, "End");
        }
        int i5 = kq2.v;
        if ((i & i5) == i5) {
            kq2.Z(sb, "Right");
        }
        if ((i & 32) == 32) {
            kq2.Z(sb, "Bottom");
        }
        return "(" + this.g + " only " + du4.i("WindowInsetsSides(", sb.toString(), ")") + ")";
    }

    @Override // defpackage.qo5
    public final int y(j51 j51Var) {
        if ((this.y & 16) != 0) {
            return this.g.y(j51Var);
        }
        return 0;
    }
}
