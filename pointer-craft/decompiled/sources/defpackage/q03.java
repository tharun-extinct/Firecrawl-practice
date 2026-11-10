package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class q03 {
    public static final /* synthetic */ ci2[] g = {new f04(q03.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1), new f04(q03.class, "widgetData", "getWidgetData(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final qw3 y = aq2.d("settings", null, null, 14);
    public static final qw3 r = aq2.d("widget", null, null, 14);

    public static final vz0 g(Context context) {
        context.getClass();
        return y.g(context, g[0]);
    }

    public static final vz0 y(Context context) {
        context.getClass();
        return r.g(context, g[1]);
    }
}
