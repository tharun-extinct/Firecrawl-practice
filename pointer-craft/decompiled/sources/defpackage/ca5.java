package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ca5 {
    public static final ca5 a;
    public static final ca5 j;
    public static final /* synthetic */ ca5[] m;
    public static final ca5 t;

    static {
        ca5 ca5Var = new ca5("On", 0);
        j = ca5Var;
        ca5 ca5Var2 = new ca5("Off", 1);
        t = ca5Var2;
        ca5 ca5Var3 = new ca5("Indeterminate", 2);
        a = ca5Var3;
        m = new ca5[]{ca5Var, ca5Var2, ca5Var3};
    }

    public static ca5 valueOf(String str) {
        return (ca5) Enum.valueOf(ca5.class, str);
    }

    public static ca5[] values() {
        return (ca5[]) m.clone();
    }
}
