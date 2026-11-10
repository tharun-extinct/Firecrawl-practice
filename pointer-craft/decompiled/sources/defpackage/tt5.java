package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tt5 {
    public final long g;

    public tt5(long j) {
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof tt5) && this.g == ((tt5) obj).g;
    }

    public final int hashCode() {
        long j = this.g;
        return (-724379968) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.g + "}";
    }
}
