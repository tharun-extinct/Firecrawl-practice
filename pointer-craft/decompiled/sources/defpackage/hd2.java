package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hd2 {
    public static final hd2 a;
    public static final hd2 j;
    public static final /* synthetic */ hd2[] m;
    public static final hd2 t;

    static {
        hd2 hd2Var = new hd2("Focused", 0);
        j = hd2Var;
        hd2 hd2Var2 = new hd2("UnfocusedEmpty", 1);
        t = hd2Var2;
        hd2 hd2Var3 = new hd2("UnfocusedNotEmpty", 2);
        a = hd2Var3;
        m = new hd2[]{hd2Var, hd2Var2, hd2Var3};
    }

    public static hd2 valueOf(String str) {
        return (hd2) Enum.valueOf(hd2.class, str);
    }

    public static hd2[] values() {
        return (hd2[]) m.clone();
    }
}
