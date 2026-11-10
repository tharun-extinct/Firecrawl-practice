package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 {
    public static final dq0 a;
    public static final dq0 j;
    public static final /* synthetic */ dq0[] m;
    public static final dq0 t;

    static {
        dq0 dq0Var = new dq0("Classic", 0);
        j = dq0Var;
        dq0 dq0Var2 = new dq0("Ble", 1);
        t = dq0Var2;
        dq0 dq0Var3 = new dq0("None", 2);
        a = dq0Var3;
        m = new dq0[]{dq0Var, dq0Var2, dq0Var3};
    }

    public static dq0 valueOf(String str) {
        return (dq0) Enum.valueOf(dq0.class, str);
    }

    public static dq0[] values() {
        return (dq0[]) m.clone();
    }
}
