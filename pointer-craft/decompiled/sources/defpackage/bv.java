package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bv {
    public final String g;
    public final int r;
    public final long y;

    public bv(String str, long j, int i) {
        this.g = str;
        this.y = j;
        this.r = i;
    }

    public static av g() {
        av avVar = new av();
        avVar.n(0L);
        return avVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        String str = bvVar.g;
        String str2 = this.g;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.y != bvVar.y) {
            return false;
        }
        int i = bvVar.r;
        int i2 = this.r;
        if (i2 == 0) {
            return i == 0;
        }
        return du4.g(i2, i);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.y;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.r;
        return i ^ (i2 != 0 ? du4.D(i2) : 0);
    }

    public final long n() {
        return this.y;
    }

    public final String r() {
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.g);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.y);
        sb.append(", responseCode=");
        int i = this.r;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final int y() {
        return this.r;
    }
}
