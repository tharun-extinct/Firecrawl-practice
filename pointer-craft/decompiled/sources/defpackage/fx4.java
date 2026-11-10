package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx4 {
    public final int g;
    public final int r;
    public final int y;

    public fx4(int i, int i2, int i3) {
        this.g = i;
        this.y = i2;
        this.r = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx4)) {
            return false;
        }
        fx4 fx4Var = (fx4) obj;
        return this.g == fx4Var.g && this.y == fx4Var.y && this.r == fx4Var.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + du4.r(this.y, Integer.hashCode(this.g) * 31, 31);
    }

    public final String toString() {
        return xi3.m(du4.s(this.g, this.y, "Step(text=", ", positive=", ", negative="), this.r, ")");
    }
}
