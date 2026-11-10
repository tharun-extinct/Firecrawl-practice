package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ng2 {
    public static final ng2 a;
    public static final ng2 j;
    public static final ng2 m;
    public static final /* synthetic */ ng2[] q;
    public static final ng2 t;

    static {
        ng2 ng2Var = new ng2("IGNORED", 0);
        j = ng2Var;
        ng2 ng2Var2 = new ng2("SCHEDULED", 1);
        t = ng2Var2;
        ng2 ng2Var3 = new ng2("DEFERRED", 2);
        a = ng2Var3;
        ng2 ng2Var4 = new ng2("IMMINENT", 3);
        m = ng2Var4;
        q = new ng2[]{ng2Var, ng2Var2, ng2Var3, ng2Var4};
    }

    public static ng2 valueOf(String str) {
        return (ng2) Enum.valueOf(ng2.class, str);
    }

    public static ng2[] values() {
        return (ng2[]) q.clone();
    }
}
