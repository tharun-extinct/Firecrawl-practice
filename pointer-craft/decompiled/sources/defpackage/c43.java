package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c43 {
    public final byte g;
    public final my1 r;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public c43(int i, int i2, my1 my1Var) {
        this.g = i;
        this.y = i2;
        this.r = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c43)) {
            return false;
        }
        c43 c43Var = (c43) obj;
        return this.g == c43Var.g && this.y == c43Var.y && this.r.equals(c43Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + du4.r(this.y, Integer.hashCode(this.g) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = du4.s(this.g, this.y, "MediaKey(order=", ", priority=", ", make=");
        sbS.append(this.r);
        sbS.append(")");
        return sbS.toString();
    }
}
