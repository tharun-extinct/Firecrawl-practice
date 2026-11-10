package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xe1 {
    public static final /* synthetic */ xe1[] a;
    public static final xe1 j;
    public static final xe1 t;

    static {
        xe1 xe1Var = new xe1("Closed", 0);
        j = xe1Var;
        xe1 xe1Var2 = new xe1("Open", 1);
        t = xe1Var2;
        a = new xe1[]{xe1Var, xe1Var2};
    }

    public static xe1 valueOf(String str) {
        return (xe1) Enum.valueOf(xe1.class, str);
    }

    public static xe1[] values() {
        return (xe1[]) a.clone();
    }
}
