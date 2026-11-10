package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 {
    public static final oq0 a;
    public static final oq0 j;
    public static final /* synthetic */ oq0[] m;
    public static final oq0 t;

    static {
        oq0 oq0Var = new oq0("CONNECTED", 0);
        j = oq0Var;
        oq0 oq0Var2 = new oq0("CONNECTING", 1);
        t = oq0Var2;
        oq0 oq0Var3 = new oq0("DISCONNECTED", 2);
        a = oq0Var3;
        m = new oq0[]{oq0Var, oq0Var2, oq0Var3};
    }

    public static oq0 valueOf(String str) {
        return (oq0) Enum.valueOf(oq0.class, str);
    }

    public static oq0[] values() {
        return (oq0[]) m.clone();
    }
}
