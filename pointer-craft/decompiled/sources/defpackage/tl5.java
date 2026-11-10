package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface tl5 {
    default pl5 g(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default pl5 r(tf0 tf0Var, ea3 ea3Var) {
        Class cls = tf0Var.g;
        cls.getClass();
        return y(cls, ea3Var);
    }

    default pl5 y(Class cls, ea3 ea3Var) {
        return g(cls);
    }
}
