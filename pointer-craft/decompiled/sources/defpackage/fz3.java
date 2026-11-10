package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fz3 {
    public static final fz3 a;
    public static final fz3 j;
    public static final fz3 m;
    public static final /* synthetic */ fz3[] q;
    public static final fz3 t;

    static {
        fz3 fz3Var = new fz3("Loading", 0);
        j = fz3Var;
        fz3 fz3Var2 = new fz3("Available", 1);
        t = fz3Var2;
        fz3 fz3Var3 = new fz3("Retryable", 2);
        a = fz3Var3;
        fz3 fz3Var4 = new fz3("Unavailable", 3);
        m = fz3Var4;
        q = new fz3[]{fz3Var, fz3Var2, fz3Var3, fz3Var4};
    }

    public static fz3 valueOf(String str) {
        return (fz3) Enum.valueOf(fz3.class, str);
    }

    public static fz3[] values() {
        return (fz3[]) q.clone();
    }
}
