package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class yi3 extends o73 {
    public final float g;

    public yi3(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        yi3 yi3Var = obj instanceof yi3 ? (yi3) obj : null;
        return yi3Var != null && vb1.y(this.g, yi3Var.g) && vb1.y(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fj.y(0.0f, Float.hashCode(this.g) * 31, 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        bj3 bj3Var = (bj3) i73Var;
        float f = bj3Var.o;
        float f2 = this.g;
        if (!vb1.y(f, f2) || !vb1.y(0.0f, 0.0f) || !bj3Var.f) {
            k33.V(bj3Var).W(false);
        }
        bj3Var.o = f2;
        bj3Var.f = true;
    }

    @Override // defpackage.o73
    public final i73 l() {
        bj3 bj3Var = new bj3();
        bj3Var.o = this.g;
        bj3Var.f = true;
        return bj3Var;
    }

    public final String toString() {
        return xi3.a("OffsetModifierElement(x=", vb1.r(this.g), ", y=", vb1.r(0.0f), ", rtlAware=true)");
    }
}
