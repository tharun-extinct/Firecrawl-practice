package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ch4 {
    public static final /* synthetic */ ch4[] a;
    public static final ch4 j;
    public static final ch4 t;

    static {
        ch4 ch4Var = new ch4("Inherit", 0);
        j = ch4Var;
        ch4 ch4Var2 = new ch4("SecureOn", 1);
        t = ch4Var2;
        a = new ch4[]{ch4Var, ch4Var2, new ch4("SecureOff", 2)};
    }

    public static ch4 valueOf(String str) {
        return (ch4) Enum.valueOf(ch4.class, str);
    }

    public static ch4[] values() {
        return (ch4[]) a.clone();
    }
}
