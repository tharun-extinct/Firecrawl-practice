package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ed5 {
    public final cv g;
    public final xb5 n;
    public final dj1 r;
    public final fd5 v;
    public final String y;

    public ed5(cv cvVar, String str, dj1 dj1Var, xb5 xb5Var, fd5 fd5Var) {
        this.g = cvVar;
        this.y = str;
        this.r = dj1Var;
        this.n = xb5Var;
        this.v = fd5Var;
    }

    public final void g(iu iuVar) {
        t94 t94Var = new t94();
        fd5 fd5Var = this.v;
        y21 y21Var = fd5Var.r;
        xx3 xx3Var = iuVar.y;
        ro roVarG = cv.g();
        cv cvVar = this.g;
        roVarG.X(cvVar.g);
        roVarG.m = xx3Var;
        roVarG.a = cvVar.y;
        cv cvVarJ = roVarG.j();
        vl vlVar = new vl();
        vlVar.x = new HashMap();
        vlVar.n = Long.valueOf(fd5Var.g.n());
        vlVar.v = Long.valueOf(fd5Var.y.n());
        vlVar.g = this.y;
        vlVar.r = new aj1(this.r, (byte[]) this.n.apply(iuVar.g));
        vlVar.y = null;
        y21Var.y.execute(new v21(y21Var, cvVarJ, t94Var, vlVar.m()));
    }
}
