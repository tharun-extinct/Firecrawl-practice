package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ho1 extends o73 {
    public final da1 g;
    public final float y;

    public ho1(da1 da1Var, float f) {
        this.g = da1Var;
        this.y = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho1)) {
            return false;
        }
        ho1 ho1Var = (ho1) obj;
        return this.g == ho1Var.g && this.y == ho1Var.y;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        io1 io1Var = (io1) i73Var;
        io1Var.o = this.g;
        io1Var.f = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        io1 io1Var = new io1();
        io1Var.o = this.g;
        io1Var.f = this.y;
        return io1Var;
    }
}
