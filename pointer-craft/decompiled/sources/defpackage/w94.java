package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w94 {
    public static final /* synthetic */ w94[] a;
    public static final w94 j;
    public static final w94 t;

    /* JADX INFO: Fake field, exist only in values array */
    w94 EF0;

    static {
        w94 w94Var = new w94("AUTOMATIC", 0);
        w94 w94Var2 = new w94("TRUNCATE", 1);
        j = w94Var2;
        w94 w94Var3 = new w94("WRITE_AHEAD_LOGGING", 2);
        t = w94Var3;
        a = new w94[]{w94Var, w94Var2, w94Var3};
    }

    public static w94 valueOf(String str) {
        return (w94) Enum.valueOf(w94.class, str);
    }

    public static w94[] values() {
        return (w94[]) a.clone();
    }
}
