package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qi3 {
    public static final qi3 a;
    public static final qi3 j;
    public static final /* synthetic */ qi3[] m;
    public static final qi3 t;

    static {
        qi3 qi3Var = new qi3("NO_OP", 0);
        j = qi3Var;
        qi3 qi3Var2 = new qi3("ADD", 1);
        t = qi3Var2;
        qi3 qi3Var3 = new qi3("REMOVE", 2);
        a = qi3Var3;
        m = new qi3[]{qi3Var, qi3Var2, qi3Var3};
    }

    public static qi3 valueOf(String str) {
        return (qi3) Enum.valueOf(qi3.class, str);
    }

    public static qi3[] values() {
        return (qi3[]) m.clone();
    }
}
