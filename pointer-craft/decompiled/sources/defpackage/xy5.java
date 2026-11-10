package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class xy5 {
    public static final lr2 g;

    static {
        lr2 vy5Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            vy5Var = new ty5();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            vy5Var = new vy5();
        }
        g = vy5Var;
    }
}
