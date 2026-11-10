package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a43 {
    public static final /* synthetic */ a43[] a;
    public static final a43 j;
    public static final a43 t;

    static {
        a43 a43Var = new a43("Min", 0);
        j = a43Var;
        a43 a43Var2 = new a43("Max", 1);
        t = a43Var2;
        a = new a43[]{a43Var, a43Var2};
    }

    public static a43 valueOf(String str) {
        return (a43) Enum.valueOf(a43.class, str);
    }

    public static a43[] values() {
        return (a43[]) a.clone();
    }
}
