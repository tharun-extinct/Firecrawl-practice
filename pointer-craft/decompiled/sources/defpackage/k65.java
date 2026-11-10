package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k65 {
    public final cj g;
    public final u75 r;
    public final long y;

    public k65(cj cjVar, long j, u75 u75Var) {
        u75 u75Var2;
        this.g = cjVar;
        this.y = sp2.x(cjVar.t.length(), j);
        if (u75Var != null) {
            u75Var2 = new u75(sp2.x(cjVar.t.length(), u75Var.g));
        } else {
            u75Var2 = null;
        }
        this.r = u75Var2;
    }

    public static k65 g(k65 k65Var, cj cjVar, long j, int i) {
        if ((i & 1) != 0) {
            cjVar = k65Var.g;
        }
        if ((i & 2) != 0) {
            j = k65Var.y;
        }
        u75 u75Var = (i & 4) != 0 ? k65Var.r : null;
        k65Var.getClass();
        return new k65(cjVar, j, u75Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k65)) {
            return false;
        }
        k65 k65Var = (k65) obj;
        return u75.y(this.y, k65Var.y) && yf2.p(this.r, k65Var.r) && yf2.p(this.g, k65Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        int i = u75.r;
        int iV = xi3.v(iHashCode, 31, this.y);
        u75 u75Var = this.r;
        return iV + (u75Var != null ? Long.hashCode(u75Var.g) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.g) + "', selection=" + u75.j(this.y) + ", composition=" + this.r + ")";
    }

    public k65(String str, long j, int i) {
        this(new cj((i & 1) != 0 ? "" : str), (i & 2) != 0 ? u75.y : j, (u75) null);
    }
}
