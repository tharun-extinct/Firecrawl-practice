package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wq5 {
    public static final wq5 a;
    public static final wq5 b;
    public static final wq5 c;
    public static final wq5 i;
    public static final wq5 j;
    public static final wq5 m;
    public static final wq5 q;
    public static final /* synthetic */ wq5[] s;
    public static final wq5 t;
    public static final wq5 w;

    static {
        wq5 wq5Var = new wq5("INT", 0);
        j = wq5Var;
        wq5 wq5Var2 = new wq5("LONG", 1);
        t = wq5Var2;
        wq5 wq5Var3 = new wq5("FLOAT", 2);
        a = wq5Var3;
        wq5 wq5Var4 = new wq5("DOUBLE", 3);
        m = wq5Var4;
        wq5 wq5Var5 = new wq5("BOOLEAN", 4);
        q = wq5Var5;
        wq5 wq5Var6 = new wq5("STRING", 5);
        w = wq5Var6;
        da0 da0Var = da0.a;
        wq5 wq5Var7 = new wq5("BYTE_STRING", 6);
        c = wq5Var7;
        wq5 wq5Var8 = new wq5("ENUM", 7);
        i = wq5Var8;
        wq5 wq5Var9 = new wq5("MESSAGE", 8);
        b = wq5Var9;
        s = new wq5[]{wq5Var, wq5Var2, wq5Var3, wq5Var4, wq5Var5, wq5Var6, wq5Var7, wq5Var8, wq5Var9};
    }

    public static wq5 valueOf(String str) {
        return (wq5) Enum.valueOf(wq5.class, str);
    }

    public static wq5[] values() {
        return (wq5[]) s.clone();
    }
}
