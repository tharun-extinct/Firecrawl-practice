package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h4 {
    public static final /* synthetic */ h4[] a;
    public static final h4 j;
    public static final h4 t;

    /* JADX INFO: Fake field, exist only in values array */
    h4 EF0;

    static {
        h4 h4Var = new h4("ACTIVITY", 0);
        h4 h4Var2 = new h4("BROADCAST", 1);
        j = h4Var2;
        h4 h4Var3 = new h4("SERVICE", 2);
        h4 h4Var4 = new h4("FOREGROUND_SERVICE", 3);
        h4 h4Var5 = new h4("CALLBACK", 4);
        t = h4Var5;
        a = new h4[]{h4Var, h4Var2, h4Var3, h4Var4, h4Var5};
    }

    public static h4 valueOf(String str) {
        return (h4) Enum.valueOf(h4.class, str);
    }

    public static h4[] values() {
        return (h4[]) a.clone();
    }
}
