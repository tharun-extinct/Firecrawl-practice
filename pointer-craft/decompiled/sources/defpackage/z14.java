package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z14 {
    public static final z14 a;
    public static final z14 j;
    public static final /* synthetic */ z14[] m;
    public static final z14 t;

    static {
        z14 z14Var = new z14("ONE_TIME", 0);
        j = z14Var;
        z14 z14Var2 = new z14("SUBSCRIPTION", 1);
        t = z14Var2;
        z14 z14Var3 = new z14("BOTH", 2);
        a = z14Var3;
        m = new z14[]{z14Var, z14Var2, z14Var3};
    }

    public static z14 valueOf(String str) {
        return (z14) Enum.valueOf(z14.class, str);
    }

    public static z14[] values() {
        return (z14[]) m.clone();
    }
}
