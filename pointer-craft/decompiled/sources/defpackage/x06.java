package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class x06 extends ux5 {
    public final nz5 n;
    public final WeakReference r;

    public x06(WeakReference weakReference, nz5 nz5Var) {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
        this.r = weakReference;
        this.n = nz5Var;
    }

    @Override // defpackage.ux5
    public final boolean g(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) wx5.g(parcel);
        ux5.y(parcel);
        nz5 nz5Var = this.n;
        if (nz5Var == null) {
            i06.j("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            nz5Var.send(0, null);
        } else {
            Activity activity = (Activity) this.r.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                nz5Var.send(0, null);
                i06.j("BillingClient", "Unable to launch intent for in-app messaging");
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", nz5Var);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException e) {
                    nz5Var.send(0, null);
                    i06.t("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
