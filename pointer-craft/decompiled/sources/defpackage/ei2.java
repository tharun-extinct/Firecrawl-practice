package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei2 {
    public final String g;
    public final String n;
    public final String r;
    public final String y;

    public /* synthetic */ ei2(int i, String str, String str2, String str3, String str4) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei2)) {
            return false;
        }
        ei2 ei2Var = (ei2) obj;
        return yf2.p(this.g, ei2Var.g) && yf2.p(this.y, ei2Var.y) && yf2.p(this.r, ei2Var.r) && yf2.p(this.n, ei2Var.n);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.y;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.r;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbZ = du4.z("Key(base=", this.g, ", shift=", this.y, ", alt=");
        sbZ.append(this.r);
        sbZ.append(", altshift=");
        sbZ.append(this.n);
        sbZ.append(")");
        return sbZ.toString();
    }

    public ei2(String str, String str2, String str3, String str4) {
        this.g = str;
        this.y = str2;
        this.r = str3;
        this.n = str4;
    }
}
