package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu {
    public final long g;
    public final long r;
    public final long y;

    public zu(long j, long j2, long j3) {
        this.g = j;
        this.y = j2;
        this.r = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zu) {
            zu zuVar = (zu) obj;
            if (this.g == zuVar.g && this.y == zuVar.y && this.r == zuVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.g;
        long j2 = this.y;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.r;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.g + ", elapsedRealtime=" + this.y + ", uptimeMillis=" + this.r + "}";
    }
}
