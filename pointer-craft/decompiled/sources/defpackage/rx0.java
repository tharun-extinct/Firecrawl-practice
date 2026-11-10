package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 {
    public static final rx0 a;
    public static final rx0 j;
    public static final rx0 m;
    public static final /* synthetic */ rx0[] q;
    public static final rx0 t;

    static {
        rx0 rx0Var = new rx0("DEFAULT", 0);
        j = rx0Var;
        rx0 rx0Var2 = new rx0("LAZY", 1);
        t = rx0Var2;
        rx0 rx0Var3 = new rx0("ATOMIC", 2);
        a = rx0Var3;
        rx0 rx0Var4 = new rx0("UNDISPATCHED", 3);
        m = rx0Var4;
        q = new rx0[]{rx0Var, rx0Var2, rx0Var3, rx0Var4};
    }

    public static rx0 valueOf(String str) {
        return (rx0) Enum.valueOf(rx0.class, str);
    }

    public static rx0[] values() {
        return (rx0[]) q.clone();
    }
}
