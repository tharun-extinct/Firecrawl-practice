package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wv3 {
    public final int g;
    public final boolean n;
    public final boolean r;
    public final boolean v;
    public final short x;
    public final boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    public wv3(boolean z, ch4 ch4Var, boolean z2, int i) {
        vf1 vf1Var = de.g;
        int i2 = !z ? 262152 : 262144;
        i2 = ch4Var == ch4.t ? i2 | 8192 : i2;
        this(z2 ? i2 : i2 | 512, ch4Var == ch4.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv3)) {
            return false;
        }
        wv3 wv3Var = (wv3) obj;
        return this.g == wv3Var.g && this.y == wv3Var.y && this.r == wv3Var.r && this.n == wv3Var.n && this.v == wv3Var.v && this.x == wv3Var.x;
    }

    public final int hashCode() {
        return (xi3.l(xi3.l(xi3.l(xi3.l(xi3.l(this.g * 31, 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, false) + this.x) * 31;
    }

    public wv3(int i, boolean z) {
        this.g = i;
        this.y = z;
        this.r = true;
        this.n = true;
        this.v = true;
        this.x = (short) 1002;
    }

    public wv3(boolean z) {
        this(z, ch4.j, true, 0);
    }
}
