package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b43 {
    public static final /* synthetic */ b43[] a;
    public static final b43 j;
    public static final b43 t;

    static {
        b43 b43Var = new b43("Width", 0);
        j = b43Var;
        b43 b43Var2 = new b43("Height", 1);
        t = b43Var2;
        a = new b43[]{b43Var, b43Var2};
    }

    public static b43 valueOf(String str) {
        return (b43) Enum.valueOf(b43.class, str);
    }

    public static b43[] values() {
        return (b43[]) a.clone();
    }
}
