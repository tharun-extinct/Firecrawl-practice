package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sb5 {
    public static final /* synthetic */ sb5[] a;
    public static final sb5 j;
    public static final sb5 t;

    static {
        sb5 sb5Var = new sb5("DEFERRED", 0);
        j = sb5Var;
        sb5 sb5Var2 = new sb5("IMMEDIATE", 1);
        t = sb5Var2;
        a = new sb5[]{sb5Var, sb5Var2, new sb5("EXCLUSIVE", 2)};
    }

    public static sb5 valueOf(String str) {
        return (sb5) Enum.valueOf(sb5.class, str);
    }

    public static sb5[] values() {
        return (sb5[]) a.clone();
    }
}
