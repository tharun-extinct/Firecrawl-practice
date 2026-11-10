package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fl2 {
    public static final /* synthetic */ fl2[] a;
    public static final fl2 j;
    public static final fl2 t;

    static {
        fl2 fl2Var = new fl2("Ltr", 0);
        j = fl2Var;
        fl2 fl2Var2 = new fl2("Rtl", 1);
        t = fl2Var2;
        a = new fl2[]{fl2Var, fl2Var2};
    }

    public static fl2 valueOf(String str) {
        return (fl2) Enum.valueOf(fl2.class, str);
    }

    public static fl2[] values() {
        return (fl2[]) a.clone();
    }
}
