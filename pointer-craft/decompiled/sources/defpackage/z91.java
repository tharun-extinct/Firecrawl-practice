package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z91 implements Executor {
    public static final z91 j;
    public static final /* synthetic */ z91[] t;

    static {
        z91 z91Var = new z91("INSTANCE", 0);
        j = z91Var;
        t = new z91[]{z91Var};
    }

    public static z91 valueOf(String str) {
        return (z91) Enum.valueOf(z91.class, str);
    }

    public static z91[] values() {
        return (z91[]) t.clone();
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
