package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class as4 implements cz1 {
    public final /* synthetic */ jn1 a;
    public final /* synthetic */ wr4 j;
    public final /* synthetic */ String m;
    public final /* synthetic */ wr4 t;

    public as4(wr4 wr4Var, wr4 wr4Var2, jn1 jn1Var, String str) {
        this.j = wr4Var;
        this.t = wr4Var2;
        this.a = jn1Var;
        this.m = str;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        bz1 bz1Var = (bz1) obj;
        h02 h02Var = (h02) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= h02Var.j(bz1Var) ? 4 : 2;
        }
        if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            wr4 wr4Var = this.t;
            wr4 wr4Var2 = this.j;
            boolean zP = yf2.p(wr4Var2, wr4Var);
            zu4 zu4VarF = jr2.F(f83.m, h02Var);
            boolean zX = h02Var.x(wr4Var2);
            jn1 jn1Var = this.a;
            boolean zJ = zX | h02Var.j(jn1Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zJ || objK == l76Var) {
                objK = new o82((Object) wr4Var2, (Object) jn1Var, (byte) 16);
                h02Var.i0(objK);
            }
            my1 my1Var = (my1) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = c93.y(!zP ? 1.0f : 0.0f);
                h02Var.i0(objK2);
            }
            qg qgVar = (qg) objK2;
            Boolean boolValueOf = Boolean.valueOf(zP);
            boolean zJ2 = h02Var.j(qgVar) | h02Var.l(zP) | h02Var.j(zu4VarF) | h02Var.x(my1Var);
            Object objK3 = h02Var.K();
            if (zJ2 || objK3 == l76Var) {
                n81 n81Var = new n81(qgVar, zP, zu4VarF, my1Var, (mu0) null);
                h02Var.i0(n81Var);
                objK3 = n81Var;
            }
            k33.b((bz1) objK3, h02Var, boolValueOf);
            pi piVar = qgVar.r;
            zu4 zu4VarF2 = jr2.F(f83.t, h02Var);
            Object objK4 = h02Var.K();
            if (objK4 == l76Var) {
                objK4 = c93.y(zP ? 0.8f : 1.0f);
                h02Var.i0(objK4);
            }
            qg qgVar2 = (qg) objK4;
            Boolean boolValueOf2 = Boolean.valueOf(zP);
            boolean zJ3 = h02Var.j(qgVar2) | h02Var.l(zP) | h02Var.j(zu4VarF2);
            Object objK5 = h02Var.K();
            if (zJ3 || objK5 == l76Var) {
                yx yxVar = new yx((Object) qgVar2, zP, (Object) zu4VarF2, (mu0) null, (byte) 4);
                h02Var.i0(yxVar);
                objK5 = yxVar;
            }
            k33.b((bz1) objK5, h02Var, boolValueOf2);
            pi piVar2 = qgVar2.r;
            j73 j73VarN = yf2.N(g73.g, ((Number) piVar2.t.getValue()).floatValue(), ((Number) piVar2.t.getValue()).floatValue(), ((Number) piVar.t.getValue()).floatValue(), 0.0f, null, 131064);
            boolean zL = h02Var.l(zP) | h02Var.x(wr4Var2);
            String str = this.m;
            boolean zX2 = zL | h02Var.x(str);
            Object objK6 = h02Var.K();
            if (zX2 || objK6 == l76Var) {
                objK6 = new qg4(zP, str, wr4Var2);
                h02Var.i0(objK6);
            }
            j73 j73VarG = dj4.g(j73VarN, false, (xy1) objK6);
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
            du4.o(iIntValue & 14, bz1Var, h02Var, true);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
