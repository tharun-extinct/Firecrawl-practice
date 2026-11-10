package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class df3 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bz1 j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ nm0 q;
    public final /* synthetic */ m11 t;

    public df3(bz1 bz1Var, m11 m11Var, boolean z, bz1 bz1Var2, nm0 nm0Var) {
        this.j = bz1Var;
        this.t = m11Var;
        this.a = z;
        this.m = bz1Var2;
        this.q = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        boolean z;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            g73 g73Var = g73.g;
            j73 j73VarI0 = ue5.i0(g73Var, 16.0f, 0.0f, 24.0f, 0.0f, 10);
            kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var, 48);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarI0);
            jo0.n.getClass();
            h02Var.b0();
            boolean z2 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z2) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, kb4VarG);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            bz1 bz1Var = this.j;
            m11 m11Var = this.t;
            boolean z3 = this.a;
            if (bz1Var != null) {
                h02Var.X(-2013920011);
                h02Var.X(1141354218);
                ob3 ob3VarQ = kq2.Q(new jj0(z3 ? m11Var.g : m11Var.y), h02Var);
                h02Var.b(false);
                jj0 jj0Var = (jj0) ob3VarQ.getValue();
                long j = jj0Var.g;
                og0.y(mt0.g.g(jj0Var), bz1Var, h02Var, 8);
                mq2.y(h02Var, mq4.q(g73Var, 12.0f));
                z = false;
                h02Var.b(false);
            } else {
                z = false;
                h02Var.X(-2013707630);
                h02Var.b(false);
            }
            tp2 tp2Var = new tp2(1.0f, true);
            t33 t33VarR = z50.r(hi0.t, z);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, tp2Var);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                du4.f(iS2, h02Var, iS2, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW2);
            h02Var.X(1275109558);
            ob3 ob3VarQ2 = kq2.Q(new jj0(z3 ? m11Var.r : m11Var.n), h02Var);
            h02Var.b(false);
            jj0 jj0Var2 = (jj0) ob3VarQ2.getValue();
            long j2 = jj0Var2.g;
            vf1 vf1Var = mt0.g;
            og0.y(vf1Var.g(jj0Var2), this.q, h02Var, 8);
            h02Var.b(true);
            bz1 bz1Var2 = this.m;
            if (bz1Var2 != null) {
                h02Var.X(-2013454639);
                mq2.y(h02Var, mq4.q(g73Var, 12.0f));
                h02Var.X(-561675044);
                ob3 ob3VarQ3 = kq2.Q(new jj0(z3 ? m11Var.l : m11Var.j), h02Var);
                h02Var.b(false);
                jj0 jj0Var3 = (jj0) ob3VarQ3.getValue();
                long j3 = jj0Var3.g;
                og0.y(vf1Var.g(jj0Var3), bz1Var2, h02Var, 8);
                h02Var.b(false);
            } else {
                h02Var.X(-2013238414);
                h02Var.b(false);
            }
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
