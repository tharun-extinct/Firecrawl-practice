package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class m46 {
    public static m46 v;
    public int g;
    public Object n;
    public final Object r;
    public final Object y;

    public m46() {
        this.y = new ArrayList();
        this.r = new dm3(this);
        this.g = 0;
        this.n = new Object();
    }

    public static synchronized m46 r(Context context) {
        m46 m46Var;
        m46Var = v;
        if (m46Var == null) {
            m46Var = new m46(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new gc3("MessengerIpcClient"))));
            v = m46Var;
        }
        return m46Var;
    }

    public void g() {
        Iterator it = ((ArrayList) this.y).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            uo1.B();
        }
    }

    public nj6 n(Bundle bundle) {
        int i;
        nj6 nj6Var;
        synchronized (this) {
            i = this.g;
            this.g = i + 1;
        }
        ej6 ej6Var = new ej6(i, bundle);
        synchronized (this) {
            try {
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf = String.valueOf(ej6Var);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                    sb.append("Queueing ");
                    sb.append(strValueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                if (!((z56) this.n).y(ej6Var)) {
                    z56 z56Var = new z56(this);
                    this.n = z56Var;
                    z56Var.y(ej6Var);
                }
                nj6Var = ej6Var.y.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nj6Var;
    }

    public void y() {
        synchronized (this.n) {
            try {
                int i = this.g;
                if (i == 0) {
                    return;
                }
                int i2 = i - 1;
                this.g = i2;
                if (i2 == 0) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public m46(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.n = new z56(this);
        this.g = 1;
        this.r = scheduledExecutorService;
        this.y = context.getApplicationContext();
    }
}
