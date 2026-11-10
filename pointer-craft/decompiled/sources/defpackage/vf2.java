package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class vf2 extends o73 {
    public final tf2 g;

    public vf2(tf2 tf2Var) {
        this.g = tf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        vf2 vf2Var = obj instanceof vf2 ? (vf2) obj : null;
        return vf2Var != null && this.g == vf2Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        xf2 xf2Var = (xf2) i73Var;
        xf2Var.o = this.g;
        xf2Var.f = true;
    }

    @Override // defpackage.o73
    public final i73 l() {
        xf2 xf2Var = new xf2();
        xf2Var.o = this.g;
        xf2Var.f = true;
        return xf2Var;
    }
}
