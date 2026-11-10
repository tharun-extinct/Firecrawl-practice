package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cq0 {
    public static final /* synthetic */ cq0[] a;
    public static final cq0 j;
    public static final cq0 t;

    static {
        cq0 cq0Var = new cq0("NotConnected", 0);
        j = cq0Var;
        cq0 cq0Var2 = new cq0("NotPaired", 1);
        t = cq0Var2;
        a = new cq0[]{cq0Var, cq0Var2};
    }

    public static cq0 valueOf(String str) {
        return (cq0) Enum.valueOf(cq0.class, str);
    }

    public static cq0[] values() {
        return (cq0[]) a.clone();
    }
}
