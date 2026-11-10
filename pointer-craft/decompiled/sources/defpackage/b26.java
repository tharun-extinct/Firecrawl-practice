package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b26 implements Executor {
    public static final b26 j;
    public static final /* synthetic */ b26[] t;

    static {
        b26 b26Var = new b26("INSTANCE", 0);
        j = b26Var;
        t = new b26[]{b26Var};
    }

    public static b26[] values() {
        return (b26[]) t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
