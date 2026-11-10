package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zm0 implements cz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ zm0(byte b) {
        this.j = b;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var.Q();
                } else {
                    g75.y("Cannot pull me (Disabled)", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 6, 0, 262142);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    g75.y(xs2.I(R.string.onboarding_get_started, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    h02Var3.Q();
                } else {
                    g75.y(xs2.I(R.string.onboarding_next, h02Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                }
                break;
            case 3:
                h02 h02Var4 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    h02Var4.Q();
                } else {
                    g75.y(xs2.I(R.string.mouse_settings_close, h02Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var4, 0, 0, 262142);
                }
                break;
            case 4:
                h02 h02Var5 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    h02Var5.Q();
                }
                break;
            case 5:
                h02 h02Var6 = (h02) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    h02Var6.Q();
                } else {
                    g75.y(xs2.I(R.string.exit_dialog_continue, h02Var6), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var6, 0, 0, 262142);
                }
                break;
            default:
                h02 h02Var7 = (h02) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    h02Var7.Q();
                } else {
                    g75.y(xs2.I(R.string.exit_dialog_discard, h02Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var7, 0, 0, 262142);
                }
                break;
        }
        return og5Var;
    }
}
