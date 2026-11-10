package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xq4 {
    public static final /* synthetic */ xq4[] a;
    public static final xq4 j;
    public static final xq4 t;

    static {
        xq4 xq4Var = new xq4("THUMB", 0);
        j = xq4Var;
        xq4 xq4Var2 = new xq4("TRACK", 1);
        t = xq4Var2;
        a = new xq4[]{xq4Var, xq4Var2};
    }

    public static xq4 valueOf(String str) {
        return (xq4) Enum.valueOf(xq4.class, str);
    }

    public static xq4[] values() {
        return (xq4[]) a.clone();
    }
}
