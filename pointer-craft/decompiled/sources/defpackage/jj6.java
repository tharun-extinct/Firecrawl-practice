package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class jj6 {
    public static final HashMap c = new HashMap();
    public final Context g;
    public final Intent j;
    public boolean l;
    public at5 q;
    public y56 w;
    public final at0 y;
    public final ArrayList n = new ArrayList();
    public final HashSet v = new HashSet();
    public final Object x = new Object();
    public final iu5 a = new iu5(this, (byte) 1);
    public final AtomicInteger m = new AtomicInteger(0);
    public final String r = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference t = new WeakReference(null);

    public jj6(Context context, at0 at0Var, Intent intent) {
        this.g = context;
        this.y = at0Var;
        this.j = intent;
    }

    public static void y(jj6 jj6Var, x56 x56Var) {
        y56 y56Var = jj6Var.w;
        at0 at0Var = jj6Var.y;
        ArrayList arrayList = jj6Var.n;
        int i = 0;
        if (y56Var != null || jj6Var.l) {
            if (!jj6Var.l) {
                x56Var.run();
                return;
            } else {
                at0Var.n("Waiting to bind to the service.", new Object[0]);
                arrayList.add(x56Var);
                return;
            }
        }
        at0Var.n("Initiate binding to the service.", new Object[0]);
        arrayList.add(x56Var);
        at5 at5Var = new at5(jj6Var, (byte) 2);
        jj6Var.q = at5Var;
        jj6Var.l = true;
        if (jj6Var.g.bindService(jj6Var.j, at5Var, 1)) {
            return;
        }
        at0Var.n("Failed to bind to the service.", new Object[0]);
        jj6Var.l = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            il0 il0Var = new il0("Failed to bind to the service.");
            x25 x25Var = ((wb6) obj).j;
            if (x25Var != null) {
                x25Var.r(il0Var);
            }
        }
        arrayList.clear();
    }

    public final Handler g() {
        Handler handler;
        HashMap map = c;
        synchronized (map) {
            try {
                if (!map.containsKey(this.r)) {
                    HandlerThread handlerThread = new HandlerThread(this.r, 10);
                    handlerThread.start();
                    map.put(this.r, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.r);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void r() {
        HashSet hashSet = this.v;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((x25) it.next()).r(new RemoteException(String.valueOf(this.r).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
