package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kz3 {
    public final x20 g;
    public final List y;

    public kz3(x20 x20Var, List list) {
        this.g = x20Var;
        this.y = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kz3) {
            kz3 kz3Var = (kz3) obj;
            if (this.g == kz3Var.g && yf2.p(this.y, kz3Var.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        List list = this.y;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.g + ", productDetailsList=" + this.y + ")";
    }
}
