package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ma5 {
    public static final ma5 a;
    public static final ma5 j;
    public static final /* synthetic */ ma5[] m;
    public static final ma5 t;

    static {
        ma5 ma5Var = new ma5("Uninitialized", 0);
        j = ma5Var;
        ma5 ma5Var2 = new ma5("Detached", 1);
        t = ma5Var2;
        ma5 ma5Var3 = new ma5("Attached", 2);
        a = ma5Var3;
        m = new ma5[]{ma5Var, ma5Var2, ma5Var3};
    }

    public static ma5 valueOf(String str) {
        return (ma5) Enum.valueOf(ma5.class, str);
    }

    public static ma5[] values() {
        return (ma5[]) m.clone();
    }
}
