package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rk0 implements ug1 {
    public final cj g;
    public final int y;

    public rk0(String str, int i) {
        this(new cj(str), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        return yf2.p(this.g.t, rk0Var.g.t) && this.y == rk0Var.y;
    }

    @Override // defpackage.ug1
    public final void g(vg1 vg1Var) {
        int i = vg1Var.m;
        cj cjVar = this.g;
        if (i != -1) {
            vg1Var.n(i, vg1Var.q, cjVar.t);
        } else {
            vg1Var.n(vg1Var.t, vg1Var.a, cjVar.t);
        }
        int i2 = vg1Var.t;
        int i3 = vg1Var.a;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.y;
        int iW = xs2.w(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - cjVar.t.length(), 0, ((aq3) vg1Var.w).r());
        vg1Var.x(iW, iW);
    }

    public final int hashCode() {
        return (this.g.t.hashCode() * 31) + this.y;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.g.t + "', newCursorPosition=" + this.y + ")";
    }

    public rk0(cj cjVar, int i) {
        this.g = cjVar;
        this.y = i;
    }
}
