package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qh implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ nm0 t;

    public /* synthetic */ qh(nm0 nm0Var, byte b) {
        this.j = b;
        this.t = nm0Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        nm0 nm0Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? h02Var.x(obj) : h02Var.j(obj) ? 4 : 2;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    h02Var.Q();
                } else if (obj == null) {
                    h02Var.X(-749790876);
                    h02Var.b(false);
                } else {
                    h02Var.X(-749837965);
                    nm0Var.x(obj, h02Var, Integer.valueOf(iIntValue & 14));
                    h02Var.b(false);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? h02Var2.x(obj) : h02Var2.j(obj) ? 4 : 2;
                }
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    h02Var2.Q();
                } else if (obj == null) {
                    h02Var2.X(-1762440610);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(-1762487699);
                    nm0Var.x(obj, h02Var2, Integer.valueOf(iIntValue2 & 14));
                    h02Var2.b(false);
                }
                break;
            case 2:
                gk0 gk0Var = (gk0) obj;
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gk0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= h02Var3.x(gk0Var) ? 4 : 2;
                }
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    h02Var3.Q();
                } else {
                    nm0Var.x(gk0Var, h02Var3, Integer.valueOf(iIntValue3 & 14));
                }
                break;
            case 3:
                h02 h02Var4 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    h02Var4.Q();
                } else {
                    nm0Var.l(h02Var4, 0);
                }
                break;
            default:
                h02 h02Var5 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    h02Var5.Q();
                } else {
                    nm0Var.l(h02Var5, 0);
                }
                break;
        }
        return og5Var;
    }
}
