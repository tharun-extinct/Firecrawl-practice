package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f70 {
    public static final f70 a;
    public static final f70 j;
    public static final /* synthetic */ f70[] m;
    public static final f70 t;

    static {
        f70 f70Var = new f70("SUSPEND", 0);
        j = f70Var;
        f70 f70Var2 = new f70("DROP_OLDEST", 1);
        t = f70Var2;
        f70 f70Var3 = new f70("DROP_LATEST", 2);
        a = f70Var3;
        m = new f70[]{f70Var, f70Var2, f70Var3};
    }

    public static f70 valueOf(String str) {
        return (f70) Enum.valueOf(f70.class, str);
    }

    public static f70[] values() {
        return (f70[]) m.clone();
    }
}
