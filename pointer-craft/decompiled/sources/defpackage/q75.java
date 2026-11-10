package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q75 {
    public final ku1 g;
    public final q70 n = new q70((byte) 10);
    public final fl2 r;
    public final j51 y;

    public q75(ku1 ku1Var, j51 j51Var, fl2 fl2Var) {
        this.g = ku1Var;
        this.y = j51Var;
        this.r = fl2Var;
    }

    public static j75 g(q75 q75Var, cj cjVar, k85 k85Var, long j, int i) {
        j75 j75Var;
        long jY = (i & 64) != 0 ? zs0.y(0, 0, 0, 0, 15) : j;
        fl2 fl2Var = q75Var.r;
        j51 j51Var = q75Var.y;
        ku1 ku1Var = q75Var.g;
        q70 q70Var = q75Var.n;
        pi1 pi1Var = pi1.j;
        i75 i75Var = new i75(cjVar, k85Var, pi1Var, Integer.MAX_VALUE, true, 1, j51Var, fl2Var, ku1Var, jY);
        long j2 = jY;
        j75 j75Var2 = null;
        if (q70Var != null) {
            ka0 ka0Var = new ka0(i75Var);
            kz2 kz2Var = (kz2) q70Var.t;
            if (kz2Var != null) {
                j75Var = (j75) kz2Var.r(ka0Var);
            } else if (yf2.p((ka0) q70Var.a, ka0Var)) {
                j75Var = (j75) q70Var.m;
            }
            if (j75Var != null && !j75Var.y.g.y()) {
                j75Var2 = j75Var;
            }
        }
        if (j75Var2 != null) {
            h93 h93Var = j75Var2.y;
            return new j75(i75Var, h93Var, zs0.n(j2, (((long) ((int) Math.ceil(h93Var.v))) & 4294967295L) | (((long) ((int) Math.ceil(h93Var.n))) << 32)));
        }
        rv rvVar = new rv(cjVar, j51Var, ku1Var, v13.D(k85Var, fl2Var), pi1Var, true);
        int iM = ws0.m(j2);
        int iT = ws0.v(j2) ? ws0.t(j2) : Integer.MAX_VALUE;
        if (iM != iT) {
            iT = xs2.w((int) Math.ceil(rvVar.r()), iM, iT);
        }
        h93 h93Var2 = new h93(rvVar, y94.A(0, iT, 0, ws0.j(j2)), Integer.MAX_VALUE, 1);
        j75 j75Var3 = new j75(i75Var, h93Var2, zs0.n(j2, (((long) ((int) Math.ceil(h93Var2.v))) & 4294967295L) | (((long) ((int) Math.ceil(h93Var2.n))) << 32)));
        if (q70Var != null) {
            kz2 kz2Var2 = (kz2) q70Var.t;
            if (kz2Var2 != null) {
                kz2Var2.n(new ka0(i75Var), j75Var3);
                return j75Var3;
            }
            q70Var.a = new ka0(i75Var);
            q70Var.m = j75Var3;
        }
        return j75Var3;
    }
}
