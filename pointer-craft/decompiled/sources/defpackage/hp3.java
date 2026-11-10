package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp3 {
    public final gd g;
    public final float l;
    public final int n;
    public final int r;
    public final int v;
    public final float x;
    public final int y;

    public hp3(gd gdVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = gdVar;
        this.y = i;
        this.r = i2;
        this.n = i3;
        this.v = i4;
        this.x = f;
        this.l = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hp3) {
            hp3 hp3Var = (hp3) obj;
            if (this.g == hp3Var.g && this.y == hp3Var.y && this.r == hp3Var.r && this.n == hp3Var.n && this.v == hp3Var.v && Float.compare(this.x, hp3Var.x) == 0 && Float.compare(this.l, hp3Var.l) == 0) {
                return true;
            }
        }
        return false;
    }

    public final k44 g(k44 k44Var) {
        return k44Var.t((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.x)) & 4294967295L));
    }

    public final int hashCode() {
        return Float.hashCode(this.l) + fj.y(this.x, du4.r(this.v, du4.r(this.n, du4.r(this.r, du4.r(this.y, this.g.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final int n(int i) {
        int i2 = this.r;
        int i3 = this.y;
        return xs2.w(i, i3, i2) - i3;
    }

    public final k44 r(k44 k44Var) {
        float f = -this.x;
        return k44Var.t((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.y + ", endIndex=" + this.r + ", startLineIndex=" + this.n + ", endLineIndex=" + this.v + ", top=" + this.x + ", bottom=" + this.l + ")";
    }

    public final long y(long j, boolean z) {
        if (z) {
            long j2 = u75.y;
            if (u75.y(j, j2)) {
                return j2;
            }
        }
        int i = u75.r;
        int i2 = this.y;
        return sp2.y(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }
}
