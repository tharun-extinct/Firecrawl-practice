package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface h73 extends j73 {
    @Override // defpackage.j73
    default Object g(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.j73
    default boolean y(xy1 xy1Var) {
        return ((Boolean) xy1Var.a(this)).booleanValue();
    }
}
