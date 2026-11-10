package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf5 {
    public final lu1 g;
    public final int n;
    public final int r;
    public final Object v;
    public final qv1 y;

    public hf5(lu1 lu1Var, qv1 qv1Var, int i, int i2, Object obj) {
        this.g = lu1Var;
        this.y = qv1Var;
        this.r = i;
        this.n = i2;
        this.v = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5)) {
            return false;
        }
        hf5 hf5Var = (hf5) obj;
        return yf2.p(this.g, hf5Var.g) && yf2.p(this.y, hf5Var.y) && this.r == hf5Var.r && this.n == hf5Var.n && yf2.p(this.v, hf5Var.v);
    }

    public final int hashCode() {
        lu1 lu1Var = this.g;
        int iR = du4.r(this.n, du4.r(this.r, (((lu1Var == null ? 0 : lu1Var.hashCode()) * 31) + this.y.j) * 31, 31), 31);
        Object obj = this.v;
        return iR + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.r;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.n;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.g);
        sb.append(", fontWeight=");
        sb.append(this.y);
        sb.append(", fontStyle=");
        du4.B(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }
}
