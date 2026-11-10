package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import io.appground.blek.widget.WidgetConfigurationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m63 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ m63(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.my1
    public final Object g() throws PendingIntent.CanceledException {
        my1 my1Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((p63) obj).q.g();
                return og5Var;
            case 1:
                return Boolean.valueOf(sv3.w((sv3) obj));
            case 2:
                return (Float) obj;
            case 3:
                xm4 xm4Var = (xm4) obj;
                tp3 tp3Var = xm4Var.a;
                if (((cq4) tp3Var.getValue()).g == 9205357640488583168L || cq4.r(((cq4) tp3Var.getValue()).g)) {
                    return null;
                }
                a70 a70Var = xm4Var.j;
                long j = ((cq4) tp3Var.getValue()).g;
                return a70Var.r;
            case 4:
                return ((xo4) obj).r;
            case 5:
                kr4 kr4Var = (kr4) obj;
                if (!((Boolean) kr4Var.z.getValue()).booleanValue() && (my1Var = kr4Var.j) != null) {
                    my1Var.g();
                }
                return og5Var;
            case 6:
                ih6.y(((RemoteAction) obj).getActionIntent());
                return og5Var;
            case 7:
                k45 k45Var = (k45) obj;
                return k45Var.h ? jh6.y(k45Var) : v35.y;
            case 8:
                return new je2(((ne2) obj).r());
            case 9:
                ba5 ba5Var = (ba5) obj;
                ba5Var.U.a(Boolean.valueOf(!ba5Var.T));
                return og5Var;
            case 10:
                fl5 fl5Var = (fl5) obj;
                fl5Var.M.a(fl5Var.I);
                return og5Var;
            default:
                int i = WidgetConfigurationActivity.F;
                ((WidgetConfigurationActivity) obj).finish();
                return og5Var;
        }
    }
}
