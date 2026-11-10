package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class um3 {
    public static final /* synthetic */ um3[] a;
    public static final um3 j;
    public static final um3 t;

    static {
        um3 um3Var = new um3("Vertical", 0);
        j = um3Var;
        um3 um3Var2 = new um3("Horizontal", 1);
        t = um3Var2;
        a = new um3[]{um3Var, um3Var2};
    }

    public static um3 valueOf(String str) {
        return (um3) Enum.valueOf(um3.class, str);
    }

    public static um3[] values() {
        return (um3[]) a.clone();
    }
}
