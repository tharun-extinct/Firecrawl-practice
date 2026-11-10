package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xu {
    public final di0 g;
    public final HashMap y;

    public xu(di0 di0Var, HashMap map) {
        this.g = di0Var;
        this.y = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return this.g.equals(xuVar.g) && this.y.equals(xuVar.y);
    }

    public final long g(xx3 xx3Var, long j, int i) {
        long jN = j - this.g.n();
        yu yuVar = (yu) this.y.get(xx3Var);
        long j2 = yuVar.g;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jN), yuVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.g + ", values=" + this.y + "}";
    }
}
