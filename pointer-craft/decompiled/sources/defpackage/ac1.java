package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ac1 {
    public static final /* synthetic */ ac1[] a;
    public static final ac1 j;
    public static final ac1 t;

    static {
        ac1 ac1Var = new ac1("Start", 0);
        j = ac1Var;
        ac1 ac1Var2 = new ac1("End", 1);
        t = ac1Var2;
        a = new ac1[]{ac1Var, ac1Var2};
    }

    public static ac1 valueOf(String str) {
        return (ac1) Enum.valueOf(ac1.class, str);
    }

    public static ac1[] values() {
        return (ac1[]) a.clone();
    }
}
