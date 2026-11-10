package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bt0 {
    public final x20 g;
    public final String y;

    public bt0(x20 x20Var, String str) {
        x20Var.getClass();
        this.g = x20Var;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        return yf2.p(this.g, bt0Var.g) && yf2.p(this.y, bt0Var.y);
    }

    public final x20 g() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        String str = this.y;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsumeResult(billingResult=");
        sb.append(this.g);
        sb.append(", purchaseToken=");
        return du4.b(sb, this.y, ")");
    }
}
