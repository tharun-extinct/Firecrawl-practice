package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v52 {
    public static final v52 a;
    public static final v52 j;
    public static final v52 m;
    public static final /* synthetic */ v52[] q;
    public static final v52 t;

    static {
        v52 v52Var = new v52("Present", 0);
        j = v52Var;
        v52 v52Var2 = new v52("Absent", 1);
        t = v52Var2;
        v52 v52Var3 = new v52("TimedOut", 2);
        a = v52Var3;
        v52 v52Var4 = new v52("Unavailable", 3);
        m = v52Var4;
        q = new v52[]{v52Var, v52Var2, v52Var3, v52Var4};
    }

    public static v52 valueOf(String str) {
        return (v52) Enum.valueOf(v52.class, str);
    }

    public static v52[] values() {
        return (v52[]) q.clone();
    }
}
