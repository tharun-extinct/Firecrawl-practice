package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class px0 {
    public static final px0 a;
    public static final px0 j;
    public static final /* synthetic */ px0[] m;
    public static final px0 t;

    static {
        px0 px0Var = new px0("COROUTINE_SUSPENDED", 0);
        j = px0Var;
        px0 px0Var2 = new px0("UNDECIDED", 1);
        t = px0Var2;
        px0 px0Var3 = new px0("RESUMED", 2);
        a = px0Var3;
        m = new px0[]{px0Var, px0Var2, px0Var3};
    }

    public static px0 valueOf(String str) {
        return (px0) Enum.valueOf(px0.class, str);
    }

    public static px0[] values() {
        return (px0[]) m.clone();
    }
}
