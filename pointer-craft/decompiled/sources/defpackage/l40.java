package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l40 {
    public static final l40 a;
    public static final l40 j;
    public static final /* synthetic */ l40[] m;
    public static final l40 t;

    static {
        l40 l40Var = new l40("MissingBluetoothPermission", 0);
        j = l40Var;
        l40 l40Var2 = new l40("BluetoothAdapterOff", 1);
        t = l40Var2;
        l40 l40Var3 = new l40("Available", 2);
        a = l40Var3;
        m = new l40[]{l40Var, l40Var2, l40Var3};
    }

    public static l40 valueOf(String str) {
        return (l40) Enum.valueOf(l40.class, str);
    }

    public static l40[] values() {
        return (l40[]) m.clone();
    }
}
