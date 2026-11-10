package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xm5 {
    public static final xm5 j;
    public static final /* synthetic */ xm5[] t;

    static {
        xm5 xm5Var = new xm5("Visible", 0);
        j = xm5Var;
        t = new xm5[]{xm5Var, new xm5("Invisible", 1), new xm5("Gone", 2)};
    }

    public static xm5 valueOf(String str) {
        return (xm5) Enum.valueOf(xm5.class, str);
    }

    public static xm5[] values() {
        return (xm5[]) t.clone();
    }
}
