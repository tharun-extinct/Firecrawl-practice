package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x14 {
    public static final /* synthetic */ x14[] a;
    public static final x14 j;
    public static final x14 t;

    static {
        x14 x14Var = new x14("Failed", 0);
        j = x14Var;
        x14 x14Var2 = new x14("NotFinalized", 1);
        t = x14Var2;
        a = new x14[]{x14Var, x14Var2};
    }

    public static x14 valueOf(String str) {
        return (x14) Enum.valueOf(x14.class, str);
    }

    public static x14[] values() {
        return (x14[]) a.clone();
    }
}
