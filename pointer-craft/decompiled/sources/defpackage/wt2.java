package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wt2 {
    public static final wt2 a;
    public static final wt2 j;
    public static final wt2 m;
    public static final wt2 q;
    public static final wt2 t;
    public static final /* synthetic */ wt2[] w;

    static {
        wt2 wt2Var = new wt2("DESTROYED", 0);
        j = wt2Var;
        wt2 wt2Var2 = new wt2("INITIALIZED", 1);
        t = wt2Var2;
        wt2 wt2Var3 = new wt2("CREATED", 2);
        a = wt2Var3;
        wt2 wt2Var4 = new wt2("STARTED", 3);
        m = wt2Var4;
        wt2 wt2Var5 = new wt2("RESUMED", 4);
        q = wt2Var5;
        w = new wt2[]{wt2Var, wt2Var2, wt2Var3, wt2Var4, wt2Var5};
    }

    public static wt2 valueOf(String str) {
        return (wt2) Enum.valueOf(wt2.class, str);
    }

    public static wt2[] values() {
        return (wt2[]) w.clone();
    }
}
