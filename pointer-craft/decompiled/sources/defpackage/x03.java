package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x03 extends v4 {
    public final w4 g;

    public x03(w4 w4Var) {
        this.g = w4Var;
    }

    @Override // defpackage.v4
    public final void g(Object obj) throws Exception {
        b5 b5Var = this.g.g;
        if (b5Var != null) {
            b5Var.g(obj);
        } else {
            l0.z("Launcher has not been initialized");
        }
    }
}
