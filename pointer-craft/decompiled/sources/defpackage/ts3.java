package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ts3 implements j51 {
    public boolean j;

    public static void a(ts3 ts3Var, us3 us3Var, long j) {
        ts3Var.x(us3Var);
        us3Var.l0(je2.n(j, us3Var.q), 0.0f, null);
    }

    public static void b(ts3 ts3Var, us3 us3Var, long j) {
        rn3 rn3Var = vs3.g;
        ts3Var.x(us3Var);
        us3Var.l0(je2.n(j, us3Var.q), 0.0f, rn3Var);
    }

    public static void c(ts3 ts3Var, us3 us3Var, long j) {
        rn3 rn3Var = vs3.g;
        if (ts3Var.r() == fl2.j || ts3Var.v() == 0) {
            ts3Var.x(us3Var);
            us3Var.l0(je2.n(j, us3Var.q), 0.0f, rn3Var);
        } else {
            int iV = (ts3Var.v() - us3Var.j) - ((int) (j >> 32));
            ts3Var.x(us3Var);
            us3Var.l0(je2.n((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iV) << 32), us3Var.q), 0.0f, rn3Var);
        }
    }

    public static void i(ts3 ts3Var, us3 us3Var, int i, int i2, xy1 xy1Var, int i3) {
        if ((i3 & 8) != 0) {
            xy1Var = vs3.g;
        }
        ts3Var.x(us3Var);
        us3Var.l0(je2.n((((long) i2) & 4294967295L) | (((long) i) << 32), us3Var.q), 0.0f, xy1Var);
    }

    public static void m(ts3 ts3Var, us3 us3Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (ts3Var.r() == fl2.j || ts3Var.v() == 0) {
            ts3Var.x(us3Var);
            us3Var.l0(je2.n(j, us3Var.q), 0.0f, null);
        } else {
            int iV = (ts3Var.v() - us3Var.j) - ((int) (j >> 32));
            ts3Var.x(us3Var);
            us3Var.l0(je2.n((((long) iV) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), us3Var.q), 0.0f, null);
        }
    }

    public static void q(ts3 ts3Var, us3 us3Var, int i, int i2) {
        rn3 rn3Var = vs3.g;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (ts3Var.r() == fl2.j || ts3Var.v() == 0) {
            ts3Var.x(us3Var);
            us3Var.l0(je2.n(j, us3Var.q), 0.0f, rn3Var);
        } else {
            int iV = (ts3Var.v() - us3Var.j) - ((int) (j >> 32));
            ts3Var.x(us3Var);
            us3Var.l0(je2.n((((long) iV) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), us3Var.q), 0.0f, rn3Var);
        }
    }

    public float g(i72 i72Var) {
        return Float.NaN;
    }

    public final void j(us3 us3Var, int i, int i2, float f) {
        x(us3Var);
        us3Var.l0(je2.n((((long) i2) & 4294967295L) | (((long) i) << 32), us3Var.q), f, null);
    }

    public abstract fl2 r();

    public abstract int v();

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(us3 us3Var) {
        if (us3Var instanceof d83) {
            ((d83) us3Var).q(this.j);
        }
    }
}
