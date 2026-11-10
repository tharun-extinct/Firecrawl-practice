package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class af0 implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ long c;
    public final /* synthetic */ float j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ long q;
    public final /* synthetic */ bo3 t;
    public final /* synthetic */ nm0 w;

    public af0(float f, bo3 bo3Var, bz1 bz1Var, bz1 bz1Var2, long j, nm0 nm0Var, long j2) {
        this.j = f;
        this.t = bo3Var;
        this.a = bz1Var;
        this.m = bz1Var2;
        this.q = j;
        this.w = nm0Var;
        this.c = j2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            zu4 zu4VarF = jr2.F(f83.q, h02Var);
            zu4 zu4VarF2 = jr2.F(f83.m, h02Var);
            zu4 zu4VarF3 = jr2.F(f83.t, h02Var);
            zu4 zu4VarF4 = jr2.F(f83.a, h02Var);
            float f = this.j;
            g73 g73Var = g73.g;
            j73 j73VarD0 = ue5.d0(mq4.y(g73Var, 0.0f, f, 1), this.t);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new hf0();
                h02Var.i0(objK);
            }
            hf0 hf0Var = (hf0) objK;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarD0);
            jo0.n.getClass();
            h02Var.b0();
            boolean z = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, hf0Var);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            j73 j73VarX = ue5.X(g73Var, "leadingIcon");
            bz1 bz1Var = this.a;
            boolean z2 = bz1Var != null;
            i00 i00Var = hi0.h;
            gp4.n(z2, j73VarX, yj1.y(zu4VarF3, i00Var, 12).g(yj1.v(zu4VarF, 2)), yj1.l(zu4VarF4, i00Var, 12).g(yj1.x(zu4VarF2, 2)), null, ue5.m0(687705959, new ye0(bz1Var, this.q), h02Var), h02Var, 196656, 16);
            j73 j73VarX2 = ue5.X(g73Var, "label");
            bo3 bo3Var = ff0.g;
            j73 j73VarG0 = ue5.g0(j73VarX2, 8.0f, 0.0f, 2);
            kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var, 54);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarG0);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                du4.f(iS2, h02Var, iS2, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW2);
            du4.h(0, this.w, h02Var, true);
            j73 j73VarX3 = ue5.X(g73Var, "trailingIcon");
            bz1 bz1Var2 = this.m;
            boolean z3 = bz1Var2 != null;
            i00 i00Var2 = hi0.f;
            gp4.n(z3, j73VarX3, yj1.y(zu4VarF3, i00Var2, 12).g(yj1.v(zu4VarF, 2)), yj1.l(zu4VarF4, i00Var2, 12).g(yj1.x(zu4VarF2, 2)), null, ue5.m0(1905252304, new ze0(bz1Var2, this.c), h02Var), h02Var, 196656, 16);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
