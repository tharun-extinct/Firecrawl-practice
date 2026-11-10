package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mm4 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ mm4(Object obj, my1 my1Var, Object obj2, int i, byte b) {
        this.j = b;
        this.t = obj;
        this.m = my1Var;
        this.a = obj2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        Object obj3 = this.a;
        Object obj4 = this.m;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ke6.y((nm3) obj5, (ma4) obj3, (my1) obj4, (h02) obj, aq2.J(9));
                break;
            case 1:
                hp2[] hp2VarArr = (hp2[]) obj5;
                st4 st4Var = (st4) obj3;
                xy1 xy1Var = (xy1) obj4;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    boolean zX = h02Var.x(st4Var) | h02Var.x(xy1Var);
                    Object objK = h02Var.K();
                    if (zX || objK == l76Var) {
                        objK = new kn2(st4Var, xy1Var, (byte) 15);
                        h02Var.i0(objK);
                    }
                    kp4.r(hp2VarArr, (xy1) objK, h02Var, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                kp4.n((hp2[]) obj5, (int[]) obj3, (xy1) obj4, (h02) obj, aq2.J(1));
                break;
            case 3:
                rf4 rf4Var = (rf4) obj5;
                cj cjVar = (cj) obj3;
                ob3 ob3Var = (ob3) obj4;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    j73 j73VarP = gp4.P(ue5.f0(mq4.r(g73.g, 1.0f), 12.0f, 8.0f), rf4Var, false);
                    t33 t33VarR = z50.r(hi0.t, false);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarP);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, t33VarR);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    long jG = kq2.G(14);
                    Object objK2 = h02Var2.K();
                    if (objK2 == l76Var) {
                        objK2 = new ff(ob3Var, (byte) 22);
                        h02Var2.i0(objK2);
                    }
                    g75.r(cjVar, null, 0L, jG, lu1.m, 0L, null, 0L, 0, false, 1, 0, null, (xy1) objK2, null, h02Var2, 24576, 12610560, 368494);
                    h02Var2.b(true);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                hf6.g((jj) obj5, (my1) obj4, (j73) obj3, (h02) obj, aq2.J(393));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ib6.n((fo5) obj5, (bz1) obj3, (un5) obj4, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ib6.g(aq2.J(49), (my1) obj4, (xy1) obj3, (h02) obj, (List) obj5);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ mm4(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    public /* synthetic */ mm4(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }
}
