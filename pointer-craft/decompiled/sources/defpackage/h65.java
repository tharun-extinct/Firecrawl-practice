package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class h65 extends o73 {
    public final k85 g;

    public h65(k85 k85Var) {
        this.g = k85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h65)) {
            return false;
        }
        return yf2.p(this.g, ((h65) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        i65 i65Var = (i65) i73Var;
        i65Var.getClass();
        k85 k85VarD = v13.D(this.g, k33.V(i65Var).G);
        i65Var.Q0(k85VarD, (ku1) v70.b(i65Var, hp0.m));
        g65 g65Var = i65Var.k;
        if (g65Var != null) {
            g65.g(g65Var, null, null, k85VarD, 23);
            c93.B(i65Var);
        } else {
            pc2.y("Min size state is not set.");
            up.q();
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new i65(this.g);
    }
}
