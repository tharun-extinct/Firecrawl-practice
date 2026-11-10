package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i63 {
    public static final i63 a;
    public static final i63 c;
    public static final /* synthetic */ i63[] i;
    public static final i63 j;
    public static final i63 m;
    public static final i63 q;
    public static final i63 t;
    public static final i63 w;

    static {
        i63 i63Var = new i63("LeftControl", 0);
        j = i63Var;
        i63 i63Var2 = new i63("LeftShift", 1);
        t = i63Var2;
        i63 i63Var3 = new i63("LeftAlt", 2);
        a = i63Var3;
        i63 i63Var4 = new i63("LeftGUI", 3);
        m = i63Var4;
        i63 i63Var5 = new i63("RightControl", 4);
        i63 i63Var6 = new i63("RightShift", 5);
        q = i63Var6;
        i63 i63Var7 = new i63("RightAlt", 6);
        w = i63Var7;
        i63 i63Var8 = new i63("RightGUI", 7);
        c = i63Var8;
        i = new i63[]{i63Var, i63Var2, i63Var3, i63Var4, i63Var5, i63Var6, i63Var7, i63Var8};
    }

    public static i63 valueOf(String str) {
        return (i63) Enum.valueOf(i63.class, str);
    }

    public static i63[] values() {
        return (i63[]) i.clone();
    }
}
