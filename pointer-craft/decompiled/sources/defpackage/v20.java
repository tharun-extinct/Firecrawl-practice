package defpackage;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public static final String[] n;
    public static final String r = "premium_v1";
    public static final String[] v;
    public static final String[] x;
    public final w10 g;
    public final ew4 y;

    static {
        v54.g(v20.class).r();
        n = new String[]{"premium_v1"};
        v = new String[]{"premium_yearly"};
        x = new String[]{"donation"};
    }

    public v20(w10 w10Var, ox0 ox0Var) {
        w10Var.getClass();
        ox0Var.getClass();
        this.g = w10Var;
        this.y = y94.w(pi1.j);
        mu0 mu0Var = null;
        m50.T(ox0Var, null, new q20(this, mu0Var, (byte) 2), 3);
        m50.T(ox0Var, null, new q20(this, mu0Var, (byte) 1), 3);
        m50.T(ox0Var, null, new q20(this, mu0Var, (byte) 0), 3);
    }

    public final boolean g() {
        String str = r;
        w10 w10Var = this.g;
        return w10Var.c(str) || w10Var.c("premium_yearly");
    }

    public final void n(int i) {
        ew4 ew4Var;
        Object value;
        do {
            ew4Var = this.y;
            value = ew4Var.getValue();
        } while (!ew4Var.t(value, cj0.x0((List) value, new yh5(i, UUID.randomUUID().getMostSignificantBits()))));
    }

    public final id0 r() {
        byte b = 0;
        qs1 qs1Var = new qs1(y(r), y("premium_yearly"), new t20(3, null, b), b);
        u20 u20Var = new u20(3, null);
        int i = fs1.g;
        return new id0(u20Var, qs1Var, ni1.j, -2, f70.j);
    }

    public final j10 y(String str) {
        str.getClass();
        w10 w10Var = this.g;
        w10Var.getClass();
        Object obj = w10Var.h.get(str);
        obj.getClass();
        return new j10((ew4) obj, (byte) 1);
    }
}
