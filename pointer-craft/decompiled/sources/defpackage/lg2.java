package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lg2 {
    public static final lg2 a;
    public static final lg2 j;
    public static final lg2 m;
    public static final /* synthetic */ lg2[] q;
    public static final lg2 t;

    static {
        lg2 lg2Var = new lg2("LookaheadMeasurement", 0);
        j = lg2Var;
        lg2 lg2Var2 = new lg2("LookaheadPlacement", 1);
        t = lg2Var2;
        lg2 lg2Var3 = new lg2("Measurement", 2);
        a = lg2Var3;
        lg2 lg2Var4 = new lg2("Placement", 3);
        m = lg2Var4;
        q = new lg2[]{lg2Var, lg2Var2, lg2Var3, lg2Var4};
    }

    public static lg2 valueOf(String str) {
        return (lg2) Enum.valueOf(lg2.class, str);
    }

    public static lg2[] values() {
        return (lg2[]) q.clone();
    }
}
