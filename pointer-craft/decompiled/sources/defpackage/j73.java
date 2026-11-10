package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface j73 {
    Object g(bz1 bz1Var, Object obj);

    default j73 n(j73 j73Var) {
        return j73Var == g73.g ? this : new pk0(this, j73Var);
    }

    boolean y(xy1 xy1Var);
}
