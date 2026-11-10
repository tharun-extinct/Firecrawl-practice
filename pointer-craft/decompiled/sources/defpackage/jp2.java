package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jp2 {
    public static final jp2 a;
    public static final jp2 j;
    public static final jp2 m;
    public static final /* synthetic */ jp2[] q;
    public static final jp2 t;

    static {
        jp2 jp2Var = new jp2("Wrap", 0);
        j = jp2Var;
        jp2 jp2Var2 = new jp2("Fixed", 1);
        t = jp2Var2;
        jp2 jp2Var3 = new jp2("Expand", 2);
        a = jp2Var3;
        jp2 jp2Var4 = new jp2("MatchParent", 3);
        m = jp2Var4;
        q = new jp2[]{jp2Var, jp2Var2, jp2Var3, jp2Var4};
    }

    public static jp2 valueOf(String str) {
        return (jp2) Enum.valueOf(jp2.class, str);
    }

    public static jp2[] values() {
        return (jp2[]) q.clone();
    }
}
