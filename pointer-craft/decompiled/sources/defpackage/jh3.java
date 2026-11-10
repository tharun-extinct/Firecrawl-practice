package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jh3 {
    public static final /* synthetic */ jh3[] a;
    public static final jh3 j;
    public static final jh3 t;

    static {
        jh3 jh3Var = new jh3("Min", 0);
        j = jh3Var;
        jh3 jh3Var2 = new jh3("Max", 1);
        t = jh3Var2;
        a = new jh3[]{jh3Var, jh3Var2};
    }

    public static jh3 valueOf(String str) {
        return (jh3) Enum.valueOf(jh3.class, str);
    }

    public static jh3[] values() {
        return (jh3[]) a.clone();
    }
}
