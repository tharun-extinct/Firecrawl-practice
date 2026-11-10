package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ef0 implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ long t;

    public /* synthetic */ ef0(long j, bz1 bz1Var, byte b) {
        this.j = b;
        this.t = j;
        this.a = bz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        bz1 bz1Var = this.a;
        long j = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    og0.y(du4.t(j, mt0.g), bz1Var, h02Var, 8);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    zi6.r(j, bz1Var, h02Var2, 0);
                }
                break;
            default:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    zi6.r(j, bz1Var, h02Var3, 0);
                }
                break;
        }
        return og5Var;
    }
}
