package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public enum pf1 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    public final TimeUnit j;

    pf1(TimeUnit timeUnit) {
        this.j = timeUnit;
    }
}
