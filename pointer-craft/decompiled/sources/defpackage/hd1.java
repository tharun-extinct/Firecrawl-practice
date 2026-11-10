package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hd1<T> extends o73 {
    public final p8 g;
    public final bz1 y;

    public hd1(p8 p8Var, bz1 bz1Var) {
        this.g = p8Var;
        this.y = bz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1)) {
            return false;
        }
        hd1 hd1Var = (hd1) obj;
        return yf2.p(this.g, hd1Var.g) && this.y == hd1Var.y;
    }

    public final int hashCode() {
        return um3.j.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        id1 id1Var = (id1) i73Var;
        id1Var.o = this.g;
        id1Var.f = this.y;
        id1Var.k = um3.j;
    }

    @Override // defpackage.o73
    public final i73 l() {
        id1 id1Var = new id1();
        id1Var.o = this.g;
        id1Var.f = this.y;
        id1Var.k = um3.j;
        return id1Var;
    }
}
