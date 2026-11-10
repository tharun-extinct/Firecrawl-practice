package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fm1 extends o73 {
    public final ef g;

    public fm1(ef efVar) {
        this.g = efVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fm1) {
            return this.g == ((fm1) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((gm1) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        gm1 gm1Var = new gm1();
        gm1Var.o = this.g;
        return gm1Var;
    }
}
