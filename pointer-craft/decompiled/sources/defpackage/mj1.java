package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 {
    public static final mj1 a;
    public static final mj1 j;
    public static final /* synthetic */ mj1[] m;
    public static final mj1 t;

    static {
        mj1 mj1Var = new mj1("PreEnter", 0);
        j = mj1Var;
        mj1 mj1Var2 = new mj1("Visible", 1);
        t = mj1Var2;
        mj1 mj1Var3 = new mj1("PostExit", 2);
        a = mj1Var3;
        m = new mj1[]{mj1Var, mj1Var2, mj1Var3};
    }

    public static mj1 valueOf(String str) {
        return (mj1) Enum.valueOf(mj1.class, str);
    }

    public static mj1[] values() {
        return (mj1[]) m.clone();
    }
}
