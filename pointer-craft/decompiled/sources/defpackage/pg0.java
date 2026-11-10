package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 {
    public final byte n;
    public final String g = "Bluetooth Remote";
    public final String y = "Android Remote";
    public final String r = "Android";

    public pg0(byte b) {
        this.n = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        return this.g.equals(pg0Var.g) && this.y.equals(pg0Var.y) && this.r.equals(pg0Var.r) && this.n == pg0Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + du4.r(-1, du4.r(2000, du4.r(32, du4.r(800, du4.r(1, (Byte.hashCode(this.n) + xi3.x(xi3.x(this.g.hashCode() * 31, 31, this.y), 31, this.r)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbZ = du4.z("ClassicHidConfig(sdpName=", this.g, ", sdpDescription=", this.y, ", sdpProvider=");
        sbZ.append(this.r);
        sbZ.append(", subClass=");
        sbZ.append((int) this.n);
        sbZ.append(", serviceType=1, qosTokenRate=800, qosTokenBucketSize=32, qosPeakBandwidth=2000, qosLatency=-1, delayVariation=-1)");
        return sbZ.toString();
    }
}
