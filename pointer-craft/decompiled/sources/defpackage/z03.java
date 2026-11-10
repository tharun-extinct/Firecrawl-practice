package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z03 implements k53 {
    public k53[] g;

    @Override // defpackage.k53
    public final z24 g(Class cls) {
        for (k53 k53Var : this.g) {
            if (k53Var.y(cls)) {
                return k53Var.g(cls);
            }
        }
        uo1.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.k53
    public final boolean y(Class cls) {
        for (k53 k53Var : this.g) {
            if (k53Var.y(cls)) {
                return true;
            }
        }
        return false;
    }
}
