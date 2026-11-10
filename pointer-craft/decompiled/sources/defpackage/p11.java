package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class p11 {
    public static final k41 g;

    static {
        String property;
        t42 t42Var;
        k41 k41Var;
        int i = f15.g;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            x21 x21Var = na1.g;
            t42Var = p03.g;
            t42 t42Var2 = t42Var.w;
            if (t42Var == null) {
                k41Var = t42Var;
                k41Var = o11.p;
            }
        } else {
            k41Var = o11.p;
        }
        k41Var = t42Var;
        g = k41Var;
    }
}
