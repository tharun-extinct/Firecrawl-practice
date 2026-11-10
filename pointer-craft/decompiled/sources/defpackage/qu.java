package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qu extends cy2 {
    public final long g;
    public final mg3 l;
    public final byte[] n;
    public final long r;
    public final String v;
    public final long x;
    public final Integer y;

    public qu(long j, Integer num, long j2, byte[] bArr, String str, long j3, tu tuVar) {
        this.g = j;
        this.y = num;
        this.r = j2;
        this.n = bArr;
        this.v = str;
        this.x = j3;
        this.l = tuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cy2) {
            cy2 cy2Var = (cy2) obj;
            qu quVar = (qu) cy2Var;
            if (this.g == quVar.g) {
                Integer num = quVar.y;
                Integer num2 = this.y;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.r == quVar.r) {
                        if (Arrays.equals(this.n, cy2Var instanceof qu ? ((qu) cy2Var).n : quVar.n)) {
                            String str = quVar.v;
                            String str2 = this.v;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.x == quVar.x) {
                                    mg3 mg3Var = quVar.l;
                                    mg3 mg3Var2 = this.l;
                                    if (mg3Var2 != null ? mg3Var2.equals(mg3Var) : mg3Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.g;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.y;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.r;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.n)) * 1000003;
        String str = this.v;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.x;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        mg3 mg3Var = this.l;
        return i2 ^ (mg3Var != null ? mg3Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.g + ", eventCode=" + this.y + ", eventUptimeMs=" + this.r + ", sourceExtension=" + Arrays.toString(this.n) + ", sourceExtensionJsonProto3=" + this.v + ", timezoneOffsetSeconds=" + this.x + ", networkConnectionInfo=" + this.l + "}";
    }
}
