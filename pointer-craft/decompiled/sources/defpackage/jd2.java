package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jd2 {
    public static final /* synthetic */ jd2[] a;
    public static final jd2 j;
    public static final /* synthetic */ jk1 m;
    public static final jd2 t;

    static {
        jd2 jd2Var = new jd2("Keyboard", 0);
        j = jd2Var;
        jd2 jd2Var2 = new jd2("Gamepad", 1);
        t = jd2Var2;
        jd2[] jd2VarArr = {jd2Var, jd2Var2};
        a = jd2VarArr;
        m = new jk1(jd2VarArr);
    }

    public static jd2 valueOf(String str) {
        return (jd2) Enum.valueOf(jd2.class, str);
    }

    public static jd2[] values() {
        return (jd2[]) a.clone();
    }
}
