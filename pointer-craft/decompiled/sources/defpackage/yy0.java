package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yy0 {
    public final p04 g;
    public final String n;
    public final xn5 r;
    public final String y;

    public yy0(p04 p04Var, String str, xn5 xn5Var, String str2) {
        this.g = p04Var;
        this.y = str;
        this.r = xn5Var;
        this.n = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return yf2.p(this.g, yy0Var.g) && yf2.p(this.y, yy0Var.y) && this.r == yy0Var.r && yf2.p(this.n, yy0Var.n);
    }

    public final int hashCode() {
        p04 p04Var = this.g;
        int iHashCode = (p04Var == null ? 0 : p04Var.hashCode()) * 31;
        String str = this.y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        xn5 xn5Var = this.r;
        int iHashCode3 = (iHashCode2 + (xn5Var == null ? 0 : xn5Var.hashCode())) * 31;
        String str2 = this.n;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CustomWidgetState(flexLayout=" + this.g + ", configuredDeviceAddress=" + this.y + ", connectionStatus=" + this.r + ", deviceName=" + this.n + ")";
    }
}
