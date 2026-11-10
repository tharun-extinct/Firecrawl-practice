package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wo0 implements cm3, dx0 {
    public static final hi0 t = new hi0(10);
    public final h02 j;

    public wo0(h02 h02Var) {
        this.j = h02Var;
    }

    @Override // defpackage.fx0
    public final /* bridge */ fx0 E(ex0 ex0Var) {
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
        return t;
    }

    @Override // defpackage.fx0
    public final /* bridge */ dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }

    @Override // defpackage.cm3
    public final boolean l() {
        return this.j.C;
    }

    @Override // defpackage.cm3
    public final List n(Integer num) {
        return this.j.D();
    }
}
