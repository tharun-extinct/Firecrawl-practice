package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ob2 {
    public final long g;
    public final boolean j;
    public final long l;
    public final boolean n;
    public final long r;
    public boolean t;
    public final float v;
    public final long x;
    public final long y;

    public ob2(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.g = j;
        this.y = j2;
        this.r = j3;
        this.n = z;
        this.v = f;
        this.x = j4;
        this.l = j5;
        this.j = z2;
    }

    public final void g() {
        this.t = true;
    }

    public final boolean n() {
        return this.j;
    }

    public final boolean r() {
        return this.n;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + zq2.D(this.g) + ", uptimeMillis=" + this.y + ", position=" + wi3.l(this.r) + ", pressed=" + this.n + ", pressure=" + this.v + ", previousUptimeMillis=" + this.x + ", previousPosition=" + wi3.l(this.l) + ", previousPressed=" + this.j + ", isConsumed=" + this.t + ")";
    }

    public final boolean v() {
        return this.t;
    }

    public final long y() {
        return this.r;
    }
}
