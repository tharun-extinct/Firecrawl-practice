package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class be1 extends o73 {
    public final xy1 g;

    public be1(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be1) {
            return this.g == ((be1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((ce1) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        ce1 ce1Var = new ce1();
        ce1Var.o = this.g;
        return ce1Var;
    }
}
