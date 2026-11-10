package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f83 {
    public static final f83 a;
    public static final f83 j;
    public static final f83 m;
    public static final f83 q;
    public static final f83 t;
    public static final /* synthetic */ f83[] w;

    static {
        f83 f83Var = new f83("DefaultSpatial", 0);
        j = f83Var;
        f83 f83Var2 = new f83("FastSpatial", 1);
        t = f83Var2;
        f83 f83Var3 = new f83("SlowSpatial", 2);
        f83 f83Var4 = new f83("DefaultEffects", 3);
        a = f83Var4;
        f83 f83Var5 = new f83("FastEffects", 4);
        m = f83Var5;
        f83 f83Var6 = new f83("SlowEffects", 5);
        q = f83Var6;
        w = new f83[]{f83Var, f83Var2, f83Var3, f83Var4, f83Var5, f83Var6};
    }

    public static f83 valueOf(String str) {
        return (f83) Enum.valueOf(f83.class, str);
    }

    public static f83[] values() {
        return (f83[]) w.clone();
    }
}
