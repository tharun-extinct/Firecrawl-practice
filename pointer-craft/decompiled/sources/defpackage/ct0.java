package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ct0 extends o73 {
    public final xy1 g;

    public ct0(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct0) && ((ct0) obj).g == this.g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        dt0 dt0Var = (dt0) i73Var;
        xy1 xy1Var = dt0Var.k;
        xy1 xy1Var2 = this.g;
        if (xy1Var2 != xy1Var) {
            dt0Var.k = xy1Var2;
            dt0Var.R0();
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        dt0 dt0Var = new dt0();
        dt0Var.k = this.g;
        return dt0Var;
    }
}
