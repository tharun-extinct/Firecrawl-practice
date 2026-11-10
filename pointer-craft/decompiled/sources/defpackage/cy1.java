package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cy1 {
    public static final cy1 a;
    public static final cy1 j;
    public static final cy1 m;
    public static final cy1 q;
    public static final cy1 t;
    public static final /* synthetic */ cy1[] w;

    static {
        cy1 cy1Var = new cy1("ON_CONFIGURE", 0);
        j = cy1Var;
        cy1 cy1Var2 = new cy1("ON_CREATE", 1);
        t = cy1Var2;
        cy1 cy1Var3 = new cy1("ON_UPGRADE", 2);
        a = cy1Var3;
        cy1 cy1Var4 = new cy1("ON_DOWNGRADE", 3);
        m = cy1Var4;
        cy1 cy1Var5 = new cy1("ON_OPEN", 4);
        q = cy1Var5;
        w = new cy1[]{cy1Var, cy1Var2, cy1Var3, cy1Var4, cy1Var5};
    }

    public static cy1 valueOf(String str) {
        return (cy1) Enum.valueOf(cy1.class, str);
    }

    public static cy1[] values() {
        return (cy1[]) w.clone();
    }
}
