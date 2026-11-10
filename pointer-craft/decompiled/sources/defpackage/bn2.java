package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bn2 implements u33 {
    public final /* synthetic */ int g;
    public final /* synthetic */ xy1 l;
    public final /* synthetic */ xy1 n;
    public final /* synthetic */ Map r;
    public final /* synthetic */ cn2 v;
    public final /* synthetic */ in2 x;
    public final /* synthetic */ int y;

    public bn2(int i, int i2, Map map, xy1 xy1Var, cn2 cn2Var, in2 in2Var, xy1 xy1Var2) {
        this.g = i;
        this.y = i2;
        this.r = map;
        this.n = xy1Var;
        this.v = cn2Var;
        this.x = in2Var;
        this.l = xy1Var2;
    }

    @Override // defpackage.u33
    public final int g() {
        return this.y;
    }

    @Override // defpackage.u33
    public final void n() {
        rc2 rc2Var;
        um2 um2Var = this.x.j;
        boolean zU = this.v.u();
        xy1 xy1Var = this.l;
        if (!zU || (rc2Var = um2Var.M.r.k0) == null) {
            xy1Var.a(um2Var.M.r.f);
        } else {
            xy1Var.a(rc2Var.f);
        }
    }

    @Override // defpackage.u33
    public final Map r() {
        return this.r;
    }

    @Override // defpackage.u33
    public final xy1 x() {
        return this.n;
    }

    @Override // defpackage.u33
    public final int y() {
        return this.g;
    }
}
