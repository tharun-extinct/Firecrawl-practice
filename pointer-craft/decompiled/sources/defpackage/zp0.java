package defpackage;

import android.content.Context;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zp0 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ zp0(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Context context = this.t;
        byte b2 = 2;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    String strI = xs2.I(R.string.button_open_settings, h02Var);
                    boolean zJ = h02Var.j(context);
                    Object objK = h02Var.K();
                    if (zJ || objK == oo0.g) {
                        objK = new mn(context, b2);
                        h02Var.i0(objK);
                    }
                    yf2.j(strI, (my1) objK, null, h02Var, 0);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    p04 p04Var = (p04) d43.g.getValue();
                    String string = context.getString(R.string.widget_custom_label);
                    string.getClass();
                    lr2.t(p04Var, null, null, string, null, null, h02Var2, 432, 48);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    String string2 = context.getString(R.string.widget_tap_to_configure);
                    string2.getClass();
                    mx5.g(string2, null, null, 0, h02Var3, 0, 14);
                }
                break;
            default:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    he heVar = new he(R.drawable.ic_bluetooth_24dp);
                    String string3 = context.getString(R.string.widget_custom_label);
                    string3.getClass();
                    wy5.y(heVar, string3, null, null, null, null, h02Var4, 0, 124);
                }
                break;
        }
        return og5Var;
    }
}
