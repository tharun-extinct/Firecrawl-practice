package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq1 implements gq1 {
    public final int g;
    public final long n;
    public final long r;
    public final cg1 y;

    public mq1(int i, int i2, cg1 cg1Var) {
        this.g = i;
        this.y = cg1Var;
        this.r = ((long) i) * 1000000;
        this.n = ((long) i2) * 1000000;
    }

    @Override // defpackage.gq1
    public final long n(float f, float f2, float f3) {
        return this.n + this.r;
    }

    @Override // defpackage.gq1
    public final float r(long j, float f, float f2, float f3) {
        long j2 = j - this.n;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.r;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (y(j4, f, f2, f3) - y(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.gq1
    public final float y(long j, float f, float f2, float f3) {
        long j2 = j - this.n;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.r;
        if (j2 > j3) {
            j2 = j3;
        }
        float fG = this.y.g(this.g == 0 ? 1.0f : j2 / j3);
        return (f2 * fG) + ((1.0f - fG) * f);
    }
}
