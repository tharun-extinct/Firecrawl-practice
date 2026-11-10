package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ba1 implements Executor {
    public static final ba1 j;
    public static final /* synthetic */ ba1[] t;

    static {
        ba1 ba1Var = new ba1("INSTANCE", 0);
        j = ba1Var;
        t = new ba1[]{ba1Var};
    }

    public static ba1 valueOf(String str) {
        return (ba1) Enum.valueOf(ba1.class, str);
    }

    public static ba1[] values() {
        return (ba1[]) t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
