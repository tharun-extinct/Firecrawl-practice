package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j65 {
    public static final /* synthetic */ j65[] a;
    public static final j65 j;
    public static final j65 t;

    static {
        j65 j65Var = new j65("Filled", 0);
        j = j65Var;
        j65 j65Var2 = new j65("Outlined", 1);
        t = j65Var2;
        a = new j65[]{j65Var, j65Var2};
    }

    public static j65 valueOf(String str) {
        return (j65) Enum.valueOf(j65.class, str);
    }

    public static j65[] values() {
        return (j65[]) a.clone();
    }
}
