package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wj5 {
    public static final /* synthetic */ wj5[] a;
    public static final wj5 j;
    public static final wj5 t;

    static {
        wj5 wj5Var = new wj5("Lsq2", 0);
        j = wj5Var;
        wj5 wj5Var2 = new wj5("Impulse", 1);
        t = wj5Var2;
        a = new wj5[]{wj5Var, wj5Var2};
    }

    public static wj5 valueOf(String str) {
        return (wj5) Enum.valueOf(wj5.class, str);
    }

    public static wj5[] values() {
        return (wj5[]) a.clone();
    }
}
