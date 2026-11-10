package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jh0 {
    public static final jh0 a;
    public static final jh0 j;
    public static final /* synthetic */ jh0[] m;
    public static final /* synthetic */ jk1 q;
    public static final jh0 t;

    static {
        jh0 jh0Var = new jh0("UnlockDeveloperOptions", 0);
        j = jh0Var;
        jh0 jh0Var2 = new jh0("TurnOnProfile", 1);
        t = jh0Var2;
        jh0 jh0Var3 = new jh0("RestartBluetooth", 2);
        a = jh0Var3;
        jh0[] jh0VarArr = {jh0Var, jh0Var2, jh0Var3};
        m = jh0VarArr;
        q = new jk1(jh0VarArr);
    }

    public static jh0 valueOf(String str) {
        return (jh0) Enum.valueOf(jh0.class, str);
    }

    public static jh0[] values() {
        return (jh0[]) m.clone();
    }
}
