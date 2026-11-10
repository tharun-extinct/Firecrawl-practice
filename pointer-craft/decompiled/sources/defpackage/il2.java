package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class il2 {
    public static final hl2 Companion = new hl2();
    public final String g;
    public final String n;
    public final String r;
    public final String v;
    public final String y;

    public /* synthetic */ il2(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            dd6.y(i, 31, gl2.g.r());
            throw null;
        }
        this.g = str;
        this.y = str2;
        this.r = str3;
        this.n = str4;
        this.v = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il2)) {
            return false;
        }
        il2 il2Var = (il2) obj;
        return yf2.p(this.g, il2Var.g) && yf2.p(this.y, il2Var.y) && yf2.p(this.r, il2Var.r) && yf2.p(this.n, il2Var.n) && yf2.p(this.v, il2Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + xi3.x(xi3.x(xi3.x(this.g.hashCode() * 31, 31, this.y), 31, this.r), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbZ = du4.z("LayoutDto(id=", this.g, ", name=", this.y, ", author=");
        du4.B(sbZ, this.r, ", platform=", this.n, ", language=");
        return du4.b(sbZ, this.v, ")");
    }
}
