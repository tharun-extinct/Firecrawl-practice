package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class o00 {
    public boolean A;
    public boolean B;
    public final hi0 C;
    public final boolean D;
    public final boolean E;
    public volatile p00 F;
    public ExecutorService G;
    public final Long H;
    public final lr2 I;
    public volatile b06 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean i;
    public final wh4 j;
    public boolean k;
    public final Context l;
    public boolean m;
    public final String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final String r;
    public boolean s;
    public volatile kx5 t;
    public boolean u;
    public volatile oo3 x;
    public boolean z;
    public final Object g = new Object();
    public volatile byte y = 0;
    public final Handler v = new Handler(Looper.getMainLooper());
    public int w = 0;

    public o00(hi0 hi0Var, Context context, w10 w10Var, n00 n00Var) {
        long jNextLong = new Random().nextLong();
        this.H = Long.valueOf(jNextLong);
        this.I = xy5.g;
        this.r = "8.3.0";
        String strT = t();
        this.n = strT;
        this.l = context.getApplicationContext();
        tc6 tc6VarA = wc6.A();
        tc6VarA.y();
        wc6.d((wc6) tc6VarA.t);
        if (strT != null) {
            tc6VarA.y();
            wc6.e((wc6) tc6VarA.t, strT);
        }
        String packageName = this.l.getPackageName();
        tc6VarA.y();
        wc6.p((wc6) tc6VarA.t, packageName);
        tc6VarA.y();
        wc6.E((wc6) tc6VarA.t, jNextLong);
        boolean z = n00Var.n;
        tc6VarA.y();
        wc6.k((wc6) tc6VarA.t, z);
        int i = Build.VERSION.SDK_INT;
        tc6VarA.y();
        wc6.B((wc6) tc6VarA.t, i);
        tc6VarA.r();
        D(tc6VarA, context);
        try {
            int i2 = this.l.getPackageManager().getPackageInfo(this.l.getPackageName(), 0).versionCode;
            tc6VarA.y();
            wc6.C((wc6) tc6VarA.t, i2);
        } catch (Throwable th) {
            i06.t("BillingClient", "Error getting app version code.", th);
        }
        this.j = new wh4(this.l, (wc6) tc6VarA.g());
        if (w10Var == null) {
            i06.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.x = new oo3(this.l, w10Var, this.j);
        this.C = hi0Var;
        this.E = false;
        this.l.getPackageName();
        this.D = n00Var.n;
    }

    public static final void D(tc6 tc6Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                tc6Var.y();
                wc6.f((wc6) tc6Var.t, i);
                String str = Build.BRAND;
                tc6Var.y();
                wc6.u((wc6) tc6Var.t);
                String str2 = Build.MODEL;
                tc6Var.y();
                wc6.o((wc6) tc6Var.t);
                String str3 = Build.MANUFACTURER;
                tc6Var.y();
                wc6.h((wc6) tc6Var.t);
                String str4 = Build.FINGERPRINT;
                tc6Var.y();
                wc6.z((wc6) tc6Var.t);
            }
        } catch (RuntimeException e) {
            i06.t("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public static void c(o00 o00Var, int i) {
        if (i != 0) {
            o00Var.k(0);
            return;
        }
        synchronized (o00Var.g) {
            try {
                if (o00Var.y == 3) {
                    return;
                }
                o00Var.k(2);
                oo3 oo3Var = o00Var.x != null ? o00Var.x : null;
                if (oo3Var != null) {
                    boolean z = o00Var.d;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    oo3Var.g = z;
                    mw5 mw5Var = (mw5) oo3Var.x;
                    Context context = (Context) oo3Var.y;
                    mw5Var.g(context, intentFilter2);
                    boolean z2 = oo3Var.g;
                    mw5 mw5Var2 = (mw5) oo3Var.v;
                    if (!z2) {
                        mw5Var2.g(context, intentFilter);
                        return;
                    }
                    synchronized (mw5Var2) {
                        try {
                            if (mw5Var2.g) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(mw5Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != mw5Var2.y ? 4 : 2);
                            } else {
                                context.registerReceiver(mw5Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            mw5Var2.g = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Future l(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new tu2(futureSubmit, runnable, (byte) 9), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            i06.t("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String t() {
        try {
            return (String) v70.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void w(o00 o00Var, int i) {
        o00Var.w = i;
        o00Var.B = i >= 26;
        o00Var.A = i >= 24;
        o00Var.e = i >= 23;
        o00Var.d = i >= 21;
        o00Var.k = i >= 20;
        o00Var.f = i >= 19;
        o00Var.o = i >= 18;
        o00Var.h = i >= 17;
        o00Var.z = i >= 16;
        o00Var.u = i >= 15;
        o00Var.p = i >= 14;
        o00Var.s = i >= 12;
        o00Var.b = i >= 9;
        o00Var.i = i >= 8;
        o00Var.c = i >= 6;
    }

    public final boolean A() {
        try {
            int i = ((x20) u(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS)).g;
            if (i == 0) {
                i06.l("BillingClient", "Reconnection succeeded with result: " + i);
            } else {
                i06.j("BillingClient", "Reconnection failed with result: " + i);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            i06.t("BillingClient", "Error during reconnection attempt: ", e);
        }
        return C();
    }

    public final boolean B() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lr2 lr2Var = this.I;
        if (lr2Var == null) {
            l0.q("ticker");
            return false;
        }
        long J = lr2Var.J();
        long j = 30000;
        int i = 1;
        long J2 = 30000;
        while (i <= 3) {
            try {
                long jMax = Math.max(0L, J2);
                if (jMax <= 0) {
                    i06.j("BillingClient", "No time remaining for reconnection attempt.");
                    return C();
                }
                int i2 = ((x20) u(i).get(jMax, timeUnit)).g;
                if (i2 == 0) {
                    i06.l("BillingClient", "Reconnection succeeded with result: " + i2);
                    return C();
                }
                i06.j("BillingClient", "Reconnection failed with result: " + i2);
                J2 = j - (((lr2Var.J() - J) + 0) / 1000000);
                long j2 = j;
                long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (J2 < jPow) {
                    i06.j("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return C();
                }
                if (i < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        J2 = j2 - (((lr2Var.J() - J) + 0) / 1000000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        i06.t("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
                i++;
                j = j2;
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                i06.t("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        i06.j("BillingClient", "Max retries reached.");
        return C();
    }

    public final boolean C() {
        boolean z;
        synchronized (this.g) {
            try {
                z = false;
                if (this.y == 2 && this.t != null && this.a != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final wh4 E(x20 x20Var, int i, String str, Exception exc) {
        I(i, 9, x20Var, m26.g(exc));
        i06.t("BillingClient", str, exc);
        return new wh4(x20Var, (Object) null);
    }

    public final void F(int i, int i2, x20 x20Var) {
        yb6 yb6Var = null;
        mb6 mb6Var = null;
        if (x20Var.g == 0) {
            int i3 = m26.g;
            try {
                pb6 pb6VarP = yb6.p();
                pb6VarP.y();
                yb6.s((yb6) pb6VarP.t, 5);
                cd6 cd6VarS = gd6.s();
                cd6VarS.r(i2);
                gd6 gd6Var = (gd6) cd6VarS.g();
                pb6VarP.y();
                yb6.h((yb6) pb6VarP.t, gd6Var);
                yb6Var = (yb6) pb6VarP.g();
            } catch (Exception e) {
                i06.t("BillingLogger", "Unable to create logging payload", e);
            }
            o(yb6Var);
            return;
        }
        int i4 = m26.g;
        try {
            kb6 kb6VarZ = mb6.z();
            ac6 ac6VarP = fc6.p();
            ac6VarP.n(x20Var.g);
            String str = x20Var.r;
            ac6VarP.y();
            fc6.z((fc6) ac6VarP.t, str);
            ac6VarP.r(i);
            kb6VarZ.r(ac6VarP);
            kb6VarZ.v(5);
            cd6 cd6VarS2 = gd6.s();
            cd6VarS2.r(i2);
            gd6 gd6Var2 = (gd6) cd6VarS2.g();
            kb6VarZ.y();
            mb6.d((mb6) kb6VarZ.t, gd6Var2);
            mb6Var = (mb6) kb6VarZ.g();
        } catch (Exception e2) {
            i06.t("BillingLogger", "Unable to create logging payload", e2);
        }
        h(mb6Var);
    }

    public final void G(int i, int i2, x20 x20Var) {
        try {
            int i3 = m26.g;
            h(m26.y(i, i2, x20Var, null, mc6.t));
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
    }

    public final void H(int i, x20 x20Var, long j) {
        try {
            int i2 = m26.g;
            try {
                this.j.m(m26.y(i, 2, x20Var, null, mc6.t), this.w, j);
            } catch (Throwable th) {
                i06.t("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            i06.t("BillingClient", "Unable to log.", th2);
        }
    }

    public final void I(int i, int i2, x20 x20Var, String str) {
        try {
            int i3 = m26.g;
            h(m26.y(i, i2, x20Var, str, mc6.t));
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
    }

    public final void J(int i, x20 x20Var, long j, boolean z) {
        try {
            int i2 = m26.g;
            try {
                this.j.w(m26.y(i, 2, x20Var, null, mc6.t), this.w, j, z);
            } catch (Throwable th) {
                i06.t("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            i06.t("BillingClient", "Unable to log.", th2);
        }
    }

    public final void K(int i, x20 x20Var, String str, long j, boolean z) {
        try {
            int i2 = m26.g;
            try {
                this.j.w(m26.y(i, 2, x20Var, str, mc6.t), this.w, j, z);
            } catch (Throwable th) {
                i06.t("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            i06.t("BillingClient", "Unable to log.", th2);
        }
    }

    public final void L(x20 x20Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.v.post(new i26((Object) this, (Object) x20Var, (byte) 19));
    }

    public final void a(v92 v92Var, x20 x20Var, int i, Exception exc) {
        i06.t("BillingClient", "Error in acknowledge purchase!", exc);
        I(i, 3, x20Var, m26.g(exc));
        v92Var.M(x20Var);
    }

    public final bm b(x20 x20Var, int i, String str, Exception exc) {
        i06.t("BillingClient", str, exc);
        I(i, 7, x20Var, m26.g(exc));
        return new bm(x20Var.g, x20Var.r, new ArrayList(), new ArrayList());
    }

    public final void d(p00 p00Var, int i) {
        int i2;
        x20 x20VarS;
        x20 x20Var;
        synchronized (this.g) {
            try {
                if (C()) {
                    x20VarS = s(i);
                } else {
                    if (this.y == 1) {
                        i06.j("BillingClient", "Client is already in the process of connecting to billing service.");
                        x20Var = b36.n;
                        f(37, i, x20Var);
                    } else if (this.y == 3) {
                        i06.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        x20Var = b36.a;
                        f(38, i, x20Var);
                    } else {
                        k(1);
                        if (i == 0) {
                            this.F = p00Var;
                            i = 0;
                        }
                        e();
                        i06.l("BillingClient", "Starting in-app billing setup.");
                        this.a = new b06(this, p00Var, i);
                        b06 b06Var = this.a;
                        synchronized (b06Var.v.g) {
                            kz5 kz5Var = b06Var.y;
                            kz5Var.r = 0L;
                            kz5Var.y = false;
                            kz5Var.g();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.l.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i2 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i2 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    i06.j("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.r);
                                    synchronized (this.g) {
                                        try {
                                            if (this.y == 2) {
                                                x20VarS = s(i);
                                            } else if (this.y != 1) {
                                                i06.j("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                x20Var = b36.a;
                                                f(105, i, x20Var);
                                            } else {
                                                b06 b06Var2 = this.a;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.l.bindService(intent2, b06Var2, 1) : this.l.bindService(intent2, 1, x(), b06Var2)) {
                                                    i06.l("BillingClient", "Service was bonded successfully.");
                                                    x20VarS = null;
                                                } else {
                                                    i06.j("BillingClient", "Connection to Billing service is blocked.");
                                                    i2 = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                i06.j("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        k(0);
                        i06.l("BillingClient", "Billing service unavailable on device.");
                        x20 x20Var2 = b36.y;
                        f(i2, i, x20Var2);
                        x20VarS = x20Var2;
                    }
                    x20VarS = x20Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (x20VarS != null) {
            p00Var.g(x20VarS);
        }
    }

    public final void e() {
        synchronized (this.g) {
            if (this.a != null) {
                try {
                    this.l.unbindService(this.a);
                    this.t = null;
                    this.a = null;
                } catch (Throwable th) {
                    try {
                        i06.t("BillingClient", "There was an exception while unbinding service!", th);
                        this.t = null;
                        this.a = null;
                    } catch (Throwable th2) {
                        this.t = null;
                        this.a = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final void f(int i, int i2, x20 x20Var) {
        try {
            int i3 = m26.g;
            kb6 kb6Var = (kb6) m26.y(i, 6, x20Var, null, mc6.t).q();
            je6 je6VarS = me6.s();
            je6VarS.r(i2 > 0);
            je6VarS.n(i2);
            kb6Var.n(je6VarS);
            h((mb6) kb6Var.g());
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
    }

    public void g(h3 h3Var, v92 v92Var) {
        if (l(new yw5(this, v92Var, h3Var, (byte) 1), 30000L, new i26((Object) this, (Object) v92Var, (byte) 18), i(), x()) == null) {
            x20 x20VarP = p();
            G(25, 3, x20VarP);
            v92Var.M(x20VarP);
        }
    }

    public final void h(mb6 mb6Var) {
        try {
            this.j.a(mb6Var, this.w);
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
    }

    public final Handler i() {
        return Looper.myLooper() == null ? this.v : new Handler(Looper.myLooper());
    }

    public final void j() {
        if (TextUtils.isEmpty(null)) {
            this.l.getPackageName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i) {
        String str;
        String str2;
        synchronized (this.g) {
            try {
                if (this.y == 3) {
                    return;
                }
                byte b = this.y;
                if (b == 0) {
                    str = "DISCONNECTED";
                } else if (b != 1) {
                    str = b != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                i06.l("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.y = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(fa4 fa4Var, String str, x20 x20Var, int i, String str2, Exception exc) {
        i06.t("BillingClient", str2, exc);
        I(i, 4, x20Var, m26.g(exc));
        fa4Var.I(x20Var, str);
    }

    public void n(jy3 jy3Var, q64 q64Var) {
        if (l(new bz5(this, q64Var, jy3Var, (byte) 0), 30000L, new tu2((byte) 10, this, q64Var, false), i(), x()) == null) {
            x20 x20VarP = p();
            G(25, 7, x20VarP);
            vz5 vz5Var = a06.t;
            r06 r06Var = r06.q;
            el0 el0Var = (el0) q64Var.t;
            x20VarP.getClass();
            el0Var.f0(new kz3(x20VarP, r06Var));
        }
    }

    public final void o(yb6 yb6Var) {
        try {
            wh4 wh4Var = this.j;
            int i = this.w;
            wh4Var.getClass();
            try {
                tc6 tc6Var = (tc6) ((wc6) wh4Var.j).q();
                tc6Var.y();
                wc6.D((wc6) tc6Var.t, i);
                wc6 wc6Var = (wc6) tc6Var.g();
                wh4Var.j = wc6Var;
                try {
                    wh4Var.p(yb6Var, wc6Var);
                } catch (Throwable th) {
                    i06.t("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                i06.t("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            i06.t("BillingClient", "Unable to log.", th3);
        }
    }

    public final x20 p() {
        int[] iArr = {0, 3};
        synchronized (this.g) {
            for (int i = 0; i < 2; i++) {
                if (this.y == iArr[i]) {
                    return b36.a;
                }
            }
            return b36.j;
        }
    }

    public final void q(q00 q00Var, x20 x20Var, int i, Exception exc) {
        i06.t("BillingClient", "getBillingConfig got an exception.", exc);
        I(i, 13, x20Var, m26.g(exc));
        q00Var.g(x20Var);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0321  */
    /* JADX WARN: Code duplicated, block: B:137:0x0326  */
    /* JADX WARN: Code duplicated, block: B:269:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [o00] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    public x20 r(Activity activity, final c20 c20Var) {
        boolean z;
        long j;
        boolean z2;
        String string;
        Future futureL;
        ?? r6;
        String str;
        ?? r7;
        ?? r4;
        ?? r8;
        ?? r5;
        int iG;
        int i;
        String str2;
        boolean z3;
        z10 z10Var;
        String str3;
        String str4;
        z10 z10Var2;
        String str5;
        String str6;
        String str7;
        boolean z4;
        boolean z5;
        int i2;
        long jNextLong = new Random().nextLong();
        if (this.x == null || ((w10) this.x.r) == null) {
            x20 x20Var = b36.D;
            H(12, x20Var, jNextLong);
            return x20Var;
        }
        if (!A()) {
            x20 x20Var2 = b36.a;
            H(2, x20Var2, jNextLong);
            L(x20Var2);
            return x20Var2;
        }
        synchronized (this.g) {
            try {
                if (this.a != null) {
                    z = this.a.n > 0;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayListT = c20Var.t();
        a06 a06VarA = c20Var.a();
        fj.w(oc6.r(arrayListT));
        z10 z10Var3 = (z10) oc6.r(a06VarA);
        String str8 = z10Var3.y().r;
        String str9 = z10Var3.y().n;
        if (str9.equals("subs") && !this.m) {
            i06.j("BillingClient", "Current client doesn't support subscriptions.");
            x20 x20Var3 = b36.q;
            J(9, x20Var3, jNextLong, z);
            L(x20Var3);
            return x20Var3;
        }
        if (c20Var.m() && !this.c) {
            i06.j("BillingClient", "Current client doesn't support extra params for buy intent.");
            x20 x20Var4 = b36.x;
            J(18, x20Var4, jNextLong, z);
            L(x20Var4);
            return x20Var4;
        }
        if (arrayListT.size() > 1 && !this.z) {
            i06.j("BillingClient", "Current client doesn't support multi-item purchases.");
            x20 x20Var5 = b36.b;
            J(19, x20Var5, jNextLong, z);
            L(x20Var5);
            return x20Var5;
        }
        if (!a06VarA.isEmpty() && !this.h) {
            i06.j("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            x20 x20Var6 = b36.p;
            J(20, x20Var6, jNextLong, z);
            L(x20Var6);
            return x20Var6;
        }
        x20 x20VarN = c20Var.n();
        if (x20VarN != b36.t) {
            J(108, x20VarN, jNextLong, z);
            L(x20VarN);
            return x20VarN;
        }
        if (this.c) {
            boolean z6 = this.b;
            this.C.getClass();
            this.C.getClass();
            boolean z7 = this.E;
            String str10 = this.r;
            String str11 = this.n;
            long jLongValue = this.H.longValue();
            this.l.getPackageName();
            int i3 = i06.g;
            boolean z8 = z;
            final Bundle bundle = new Bundle();
            i06.y(bundle, str10, str11, jLongValue);
            bundle.putLong("billingClientTransactionId", jNextLong);
            if (c20Var.r() != 0) {
                bundle.putInt("prorationMode", c20Var.r());
            }
            if (!TextUtils.isEmpty(c20Var.v())) {
                bundle.putString("accountId", c20Var.v());
            }
            if (!TextUtils.isEmpty(c20Var.x())) {
                bundle.putString("obfuscatedProfileId", c20Var.x());
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c20Var.l())) {
                bundle.putString("oldSkuPurchaseToken", c20Var.l());
            }
            if (TextUtils.isEmpty(null)) {
                str2 = null;
            } else {
                str2 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            c20Var.j();
            if (!TextUtils.isEmpty(str2)) {
                c20Var.j();
                bundle.putString("originalExternalTransactionId", str2);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("paymentsPurchaseParams", str2);
            }
            if (z6) {
                z3 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z3 = true;
            }
            if (z7) {
                bundle.putBoolean("enableAlternativeBilling", z3);
            }
            ArrayList arrayList = new ArrayList();
            vz5 vz5VarListIterator = c20Var.a().listIterator(0);
            while (vz5VarListIterator.hasNext()) {
                ((z10) vz5VarListIterator.next()).getClass();
            }
            if (!arrayList.isEmpty()) {
                v36 v36VarS = y36.s();
                v36VarS.r(arrayList);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((y36) v36VarS.g()).y());
            }
            if (arrayListT.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(a06VarA.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(a06VarA.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                j = jNextLong;
                int i4 = 0;
                boolean z9 = z8;
                while (i4 < a06VarA.size()) {
                    z10 z10Var4 = (z10) a06VarA.get(i4);
                    jz3 jz3VarY = z10Var4.y();
                    boolean z10 = z9;
                    if (!jz3VarY.l.isEmpty()) {
                        arrayList4.add(jz3VarY.l);
                    }
                    String strR = z10Var4.r();
                    arrayList5.add(strR);
                    if (TextUtils.isEmpty(strR)) {
                        z10Var2 = z10Var3;
                    } else {
                        z10Var2 = z10Var3;
                        ArrayList arrayList8 = jz3VarY.a;
                        if (arrayList8 != null && !arrayList8.isEmpty()) {
                            str5 = str8;
                            int size = arrayList8.size();
                            str6 = str9;
                            int i5 = 0;
                            while (true) {
                                if (i5 < size) {
                                    Object obj = arrayList8.get(i5);
                                    i5++;
                                    ArrayList arrayList9 = arrayList8;
                                    gz3 gz3Var = (gz3) obj;
                                    int i6 = size;
                                    if (!TextUtils.isEmpty(gz3Var.x) && Objects.equals(gz3Var.n, strR)) {
                                        str7 = gz3Var.x;
                                        break;
                                    }
                                    size = i6;
                                    arrayList8 = arrayList9;
                                }
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                arrayList6.add(str7);
                            }
                            if (i4 > 0) {
                                arrayList2.add(((z10) a06VarA.get(i4)).y().r);
                                arrayList3.add(((z10) a06VarA.get(i4)).y().n);
                            }
                            i4++;
                            z10Var3 = z10Var2;
                            z9 = z10 ? 1 : 0;
                            str8 = str5;
                            str9 = str6;
                        }
                        str7 = jz3VarY.j;
                        if (!TextUtils.isEmpty(str7)) {
                            arrayList6.add(str7);
                        }
                        if (i4 > 0) {
                            arrayList2.add(((z10) a06VarA.get(i4)).y().r);
                            arrayList3.add(((z10) a06VarA.get(i4)).y().n);
                        }
                        i4++;
                        z10Var3 = z10Var2;
                        z9 = z10 ? 1 : 0;
                        str8 = str5;
                        str9 = str6;
                    }
                    str5 = str8;
                    str6 = str9;
                    str7 = jz3VarY.j;
                    if (!TextUtils.isEmpty(str7)) {
                        arrayList6.add(str7);
                    }
                    if (i4 > 0) {
                        arrayList2.add(((z10) a06VarA.get(i4)).y().r);
                        arrayList3.add(((z10) a06VarA.get(i4)).y().n);
                    }
                    i4++;
                    z10Var3 = z10Var2;
                    z9 = z10 ? 1 : 0;
                    str8 = str5;
                    str9 = str6;
                }
                boolean z11 = z9;
                z10Var = z10Var3;
                str3 = str8;
                str4 = str9;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                z4 = z11;
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                    z4 = z11;
                }
            } else {
                ArrayList<String> arrayList10 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it = arrayListT.iterator();
                if (it.hasNext()) {
                    fj.w(it.next());
                    throw null;
                }
                if (!arrayList10.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList10);
                }
                if (arrayListT.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListT.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListT.size() - 1);
                    if (1 < arrayListT.size()) {
                        fj.w(arrayListT.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                }
                j = jNextLong;
                z4 = z8 ? 1 : 0;
                z10Var = z10Var3;
                str3 = str8;
                str4 = str9;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.p) {
                x20 x20Var7 = b36.s;
                J(21, x20Var7, j, z4 ? 1 : 0);
                L(x20Var7);
                return x20Var7;
            }
            if (TextUtils.isEmpty(z10Var.y().y.optString("packageName"))) {
                z5 = false;
            } else {
                bundle.putString("skuPackageName", z10Var.y().y.optString("packageName"));
                z5 = true;
            }
            string = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                i06.j("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.l.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.h && !a06VarA.isEmpty()) {
                i2 = 17;
            } else if (this.u && z5) {
                i2 = 15;
            } else {
                i2 = this.b ? 9 : 6;
            }
            final int i7 = i2;
            final String str12 = str3;
            final String str13 = str4;
            futureL = l(new Callable(i7, str12, str13, c20Var, bundle) { // from class: vw5
                public final /* synthetic */ String n;
                public final /* synthetic */ String r;
                public final /* synthetic */ Bundle v;
                public final /* synthetic */ int y;

                {
                    this.v = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleR;
                    kx5 kx5Var;
                    o00 o00Var = this.g;
                    int i8 = this.y;
                    String str14 = this.r;
                    String str15 = this.n;
                    Bundle bundle2 = this.v;
                    try {
                        synchronized (o00Var.g) {
                            kx5Var = o00Var.t;
                        }
                        if (kx5Var == null) {
                            return i06.r(b36.a, 107);
                        }
                        return ((gx5) kx5Var).t(i8, o00Var.l.getPackageName(), str14, str15, bundle2);
                    } catch (DeadObjectException e) {
                        x20 x20Var8 = b36.a;
                        String strG = m26.g(e);
                        bundleR = i06.r(x20Var8, 5);
                        if (strG != null) {
                            bundleR.putString("ADDITIONAL_LOG_DETAILS", strG);
                        }
                        return bundleR;
                    } catch (Exception e2) {
                        x20 x20Var9 = b36.j;
                        String strG2 = m26.g(e2);
                        bundleR = i06.r(x20Var9, 5);
                        if (strG2 != null) {
                            bundleR.putString("ADDITIONAL_LOG_DETAILS", strG2);
                        }
                        return bundleR;
                    }
                }
            }, 5000L, null, this.v, x());
            str = str13;
            r6 = bundle;
            z2 = z4;
        } else {
            j = jNextLong;
            z2 = z;
            String str14 = str9;
            string = null;
            futureL = l(new yw5(this, str8, str14, (byte) 0), 5000L, null, this.v, x());
            str = str14;
            r6 = z;
        }
        try {
            if (futureL == null) {
                try {
                    x20 x20Var8 = b36.r;
                    J(25, x20Var8, j, z2);
                    L(x20Var8);
                    return x20Var8;
                } catch (CancellationException e) {
                    e = e;
                    r5 = j;
                    r8 = z2;
                    i06.t("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    x20 x20Var9 = b36.m;
                    K(4, x20Var9, m26.g(e), r5, r8);
                    L(x20Var9);
                    return x20Var9;
                } catch (TimeoutException e2) {
                    e = e2;
                    r5 = j;
                    r8 = z2;
                    i06.t("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    x20 x20Var10 = b36.m;
                    K(4, x20Var10, m26.g(e), r5, r8);
                    L(x20Var10);
                    return x20Var10;
                } catch (Exception e3) {
                    e = e3;
                    r4 = j;
                    r7 = z2;
                    i06.t("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    x20 x20Var11 = b36.a;
                    K(5, x20Var11, m26.g(e), r4, r7);
                    L(x20Var11);
                    return x20Var11;
                }
            }
            long j2 = j;
            boolean z12 = z2;
            Bundle bundle2 = (Bundle) futureL.get(5000L, TimeUnit.MILLISECONDS);
            int iG2 = i06.g("BillingClient", bundle2);
            String strX = i06.x("BillingClient", bundle2);
            if (iG2 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j2);
                intent2.putExtra("wasServiceAutoReconnected", z12);
                activity.startActivity(intent2);
                return b36.t;
            }
            i06.j("BillingClient", "Unable to buy item, Error response code: " + iG2);
            x20 x20VarG = b36.g(strX, iG2);
            if (bundle2 == null) {
                i = 1;
                iG = 1;
            } else {
                try {
                    Object obj2 = bundle2.get("LOG_REASON");
                    if (obj2 != null) {
                        if (obj2 instanceof Integer) {
                            iG = xi3.g(((Integer) obj2).intValue());
                            i = 1;
                        } else {
                            i06.j("BillingClient", "Unexpected type for bundle log reason: " + obj2.getClass().getName());
                        }
                    }
                } catch (Throwable th2) {
                    i06.j("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                i = 1;
                iG = 1;
            }
            if (iG == i) {
                iG = 23;
            }
            if (bundle2 != null) {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th3) {
                    i06.j("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                }
            }
            try {
                K(iG, x20VarG, string, j2, z12);
                L(x20VarG);
                return x20VarG;
            } catch (CancellationException e4) {
                e = e4;
                r5 = j2;
                r8 = z12 ? 1 : 0;
                i06.t("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                x20 x20Var12 = b36.m;
                K(4, x20Var12, m26.g(e), r5, r8);
                L(x20Var12);
                return x20Var12;
            } catch (TimeoutException e5) {
                e = e5;
                r5 = j2;
                r8 = z12 ? 1 : 0;
                i06.t("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                x20 x20Var13 = b36.m;
                K(4, x20Var13, m26.g(e), r5, r8);
                L(x20Var13);
                return x20Var13;
            } catch (Exception e6) {
                e = e6;
                r4 = j2;
                r7 = z12 ? 1 : 0;
                i06.t("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                x20 x20Var14 = b36.a;
                K(5, x20Var14, m26.g(e), r4, r7);
                L(x20Var14);
                return x20Var14;
            }
        } catch (CancellationException e7) {
            e = e7;
            r5 = str;
            r8 = r6;
        } catch (TimeoutException e8) {
            e = e8;
            r5 = str;
            r8 = r6;
        } catch (Exception e9) {
            e = e9;
            r4 = str;
            r7 = r6;
        }
    }

    public final x20 s(int i) {
        i06.l("BillingClient", "Service connection is valid. No need to re-initialize.");
        pb6 pb6VarP = yb6.p();
        pb6VarP.y();
        yb6.s((yb6) pb6VarP.t, 6);
        je6 je6VarS = me6.s();
        je6VarS.y();
        me6.o((me6) je6VarS.t);
        je6VarS.r(i > 0);
        je6VarS.n(i);
        pb6VarP.y();
        yb6.f((yb6) pb6VarP.t, (me6) je6VarS.g());
        o((yb6) pb6VarP.g());
        return b36.t;
    }

    public final a36 u(int i) {
        if (!this.D || C()) {
            i06.l("BillingClient", "Already connected or not opted into auto reconnection.");
            return new v26(b36.t);
        }
        si6 si6Var = new si6();
        si6Var.r = new mj6();
        ij6 ij6Var = new ij6(si6Var);
        si6Var.y = ij6Var;
        si6Var.g = pw5.class;
        try {
            d(new wh4(this, si6Var), i);
            si6Var.g = "reconnectIfNeeded";
            return ij6Var;
        } catch (Exception e) {
            ij6Var.r(e);
            return ij6Var;
        }
    }

    public void v(w10 w10Var) {
        d(w10Var, 0);
    }

    public final synchronized ExecutorService x() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.G;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i06.g, new gc3(this));
            this.G = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    public void y(h3 h3Var, fa4 fa4Var) {
        if (l(new yw5(this, fa4Var, h3Var, (byte) 2), 30000L, new ks0(this, fa4Var, h3Var, (byte) 10), i(), x()) == null) {
            x20 x20VarP = p();
            G(25, 4, x20VarP);
            fa4Var.I(x20VarP, h3Var.g());
        }
    }

    public final void z(int i, int i2, Exception exc) {
        mb6 mb6Var;
        i06.t("BillingClient", "showInAppMessages error.", exc);
        String strG = m26.g(exc);
        try {
            ac6 ac6VarP = fc6.p();
            ac6VarP.n(i);
            if (i2 != 0) {
                ac6VarP.r(i2);
            }
            if (strG != null) {
                ac6VarP.y();
                fc6.u((fc6) ac6VarP.t, strG);
            }
            kb6 kb6VarZ = mb6.z();
            kb6VarZ.r(ac6VarP);
            kb6VarZ.v(30);
            mb6Var = (mb6) kb6VarZ.g();
        } catch (Throwable th) {
            i06.t("BillingLogger", "Unable to create logging payload", th);
            mb6Var = null;
        }
        this.j.t(mb6Var);
    }

    public o00(hi0 hi0Var, Context context, n00 n00Var) {
        long jNextLong = new Random().nextLong();
        this.H = Long.valueOf(jNextLong);
        this.I = xy5.g;
        this.r = "8.3.0";
        String strT = t();
        this.n = strT;
        this.l = context.getApplicationContext();
        tc6 tc6VarA = wc6.A();
        tc6VarA.y();
        wc6.d((wc6) tc6VarA.t);
        if (strT != null) {
            tc6VarA.y();
            wc6.e((wc6) tc6VarA.t, strT);
        }
        String packageName = this.l.getPackageName();
        tc6VarA.y();
        wc6.p((wc6) tc6VarA.t, packageName);
        tc6VarA.y();
        wc6.E((wc6) tc6VarA.t, jNextLong);
        boolean z = n00Var.n;
        tc6VarA.y();
        wc6.k((wc6) tc6VarA.t, z);
        int i = Build.VERSION.SDK_INT;
        tc6VarA.y();
        wc6.B((wc6) tc6VarA.t, i);
        tc6VarA.r();
        D(tc6VarA, context);
        try {
            int i2 = this.l.getPackageManager().getPackageInfo(this.l.getPackageName(), 0).versionCode;
            tc6VarA.y();
            wc6.C((wc6) tc6VarA.t, i2);
        } catch (Throwable th) {
            i06.t("BillingClient", "Error getting app version code.", th);
        }
        this.j = new wh4(this.l, (wc6) tc6VarA.g());
        i06.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.x = new oo3(this.l, (w10) null, this.j);
        this.C = hi0Var;
        this.l.getPackageName();
        this.D = n00Var.n;
    }
}
