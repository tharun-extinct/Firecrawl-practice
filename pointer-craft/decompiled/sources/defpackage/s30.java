package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s30 {
    public static final s30 a;
    public static final s30 j;
    public static final s30 m;
    public static final s30 q;
    public static final s30 t;
    public static final /* synthetic */ s30[] w;

    static {
        s30 s30Var = new s30("Unknown", 0);
        j = s30Var;
        s30 s30Var2 = new s30("Off", 1);
        t = s30Var2;
        s30 s30Var3 = new s30("TurningOn", 2);
        a = s30Var3;
        s30 s30Var4 = new s30("On", 3);
        m = s30Var4;
        s30 s30Var5 = new s30("TurningOff", 4);
        q = s30Var5;
        w = new s30[]{s30Var, s30Var2, s30Var3, s30Var4, s30Var5};
    }

    public static s30 valueOf(String str) {
        return (s30) Enum.valueOf(s30.class, str);
    }

    public static s30[] values() {
        return (s30[]) w.clone();
    }
}
