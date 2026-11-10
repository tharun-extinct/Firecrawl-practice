package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class om4 implements dz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ List j;
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ List t;

    public om4(List list, List list2, my1 my1Var, xy1 xy1Var) {
        this.j = list;
        this.t = list2;
        this.a = my1Var;
        this.m = xy1Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ma4 ma4VarY;
        ma4 ma4Var;
        bq2 bq2Var = (bq2) obj;
        int iIntValue = ((Number) obj2).intValue();
        h02 h02Var = (h02) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (h02Var.x(bq2Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= h02Var.n(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (h02Var.N(i & 1, (i & 147) != 146)) {
            nm3 nm3Var = (nm3) this.j.get(iIntValue);
            h02Var.X(2018018366);
            if (nm3Var instanceof im3) {
                ma4VarY = na4.y(0.0f);
                z = false;
            } else {
                List list = this.t;
                boolean z2 = iIntValue == 0 || (cj0.m0(iIntValue + (-1), list) instanceof im3);
                if (iIntValue != list.size() - 1 && !(cj0.m0(iIntValue + 1, list) instanceof im3)) {
                    z = false;
                }
                if (z2 && z) {
                    ma4VarY = na4.y(16.0f);
                } else {
                    if (z2) {
                        ma4 ma4Var2 = na4.g;
                        ma4Var = new ma4(new wb1(16.0f), new wb1(16.0f), new wb1(4.0f), new wb1(4.0f));
                    } else if (z) {
                        ma4 ma4Var3 = na4.g;
                        ma4Var = new ma4(new wb1(4.0f), new wb1(4.0f), new wb1(16.0f), new wb1(16.0f));
                    } else {
                        ma4VarY = na4.y(4.0f);
                    }
                    ma4VarY = ma4Var;
                }
            }
            boolean zJ = h02Var.j(nm3Var);
            my1 my1Var = this.a;
            boolean zX = zJ | h02Var.x(my1Var);
            xy1 xy1Var = this.m;
            boolean zX2 = zX | h02Var.x(xy1Var);
            Object objK = h02Var.K();
            if (zX2 || objK == oo0.g) {
                objK = new nm4(nm3Var, my1Var, xy1Var);
                h02Var.i0(objK);
            }
            ke6.y(nm3Var, ma4VarY, (my1) objK, h02Var, 8);
            if (z) {
                h02Var.X(2019951897);
                mq2.y(h02Var, ue5.i0(g73.g, 0.0f, 0.0f, 0.0f, 16.0f, 7));
                h02Var.b(false);
            } else {
                h02Var.X(2020036465);
                h02Var.b(false);
            }
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
