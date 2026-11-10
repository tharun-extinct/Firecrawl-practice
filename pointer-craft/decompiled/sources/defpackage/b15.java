package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class b15 extends o73 {
    public final xy1 g;

    public b15(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b15) {
            return this.g == ((b15) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        c15 c15Var = (c15) i73Var;
        xy1 xy1Var = c15Var.d;
        xy1 xy1Var2 = this.g;
        if (xy1Var != xy1Var2) {
            c15Var.d = xy1Var2;
            yp5 yp5Var = c15Var.e;
            if (yp5Var != null) {
                qo5 qo5Var = (qo5) xy1Var2.a(yp5Var);
                if (yf2.p(qo5Var, c15Var.k)) {
                    return;
                }
                c15Var.k = qo5Var;
                c15Var.R0();
            }
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        c15 c15Var = new c15(a11.D);
        c15Var.d = this.g;
        return c15Var;
    }
}
