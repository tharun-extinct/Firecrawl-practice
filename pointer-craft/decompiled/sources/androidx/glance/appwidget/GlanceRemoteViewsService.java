package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.l0;
import defpackage.r22;
import defpackage.v92;

/* JADX INFO: loaded from: classes.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {
    public static final v92 j = new v92((byte) 25);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            l0.u("Intent is null");
            return null;
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            l0.z("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            l0.z("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new r22(this, intExtra, intExtra2, stringExtra);
        }
        l0.z("No size info was present in the intent");
        return null;
    }
}
