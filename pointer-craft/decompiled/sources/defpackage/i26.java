package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.internal.g;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class i26 implements Runnable {
    public final Object a;
    public final /* synthetic */ byte j;
    public final Object t;

    public i26(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, Bitmap bitmap, String str) {
        this.j = (byte) 12;
        this.t = bitmap;
        this.a = str;
    }

    private final void g() {
        z56 z56Var = (z56) this.t;
        int i = ((ej6) this.a).g;
        synchronized (z56Var) {
            ej6 ej6Var = (ej6) z56Var.v.get(i);
            if (ej6Var != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                z56Var.v.remove(i);
                ej6Var.g(new bt4("Timed out waiting for response"));
                z56Var.r();
            }
        }
    }

    private final void y() {
        w86 w86Var = (w86) this.a;
        synchronized (w86Var.a) {
            ((hk3) w86Var.m).v(((nj6) this.t).l());
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws ha1 {
        Throwable thN;
        g43 g43Var;
        f92 f92Var;
        f92 fj6Var;
        int i = 0;
        byte b = 1;
        switch (this.j) {
            case 0:
                c26 c26Var = (c26) this.a;
                a36 a36Var = (a36) this.t;
                if ((a36Var instanceof t16) && (thN = ((t16) a36Var).n()) != null) {
                    c26Var.g(thN);
                    return;
                }
                try {
                    if (!a36Var.isDone()) {
                        throw new IllegalStateException(nc6.b("Future was expected to be done: %s", a36Var));
                    }
                    while (true) {
                        try {
                            Object obj = a36Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            j26 j26Var = c26Var.r;
                            if (iIntValue <= 0) {
                                c26Var.y.run();
                                return;
                            }
                            byte b2 = c26Var.n;
                            x20 x20VarG = b36.g("Billing override value was set by a license tester.", num.intValue());
                            j26Var.O(93, b2, x20VarG);
                            c26Var.g.accept(x20VarG);
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    c26Var.g(e.getCause());
                    return;
                } catch (Throwable th2) {
                    c26Var.g(th2);
                    return;
                }
                break;
            case 1:
                w3 w3Var = (w3) this.t;
                z3 z3Var = (z3) this.a;
                i43 i43Var = z3Var.a;
                if (i43Var != null && (g43Var = i43Var.v) != null) {
                    g43Var.z(i43Var);
                }
                View view = (View) z3Var.w;
                if (view != null && view.getWindowToken() != null) {
                    if (w3Var.y()) {
                        z3Var.k = w3Var;
                    } else if (w3Var.x != null) {
                        w3Var.n(0, 0, false, false);
                        z3Var.k = w3Var;
                    }
                }
                z3Var.e = null;
                return;
            case 2:
                ((o4) this.t).j = this.a;
                return;
            case 3:
                ((Application) this.t).unregisterActivityLifecycleCallbacks((o4) this.a);
                return;
            case 4:
                Object obj2 = this.a;
                Object obj3 = this.t;
                try {
                    Method method = p4.n;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        p4.v.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 5:
                ha5 ha5Var = (ha5) this.t;
                Typeface typeface = (Typeface) this.a;
                jr2 jr2Var = (jr2) ha5Var.t;
                if (jr2Var != null) {
                    jr2Var.D(typeface);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList = (ArrayList) this.t;
                int size = arrayList.size();
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    cs0 cs0Var = (cs0) obj4;
                    Object obj5 = ((ss0) this.a).v;
                    cs0Var.y = obj5;
                    cs0Var.n(cs0Var.n, obj5);
                }
                return;
            case 7:
                synchronized (((ConstraintTrackingWorker) this.a).c) {
                    boolean z = ((ConstraintTrackingWorker) this.a).i;
                    ol4 ol4Var = ((ConstraintTrackingWorker) this.a).b;
                    if (z) {
                        ol4Var.a(new xw2());
                    } else {
                        ol4Var.q((vw2) this.t);
                    }
                    break;
                }
                return;
            case 8:
                iy2 iy2VarR = iy2.r();
                String str = n41.n;
                sr5 sr5Var = (sr5) this.t;
                iy2VarR.g(str, xi3.t("Scheduling work ", sr5Var.g), new Throwable[0]);
                ((n41) this.a).g.n(sr5Var);
                return;
            case 9:
                tg2 tg2Var = (tg2) this.t;
                n54 n54Var = tg2Var.v;
                wg2 wg2Var = (wg2) this.a;
                RecyclerView recyclerView = wg2Var.p;
                if (recyclerView == null || !recyclerView.e || tg2Var.m || n54Var.y() == -1) {
                    return;
                }
                v44 itemAnimator = wg2Var.p.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.x()) {
                    ArrayList arrayList2 = wg2Var.b;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        if (((tg2) arrayList2.get(i)).q) {
                            i++;
                        }
                    }
                    n54Var.getClass();
                    return;
                }
                wg2Var.p.post(this);
                return;
            case 10:
                ((bv1) this.t).accept(this.a);
                return;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((ib0) this.a).E((bm1) this.t);
                return;
            case 12:
                Bitmap bitmap = (Bitmap) this.t;
                String str2 = (String) this.a;
                if (TextUtils.isEmpty(str2)) {
                    l0.u("path is empty");
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                    try {
                        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                            fileOutputStream.close();
                            return;
                        }
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException("Unable to compress bitmap for saving " + str2);
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e3) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e3);
                    uo1.w(xi3.t("Unable to write bitmap to file ", str2), e3);
                    return;
                }
            case 13:
                el5 el5Var = ((SwipeDismissBehavior) this.a).g;
                if (el5Var == null || !el5Var.x()) {
                    return;
                }
                ((View) this.t).postOnAnimation(this);
                return;
            case 14:
                vw2 vw2Var = (vw2) this.t;
                boolean zIsCancelled = vw2Var.isCancelled();
                ib0 ib0Var = (ib0) this.a;
                if (zIsCancelled) {
                    ib0Var.s(null);
                    return;
                }
                try {
                    ib0Var.j(h1.j(vw2Var));
                    return;
                } catch (ExecutionException e4) {
                    Throwable cause = e4.getCause();
                    if (cause != null) {
                        ib0Var.j(new g84(cause));
                        return;
                    } else {
                        fk2 fk2Var = new fk2();
                        yf2.X(fk2Var, yf2.class.getName());
                        throw fk2Var;
                    }
                }
            case kq2.x /* 15 */:
                kq0 kq0Var = (kq0) this.t;
                c20 c20Var = (c20) this.a;
                p32 p32Var = (p32) c20Var.w;
                g gVar = (g) c20Var.t;
                su5 su5Var = (su5) p32Var.a.get((ck) c20Var.a);
                if (su5Var == null) {
                    return;
                }
                if (kq0Var.t != 0) {
                    su5Var.c(kq0Var, null);
                    return;
                }
                c20Var.j = true;
                if (gVar.c()) {
                    if (!c20Var.j || (f92Var = (f92) c20Var.m) == null) {
                        return;
                    }
                    gVar.l(f92Var, (Set) c20Var.q);
                    return;
                }
                try {
                    gVar.l(null, gVar.c() ? gVar.k : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e5) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e5);
                    gVar.r("Failed to get service from broker.");
                    su5Var.c(new kq0(10, null, null), null);
                    return;
                }
            case 16:
                cv5 cv5Var = (cv5) this.a;
                tv5 tv5Var = (tv5) this.t;
                kq0 kq0Var2 = tv5Var.t;
                if (kq0Var2.t == 0) {
                    aw5 aw5Var = tv5Var.a;
                    jr2.m(aw5Var);
                    kq0 kq0Var3 = aw5Var.a;
                    if (kq0Var3.t != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(kq0Var3)), new Exception());
                        cv5Var.a.y(kq0Var3);
                        cv5Var.t.y();
                        return;
                    }
                    c20 c20Var2 = cv5Var.a;
                    IBinder iBinder = aw5Var.t;
                    if (iBinder == null) {
                        fj6Var = null;
                    } else {
                        int i2 = f3.n;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        fj6Var = iInterfaceQueryLocalInterface instanceof f92 ? (f92) iInterfaceQueryLocalInterface : new fj6(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 1);
                    }
                    Set set = cv5Var.l;
                    c20Var2.getClass();
                    if (fj6Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c20Var2.y(new kq0(4, null, null));
                    } else {
                        c20Var2.m = fj6Var;
                        c20Var2.q = set;
                        if (c20Var2.j) {
                            ((g) c20Var2.t).l(fj6Var, set);
                        }
                    }
                } else {
                    cv5Var.a.y(kq0Var2);
                }
                cv5Var.t.y();
                return;
            case 17:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.t;
                Set set2 = (Set) this.a;
                while (!set2.isEmpty()) {
                    try {
                        t26 t26Var = (t26) referenceQueue.remove();
                        if (t26Var.g.remove(t26Var)) {
                            t26Var.clear();
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                return;
            case 18:
                o00 o00Var = (o00) this.t;
                v92 v92Var = (v92) this.a;
                x20 x20Var = b36.m;
                o00Var.G(24, 3, x20Var);
                v92Var.M(x20Var);
                return;
            case 19:
                o00 o00Var2 = (o00) this.t;
                x20 x20Var2 = (x20) this.a;
                w10 w10Var = (w10) o00Var2.x.r;
                oo3 oo3Var = o00Var2.x;
                if (w10Var != null) {
                    ((w10) oo3Var.r).u(x20Var2, null);
                    return;
                } else {
                    i06.j("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 20:
                nj6 nj6Var = (nj6) this.t;
                boolean z2 = nj6Var.n;
                r26 r26Var = (r26) this.a;
                if (z2) {
                    r26Var.m.c();
                    return;
                }
                try {
                    ((r26) this.a).m.m(r26Var.a.o(nj6Var));
                    return;
                } catch (sb4 e6) {
                    boolean z3 = e6.getCause() instanceof Exception;
                    r26 r26Var2 = (r26) this.a;
                    if (z3) {
                        r26Var2.m.w((Exception) e6.getCause());
                        return;
                    } else {
                        r26Var2.m.w(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((r26) this.a).m.w(e7);
                    return;
                }
            case 21:
                r26 r26Var3 = (r26) this.a;
                nj6 nj6Var2 = r26Var3.m;
                try {
                    nj6 nj6Var3 = (nj6) r26Var3.a.o((nj6) this.t);
                    if (nj6Var3 == null) {
                        r26Var3.m(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    dp1 dp1Var = y25.y;
                    nj6Var3.n(dp1Var, r26Var3);
                    nj6Var3.r(dp1Var, r26Var3);
                    nj6Var3.y.g(new w86((Executor) dp1Var, (wj3) r26Var3));
                    nj6Var3.i();
                    return;
                } catch (sb4 e8) {
                    if (e8.getCause() instanceof Exception) {
                        nj6Var2.w((Exception) e8.getCause());
                        return;
                    } else {
                        nj6Var2.w(e8);
                        return;
                    }
                } catch (Exception e9) {
                    nj6Var2.w(e9);
                    return;
                }
            case 22:
                Callable callable = (Callable) this.t;
                x25 x25Var = (x25) this.a;
                try {
                    x25Var.y(callable.call());
                    return;
                } catch (g63 e10) {
                    x25Var.g(e10);
                    return;
                } catch (Exception e11) {
                    x25Var.g(new g63(e11));
                    return;
                }
            case 23:
                w86 w86Var = (w86) this.a;
                synchronized (w86Var.a) {
                    ((xj3) w86Var.m).s((nj6) this.t);
                    break;
                }
                return;
            case 24:
                w86 w86Var2 = (w86) this.a;
                synchronized (w86Var2.a) {
                    ak3 ak3Var = (ak3) w86Var2.m;
                    Exception excX = ((nj6) this.t).x();
                    jr2.m(excX);
                    ak3Var.m(excX);
                    break;
                }
                return;
            case 25:
                z56 z56Var = (z56) this.t;
                IBinder iBinder2 = (IBinder) this.a;
                synchronized (z56Var) {
                    if (iBinder2 == null) {
                        z56Var.g("Null service connection");
                    } else {
                        try {
                            z56Var.r = new ia6(iBinder2);
                            z56Var.g = (byte) 2;
                            ((ScheduledExecutorService) z56Var.x.r).execute(new y86(z56Var, b));
                        } catch (RemoteException e12) {
                            z56Var.g(e12.getMessage());
                        }
                    }
                }
                return;
            case 26:
                g();
                return;
            case 27:
                y();
                return;
            default:
                w86 w86Var3 = (w86) this.a;
                nj6 nj6Var4 = (nj6) w86Var3.m;
                try {
                    nj6 nj6VarA = ((vy4) w86Var3.a).a(((nj6) this.t).l());
                    if (nj6VarA == null) {
                        nj6Var4.w(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    dp1 dp1Var2 = y25.y;
                    nj6VarA.n(dp1Var2, w86Var3);
                    nj6VarA.r(dp1Var2, w86Var3);
                    nj6VarA.y.g(new w86((Executor) dp1Var2, (wj3) w86Var3));
                    nj6VarA.i();
                    return;
                } catch (CancellationException unused3) {
                    w86Var3.y();
                    return;
                } catch (sb4 e13) {
                    if (e13.getCause() instanceof Exception) {
                        w86Var3.m((Exception) e13.getCause());
                        return;
                    } else {
                        nj6Var4.w(e13);
                        return;
                    }
                } catch (Exception e14) {
                    nj6Var4.w(e14);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.j) {
            case 0:
                q70 q70Var = new q70(i26.class.getSimpleName());
                c26 c26Var = (c26) this.a;
                cd2 cd2Var = new cd2((byte) 29, false);
                ((cd2) q70Var.m).a = cd2Var;
                q70Var.m = cd2Var;
                cd2Var.t = c26Var;
                return q70Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i26(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    public /* synthetic */ i26(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.a = obj;
        this.t = obj2;
    }

    public i26(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.j = (byte) 13;
        this.a = swipeDismissBehavior;
        this.t = view;
    }

    public i26(wg2 wg2Var, tg2 tg2Var, int i) {
        this.j = (byte) 9;
        this.a = wg2Var;
        this.t = tg2Var;
    }
}
