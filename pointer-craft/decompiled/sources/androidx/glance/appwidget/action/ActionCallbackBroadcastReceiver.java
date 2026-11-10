package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.ba3;
import defpackage.et2;
import defpackage.fg6;
import defpackage.q2;
import defpackage.s3;
import defpackage.tp;
import defpackage.wd6;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int g = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context is null");
            }
            if (intent == null) {
                throw new IllegalArgumentException("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("The intent must have action parameters extras.");
            }
            ba3 ba3VarN = et2.n(extras);
            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            tp tpVar = new tp(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (fg6.n(context, new q2((Object) string, (Object) tpVar, (Object) ba3VarN, (byte) 1))) {
                return;
            }
            wd6.r(this, new s3(context, string, tpVar, ba3VarN, null, (byte) 0));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }
}
