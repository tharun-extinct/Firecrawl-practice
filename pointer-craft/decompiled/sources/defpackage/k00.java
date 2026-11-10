package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k00 implements u6 {
    public final float g;
    public final float y;

    public k00(float f, float f2) {
        this.g = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return Float.compare(this.g, k00Var.g) == 0 && Float.compare(this.y, k00Var.y) == 0;
    }

    @Override // defpackage.u6
    public final long g(long j, long j2, fl2 fl2Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        fl2 fl2Var2 = fl2.j;
        float f3 = this.g;
        if (fl2Var != fl2Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.y) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.g + ", verticalBias=" + this.y + ")";
    }
}
