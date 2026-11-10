package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n00 {
    public volatile hi0 g;
    public volatile boolean n;
    public volatile w10 r;
    public final Context y;

    public /* synthetic */ n00(Context context) {
        this.y = context;
    }

    public final boolean g() {
        try {
            Context context = this.y;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            i06.t("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
