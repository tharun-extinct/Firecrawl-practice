package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class j26 extends o00 {
    public final Context J;
    public volatile byte K;
    public volatile gy5 L;
    public volatile at5 M;
    public volatile ScheduledExecutorService N;

    public j26(hi0 hi0Var, Context context, n00 n00Var) {
        super(hi0Var, context, n00Var);
        this.K = (byte) 0;
        this.J = context;
    }

    public final synchronized boolean M() {
        return (this.K != 2 || this.L == null || this.M == null) ? false : true;
    }

    public final a36 N(int i) {
        if (!M()) {
            i06.j("BillingClientTesting", "Billing Override Service is not ready.");
            O(94, 28, b36.g("Billing Override Service connection is disconnected.", -1));
            return new v26(0);
        }
        u16 u16Var = new u16(i, this);
        si6 si6Var = new si6();
        si6Var.r = new mj6();
        ij6 ij6Var = new ij6(si6Var);
        si6Var.y = ij6Var;
        si6Var.g = u16.class;
        try {
            u16Var.g(si6Var);
            si6Var.g = "billingOverrideService.getBillingOverride";
            return ij6Var;
        } catch (Exception e) {
            ij6Var.r(e);
            return ij6Var;
        }
    }

    public final void O(int i, int i2, x20 x20Var) {
        int i3 = m26.g;
        mb6 mb6VarY = m26.y(i, i2, x20Var, null, mc6.t);
        Objects.requireNonNull(mb6VarY, "ApiFailure should not be null");
        this.j.t(mb6VarY);
    }

    public final void P(int i, et0 et0Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        a36 a36VarN = N(i);
        synchronized (this) {
            try {
                if (this.N == null) {
                    this.N = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.N;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!a36VarN.isDone()) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            h36 h36Var = new h36();
            h36Var.i = a36VarN;
            ml mlVar = new ml();
            mlVar.t = h36Var;
            h36Var.b = scheduledExecutorService.schedule(mlVar, 28500L, timeUnit);
            a36VarN.y(mlVar, b26.j);
            a36VarN = h36Var;
        }
        c26 c26Var = new c26(this, i, et0Var, runnable);
        a36VarN.y(new i26((Object) a36VarN, (Object) c26Var, (byte) 0), x());
    }

    @Override // defpackage.o00
    public final void g(h3 h3Var, v92 v92Var) {
        P(3, new bv1(v92Var, (byte) 3), new ks0(this, h3Var, v92Var, (byte) 13));
    }

    @Override // defpackage.o00
    public final void n(jy3 jy3Var, q64 q64Var) {
        P(7, new bv1(q64Var, (byte) 2), new ks0(this, jy3Var, q64Var, (byte) 11));
    }

    @Override // defpackage.o00
    public final x20 r(Activity activity, c20 c20Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) N(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            O(102, 28, b36.E);
            i06.t("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            O(95, 28, b36.E);
            i06.t("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            x20 x20VarG = b36.g("Billing override value was set by a license tester.", iIntValue);
            O(93, 2, x20VarG);
            L(x20VarG);
            return x20VarG;
        }
        try {
            return super.r(activity, c20Var);
        } catch (Exception e3) {
            x20 x20Var = b36.j;
            O(103, 2, x20Var);
            i06.t("BillingClientTesting", "An internal error occurred.", e3);
            return x20Var;
        }
    }

    @Override // defpackage.o00
    public final void v(w10 w10Var) {
        synchronized (this) {
            try {
                if (M()) {
                    i06.l("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                    int i = m26.g;
                    yb6 yb6VarR = m26.r(26, mc6.t);
                    Objects.requireNonNull(yb6VarR, "ApiSuccess should not be null");
                    wh4 wh4Var = this.j;
                    wh4Var.getClass();
                    try {
                        wh4Var.p(yb6VarR, (wc6) wh4Var.j);
                    } catch (Throwable th) {
                        i06.t("BillingLogger", "Unable to log.", th);
                    }
                } else {
                    byte b = 1;
                    if (this.K == 1) {
                        i06.j("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                    } else if (this.K == 3) {
                        i06.j("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                        O(38, 26, b36.g("Billing Override Service connection is disconnected.", -1));
                    } else {
                        this.K = (byte) 1;
                        i06.l("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.M = new at5(this, b);
                        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                        Context context = this.J;
                        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            b = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                    i06.j("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    if (context.bindService(intent2, this.M, 1)) {
                                        i06.l("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                    } else {
                                        i06.j("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                    }
                                }
                                b = 39;
                            }
                        }
                        this.K = (byte) 0;
                        i06.l("BillingClientTesting", "Billing Override Service unavailable on device.");
                        O(b, 26, b36.g("Billing Override Service unavailable on device.", 2));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d(w10Var, 0);
    }

    @Override // defpackage.o00
    public final void y(final h3 h3Var, final fa4 fa4Var) {
        P(4, new et0() { // from class: h16
            @Override // defpackage.et0
            public final void accept(Object obj) {
                String str = h3Var.g;
                fa4Var.I((x20) obj, str);
            }
        }, new ks0(this, h3Var, fa4Var, (byte) 12));
    }

    public j26(hi0 hi0Var, Context context, w10 w10Var, n00 n00Var) {
        super(hi0Var, context, w10Var, n00Var);
        this.K = (byte) 0;
        this.J = context;
    }
}
