package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ob4 {
    public static int j;
    public static PendingIntent t;
    public iw5 l;
    public final ScheduledThreadPoolExecutor n;
    public final cj6 r;
    public Messenger x;
    public final Context y;
    public final sp4 g = new sp4(0);
    public final Messenger v = new Messenger(new rj6(this, Looper.getMainLooper()));

    public ob4(Context context) {
        this.y = context;
        this.r = new cj6(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.n = scheduledThreadPoolExecutor;
    }

    public final nj6 g(Bundle bundle) {
        byte b;
        int i;
        PackageInfo packageInfoE;
        cj6 cj6Var = this.r;
        synchronized (cj6Var) {
            try {
                b = 0;
                if (cj6Var.y == 0) {
                    try {
                        packageInfoE = is5.g(cj6Var.g).E("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        String strValueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(strValueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfoE = null;
                    }
                    if (packageInfoE != null) {
                        cj6Var.y = packageInfoE.versionCode;
                    }
                }
                i = cj6Var.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i < 12000000) {
            return this.r.g() != 0 ? r(bundle).v(dp1.a, new ve6(this, bundle)) : br2.b(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        nj6 nj6VarN = m46.r(this.y).n(bundle);
        dp1 dp1Var = dp1.a;
        aj6 aj6Var = aj6.z;
        nj6VarN.getClass();
        nj6 nj6Var = new nj6();
        nj6VarN.y.g(new r26(dp1Var, aj6Var, nj6Var, b));
        nj6VarN.i();
        return nj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    public final nj6 r(Bundle bundle) {
        String string;
        int iG;
        Context context;
        synchronized (ob4.class) {
            int i = j;
            j = i + 1;
            string = Integer.toString(i);
        }
        x25 x25Var = new x25();
        synchronized (this.g) {
            this.g.put(string, x25Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.r.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.y;
        synchronized (ob4.class) {
            try {
                PendingIntent broadcast = t;
                if (broadcast == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    broadcast = PendingIntent.getBroadcast(context2, 0, intent2, 0);
                    t = broadcast;
                }
                intent.putExtra("app", broadcast);
            } catch (Throwable th) {
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 5);
        sb.append("|ID|");
        sb.append(string);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.v);
        if (this.x == null && this.l == null) {
            iG = this.r.g();
            context = this.y;
            if (iG == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.x;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.l.r(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iG = this.r.g();
                context = this.y;
                if (iG == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        x25Var.g.y(dp1.a, new q70(this, string, this.n.schedule(new ml((Object) x25Var, (byte) 25), 30L, TimeUnit.SECONDS), (byte) 15));
        return x25Var.g;
    }

    public final void y(String str, Bundle bundle) {
        synchronized (this.g) {
            try {
                x25 x25Var = (x25) this.g.remove(str);
                if (x25Var != null) {
                    x25Var.y(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
