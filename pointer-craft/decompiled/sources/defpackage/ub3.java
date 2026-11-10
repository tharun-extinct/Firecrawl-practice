package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ub3 {
    public static final ub3 a;
    public static final ub3 j;
    public static final /* synthetic */ ub3[] m;
    public static final ub3 t;

    static {
        ub3 ub3Var = new ub3("Default", 0);
        j = ub3Var;
        ub3 ub3Var2 = new ub3("UserInput", 1);
        t = ub3Var2;
        ub3 ub3Var3 = new ub3("PreventUserInput", 2);
        a = ub3Var3;
        m = new ub3[]{ub3Var, ub3Var2, ub3Var3};
    }

    public static ub3 valueOf(String str) {
        return (ub3) Enum.valueOf(ub3.class, str);
    }

    public static ub3[] values() {
        return (ub3[]) m.clone();
    }
}
