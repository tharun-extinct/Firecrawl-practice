package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ag5 {
    public static final /* synthetic */ ag5[] a;
    public static final ag5 j;
    public static final ag5 t;

    static {
        ag5 ag5Var = new ag5("Primary", 0);
        j = ag5Var;
        ag5 ag5Var2 = new ag5("Secondary", 1);
        t = ag5Var2;
        a = new ag5[]{ag5Var, ag5Var2};
    }

    public static ag5 valueOf(String str) {
        return (ag5) Enum.valueOf(ag5.class, str);
    }

    public static ag5[] values() {
        return (ag5[]) a.clone();
    }
}
