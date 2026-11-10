package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uu1 implements dz1 {
    public final /* synthetic */ List j;

    public uu1(List list) {
        this.j = list;
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
            fp3 fp3Var = (fp3) this.j.get(iIntValue);
            h02Var.X(97292904);
            lr2.r(ue5.m0(750307256, new tu1(fp3Var, b2), h02Var), null, ue5.m0(-1244995466, new tu1(fp3Var, b3), h02Var), ue5.m0(-95163179, new tu1(fp3Var, b), h02Var), null, null, null, 0.0f, h02Var, 3462, 498);
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
