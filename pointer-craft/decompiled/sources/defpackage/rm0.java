package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm0 implements dz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ rm0(byte b) {
        this.j = b;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                w75 w75Var = (w75) obj2;
                h02 h02Var = (h02) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                w75Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? h02Var.x(w75Var) : h02Var.j(w75Var) ? 32 : 16;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    h02Var.Q();
                } else {
                    g75.y(a11.C(w75Var, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((mf5) h02Var.a(of5.g)).l, h02Var, 0, 24960, 110590);
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                h02 h02Var2 = (h02) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= h02Var2.n(iIntValue2) ? 32 : 16;
                }
                if (!h02Var2.N(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    h02Var2.Q();
                } else {
                    g75.y(xs2.I(iIntValue2, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).j, h02Var2, 0, 0, 131070);
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h02 h02Var3 = (h02) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= h02Var3.l(zBooleanValue) ? 32 : 16;
                }
                if (!h02Var3.N(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    h02Var3.Q();
                } else {
                    g75.y(xs2.I(zBooleanValue ? R.string.action_disconnect : R.string.connection_button_connect, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                }
                break;
            case 3:
                v81 v81Var = (v81) obj2;
                h02 h02Var4 = (h02) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                v81Var.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= (iIntValue5 & 64) == 0 ? h02Var4.x(v81Var) : h02Var4.j(v81Var) ? 32 : 16;
                }
                if (!h02Var4.N(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    h02Var4.Q();
                } else {
                    g75.y(xs2.I(v81Var.g(), h02Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var4, 0, 0, 262142);
                }
                break;
            default:
                ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                ((mc3) obj2).getClass();
                ag6.g(0, (h02) obj3);
                break;
        }
        return og5Var;
    }
}
