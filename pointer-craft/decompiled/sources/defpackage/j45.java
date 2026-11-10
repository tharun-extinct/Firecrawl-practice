package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class j45 extends o73 {
    public final rk4 g;
    public final pw0 n;
    public final v55 r;
    public final u55 y;

    public j45(rk4 rk4Var, u55 u55Var, v55 v55Var, pw0 pw0Var) {
        this.g = rk4Var;
        this.y = u55Var;
        this.r = v55Var;
        this.n = pw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j45)) {
            return false;
        }
        j45 j45Var = (j45) obj;
        return this.g == j45Var.g && this.y == j45Var.y && this.r == j45Var.r && this.n == j45Var.n;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        k45 k45Var = (k45) i73Var;
        k45Var.k.t = null;
        rk4 rk4Var = this.g;
        k45Var.k = rk4Var;
        rk4Var.t = k45Var;
        rk4Var.a = k45Var.h ? ma5.a : ma5.t;
        k45Var.d = this.y;
        k45Var.e = this.r;
        k45Var.A = this.n;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new k45(this.g, this.y, this.r, this.n);
    }
}
