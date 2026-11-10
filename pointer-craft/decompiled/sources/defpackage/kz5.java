package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kz5 {
    public final lr2 g;
    public long n;
    public long r;
    public boolean y;

    public kz5(lr2 lr2Var) {
        if (lr2Var != null) {
            this.g = lr2Var;
        } else {
            l0.q("ticker");
            throw null;
        }
    }

    public final void g() {
        if (this.y) {
            l0.z("This stopwatch is already running.");
        } else {
            this.y = true;
            this.n = this.g.J();
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long J = this.y ? (this.g.J() - this.n) + this.r : this.r;
        long j = J / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (J / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (J / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (J / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (J / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = J / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(J / timeUnit2.convert(1L, timeUnit)));
        switch (hz5.g[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return du4.i(str2, " ", str);
    }
}
