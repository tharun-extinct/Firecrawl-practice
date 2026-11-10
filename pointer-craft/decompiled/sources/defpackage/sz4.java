package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz4 implements bz1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ my1 b;
    public final /* synthetic */ ja3 c;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ j73 j;
    public final /* synthetic */ float m;
    public final /* synthetic */ nm0 p;
    public final /* synthetic */ z40 q;
    public final /* synthetic */ float s;
    public final /* synthetic */ cn4 t;
    public final /* synthetic */ boolean w;

    public sz4(j73 j73Var, cn4 cn4Var, long j, float f, z40 z40Var, boolean z, ja3 ja3Var, boolean z2, my1 my1Var, float f2, nm0 nm0Var) {
        this.j = j73Var;
        this.t = cn4Var;
        this.a = j;
        this.m = f;
        this.q = z40Var;
        this.w = z;
        this.c = ja3Var;
        this.i = z2;
        this.b = my1Var;
        this.s = f2;
        this.p = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            f72 f72Var = ye2.g;
            j73 j73VarE = k33.e(ra.P(uz4.v(this.j.n(c63.g), this.t, uz4.x(this.a, this.m, h02Var), this.q, ((j51) h02Var.a(hp0.j)).e(this.s)), this.w, this.c, k94.g(0.0f, 7, 0L, false), this.i, null, this.b));
            t33 t33VarR = z50.r(hi0.t, true);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarE);
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
            du4.h(0, this.p, h02Var, true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
