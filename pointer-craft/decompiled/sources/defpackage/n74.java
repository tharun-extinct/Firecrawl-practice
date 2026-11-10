package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n74 {
    public static final /* synthetic */ n74[] a;
    public static final n74 j;
    public static final n74 t;

    static {
        n74 n74Var = new n74("Ltr", 0);
        j = n74Var;
        n74 n74Var2 = new n74("Rtl", 1);
        t = n74Var2;
        a = new n74[]{n74Var, n74Var2};
    }

    public static n74 valueOf(String str) {
        return (n74) Enum.valueOf(n74.class, str);
    }

    public static n74[] values() {
        return (n74[]) a.clone();
    }
}
