package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nv2 extends ov2 {
    public final String g;
    public final p75 y;

    public nv2(String str, p75 p75Var) {
        this.g = str;
        this.y = p75Var;
    }

    public static nv2 y(nv2 nv2Var, p75 p75Var) {
        return new nv2(nv2Var.g, p75Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv2)) {
            return false;
        }
        nv2 nv2Var = (nv2) obj;
        return yf2.p(this.g, nv2Var.g) && yf2.p(this.y, nv2Var.y);
    }

    @Override // defpackage.ov2
    public final p75 g() {
        return this.y;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        p75 p75Var = this.y;
        return (iHashCode + (p75Var != null ? p75Var.hashCode() : 0)) * 31;
    }

    public final String r() {
        return this.g;
    }

    public final String toString() {
        return du4.i("LinkAnnotation.Url(url=", this.g, ")");
    }

    public /* synthetic */ nv2(String str, p75 p75Var, int i) {
        this(str, p75Var);
    }
}
