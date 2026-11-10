package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pf2 extends o73 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf2 ? (pf2) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (tf2.j.hashCode() * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        qf2 qf2Var = (qf2) i73Var;
        qf2Var.o = tf2.j;
        qf2Var.f = true;
    }

    @Override // defpackage.o73
    public final i73 l() {
        qf2 qf2Var = new qf2();
        qf2Var.o = tf2.j;
        qf2Var.f = true;
        return qf2Var;
    }
}
