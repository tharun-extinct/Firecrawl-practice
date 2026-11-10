package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z81 {
    public static final z81 a;
    public static final z81 j;
    public static final z81 m;
    public static final z81 q;
    public static final z81 t;
    public static final /* synthetic */ z81[] w;

    static {
        z81 z81Var = new z81("NotStarted", 0);
        j = z81Var;
        z81 z81Var2 = new z81("Running", 1);
        t = z81Var2;
        z81 z81Var3 = new z81("Ok", 2);
        a = z81Var3;
        z81 z81Var4 = new z81("Warning", 3);
        m = z81Var4;
        z81 z81Var5 = new z81("Failed", 4);
        q = z81Var5;
        w = new z81[]{z81Var, z81Var2, z81Var3, z81Var4, z81Var5};
    }

    public static z81 valueOf(String str) {
        return (z81) Enum.valueOf(z81.class, str);
    }

    public static z81[] values() {
        return (z81[]) w.clone();
    }
}
