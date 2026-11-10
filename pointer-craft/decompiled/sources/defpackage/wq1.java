package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq1 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ nm0 t;

    public wq1(boolean z, nm0 nm0Var, nm0 nm0Var2) {
        this.j = z;
        this.t = nm0Var;
        this.a = nm0Var2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        float f;
        float f2;
        float f3;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.j;
            if (z) {
                float f4 = m50.k;
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            if (z) {
                float f5 = m50.e;
                f2 = 20.0f;
            } else {
                f2 = 0.0f;
            }
            if (z) {
                float f6 = m50.A;
                f3 = 80.0f;
            } else {
                f3 = pw5.l;
            }
            j73 j73VarI0 = ue5.i0(mq4.m(g73.g, f3, 0.0f, 0.0f, 14), f, 0.0f, f2, 0.0f, 10);
            j00 j00Var = hi0.u;
            boolean z2 = this.j;
            kb4 kb4VarG = jb4.g(z2 ? v70.y : v70.v, j00Var, h02Var, 48);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarI0);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, kb4VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            this.t.l(h02Var, 0);
            ek1 ek1VarV = yj1.v(jr2.F(f83.a, h02Var), 2);
            zu4 zu4VarF = jr2.F(f83.t, h02Var);
            i00 i00Var = hi0.h;
            gp4.r(nb4.g, z2, null, ek1VarV.g(yj1.y(zu4VarF, i00Var, 12)), yj1.x(jr2.F(f83.m, h02Var), 2).g(yj1.l(jr2.F(f83.j, h02Var), i00Var, 12)), null, ue5.m0(-660008666, new vq1(this.a), h02Var), h02Var, 1572870, 18);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
