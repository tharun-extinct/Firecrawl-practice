package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class r72 extends o73 {
    public final ja3 g;

    public r72(ja3 ja3Var) {
        this.g = ja3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r72) && yf2.p(((r72) obj).g, this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() * 31;
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        v72 v72Var = (v72) i73Var;
        ja3 ja3Var = v72Var.o;
        ja3 ja3Var2 = this.g;
        if (yf2.p(ja3Var, ja3Var2)) {
            return;
        }
        v72Var.S0();
        v72Var.o = ja3Var2;
    }

    @Override // defpackage.o73
    public final i73 l() {
        v72 v72Var = new v72();
        v72Var.o = this.g;
        return v72Var;
    }
}
