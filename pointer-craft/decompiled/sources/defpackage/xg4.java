package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xg4 implements bz1 {
    public final /* synthetic */ pg4 a;
    public final /* synthetic */ nm0 j;
    public final /* synthetic */ nm0 m;
    public final /* synthetic */ boolean t;

    public xg4(nm0 nm0Var, boolean z, pg4 pg4Var, nm0 nm0Var2) {
        this.j = nm0Var;
        this.t = z;
        this.a = pg4Var;
        this.m = nm0Var2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, g73.g);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, ek0VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            this.j.l(h02Var, 0);
            gp4.y(gk0.g, this.t, null, ah4.v, ah4.x, null, ue5.m0(-1224554113, new wg4(this.a, this.m), h02Var), h02Var, 1600518, 18);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
