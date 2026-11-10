package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q15 {
    public final float g;
    public final float r;
    public final float y;

    public q15(float f, float f2, float f3) {
        this.g = f;
        this.y = f2;
        this.r = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q15)) {
            return false;
        }
        q15 q15Var = (q15) obj;
        return vb1.y(this.g, q15Var.g) && vb1.y(this.y, q15Var.y) && vb1.y(this.r, q15Var.r);
    }

    public final int hashCode() {
        return Float.hashCode(this.r) + fj.y(this.y, Float.hashCode(this.g) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.g;
        sb.append((Object) vb1.r(f));
        sb.append(", right=");
        float f2 = this.y;
        sb.append((Object) vb1.r(f + f2));
        sb.append(", width=");
        sb.append((Object) vb1.r(f2));
        sb.append(", contentWidth=");
        sb.append((Object) vb1.r(this.r));
        sb.append(')');
        return sb.toString();
    }
}
