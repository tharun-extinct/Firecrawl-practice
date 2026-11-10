package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zd4 {
    public static final zd4 a;
    public static final zd4 j;
    public static final zd4 m;
    public static final zd4 q;
    public static final zd4 t;
    public static final /* synthetic */ zd4[] w;

    static {
        zd4 zd4Var = new zd4("TopBar", 0);
        j = zd4Var;
        zd4 zd4Var2 = new zd4("MainContent", 1);
        t = zd4Var2;
        zd4 zd4Var3 = new zd4("Snackbar", 2);
        a = zd4Var3;
        zd4 zd4Var4 = new zd4("Fab", 3);
        m = zd4Var4;
        zd4 zd4Var5 = new zd4("BottomBar", 4);
        q = zd4Var5;
        w = new zd4[]{zd4Var, zd4Var2, zd4Var3, zd4Var4, zd4Var5};
    }

    public static zd4 valueOf(String str) {
        return (zd4) Enum.valueOf(zd4.class, str);
    }

    public static zd4[] values() {
        return (zd4[]) w.clone();
    }
}
