package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface n22 extends o22 {
    @Override // defpackage.o22
    default Object g(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.o22
    default boolean r(xy1 xy1Var) {
        return ((Boolean) xy1Var.a(this)).booleanValue();
    }

    @Override // defpackage.o22
    default boolean y(q21 q21Var) {
        return ((Boolean) q21Var.a(this)).booleanValue();
    }
}
