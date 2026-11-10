package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class kh5 extends o73 {
    public final float g;
    public final float y;

    public kh5(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kh5)) {
            return false;
        }
        kh5 kh5Var = (kh5) obj;
        return vb1.y(this.g, kh5Var.g) && vb1.y(this.y, kh5Var.y);
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.g) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        lh5 lh5Var = (lh5) i73Var;
        lh5Var.o = this.g;
        lh5Var.f = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        lh5 lh5Var = new lh5();
        lh5Var.o = this.g;
        lh5Var.f = this.y;
        return lh5Var;
    }
}
