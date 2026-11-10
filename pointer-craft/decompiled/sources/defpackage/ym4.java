package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym4 {
    public static final ym4 n = new ym4(ra.v(4278190080L), 0, 0.0f);
    public final long g;
    public final float r;
    public final long y;

    public ym4(long j, long j2, float f) {
        this.g = j;
        this.y = j2;
        this.r = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym4)) {
            return false;
        }
        ym4 ym4Var = (ym4) obj;
        long j = ym4Var.g;
        int i = jj0.t;
        return tf5.g(this.g, j) && wi3.y(this.y, ym4Var.y) && this.r == ym4Var.r;
    }

    public final int hashCode() {
        int i = jj0.t;
        return Float.hashCode(this.r) + xi3.v(Long.hashCode(this.g) * 31, 31, this.y);
    }

    public final String toString() {
        StringBuilder sbZ = du4.z("Shadow(color=", jj0.j(this.g), ", offset=", wi3.l(this.y), ", blurRadius=");
        sbZ.append(this.r);
        sbZ.append(")");
        return sbZ.toString();
    }
}
