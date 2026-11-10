package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ fo(qr0 qr0Var, my1 my1Var, ob3 ob3Var, bw4 bw4Var, List list) {
        this.j = (byte) 1;
        this.t = list;
        this.m = ob3Var;
        this.q = qr0Var;
        this.a = my1Var;
        this.w = bw4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        boolean z = true;
        og5 og5Var = og5.g;
        Object obj3 = this.a;
        Object obj4 = this.w;
        Object obj5 = this.q;
        Object obj6 = this.t;
        Object obj7 = this.m;
        switch (b) {
            case 0:
                we1 we1Var = (we1) obj7;
                List list = (List) obj6;
                mc3 mc3Var = (mc3) obj5;
                jd3 jd3Var = (jd3) obj4;
                my1 my1Var = (my1) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    yf2.w(we1Var, ri5.g, list, mc3Var, jd3Var, my1Var, h02Var, 0);
                }
                break;
            case 1:
                List list2 = (List) obj6;
                ob3 ob3Var = (ob3) obj7;
                qr0 qr0Var = (qr0) obj5;
                my1 my1Var2 = (my1) obj3;
                bw4 bw4Var = (bw4) obj4;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    if ((list2 == null || list2.isEmpty()) && ((g61) ob3Var.getValue()) == null) {
                        z = false;
                    }
                    y94.y(Boolean.valueOf(z), null, null, null, "Devices", null, ue5.m0(-1436201461, new z61(qr0Var, my1Var2, ob3Var, bw4Var, list2), h02Var2), h02Var2, 1597440, 46);
                }
                break;
            case 2:
                mc3 mc3Var2 = (mc3) obj5;
                n91 n91Var = (n91) obj7;
                qc4 qc4Var = (qc4) obj6;
                st4 st4Var = (st4) obj4;
                m91 m91Var = (m91) obj3;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    boolean zJ = h02Var3.j(mc3Var2) | h02Var3.j(n91Var);
                    Object objK = h02Var3.K();
                    if (zJ || objK == oo0.g) {
                        objK = new q2((Object) st4Var, (Object) mc3Var2, (Object) n91Var, (byte) 10);
                        h02Var3.i0(objK);
                    }
                    k33.j(mc3Var2, (xy1) objK, h02Var3);
                    kq2.y(mc3Var2, qc4Var, ue5.m0(-497631156, new ta(m91Var, mc3Var2, (byte) 14), h02Var3), h02Var3, 384);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                lr2.n((bz1) obj7, (bz1) obj6, (nm0) obj5, (bz1) obj4, (bz1) obj3, (h02) obj, aq2.J(385));
                break;
            default:
                ((Integer) obj2).getClass();
                aq2.x((qr0) obj7, (ao2) obj6, (wm4) obj5, (gp) obj4, (b30) obj3, (h02) obj, aq2.J(37449));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ fo(we1 we1Var, List list, mc3 mc3Var, jd3 jd3Var, my1 my1Var) {
        this.j = (byte) 0;
        this.m = we1Var;
        this.t = list;
        this.q = mc3Var;
        this.w = jd3Var;
        this.a = my1Var;
    }

    public /* synthetic */ fo(mc3 mc3Var, n91 n91Var, sc4 sc4Var, st4 st4Var, m91 m91Var) {
        this.j = (byte) 2;
        this.q = mc3Var;
        this.m = n91Var;
        this.t = sc4Var;
        this.w = st4Var;
        this.a = m91Var;
    }

    public /* synthetic */ fo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.j = b;
        this.m = obj;
        this.t = obj2;
        this.q = obj3;
        this.w = obj4;
        this.a = obj5;
    }
}
