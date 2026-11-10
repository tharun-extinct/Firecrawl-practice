package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yi6 {
    public static yi6 j;
    public static final Object l = new Object();
    public static HandlerThread t;
    public final HashMap g = new HashMap();
    public final fa4 n;
    public volatile uv5 r;
    public final short v;
    public final int x;
    public final Context y;

    public yi6(Context context, Looper looper) {
        ms4 ms4Var = new ms4(this, (byte) 2);
        this.y = context.getApplicationContext();
        uv5 uv5Var = new uv5(looper, ms4Var);
        Looper.getMainLooper();
        this.r = uv5Var;
        this.n = fa4.C();
        this.v = (short) 5000;
        this.x = 300000;
    }

    public final kq0 g(ug6 ug6Var, j46 j46Var, String str) {
        kq0 kq0VarG;
        HashMap map = this.g;
        synchronized (map) {
            try {
                sh6 sh6Var = (sh6) map.get(ug6Var);
                if (sh6Var == null) {
                    sh6Var = new sh6(this, ug6Var);
                    sh6Var.g.put(j46Var, j46Var);
                    kq0VarG = sh6Var.g(str, null);
                    map.put(ug6Var, sh6Var);
                } else {
                    this.r.removeMessages(0, ug6Var);
                    if (sh6Var.g.containsKey(j46Var)) {
                        String string = ug6Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    sh6Var.g.put(j46Var, j46Var);
                    byte b = sh6Var.y;
                    if (b == 1) {
                        j46Var.onServiceConnected(sh6Var.x, sh6Var.n);
                    } else if (b == 2) {
                        kq0VarG = sh6Var.g(str, null);
                    }
                    kq0VarG = null;
                }
                if (sh6Var.r) {
                    return kq0.w;
                }
                if (kq0VarG == null) {
                    kq0VarG = new kq0(-1, null, null);
                }
                return kq0VarG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(String str, ServiceConnection serviceConnection, boolean z) {
        ug6 ug6Var = new ug6(str, z);
        jr2.q(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.g;
        synchronized (map) {
            try {
                sh6 sh6Var = (sh6) map.get(ug6Var);
                if (sh6Var == null) {
                    String string = ug6Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!sh6Var.g.containsKey(serviceConnection)) {
                    String string2 = ug6Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                sh6Var.g.remove(serviceConnection);
                if (sh6Var.g.isEmpty()) {
                    this.r.sendMessageDelayed(this.r.obtainMessage(0, ug6Var), this.v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
