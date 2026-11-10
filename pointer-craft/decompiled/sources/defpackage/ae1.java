package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ae1 extends o73 {
    public final xy1 g;

    public ae1(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae1) {
            return this.g == ((ae1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ia0 ia0Var = (ia0) i73Var;
        ia0Var.k = this.g;
        ia0Var.Q0();
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new ia0(new ja0(), this.g);
    }
}
