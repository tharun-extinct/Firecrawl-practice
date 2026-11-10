package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ku3 {
    public static final ku3 a;
    public static final ku3 j;
    public static final /* synthetic */ ku3[] m;
    public static final ku3 t;

    static {
        ku3 ku3Var = new ku3("Initial", 0);
        j = ku3Var;
        ku3 ku3Var2 = new ku3("Main", 1);
        t = ku3Var2;
        ku3 ku3Var3 = new ku3("Final", 2);
        a = ku3Var3;
        m = new ku3[]{ku3Var, ku3Var2, ku3Var3};
    }

    public static ku3 valueOf(String str) {
        return (ku3) Enum.valueOf(ku3.class, str);
    }

    public static ku3[] values() {
        return (ku3[]) m.clone();
    }
}
