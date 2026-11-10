package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nk {
    public final w75 g;
    public final boolean n;
    public final boolean r;
    public final List v;
    public final w75 y;

    public nk(w75 w75Var, w75 w75Var2, boolean z, boolean z2, List list) {
        this.g = w75Var;
        this.y = w75Var2;
        this.r = z;
        this.n = z2;
        this.v = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk)) {
            return false;
        }
        nk nkVar = (nk) obj;
        return this.g.equals(nkVar.g) && yf2.p(this.y, nkVar.y) && this.r == nkVar.r && this.n == nkVar.n && yf2.p(this.v, nkVar.v);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        w75 w75Var = this.y;
        int iL = xi3.l(xi3.l((iHashCode + (w75Var == null ? 0 : w75Var.hashCode())) * 31, 31, this.r), 31, this.n);
        List list = this.v;
        return iL + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AppBarState(title=" + this.g + ", subtitle=" + this.y + ", showBack=" + this.r + ", showDeviceControl=" + this.n + ", appBarActions=" + this.v + ")";
    }
}
