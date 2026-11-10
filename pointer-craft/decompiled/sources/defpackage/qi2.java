package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qi2 {
    public static final qi2 a;
    public static final qi2 j;
    public static final /* synthetic */ qi2[] m;
    public static final qi2 t;

    static {
        qi2 qi2Var = new qi2("SHORTCUT", 0);
        j = qi2Var;
        qi2 qi2Var2 = new qi2("CONSUMER", 1);
        t = qi2Var2;
        qi2 qi2Var3 = new qi2("SPECIAL_FUNCTION", 2);
        a = qi2Var3;
        m = new qi2[]{qi2Var, qi2Var2, qi2Var3};
    }

    public static qi2 valueOf(String str) {
        return (qi2) Enum.valueOf(qi2.class, str);
    }

    public static qi2[] values() {
        return (qi2[]) m.clone();
    }
}
