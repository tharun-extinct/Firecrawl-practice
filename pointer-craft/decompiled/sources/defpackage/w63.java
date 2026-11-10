package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w63 implements bz1 {
    public final /* synthetic */ xo4 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ xy1 c;
    public final /* synthetic */ nm0 f;
    public final /* synthetic */ bz1 h;
    public final /* synthetic */ j73 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ c73 m;
    public final /* synthetic */ bz1 o;
    public final /* synthetic */ cn4 p;
    public final /* synthetic */ qg q;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ my1 t;
    public final /* synthetic */ long u;
    public final /* synthetic */ ox0 w;
    public final /* synthetic */ long z;

    public w63(long j, my1 my1Var, xo4 xo4Var, c73 c73Var, qg qgVar, ox0 ox0Var, xy1 xy1Var, j73 j73Var, float f, boolean z, cn4 cn4Var, long j2, long j3, bz1 bz1Var, bz1 bz1Var2, nm0 nm0Var) {
        this.j = j;
        this.t = my1Var;
        this.a = xo4Var;
        this.m = c73Var;
        this.q = qgVar;
        this.w = ox0Var;
        this.c = xy1Var;
        this.i = j73Var;
        this.b = f;
        this.s = z;
        this.p = cn4Var;
        this.u = j2;
        this.z = j3;
        this.h = bz1Var;
        this.o = bz1Var2;
        this.f = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            j73 j73VarN = jf6.n(mq4.r, jf6.y);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new m92((byte) 13);
                h02Var.i0(objK);
            }
            j73 j73VarG = dj4.g(j73VarN, false, (xy1) objK);
            t33 t33VarR = z50.r(hi0.t, false);
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
            xo4 xo4Var = this.a;
            boolean z = ((yo4) ((z51) xo4Var.n.a).getValue()) != yo4.j;
            this.m.getClass();
            long j = this.j;
            my1 my1Var = this.t;
            b73.r(j, my1Var, z, h02Var, 0);
            b73.y(this.q, this.w, my1Var, this.c, this.i, xo4Var, this.b, this.s, this.p, this.u, this.z, 0.0f, this.h, this.o, this.f, h02Var, 70);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
