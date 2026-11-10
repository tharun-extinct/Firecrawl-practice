package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zj3 {
    public static final zj3 a;
    public static final zj3 j;
    public static final zj3 m;
    public static final /* synthetic */ zj3[] q;
    public static final zj3 t;

    static {
        zj3 zj3Var = new zj3("Ignore", 0);
        j = zj3Var;
        zj3 zj3Var2 = new zj3("Demote", 1);
        t = zj3Var2;
        zj3 zj3Var3 = new zj3("Reconnect", 2);
        a = zj3Var3;
        zj3 zj3Var4 = new zj3("PauseUntilForeground", 3);
        m = zj3Var4;
        q = new zj3[]{zj3Var, zj3Var2, zj3Var3, zj3Var4};
    }

    public static zj3 valueOf(String str) {
        return (zj3) Enum.valueOf(zj3.class, str);
    }

    public static zj3[] values() {
        return (zj3[]) q.clone();
    }
}
