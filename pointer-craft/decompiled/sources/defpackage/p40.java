package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p40 {
    public static final p40 a;
    public static final p40 j;
    public static final /* synthetic */ p40[] m;
    public static final p40 t;

    static {
        p40 p40Var = new p40("Requested", 0);
        j = p40Var;
        p40 p40Var2 = new p40("Refused", 1);
        t = p40Var2;
        p40 p40Var3 = new p40("MissingPermission", 2);
        a = p40Var3;
        m = new p40[]{p40Var, p40Var2, p40Var3};
    }

    public static p40 valueOf(String str) {
        return (p40) Enum.valueOf(p40.class, str);
    }

    public static p40[] values() {
        return (p40[]) m.clone();
    }
}
