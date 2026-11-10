package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class h52 extends o73 {
    public final k85 g;
    public final int r;
    public final boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public h52(k85 k85Var, int i, int i2) {
        this.g = k85Var;
        this.y = i;
        this.r = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return yf2.p(this.g, h52Var.g) && this.y == h52Var.y && this.r == h52Var.r;
    }

    public final int hashCode() {
        return (((this.g.hashCode() * 31) + (this.y ? 1 : 0)) * 31) + this.r;
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        j52 j52Var = (j52) i73Var;
        k85 k85Var = j52Var.o;
        k85 k85Var2 = this.g;
        boolean zP = yf2.p(k85Var, k85Var2);
        boolean z = this.y;
        int i = this.r;
        if (zP && j52Var.f == z && j52Var.k == i) {
            return;
        }
        j52Var.o = k85Var2;
        j52Var.f = z;
        j52Var.k = i;
        j52Var.B = v13.D(k85Var2, k33.V(j52Var).G);
        j52Var.d = true;
        c93.B(j52Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        j52 j52Var = new j52();
        j52Var.o = this.g;
        j52Var.f = this.y;
        j52Var.k = this.r;
        j52Var.e = -1;
        j52Var.A = -1;
        return j52Var;
    }
}
