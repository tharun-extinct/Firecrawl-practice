package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class us3 {
    public int j;
    public int t;
    public long a = 0;
    public long m = vs3.y;
    public long q = 0;

    public Object a() {
        return null;
    }

    public int c0(v6 v6Var) {
        return Integer.MIN_VALUE;
    }

    public int d0() {
        return (int) (this.a & 4294967295L);
    }

    public int g0() {
        return (int) (this.a >> 32);
    }

    public final void i0() {
        this.j = xs2.w((int) (this.a >> 32), ws0.m(this.m), ws0.t(this.m));
        int iW = xs2.w((int) (this.a & 4294967295L), ws0.a(this.m), ws0.j(this.m));
        this.t = iW;
        int i = this.j;
        long j = this.a;
        this.q = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iW - ((int) (j & 4294967295L))) / 2)));
    }

    public void m0(long j, float f, x32 x32Var) {
        l0(j, f, null);
    }

    public final void o0(long j) {
        if (qe2.g(this.a, j)) {
            return;
        }
        this.a = j;
        i0();
    }

    public final void p0(long j) {
        if (ws0.r(this.m, j)) {
            return;
        }
        this.m = j;
        i0();
    }

    public void l0(long j, float f, xy1 xy1Var) {
    }
}
