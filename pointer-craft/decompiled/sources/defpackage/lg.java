package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg implements qo5 {
    public final short g;
    public final String y;
    public final tp3 r = kq2.M(nd2.v);
    public final tp3 n = kq2.M(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public lg(String str, int i) {
        this.g = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lg) {
            return this.g == ((lg) obj).g;
        }
        return false;
    }

    @Override // defpackage.qo5
    public final int g(j51 j51Var) {
        return v().n;
    }

    public final int hashCode() {
        return this.g;
    }

    public final void l(tp5 tp5Var, int i) {
        short s = this.g;
        if (i == 0 || (i & s) != 0) {
            this.r.setValue(tp5Var.g.t(s));
            x(tp5Var.g.h(s));
        }
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
        return this.y + "(" + v().g + ", " + v().y + ", " + v().r + ", " + v().n + ")";
    }

    public final nd2 v() {
        return (nd2) this.r.getValue();
    }

    public final void x(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.qo5
    public final int y(j51 j51Var) {
        return v().y;
    }
}
