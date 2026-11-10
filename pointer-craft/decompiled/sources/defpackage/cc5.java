package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cc5 {
    public final te5 g;
    public final /* synthetic */ nc5 r;
    public final tp3 y = kq2.M(null);

    public cc5(nc5 nc5Var, te5 te5Var, String str) {
        this.r = nc5Var;
        this.g = te5Var;
    }

    public final bc5 g(xy1 xy1Var, Object obj, vi viVar, xy1 xy1Var2) {
        tp3 tp3Var = this.y;
        bc5 bc5Var = (bc5) tp3Var.getValue();
        nc5 nc5Var = this.r;
        if (bc5Var == null) {
            Object objA = xy1Var2.a(nc5Var.g.n());
            Object objA2 = xy1Var2.a(nc5Var.g.n());
            te5 te5Var = this.g;
            vi viVar2 = (vi) te5Var.g.a(objA2);
            viVar2.n();
            hc5 hc5Var = new hc5(nc5Var, objA, viVar2, te5Var);
            bc5Var = new bc5(this, hc5Var, xy1Var, xy1Var2);
            tp3Var.setValue(bc5Var);
            nc5Var.a.add(hc5Var);
        }
        bc5Var.a = xy1Var2;
        bc5Var.t = xy1Var;
        bc5Var.g(nc5Var.x(), obj, viVar);
        return bc5Var;
    }
}
