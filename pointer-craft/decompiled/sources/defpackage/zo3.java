package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zo3 {
    public static final yo3 g;
    public static final mo3 y;

    static {
        yo3 yo3Var = new yo3((byte) 0);
        g = yo3Var;
        y = new mo3(0, 0, 0, 0, 0, 0, d52.w, new ts2((byte) 1), k33.x(ni1.j), yo3Var, zs0.y(0, 0, 0, 0, 15));
    }

    public static final long g(mo3 mo3Var, int i) {
        int i2 = mo3Var.r;
        long j = (((((long) i) * ((long) (mo3Var.y + i2))) + ((long) (-mo3Var.x))) + ((long) mo3Var.n)) - ((long) i2);
        int iT = (int) (mo3Var.v == um3.t ? mo3Var.t() >> 32 : mo3Var.t() & 4294967295L);
        mo3Var.c.getClass();
        long jW = j - ((long) (iT - xs2.w(0, 0, iT)));
        if (jW < 0) {
            return 0L;
        }
        return jW;
    }
}
