package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nu {
    public final String g;
    public final bv n;
    public final String r;
    public final int v;
    public final String y;

    public nu(String str, String str2, String str3, bv bvVar, int i) {
        this.g = str;
        this.y = str2;
        this.r = str3;
        this.n = bvVar;
        this.v = i;
    }

    public static mu g() {
        return new mu();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        String str = nuVar.g;
        String str2 = this.g;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = nuVar.y;
        String str4 = this.y;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = nuVar.r;
        String str6 = this.r;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        bv bvVar = nuVar.n;
        bv bvVar2 = this.n;
        if (bvVar2 == null) {
            if (bvVar != null) {
                return false;
            }
        } else if (!bvVar2.equals(bvVar)) {
            return false;
        }
        int i = nuVar.v;
        int i2 = this.v;
        if (i2 == 0) {
            return i == 0;
        }
        return du4.g(i2, i);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.y;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.r;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        bv bvVar = this.n;
        int iHashCode4 = (iHashCode3 ^ (bvVar == null ? 0 : bvVar.hashCode())) * 1000003;
        int i = this.v;
        return iHashCode4 ^ (i != 0 ? du4.D(i) : 0);
    }

    public final String n() {
        return this.r;
    }

    public final String r() {
        return this.y;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.g);
        sb.append(", fid=");
        sb.append(this.y);
        sb.append(", refreshToken=");
        sb.append(this.r);
        sb.append(", authToken=");
        sb.append(this.n);
        sb.append(", responseCode=");
        int i = this.v;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final int v() {
        return this.v;
    }

    public final bv y() {
        return this.n;
    }
}
