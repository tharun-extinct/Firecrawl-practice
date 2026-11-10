package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class y35 extends o73 {
    public final t55 g;

    public y35(t55 t55Var) {
        this.g = t55Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y35) {
            return this.g == ((y35) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((a45) i73Var).k = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new a45(this.g);
    }
}
