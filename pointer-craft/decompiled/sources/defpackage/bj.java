package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj {
    public final Object g;
    public final String n;
    public final int r;
    public final int y;

    public bj(int i, int i2, Object obj, String str) {
        this.g = obj;
        this.y = i;
        this.r = i2;
        this.n = str;
        if (i <= i2) {
            return;
        }
        nc2.g("Reversed range is not supported");
    }

    public static bj g(bj bjVar, yi yiVar, int i, int i2) {
        Object obj = yiVar;
        if ((i2 & 1) != 0) {
            obj = bjVar.g;
        }
        int i3 = bjVar.y;
        if ((i2 & 4) != 0) {
            i = bjVar.r;
        }
        return new bj(i3, i, obj, bjVar.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return yf2.p(this.g, bjVar.g) && this.y == bjVar.y && this.r == bjVar.r && yf2.p(this.n, bjVar.n);
    }

    public final int hashCode() {
        Object obj = this.g;
        return this.n.hashCode() + du4.r(this.r, du4.r(this.y, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.g + ", start=" + this.y + ", end=" + this.r + ", tag=" + this.n + ")";
    }

    public bj(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
