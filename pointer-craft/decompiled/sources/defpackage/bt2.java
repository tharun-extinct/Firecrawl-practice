package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bt2 {
    public static final /* synthetic */ bt2[] a;
    public static final bt2 j;
    public static final bt2 t;

    /* JADX INFO: Fake field, exist only in values array */
    bt2 EF0;

    static {
        bt2 bt2Var = new bt2("SYNCHRONIZED", 0);
        bt2 bt2Var2 = new bt2("PUBLICATION", 1);
        j = bt2Var2;
        bt2 bt2Var3 = new bt2("NONE", 2);
        t = bt2Var3;
        a = new bt2[]{bt2Var, bt2Var2, bt2Var3};
    }

    public static bt2 valueOf(String str) {
        return (bt2) Enum.valueOf(bt2.class, str);
    }

    public static bt2[] values() {
        return (bt2[]) a.clone();
    }
}
