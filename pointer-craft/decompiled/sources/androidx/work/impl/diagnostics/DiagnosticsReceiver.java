package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.iy2;
import defpackage.kr5;
import defpackage.q70;
import defpackage.zq5;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String g = iy2.v("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = g;
        iy2.r().g(str, "Requesting diagnostics", new Throwable[0]);
        try {
            kr5 kr5VarG = kr5.g(context);
            List listSingletonList = Collections.singletonList(new q70(DiagnosticsWorker.class).z());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new zq5(kr5VarG, listSingletonList).g();
        } catch (IllegalStateException e) {
            iy2.r().y(str, "WorkManager is not initialized", e);
        }
    }
}
