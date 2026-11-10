package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m81 implements dz1 {
    public final /* synthetic */ List j;
    public final /* synthetic */ xy1 t;

    public m81(List list, xy1 xy1Var) {
        this.j = list;
        this.t = xy1Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bq2 bq2Var = (bq2) obj;
        int iIntValue = ((Number) obj2).intValue();
        h02 h02Var = (h02) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        byte b = 2;
        if ((iIntValue2 & 6) == 0) {
            i = (h02Var.x(bq2Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= h02Var.n(iIntValue) ? 32 : 16;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (h02Var.N(i & 1, (i & 147) != 146)) {
            g61 g61Var = (g61) this.j.get(iIntValue);
            h02Var.X(2110129326);
            nm0 nm0VarM0 = ue5.m0(-1210869912, new k81(g61Var, b2), h02Var);
            xy1 xy1Var = this.t;
            boolean zX = h02Var.x(xy1Var) | h02Var.j(g61Var);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new l81(g61Var, xy1Var);
                h02Var.i0(objK);
            }
            lr2.r(nm0VarM0, ue5.I(g73.g, false, null, null, (my1) objK, 15), null, ue5.m0(-1438385595, new k81(g61Var, b3), h02Var), ue5.m0(-1514224156, new k81(g61Var, b), h02Var), null, null, 0.0f, h02Var, 27654, 484);
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
