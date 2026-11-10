package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a13 implements l53 {
    public l53[] g;

    @Override // defpackage.l53
    public final a34 g(Class cls) {
        for (l53 l53Var : this.g) {
            if (l53Var.y(cls)) {
                return l53Var.g(cls);
            }
        }
        uo1.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.l53
    public final boolean y(Class cls) {
        for (l53 l53Var : this.g) {
            if (l53Var.y(cls)) {
                return true;
            }
        }
        return false;
    }
}
