package defpackage;

import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ go(nk nkVar, ex4 ex4Var, g61 g61Var, List list, my1 my1Var, xy1 xy1Var) {
        this.m = nkVar;
        this.q = ex4Var;
        this.w = g61Var;
        this.t = list;
        this.a = my1Var;
        this.c = xy1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.c;
        Object obj4 = this.a;
        Object obj5 = this.w;
        Object obj6 = this.q;
        Object obj7 = this.t;
        Object obj8 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                m50.t((we1) obj8, (List) obj7, (mc3) obj6, (jd3) obj5, (my1) obj4, (nm0) obj3, (h02) obj, aq2.J(196609));
                break;
            case 1:
                nk nkVar = (nk) obj8;
                ex4 ex4Var = (ex4) obj6;
                g61 g61Var = (g61) obj5;
                List list = (List) obj7;
                my1 my1Var = (my1) obj4;
                xy1 xy1Var = (xy1) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, g73.g);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    w75 w75Var = nkVar.g;
                    w75 w75Var2 = nkVar.y;
                    Object objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new l1((byte) 17);
                        h02Var.i0(objK);
                    }
                    y94.y(w75Var, null, (xy1) objK, null, "AppBarTitle", null, m50.y, h02Var, 1597824, 42);
                    gk0 gk0Var = gk0.g;
                    if (w75Var2 != null) {
                        h02Var.X(-1813904852);
                        ra.g(gk0Var, w75Var2, m50.r, h02Var, 390);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1813448935);
                        gp4.y(gk0Var, nkVar.n && yf2.p(ex4Var, dx4.g), null, null, null, null, ue5.m0(1853838862, new ar2(g61Var, list, my1Var, xy1Var, (byte) 1), h02Var), h02Var, 1572870, 30);
                        h02Var.b(false);
                    }
                    h02Var.b(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                yf2.w((we1) obj8, (List) obj7, (List) obj3, (mc3) obj6, (jd3) obj5, (my1) obj4, (h02) obj, aq2.J(1));
                break;
            default:
                qr0 qr0Var = (qr0) obj8;
                ao2 ao2Var = (ao2) obj7;
                wm4 wm4Var = (wm4) obj6;
                jd3 jd3Var = (jd3) obj5;
                gp gpVar = (gp) obj4;
                bw4 bw4Var = (bw4) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    m50.x(qr0Var, ao2Var, wm4Var, ((Boolean) bw4Var.getValue()).booleanValue(), jd3Var, ((Intent) gpVar.n.getValue()) != null, h02Var2, 584);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ go(qr0 qr0Var, ao2 ao2Var, wm4 wm4Var, jd3 jd3Var, gp gpVar, ob3 ob3Var) {
        this.m = qr0Var;
        this.t = ao2Var;
        this.q = wm4Var;
        this.w = jd3Var;
        this.a = gpVar;
        this.c = ob3Var;
    }

    public /* synthetic */ go(we1 we1Var, List list, mc3 mc3Var, jd3 jd3Var, my1 my1Var, nm0 nm0Var, int i) {
        this.m = we1Var;
        this.t = list;
        this.q = mc3Var;
        this.w = jd3Var;
        this.a = my1Var;
        this.c = nm0Var;
    }

    public /* synthetic */ go(we1 we1Var, List list, List list2, mc3 mc3Var, jd3 jd3Var, my1 my1Var, int i) {
        this.m = we1Var;
        this.t = list;
        this.c = list2;
        this.q = mc3Var;
        this.w = jd3Var;
        this.a = my1Var;
    }
}
