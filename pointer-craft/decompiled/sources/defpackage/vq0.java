package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vq0 implements bz1 {
    public final /* synthetic */ byte j;

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((vv4) obj).getClass();
                ((wk1) obj2).getClass();
                return new nw4(tv4.g);
            case 1:
                ((Integer) obj2).getClass();
                ue5.i(aq2.J(1), (h02) obj);
                return og5Var;
            case 2:
                ((Integer) obj2).getClass();
                ag6.g(aq2.J(1), (h02) obj);
                return og5Var;
            case 3:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                return og5Var;
            case 4:
                ((Integer) obj2).getClass();
                jh6.g(aq2.J(1), (h02) obj);
                return og5Var;
            case 5:
                ((Boolean) obj2).booleanValue();
                ((int[]) obj).getClass();
                return og5Var;
            case 6:
                ((Integer) obj).intValue();
                sk2 sk2Var = (sk2) obj2;
                sk2Var.getClass();
                return Integer.valueOf(sk2Var.g);
            case 7:
                return Integer.valueOf(((p33) obj).Z(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((p33) obj).Y(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((p33) obj).x(((Integer) obj2).intValue()));
            case 10:
                return Integer.valueOf(((p33) obj).P(((Integer) obj2).intValue()));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                gy3.g(aq2.J(1), (h02) obj);
                return og5Var;
            case 12:
                jt3 jt3Var = (jt3) obj2;
                Boolean boolValueOf = Boolean.valueOf(jt3Var.g);
                ji jiVar = qd4.g;
                return pw5.l(boolValueOf, qd4.g(new di1(jt3Var.y), ae6.y, (pc4) obj));
            case 13:
                return Integer.valueOf(((di1) obj2).g);
            case 14:
                return Integer.valueOf(((vu2) obj2).g);
            case kq2.x /* 15 */:
                s75 s75Var = (s75) obj2;
                return pw5.l(qd4.g(new r75(s75Var.g), ae6.v, (pc4) obj), Boolean.valueOf(s75Var.y));
            case 16:
                return Integer.valueOf(((r75) obj2).g);
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 18:
                if (obj == null && obj2 == null) {
                    return null;
                }
                uo1.B();
                return null;
            case 19:
                gj4 gj4Var = (gj4) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                aj4 aj4Var = ((gj4) obj).n;
                mj4 mj4Var = kj4.h;
                Object objL = aj4Var.j.l(mj4Var);
                if (objL == null) {
                    objL = objValueOf;
                }
                float fFloatValue = ((Number) objL).floatValue();
                Object objL2 = gj4Var.n.j.l(mj4Var);
                if (objL2 != null) {
                    objValueOf = objL2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 20:
                ((zk4) obj).getClass();
                fp3[] fp3VarArr = {new fp3("KEY", ((eq) obj2).g)};
                v92 v92Var = new v92((byte) 11);
                fp3 fp3Var = fp3VarArr[0];
                v92Var.O(fp3Var.t, (String) fp3Var.j);
                qz0 qz0Var = new qz0((HashMap) v92Var.t);
                qz0.y(qz0Var);
                return qz0Var;
            case 21:
                return (yo4) ((tp3) ((xo4) obj2).n.l).getValue();
            case 22:
                return Integer.valueOf(((p33) obj).P(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((p33) obj).Y(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((p33) obj).Z(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((p33) obj).x(((Integer) obj2).intValue()));
            case 26:
                s55 s55Var = (s55) obj2;
                return pw5.d(Float.valueOf(s55Var.g.d()), Boolean.valueOf(((um3) s55Var.x.getValue()) == um3.j));
            case 27:
                ((ih1) obj).g = (String) obj2;
                return og5Var;
            case 28:
                ((ih1) obj).n = (o22) obj2;
                return og5Var;
            default:
                ((ih1) obj).y = (j85) obj2;
                return og5Var;
        }
    }

    public /* synthetic */ vq0(int i, byte b) {
        this.j = b;
    }

    public /* synthetic */ vq0(byte b) {
        this.j = b;
    }
}
