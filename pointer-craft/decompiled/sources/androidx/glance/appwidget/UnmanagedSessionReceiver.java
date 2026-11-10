package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.l0;
import defpackage.ug5;
import defpackage.yf2;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final ug5 g = new ug5((byte) 0);
    public static final LinkedHashMap y = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !yf2.p(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            l0.z("Intent is missing ActionKey extra");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            l0.z("Intent is missing AppWidgetId extra");
        } else {
            ug5.n(intExtra);
            Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
        }
    }
}
