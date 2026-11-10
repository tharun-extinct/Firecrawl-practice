package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ju {
    public final String g;
    public final long n;
    public final aj1 r;
    public final long v;
    public final Map x;
    public final Integer y;

    public ju(String str, Integer num, aj1 aj1Var, long j, long j2, HashMap map) {
        this.g = str;
        this.y = num;
        this.r = aj1Var;
        this.n = j;
        this.v = j2;
        this.x = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ju) {
            ju juVar = (ju) obj;
            if (this.g.equals(juVar.g)) {
                Integer num = juVar.y;
                Integer num2 = this.y;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.r.equals(juVar.r) && this.n == juVar.n && this.v == juVar.v && this.x.equals(juVar.x)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String g(String str) {
        String str2 = (String) this.x.get(str);
        return str2 == null ? "" : str2;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() ^ 1000003) * 1000003;
        Integer num = this.y;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.r.hashCode()) * 1000003;
        long j = this.n;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.v;
        return this.x.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final vl r() {
        vl vlVar = new vl();
        String str = this.g;
        if (str == null) {
            l0.q("Null transportName");
            return null;
        }
        vlVar.g = str;
        vlVar.y = this.y;
        aj1 aj1Var = this.r;
        if (aj1Var == null) {
            l0.q("Null encodedPayload");
            return null;
        }
        vlVar.r = aj1Var;
        vlVar.n = Long.valueOf(this.n);
        vlVar.v = Long.valueOf(this.v);
        vlVar.x = new HashMap(this.x);
        return vlVar;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.g + ", code=" + this.y + ", encodedPayload=" + this.r + ", eventMillis=" + this.n + ", uptimeMillis=" + this.v + ", autoMetadata=" + this.x + "}";
    }

    public final int y(String str) {
        String str2 = (String) this.x.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }
}
