package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ez2 {
    public static final ez2 a;
    public static final ez2 j;
    public static final /* synthetic */ ez2[] m;
    public static final ez2 t;

    static {
        ez2 ez2Var = new ez2("IsPlacedInLookahead", 0);
        j = ez2Var;
        ez2 ez2Var2 = new ez2("IsPlacedInApproach", 1);
        t = ez2Var2;
        ez2 ez2Var3 = new ez2("IsNotPlaced", 2);
        a = ez2Var3;
        m = new ez2[]{ez2Var, ez2Var2, ez2Var3};
    }

    public static ez2 valueOf(String str) {
        return (ez2) Enum.valueOf(ez2.class, str);
    }

    public static ez2[] values() {
        return (ez2[]) m.clone();
    }
}
