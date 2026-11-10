package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class os5 extends o73 {
    public final float g;
    public final Object y;

    public os5(Object obj, float f) {
        this.g = f;
        this.y = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof os5)) {
            return false;
        }
        os5 os5Var = (os5) obj;
        return os5Var.g == this.g && yf2.p(os5Var.y, this.y);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.g) * 31;
        Object obj = this.y;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ps5 ps5Var = (ps5) i73Var;
        ps5Var.o = this.g;
        ps5Var.f = this.y;
    }

    @Override // defpackage.o73
    public final i73 l() {
        ps5 ps5Var = new ps5();
        ps5Var.o = this.g;
        ps5Var.f = this.y;
        return ps5Var;
    }
}
