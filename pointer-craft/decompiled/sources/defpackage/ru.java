package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ru extends fy2 {
    public final long g;
    public final c24 l;
    public final Integer n;
    public final yh0 r;
    public final String v;
    public final List x;
    public final long y;

    public ru(long j, long j2, gu guVar, Integer num, String str, ArrayList arrayList, c24 c24Var) {
        this.g = j;
        this.y = j2;
        this.r = guVar;
        this.n = num;
        this.v = str;
        this.x = arrayList;
        this.l = c24Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fy2) {
            ru ruVar = (ru) ((fy2) obj);
            if (this.g == ruVar.g && this.y == ruVar.y) {
                yh0 yh0Var = ruVar.r;
                yh0 yh0Var2 = this.r;
                if (yh0Var2 != null ? yh0Var2.equals(yh0Var) : yh0Var == null) {
                    Integer num = ruVar.n;
                    Integer num2 = this.n;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = ruVar.v;
                        String str2 = this.v;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = ruVar.x;
                            List list2 = this.x;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                c24 c24Var = ruVar.l;
                                c24 c24Var2 = this.l;
                                if (c24Var2 != null ? c24Var2.equals(c24Var) : c24Var == null) {
                                    return true;
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
        long j2 = this.y;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        yh0 yh0Var = this.r;
        int iHashCode = (i ^ (yh0Var == null ? 0 : yh0Var.hashCode())) * 1000003;
        Integer num = this.n;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.v;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.x;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        c24 c24Var = this.l;
        return iHashCode4 ^ (c24Var != null ? c24Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.g + ", requestUptimeMs=" + this.y + ", clientInfo=" + this.r + ", logSource=" + this.n + ", logSourceName=" + this.v + ", logEvents=" + this.x + ", qosTier=" + this.l + "}";
    }
}
