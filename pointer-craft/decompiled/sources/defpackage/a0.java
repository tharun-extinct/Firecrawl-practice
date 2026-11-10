package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements dx0 {
    public final ex0 j;

    public a0(ex0 ex0Var) {
        this.j = ex0Var;
    }

    @Override // defpackage.fx0
    public /* bridge */ fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    @Override // defpackage.fx0
    public final /* bridge */ fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.dx0
    public final ex0 getKey() {
        return this.j;
    }

    @Override // defpackage.fx0
    public /* bridge */ dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }
}
