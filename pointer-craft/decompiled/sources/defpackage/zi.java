package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zi {
    public final Object g;
    public final String n;
    public int r;
    public final int y;

    public zi(int i, int i2, Object obj, String str) {
        this.g = obj;
        this.y = i;
        this.r = i2;
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj;
        return yf2.p(this.g, ziVar.g) && this.y == ziVar.y && this.r == ziVar.r && yf2.p(this.n, ziVar.n);
    }

    public final void g(int i) {
        this.r = i;
    }

    public final int hashCode() {
        Object obj = this.g;
        return this.n.hashCode() + du4.r(this.r, du4.r(this.y, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.g + ", start=" + this.y + ", end=" + this.r + ", tag=" + this.n + ")";
    }

    public final bj y(int i) {
        int i2 = this.r;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            nc2.y("Item.end should be set first");
        }
        return new bj(this.y, i, this.g, this.n);
    }

    public /* synthetic */ zi(ju4 ju4Var, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, ju4Var, "");
    }
}
