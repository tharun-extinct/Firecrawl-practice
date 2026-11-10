package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z15 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ z15(int i, byte b) {
        this.j = b;
        this.t = i;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.t;
        switch (b) {
            case 0:
                j15 j15Var = (j15) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? h02Var.x(j15Var) : h02Var.j(j15Var) ? 4 : 2;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    h02Var.Q();
                } else {
                    aj6.i.v(j15Var.g(i), 0.0f, 0L, h02Var, 3072);
                }
                break;
            default:
                j15 j15Var2 = (j15) obj;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? h02Var2.x(j15Var2) : h02Var2.j(j15Var2) ? 4 : 2;
                }
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    h02Var2.Q();
                } else {
                    aj6.i.v(j15Var2.g(i), 0.0f, 0L, h02Var2, 3072);
                }
                break;
        }
        return og5Var;
    }
}
