package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface xd1 extends j51 {
    static void B(xd1 xd1Var, long j, long j2, long j3, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        xd1Var.n0(j, j4, (i & 4) != 0 ? D0(xd1Var.n(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 64) != 0 ? 3 : 0);
    }

    static long D0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void F(xd1 xd1Var, long j, float f, long j2, yd1 yd1Var, int i) {
        if ((i & 4) != 0) {
            j2 = xd1Var.e0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            yd1Var = go1.g;
        }
        xd1Var.q0(j, f, j3, yd1Var);
    }

    static void G(xd1 xd1Var, long j, long j2, long j3, long j4, yd1 yd1Var, float f, int i) {
        xd1Var.k(j, (i & 2) != 0 ? 0L : j2, j3, j4, (i & 16) != 0 ? go1.g : yd1Var, (i & 32) != 0 ? 1.0f : f);
    }

    static void I(wm2 wm2Var, z60 z60Var, long j, long j2, long j3, yd1 yd1Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jD0 = (i & 4) != 0 ? D0(wm2Var.j.n(), j4) : j2;
        yd1 yd1Var2 = (i & 32) != 0 ? go1.g : yd1Var;
        pb0 pb0Var = wm2Var.j;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        pb0Var.j.r.a(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jD0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jD0 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), pb0Var.r(z60Var, yd1Var2, 1.0f, null, 3, 1));
    }

    static void O(wm2 wm2Var, nc ncVar, m30 m30Var) {
        pb0 pb0Var = wm2Var.j;
        pb0Var.j.r.g(ncVar, pb0Var.r(null, go1.g, 1.0f, m30Var, 3, 1));
    }

    static void S(xd1 xd1Var, long j, long j2, long j3, float f, int i, int i2) {
        xd1Var.a0(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i);
    }

    static void X(xd1 xd1Var, nc ncVar, long j, long j2, float f, m30 m30Var, int i, int i2) {
        xd1Var.T(ncVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, m30Var, (i2 & 512) != 0 ? 1 : i);
    }

    static void b0(wm2 wm2Var, z60 z60Var, long j, long j2, float f, yd1 yd1Var, int i) {
        long j3 = (i & 2) != 0 ? 0L : j;
        long jD0 = (i & 4) != 0 ? D0(wm2Var.j.n(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        yd1 yd1Var2 = (i & 16) != 0 ? go1.g : yd1Var;
        pb0 pb0Var = wm2Var.j;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        pb0Var.j.r.b(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jD0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jD0 & 4294967295L)) + Float.intBitsToFloat(i3), pb0Var.r(z60Var, yd1Var2, f2, null, 3, 1));
    }

    static void r0(xd1 xd1Var, ld ldVar, long j, yd1 yd1Var, int i) {
        if ((i & 8) != 0) {
            yd1Var = go1.g;
        }
        xd1Var.f0(ldVar, j, yd1Var);
    }

    static void z(xd1 xd1Var, ld ldVar, z60 z60Var, float f, by4 by4Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        yd1 yd1Var = by4Var;
        if ((i & 8) != 0) {
            yd1Var = go1.g;
        }
        xd1Var.l(ldVar, z60Var, f2, yd1Var, (i & 32) != 0 ? 3 : 0);
    }

    void C0(long j, float f, float f2, long j2, long j3, yd1 yd1Var);

    ro E();

    void T(nc ncVar, long j, long j2, long j3, float f, m30 m30Var, int i);

    void a0(long j, long j2, long j3, float f, int i);

    default long e0() {
        return mq2.v(E().G());
    }

    void f0(ld ldVar, long j, yd1 yd1Var);

    fl2 getLayoutDirection();

    void k(long j, long j2, long j3, long j4, yd1 yd1Var, float f);

    void l(ld ldVar, z60 z60Var, float f, yd1 yd1Var, int i);

    default long n() {
        return E().G();
    }

    void n0(long j, long j2, long j3, float f, int i);

    void q0(long j, float f, long j2, yd1 yd1Var);
}
