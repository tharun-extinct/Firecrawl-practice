package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class wn3 extends o73 {
    public final float g;
    public final float n;
    public final float r;
    public final float y;

    public wn3(float f, float f2, float f3, float f4) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            kc2.g("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        wn3 wn3Var = obj instanceof wn3 ? (wn3) obj : null;
        return wn3Var != null && vb1.y(this.g, wn3Var.g) && vb1.y(this.y, wn3Var.y) && vb1.y(this.r, wn3Var.r) && vb1.y(this.n, wn3Var.n);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fj.y(this.n, fj.y(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31), 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        yn3 yn3Var = (yn3) i73Var;
        yn3Var.o = this.g;
        yn3Var.f = this.y;
        yn3Var.k = this.r;
        yn3Var.d = this.n;
        yn3Var.e = true;
    }

    @Override // defpackage.o73
    public final i73 l() {
        yn3 yn3Var = new yn3();
        yn3Var.o = this.g;
        yn3Var.f = this.y;
        yn3Var.k = this.r;
        yn3Var.d = this.n;
        yn3Var.e = true;
        return yn3Var;
    }
}
