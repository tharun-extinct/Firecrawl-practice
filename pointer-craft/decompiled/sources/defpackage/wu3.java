package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wu3 {
    public static final wu3 a;
    public static final wu3 j;
    public static final /* synthetic */ wu3[] m;
    public static final wu3 t;

    static {
        wu3 wu3Var = new wu3("Unknown", 0);
        j = wu3Var;
        wu3 wu3Var2 = new wu3("Dispatching", 1);
        t = wu3Var2;
        wu3 wu3Var3 = new wu3("NotDispatching", 2);
        a = wu3Var3;
        m = new wu3[]{wu3Var, wu3Var2, wu3Var3};
    }

    public static wu3 valueOf(String str) {
        return (wu3) Enum.valueOf(wu3.class, str);
    }

    public static wu3[] values() {
        return (wu3[]) m.clone();
    }
}
