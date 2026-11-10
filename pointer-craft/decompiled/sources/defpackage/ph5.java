package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph5 implements dx0 {
    public final ph5 j;
    public final p01 t;

    public ph5(ph5 ph5Var, p01 p01Var) {
        this.j = ph5Var;
        this.t = p01Var;
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    public final void g(p01 p01Var) {
        if (this.t == p01Var) {
            l0.z("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        ph5 ph5Var = this.j;
        if (ph5Var != null) {
            ph5Var.g(p01Var);
        }
    }

    @Override // defpackage.dx0
    public final ex0 getKey() {
        return tg1.z;
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }
}
