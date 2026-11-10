package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class sa1 extends o73 {
    public final uq2 g;

    public sa1(uq2 uq2Var) {
        this.g = uq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa1) && yf2.p(this.g, ((sa1) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ta1 ta1Var = (ta1) i73Var;
        uq2 uq2Var = ta1Var.o;
        uq2 uq2Var2 = this.g;
        if (yf2.p(uq2Var, uq2Var2) || !ta1Var.j.h) {
            return;
        }
        uq2 uq2Var3 = ta1Var.o;
        uq2Var3.n();
        uq2Var3.y = null;
        uq2Var3.r = -1;
        uq2Var2.a = ta1Var;
        ta1Var.o = uq2Var2;
    }

    @Override // defpackage.o73
    public final i73 l() {
        ta1 ta1Var = new ta1();
        ta1Var.o = this.g;
        return ta1Var;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.g + ")";
    }
}
