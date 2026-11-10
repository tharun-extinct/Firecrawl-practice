package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xf5 {
    public static final xf5 a;
    public static final xf5 j;
    public static final /* synthetic */ xf5[] m;
    public static final xf5 t;

    static {
        xf5 xf5Var = new xf5("Touchpad", 0);
        j = xf5Var;
        xf5 xf5Var2 = new xf5("Keyboard", 1);
        t = xf5Var2;
        xf5 xf5Var3 = new xf5("Controls", 2);
        a = xf5Var3;
        m = new xf5[]{xf5Var, xf5Var2, xf5Var3};
    }

    public static xf5 valueOf(String str) {
        return (xf5) Enum.valueOf(xf5.class, str);
    }

    public static xf5[] values() {
        return (xf5[]) m.clone();
    }
}
