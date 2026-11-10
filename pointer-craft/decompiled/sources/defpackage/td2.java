package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class td2 extends o73 {
    public final qo5 g;

    public td2(qo5 qo5Var) {
        this.g = qo5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof td2) {
            return yf2.p(((td2) obj).g, this.g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        vd2 vd2Var = (vd2) i73Var;
        qo5 qo5Var = vd2Var.k;
        qo5 qo5Var2 = this.g;
        if (yf2.p(qo5Var2, qo5Var)) {
            return;
        }
        vd2Var.k = qo5Var2;
        vd2Var.R0();
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new vd2(this.g);
    }
}
