package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xr4 {
    public static final xr4 a;
    public static final xr4 j;
    public static final /* synthetic */ xr4[] m;
    public static final xr4 t;

    static {
        xr4 xr4Var = new xr4("Short", 0);
        j = xr4Var;
        xr4 xr4Var2 = new xr4("Long", 1);
        t = xr4Var2;
        xr4 xr4Var3 = new xr4("Indefinite", 2);
        a = xr4Var3;
        m = new xr4[]{xr4Var, xr4Var2, xr4Var3};
    }

    public static xr4 valueOf(String str) {
        return (xr4) Enum.valueOf(xr4.class, str);
    }

    public static xr4[] values() {
        return (xr4[]) m.clone();
    }
}
