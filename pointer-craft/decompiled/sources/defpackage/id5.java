package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class id5 extends o73 {
    public final pr2 g;

    public id5(pr2 pr2Var) {
        this.g = pr2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id5) && yf2.p(this.g, ((id5) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((jd5) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        jd5 jd5Var = new jd5();
        jd5Var.o = this.g;
        return jd5Var;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.g + ")";
    }
}
