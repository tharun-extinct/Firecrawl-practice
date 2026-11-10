package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x93 {
    public final String g;
    public final String r;
    public final xn5 y;

    public x93(String str, xn5 xn5Var, String str2) {
        this.g = str;
        this.y = xn5Var;
        this.r = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x93)) {
            return false;
        }
        x93 x93Var = (x93) obj;
        return yf2.p(this.g, x93Var.g) && this.y == x93Var.y && yf2.p(this.r, x93Var.r);
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        xn5 xn5Var = this.y;
        int iHashCode2 = (iHashCode + (xn5Var == null ? 0 : xn5Var.hashCode())) * 31;
        String str2 = this.r;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultimediaWidgetState(address=");
        sb.append(this.g);
        sb.append(", connectionStatus=");
        sb.append(this.y);
        sb.append(", deviceName=");
        return du4.b(sb, this.r, ")");
    }
}
