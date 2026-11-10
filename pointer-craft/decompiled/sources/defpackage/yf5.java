package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yf5 implements Executor {
    public static final /* synthetic */ yf5[] a;
    public static final yf5 j;
    public static final Handler t;

    static {
        yf5 yf5Var = new yf5("INSTANCE", 0);
        j = yf5Var;
        a = new yf5[]{yf5Var};
        t = new Handler(Looper.getMainLooper());
    }

    public static yf5 valueOf(String str) {
        return (yf5) Enum.valueOf(yf5.class, str);
    }

    public static yf5[] values() {
        return (yf5[]) a.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        t.post(runnable);
    }
}
