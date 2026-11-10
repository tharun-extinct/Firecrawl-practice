package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k71 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ k71(q81 q81Var, qr0 qr0Var, jd3 jd3Var, String str) {
        this.j = (byte) 5;
        this.a = q81Var;
        this.m = qr0Var;
        this.t = jd3Var;
        this.q = str;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.t;
        Object obj4 = this.m;
        Object obj5 = this.q;
        Object obj6 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pw5.r((g61) obj6, (List) obj4, (my1) obj3, (xy1) obj5, (h02) obj, aq2.J(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                yf2.m((sk2) obj6, (mc3) obj4, (jd3) obj5, (my1) obj3, (h02) obj, aq2.J(9));
                break;
            case 2:
                ((Integer) obj2).getClass();
                br2.g((my1) obj3, (j73) obj6, (pr2) obj4, (cr2) obj5, (h02) obj, aq2.J(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                j33.y((rj0) obj6, (un4) obj4, (mf5) obj3, (nm0) obj5, (h02) obj, aq2.J(3073));
                break;
            case 4:
                ((Integer) obj2).getClass();
                m50.j((jd3) obj6, (qr0) obj4, (wm4) obj3, (j73) obj5, (h02) obj, aq2.J(3649));
                break;
            case 5:
                q81 q81Var = (q81) obj6;
                qr0 qr0Var = (qr0) obj4;
                jd3 jd3Var = (jd3) obj3;
                String str = (String) obj5;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    Boolean bool = Boolean.TRUE;
                    boolean zJ = h02Var.j(q81Var);
                    Object objK = h02Var.K();
                    l76 l76Var = oo0.g;
                    if (zJ || objK == l76Var) {
                        objK = new o40(q81Var, null, (byte) 4);
                        h02Var.i0(objK);
                    }
                    k33.b((bz1) objK, h02Var, bool);
                    boolean zJ2 = h02Var.j(jd3Var) | h02Var.x(str);
                    Object objK2 = h02Var.K();
                    if (zJ2 || objK2 == l76Var) {
                        objK2 = new rg((Object) jd3Var, (Object) str, (byte) 24);
                        h02Var.i0(objK2);
                    }
                    gp4.i(q81Var, qr0Var, kq2.R((my1) objK2, h02Var), h02Var, 72);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lr2.l((r04) obj6, (xy1) obj5, (o22) obj4, (Integer) obj3, (h02) obj, aq2.J(1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ k71(my1 my1Var, j73 j73Var, pr2 pr2Var, cr2 cr2Var, int i) {
        this.j = (byte) 2;
        this.t = my1Var;
        this.a = j73Var;
        this.m = pr2Var;
        this.q = cr2Var;
    }

    public /* synthetic */ k71(sk2 sk2Var, mc3 mc3Var, jd3 jd3Var, my1 my1Var, int i) {
        this.j = (byte) 1;
        this.a = sk2Var;
        this.m = mc3Var;
        this.q = jd3Var;
        this.t = my1Var;
    }

    public /* synthetic */ k71(r04 r04Var, xy1 xy1Var, o22 o22Var, Integer num, int i) {
        this.j = (byte) 6;
        this.a = r04Var;
        this.q = xy1Var;
        this.m = o22Var;
        this.t = num;
    }

    public /* synthetic */ k71(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = obj3;
        this.q = obj4;
    }
}
