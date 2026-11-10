package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 {
    public static final zf0 a;
    public static final zf0 j;
    public static final zf0 m;
    public static final /* synthetic */ zf0[] q;
    public static final zf0 t;

    static {
        zf0 zf0Var = new zf0("Successful", 0);
        j = zf0Var;
        zf0 zf0Var2 = new zf0("ServiceNotFound", 1);
        t = zf0Var2;
        zf0 zf0Var3 = new zf0("MissingPermission", 2);
        a = zf0Var3;
        zf0 zf0Var4 = new zf0("BluetoothDisabled", 3);
        m = zf0Var4;
        q = new zf0[]{zf0Var, zf0Var2, zf0Var3, zf0Var4};
    }

    public static zf0 valueOf(String str) {
        return (zf0) Enum.valueOf(zf0.class, str);
    }

    public static zf0[] values() {
        return (zf0[]) q.clone();
    }
}
