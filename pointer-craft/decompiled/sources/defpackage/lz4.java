package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lz4 {
    public static final lz4 a;
    public static final lz4 j;
    public static final lz4 m;
    public static final lz4 q;
    public static final lz4 t;
    public static final /* synthetic */ lz4[] w;

    static {
        lz4 lz4Var = new lz4("END", 0);
        j = lz4Var;
        lz4 lz4Var2 = new lz4("ROLLBACK", 1);
        t = lz4Var2;
        lz4 lz4Var3 = new lz4("BEGIN_EXCLUSIVE", 2);
        a = lz4Var3;
        lz4 lz4Var4 = new lz4("BEGIN_IMMEDIATE", 3);
        m = lz4Var4;
        lz4 lz4Var5 = new lz4("BEGIN_DEFERRED", 4);
        q = lz4Var5;
        w = new lz4[]{lz4Var, lz4Var2, lz4Var3, lz4Var4, lz4Var5};
    }

    public static lz4 valueOf(String str) {
        return (lz4) Enum.valueOf(lz4.class, str);
    }

    public static lz4[] values() {
        return (lz4[]) w.clone();
    }
}
