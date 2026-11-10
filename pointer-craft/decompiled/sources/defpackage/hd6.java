package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hd6 {
    public static final di2[] g = new di2[0];

    public static final ab g(String str) {
        return new ab(js2.h(str));
    }

    public static Object n(Class cls, String str, ia6... ia6VarArr) {
        int length = ia6VarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < ia6VarArr.length; i++) {
            ia6 ia6Var = ia6VarArr[i];
            ia6Var.getClass();
            clsArr[i] = (Class) ia6Var.g;
            objArr[i] = ia6VarArr[i].y;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static j73 r(j73 j73Var, ud udVar) {
        return j73Var.n(new mu3(udVar));
    }

    public static final String[] y(bu0 bu0Var) {
        bu0Var.getClass();
        return (String[]) ((ab) bu0Var).y.toArray(new String[0]);
    }
}
