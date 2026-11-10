package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nf5 {
    public static final nf5 a;
    public static final nf5 b;
    public static final nf5 c;
    public static final nf5 i;
    public static final nf5 j;
    public static final nf5 m;
    public static final nf5 q;
    public static final /* synthetic */ nf5[] s;
    public static final nf5 t;
    public static final nf5 w;

    static {
        nf5 nf5Var = new nf5("BodyLarge", 0);
        j = nf5Var;
        nf5 nf5Var2 = new nf5("BodyMedium", 1);
        t = nf5Var2;
        nf5 nf5Var3 = new nf5("BodySmall", 2);
        a = nf5Var3;
        nf5 nf5Var4 = new nf5("DisplayLarge", 3);
        nf5 nf5Var5 = new nf5("DisplayMedium", 4);
        nf5 nf5Var6 = new nf5("DisplaySmall", 5);
        nf5 nf5Var7 = new nf5("HeadlineLarge", 6);
        nf5 nf5Var8 = new nf5("HeadlineMedium", 7);
        nf5 nf5Var9 = new nf5("HeadlineSmall", 8);
        m = nf5Var9;
        nf5 nf5Var10 = new nf5("LabelLarge", 9);
        q = nf5Var10;
        nf5 nf5Var11 = new nf5("LabelMedium", 10);
        w = nf5Var11;
        nf5 nf5Var12 = new nf5("LabelSmall", 11);
        c = nf5Var12;
        nf5 nf5Var13 = new nf5("TitleLarge", 12);
        i = nf5Var13;
        nf5 nf5Var14 = new nf5("TitleMedium", 13);
        nf5 nf5Var15 = new nf5("TitleSmall", 14);
        b = nf5Var15;
        s = new nf5[]{nf5Var, nf5Var2, nf5Var3, nf5Var4, nf5Var5, nf5Var6, nf5Var7, nf5Var8, nf5Var9, nf5Var10, nf5Var11, nf5Var12, nf5Var13, nf5Var14, nf5Var15, new nf5("BodyLargeEmphasized", 15), new nf5("BodyMediumEmphasized", 16), new nf5("BodySmallEmphasized", 17), new nf5("DisplayLargeEmphasized", 18), new nf5("DisplayMediumEmphasized", 19), new nf5("DisplaySmallEmphasized", 20), new nf5("HeadlineLargeEmphasized", 21), new nf5("HeadlineMediumEmphasized", 22), new nf5("HeadlineSmallEmphasized", 23), new nf5("LabelLargeEmphasized", 24), new nf5("LabelMediumEmphasized", 25), new nf5("LabelSmallEmphasized", 26), new nf5("TitleLargeEmphasized", 27), new nf5("TitleMediumEmphasized", 28), new nf5("TitleSmallEmphasized", 29)};
    }

    public static nf5 valueOf(String str) {
        return (nf5) Enum.valueOf(nf5.class, str);
    }

    public static nf5[] values() {
        return (nf5[]) s.clone();
    }
}
