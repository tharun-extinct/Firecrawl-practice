package defpackage;

import android.content.SharedPreferences;
import io.appground.blehid.BleHidService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cp implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ cp(qr0 qr0Var, byte b) {
        this.j = b;
        this.t = qr0Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        e62 e62Var;
        byte b = this.j;
        qr0 qr0Var = this.t;
        switch (b) {
            case 0:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                qr0Var.j.g(g61Var.t);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                qr0Var.getClass();
                m50.T(v70.d(qr0Var), null, new mt((Object) qr0Var, str, (mu0) null, (byte) 4), 3);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                qr0Var.m(str2);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e62 e62Var2 = qr0Var.j.r;
                BleHidService bleHidService = e62Var2 instanceof BleHidService ? (BleHidService) e62Var2 : null;
                if (bleHidService != null) {
                    bleHidService.O(zBooleanValue);
                }
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                sharedPreferences.edit().putBoolean("feature_refresh_service", zBooleanValue).apply();
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                qr0Var.j.g(str3);
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                h62 h62Var = qr0Var.j;
                if (h62Var.n && (e62Var = h62Var.r) != null) {
                    e62Var.j(str4);
                }
                break;
        }
        return og5.g;
    }
}
