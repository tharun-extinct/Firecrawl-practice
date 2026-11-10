package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class bt5 {
    public static final HashMap i = new HashMap();
    public cu5 c;
    public final Context g;
    public final Intent j;
    public boolean l;
    public final vg5 t;
    public at5 w;
    public final fu5 y;
    public final ArrayList n = new ArrayList();
    public final HashSet v = new HashSet();
    public final Object x = new Object();
    public final iu5 m = new iu5(this, 0);
    public final AtomicInteger q = new AtomicInteger(0);
    public final String r = "IntegrityService";
    public final WeakReference a = new WeakReference(null);

    public bt5(Context context, fu5 fu5Var, Intent intent, vg5 vg5Var) {
        this.g = context;
        this.y = fu5Var;
        this.j = intent;
        this.t = vg5Var;
    }

    public static void y(bt5 bt5Var, ht5 ht5Var) {
        cu5 cu5Var = bt5Var.c;
        ArrayList arrayList = bt5Var.n;
        fu5 fu5Var = bt5Var.y;
        int i2 = 0;
        if (cu5Var != null || bt5Var.l) {
            if (!bt5Var.l) {
                ht5Var.run();
                return;
            } else {
                fu5Var.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(ht5Var);
                return;
            }
        }
        fu5Var.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(ht5Var);
        at5 at5Var = new at5(bt5Var);
        bt5Var.w = at5Var;
        bt5Var.l = true;
        if (bt5Var.g.bindService(bt5Var.j, at5Var, 1)) {
            return;
        }
        fu5Var.g("Failed to bind to the service.", new Object[0]);
        bt5Var.l = false;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((hu5) obj).g(new ct5("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler g() {
        Handler handler;
        HashMap map = i;
        synchronized (map) {
            try {
                String str = this.r;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
