package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b44 {
    public static final b44 a;
    public static final b44 j;
    public static final b44 m;
    public static final /* synthetic */ b44[] q;
    public static final b44 t;

    static {
        b44 b44Var = new b44("Go", 0);
        j = b44Var;
        b44 b44Var2 = new b44("Stop", 1);
        t = b44Var2;
        b44 b44Var3 = new b44("Defer", 2);
        a = b44Var3;
        b44 b44Var4 = new b44("AlreadyRetrying", 3);
        m = b44Var4;
        q = new b44[]{b44Var, b44Var2, b44Var3, b44Var4};
    }

    public static b44 valueOf(String str) {
        return (b44) Enum.valueOf(b44.class, str);
    }

    public static b44[] values() {
        return (b44[]) q.clone();
    }
}
