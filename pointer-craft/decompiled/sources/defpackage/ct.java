package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ct implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ ct(byte b, boolean z) {
        this.j = b;
        this.t = z;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 17) != 16)) {
                    h02Var.Q();
                } else {
                    ha2 ha2VarO = lr2.o();
                    g73 g73Var = g73.g;
                    t92.g(ha2VarO, null, mq4.j(g73Var, 28.0f), 0L, h02Var, 432, 8);
                    mq2.y(h02Var, mq4.j(g73Var, 16.0f));
                    g75.y(xs2.I(!this.t ? R.string.keyboard_auto_setup_scan_qr : R.string.keyboard_auto_setup_scan_qr_finish, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).j, h02Var, 0, 0, 131070);
                }
                break;
            case 1:
                lb4 lb4Var = (lb4) obj;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lb4Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var2.x(lb4Var) ? 4 : 2;
                }
                int i = iIntValue2;
                if (!h02Var2.N(i & 1, (i & 19) != 18)) {
                    h02Var2.Q();
                } else {
                    g75.y(xs2.I(R.string.connect_to_button, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                    gp4.r(lb4Var, this.t, null, null, null, null, a11.w, h02Var2, (i & 14) | 1572864, 30);
                }
                break;
            default:
                lb4 lb4Var2 = (lb4) obj;
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                lb4Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= h02Var3.x(lb4Var2) ? 4 : 2;
                }
                int i2 = iIntValue3;
                if (!h02Var3.N(i2 & 1, (i2 & 19) != 18)) {
                    h02Var3.Q();
                } else {
                    g75.y(xs2.I(R.string.connection_button_connect, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                    gp4.r(lb4Var2, this.t, null, null, null, null, a11.b, h02Var3, (i2 & 14) | 1572864, 30);
                }
                break;
        }
        return og5Var;
    }
}
