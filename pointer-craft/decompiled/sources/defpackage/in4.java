package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class in4 {
    public static final in4 a;
    public static final in4 b;
    public static final in4 c;
    public static final in4 i;
    public static final in4 j;
    public static final in4 m;
    public static final /* synthetic */ in4[] p;
    public static final in4 q;
    public static final in4 s;
    public static final in4 t;
    public static final in4 w;

    /* JADX INFO: Fake field, exist only in values array */
    in4 EF0;

    static {
        in4 in4Var = new in4("CornerExtraExtraLarge", 0);
        in4 in4Var2 = new in4("CornerExtraLarge", 1);
        j = in4Var2;
        in4 in4Var3 = new in4("CornerExtraLargeIncreased", 2);
        in4 in4Var4 = new in4("CornerExtraLargeTop", 3);
        t = in4Var4;
        in4 in4Var5 = new in4("CornerExtraSmall", 4);
        a = in4Var5;
        in4 in4Var6 = new in4("CornerExtraSmallTop", 5);
        m = in4Var6;
        in4 in4Var7 = new in4("CornerFull", 6);
        q = in4Var7;
        in4 in4Var8 = new in4("CornerLarge", 7);
        w = in4Var8;
        in4 in4Var9 = new in4("CornerLargeEnd", 8);
        c = in4Var9;
        in4 in4Var10 = new in4("CornerLargeIncreased", 9);
        in4 in4Var11 = new in4("CornerLargeStart", 10);
        in4 in4Var12 = new in4("CornerLargeTop", 11);
        in4 in4Var13 = new in4("CornerMedium", 12);
        i = in4Var13;
        in4 in4Var14 = new in4("CornerNone", 13);
        b = in4Var14;
        in4 in4Var15 = new in4("CornerSmall", 14);
        s = in4Var15;
        p = new in4[]{in4Var, in4Var2, in4Var3, in4Var4, in4Var5, in4Var6, in4Var7, in4Var8, in4Var9, in4Var10, in4Var11, in4Var12, in4Var13, in4Var14, in4Var15};
    }

    public static in4 valueOf(String str) {
        return (in4) Enum.valueOf(in4.class, str);
    }

    public static in4[] values() {
        return (in4[]) p.clone();
    }
}
