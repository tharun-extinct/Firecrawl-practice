package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n12 implements mw4 {
    public final x25 g;

    public n12(x25 x25Var) {
        this.g = x25Var;
    }

    @Override // defpackage.mw4
    public final boolean g(Exception exc) {
        return false;
    }

    @Override // defpackage.mw4
    public final boolean y(wu wuVar) {
        if (!wuVar.q() && !wuVar.m() && !wuVar.t()) {
            return false;
        }
        this.g.g.q(wuVar.g);
        return true;
    }
}
