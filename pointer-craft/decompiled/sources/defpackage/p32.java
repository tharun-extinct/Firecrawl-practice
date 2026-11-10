package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class p32 implements Handler.Callback {
    public static p32 p;
    public final ConcurrentHashMap a;
    public volatile boolean c;
    public long g;
    public final AtomicInteger j;
    public final s25 l;
    public final or m;
    public vv5 n;
    public final or q;
    public e35 r;
    public final AtomicInteger t;
    public final Context v;
    public final uv5 w;
    public final l32 x;
    public boolean y;
    public static final Status i = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status b = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object s = new Object();

    public p32(Context context, Looper looper) {
        l32 l32Var = l32.v;
        this.g = 10000L;
        this.y = false;
        this.j = new AtomicInteger(1);
        this.t = new AtomicInteger(0);
        this.a = new ConcurrentHashMap(5, 0.75f, 1);
        this.m = new or(0);
        this.q = new or(0);
        this.c = true;
        this.v = context;
        uv5 uv5Var = new uv5(looper, this);
        Looper.getMainLooper();
        this.w = uv5Var;
        this.x = l32Var;
        this.l = new s25((byte) 7);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = oe6.p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(zc6.y() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            oe6.p = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.c = false;
        }
        uv5Var.sendMessage(uv5Var.obtainMessage(6));
    }

    public static p32 r(Context context) {
        p32 p32Var;
        HandlerThread handlerThread;
        synchronized (s) {
            p32Var = p;
            if (p32Var == null) {
                synchronized (yi6.l) {
                    try {
                        handlerThread = yi6.t;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            yi6.t = handlerThread2;
                            handlerThread2.start();
                            handlerThread = yi6.t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = l32.n;
                p32 p32Var2 = new p32(applicationContext, looper);
                p = p32Var2;
                p32Var = p32Var2;
            }
        }
        return p32Var;
    }

    public static Status y(ck ckVar, kq0 kq0Var) {
        String str = (String) ckVar.y.a;
        String strValueOf = String.valueOf(kq0Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(17, sb.toString(), kq0Var.a, kq0Var);
    }

    public final su5 g(k32 k32Var) {
        ck ckVar = k32Var.x;
        ConcurrentHashMap concurrentHashMap = this.a;
        su5 su5Var = (su5) concurrentHashMap.get(ckVar);
        if (su5Var == null) {
            su5Var = new su5(this, k32Var);
            concurrentHashMap.put(ckVar, su5Var);
        }
        if (su5Var.n.c()) {
            this.q.add(ckVar);
        }
        su5Var.s();
        return su5Var;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x033e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0344  */
    /* JADX WARN: Code duplicated, block: B:172:0x0382  */
    /* JADX WARN: Code duplicated, block: B:174:0x038c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 su5, still in use, count: 2, list:
          (r2v11 su5) from 0x0336: IGET (r2v11 su5) A[WRAPPED] (LINE:823) su5.t int
          (r2v11 su5) from 0x033c: PHI (r2 I:??) = (r2v8 su5), (r2v11 su5) binds: [B:166:0x033b, B:221:0x033c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p32.handleMessage(android.os.Message):boolean");
    }

    public final boolean n() {
        int i2;
        if (this.y) {
            return false;
        }
        ga4 ga4Var = (ga4) fa4.B().t;
        if (ga4Var != null && !ga4Var.t) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.l.j;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(203400000, -1);
        }
        return i2 == -1 || i2 == 0;
    }

    public final boolean v(kq0 kq0Var, int i2) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        l32 l32Var = this.x;
        Context context = this.v;
        l32Var.getClass();
        synchronized (be2.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = be2.g;
            if (context2 == null || (bool = be2.y) == null || context2 != applicationContext) {
                be2.y = null;
                if (zc6.y()) {
                    boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    be2.y = boolValueOf;
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        boolValueOf = Boolean.TRUE;
                        be2.y = boolValueOf;
                    } catch (ClassNotFoundException unused) {
                        boolValueOf = Boolean.FALSE;
                        be2.y = boolValueOf;
                    }
                }
                be2.g = applicationContext;
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i3 = kq0Var.t;
        if (i3 == 0 || (activity = kq0Var.a) == null) {
            Intent intentG = l32Var.g(i3, context, null);
            activity = intentG != null ? PendingIntent.getActivity(context, 0, intentG, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i4 = kq0Var.t;
        int i5 = GoogleApiActivity.t;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        l32Var.x(context, i4, PendingIntent.getActivity(context, 0, intent, sv5.g | 134217728));
        Integer num = kq0Var.q;
        pu5 pu5Var = new pu5(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), kq0Var.t, false);
        vv5 vv5Var = l32Var.r;
        if (vv5Var == null) {
            vv5Var = new vv5(context, vv5.a, pj.g, j32.y);
            l32Var.r = vv5Var;
        }
        w25 w25VarY = w25.y();
        w25VarY.g = new tn1[]{mf6.y};
        w25VarY.y = false;
        w25VarY.n = new ha5((Object) pu5Var, (byte) 5);
        vv5Var.y(2, w25VarY.g());
        return true;
    }

    public final void x(kq0 kq0Var, int i2) {
        if (v(kq0Var, i2)) {
            return;
        }
        uv5 uv5Var = this.w;
        uv5Var.sendMessage(uv5Var.obtainMessage(5, i2, 0, kq0Var));
    }
}
