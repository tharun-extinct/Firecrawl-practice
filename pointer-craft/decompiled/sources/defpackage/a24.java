package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a24 {
    public final x20 g;
    public final List y;

    public a24(x20 x20Var, List list) {
        x20Var.getClass();
        list.getClass();
        this.g = x20Var;
        this.y = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24)) {
            return false;
        }
        a24 a24Var = (a24) obj;
        return yf2.p(this.g, a24Var.g) && yf2.p(this.y, a24Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "PurchasesResult(billingResult=" + this.g + ", purchasesList=" + this.y + ")";
    }
}
