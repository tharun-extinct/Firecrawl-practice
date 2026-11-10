package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class de4 {
    public static final de4 a;
    public static final de4 j;
    public static final /* synthetic */ de4[] m;
    public static final de4 t;

    static {
        de4 de4Var = new de4("None", 0);
        j = de4Var;
        de4 de4Var2 = new de4("Connectable", 1);
        t = de4Var2;
        de4 de4Var3 = new de4("ConnectableDiscoverable", 2);
        a = de4Var3;
        m = new de4[]{de4Var, de4Var2, de4Var3};
    }

    public static de4 valueOf(String str) {
        return (de4) Enum.valueOf(de4.class, str);
    }

    public static de4[] values() {
        return (de4[]) m.clone();
    }
}
