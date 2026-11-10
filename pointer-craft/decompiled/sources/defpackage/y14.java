package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y14 {
    public final ArrayList g;
    public final boolean n;
    public final boolean r;
    public final int y;

    public y14(ArrayList arrayList, int i, boolean z, boolean z2) {
        this.g = arrayList;
        this.y = i;
        this.r = z;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y14)) {
            return false;
        }
        y14 y14Var = (y14) obj;
        return this.g.equals(y14Var.g) && this.y == y14Var.y && this.r == y14Var.r && this.n == y14Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + xi3.l(du4.r(this.y, this.g.hashCode() * 31, 31), 31, this.r);
    }

    public final String toString() {
        return "PurchaseFacts(productIds=" + this.g + ", purchaseState=" + this.y + ", isAcknowledged=" + this.r + ", isSuspended=" + this.n + ")";
    }
}
