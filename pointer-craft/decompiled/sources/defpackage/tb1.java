package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tb1 {
    public static final tb1 a;
    public static final tb1 j;
    public static final tb1 m;
    public static final /* synthetic */ tb1[] q;
    public static final tb1 t;

    static {
        tb1 tb1Var = new tb1("Up", 0);
        j = tb1Var;
        tb1 tb1Var2 = new tb1("Drag", 1);
        t = tb1Var2;
        tb1 tb1Var3 = new tb1("Timeout", 2);
        a = tb1Var3;
        tb1 tb1Var4 = new tb1("Cancel", 3);
        m = tb1Var4;
        q = new tb1[]{tb1Var, tb1Var2, tb1Var3, tb1Var4};
    }

    public static tb1 valueOf(String str) {
        return (tb1) Enum.valueOf(tb1.class, str);
    }

    public static tb1[] values() {
        return (tb1[]) q.clone();
    }
}
