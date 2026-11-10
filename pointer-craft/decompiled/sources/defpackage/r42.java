package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r42 {
    public static final r42 a;
    public static final r42 j;
    public static final /* synthetic */ r42[] m;
    public static final r42 t;

    static {
        r42 r42Var = new r42("None", 0);
        j = r42Var;
        r42 r42Var2 = new r42("Selection", 1);
        t = r42Var2;
        r42 r42Var3 = new r42("Cursor", 2);
        a = r42Var3;
        m = new r42[]{r42Var, r42Var2, r42Var3};
    }

    public static r42 valueOf(String str) {
        return (r42) Enum.valueOf(r42.class, str);
    }

    public static r42[] values() {
        return (r42[]) m.clone();
    }
}
