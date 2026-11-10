package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xh0 {
    public static final xh0 j;
    public static final /* synthetic */ xh0[] t;

    /* JADX INFO: Fake field, exist only in values array */
    xh0 EF0;

    static {
        xh0 xh0Var = new xh0("UNKNOWN", 0);
        xh0 xh0Var2 = new xh0("ANDROID_FIREBASE", 1);
        j = xh0Var2;
        t = new xh0[]{xh0Var, xh0Var2};
    }

    public static xh0 valueOf(String str) {
        return (xh0) Enum.valueOf(xh0.class, str);
    }

    public static xh0[] values() {
        return (xh0[]) t.clone();
    }
}
