package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bm2 extends o73 {
    public final Object g;

    public bm2(Object obj) {
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm2) && this.g.equals(((bm2) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((cm2) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        cm2 cm2Var = new cm2();
        cm2Var.o = this.g;
        return cm2Var;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.g + ")";
    }
}
