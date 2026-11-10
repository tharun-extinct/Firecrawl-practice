package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xp3 extends o73 {
    public final q2 g;

    public xp3(q2 q2Var) {
        this.g = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xp3) {
            return this.g == ((xp3) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        wp3 wp3Var = (wp3) i73Var;
        wp3Var.o = this.g;
        br2.d(wp3Var);
    }

    @Override // defpackage.o73
    public final i73 l() {
        wp3 wp3Var = new wp3();
        wp3Var.o = this.g;
        return wp3Var;
    }
}
