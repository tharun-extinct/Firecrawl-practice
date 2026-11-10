package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp3 implements yi {
    public final int g;
    public final int j;
    public final int l;
    public final o65 n;
    public final long r;
    public final s75 t;
    public final jt3 v;
    public final av2 x;
    public final int y;

    public lp3(int i, int i2, long j, o65 o65Var, jt3 jt3Var, av2 av2Var, int i3, int i4, s75 s75Var) {
        this.g = i;
        this.y = i2;
        this.r = j;
        this.n = o65Var;
        this.v = jt3Var;
        this.x = av2Var;
        this.l = i3;
        this.j = i4;
        this.t = s75Var;
        o85[] o85VarArr = n85.y;
        if (n85.g(j, n85.r)) {
            return;
        }
        if (n85.r(j) >= 0.0f) {
            return;
        }
        nc2.y("lineHeight can't be negative (" + n85.r(j) + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp3)) {
            return false;
        }
        lp3 lp3Var = (lp3) obj;
        return this.g == lp3Var.g && this.y == lp3Var.y && n85.g(this.r, lp3Var.r) && yf2.p(this.n, lp3Var.n) && yf2.p(this.v, lp3Var.v) && yf2.p(this.x, lp3Var.x) && this.l == lp3Var.l && this.j == lp3Var.j && yf2.p(this.t, lp3Var.t);
    }

    public final lp3 g(lp3 lp3Var) {
        return lp3Var == null ? this : mp3.g(this, lp3Var.g, lp3Var.y, lp3Var.r, lp3Var.n, lp3Var.v, lp3Var.x, lp3Var.l, lp3Var.j, lp3Var.t);
    }

    public final int hashCode() {
        int iR = du4.r(this.y, Integer.hashCode(this.g) * 31, 31);
        o85[] o85VarArr = n85.y;
        int iV = xi3.v(iR, 31, this.r);
        o65 o65Var = this.n;
        int iHashCode = (iV + (o65Var != null ? o65Var.hashCode() : 0)) * 31;
        jt3 jt3Var = this.v;
        int iHashCode2 = (iHashCode + (jt3Var != null ? jt3Var.hashCode() : 0)) * 31;
        av2 av2Var = this.x;
        int iR2 = du4.r(this.j, du4.r(this.l, (iHashCode2 + (av2Var != null ? av2Var.hashCode() : 0)) * 31, 31), 31);
        s75 s75Var = this.t;
        return iR2 + (s75Var != null ? s75Var.hashCode() : 0);
    }

    public final String toString() {
        String strG = g35.g(this.g);
        String strG2 = p45.g(this.y);
        String strN = n85.n(this.r);
        String strG3 = vu2.g(this.l);
        String strG4 = e92.g(this.j);
        StringBuilder sbZ = du4.z("ParagraphStyle(textAlign=", strG, ", textDirection=", strG2, ", lineHeight=");
        sbZ.append(strN);
        sbZ.append(", textIndent=");
        sbZ.append(this.n);
        sbZ.append(", platformStyle=");
        sbZ.append(this.v);
        sbZ.append(", lineHeightStyle=");
        sbZ.append(this.x);
        sbZ.append(", lineBreak=");
        du4.B(sbZ, strG3, ", hyphens=", strG4, ", textMotion=");
        sbZ.append(this.t);
        sbZ.append(")");
        return sbZ.toString();
    }
}
