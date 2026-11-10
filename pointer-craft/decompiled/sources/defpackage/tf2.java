package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tf2 {
    public static final /* synthetic */ tf2[] a;
    public static final tf2 j;
    public static final tf2 t;

    static {
        tf2 tf2Var = new tf2("Min", 0);
        j = tf2Var;
        tf2 tf2Var2 = new tf2("Max", 1);
        t = tf2Var2;
        a = new tf2[]{tf2Var, tf2Var2};
    }

    public static tf2 valueOf(String str) {
        return (tf2) Enum.valueOf(tf2.class, str);
    }

    public static tf2[] values() {
        return (tf2[]) a.clone();
    }
}
