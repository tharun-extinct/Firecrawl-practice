package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class am2 {
    public final int g;
    public final boolean r;
    public final int y;

    public am2(int i, int i2, boolean z) {
        this.g = i;
        this.y = i2;
        this.r = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am2)) {
            return false;
        }
        am2 am2Var = (am2) obj;
        return this.g == am2Var.g && this.y == am2Var.y && this.r == am2Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + du4.r(this.y, Integer.hashCode(this.g) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = du4.s(this.g, this.y, "BidiRun(start=", ", end=", ", isRtl=");
        sbS.append(this.r);
        sbS.append(")");
        return sbS.toString();
    }
}
