package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gd5 {
    public static final gd5 a;
    public static final gd5 j;
    public static final /* synthetic */ gd5[] m;
    public static final gd5 t;

    static {
        gd5 gd5Var = new gd5("ContinueTraversal", 0);
        j = gd5Var;
        gd5 gd5Var2 = new gd5("SkipSubtreeAndContinueTraversal", 1);
        t = gd5Var2;
        gd5 gd5Var3 = new gd5("CancelTraversal", 2);
        a = gd5Var3;
        m = new gd5[]{gd5Var, gd5Var2, gd5Var3};
    }

    public static gd5 valueOf(String str) {
        return (gd5) Enum.valueOf(gd5.class, str);
    }

    public static gd5[] values() {
        return (gd5[]) m.clone();
    }
}
