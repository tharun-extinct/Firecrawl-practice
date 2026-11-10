package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq1 implements bz1 {
    public final /* synthetic */ float j;
    public final /* synthetic */ nm0 t;

    public xq1(float f, nm0 nm0Var) {
        this.j = f;
        this.t = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            j73 j73VarG = mq4.g(g73.g, this.j, 56.0f);
            t33 t33VarR = z50.r(hi0.w, false);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarG);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.h(0, this.t, h02Var, true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
