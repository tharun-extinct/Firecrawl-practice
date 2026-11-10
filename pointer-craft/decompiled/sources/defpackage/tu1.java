package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tu1 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ fp3 t;

    public /* synthetic */ tu1(fp3 fp3Var, byte b) {
        this.j = b;
        this.t = fp3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        fp3 fp3Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    g75.y("Whereas disregard and contempt for human rights have resulted", null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, (k85) fp3Var.j, h02Var, 6, 24960, 110590);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    g75.y((String) fp3Var.t, ue5.i0(g73.g, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, qv1.u, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 1572912, 0, 262076);
                }
                break;
            default:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    Object obj3 = fp3Var.j;
                    String strN = n85.n(((k85) obj3).g.y);
                    k85 k85Var = (k85) obj3;
                    qv1 qv1Var = k85Var.g.r;
                    Integer numValueOf = qv1Var != null ? Integer.valueOf(qv1Var.j) : null;
                    g75.y(strN + " - Weight: " + numValueOf + " - Spacing: " + n85.n(k85Var.g.j), ue5.i0(g73.g, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, qv1.u, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 1572912, 0, 262076);
                }
                break;
        }
        return og5Var;
    }
}
