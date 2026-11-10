package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.du4;
import defpackage.i06;
import defpackage.m26;
import defpackage.mc6;
import defpackage.w20;
import defpackage.x20;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {
    public boolean a;
    public ResultReceiver j;
    public int m;
    public long q;
    public boolean t;
    public boolean w;

    public static int g(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[PHI: r10
  0x006e: PHI (r10v1 int) = (r10v0 int), (r10v16 int) binds: [B:27:0x0069, B:29:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x006e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x008a, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentR;
        int i5;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = i06.v(intent, "ProxyBillingActivity").g;
            i4 = -1;
            if (i2 != -1) {
                i06.j("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                i06.j("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                i06.j("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                i06.j("ProxyBillingActivity", "Got null bundle!");
            }
            if (du4.g(g(intent, i4), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentR = intent2;
                } else {
                    intentR = r();
                    intentR.putExtras(intent.getExtras());
                    intentR.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentR.putExtra("billingClientTransactionId", this.q);
                intentR.putExtra("wasServiceAutoReconnected", this.w);
            } else {
                intentR = y(g(intent, i4), this.q);
            }
            if (i == 110) {
                intentR.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentR);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = i06.v(intent, "ProxyBillingActivity").g;
            i4 = -1;
            if (i2 != -1) {
                i06.j("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                i06.j("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                i06.j("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                i06.j("ProxyBillingActivity", "Got null bundle!");
            }
            if (du4.g(g(intent, i4), 1)) {
                intentR = y(g(intent, i4), this.q);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentR = intent3;
                } else {
                    intentR = r();
                    intentR.putExtras(intent.getExtras());
                    intentR.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentR.putExtra("billingClientTransactionId", this.q);
                intentR.putExtra("wasServiceAutoReconnected", this.w);
            }
            if (i == 110) {
                intentR.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentR);
        } else if (i == 101) {
            if (intent == null) {
                i06.j("ProxyBillingActivity", "Got null intent!");
            } else {
                int i6 = i06.g;
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    i06.j("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.j;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i5, extras);
                }
            }
            i5 = 0;
            resultReceiver = this.j;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i5, extras);
            }
        } else {
            i06.j("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.t = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            i06.l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.t = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.j = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.a = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.m = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.q = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.w = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        i06.l("ProxyBillingActivity", "Launching Play Store billing flow");
        this.m = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.a = true;
                this.m = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.j = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.m = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.q = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.w = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.t = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.m, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            i06.t("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.j;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentY = y(137, this.q);
                if (this.a) {
                    intentY.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentY);
            }
            this.t = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.t) {
            Intent intentR = r();
            intentR.putExtra("RESPONSE_CODE", 1);
            intentR.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.a) {
                intentR.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.m;
            if (i == 110 || i == 100) {
                intentR.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentR.putExtra("billingClientTransactionId", this.q);
            }
            sendBroadcast(intentR);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.j;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.t);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.a);
        bundle.putInt("activity_code", this.m);
        bundle.putLong("billingClientTransactionId", this.q);
        bundle.putBoolean("wasServiceAutoReconnected", this.w);
    }

    public final Intent r() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    public final Intent y(int i, long j) {
        Intent intentR = r();
        intentR.putExtra("RESPONSE_CODE", 6);
        intentR.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        w20 w20VarG = x20.g();
        w20VarG.j = 6;
        w20VarG.a = "An internal error occurred.";
        x20 x20VarR = w20VarG.r();
        int i2 = m26.g;
        intentR.putExtra("FAILURE_LOGGING_PAYLOAD", m26.y(i, 2, x20VarR, null, mc6.t).y());
        intentR.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentR.putExtra("billingClientTransactionId", j);
        intentR.putExtra("wasServiceAutoReconnected", this.w);
        return intentR;
    }
}
