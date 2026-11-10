package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sv4 implements so4 {
    public final long j;
    public final long t;

    public sv4(long j, long j2) {
        this.j = j;
        this.t = j2;
        if (j < 0) {
            t94.x("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        t94.x("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sv4)) {
            return false;
        }
        sv4 sv4Var = (sv4) obj;
        return this.j == sv4Var.j && this.t == sv4Var.t;
    }

    @Override // defpackage.so4
    public final er1 g(uy4 uy4Var) {
        rv4 rv4Var = new rv4(this, null);
        int i = fs1.g;
        return og0.z(new vr1(new id0(rv4Var, uy4Var, ni1.j, -2, f70.j), new b01(2, null, (byte) 3), (byte) 1));
    }

    public final int hashCode() {
        return Long.hashCode(this.t) + (Long.hashCode(this.j) * 31);
    }

    public final String toString() {
        uv2 uv2Var = new uv2(2);
        long j = this.j;
        if (j > 0) {
            uv2Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.t;
        if (j2 < Long.MAX_VALUE) {
            uv2Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + cj0.q0(pw5.a(uv2Var), null, null, null, null, 63) + ')';
    }
}
