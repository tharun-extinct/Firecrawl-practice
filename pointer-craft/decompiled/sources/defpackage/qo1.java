package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qo1 extends BroadcastReceiver {
    public static final AtomicReference y = new AtomicReference();
    public final Context g;

    public qo1(Context context) {
        this.g = context;
    }

    public static void g(Context context) {
        AtomicReference atomicReference = y;
        if (atomicReference.get() == null) {
            qo1 qo1Var = new qo1(context);
            while (!atomicReference.compareAndSet(null, qo1Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(qo1Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (ro1.a) {
            try {
                Iterator it = ((kr) ro1.m.values()).iterator();
                while (it.hasNext()) {
                    ((ro1) it.next()).v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g.unregisterReceiver(this);
    }
}
