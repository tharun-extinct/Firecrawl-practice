package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jt0 {
    public static final /* synthetic */ jt0[] a;
    public static final jt0 j;
    public static final jt0 t;

    static {
        jt0 jt0Var = new jt0("VIEW_APPEAR", 0);
        j = jt0Var;
        jt0 jt0Var2 = new jt0("VIEW_DISAPPEAR", 1);
        t = jt0Var2;
        a = new jt0[]{jt0Var, jt0Var2};
    }

    public static jt0 valueOf(String str) {
        return (jt0) Enum.valueOf(jt0.class, str);
    }

    public static jt0[] values() {
        return (jt0[]) a.clone();
    }
}
