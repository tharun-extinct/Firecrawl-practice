package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gx implements cz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ String t;

    public /* synthetic */ gx(String str, xy1 xy1Var, ob3 ob3Var, boolean z) {
        this.t = str;
        this.m = xy1Var;
        this.q = ob3Var;
        this.a = z;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj4 = this.q;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                ja3 ja3Var = (ja3) obj5;
                t45 t45Var = (t45) obj4;
                bz1 bz1Var = (bz1) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                bz1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= h02Var.j(bz1Var) ? 4 : 2;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    h02Var.Q();
                } else {
                    bi6 bi6Var = bi6.u;
                    bi6Var.w(this.t, bz1Var, this.a, true, aj6.p, ja3Var, null, null, null, null, null, t45Var, bi6.s(bi6Var, 12), null, h02Var, ((iIntValue << 3) & 112) | 224256, 100663296, 163776);
                }
                break;
            default:
                xy1 xy1Var = (xy1) obj5;
                ob3 ob3Var = (ob3) obj4;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    g73 g73Var = g73.g;
                    m50.p(ue5.i0(g73Var, 0.0f, 4.0f, 0.0f, 16.0f, 5), 0.0f, 0L, h02Var2, 6, 6);
                    String strI = xs2.I(R.string.connect_hidden_edit_text, h02Var2);
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    vf1 vf1Var = of5.g;
                    g75.y(strI, j73VarR, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).t, h02Var2, 48, 0, 131068);
                    mq2.y(h02Var2, mq4.n(g73Var, 8.0f));
                    gp4.u((String) ob3Var.getValue(), h02Var2, 0);
                    j73 j73VarG0 = ue5.g0(mq4.r(g73Var, 1.0f), 0.0f, 8.0f, 1);
                    kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var2, 6);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarG0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, kb4VarG);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    g75.y(xs2.I(R.string.connect_hidden_helper_text, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).m, h02Var2, 0, 0, 131070);
                    h02Var2.b(true);
                    String str = this.t;
                    boolean zX = h02Var2.x(str) | h02Var2.x(xy1Var);
                    Object objK = h02Var2.K();
                    l76 l76Var = oo0.g;
                    if (zX || objK == l76Var) {
                        objK = new p2(str, xy1Var, (byte) 24);
                        h02Var2.i0(objK);
                    }
                    my1 my1Var = (my1) objK;
                    c93.x(my1Var, null, str != null, null, null, null, null, null, ue5.m0(1800132701, new ct((byte) 2, this.a), h02Var2), h02Var2, 805306368, 506);
                    Object objK2 = h02Var2.K();
                    if (objK2 == l76Var) {
                        objK2 = new ff(ob3Var, (byte) 9);
                        h02Var2.i0(objK2);
                    }
                    gp4.s((xy1) objK2, h02Var2, 6);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ gx(String str, boolean z, ja3 ja3Var, t45 t45Var) {
        this.t = str;
        this.a = z;
        this.m = ja3Var;
        this.q = t45Var;
    }
}
