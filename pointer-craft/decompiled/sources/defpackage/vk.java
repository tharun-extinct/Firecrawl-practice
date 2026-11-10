package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ vk(int i, my1 my1Var) {
        this.j = (byte) 2;
        this.t = my1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        my1 my1Var = this.t;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    c93.s(this.t, null, false, null, null, null, by5.g, h02Var, 805306368, 510);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    yf2.j(xs2.I(R.string.devices_button_add_device, h02Var2), my1Var, null, h02Var2, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k33.i(my1Var, (h02) obj, aq2.J(1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ vk(my1 my1Var, byte b) {
        this.j = b;
        this.t = my1Var;
    }
}
