package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xn5 {
    public static final xn5 a;
    public static final xn5 j;
    public static final /* synthetic */ xn5[] m;
    public static final /* synthetic */ jk1 q;
    public static final xn5 t;

    static {
        xn5 xn5Var = new xn5("CONNECTED", 0);
        j = xn5Var;
        xn5 xn5Var2 = new xn5("CONNECTING", 1);
        t = xn5Var2;
        xn5 xn5Var3 = new xn5("DISCONNECTED", 2);
        a = xn5Var3;
        xn5[] xn5VarArr = {xn5Var, xn5Var2, xn5Var3};
        m = xn5VarArr;
        q = new jk1(xn5VarArr);
    }

    public static xn5 valueOf(String str) {
        return (xn5) Enum.valueOf(xn5.class, str);
    }

    public static xn5[] values() {
        return (xn5[]) m.clone();
    }
}
