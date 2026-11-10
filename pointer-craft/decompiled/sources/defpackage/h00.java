package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h00 implements u6 {
    public final float g;

    public h00(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h00) && Float.compare(this.g, ((h00) obj).g) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    @Override // defpackage.u6
    public final long g(long j, long j2, fl2 fl2Var) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((1.0f + this.g) * (((int) (j3 >> 32)) / 2.0f))) << 32) | (((long) Math.round(0.0f * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L);
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.g + ", verticalBias=-1.0)";
    }
}
