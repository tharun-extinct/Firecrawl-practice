package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class r5 extends o73 {
    public final jp4 g;

    public r5(jp4 jp4Var) {
        this.g = jp4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r5) {
            return this.g == ((r5) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((s5) i73Var).k = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        s5 s5Var = new s5();
        s5Var.k = this.g;
        h hVar = new h(s5Var, (byte) 2);
        q5 q5Var = new q5();
        q5Var.o = hVar;
        s5Var.Q0(q5Var);
        return s5Var;
    }
}
