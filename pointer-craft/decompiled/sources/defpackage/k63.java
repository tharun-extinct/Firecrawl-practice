package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k63 {
    public static final k63 a;
    public static final k63 j;
    public static final /* synthetic */ k63[] m;
    public static final k63 t;

    static {
        k63 k63Var = new k63("Activated", 0);
        j = k63Var;
        k63 k63Var2 = new k63("Toggled", 1);
        t = k63Var2;
        k63 k63Var3 = new k63("Deactivated", 2);
        a = k63Var3;
        m = new k63[]{k63Var, k63Var2, k63Var3};
    }

    public static k63 valueOf(String str) {
        return (k63) Enum.valueOf(k63.class, str);
    }

    public static k63[] values() {
        return (k63[]) m.clone();
    }
}
