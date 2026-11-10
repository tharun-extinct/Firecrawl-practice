package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nj5 {
    public final iq1 g;
    public vi n;
    public vi r;
    public final float v;
    public vi y;

    public nj5(iq1 iq1Var) {
        this.g = iq1Var;
        this.v = iq1Var.x();
    }

    public final vi g(vi viVar, vi viVar2) {
        vi viVarR = this.n;
        if (viVarR == null) {
            viVarR = viVar.r();
            this.n = viVarR;
        }
        int iY = viVarR.y();
        int i = 0;
        while (true) {
            vi viVar3 = this.n;
            if (i >= iY) {
                if (viVar3 != null) {
                    return viVar3;
                }
                yf2.Y("targetVector");
                throw null;
            }
            if (viVar3 == null) {
                yf2.Y("targetVector");
                throw null;
            }
            viVar3.v(i, this.g.j(viVar.g(i), viVar2.g(i)));
            i++;
        }
    }

    public final vi y(long j, vi viVar, vi viVar2) {
        vi viVarR = this.r;
        if (viVarR == null) {
            viVarR = viVar.r();
            this.r = viVarR;
        }
        int iY = viVarR.y();
        int i = 0;
        while (true) {
            vi viVar3 = this.r;
            if (i >= iY) {
                if (viVar3 != null) {
                    return viVar3;
                }
                yf2.Y("velocityVector");
                throw null;
            }
            if (viVar3 == null) {
                yf2.Y("velocityVector");
                throw null;
            }
            viVar.getClass();
            viVar3.v(i, this.g.m(viVar2.g(i), j));
            i++;
        }
    }
}
