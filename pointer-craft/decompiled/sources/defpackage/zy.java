package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zy implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ zy(g61 g61Var, my1 my1Var, my1 my1Var2, j73 j73Var, int i) {
        this.j = (byte) 2;
        this.a = g61Var;
        this.m = my1Var;
        this.q = my1Var2;
        this.t = j73Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        boolean z;
        byte b = this.j;
        l76 l76Var = oo0.g;
        g73 g73Var = g73.g;
        sx1 sx1Var = um2.Z;
        og5 og5Var = og5.g;
        Object obj3 = this.q;
        Object obj4 = this.m;
        Object obj5 = this.a;
        Object obj6 = this.t;
        switch (b) {
            case 0:
                j73 j73Var = (j73) obj6;
                ob3 ob3Var = (ob3) obj5;
                nm0 nm0Var = (nm0) obj4;
                yy yyVar = (yy) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    Object objK = h02Var.K();
                    if (objK == l76Var) {
                        objK = new ff(ob3Var, (byte) 4);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN = k33.N(j73Var, (xy1) objK);
                    t33 t33VarR = z50.r(hi0.t, true);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarN);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, t33VarR);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    nm0Var.l(h02Var, 0);
                    Object objK2 = h02Var.K();
                    if (objK2 == l76Var) {
                        objK2 = new ef(ob3Var, (byte) 7);
                        h02Var.i0(objK2);
                    }
                    yyVar.y((my1) objK2, h02Var, 6);
                    h02Var.b(true);
                }
                break;
            case 1:
                bg5 bg5Var = (bg5) obj6;
                b90 b90Var = (b90) obj5;
                bw4 bw4Var = (bw4) obj4;
                g90 g90Var = (g90) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var2, 0);
                    int iHashCode2 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, j73VarR);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    on0 on0Var = tg1.w;
                    xs2.E(on0Var, h02Var2, kb4VarG);
                    on0 on0Var2 = tg1.q;
                    xs2.E(on0Var2, h02Var2, tr3VarQ2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    on0 on0Var3 = tg1.c;
                    xs2.E(on0Var3, h02Var2, numValueOf);
                    xs2.D(h02Var2);
                    on0 on0Var4 = tg1.m;
                    xs2.E(on0Var4, h02Var2, j73VarW2);
                    nb4 nb4Var = nb4.g;
                    j73 j73VarG = nb4Var.g(g73Var, 1.0f, true);
                    t33 t33VarR2 = z50.r(hi0.w, false);
                    int iHashCode3 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ3 = h02Var2.q();
                    j73 j73VarW3 = m50.W(h02Var2, j73VarG);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var, h02Var2, t33VarR2);
                    xs2.E(on0Var2, h02Var2, tr3VarQ3);
                    du4.k(iHashCode3, h02Var2, on0Var3, h02Var2);
                    xs2.E(on0Var4, h02Var2, j73VarW3);
                    boolean zJ = h02Var2.j(b90Var);
                    Object objK3 = h02Var2.K();
                    if (zJ || objK3 == l76Var) {
                        objK3 = new c80(b90Var, (byte) 2);
                        h02Var2.i0(objK3);
                    }
                    xy1 xy1Var = (xy1) objK3;
                    boolean zJ2 = h02Var2.j(b90Var);
                    Object objK4 = h02Var2.K();
                    if (zJ2 || objK4 == l76Var) {
                        objK4 = new c80(b90Var, (byte) 3);
                        h02Var2.i0(objK4);
                    }
                    xy1 xy1Var2 = (xy1) objK4;
                    boolean zJ3 = h02Var2.j(b90Var);
                    Object objK5 = h02Var2.K();
                    if (zJ3 || objK5 == l76Var) {
                        objK5 = new c80(b90Var, (byte) 4);
                        h02Var2.i0(objK5);
                    }
                    xy1 xy1Var3 = (xy1) objK5;
                    boolean zJ4 = h02Var2.j(b90Var);
                    Object objK6 = h02Var2.K();
                    if (zJ4 || objK6 == l76Var) {
                        z = true;
                        objK6 = new ed(b90Var, 1 == true ? 1 : 0);
                        h02Var2.i0(objK6);
                    } else {
                        z = true;
                    }
                    rz5.x(null, bg5Var, xy1Var, xy1Var2, xy1Var3, (bz1) objK6, h02Var2, 64);
                    h02Var2.b(z);
                    g61 g61Var = (g61) bw4Var.getValue();
                    gp4.r(nb4Var, g61Var != null && g61Var.l() == z, null, null, null, null, ue5.m0(994197805, new ya4((Object) b90Var, (Object) g90Var, (Object) bw4Var, (byte) 2), h02Var2), h02Var2, 1572870, 30);
                    h02Var2.b(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ue5.q((g61) obj5, (my1) obj4, (my1) obj3, (j73) obj6, (h02) obj, aq2.J(1));
                break;
            case 3:
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj3;
                nm0 nm0Var2 = (nm0) obj4;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    g73 g73Var2 = g73.g;
                    j73 j73VarE0 = ue5.e0(mq4.r(g73Var2, 1.0f), 16.0f);
                    ek0 ek0VarG = ck0.g(v70.n, hi0.f, h02Var3, 48);
                    int iHashCode4 = Long.hashCode(h02Var3.T);
                    tr3 tr3VarQ4 = h02Var3.q();
                    j73 j73VarW4 = m50.W(h02Var3, j73VarE0);
                    jo0.n.getClass();
                    h02Var3.b0();
                    if (h02Var3.S) {
                        h02Var3.m(sx1Var);
                    } else {
                        h02Var3.l0();
                    }
                    xs2.E(tg1.w, h02Var3, ek0VarG);
                    xs2.E(tg1.q, h02Var3, tr3VarQ4);
                    xs2.E(tg1.c, h02Var3, Integer.valueOf(iHashCode4));
                    xs2.D(h02Var3);
                    xs2.E(tg1.m, h02Var3, j73VarW4);
                    vf1 vf1Var = of5.g;
                    g75.y(str, mq4.r(ue5.i0(g73Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var3.a(vf1Var)).c, h02Var3, 48, 0, 131068);
                    g75.y(str2, mq4.r(ue5.i0(g73Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var3.a(vf1Var)).j, h02Var3, 48, 0, 131068);
                    g75.y(str3, mq4.r(ue5.i0(g73Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var3.a(vf1Var)).m, h02Var3, 48, 0, 131068);
                    nm0Var2.x(gk0.g, h02Var3, 6);
                    h02Var3.b(true);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                zx5.r((sj2) obj6, (ss2) obj5, (my1) obj4, (my1) obj3, (h02) obj, aq2.J(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                nc6.v((ao2) obj6, (xy1) obj5, (xy1) obj4, (xy1) obj3, (h02) obj, aq2.J(9));
                break;
            default:
                rf4 rf4Var = (rf4) obj6;
                w14 w14Var = (w14) obj5;
                my1 my1Var = (my1) obj4;
                my1 my1Var2 = (my1) obj3;
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    j73 j73VarX = ah6.x(gp4.P(g73Var, rf4Var, true), rf4Var, h02Var4);
                    ek0 ek0VarG2 = ck0.g(new yq(4.0f, true, new l0((byte) 2)), hi0.h, h02Var4, 6);
                    int iHashCode5 = Long.hashCode(h02Var4.T);
                    tr3 tr3VarQ5 = h02Var4.q();
                    j73 j73VarW5 = m50.W(h02Var4, j73VarX);
                    jo0.n.getClass();
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(sx1Var);
                    } else {
                        h02Var4.l0();
                    }
                    xs2.E(tg1.w, h02Var4, ek0VarG2);
                    xs2.E(tg1.q, h02Var4, tr3VarQ5);
                    xs2.E(tg1.c, h02Var4, Integer.valueOf(iHashCode5));
                    xs2.D(h02Var4);
                    xs2.E(tg1.m, h02Var4, j73VarW5);
                    h02Var4.X(-617066293);
                    Iterator it = w14Var.g.iterator();
                    while (it.hasNext()) {
                        ge6.g((b91) it.next(), h02Var4, 0);
                    }
                    h02Var4.b(false);
                    c84 c84Var = w14Var.y;
                    if (c84Var == null) {
                        h02Var4.X(-1949100493);
                        h02Var4.b(false);
                    } else {
                        h02Var4.X(-1949100492);
                        mq2.y(h02Var4, mq4.n(g73Var, 8.0f));
                        m50.p(null, 0.0f, 0L, h02Var4, 0, 7);
                        mq2.y(h02Var4, mq4.n(g73Var, 8.0f));
                        ge6.n(c84Var, my1Var, my1Var2, h02Var4, 0);
                        h02Var4.b(false);
                    }
                    h02Var4.b(true);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ zy(pl5 pl5Var, Object obj, jz1 jz1Var, jz1 jz1Var2, int i, byte b) {
        this.j = b;
        this.t = pl5Var;
        this.a = obj;
        this.m = jz1Var;
        this.q = jz1Var2;
    }

    public /* synthetic */ zy(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }

    public /* synthetic */ zy(String str, String str2, String str3, nm0 nm0Var) {
        this.j = (byte) 3;
        this.t = str;
        this.a = str2;
        this.q = str3;
        this.m = nm0Var;
    }
}
