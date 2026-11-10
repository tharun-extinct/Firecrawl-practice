package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kh3 {
    public static final /* synthetic */ kh3[] a;
    public static final kh3 j;
    public static final kh3 t;

    static {
        kh3 kh3Var = new kh3("Width", 0);
        j = kh3Var;
        kh3 kh3Var2 = new kh3("Height", 1);
        t = kh3Var2;
        a = new kh3[]{kh3Var, kh3Var2};
    }

    public static kh3 valueOf(String str) {
        return (kh3) Enum.valueOf(kh3.class, str);
    }

    public static kh3[] values() {
        return (kh3[]) a.clone();
    }
}
