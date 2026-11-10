package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by4 extends yd1 {
    public final float g;
    public final int n;
    public final int r;
    public final float y;

    public by4(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.g = f;
        this.y = f2;
        this.r = i;
        this.n = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by4)) {
            return false;
        }
        by4 by4Var = (by4) obj;
        return this.g == by4Var.g && this.y == by4Var.y && this.r == by4Var.r && this.n == by4Var.n;
    }

    public final int hashCode() {
        return du4.r(this.n, du4.r(this.r, fj.y(this.y, Float.hashCode(this.g) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.r;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.n;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder sbU = du4.u("Stroke(width=", this.g, ", miter=", this.y, ", cap=");
        sbU.append(str);
        sbU.append(", join=");
        sbU.append(str2);
        sbU.append(", pathEffect=null)");
        return sbU.toString();
    }
}
