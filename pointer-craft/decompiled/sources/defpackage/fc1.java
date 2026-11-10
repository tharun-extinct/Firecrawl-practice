package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fc1 {
    public static final fc1 a;
    public static final fc1 j;
    public static final /* synthetic */ fc1[] m;
    public static final fc1 t;

    static {
        fc1 fc1Var = new fc1("Yes", 0);
        j = fc1Var;
        fc1 fc1Var2 = new fc1("No", 1);
        t = fc1Var2;
        fc1 fc1Var3 = new fc1("NotInitialized", 2);
        a = fc1Var3;
        m = new fc1[]{fc1Var, fc1Var2, fc1Var3};
    }

    public static fc1 valueOf(String str) {
        return (fc1) Enum.valueOf(fc1.class, str);
    }

    public static fc1[] values() {
        return (fc1[]) m.clone();
    }
}
