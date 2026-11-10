package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ey4 extends o73 {
    public final my1 g;

    public ey4(my1 my1Var) {
        this.g = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ey4) {
            return this.g == ((ey4) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((fy4) i73Var).k = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new fy4(this.g);
    }
}
