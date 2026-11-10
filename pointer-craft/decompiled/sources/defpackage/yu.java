package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yu {
    public final long g;
    public final Set r;
    public final long y;

    public yu(long j, long j2, Set set) {
        this.g = j;
        this.y = j2;
        this.r = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yu) {
            yu yuVar = (yu) obj;
            if (this.g == yuVar.g && this.y == yuVar.y && this.r.equals(yuVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.g;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.y;
        return this.r.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.g + ", maxAllowedDelay=" + this.y + ", flags=" + this.r + "}";
    }
}
