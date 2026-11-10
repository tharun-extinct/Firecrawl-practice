package defpackage;

import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ej implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ int t;

    public /* synthetic */ ej(DecimalFormat decimalFormat, int i, xy1 xy1Var, int i2) {
        this.j = (byte) 2;
        this.a = decimalFormat;
        this.t = i;
        this.m = xy1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        int i = this.t;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gj.g((cj) obj4, (List) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m50.r((jd3) obj4, (fk) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rz5.l((DecimalFormat) obj4, i, (xy1) obj3, (h02) obj, aq2.J(1));
                break;
            case 3:
                String str = (String) obj4;
                qj0 qj0Var = (qj0) obj3;
                h02 h02Var = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var.e()) {
                    h02Var.Q();
                } else {
                    mx5.g(str, null, new j85(qj0Var, new n85(kq2.G(14)), new pv1(), 120), this.t, h02Var, 0, 2);
                }
                break;
            case 4:
                ((Integer) obj2).intValue();
                vx5.y((List) obj3, (xy1) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                wt3.g((ad2) obj4, (nm0) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                hf6.r((le5) obj4, (xy1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ib6.y((un5) obj4, (xy1) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ ej(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = i;
    }

    public /* synthetic */ ej(List list, xy1 xy1Var, int i) {
        this.j = (byte) 4;
        this.m = list;
        this.a = xy1Var;
        this.t = i;
    }
}
