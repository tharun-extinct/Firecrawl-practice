package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p42 {
    public static final p42 a;
    public static final p42 j;
    public static final /* synthetic */ p42[] m;
    public static final p42 t;

    static {
        p42 p42Var = new p42("Cursor", 0);
        j = p42Var;
        p42 p42Var2 = new p42("SelectionStart", 1);
        t = p42Var2;
        p42 p42Var3 = new p42("SelectionEnd", 2);
        a = p42Var3;
        m = new p42[]{p42Var, p42Var2, p42Var3};
    }

    public static p42 valueOf(String str) {
        return (p42) Enum.valueOf(p42.class, str);
    }

    public static p42[] values() {
        return (p42[]) m.clone();
    }
}
