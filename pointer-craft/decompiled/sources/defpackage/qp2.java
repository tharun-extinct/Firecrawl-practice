package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp2 {
    public static final pp2 Companion = new pp2();
    public final String g;
    public final String n;
    public final String r;
    public final String y;

    public /* synthetic */ qp2(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 2) == 0) {
            this.y = null;
        } else {
            this.y = str2;
        }
        if ((i & 4) == 0) {
            this.r = null;
        } else {
            this.r = str3;
        }
        if ((i & 8) == 0) {
            this.n = null;
        } else {
            this.n = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp2)) {
            return false;
        }
        qp2 qp2Var = (qp2) obj;
        return yf2.p(this.g, qp2Var.g) && yf2.p(this.y, qp2Var.y) && yf2.p(this.r, qp2Var.r) && yf2.p(this.n, qp2Var.n);
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
        StringBuilder sbZ = du4.z("LayoutUploadDto(id=", this.g, ", shareLink=", this.y, ", uploadKey=");
        sbZ.append(this.r);
        sbZ.append(", error=");
        sbZ.append(this.n);
        sbZ.append(")");
        return sbZ.toString();
    }
}
