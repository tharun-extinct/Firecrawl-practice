package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tv0 {
    public final q04 g;
    public final byte[] n;
    public final String r;
    public final zl2 v;
    public final boolean x;
    public final Long y;

    public tv0(q04 q04Var, Long l, String str, byte[] bArr, zl2 zl2Var, boolean z) {
        this.g = q04Var;
        this.y = l;
        this.r = str;
        this.n = bArr;
        this.v = zl2Var;
        this.x = z;
    }

    public static tv0 g(tv0 tv0Var, q04 q04Var, Long l, String str, byte[] bArr, zl2 zl2Var, boolean z, int i) {
        if ((i & 1) != 0) {
            q04Var = tv0Var.g;
        }
        q04 q04Var2 = q04Var;
        if ((i & 2) != 0) {
            l = tv0Var.y;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str = tv0Var.r;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            bArr = tv0Var.n;
        }
        byte[] bArr2 = bArr;
        if ((i & 32) != 0) {
            z = tv0Var.x;
        }
        tv0Var.getClass();
        return new tv0(q04Var2, l2, str2, bArr2, zl2Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv0)) {
            return false;
        }
        tv0 tv0Var = (tv0) obj;
        return yf2.p(this.g, tv0Var.g) && yf2.p(this.y, tv0Var.y) && yf2.p(this.r, tv0Var.r) && yf2.p(this.n, tv0Var.n) && this.v == tv0Var.v && this.x == tv0Var.x;
    }

    public final int hashCode() {
        q04 q04Var = this.g;
        int iHashCode = (q04Var == null ? 0 : q04Var.hashCode()) * 31;
        Long l = this.y;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.r;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.n;
        int iHashCode4 = (iHashCode3 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        zl2 zl2Var = this.v;
        return Boolean.hashCode(this.x) + ((iHashCode4 + (zl2Var != null ? zl2Var.hashCode() : 0)) * 31);
    }

    public final String n() {
        return this.r;
    }

    public final q04 r() {
        return this.g;
    }

    public final String toString() {
        String string = Arrays.toString(this.n);
        StringBuilder sb = new StringBuilder("ControlUiState(layout=");
        sb.append(this.g);
        sb.append(", dbId=");
        sb.append(this.y);
        sb.append(", sharedId=");
        du4.B(sb, this.r, ", layoutBytes=", string, ", error=");
        sb.append(this.v);
        sb.append(", isLoading=");
        sb.append(this.x);
        sb.append(")");
        return sb.toString();
    }

    public final Long y() {
        return this.y;
    }
}
