package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.b20;
import defpackage.bw5;
import defpackage.f92;
import defpackage.fa4;
import defpackage.fw5;
import defpackage.gv5;
import defpackage.ha5;
import defpackage.hy;
import defpackage.j46;
import defpackage.j76;
import defpackage.jr2;
import defpackage.jw5;
import defpackage.kq0;
import defpackage.l0;
import defpackage.l32;
import defpackage.lu5;
import defpackage.ly5;
import defpackage.m32;
import defpackage.n32;
import defpackage.o32;
import defpackage.p12;
import defpackage.p26;
import defpackage.rr;
import defpackage.s25;
import defpackage.t94;
import defpackage.tb6;
import defpackage.tn1;
import defpackage.ug6;
import defpackage.w56;
import defpackage.yi6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final tn1[] d = new tn1[0];
    public IInterface a;
    public final short b;
    public final s25 c;
    public final AtomicInteger f;
    public volatile String g;
    public boolean h;
    public final ha5 i;
    public jw5 j;
    public final Set k;
    public final Object l;
    public final ArrayList m;
    public final yi6 n;
    public volatile tb6 o;
    public volatile String p;
    public j46 q;
    public final Context r;
    public final String s;
    public hy t;
    public volatile fa4 u;
    public final ly5 v;
    public byte w;
    public final Object x;
    public b20 y;
    public kq0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, Looper looper, int i, rr rrVar, n32 n32Var, o32 o32Var) {
        yi6 yi6Var;
        synchronized (yi6.l) {
            try {
                yi6Var = yi6.j;
                if (yi6Var == null) {
                    yi6Var = new yi6(context.getApplicationContext(), context.getMainLooper());
                    yi6.j = yi6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object obj = l32.n;
        jr2.m(n32Var);
        jr2.m(o32Var);
        s25 s25Var = new s25(n32Var);
        ha5 ha5Var = new ha5((Object) o32Var, (byte) 4);
        String str = (String) rrVar.v;
        this.g = null;
        this.x = new Object();
        this.l = new Object();
        this.m = new ArrayList();
        this.w = (byte) 1;
        this.z = null;
        this.h = false;
        this.o = null;
        this.f = new AtomicInteger(0);
        jr2.q(context, "Context must not be null");
        this.r = context;
        jr2.q(looper, "Looper must not be null");
        this.n = yi6Var;
        this.v = new ly5(this, looper);
        this.b = i;
        this.c = s25Var;
        this.i = ha5Var;
        this.s = str;
        Set set = (Set) rrVar.n;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                l0.z("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.k = set;
    }

    public String a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, IInterface iInterface) {
        b20 b20Var;
        if ((i == 4) != (iInterface != null)) {
            t94.g();
            return;
        }
        synchronized (this.x) {
            try {
                this.w = i;
                this.a = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    j46 j46Var = this.q;
                    if (j46Var != null) {
                        yi6 yi6Var = this.n;
                        String str = (String) this.y.g;
                        jr2.m(str);
                        this.y.getClass();
                        if (this.s == null) {
                            this.r.getClass();
                        }
                        yi6Var.y(str, j46Var, this.y.y);
                        this.q = null;
                    }
                } else if (i == 2 || i == 3) {
                    j46 j46Var2 = this.q;
                    if (j46Var2 != null && (b20Var = this.y) != null) {
                        String str2 = (String) b20Var.g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        yi6 yi6Var2 = this.n;
                        String str3 = (String) this.y.g;
                        jr2.m(str3);
                        this.y.getClass();
                        if (this.s == null) {
                            this.r.getClass();
                        }
                        yi6Var2.y(str3, j46Var2, this.y.y);
                        this.f.incrementAndGet();
                    }
                    j46 j46Var3 = new j46(this, this.f.get());
                    this.q = j46Var3;
                    String strA = a();
                    boolean zM = m();
                    this.y = new b20((Object) strA, zM);
                    if (zM && x() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.y.g)));
                    }
                    yi6 yi6Var3 = this.n;
                    String str4 = (String) this.y.g;
                    jr2.m(str4);
                    this.y.getClass();
                    String name = this.s;
                    if (name == null) {
                        name = this.r.getClass().getName();
                    }
                    kq0 kq0VarG = yi6Var3.g(new ug6(str4, this.y.y), j46Var3, name);
                    if (!(kq0VarG.t == 0)) {
                        String str5 = (String) this.y.g;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = kq0VarG.t;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (kq0VarG.a != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", kq0VarG.a);
                        }
                        int i3 = this.f.get();
                        j76 j76Var = new j76(this, i2, bundle);
                        ly5 ly5Var = this.v;
                        ly5Var.sendMessage(ly5Var.obtainMessage(7, i3, -1, j76Var));
                    }
                } else if (i == 4) {
                    jr2.m(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        return false;
    }

    public IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof gv5 ? (gv5) iInterfaceQueryLocalInterface : new gv5(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 0);
    }

    public final /* synthetic */ boolean i(int i, int i2, IInterface iInterface) {
        synchronized (this.x) {
            try {
                if (this.w != i) {
                    return false;
                }
                b(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IInterface j() {
        IInterface iInterface;
        synchronized (this.x) {
            try {
                if (this.w == 5) {
                    throw new DeadObjectException();
                }
                if (!q()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.a;
                jr2.q(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(f92 f92Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleV = v();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.u == null || (attributionSource = (AttributionSource) this.u.t) == null || attributionSource.getAttributionTag() == null) ? this.p : attributionSource.getAttributionTag();
        String str = attributionTag;
        short s = this.b;
        int i = m32.g;
        Scope[] scopeArr = p12.o;
        Bundle bundle = new Bundle();
        tn1[] tn1VarArr = p12.f;
        p12 p12Var = new p12(6, s, i, null, null, scopeArr, bundle, null, tn1VarArr, tn1VarArr, true, 0, false, str);
        p12Var.m = this.r.getPackageName();
        p12Var.c = bundleV;
        if (set != null) {
            p12Var.w = (Scope[]) set.toArray(new Scope[0]);
        }
        if (c()) {
            p12Var.i = new Account("<<default account>>", "com.google");
            if (f92Var != 0) {
                p12Var.q = ((lu5) f92Var).n;
            }
        }
        p12Var.b = d;
        p12Var.s = n();
        if (this instanceof bw5) {
            p12Var.z = true;
        }
        try {
            synchronized (this.l) {
                try {
                    jw5 jw5Var = this.j;
                    if (jw5Var != null) {
                        jw5Var.g(new p26(this, this.f.get()), p12Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.f.get();
            ly5 ly5Var = this.v;
            ly5Var.sendMessage(ly5Var.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.f.get();
            w56 w56Var = new w56(this, 8, null, null);
            ly5 ly5Var2 = this.v;
            ly5Var2.sendMessage(ly5Var2.obtainMessage(1, i3, -1, w56Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.f.get();
            w56 w56Var2 = new w56(this, 8, null, null);
            ly5 ly5Var3 = this.v;
            ly5Var3.sendMessage(ly5Var3.obtainMessage(1, i4, -1, w56Var2));
        }
    }

    public boolean m() {
        return x() >= 211700000;
    }

    public tn1[] n() {
        return d;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.x) {
            z = this.w == 4;
        }
        return z;
    }

    public final void r(String str) {
        this.g = str;
        y();
    }

    public String t() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public Bundle v() {
        return new Bundle();
    }

    public final boolean w() {
        boolean z;
        synchronized (this.x) {
            byte b = this.w;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public int x() {
        return 12451000;
    }

    public final void y() {
        this.f.incrementAndGet();
        ArrayList arrayList = this.m;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    fw5 fw5Var = (fw5) arrayList.get(i);
                    synchronized (fw5Var) {
                        fw5Var.g = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.l) {
            this.j = null;
        }
        b(1, null);
    }
}
