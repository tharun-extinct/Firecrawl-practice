package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi5 implements qo5 {
    public final String g;
    public final tp3 y;

    public pi5(xd2 xd2Var, String str) {
        this.g = str;
        this.y = kq2.M(xd2Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pi5) {
            return yf2.p(v(), ((pi5) obj).v());
        }
        return false;
    }

    @Override // defpackage.qo5
    public final int g(j51 j51Var) {
        return v().n;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.qo5
    public final int n(j51 j51Var, fl2 fl2Var) {
        return v().g;
    }

    @Override // defpackage.qo5
    public final int r(j51 j51Var, fl2 fl2Var) {
        return v().r;
    }

    public final String toString() {
        return this.g + "(left=" + v().g + ", top=" + v().y + ", right=" + v().r + ", bottom=" + v().n + ")";
    }

    public final xd2 v() {
        return (xd2) this.y.getValue();
    }

    public final void x(xd2 xd2Var) {
        this.y.setValue(xd2Var);
    }

    @Override // defpackage.qo5
    public final int y(j51 j51Var) {
        return v().y;
    }
}
