package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class lq4 extends o73 {
    public final float g;
    public final float n;
    public final float r;
    public final boolean v;
    public final float y;

    public lq4(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq4)) {
            return false;
        }
        lq4 lq4Var = (lq4) obj;
        return vb1.y(this.g, lq4Var.g) && vb1.y(this.y, lq4Var.y) && vb1.y(this.r, lq4Var.r) && vb1.y(this.n, lq4Var.n) && this.v == lq4Var.v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v) + fj.y(this.n, fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31), 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        qq4 qq4Var = (qq4) i73Var;
        qq4Var.o = this.g;
        qq4Var.f = this.y;
        qq4Var.k = this.r;
        qq4Var.d = this.n;
        qq4Var.e = this.v;
    }

    @Override // defpackage.o73
    public final i73 l() {
        qq4 qq4Var = new qq4();
        qq4Var.o = this.g;
        qq4Var.f = this.y;
        qq4Var.k = this.r;
        qq4Var.d = this.n;
        qq4Var.e = this.v;
        return qq4Var;
    }

    public lq4(float f, float f2, float f3, float f4, boolean z) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = z;
    }
}
