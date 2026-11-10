package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public final class z12 {
    public static final z12 g = new z12();

    public final boolean g(AppWidgetManager appWidgetManager, ComponentName componentName, int i, RemoteViews remoteViews) {
        return appWidgetManager.setWidgetPreview(componentName, i, remoteViews);
    }
}
