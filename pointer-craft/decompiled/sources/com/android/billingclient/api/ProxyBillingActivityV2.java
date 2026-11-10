package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import defpackage.b5;
import defpackage.i06;
import defpackage.s4;
import defpackage.t4;
import defpackage.te2;
import defpackage.yl0;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivityV2 extends yl0 {
    public b5 C;
    public b5 D;
    public b5 E;
    public b5 F;
    public ResultReceiver G;
    public ResultReceiver H;
    public ResultReceiver I;
    public ResultReceiver J;

    @Override // defpackage.yl0, defpackage.xl0, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        final byte b = 1;
        final byte b2 = 0;
        this.C = c(new s4(this) { // from class: a46
            public final /* synthetic */ ProxyBillingActivityV2 t;

            {
                this.t = this;
            }

            @Override // defpackage.s4
            public final void r(Object obj) {
                byte b3 = b2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.t;
                r4 r4Var = (r4) obj;
                switch (b3) {
                    case 0:
                        Intent intent = r4Var.t;
                        int i = i06.v(intent, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.G;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = r4Var.j;
                        if (i2 != -1 || i != 0) {
                            i06.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = r4Var.t;
                        int i3 = r4Var.j;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            i06.j("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i3);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                        }
                        int i4 = i06.v(intent2, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.I;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i4, extras);
                        } else {
                            i06.j("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i4 != 0) {
                            i06.j("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new t4((byte) 1));
        this.D = c(new s4(this) { // from class: c46
            public final /* synthetic */ ProxyBillingActivityV2 t;

            {
                this.t = this;
            }

            @Override // defpackage.s4
            public final void r(Object obj) {
                byte b3 = b2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.t;
                r4 r4Var = (r4) obj;
                switch (b3) {
                    case 0:
                        Intent intent = r4Var.t;
                        int i = i06.v(intent, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.H;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = r4Var.j;
                        if (i2 != -1 || i != 0) {
                            i06.j("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = r4Var.t;
                        int i3 = r4Var.j;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            i06.j("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i3);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i3);
                        }
                        int i4 = i06.v(intent2, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i4, extras);
                        } else {
                            i06.j("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i4 != 0) {
                            i06.j("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new t4((byte) 1));
        this.E = c(new s4(this) { // from class: a46
            public final /* synthetic */ ProxyBillingActivityV2 t;

            {
                this.t = this;
            }

            @Override // defpackage.s4
            public final void r(Object obj) {
                byte b3 = b;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.t;
                r4 r4Var = (r4) obj;
                switch (b3) {
                    case 0:
                        Intent intent = r4Var.t;
                        int i = i06.v(intent, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.G;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = r4Var.j;
                        if (i2 != -1 || i != 0) {
                            i06.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = r4Var.t;
                        int i3 = r4Var.j;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            i06.j("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i3);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i3);
                        }
                        int i4 = i06.v(intent2, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.I;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i4, extras);
                        } else {
                            i06.j("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i4 != 0) {
                            i06.j("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new t4((byte) 1));
        this.F = c(new s4(this) { // from class: c46
            public final /* synthetic */ ProxyBillingActivityV2 t;

            {
                this.t = this;
            }

            @Override // defpackage.s4
            public final void r(Object obj) {
                byte b3 = b;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.t;
                r4 r4Var = (r4) obj;
                switch (b3) {
                    case 0:
                        Intent intent = r4Var.t;
                        int i = i06.v(intent, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.H;
                        if (resultReceiver != null) {
                            resultReceiver.send(i, intent != null ? intent.getExtras() : null);
                        }
                        int i2 = r4Var.j;
                        if (i2 != -1 || i != 0) {
                            i06.j("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = r4Var.t;
                        int i3 = r4Var.j;
                        Bundle extras = intent2 != null ? intent2.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            i06.j("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i3);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i3);
                        }
                        int i4 = i06.v(intent2, "ProxyBillingActivityV2").g;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i4, extras);
                        } else {
                            i06.j("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i4 != 0) {
                            i06.j("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new t4((byte) 1));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.G = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.J = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        i06.l("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.G = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            b5 b5Var = this.C;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            b5Var.g(new te2(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            b5 b5Var2 = this.D;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            b5Var2.g(new te2(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            b5 b5Var3 = this.E;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            b5Var3.g(new te2(intentSender3, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.J = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            b5 b5Var4 = this.F;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            b5Var4.g(new te2(intentSender4, null, 0, 0));
        }
    }

    @Override // defpackage.yl0, defpackage.xl0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.G;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.H;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.I;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.J;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
