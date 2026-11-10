package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class sd1 extends o73 {
    public final xy1 g;

    public sd1(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sd1) {
            return this.g == ((sd1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((rd1) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        rd1 rd1Var = new rd1();
        rd1Var.o = this.g;
        return rd1Var;
    }
}
