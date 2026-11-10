package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wn4 {
    public final String g;
    public final String r;
    public final String y;

    public wn4(String str, String str2, String str3) {
        this.g = str;
        this.y = str2;
        this.r = str3;
    }

    public static wn4 g(wn4 wn4Var, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = wn4Var.g;
        }
        if ((i & 2) != 0) {
            str2 = wn4Var.y;
        }
        wn4Var.getClass();
        if ((i & 8) != 0) {
            str3 = wn4Var.r;
        }
        wn4Var.getClass();
        return new wn4(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn4)) {
            return false;
        }
        wn4 wn4Var = (wn4) obj;
        return this.g.equals(wn4Var.g) && this.y.equals(wn4Var.y) && yf2.p(this.r, wn4Var.r);
    }

    public final int hashCode() {
        int iX = xi3.x(this.g.hashCode() * 31, 961, this.y);
        String str = this.r;
        return iX + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return du4.b(du4.z("ShareData(author=", this.g, ", name=", this.y, ", platform=null, language="), this.r, ")");
    }
}
