package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu extends f9 {
    public final String a;
    public final Integer g;
    public final String j;
    public final String l;
    public final String m;
    public final String n;
    public final String q;
    public final String r;
    public final String t;
    public final String v;
    public final String x;
    public final String y;

    public cu(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.g = num;
        this.y = str;
        this.r = str2;
        this.n = str3;
        this.v = str4;
        this.x = str5;
        this.l = str6;
        this.j = str7;
        this.t = str8;
        this.a = str9;
        this.m = str10;
        this.q = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f9) {
            f9 f9Var = (f9) obj;
            Integer num = this.g;
            if (num != null ? num.equals(((cu) f9Var).g) : ((cu) f9Var).g == null) {
                String str = this.y;
                if (str != null ? str.equals(((cu) f9Var).y) : ((cu) f9Var).y == null) {
                    String str2 = this.r;
                    if (str2 != null ? str2.equals(((cu) f9Var).r) : ((cu) f9Var).r == null) {
                        String str3 = this.n;
                        if (str3 != null ? str3.equals(((cu) f9Var).n) : ((cu) f9Var).n == null) {
                            String str4 = this.v;
                            if (str4 != null ? str4.equals(((cu) f9Var).v) : ((cu) f9Var).v == null) {
                                String str5 = this.x;
                                if (str5 != null ? str5.equals(((cu) f9Var).x) : ((cu) f9Var).x == null) {
                                    String str6 = this.l;
                                    if (str6 != null ? str6.equals(((cu) f9Var).l) : ((cu) f9Var).l == null) {
                                        String str7 = this.j;
                                        if (str7 != null ? str7.equals(((cu) f9Var).j) : ((cu) f9Var).j == null) {
                                            String str8 = this.t;
                                            if (str8 != null ? str8.equals(((cu) f9Var).t) : ((cu) f9Var).t == null) {
                                                String str9 = this.a;
                                                if (str9 != null ? str9.equals(((cu) f9Var).a) : ((cu) f9Var).a == null) {
                                                    String str10 = this.m;
                                                    if (str10 != null ? str10.equals(((cu) f9Var).m) : ((cu) f9Var).m == null) {
                                                        String str11 = this.q;
                                                        if (str11 != null ? str11.equals(((cu) f9Var).q) : ((cu) f9Var).q == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.g;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.y;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.r;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.n;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.v;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.x;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.l;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.j;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.t;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.a;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.m;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.q;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.g);
        sb.append(", model=");
        sb.append(this.y);
        sb.append(", hardware=");
        sb.append(this.r);
        sb.append(", device=");
        sb.append(this.n);
        sb.append(", product=");
        sb.append(this.v);
        sb.append(", osBuild=");
        sb.append(this.x);
        sb.append(", manufacturer=");
        sb.append(this.l);
        sb.append(", fingerprint=");
        sb.append(this.j);
        sb.append(", locale=");
        sb.append(this.t);
        sb.append(", country=");
        sb.append(this.a);
        sb.append(", mccMnc=");
        sb.append(this.m);
        sb.append(", applicationBuild=");
        return du4.b(sb, this.q, "}");
    }
}
