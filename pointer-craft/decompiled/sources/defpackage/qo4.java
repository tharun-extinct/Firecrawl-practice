package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qo4 {
    public static final qo4 a;
    public static final qo4 j;
    public static final /* synthetic */ qo4[] m;
    public static final qo4 t;

    static {
        qo4 qo4Var = new qo4("START", 0);
        j = qo4Var;
        qo4 qo4Var2 = new qo4("STOP", 1);
        t = qo4Var2;
        qo4 qo4Var3 = new qo4("STOP_AND_RESET_REPLAY_CACHE", 2);
        a = qo4Var3;
        m = new qo4[]{qo4Var, qo4Var2, qo4Var3};
    }

    public static qo4 valueOf(String str) {
        return (qo4) Enum.valueOf(qo4.class, str);
    }

    public static qo4[] values() {
        return (qo4[]) m.clone();
    }
}
