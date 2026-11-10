package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ff3 {
    public final int g;
    public final float n;
    public final float r;
    public final long v;
    public final float y;

    public ff3(int i, float f, float f2, float f3, long j) {
        this.g = i;
        this.y = f;
        this.r = f2;
        this.n = f3;
        this.v = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ff3.class == obj.getClass()) {
            ff3 ff3Var = (ff3) obj;
            return this.r == ff3Var.r && this.n == ff3Var.n && this.y == ff3Var.y && this.g == ff3Var.g && this.v == ff3Var.v;
        }
        return false;
    }

    public final float g() {
        return this.y;
    }

    public final int hashCode() {
        return Long.hashCode(this.v) + du4.r(this.g, fj.y(this.y, fj.y(this.n, Float.hashCode(this.r) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.r + ", touchY=" + this.n + ", progress=" + this.y + ", swipeEdge=" + this.g + ", frameTimeMillis=" + this.v + ')';
    }

    public final int y() {
        return this.g;
    }
}
