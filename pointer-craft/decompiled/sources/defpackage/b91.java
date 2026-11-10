package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b91 {
    public final a91 g;
    public final Integer n;
    public final Integer r;
    public final z81 y;

    public b91(a91 a91Var, z81 z81Var, Integer num, Integer num2) {
        a91Var.getClass();
        z81Var.getClass();
        this.g = a91Var;
        this.y = z81Var;
        this.r = num;
        this.n = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b91)) {
            return false;
        }
        b91 b91Var = (b91) obj;
        return this.g == b91Var.g && this.y == b91Var.y && yf2.p(this.r, b91Var.r) && yf2.p(this.n, b91Var.n);
    }

    public final int hashCode() {
        int iHashCode = (this.y.hashCode() + (this.g.hashCode() * 31)) * 31;
        Integer num = this.r;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.n;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "DiagnosticStepState(step=" + this.g + ", status=" + this.y + ", detail=" + this.r + ", detailArg=" + this.n + ")";
    }

    public /* synthetic */ b91(a91 a91Var, z81 z81Var, Integer num, int i) {
        this(a91Var, (i & 2) != 0 ? z81.j : z81Var, (i & 4) != 0 ? null : num, (Integer) null);
    }
}
