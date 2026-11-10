package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class cy extends zz4 implements cz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy(Object obj, mu0 mu0Var, byte b) {
        super(3, mu0Var);
        this.q = b;
        this.w = obj;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws PendingIntent.CanceledException {
        Toast toast;
        Object value;
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                gy gyVar = (gy) obj2;
                Context contextN = gyVar.N();
                if (Build.VERSION.SDK_INT != 25) {
                    WeakReference weakReference = bi6.z;
                    if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                        toast.cancel();
                    }
                    Toast toastMakeText = Toast.makeText(contextN.getApplicationContext(), "Air mouse not available: Required sensor not found on this device", 0);
                    toastMakeText.show();
                    bi6.z = new WeakReference(toastMakeText);
                }
                gyVar.W().m(false);
                break;
            case 1:
                js2.o(obj);
                ((q54) obj2).j = true;
                break;
            case 2:
                js2.o(obj);
                ew4 ew4Var = ((yv0) obj2).v;
                do {
                    value = ew4Var.getValue();
                } while (!ew4Var.t(value, tv0.g((tv0) value, null, null, null, null, zl2.t, false, 14)));
                break;
            case 3:
                js2.o(obj);
                ((og2) obj2).v.decrementAndGet();
                break;
            default:
                js2.o(obj);
                ((kr4) obj2).h.g();
                break;
        }
        return og5Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) throws PendingIntent.CanceledException {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj4 = this.w;
        switch (b) {
            case 0:
                new cy((gy) obj4, (mu0) obj3, (byte) 0).u(og5Var);
                break;
            case 1:
                new cy((q54) obj4, (mu0) obj3, (byte) 1).u(og5Var);
                break;
            case 2:
                new cy((yv0) obj4, (mu0) obj3, (byte) 2).u(og5Var);
                break;
            case 3:
                new cy((og2) obj4, (mu0) obj3, (byte) 3).u(og5Var);
                break;
            default:
                ((Number) obj2).floatValue();
                new cy((kr4) obj4, (mu0) obj3, (byte) 4).u(og5Var);
                break;
        }
        return og5Var;
    }
}
