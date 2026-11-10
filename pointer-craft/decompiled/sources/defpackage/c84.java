package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c84 {
    public static final c84 a;
    public static final c84 c;
    public static final /* synthetic */ c84[] i;
    public static final c84 j;
    public static final c84 m;
    public static final c84 q;
    public static final c84 t;
    public static final c84 w;

    static {
        c84 c84Var = new c84("Restored", 0);
        j = c84Var;
        c84 c84Var2 = new c84("Pending", 1);
        t = c84Var2;
        c84 c84Var3 = new c84("NotFinalized", 2);
        a = c84Var3;
        c84 c84Var4 = new c84("NothingFound", 3);
        m = c84Var4;
        c84 c84Var5 = new c84("Unverified", 4);
        q = c84Var5;
        c84 c84Var6 = new c84("Unavailable", 5);
        w = c84Var6;
        c84 c84Var7 = new c84("Failed", 6);
        c = c84Var7;
        i = new c84[]{c84Var, c84Var2, c84Var3, c84Var4, c84Var5, c84Var6, c84Var7};
    }

    public static c84 valueOf(String str) {
        return (c84) Enum.valueOf(c84.class, str);
    }

    public static c84[] values() {
        return (c84[]) i.clone();
    }
}
