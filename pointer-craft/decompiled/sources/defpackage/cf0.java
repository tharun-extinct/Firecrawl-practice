package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cf0 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ float j;
    public final /* synthetic */ zn3 t;

    public cf0(float f, zn3 zn3Var, long j, nm0 nm0Var, long j2) {
        this.j = f;
        this.t = zn3Var;
        this.a = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
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
            h02Var.X(-410471693);
            h02Var.b(false);
            j73 j73VarX = ue5.X(g73Var, "label");
            bo3 bo3Var = ff0.g;
            j73 j73VarF0 = ue5.f0(j73VarX, 8.0f, 0.0f);
            kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var, 54);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarF0);
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
            this.a.l(h02Var, 0);
            h02Var.b(true);
            h02Var.X(-409588813);
            h02Var.b(false);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
