package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jn2 {
    public static final jn2 j;
    public static final /* synthetic */ jn2[] t;

    static {
        jn2 jn2Var = new jn2("Horizontal", 0);
        j = jn2Var;
        t = new jn2[]{jn2Var, new jn2("Vertical", 1)};
    }

    public static jn2 valueOf(String str) {
        return (jn2) Enum.valueOf(jn2.class, str);
    }

    public static jn2[] values() {
        return (jn2[]) t.clone();
    }
}
