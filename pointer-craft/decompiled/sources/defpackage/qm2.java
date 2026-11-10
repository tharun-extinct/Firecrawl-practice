package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qm2 {
    public static final qm2 a;
    public static final qm2 j;
    public static final qm2 m;
    public static final qm2 q;
    public static final qm2 t;
    public static final /* synthetic */ qm2[] w;

    static {
        qm2 qm2Var = new qm2("Measuring", 0);
        j = qm2Var;
        qm2 qm2Var2 = new qm2("LookaheadMeasuring", 1);
        t = qm2Var2;
        qm2 qm2Var3 = new qm2("LayingOut", 2);
        a = qm2Var3;
        qm2 qm2Var4 = new qm2("LookaheadLayingOut", 3);
        m = qm2Var4;
        qm2 qm2Var5 = new qm2("Idle", 4);
        q = qm2Var5;
        w = new qm2[]{qm2Var, qm2Var2, qm2Var3, qm2Var4, qm2Var5};
    }

    public static qm2 valueOf(String str) {
        return (qm2) Enum.valueOf(qm2.class, str);
    }

    public static qm2[] values() {
        return (qm2[]) w.clone();
    }
}
