package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ie4 {
    public static final ie4 a;
    public static final ie4 j;
    public static final /* synthetic */ ie4[] m;
    public static final ie4 t;

    static {
        ie4 ie4Var = new ie4("NETWORK_UNMETERED", 0);
        j = ie4Var;
        ie4 ie4Var2 = new ie4("DEVICE_IDLE", 1);
        t = ie4Var2;
        ie4 ie4Var3 = new ie4("DEVICE_CHARGING", 2);
        a = ie4Var3;
        m = new ie4[]{ie4Var, ie4Var2, ie4Var3};
    }

    public static ie4 valueOf(String str) {
        return (ie4) Enum.valueOf(ie4.class, str);
    }

    public static ie4[] values() {
        return (ie4[]) m.clone();
    }
}
