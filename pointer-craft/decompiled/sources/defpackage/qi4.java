package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qi4 {
    public static final qi4 a;
    public static final qi4 j;
    public static final /* synthetic */ qi4[] m;
    public static final qi4 t;

    static {
        qi4 qi4Var = new qi4("Left", 0);
        j = qi4Var;
        qi4 qi4Var2 = new qi4("Middle", 1);
        t = qi4Var2;
        qi4 qi4Var3 = new qi4("Right", 2);
        a = qi4Var3;
        m = new qi4[]{qi4Var, qi4Var2, qi4Var3};
    }

    public static qi4 valueOf(String str) {
        return (qi4) Enum.valueOf(qi4.class, str);
    }

    public static qi4[] values() {
        return (qi4[]) m.clone();
    }
}
