package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class lw extends o73 {
    public final long g;
    public final cn4 y;

    public lw(long j, cn4 cn4Var) {
        this.g = j;
        this.y = cn4Var;
    }

    public final boolean equals(Object obj) {
        lw lwVar = obj instanceof lw ? (lw) obj : null;
        if (lwVar == null) {
            return false;
        }
        long j = lwVar.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && yf2.p(this.y, lwVar.y);
    }

    public final int hashCode() {
        int i = jj0.t;
        return this.y.hashCode() + fj.y(1.0f, Long.hashCode(this.g) * 961, 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        pw pwVar = (pw) i73Var;
        pwVar.o = this.g;
        cn4 cn4Var = pwVar.f;
        cn4 cn4Var2 = this.y;
        if (!yf2.p(cn4Var, cn4Var2)) {
            pwVar.f = cn4Var2;
            br2.d(pwVar);
        }
        c93.A(pwVar);
    }

    @Override // defpackage.o73
    public final i73 l() {
        pw pwVar = new pw();
        pwVar.o = this.g;
        pwVar.f = this.y;
        pwVar.k = 9205357640488583168L;
        return pwVar;
    }
}
