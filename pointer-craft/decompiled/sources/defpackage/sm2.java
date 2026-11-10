package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sm2 {
    public static final sm2 a;
    public static final sm2 j;
    public static final /* synthetic */ sm2[] m;
    public static final sm2 t;

    static {
        sm2 sm2Var = new sm2("InMeasureBlock", 0);
        j = sm2Var;
        sm2 sm2Var2 = new sm2("InLayoutBlock", 1);
        t = sm2Var2;
        sm2 sm2Var3 = new sm2("NotUsed", 2);
        a = sm2Var3;
        m = new sm2[]{sm2Var, sm2Var2, sm2Var3};
    }

    public static sm2 valueOf(String str) {
        return (sm2) Enum.valueOf(sm2.class, str);
    }

    public static sm2[] values() {
        return (sm2[]) m.clone();
    }
}
