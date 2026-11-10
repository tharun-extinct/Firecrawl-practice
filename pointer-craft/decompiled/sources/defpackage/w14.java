package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w14 {
    public final List g;
    public final boolean n;
    public final String r;
    public final c84 y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public w14(List list, c84 c84Var, int i) {
        if ((i & 1) != 0) {
            jk1 jk1Var = a91.c;
            list = new ArrayList(dj0.Y(jk1Var, 10));
            m0 m0Var = new m0(jk1Var, (byte) 0);
            while (m0Var.hasNext()) {
                list.add(new b91((a91) m0Var.next(), (z81) null, (Integer) null, 14));
            }
        }
        this(list, (i & 2) != 0 ? null : c84Var, "", (i & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w14)) {
            return false;
        }
        w14 w14Var = (w14) obj;
        return yf2.p(this.g, w14Var.g) && this.y == w14Var.y && yf2.p(this.r, w14Var.r) && this.n == w14Var.n;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        c84 c84Var = this.y;
        return Boolean.hashCode(this.n) + xi3.x((iHashCode + (c84Var == null ? 0 : c84Var.hashCode())) * 31, 31, this.r);
    }

    public final String toString() {
        return "PurchaseDiagnosticsUiState(steps=" + this.g + ", verdict=" + this.y + ", report=" + this.r + ", isRunning=" + this.n + ")";
    }

    public w14(List list, c84 c84Var, String str, boolean z) {
        list.getClass();
        str.getClass();
        this.g = list;
        this.y = c84Var;
        this.r = str;
        this.n = z;
    }
}
