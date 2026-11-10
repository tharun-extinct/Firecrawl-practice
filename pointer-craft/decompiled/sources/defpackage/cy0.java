package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cy0 {
    public static final cy0 a;
    public static final cy0 j;
    public static final /* synthetic */ cy0[] m;
    public static final cy0 t;

    static {
        cy0 cy0Var = new cy0("CROSSED", 0);
        j = cy0Var;
        cy0 cy0Var2 = new cy0("NOT_CROSSED", 1);
        t = cy0Var2;
        cy0 cy0Var3 = new cy0("COLLAPSED", 2);
        a = cy0Var3;
        m = new cy0[]{cy0Var, cy0Var2, cy0Var3};
    }

    public static cy0 valueOf(String str) {
        return (cy0) Enum.valueOf(cy0.class, str);
    }

    public static cy0[] values() {
        return (cy0[]) m.clone();
    }
}
