package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class sh6 implements ServiceConnection {
    public final /* synthetic */ yi6 l;
    public IBinder n;
    public boolean r;
    public final ug6 v;
    public ComponentName x;
    public final HashMap g = new HashMap();
    public byte y = 2;

    public sh6(yi6 yi6Var, ug6 ug6Var) {
        this.l = yi6Var;
        this.v = ug6Var;
    }

    public final kq0 g(String str, Executor executor) {
        try {
            Intent intentG = bx5.g(this.l.y, this.v);
            this.y = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(g06.g(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                yi6 yi6Var = this.l;
                fa4 fa4Var = yi6Var.n;
                Context context = yi6Var.y;
                ug6 ug6Var = this.v;
                boolean zZ0 = fa4Var.z0(context, str, intentG, this, 4225, executor);
                this.r = zZ0;
                if (zZ0) {
                    yi6Var.r.sendMessageDelayed(yi6Var.r.obtainMessage(1, ug6Var), yi6Var.x);
                    return kq0.w;
                }
                this.y = (byte) 2;
                try {
                    yi6Var.n.M(yi6Var.y, this);
                } catch (IllegalArgumentException unused) {
                }
                return new kq0(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (sw5 e) {
            return e.j;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yi6 yi6Var = this.l;
        synchronized (yi6Var.g) {
            try {
                yi6Var.r.removeMessages(1, this.v);
                this.n = iBinder;
                this.x = componentName;
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.y = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yi6 yi6Var = this.l;
        synchronized (yi6Var.g) {
            try {
                yi6Var.r.removeMessages(1, this.v);
                this.n = null;
                this.x = componentName;
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.y = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
