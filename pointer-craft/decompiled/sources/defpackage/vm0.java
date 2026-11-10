package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vm0 implements ez1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ vm0(byte b) {
        this.j = b;
    }

    @Override // defpackage.ez1
    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h45 h45Var = (h45) obj;
                w35 w35Var = (w35) obj2;
                my1 my1Var = (my1) obj3;
                h02 h02Var = (h02) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? h02Var.x(h45Var) : h02Var.j(h45Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? h02Var.x(w35Var) : h02Var.j(w35Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= h02Var.j(my1Var) ? 256 : 128;
                }
                if (!h02Var.N(i & 1, (i & 1171) != 1170)) {
                    h02Var.Q();
                } else {
                    x31.r((xy) h45Var, w35Var, my1Var, h02Var, i & 1022);
                }
                break;
            case 1:
                h45 h45Var2 = (h45) obj;
                w35 w35Var2 = (w35) obj2;
                my1 my1Var2 = (my1) obj3;
                h02 h02Var2 = (h02) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? h02Var2.x(h45Var2) : h02Var2.j(h45Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? h02Var2.x(w35Var2) : h02Var2.j(w35Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= h02Var2.j(my1Var2) ? 256 : 128;
                }
                if (!h02Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
                    h02Var2.Q();
                } else {
                    x31.r((xy) h45Var2, w35Var2, my1Var2, h02Var2, i2 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((u75) obj5).g;
                String string = ((CharSequence) obj4).subSequence(u75.x(j), u75.v(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return og5Var;
    }
}
