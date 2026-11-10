package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w61 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ my1 t;
    public final /* synthetic */ jz1 w;

    public /* synthetic */ w61(v81 v81Var, g61 g61Var, my1 my1Var, ob3 ob3Var, my1 my1Var2, my1 my1Var3, my1 my1Var4) {
        this.a = v81Var;
        this.m = g61Var;
        this.t = my1Var;
        this.i = ob3Var;
        this.q = my1Var2;
        this.w = my1Var3;
        this.c = my1Var4;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        List listD;
        h02 h02Var;
        ol1 ol1Var;
        bz1 bz1Var;
        ob3 ob3Var;
        xy1 xy1Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        sx1 sx1Var = um2.Z;
        Object obj4 = this.i;
        Object obj5 = this.c;
        jz1 jz1Var = this.w;
        Object obj6 = this.q;
        Object obj7 = this.m;
        Object obj8 = this.a;
        g73 g73Var = g73.g;
        switch (b) {
            case 0:
                v81 v81Var = (v81) obj8;
                g61 g61Var = (g61) obj7;
                bw4 bw4Var = (bw4) obj4;
                my1 my1Var = (my1) obj6;
                my1 my1Var2 = (my1) jz1Var;
                my1 my1Var3 = (my1) obj5;
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j73 j73VarE0 = ue5.e0(g73Var, 16.0f);
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarE0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    on0 on0Var = tg1.w;
                    xs2.E(on0Var, h02Var2, ek0VarG);
                    on0 on0Var2 = tg1.q;
                    xs2.E(on0Var2, h02Var2, tr3VarQ);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    on0 on0Var3 = tg1.c;
                    xs2.E(on0Var3, h02Var2, numValueOf);
                    xs2.D(h02Var2);
                    on0 on0Var4 = tg1.m;
                    xs2.E(on0Var4, h02Var2, j73VarW);
                    wq wqVar = v70.y;
                    j00 j00Var = hi0.p;
                    kb4 kb4VarG = jb4.g(wqVar, j00Var, h02Var2, 0);
                    int iHashCode2 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, g73Var);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var, h02Var2, kb4VarG);
                    xs2.E(on0Var2, h02Var2, tr3VarQ2);
                    du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
                    xs2.E(on0Var4, h02Var2, j73VarW2);
                    g75.y(String.valueOf(g61Var.j), new tp2(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).v, h02Var2, 0, 0, 131068);
                    k33.w(this.t, null, false, null, null, og0.l, h02Var2, 1572864, 62);
                    h02Var2.b(true);
                    y94.y(Integer.valueOf(v81Var.y), null, null, null, "CardTitle", null, og0.j, h02Var2, 1597440, 46);
                    y94.y((Integer) bw4Var.getValue(), null, null, null, "CardMessage", null, ue5.m0(2061398301, new tm0((byte) 6), h02Var2), h02Var2, 1597440, 46);
                    mq2.y(h02Var2, mq4.n(g73Var, 16.0f));
                    kb4 kb4VarG2 = jb4.g(wqVar, j00Var, h02Var2, 0);
                    int iHashCode3 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ3 = h02Var2.q();
                    j73 j73VarW3 = m50.W(h02Var2, g73Var);
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(on0Var, h02Var2, kb4VarG2);
                    xs2.E(on0Var2, h02Var2, tr3VarQ3);
                    du4.k(iHashCode3, h02Var2, on0Var3, h02Var2);
                    xs2.E(on0Var4, h02Var2, j73VarW3);
                    r81 r81Var = r81.r;
                    c93.x(v81Var.equals(r81Var) ? my1Var : my1Var2, null, v81Var.equals(t81.r) || v81Var.equals(r81Var), null, null, null, null, null, ue5.m0(2083854419, new tn((Object) v81Var, (byte) 3), h02Var2), h02Var2, 805306368, 506);
                    mq2.y(h02Var2, mq4.q(g73Var, 8.0f));
                    c93.x(my1Var3, null, v81Var.equals(r81Var), null, null, null, null, null, og0.a, h02Var2, 805306368, 506);
                    h02Var2.b(true);
                    h02Var2.b(true);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            default:
                on0 on0Var5 = tg1.m;
                on0 on0Var6 = tg1.c;
                int i = 1;
                on0 on0Var7 = tg1.q;
                on0 on0Var8 = tg1.w;
                ob3 ob3Var2 = (ob3) obj8;
                ob3 ob3Var3 = (ob3) obj7;
                ol1 ol1Var2 = (ol1) obj6;
                xy1 xy1Var2 = (xy1) jz1Var;
                wi2 wi2Var = (wi2) obj5;
                bz1 bz1Var2 = (bz1) obj4;
                f60 f60Var = (f60) obj;
                h02 h02Var3 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                f60Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var3.x(f60Var) ? 4 : 2;
                }
                xy1 xy1Var3 = xy1Var2;
                if (h02Var3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z = vb1.g(f60Var.g(), 560.0f) > 0;
                    float fG = f60Var.g();
                    bz1 bz1Var3 = bz1Var2;
                    j51 j51Var = f60Var.g;
                    ob3 ob3Var4 = ob3Var3;
                    ob3 ob3Var5 = ob3Var2;
                    long j = f60Var.y;
                    int iG = vb1.g(fG, ws0.v(j) ? j51Var.y0(ws0.t(j)) : Float.POSITIVE_INFINITY);
                    l76 l76Var = oo0.g;
                    if (iG >= 0 || vb1.g(f60Var.g(), 360.0f) >= 0) {
                        h02Var3.X(-1494440093);
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(-1494599619);
                        yl0 yl0VarF = gp4.F((Context) h02Var3.a(sa.y));
                        Boolean bool = Boolean.TRUE;
                        boolean zJ = h02Var3.j(yl0VarF);
                        Object objK = h02Var3.K();
                        if (zJ || objK == l76Var) {
                            objK = new qx(yl0VarF, null, (byte) 6);
                            h02Var3.i0(objK);
                        }
                        k33.b((bz1) objK, h02Var3, bool);
                        h02Var3.b(false);
                    }
                    boolean zL = h02Var3.l(((Boolean) ob3Var5.getValue()).booleanValue()) | h02Var3.l(z);
                    Object objK2 = h02Var3.K();
                    if (zL || objK2 == l76Var) {
                        xf5 xf5Var = xf5.t;
                        xf5 xf5Var2 = xf5.j;
                        xf5 xf5Var3 = xf5.a;
                        if (z) {
                            listD = ((Boolean) ob3Var5.getValue()).booleanValue() ? pw5.d(xf5Var2, xf5Var3, xf5Var) : pw5.d(xf5Var, xf5Var3, xf5Var2);
                        } else {
                            listD = ((Boolean) ob3Var5.getValue()).booleanValue() ? pw5.d(xf5Var3, xf5Var) : pw5.d(xf5Var3, xf5Var2);
                        }
                        objK2 = listD;
                        h02Var3.i0(objK2);
                    }
                    List list = (List) objK2;
                    ek0 ek0VarG2 = ck0.g(v70.n, hi0.o, h02Var3, 48);
                    int iHashCode4 = Long.hashCode(h02Var3.T);
                    tr3 tr3VarQ4 = h02Var3.q();
                    j73 j73VarW4 = m50.W(h02Var3, g73Var);
                    jo0.n.getClass();
                    h02Var3.b0();
                    if (h02Var3.S) {
                        h02Var3.m(sx1Var);
                    } else {
                        h02Var3.l0();
                    }
                    xs2.E(on0Var8, h02Var3, ek0VarG2);
                    xs2.E(on0Var7, h02Var3, tr3VarQ4);
                    xs2.E(on0Var6, h02Var3, Integer.valueOf(iHashCode4));
                    xs2.D(h02Var3);
                    xs2.E(on0Var5, h02Var3, j73VarW4);
                    if (z || !((Boolean) ob3Var5.getValue()).booleanValue()) {
                        h02Var3.X(-561209671);
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(-561266370);
                        mq2.y(h02Var3, gk0.g(g73Var, 1.0f));
                        h02Var3.b(false);
                    }
                    gp4.y(gk0.g, ((Boolean) ob3Var4.getValue()).booleanValue(), null, null, null, null, ue5.m0(-849133231, new tn((Object) ol1Var2, (byte) 7), h02Var3), h02Var3, 1572870, 30);
                    h02 h02Var4 = h02Var3;
                    h02Var4.X(-1265021703);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int iOrdinal = ((xf5) it.next()).ordinal();
                        if (iOrdinal == 0) {
                            h02Var = h02Var4;
                            ol1Var = ol1Var2;
                            bz1Var = bz1Var3;
                            ob3Var = ob3Var4;
                            h02Var.X(-2120474378);
                            xy1Var = xy1Var3;
                            by5.n(gk0.g(mq4.r(ue5.e0(g73Var, 2.0f), 1.0f), 1.0f), xy1Var, h02Var, 0);
                            h02Var.b(false);
                        } else if (iOrdinal == i) {
                            h02Var = h02Var4;
                            ol1Var = ol1Var2;
                            ob3Var = ob3Var4;
                            h02Var.X(-1309889252);
                            bz1Var = bz1Var3;
                            og0.y(hp0.c.g(fl2.j), ue5.m0(-1432505226, new r2((Object) wi2Var, (Object) ol1Var, (Object) bz1Var, (byte) 15), h02Var), h02Var, 56);
                            h02Var.b(false);
                            xy1Var = xy1Var3;
                        } else {
                            if (iOrdinal != 2) {
                                h02 h02Var5 = h02Var4;
                                h02Var5.X(-2120473614);
                                h02Var5.b(false);
                                up.y();
                                return null;
                            }
                            h02Var4.X(-1309272693);
                            kb4 kb4VarG3 = jb4.g(v70.y, hi0.p, h02Var4, 0);
                            ol1Var = ol1Var2;
                            int iHashCode5 = Long.hashCode(h02Var4.T);
                            tr3 tr3VarQ5 = h02Var4.q();
                            j73 j73VarW5 = m50.W(h02Var4, g73Var);
                            jo0.n.getClass();
                            h02Var4.b0();
                            if (h02Var4.S) {
                                h02Var4.m(sx1Var);
                            } else {
                                h02Var4.l0();
                            }
                            xs2.E(on0Var8, h02Var4, kb4VarG3);
                            xs2.E(on0Var7, h02Var4, tr3VarQ5);
                            xs2.E(on0Var6, h02Var4, Integer.valueOf(iHashCode5));
                            xs2.D(h02Var4);
                            xs2.E(on0Var5, h02Var4, j73VarW5);
                            c93.s(this.t, null, false, null, null, null, ue5.m0(-301688138, new tn((Object) wi2Var, (byte) 8), h02Var4), h02Var4, 805306368, 510);
                            mq2.y(h02Var4, new tp2(1.0f, true));
                            ob3Var = ob3Var4;
                            boolean zX = h02Var4.x(ob3Var);
                            Object objK3 = h02Var4.K();
                            if (zX || objK3 == l76Var) {
                                objK3 = new ef(ob3Var, (byte) 19);
                                h02Var4.i0(objK3);
                            }
                            h02 h02Var6 = h02Var4;
                            c93.s((my1) objK3, null, false, null, null, null, lz5.g, h02Var6, 805306368, 510);
                            h02Var = h02Var6;
                            ob3 ob3Var6 = ob3Var5;
                            boolean zX2 = h02Var.x(ob3Var6);
                            Object objK4 = h02Var.K();
                            if (zX2 || objK4 == l76Var) {
                                objK4 = new ef(ob3Var6, (byte) 20);
                                h02Var.i0(objK4);
                            }
                            k33.w((my1) objK4, null, false, null, null, ue5.m0(-1666061835, new db(z, ob3Var6), h02Var), h02Var, 1572864, 62);
                            h02Var.b(true);
                            h02Var.b(false);
                            ob3Var5 = ob3Var6;
                            xy1Var = xy1Var3;
                            bz1Var = bz1Var3;
                        }
                        it = it;
                        bz1Var3 = bz1Var;
                        ob3Var4 = ob3Var;
                        h02Var4 = h02Var;
                        xy1Var3 = xy1Var;
                        ol1Var2 = ol1Var;
                        on0Var5 = on0Var5;
                        i = 1;
                    }
                    h02 h02Var7 = h02Var4;
                    h02Var7.b(false);
                    h02Var7.b(true);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
        }
    }

    public /* synthetic */ w61(ob3 ob3Var, ob3 ob3Var2, ol1 ol1Var, xy1 xy1Var, wi2 wi2Var, bz1 bz1Var, my1 my1Var) {
        this.a = ob3Var;
        this.m = ob3Var2;
        this.q = ol1Var;
        this.w = xy1Var;
        this.c = wi2Var;
        this.i = bz1Var;
        this.t = my1Var;
    }
}
