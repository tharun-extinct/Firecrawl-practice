package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq2 {
    public final int g;
    public final int y;

    public eq2(int i, int i2) {
        this.g = i;
        this.y = i2;
        if (!(i >= 0)) {
            pc2.g("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        pc2.g("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq2)) {
            return false;
        }
        eq2 eq2Var = (eq2) obj;
        return this.g == eq2Var.g && this.y == eq2Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return du4.q(this.g, this.y, "Interval(start=", ", end=", ")");
    }
}
