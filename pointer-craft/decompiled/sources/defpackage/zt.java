package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zt {
    public short g;
    public float j;
    public long l;
    public float n;
    public float r;
    public int t;
    public long v;
    public long x;
    public short y;

    public final float g(long j) {
        long j2 = this.v;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.l;
        if (j3 < 0 || j < j3) {
            return uw2.y((j - j2) / this.g, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.j;
        return (uw2.y((j - j3) / this.t, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
