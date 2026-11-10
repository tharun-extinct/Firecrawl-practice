package defpackage;

import android.content.Context;
import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z61 implements dz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ List t;
    public final /* synthetic */ Object w;

    public /* synthetic */ z61(qr0 qr0Var, my1 my1Var, ob3 ob3Var, bw4 bw4Var, List list) {
        this.t = list;
        this.a = qr0Var;
        this.m = my1Var;
        this.q = ob3Var;
        this.w = bw4Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        List list;
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = 3;
        l76 l76Var = oo0.g;
        Object obj5 = this.w;
        Object obj6 = this.q;
        Object obj7 = this.m;
        Object obj8 = this.a;
        switch (b) {
            case 0:
                qr0 qr0Var = (qr0) obj8;
                my1 my1Var = (my1) obj7;
                ob3 ob3Var = (ob3) obj6;
                bw4 bw4Var = (bw4) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h02 h02Var = (h02) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= h02Var.l(zBooleanValue) ? 32 : 16;
                }
                byte b3 = 1;
                if (!h02Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    h02Var.Q();
                } else if (zBooleanValue && (list = this.t) != null) {
                    h02Var.X(586592555);
                    g61 g61Var = (g61) ob3Var.getValue();
                    boolean z = ((dq0) bw4Var.getValue()) == dq0.t;
                    boolean zJ = h02Var.j(qr0Var);
                    Object objK = h02Var.K();
                    if (zJ || objK == l76Var) {
                        objK = new cp(qr0Var, (byte) 4);
                        h02Var.i0(objK);
                    }
                    xy1 xy1Var = (xy1) objK;
                    boolean zJ2 = h02Var.j(qr0Var);
                    Object objK2 = h02Var.K();
                    if (zJ2 || objK2 == l76Var) {
                        objK2 = new cp(qr0Var, (byte) 5);
                        h02Var.i0(objK2);
                    }
                    xy1 xy1Var2 = (xy1) objK2;
                    boolean zJ3 = h02Var.j(qr0Var);
                    Object objK3 = h02Var.K();
                    if (zJ3 || objK3 == l76Var) {
                        objK3 = new cp(qr0Var, b3);
                        h02Var.i0(objK3);
                    }
                    xy1 xy1Var3 = (xy1) objK3;
                    boolean zJ4 = h02Var.j(qr0Var);
                    Object objK4 = h02Var.K();
                    if (zJ4 || objK4 == l76Var) {
                        objK4 = new cp(qr0Var, (byte) 2);
                        h02Var.i0(objK4);
                    }
                    xy1 xy1Var4 = (xy1) objK4;
                    boolean zJ5 = h02Var.j(qr0Var);
                    Object objK5 = h02Var.K();
                    if (zJ5 || objK5 == l76Var) {
                        objK5 = new cp(qr0Var, b2);
                        h02Var.i0(objK5);
                    }
                    ue5.m(g61Var, list, z, xy1Var, xy1Var2, xy1Var3, xy1Var4, my1Var, (xy1) objK5, h02Var, 0);
                    h02Var.b(false);
                } else {
                    h02Var.X(587615090);
                    Object objK6 = h02Var.K();
                    if (objK6 == l76Var) {
                        objK6 = new cp0((byte) 28);
                        h02Var.i0(objK6);
                    }
                    y94.a((my1) objK6, xs2.I(R.string.empty_message, h02Var), xs2.I(R.string.empty_title, h02Var), null, og0.v, h02Var, 24582, 8);
                    h02Var.b(false);
                }
                break;
            default:
                String str = (String) obj8;
                bf4 bf4Var = (bf4) obj7;
                jd3 jd3Var = (jd3) obj6;
                nm0 nm0Var = (nm0) obj5;
                mc3 mc3Var = (mc3) obj2;
                h02 h02Var2 = (h02) obj3;
                ((Integer) obj4).getClass();
                ((hh) obj).getClass();
                mc3Var.getClass();
                vf1 vf1Var = sa.y;
                yl0 yl0VarF = gp4.F((Context) h02Var2.a(vf1Var));
                wm4 wm4Var = (wm4) js2.A(v54.g(wm4.class), yl0VarF, gp4.N(xs2.d(yl0VarF), h02Var2), xs2.k(yl0VarF), h02Var2);
                yl0 yl0VarF2 = gp4.F((Context) h02Var2.a(vf1Var));
                qr0 qr0Var2 = (qr0) js2.A(v54.g(qr0.class), yl0VarF2, gp4.N(xs2.d(yl0VarF2), h02Var2), xs2.k(yl0VarF2), h02Var2);
                Object objK7 = h02Var2.K();
                mu0 mu0Var = null;
                if (objK7 == l76Var) {
                    w75 w75Var = new w75(null, bf4Var.y);
                    boolean z2 = bf4Var.v;
                    boolean z3 = !z2;
                    List list2 = this.t;
                    if (list2 == null) {
                        list2 = bf4Var.x;
                    }
                    nk nkVar = new nk(w75Var, null, z3, z2, list2);
                    h02Var2.i0(nkVar);
                    objK7 = nkVar;
                }
                nk nkVar2 = (nk) objK7;
                boolean zX = h02Var2.x(str) | h02Var2.j(wm4Var);
                Object objK8 = h02Var2.K();
                if (zX || objK8 == l76Var) {
                    objK8 = new ko(str, wm4Var, mu0Var, (byte) 13);
                    h02Var2.i0(objK8);
                }
                k33.b((bz1) objK8, h02Var2, str);
                c93.n(nkVar2, bf4Var.v, qr0Var2, ue5.m0(-1705349625, new qn(nkVar2, jd3Var, wm4Var, b2), h02Var2), ue5.m0(-1597871376, new bb4(nm0Var, mc3Var, (byte) 4), h02Var2), h02Var2, 28168);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ z61(String str, bf4 bf4Var, List list, jd3 jd3Var, nm0 nm0Var) {
        this.a = str;
        this.m = bf4Var;
        this.t = list;
        this.q = jd3Var;
        this.w = nm0Var;
    }
}
