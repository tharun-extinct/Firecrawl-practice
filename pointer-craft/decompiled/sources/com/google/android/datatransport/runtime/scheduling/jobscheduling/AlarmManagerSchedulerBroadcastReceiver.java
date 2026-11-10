package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.cv;
import defpackage.fd5;
import defpackage.qh5;
import defpackage.ro;
import defpackage.uh5;
import defpackage.v5;
import defpackage.zx3;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int g = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        fd5.y(context);
        ro roVarG = cv.g();
        roVarG.X(queryParameter);
        roVarG.m = zx3.y(iIntValue);
        if (queryParameter2 != null) {
            roVarG.a = Base64.decode(queryParameter2, 0);
        }
        uh5 uh5Var = fd5.g().n;
        ((Executor) uh5Var.l).execute(new qh5(uh5Var, roVarG.j(), i, new v5()));
    }
}
