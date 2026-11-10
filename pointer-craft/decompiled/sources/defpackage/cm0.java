package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface cm0 {
    default Object g(Class cls) {
        return j(e24.g(cls));
    }

    default Object j(e24 e24Var) {
        n14 n14VarL = l(e24Var);
        if (n14VarL == null) {
            return null;
        }
        return n14VarL.get();
    }

    n14 l(e24 e24Var);

    default Set n(e24 e24Var) {
        return (Set) r(e24Var).get();
    }

    n14 r(e24 e24Var);

    default n14 v(Class cls) {
        return l(e24.g(cls));
    }

    rm3 x(e24 e24Var);

    default rm3 y() {
        return x(e24.g(nf2.class));
    }
}
