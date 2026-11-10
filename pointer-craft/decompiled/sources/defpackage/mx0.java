package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 {
    public static final mx0 a;
    public static final mx0 j;
    public static final mx0 m;
    public static final mx0 q;
    public static final mx0 t;
    public static final /* synthetic */ mx0[] w;

    static {
        mx0 mx0Var = new mx0("CPU_ACQUIRED", 0);
        j = mx0Var;
        mx0 mx0Var2 = new mx0("BLOCKING", 1);
        t = mx0Var2;
        mx0 mx0Var3 = new mx0("PARKING", 2);
        a = mx0Var3;
        mx0 mx0Var4 = new mx0("DORMANT", 3);
        m = mx0Var4;
        mx0 mx0Var5 = new mx0("TERMINATED", 4);
        q = mx0Var5;
        w = new mx0[]{mx0Var, mx0Var2, mx0Var3, mx0Var4, mx0Var5};
    }

    public static mx0 valueOf(String str) {
        return (mx0) Enum.valueOf(mx0.class, str);
    }

    public static mx0[] values() {
        return (mx0[]) w.clone();
    }
}
