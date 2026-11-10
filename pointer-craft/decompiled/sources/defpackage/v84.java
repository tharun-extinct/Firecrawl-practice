package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v84 implements x84 {
    public final long g;

    public v84(long j) {
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v84) && this.g == ((v84) obj).g;
    }

    public final long g() {
        return this.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return "Restart(delayMs=" + this.g + ")";
    }
}
