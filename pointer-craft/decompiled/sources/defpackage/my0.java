package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class my0 {
    public static final my0 a;
    public static final my0 j;
    public static final /* synthetic */ my0[] m;
    public static final my0 t;

    static {
        my0 my0Var = new my0("None", 0);
        j = my0Var;
        my0 my0Var2 = new my0("Cancelled", 1);
        t = my0Var2;
        my0 my0Var3 = new my0("Redirected", 2);
        a = my0Var3;
        m = new my0[]{my0Var, my0Var2, my0Var3, new my0("RedirectCancelled", 3)};
    }

    public static my0 valueOf(String str) {
        return (my0) Enum.valueOf(my0.class, str);
    }

    public static my0[] values() {
        return (my0[]) m.clone();
    }
}
