package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku {
    public static final ku x = new ku(10485760, 200, 10000, 604800000, 81920);
    public final long g;
    public final long n;
    public final int r;
    public final int v;
    public final int y;

    public ku(long j, int i, int i2, long j2, int i3) {
        this.g = j;
        this.y = i;
        this.r = i2;
        this.n = j2;
        this.v = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ku) {
            ku kuVar = (ku) obj;
            if (this.g == kuVar.g && this.y == kuVar.y && this.r == kuVar.r && this.n == kuVar.n && this.v == kuVar.v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.g;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.y) * 1000003) ^ this.r) * 1000003;
        long j2 = this.n;
        return this.v ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.g);
        sb.append(", loadBatchSize=");
        sb.append(this.y);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.r);
        sb.append(", eventCleanUpAge=");
        sb.append(this.n);
        sb.append(", maxBlobByteSizePerRow=");
        return xi3.m(sb, this.v, "}");
    }
}
