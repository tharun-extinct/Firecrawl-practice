package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uu {
    public final long g;
    public final ju r;
    public final cv y;

    public uu(long j, cv cvVar, ju juVar) {
        this.g = j;
        this.y = cvVar;
        this.r = juVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return this.g == uuVar.g && this.y.equals(uuVar.y) && this.r.equals(uuVar.r);
    }

    public final int hashCode() {
        long j = this.g;
        return this.r.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.y.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.g + ", transportContext=" + this.y + ", event=" + this.r + "}";
    }
}
