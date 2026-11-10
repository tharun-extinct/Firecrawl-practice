package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zl2 {
    public static final zl2 a;
    public static final t32 j;
    public static final zl2 m;
    public static final zl2 q;
    public static final zl2 t;
    public static final /* synthetic */ zl2[] w;

    static {
        zl2 zl2Var = new zl2("LAYOUT_NOT_FOUND", 0);
        t = zl2Var;
        zl2 zl2Var2 = new zl2("NETWORK_ERROR", 1);
        a = zl2Var2;
        zl2 zl2Var3 = new zl2("SAVE_ERROR", 2);
        m = zl2Var3;
        zl2 zl2Var4 = new zl2("UNKNOWN", 3);
        q = zl2Var4;
        w = new zl2[]{zl2Var, zl2Var2, zl2Var3, zl2Var4};
        j = new t32((byte) 23);
    }

    public static zl2 valueOf(String str) {
        return (zl2) Enum.valueOf(zl2.class, str);
    }

    public static zl2[] values() {
        return (zl2[]) w.clone();
    }
}
