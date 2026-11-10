package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fu3 {
    public static final fu3 a;
    public static final fu3 j;
    public static final /* synthetic */ fu3[] m;
    public static final fu3 t;

    static {
        fu3 fu3Var = new fu3("Installed", 0);
        j = fu3Var;
        fu3 fu3Var2 = new fu3("Disabled", 1);
        t = fu3Var2;
        fu3 fu3Var3 = new fu3("Missing", 2);
        a = fu3Var3;
        m = new fu3[]{fu3Var, fu3Var2, fu3Var3};
    }

    public static fu3 valueOf(String str) {
        return (fu3) Enum.valueOf(fu3.class, str);
    }

    public static fu3[] values() {
        return (fu3[]) m.clone();
    }
}
