package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pj3 extends lr2 {
    public final oj3 v;
    public final gu2 x;

    public pj3(gu2 gu2Var, oj3 oj3Var) {
        oj3Var.getClass();
        this.v = oj3Var;
        this.x = gu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj3)) {
            return false;
        }
        pj3 pj3Var = (pj3) obj;
        return yf2.p(this.v, pj3Var.v) && yf2.p(this.x, pj3Var.x);
    }

    public final int hashCode() {
        int iHashCode = this.v.hashCode() * 31;
        gu2 gu2Var = this.x;
        return iHashCode + (gu2Var == null ? 0 : gu2Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.v + ", owner=" + this.x + ')';
    }
}
