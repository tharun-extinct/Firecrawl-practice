package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ou {
    public final String g;
    public final long r;
    public final long y;

    public ou(long j, long j2, String str) {
        this.g = str;
        this.y = j;
        this.r = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ou) {
            ou ouVar = (ou) obj;
            if (this.g.equals(ouVar.g) && this.y == ouVar.y && this.r == ouVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() ^ 1000003) * 1000003;
        long j = this.y;
        long j2 = this.r;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.g + ", tokenExpirationTimestamp=" + this.y + ", tokenCreationTimestamp=" + this.r + "}";
    }
}
