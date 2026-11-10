package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y64 {
    public static final y64 j;
    public static final /* synthetic */ y64[] t;

    static {
        y64 y64Var = new y64("Restart", 0);
        j = y64Var;
        t = new y64[]{y64Var, new y64("Reverse", 1)};
    }

    public static y64 valueOf(String str) {
        return (y64) Enum.valueOf(y64.class, str);
    }

    public static y64[] values() {
        return (y64[]) t.clone();
    }
}
