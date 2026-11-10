package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wt5 {
    public final String g;
    public final Long y;

    public wt5(String str, Long l) {
        this.g = str;
        this.y = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wt5) {
            wt5 wt5Var = (wt5) obj;
            if (this.g.equals(wt5Var.g)) {
                Long l = wt5Var.y;
                Long l2 = this.y;
                if (l2 != null ? l2.equals(l) : l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() ^ 1000003;
        Long l = this.y;
        return (l == null ? 0 : l.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.g + ", cloudProjectNumber=" + this.y + "}";
    }
}
