package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y62 {
    public final long g;
    public final long n;
    public final float r;
    public final long v;
    public final long y;

    public y62(long j, long j2, float f, long j3, long j4) {
        this.g = j;
        this.y = j2;
        this.r = f;
        this.n = j3;
        this.v = j4;
    }

    public final long g() {
        return this.v;
    }

    public final float n() {
        return this.r;
    }

    public final long r() {
        return this.y;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.g + ", position=" + wi3.l(this.y) + ", scaleFactor=" + this.r + ", panOffset=" + wi3.l(this.n) + ")";
    }

    public final long v() {
        return this.g;
    }

    public final long y() {
        return this.n;
    }
}
