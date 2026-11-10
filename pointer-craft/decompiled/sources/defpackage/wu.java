package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wu {
    public final String g;
    public final String l;
    public final String n;
    public final String r;
    public final long v;
    public final long x;
    public final int y;

    static {
        g().g();
    }

    public wu(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.g = str;
        this.y = i;
        this.r = str2;
        this.n = str3;
        this.v = j;
        this.x = j2;
        this.l = str4;
    }

    public static vu g() {
        vu vuVar = new vu();
        vuVar.j(0L);
        vuVar.y = 1;
        vuVar.r(0L);
        return vuVar;
    }

    public final boolean a() {
        int i = this.y;
        return i == 2 || i == 1;
    }

    public final wu b() {
        vu vuVarC = c();
        vuVarC.l = "BAD CONFIG";
        vuVarC.y = 5;
        return vuVarC.g();
    }

    public final vu c() {
        vu vuVar = new vu();
        vuVar.g = this.g;
        vuVar.y = this.y;
        vuVar.r = this.r;
        vuVar.n = this.n;
        vuVar.v = this.v;
        vuVar.x = this.x;
        vuVar.l = this.l;
        vuVar.j = (byte) 3;
        return vuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wu)) {
            return false;
        }
        wu wuVar = (wu) obj;
        String str = wuVar.g;
        String str2 = this.g;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!du4.g(this.y, wuVar.y)) {
            return false;
        }
        String str3 = wuVar.r;
        String str4 = this.r;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = wuVar.n;
        String str6 = this.n;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.v != wuVar.v || this.x != wuVar.x) {
            return false;
        }
        String str7 = wuVar.l;
        String str8 = this.l;
        if (str8 == null) {
            return str7 == null;
        }
        return str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ du4.D(this.y)) * 1000003;
        String str2 = this.r;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.n;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.v;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.x;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.l;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final wu i(long j, long j2, String str) {
        vu vuVarC = c();
        vuVarC.r = str;
        vuVarC.r(j);
        vuVarC.j(j2);
        return vuVarC.g();
    }

    public final long j() {
        return this.x;
    }

    public final int l() {
        return this.y;
    }

    public final boolean m() {
        return this.y == 4;
    }

    public final String n() {
        return this.g;
    }

    public final wu p(String str, String str2, long j, String str3, long j2) {
        vu vuVarC = c();
        vuVarC.g = str;
        vuVarC.y = 4;
        vuVarC.r = str3;
        vuVarC.n = str2;
        vuVarC.r(j2);
        vuVarC.j(j);
        return vuVarC.g();
    }

    public final boolean q() {
        return this.y == 3;
    }

    public final long r() {
        return this.v;
    }

    public final wu s() {
        vu vuVarC = c();
        vuVarC.y = 2;
        return vuVarC.g();
    }

    public final boolean t() {
        return this.y == 5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.g);
        sb.append(", registrationStatus=");
        int i = this.y;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.r);
        sb.append(", refreshToken=");
        sb.append(this.n);
        sb.append(", expiresInSecs=");
        sb.append(this.v);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.x);
        sb.append(", fisError=");
        return du4.b(sb, this.l, "}");
    }

    public final wu u(String str) {
        vu vuVarC = c();
        vuVarC.g = str;
        vuVarC.y = 3;
        return vuVarC.g();
    }

    public final String v() {
        return this.l;
    }

    public final boolean w() {
        return this.y == 1;
    }

    public final String x() {
        return this.n;
    }

    public final String y() {
        return this.r;
    }
}
