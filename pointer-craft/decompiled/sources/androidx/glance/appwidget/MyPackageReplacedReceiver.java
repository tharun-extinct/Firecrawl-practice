package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.dy;
import defpackage.fg6;
import defpackage.l0;
import defpackage.m92;
import defpackage.mu0;
import defpackage.wd6;

/* JADX INFO: loaded from: classes2.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int g = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            l0.z("onReceive context is null");
        } else if (intent == null) {
            l0.z("onReceive intent is null");
        } else {
            if (fg6.n(context, new m92((byte) 16))) {
                return;
            }
            wd6.r(this, new dy(context, (mu0) null, (byte) 22));
        }
    }
}
