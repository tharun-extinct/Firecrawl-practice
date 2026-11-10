package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 {
    public static final xt1 a;
    public static final xt1 j;
    public static final /* synthetic */ xt1[] m;
    public static final xt1 t;

    static {
        xt1 xt1Var = new xt1("Active", 0);
        j = xt1Var;
        xt1 xt1Var2 = new xt1("ActiveParent", 1);
        t = xt1Var2;
        xt1 xt1Var3 = new xt1("Captured", 2);
        xt1 xt1Var4 = new xt1("Inactive", 3);
        a = xt1Var4;
        m = new xt1[]{xt1Var, xt1Var2, xt1Var3, xt1Var4};
    }

    public static xt1 valueOf(String str) {
        return (xt1) Enum.valueOf(xt1.class, str);
    }

    public static xt1[] values() {
        return (xt1[]) m.clone();
    }

    public final boolean g() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        uo1.g();
        return false;
    }

    public final boolean y() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                uo1.g();
                return false;
            }
        }
        return true;
    }
}
