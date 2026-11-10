package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e95 {
    public final ha3 g;
    public float[] l;
    public long n;
    public long r;
    public long v;
    public long x;
    public d95 y;

    public e95() {
        ha3 ha3Var = ie2.g;
        this.g = new ha3();
        this.r = -1L;
        this.n = 0L;
        this.v = 0L;
    }

    public final void g(d95 d95Var, long j, long j2, float[] fArr, long j3) {
        long j4 = d95Var.l;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            d95Var.l = j3;
            d95Var.g(d95Var.v, d95Var.x, j, j2, fArr);
        }
    }

    public final boolean y(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (je2.y(j2, this.n)) {
            z = false;
        } else {
            this.n = j2;
            z = true;
        }
        if (!je2.y(j, this.v)) {
            this.v = j;
            z = true;
        }
        if (fArr != null) {
            this.l = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.x) {
            return z;
        }
        this.x = j3;
        return true;
    }
}
