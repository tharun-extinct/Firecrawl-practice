package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ze3 implements bz1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ nm0 c;
    public final /* synthetic */ te1 j;
    public final /* synthetic */ jq1 m;
    public final /* synthetic */ float q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ qo5 w;

    public ze3(te1 te1Var, boolean z, float f, jq1 jq1Var, float f2, qo5 qo5Var, nm0 nm0Var) {
        this.j = te1Var;
        this.t = z;
        this.a = f;
        this.m = jq1Var;
        this.q = f2;
        this.w = qo5Var;
        this.c = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            g73 g73Var = g73.g;
            boolean z = this.t;
            te1 te1Var = this.j;
            j73 j73VarL = te1Var != null ? yf2.L(g73Var, new te3(te1Var, z, (byte) 0)) : g73Var;
            qe5 qe5Var = ef3.g;
            j73 j73VarD0 = yf2.d0(yf2.L(mq4.m(g73Var, 240.0f, 0.0f, this.a, 10), new se3(this.m, this.q, z, (byte) 0)).n(j73VarL), this.w);
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarD0);
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
            this.c.x(gk0.g, h02Var, 6);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
