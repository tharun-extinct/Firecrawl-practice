package io.appground.blek.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.a11;
import defpackage.c41;
import defpackage.fo5;
import defpackage.hn5;
import defpackage.kz0;
import defpackage.l4;
import defpackage.nm0;
import defpackage.q64;
import defpackage.s02;
import defpackage.sv1;
import defpackage.tl5;
import defpackage.u62;
import defpackage.w62;
import defpackage.yl0;
import defpackage.yp2;
import defpackage.zl0;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetConfigurationActivity extends yl0 implements s02 {
    public static final /* synthetic */ int F = 0;
    public volatile l4 C;
    public final Object D = new Object();
    public boolean E = false;

    public WidgetConfigurationActivity() {
        m(new w62(this, (byte) 1));
    }

    public final void b(Bundle bundle) {
        super.onCreate(bundle);
        i().y();
    }

    public final l4 i() {
        if (this.C == null) {
            synchronized (this.D) {
                try {
                    if (this.C == null) {
                        this.C = new l4(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.C;
    }

    @Override // defpackage.r02
    public final Object n() {
        return i().n();
    }

    @Override // defpackage.yl0, defpackage.xl0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ComponentName componentName;
        Bundle extras;
        b(bundle);
        Intent intent = getIntent();
        byte b = 0;
        int i = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("appWidgetId", 0);
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this).getAppWidgetInfo(i);
        String className = (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null) ? null : componentName.getClassName();
        fo5 fo5Var = (className == null || !className.endsWith("MultimediaWidgetReceiver")) ? fo5.a : fo5.t;
        setResult(0, new Intent().putExtra("appWidgetId", i));
        zl0.g(this, new nm0(908687288, true, new hn5(fo5Var, this, i, b)));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        sv1 sv1Var = i().q;
        if (sv1Var != null) {
            sv1Var.y = null;
        }
    }

    @Override // defpackage.yl0, defpackage.a52
    public final tl5 x() {
        tl5 tl5VarX = super.x();
        kz0 kz0Var = (kz0) ((c41) a11.u(c41.class, this));
        yp2 yp2VarG = kz0Var.g();
        q64 q64Var = new q64(kz0Var.g, kz0Var.y);
        tl5VarX.getClass();
        return new u62(yp2VarG, tl5VarX, q64Var);
    }
}
