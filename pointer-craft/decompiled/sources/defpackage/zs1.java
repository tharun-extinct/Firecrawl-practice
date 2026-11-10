package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class zs1 extends o73 {
    public final xy1 g;

    public zs1(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zs1) {
            return this.g == ((zs1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((at1) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        at1 at1Var = new at1();
        at1Var.o = this.g;
        return at1Var;
    }
}
