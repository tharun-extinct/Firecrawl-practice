package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hj2 implements dz1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ List j;
    public final /* synthetic */ xy1 t;

    public hj2(List list, xy1 xy1Var, ob3 ob3Var) {
        this.j = list;
        this.t = xy1Var;
        this.a = ob3Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
        if (h02Var.N(i & 1, (i & 147) != 146)) {
            mk2 mk2Var = (mk2) this.j.get(iIntValue);
            h02Var.X(-643357181);
            String str = mk2Var.g;
            String str2 = mk2Var.y;
            ob3 ob3Var = this.a;
            boolean zP = yf2.p((String) ob3Var.getValue(), mk2Var.g);
            boolean zJ = h02Var.j(mk2Var);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new b71(mk2Var, ob3Var, (byte) 4);
                h02Var.i0(objK);
            }
            zx5.n(str, str2, zP, (my1) objK, this.t, h02Var, 0);
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
