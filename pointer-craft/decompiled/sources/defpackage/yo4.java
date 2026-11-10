package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yo4 {
    public static final yo4 a;
    public static final yo4 j;
    public static final /* synthetic */ yo4[] m;
    public static final yo4 t;

    static {
        yo4 yo4Var = new yo4("Hidden", 0);
        j = yo4Var;
        yo4 yo4Var2 = new yo4("Expanded", 1);
        t = yo4Var2;
        yo4 yo4Var3 = new yo4("PartiallyExpanded", 2);
        a = yo4Var3;
        m = new yo4[]{yo4Var, yo4Var2, yo4Var3};
    }

    public static yo4 valueOf(String str) {
        return (yo4) Enum.valueOf(yo4.class, str);
    }

    public static yo4[] values() {
        return (yo4[]) m.clone();
    }
}
