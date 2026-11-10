package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ru4 {
    public static final ru4 a;
    public static final ru4 j;
    public static final /* synthetic */ ru4[] m;
    public static final ru4 t;

    static {
        ru4 ru4Var = new ru4("NONE", 0);
        j = ru4Var;
        ru4 ru4Var2 = new ru4("ADDING", 1);
        t = ru4Var2;
        ru4 ru4Var3 = new ru4("REMOVING", 2);
        a = ru4Var3;
        m = new ru4[]{ru4Var, ru4Var2, ru4Var3};
    }

    public static ru4 valueOf(String str) {
        return (ru4) Enum.valueOf(ru4.class, str);
    }

    public static ru4[] values() {
        return (ru4[]) m.clone();
    }
}
