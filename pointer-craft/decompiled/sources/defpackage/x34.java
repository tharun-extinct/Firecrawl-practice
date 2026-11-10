package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x34 {
    public static final x34 a;
    public static final /* synthetic */ x34[] c;
    public static final x34 j;
    public static final x34 m;
    public static final x34 q;
    public static final x34 t;
    public static final x34 w;

    static {
        x34 x34Var = new x34("ShutDown", 0);
        j = x34Var;
        x34 x34Var2 = new x34("ShuttingDown", 1);
        t = x34Var2;
        x34 x34Var3 = new x34("Inactive", 2);
        a = x34Var3;
        x34 x34Var4 = new x34("InactivePendingWork", 3);
        m = x34Var4;
        x34 x34Var5 = new x34("Idle", 4);
        q = x34Var5;
        x34 x34Var6 = new x34("PendingWork", 5);
        w = x34Var6;
        c = new x34[]{x34Var, x34Var2, x34Var3, x34Var4, x34Var5, x34Var6};
    }

    public static x34 valueOf(String str) {
        return (x34) Enum.valueOf(x34.class, str);
    }

    public static x34[] values() {
        return (x34[]) c.clone();
    }
}
