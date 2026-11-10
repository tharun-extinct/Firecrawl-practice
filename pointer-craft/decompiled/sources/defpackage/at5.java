package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class at5 implements ServiceConnection {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ at5(bt5 bt5Var) {
        this.g = (byte) 0;
        Objects.requireNonNull(bt5Var);
        this.y = bt5Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gy5 ay5Var;
        switch (this.g) {
            case 0:
                bt5 bt5Var = (bt5) this.y;
                bt5Var.y.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                bt5Var.g().post(new ys5(this, iBinder));
                break;
            case 1:
                i06.l("BillingClientTesting", "Billing Override Service connected.");
                j26 j26Var = (j26) this.y;
                int i = dy5.r;
                if (iBinder == null) {
                    ay5Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    ay5Var = iInterfaceQueryLocalInterface instanceof gy5 ? (gy5) iInterfaceQueryLocalInterface : new ay5(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                }
                j26Var.L = ay5Var;
                j26Var.K = (byte) 2;
                int i2 = m26.g;
                yb6 yb6VarR = m26.r(26, mc6.t);
                Objects.requireNonNull(yb6VarR, "ApiSuccess should not be null");
                wh4 wh4Var = j26Var.j;
                wh4Var.getClass();
                try {
                    wh4Var.p(yb6VarR, (wc6) wh4Var.j);
                } catch (Throwable th) {
                    i06.t("BillingLogger", "Unable to log.", th);
                    return;
                }
                break;
            default:
                jj6 jj6Var = (jj6) this.y;
                jj6Var.y.n("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                jj6Var.g().post(new x56(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.g) {
            case 0:
                bt5 bt5Var = (bt5) this.y;
                bt5Var.y.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                bt5Var.g().post(new zs5(this));
                break;
            case 1:
                i06.j("BillingClientTesting", "Billing Override Service disconnected.");
                j26 j26Var = (j26) this.y;
                j26Var.L = null;
                j26Var.K = (byte) 0;
                break;
            default:
                jj6 jj6Var = (jj6) this.y;
                jj6Var.y.n("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                jj6Var.g().post(new yg6(this, (byte) 1));
                break;
        }
    }

    public /* synthetic */ at5(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }
}
