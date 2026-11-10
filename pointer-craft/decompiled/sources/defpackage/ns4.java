package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ns4 {
    public static final /* synthetic */ ns4[] a;
    public static final ns4 j;
    public static final ns4 t;

    static {
        ns4 ns4Var = new ns4("Dismissed", 0);
        j = ns4Var;
        ns4 ns4Var2 = new ns4("ActionPerformed", 1);
        t = ns4Var2;
        a = new ns4[]{ns4Var, ns4Var2};
    }

    public static ns4 valueOf(String str) {
        return (ns4) Enum.valueOf(ns4.class, str);
    }

    public static ns4[] values() {
        return (ns4[]) a.clone();
    }
}
