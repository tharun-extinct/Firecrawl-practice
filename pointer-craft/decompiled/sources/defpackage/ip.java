package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ip {
    public final by3 g;
    public final boolean r;
    public final boolean y;

    public ip(by3 by3Var, boolean z, boolean z2) {
        this.g = by3Var;
        this.y = z;
        this.r = z2;
    }

    public static ip g(ip ipVar, by3 by3Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            by3Var = ipVar.g;
        }
        if ((i & 2) != 0) {
            z = ipVar.y;
        }
        if ((i & 4) != 0) {
            z2 = ipVar.r;
        }
        ipVar.getClass();
        return new ip(by3Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        return yf2.p(this.g, ipVar.g) && this.y == ipVar.y && this.r == ipVar.r;
    }

    public final int hashCode() {
        by3 by3Var = this.g;
        return Boolean.hashCode(this.r) + xi3.l((by3Var == null ? 0 : by3Var.hashCode()) * 31, 31, this.y);
    }

    public final String toString() {
        return "AppUiState(proMessage=" + this.g + ", showKeyboardLayoutSettings=" + this.y + ", showPurchaseDiagnostics=" + this.r + ")";
    }
}
