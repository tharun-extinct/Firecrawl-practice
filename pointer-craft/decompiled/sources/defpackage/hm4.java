package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hm4 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ jz1 q;
    public final /* synthetic */ Object t;

    public /* synthetic */ hm4(Object obj, Object obj2, Object obj3, jz1 jz1Var, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = jz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        jz1 jz1Var = this.q;
        Object obj3 = this.m;
        Object obj4 = this.a;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                st4 st4Var = (st4) obj4;
                xy1 xy1Var = (xy1) jz1Var;
                String str = (String) obj3;
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    boolean z = ((hm3) obj5).x;
                    l76 l76Var = oo0.g;
                    if (!z) {
                        h02Var.X(909189690);
                        boolean zContains = st4Var.contains(str);
                        boolean zX = h02Var.x(xy1Var) | h02Var.x(str);
                        Object objK = h02Var.K();
                        if (zX || objK == l76Var) {
                            objK = new gm4(xy1Var, str, (byte) 1);
                            h02Var.i0(objK);
                        }
                        ie6.g(zContains, (my1) objK, null, false, null, h02Var, 0);
                        h02Var.b(false);
                    } else {
                        h02Var.X(908899189);
                        boolean zContains2 = st4Var.contains(str);
                        boolean zX2 = h02Var.x(xy1Var) | h02Var.x(str);
                        Object objK2 = h02Var.K();
                        if (zX2 || objK2 == l76Var) {
                            objK2 = new sd(xy1Var, str, (byte) 8);
                            h02Var.i0(objK2);
                        }
                        k05.g(zContains2, (xy1) objK2, null, null, false, null, h02Var, 0, 124);
                        h02Var.b(false);
                    }
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    j73 j73VarX = ue5.X(g73.g, "Container");
                    y45 y45Var = new y45((ob3) obj5, ob3.class, "value", "getValue()Ljava/lang/Object;", 0);
                    zi6.l((j55) obj4);
                    j73 j73VarI = a11.i(j73VarX, new q2(y45Var, (zn3) obj3, hi0.h, (byte) 19));
                    bz1 bz1Var = (bz1) jz1Var;
                    t33 t33VarR = z50.r(hi0.t, true);
                    int iS = pw5.s(h02Var2);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarI);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, t33VarR);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    on0 on0Var = tg1.c;
                    if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS))) {
                        du4.f(iS, h02Var2, iS, on0Var);
                    }
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    du4.o(0, bz1Var, h02Var2, true);
                }
                break;
        }
        return og5Var;
    }
}
