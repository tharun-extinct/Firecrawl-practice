package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class da1 {
    public static final da1 a;
    public static final da1 j;
    public static final /* synthetic */ da1[] m;
    public static final da1 t;

    static {
        da1 da1Var = new da1("Vertical", 0);
        j = da1Var;
        da1 da1Var2 = new da1("Horizontal", 1);
        t = da1Var2;
        da1 da1Var3 = new da1("Both", 2);
        a = da1Var3;
        m = new da1[]{da1Var, da1Var2, da1Var3};
    }

    public static da1 valueOf(String str) {
        return (da1) Enum.valueOf(da1.class, str);
    }

    public static da1[] values() {
        return (da1[]) m.clone();
    }
}
