package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eu {
    public final int g;
    public final long y;

    public eu(int i, long j) {
        if (i == 0) {
            l0.q("Null status");
            throw null;
        }
        this.g = i;
        this.y = j;
    }

    public static eu g() {
        return new eu(3, -1L);
    }

    public static eu n() {
        return new eu(4, -1L);
    }

    public static eu v(long j) {
        return new eu(1, j);
    }

    public static eu x() {
        return new eu(2, -1L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        return du4.g(this.g, euVar.g) && this.y == euVar.y;
    }

    public final int hashCode() {
        int iD = (du4.D(this.g) ^ 1000003) * 1000003;
        long j = this.y;
        return ((int) ((j >>> 32) ^ j)) ^ iD;
    }

    public final int r() {
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.g;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.y);
        sb.append("}");
        return sb.toString();
    }

    public final long y() {
        return this.y;
    }
}
