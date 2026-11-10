package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pe5 {
    public static final pe5 a;
    public static final pe5 j;
    public static final pe5 m;
    public static final /* synthetic */ pe5[] q;
    public static final pe5 t;

    static {
        pe5 pe5Var = new pe5("SUCCESSFUL", 0);
        j = pe5Var;
        pe5 pe5Var2 = new pe5("REREGISTER", 1);
        t = pe5Var2;
        pe5 pe5Var3 = new pe5("CANCELLED", 2);
        a = pe5Var3;
        pe5 pe5Var4 = new pe5("ALREADY_SELECTED", 3);
        m = pe5Var4;
        q = new pe5[]{pe5Var, pe5Var2, pe5Var3, pe5Var4};
    }

    public static pe5 valueOf(String str) {
        return (pe5) Enum.valueOf(pe5.class, str);
    }

    public static pe5[] values() {
        return (pe5[]) q.clone();
    }
}
