package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class i7<T> extends o73 {
    public final q8 g;
    public final Boolean n;
    public final boolean r;
    public final um3 y;

    public i7(q8 q8Var, um3 um3Var, boolean z, Boolean bool) {
        this.g = q8Var;
        this.y = um3Var;
        this.r = z;
        this.n = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return yf2.p(this.g, i7Var.g) && this.y == i7Var.y && this.r == i7Var.r && yf2.p(this.n, i7Var.n);
    }

    public final int hashCode() {
        int iL = xi3.l((this.y.hashCode() + (this.g.hashCode() * 31)) * 31, 31, this.r);
        Boolean bool = this.n;
        return (iL + (bool != null ? bool.hashCode() : 0)) * 923521;
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        boolean z;
        boolean z2;
        c8 c8Var = (c8) i73Var;
        c8Var.getClass();
        q8 q8Var = c8Var.Q;
        q8 q8Var2 = this.g;
        if (yf2.p(q8Var, q8Var2)) {
            z = false;
        } else {
            c8Var.Q = q8Var2;
            c8Var.n1();
            z = true;
        }
        um3 um3Var = c8Var.k;
        um3 um3Var2 = this.y;
        if (um3Var != um3Var2) {
            c8Var.k = um3Var2;
            z = true;
        }
        Boolean bool = c8Var.R;
        Boolean bool2 = this.n;
        if (yf2.p(bool, bool2)) {
            z2 = z;
        } else {
            c8Var.R = bool2;
            z2 = true;
        }
        c8Var.k1(c8Var.d, this.r, null, um3Var2, z2);
    }

    @Override // defpackage.o73
    public final i73 l() {
        c8 c8Var = new c8(og0.g, this.r, null, this.y);
        c8Var.Q = this.g;
        c8Var.R = this.n;
        return c8Var;
    }
}
