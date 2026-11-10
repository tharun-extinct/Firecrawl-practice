package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sk2 {
    public final int g;
    public final byte[] j;
    public final String l;
    public final String n;
    public final boolean r;
    public final String v;
    public final String x;
    public final String y;

    public sk2(int i, String str, boolean z, String str2, String str3, String str4, String str5, byte[] bArr) {
        this.g = i;
        this.y = str;
        this.r = z;
        this.n = str2;
        this.v = str3;
        this.x = str4;
        this.l = str5;
        this.j = bArr;
    }

    public static sk2 g(sk2 sk2Var, int i, String str, String str2, String str3, String str4, byte[] bArr, int i2) {
        if ((i2 & 1) != 0) {
            i = sk2Var.g;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = sk2Var.y;
        }
        String str5 = str;
        boolean z = sk2Var.r;
        if ((i2 & 8) != 0) {
            str2 = sk2Var.n;
        }
        String str6 = str2;
        String str7 = sk2Var.v;
        if ((i2 & 32) != 0) {
            str3 = sk2Var.x;
        }
        String str8 = str3;
        String str9 = (i2 & 64) != 0 ? sk2Var.l : str4;
        byte[] bArr2 = (i2 & 128) != 0 ? sk2Var.j : bArr;
        sk2Var.getClass();
        return new sk2(i3, str5, z, str6, str7, str8, str9, bArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk2)) {
            return false;
        }
        sk2 sk2Var = (sk2) obj;
        return this.g == sk2Var.g && yf2.p(this.y, sk2Var.y) && this.r == sk2Var.r && yf2.p(this.n, sk2Var.n) && yf2.p(this.v, sk2Var.v) && yf2.p(this.x, sk2Var.x) && yf2.p(this.l, sk2Var.l) && yf2.p(this.j, sk2Var.j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.g) * 31;
        String str = this.y;
        int iL = xi3.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.r);
        String str2 = this.n;
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.v;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.x;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        byte[] bArr = this.j;
        return iHashCode5 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.j);
        StringBuilder sb = new StringBuilder("Layout(uid=");
        sb.append(this.g);
        sb.append(", name=");
        sb.append(this.y);
        sb.append(", starred=");
        sb.append(this.r);
        sb.append(", shareId=");
        sb.append(this.n);
        sb.append(", parentId=");
        du4.B(sb, this.v, ", shareLink=", this.x, ", uploadKey=");
        sb.append(this.l);
        sb.append(", data=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
