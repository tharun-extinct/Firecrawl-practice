package defpackage;

import android.content.BroadcastReceiver;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wd6 {
    public static final Object g = new Object();
    public static boolean r;
    public static Method y;

    public static void g(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void r(BroadcastReceiver broadcastReceiver, bz1 bz1Var) {
        y(broadcastReceiver, na1.g, bz1Var);
    }

    public static final void y(BroadcastReceiver broadcastReceiver, fx0 fx0Var, bz1 bz1Var) {
        if (wv1.g.get()) {
            l0.z("goAsync must never be called when the AsyncRequestWorker is meant to be used");
            return;
        }
        ku0 ku0VarX = k33.x(fx0Var);
        m50.T(ku0VarX, null, new c(ku0VarX, broadcastReceiver.goAsync(), bz1Var, null, (byte) 20), 3);
    }
}
