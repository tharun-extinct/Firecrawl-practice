package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface o22 {
    Object g(bz1 bz1Var, Object obj);

    default o22 n(o22 o22Var) {
        return o22Var == m22.g ? this : new ok0(this, o22Var);
    }

    boolean r(xy1 xy1Var);

    boolean y(q21 q21Var);
}
