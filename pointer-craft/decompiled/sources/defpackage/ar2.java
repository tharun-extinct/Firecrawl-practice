package defpackage;

import android.os.Build;
import android.view.View;
import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar2 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ ar2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        j73 j73VarN;
        Object obj4;
        byte b = this.j;
        l76 l76Var = oo0.g;
        og5 og5Var = og5.g;
        Object obj5 = this.q;
        Object obj6 = this.m;
        Object obj7 = this.a;
        Object obj8 = this.t;
        switch (b) {
            case 0:
                pr2 pr2Var = (pr2) obj8;
                j73 j73Var = (j73) obj7;
                cr2 cr2Var = (cr2) obj6;
                ob3 ob3Var = (ob3) obj5;
                qc4 qc4Var = (qc4) obj;
                h02 h02Var = (h02) obj2;
                ((Integer) obj3).getClass();
                Object objK = h02Var.K();
                if (objK == l76Var) {
                    objK = new wq2(qc4Var, new ln(ob3Var, (byte) 5));
                    h02Var.i0(objK);
                }
                wq2 wq2Var = (wq2) objK;
                Object objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    objK2 = new py4(new ji(wq2Var));
                    h02Var.i0(objK2);
                }
                py4 py4Var = (py4) objK2;
                if (pr2Var != null) {
                    h02Var.X(1743490539);
                    h02Var.X(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        h02Var.X(1345729441);
                        View view = (View) h02Var.a(sa.x);
                        boolean zX = h02Var.x(view);
                        Object objK3 = h02Var.K();
                        if (zX || objK3 == l76Var) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            objK3 = tag instanceof ex3 ? (ex3) tag : null;
                            if (objK3 == null) {
                                objK3 = new ge(view);
                                view.setTag(R.id.compose_prefetch_scheduler, objK3);
                            }
                            h02Var.i0(objK3);
                        }
                        obj4 = (ex3) objK3;
                        h02Var.b(false);
                    } else {
                        h02Var.X(1345548711);
                        Object objK4 = h02Var.K();
                        if (objK4 == l76Var) {
                            objK4 = new fx3();
                            h02Var.i0(objK4);
                        }
                        obj4 = (fx3) objK4;
                        h02Var.b(false);
                    }
                    Object obj9 = obj4;
                    h02Var.b(false);
                    Object[] objArr = {pr2Var, wq2Var, py4Var, obj9};
                    boolean zX2 = h02Var.x(pr2Var) | h02Var.j(wq2Var) | h02Var.j(py4Var) | h02Var.j(obj9);
                    Object objK5 = h02Var.K();
                    if (zX2 || objK5 == l76Var) {
                        cc2 cc2Var = new cc2(pr2Var, wq2Var, py4Var, obj9, (byte) 1);
                        h02Var.i0(cc2Var);
                        objK5 = cc2Var;
                    }
                    k33.a(objArr, (xy1) objK5, h02Var);
                    h02Var.b(false);
                } else {
                    h02Var.X(1744076749);
                    h02Var.b(false);
                }
                int i = qr2.g;
                if (pr2Var != null && (j73VarN = j73Var.n(new id5(pr2Var))) != null) {
                    j73Var = j73VarN;
                }
                boolean zX3 = h02Var.x(wq2Var) | h02Var.x(cr2Var);
                Object objK6 = h02Var.K();
                if (zX3 || objK6 == l76Var) {
                    objK6 = new vn(wq2Var, cr2Var, (byte) 13);
                    h02Var.i0(objK6);
                }
                gp4.f(py4Var, j73Var, (bz1) objK6, h02Var, 8);
                break;
            case 1:
                g61 g61Var = (g61) obj8;
                List list = (List) obj7;
                my1 my1Var = (my1) obj6;
                xy1 xy1Var = (xy1) obj5;
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (!h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    pw5.r(g61Var, list, my1Var, xy1Var, h02Var2, 0);
                }
                break;
            default:
                b30 b30Var = (b30) obj8;
                gp gpVar = (gp) obj7;
                z14 z14Var = (z14) obj6;
                by3 by3Var = (by3) obj5;
                h02 h02Var3 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var3.Q();
                } else {
                    boolean zJ = h02Var3.j(gpVar);
                    Object objK7 = h02Var3.K();
                    if (zJ || objK7 == l76Var) {
                        objK7 = new qd(gpVar, (byte) 29);
                        h02Var3.i0(objK7);
                    }
                    String strY = by3Var.y();
                    int i2 = b30.l;
                    gy3.y(b30Var, (my1) objK7, z14Var, strY, h02Var3, 24584);
                }
                break;
        }
        return og5Var;
    }
}
