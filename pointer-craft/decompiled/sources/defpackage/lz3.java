package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lz3 {
    public final String g;
    public final String j;
    public final boolean l;
    public final String n;
    public final String r;
    public final String t;
    public final long v;
    public final String x;
    public final String y;

    public lz3(String str, String str2, String str3, String str4, long j, String str5, boolean z, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.g = str;
        this.y = str2;
        this.r = str3;
        this.n = str4;
        this.v = j;
        this.x = str5;
        this.l = z;
        this.j = str6;
        this.t = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz3)) {
            return false;
        }
        lz3 lz3Var = (lz3) obj;
        return yf2.p(this.g, lz3Var.g) && yf2.p(this.y, lz3Var.y) && yf2.p(this.r, lz3Var.r) && yf2.p(this.n, lz3Var.n) && this.v == lz3Var.v && yf2.p(this.x, lz3Var.x) && this.l == lz3Var.l && yf2.p(this.j, lz3Var.j) && yf2.p(this.t, lz3Var.t);
    }

    public final int hashCode() {
        int iL = xi3.l(xi3.x(xi3.v(xi3.x(xi3.x(xi3.x(this.g.hashCode() * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l);
        String str = this.j;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbZ = du4.z("ProductDisplayInfo(productId=", this.g, ", title=", this.y, ", description=");
        du4.B(sbZ, this.r, ", formattedPrice=", this.n, ", priceAmountMicros=");
        sbZ.append(this.v);
        sbZ.append(", priceCurrencyCode=");
        sbZ.append(this.x);
        sbZ.append(", isSubscription=");
        sbZ.append(this.l);
        sbZ.append(", subscriptionPeriod=");
        sbZ.append(this.j);
        sbZ.append(", freeTrialPeriod=");
        sbZ.append(this.t);
        sbZ.append(")");
        return sbZ.toString();
    }
}
