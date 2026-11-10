package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c85 implements e85 {
    public final int g;
    public final int n;
    public final String r;
    public final int y;

    public c85(int i, int i2, String str) {
        int i3 = i - 1;
        i3 = i3 < 0 ? 0 : i3;
        str.getClass();
        this.g = i;
        this.y = i2;
        this.r = str;
        this.n = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c85)) {
            return false;
        }
        c85 c85Var = (c85) obj;
        return this.g == c85Var.g && this.y == c85Var.y && this.r.equals(c85Var.r) && this.n == c85Var.n;
    }

    public final int g() {
        return this.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + xi3.x(du4.r(this.y, Integer.hashCode(this.g) * 31, 31), 31, this.r);
    }

    public final int n() {
        return this.y;
    }

    public final String r() {
        return this.r;
    }

    public final String toString() {
        StringBuilder sbS = du4.s(this.g, this.y, "Sending(sent=", ", total=", ", text=");
        sbS.append(this.r);
        sbS.append(", currentCharIndex=");
        sbS.append(this.n);
        sbS.append(")");
        return sbS.toString();
    }

    public final int y() {
        return this.g;
    }
}
