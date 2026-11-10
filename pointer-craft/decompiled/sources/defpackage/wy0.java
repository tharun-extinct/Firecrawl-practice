package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wy0 implements bz1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Intent t;

    public /* synthetic */ wy0(Context context, Intent intent) {
        this.j = (byte) 1;
        this.t = intent;
        this.a = context;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        m22 m22Var = m22.g;
        og5 og5Var = og5.g;
        Intent intent = this.t;
        Context context = this.a;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    v13.n(null, ue5.m0(-167391668, new zp0(context, (byte) 3), h02Var), null, 4.0f, ue5.m0(340039657, new wy0(context, intent), h02Var), h02Var, 27696, 5);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    ue5.n(xq2.q(m22Var).n(new e4(jg6.g(intent), 0)), t6.n, ue5.m0(-1622521269, new zp0(context, (byte) 2), h02Var2), h02Var2, 384, 0);
                }
                break;
            default:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    og0.g(xq2.q(m22Var), 1, 1, ue5.m0(-68372001, new ev0(context, intent, (byte) 16), h02Var3), h02Var3, 3072, 0);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ wy0(Context context, Intent intent, byte b) {
        this.j = b;
        this.a = context;
        this.t = intent;
    }
}
