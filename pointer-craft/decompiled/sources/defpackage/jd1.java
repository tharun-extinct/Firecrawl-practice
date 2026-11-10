package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jd1 extends o73 {
    public static final wm0 t = new wm0((byte) 21);
    public final qd1 g;
    public final boolean j;
    public final cz1 l;
    public final ja3 n;
    public final boolean r;
    public final boolean v;
    public final cz1 x;
    public final um3 y;

    public jd1(qd1 qd1Var, um3 um3Var, boolean z, ja3 ja3Var, boolean z2, md1 md1Var, cz1 cz1Var, boolean z3) {
        this.g = qd1Var;
        this.y = um3Var;
        this.r = z;
        this.n = ja3Var;
        this.v = z2;
        this.x = md1Var;
        this.l = cz1Var;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jd1.class != obj.getClass()) {
            return false;
        }
        jd1 jd1Var = (jd1) obj;
        return yf2.p(this.g, jd1Var.g) && this.y == jd1Var.y && this.r == jd1Var.r && yf2.p(this.n, jd1Var.n) && this.v == jd1Var.v && yf2.p(this.x, jd1Var.x) && yf2.p(this.l, jd1Var.l) && this.j == jd1Var.j;
    }

    public final int hashCode() {
        int iL = xi3.l((this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31, this.r);
        ja3 ja3Var = this.n;
        return Boolean.hashCode(this.j) + ((this.l.hashCode() + ((this.x.hashCode() + xi3.l((iL + (ja3Var != null ? ja3Var.hashCode() : 0)) * 31, 31, this.v)) * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        boolean z;
        boolean z2;
        pd1 pd1Var = (pd1) i73Var;
        qd1 qd1Var = pd1Var.Q;
        qd1 qd1Var2 = this.g;
        if (yf2.p(qd1Var, qd1Var2)) {
            z = false;
        } else {
            pd1Var.Q = qd1Var2;
            z = true;
        }
        boolean z3 = pd1Var.U;
        boolean z4 = this.j;
        if (z3 != z4) {
            pd1Var.U = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        pd1Var.S = this.x;
        pd1Var.T = this.l;
        pd1Var.R = this.v;
        pd1Var.k1(t, this.r, this.n, this.y, z2);
    }

    @Override // defpackage.o73
    public final i73 l() {
        pd1 pd1Var = new pd1(t, this.r, this.n, this.y);
        pd1Var.Q = this.g;
        pd1Var.R = this.v;
        pd1Var.S = this.x;
        pd1Var.T = this.l;
        pd1Var.U = this.j;
        return pd1Var;
    }
}
