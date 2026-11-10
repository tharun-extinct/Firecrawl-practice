package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m12 implements mw4 {
    public final gi5 g;
    public final x25 y;

    public m12(gi5 gi5Var, x25 x25Var) {
        this.g = gi5Var;
        this.y = x25Var;
    }

    @Override // defpackage.mw4
    public final boolean g(Exception exc) {
        this.y.r(exc);
        return true;
    }

    @Override // defpackage.mw4
    public final boolean y(wu wuVar) {
        if (wuVar.m() && !this.g.g(wuVar)) {
            String str = wuVar.r;
            if (str != null) {
                this.y.y(new ou(wuVar.v, wuVar.x, str));
                return true;
            }
            l0.q("Null token");
        }
        return false;
    }
}
