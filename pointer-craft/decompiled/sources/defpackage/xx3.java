package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xx3 {
    public static final xx3 a;
    public static final xx3 j;
    public static final /* synthetic */ xx3[] m;
    public static final xx3 t;

    static {
        xx3 xx3Var = new xx3("DEFAULT", 0);
        j = xx3Var;
        xx3 xx3Var2 = new xx3("VERY_LOW", 1);
        t = xx3Var2;
        xx3 xx3Var3 = new xx3("HIGHEST", 2);
        a = xx3Var3;
        m = new xx3[]{xx3Var, xx3Var2, xx3Var3};
    }

    public static xx3 valueOf(String str) {
        return (xx3) Enum.valueOf(xx3.class, str);
    }

    public static xx3[] values() {
        return (xx3[]) m.clone();
    }
}
