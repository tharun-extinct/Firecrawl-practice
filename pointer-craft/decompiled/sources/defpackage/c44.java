package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c44 {
    public static final c44 a;
    public static final c44 j;
    public static final c44 m;
    public static final /* synthetic */ c44[] q;
    public static final c44 t;

    static {
        c44 c44Var = new c44("NEVER_CONNECTED", 0);
        j = c44Var;
        c44 c44Var2 = new c44("BRIEF", 1);
        t = c44Var2;
        c44 c44Var3 = new c44("SHORT", 2);
        a = c44Var3;
        c44 c44Var4 = new c44("HELD", 3);
        m = c44Var4;
        q = new c44[]{c44Var, c44Var2, c44Var3, c44Var4};
    }

    public static c44 valueOf(String str) {
        return (c44) Enum.valueOf(c44.class, str);
    }

    public static c44[] values() {
        return (c44[]) q.clone();
    }
}
