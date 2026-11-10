package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b06 implements ServiceConnection {
    public final p00 g;
    public final int n;
    public final kz5 r;
    public final /* synthetic */ o00 v;
    public final kz5 y;

    public b06(o00 o00Var, p00 p00Var, int i) {
        this.v = o00Var;
        lr2 lr2Var = o00Var.I;
        this.y = new kz5(lr2Var);
        this.r = new kz5(lr2Var);
        this.g = p00Var;
        this.n = i;
    }

    public final Long g(boolean z) {
        Object obj = this.v.g;
        try {
            if (z) {
                synchronized (obj) {
                    try {
                        kz5 kz5Var = this.y;
                        if (!kz5Var.y) {
                            return null;
                        }
                        long J = kz5Var.g.J();
                        if (!kz5Var.y) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        kz5Var.y = false;
                        long j = (J - kz5Var.n) + kz5Var.r;
                        kz5Var.r = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    kz5 kz5Var2 = this.r;
                    if (!kz5Var2.y) {
                        return null;
                    }
                    long J2 = kz5Var2.g.J();
                    if (!kz5Var2.y) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    kz5Var2.y = false;
                    long j2 = (J2 - kz5Var2.n) + kz5Var2.r;
                    kz5Var2.r = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            i06.t("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
        i06.t("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        i06.j("BillingClient", "Billing service died.");
        try {
            o00 o00Var = this.v;
            synchronized (o00Var.g) {
                z = true;
                z2 = o00Var.y == 1;
            }
            wh4 wh4Var = o00Var.j;
            if (z2) {
                kb6 kb6VarZ = mb6.z();
                kb6VarZ.v(6);
                ac6 ac6VarP = fc6.p();
                ac6VarP.r(110);
                kb6VarZ.r(ac6VarP);
                je6 je6VarS = me6.s();
                int i = this.n;
                if (i <= 0) {
                    z = false;
                }
                je6VarS.r(z);
                je6VarS.n(i);
                kb6VarZ.n(je6VarS);
                wh4Var.t((mb6) kb6VarZ.g());
            } else {
                wh4Var.c(jc6.p());
            }
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
        o00 o00Var2 = this.v;
        synchronized (o00Var2.g) {
            if (o00Var2.y != 3 && o00Var2.y != 0) {
                o00Var2.k(0);
                o00Var2.e();
                try {
                    this.g.r();
                } catch (Throwable th2) {
                    i06.t("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        kx5 gx5Var;
        i06.l("BillingClient", "Billing service connected.");
        o00 o00Var = this.v;
        synchronized (o00Var.g) {
            try {
                if (o00Var.y == 3) {
                    return;
                }
                int i = hx5.r;
                if (iBinder == null) {
                    gx5Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    gx5Var = iInterfaceQueryLocalInterface instanceof kx5 ? (kx5) iInterfaceQueryLocalInterface : new gx5(iBinder, "com.android.vending.billing.IInAppBillingService");
                }
                o00Var.t = gx5Var;
                if (o00.l(new Callable() { // from class: wz5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        kx5 kx5Var;
                        int i2;
                        int i3;
                        b06 b06Var = this.g;
                        o00 o00Var2 = b06Var.v;
                        synchronized (o00Var2.g) {
                            try {
                                if (o00Var2.y == 3) {
                                    return null;
                                }
                                boolean z = true;
                                boolean z2 = o00Var2.y == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    i06.y(bundle, o00Var2.r, o00Var2.n, o00Var2.H.longValue());
                                }
                                synchronized (o00Var2.g) {
                                    kx5Var = o00Var2.t;
                                }
                                o00 o00Var3 = b06Var.v;
                                if (kx5Var == null) {
                                    o00Var3.k(0);
                                    int i4 = b06Var.n;
                                    x20 x20Var = b36.a;
                                    o00Var3.f(107, i4, x20Var);
                                    b06Var.r(x20Var);
                                    return null;
                                }
                                String packageName = o00Var3.l.getPackageName();
                                int iV = 3;
                                int i5 = 27;
                                while (true) {
                                    if (i5 < 3) {
                                        i5 = 0;
                                        break;
                                    }
                                    try {
                                        i06.l("BillingClient", "trying subs apiVersion: " + i5);
                                        if (bundle == null) {
                                            gx5 gx5Var2 = (gx5) kx5Var;
                                            Parcel parcelG = gx5Var2.g();
                                            parcelG.writeInt(i5);
                                            parcelG.writeString(packageName);
                                            parcelG.writeString("subs");
                                            Parcel parcelY = gx5Var2.y(parcelG, 1);
                                            int i6 = parcelY.readInt();
                                            parcelY.recycle();
                                            iV = i6;
                                        } else {
                                            iV = ((gx5) kx5Var).v(i5, packageName, "subs", bundle);
                                        }
                                        if (iV == 0) {
                                            i06.l("BillingClient", "highestLevelSupportedForSubs: " + i5);
                                            break;
                                        }
                                        i5--;
                                    } catch (Exception e) {
                                        i06.t("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        boolean z3 = e instanceof DeadObjectException;
                                        if (z3) {
                                            i2 = 91;
                                        } else if (e instanceof RemoteException) {
                                            i2 = 90;
                                        } else {
                                            i2 = e instanceof SecurityException ? 92 : 42;
                                        }
                                        String strG = du4.g(i2, 42) ? m26.g(e) : null;
                                        b06Var.v.k(0);
                                        b06Var.y(z3 ? b36.a : b36.j, i2, strG, z2);
                                        b06Var.r(z3 ? b36.a : b36.j);
                                    }
                                }
                                o00Var3.q = i5 >= 5;
                                o00Var3.m = i5 >= 3;
                                if (i5 < 3) {
                                    i06.l("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i3 = 9;
                                } else {
                                    i3 = 1;
                                }
                                for (int i7 = 27; i7 >= 3; i7--) {
                                    i06.l("BillingClient", "trying inapp apiVersion: " + i7);
                                    if (bundle == null) {
                                        gx5 gx5Var3 = (gx5) kx5Var;
                                        Parcel parcelG2 = gx5Var3.g();
                                        parcelG2.writeInt(i7);
                                        parcelG2.writeString(packageName);
                                        parcelG2.writeString("inapp");
                                        Parcel parcelY2 = gx5Var3.y(parcelG2, 1);
                                        int i8 = parcelY2.readInt();
                                        parcelY2.recycle();
                                        iV = i8;
                                    } else {
                                        iV = ((gx5) kx5Var).v(i7, packageName, "inapp", bundle);
                                    }
                                    if (iV == 0) {
                                        o00Var3.w = i7;
                                        i06.l("BillingClient", "mHighestLevelSupportedForInApp: " + i7);
                                        break;
                                    }
                                }
                                o00.w(o00Var3, o00Var3.w);
                                if (o00Var3.w < 3) {
                                    i06.j("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i3 = 36;
                                }
                                o00.c(o00Var3, iV);
                                if (iV != 0) {
                                    x20 x20Var2 = b36.y;
                                    b06Var.y(x20Var2, i3, null, z2);
                                    b06Var.r(x20Var2);
                                    return null;
                                }
                                try {
                                    Long lG = b06Var.g(z2);
                                    if (z2) {
                                        pb6 pb6VarP = yb6.p();
                                        pb6VarP.y();
                                        yb6.s((yb6) pb6VarP.t, 6);
                                        je6 je6VarS = me6.s();
                                        int i9 = b06Var.n;
                                        if (i9 <= 0) {
                                            z = false;
                                        }
                                        je6VarS.r(z);
                                        je6VarS.n(i9);
                                        je6VarS.y();
                                        me6.h((me6) je6VarS.t);
                                        if (lG != null) {
                                            long jLongValue = lG.longValue();
                                            je6VarS.y();
                                            me6.z((me6) je6VarS.t, jLongValue);
                                        }
                                        o00 o00Var4 = b06Var.v;
                                        pb6VarP.y();
                                        yb6.f((yb6) pb6VarP.t, (me6) je6VarS.g());
                                        o00Var4.o((yb6) pb6VarP.g());
                                    } else {
                                        zd6 zd6VarS = ce6.s();
                                        ac6 ac6VarP = fc6.p();
                                        ac6VarP.n(0);
                                        ac6VarP.y();
                                        fc6.h((fc6) ac6VarP.t);
                                        zd6VarS.r(ac6VarP);
                                        if (lG != null) {
                                            zd6VarS.n(lG.longValue());
                                        }
                                        b06Var.v.j.i((ce6) zd6VarS.g());
                                    }
                                } catch (Throwable th) {
                                    i06.t("BillingClient", "Unable to log.", th);
                                }
                                b06Var.r(b36.t);
                                return null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }, 30000L, new y9(this, (byte) 6), o00Var.i(), o00Var.x()) == null) {
                    int i2 = this.n;
                    x20 x20VarP = o00Var.p();
                    o00Var.f(25, i2, x20VarP);
                    r(x20VarP);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        i06.j("BillingClient", "Billing service disconnected.");
        try {
            o00 o00Var = this.v;
            synchronized (o00Var.g) {
                z = true;
                z2 = o00Var.y == 1;
            }
            wh4 wh4Var = o00Var.j;
            if (z2) {
                kb6 kb6VarZ = mb6.z();
                kb6VarZ.v(6);
                ac6 ac6VarP = fc6.p();
                ac6VarP.r(109);
                kb6VarZ.r(ac6VarP);
                je6 je6VarS = me6.s();
                int i = this.n;
                if (i <= 0) {
                    z = false;
                }
                je6VarS.r(z);
                je6VarS.n(i);
                kb6VarZ.n(je6VarS);
                wh4Var.t((mb6) kb6VarZ.g());
            } else {
                wh4Var.b(he6.p());
            }
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
        o00 o00Var2 = this.v;
        synchronized (o00Var2.g) {
            try {
                kz5 kz5Var = this.r;
                kz5Var.r = 0L;
                kz5Var.y = false;
                kz5Var.g();
                if (o00Var2.y == 3) {
                    return;
                }
                o00Var2.k(0);
                try {
                    this.g.r();
                } catch (Throwable th2) {
                    i06.t("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r(x20 x20Var) {
        o00 o00Var = this.v;
        synchronized (o00Var.g) {
            try {
                if (o00Var.y == 3) {
                    return;
                }
                try {
                    this.g.g(x20Var);
                } catch (Throwable th) {
                    i06.t("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(x20 x20Var, int i, String str, boolean z) {
        try {
            ac6 ac6VarP = fc6.p();
            ac6VarP.n(x20Var.g);
            String str2 = x20Var.r;
            ac6VarP.y();
            fc6.z((fc6) ac6VarP.t, str2);
            ac6VarP.r(i);
            ac6VarP.y();
            fc6.h((fc6) ac6VarP.t);
            if (str != null) {
                ac6VarP.y();
                fc6.u((fc6) ac6VarP.t, str);
            }
            Long lG = g(z);
            o00 o00Var = this.v;
            if (!z) {
                zd6 zd6VarS = ce6.s();
                zd6VarS.r(ac6VarP);
                if (lG != null) {
                    zd6VarS.n(lG.longValue());
                }
                o00Var.j.i((ce6) zd6VarS.g());
                return;
            }
            je6 je6VarS = me6.s();
            int i2 = this.n;
            je6VarS.r(i2 > 0);
            je6VarS.n(i2);
            je6VarS.y();
            me6.h((me6) je6VarS.t);
            if (lG != null) {
                long jLongValue = lG.longValue();
                je6VarS.y();
                me6.z((me6) je6VarS.t, jLongValue);
            }
            kb6 kb6VarZ = mb6.z();
            kb6VarZ.r(ac6VarP);
            kb6VarZ.v(6);
            kb6VarZ.n(je6VarS);
            o00Var.h((mb6) kb6VarZ.g());
        } catch (Throwable th) {
            i06.t("BillingClient", "Unable to log.", th);
        }
    }
}
