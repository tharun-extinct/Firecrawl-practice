package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.g;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class ml implements Runnable {
    public final /* synthetic */ byte j;
    public Object t;

    public ml(ou5 ou5Var, c6 c6Var) {
        this.j = (byte) 21;
        Objects.requireNonNull(ou5Var);
        this.t = c6Var;
    }

    private final void g() {
        w86 w86Var = (w86) this.t;
        synchronized (w86Var.a) {
            ((wj3) w86Var.m).y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0393  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int iL;
        ?? r11;
        int iL2;
        u25 u25VarY;
        long jNanoTime;
        z3 z3Var;
        int iG;
        a36 a36Var;
        l16 l16Var;
        ?? r12 = 0;
        r12 = 0;
        r12 = 0;
        switch (this.j) {
            case 0:
                tl tlVar = (tl) this.t;
                tlVar.C.showAtLocation(tlVar.B, 55, 0, 0);
                bm5 bm5Var = tlVar.E;
                if (bm5Var != null) {
                    bm5Var.y();
                }
                if (!tlVar.F || (viewGroup = tlVar.G) == null || !viewGroup.isLaidOut()) {
                    tlVar.B.setAlpha(1.0f);
                    tlVar.B.setVisibility(0);
                    return;
                }
                tlVar.B.setAlpha(0.0f);
                bm5 bm5VarG = xk5.g(tlVar.B);
                bm5VarG.g(1.0f);
                tlVar.E = bm5VarG;
                bm5VarG.n(new ll(this, r12 == true ? (byte) 1 : (byte) 0));
                return;
            case 1:
                uw2 uw2Var = (uw2) this.t;
                ef1 ef1Var = uw2Var.a;
                zt ztVar = uw2Var.j;
                if (uw2Var.h) {
                    if (uw2Var.u) {
                        uw2Var.u = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        ztVar.v = jCurrentAnimationTimeMillis;
                        ztVar.l = -1L;
                        ztVar.x = jCurrentAnimationTimeMillis;
                        ztVar.j = 0.5f;
                    }
                    if ((ztVar.l > 0 && AnimationUtils.currentAnimationTimeMillis() > ztVar.l + ((long) ztVar.t)) || !uw2Var.v()) {
                        uw2Var.h = false;
                        return;
                    }
                    if (uw2Var.z) {
                        uw2Var.z = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        ef1Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (ztVar.x == 0) {
                        t94.v("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fG = ztVar.g(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - ztVar.x;
                    ztVar.x = jCurrentAnimationTimeMillis2;
                    uw2Var.f.scrollListBy((int) (j * ((fG * 4.0f) + ((-4.0f) * fG * fG)) * ztVar.n));
                    WeakHashMap weakHashMap = xk5.g;
                    ef1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                g50 g50Var = (g50) this.t;
                g50Var.y = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) g50Var.v;
                el5 el5Var = bottomSheetBehavior.Q;
                if (el5Var != null && el5Var.x()) {
                    g50Var.g(g50Var.r);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.F(g50Var.r);
                        return;
                    }
                    return;
                }
            case 3:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.t;
                Object obj = constraintTrackingWorker.t.y.g.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                if (TextUtils.isEmpty(str)) {
                    iy2.r().y(ConstraintTrackingWorker.p, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.b.a(new ww2());
                    return;
                }
                xr5 xr5Var = constraintTrackingWorker.t.x;
                Context context = constraintTrackingWorker.j;
                WorkerParameters workerParameters = constraintTrackingWorker.w;
                xr5Var.getClass();
                ListenableWorker listenableWorkerG = xr5.g(context, str, workerParameters);
                constraintTrackingWorker.s = listenableWorkerG;
                if (listenableWorkerG == null) {
                    iy2.r().g(ConstraintTrackingWorker.p, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.b.a(new ww2());
                    return;
                }
                sr5 sr5VarA = kr5.g(constraintTrackingWorker.j).r.k().a(constraintTrackingWorker.t.g.toString());
                if (sr5VarA == null) {
                    constraintTrackingWorker.b.a(new ww2());
                    return;
                }
                Context context2 = constraintTrackingWorker.j;
                yq5 yq5Var = new yq5(context2, kr5.g(context2).n, constraintTrackingWorker);
                yq5Var.y(Collections.singletonList(sr5VarA));
                if (!yq5Var.g(constraintTrackingWorker.t.g.toString())) {
                    iy2.r().g(ConstraintTrackingWorker.p, du4.i("Constraints not met for delegate ", str, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.b.a(new xw2());
                    return;
                }
                iy2.r().g(ConstraintTrackingWorker.p, xi3.t("Constraints met for delegate ", str), new Throwable[0]);
                try {
                    ol4 ol4VarL = constraintTrackingWorker.s.l();
                    ol4VarL.g(new i26((byte) 7, constraintTrackingWorker, ol4VarL, r12), constraintTrackingWorker.t.n);
                    return;
                } catch (Throwable th) {
                    iy2 iy2VarR = iy2.r();
                    String str2 = ConstraintTrackingWorker.p;
                    iy2VarR.g(str2, du4.i("Delegated worker ", str, " threw exception in startWork."), th);
                    synchronized (constraintTrackingWorker.c) {
                        try {
                            if (constraintTrackingWorker.i) {
                                iy2.r().g(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.b.a(new xw2());
                            } else {
                                constraintTrackingWorker.b.a(new ww2());
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            case 4:
                if (((CoroutineWorker) this.t).c.j instanceof c0) {
                    ((CoroutineWorker) this.t).w.x(null);
                    return;
                }
                return;
            case 5:
                f91 f91Var = (f91) this.t;
                f91Var.k0.onDismiss(f91Var.s0);
                return;
            case 6:
                ef1 ef1Var2 = (ef1) this.t;
                ef1Var2.u = null;
                ef1Var2.drawableStateChanged();
                return;
            case 7:
                sn1 sn1Var = (sn1) this.t;
                ValueAnimator valueAnimator = sn1Var.e;
                byte b = sn1Var.A;
                if (b == 1) {
                    valueAnimator.cancel();
                } else if (b != 2) {
                    return;
                }
                sn1Var.A = (byte) 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 8:
                wg2 wg2Var = (wg2) this.t;
                ld1 ld1Var = wg2Var.w;
                if (wg2Var.r != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = wg2Var.B;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    g layoutManager = wg2Var.p.getLayoutManager();
                    Rect rect = wg2Var.A;
                    if (rect == null) {
                        rect = new Rect();
                        wg2Var.A = rect;
                    }
                    layoutManager.c(rect, wg2Var.r.g);
                    if (layoutManager.i()) {
                        int i = (int) (wg2Var.a + wg2Var.j);
                        int paddingLeft = (i - wg2Var.A.left) - wg2Var.p.getPaddingLeft();
                        float f = wg2Var.j;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((wg2Var.r.g.getWidth() + i) + wg2Var.A.right) - (wg2Var.p.getWidth() - wg2Var.p.getPaddingRight())) <= 0)) {
                            iL = 0;
                        } else {
                            iL = paddingLeft;
                        }
                    } else {
                        iL = 0;
                    }
                    if (layoutManager.b()) {
                        int i2 = (int) (wg2Var.m + wg2Var.t);
                        int paddingTop = (i2 - wg2Var.A.top) - wg2Var.p.getPaddingTop();
                        float f2 = wg2Var.t;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((wg2Var.r.g.getHeight() + i2) + wg2Var.A.bottom) - (wg2Var.p.getHeight() - wg2Var.p.getPaddingBottom())) > 0)) {
                            r12 = paddingTop;
                        }
                    }
                    if (iL != 0) {
                        RecyclerView recyclerView = wg2Var.p;
                        int width = wg2Var.r.g.getWidth();
                        wg2Var.p.getWidth();
                        iL = ld1Var.l(recyclerView, width, iL, j3);
                    }
                    int i3 = iL;
                    if (r12 != 0) {
                        RecyclerView recyclerView2 = wg2Var.p;
                        int height = wg2Var.r.g.getHeight();
                        wg2Var.p.getHeight();
                        iL2 = ld1Var.l(recyclerView2, height, r12 == true ? 1 : 0, j3);
                    }
                    if (i3 == 0 && r11 == 0) {
                        wg2Var.B = Long.MIN_VALUE;
                        return;
                    }
                    r11 = r12;
                    r11 = iL2;
                    if (wg2Var.B == Long.MIN_VALUE) {
                        wg2Var.B = jCurrentTimeMillis;
                    }
                    wg2Var.p.scrollBy(i3, r11);
                    n54 n54Var = wg2Var.r;
                    if (n54Var != null) {
                        wg2Var.i(n54Var);
                    }
                    wg2Var.p.removeCallbacks(wg2Var.u);
                    RecyclerView recyclerView3 = wg2Var.p;
                    WeakHashMap weakHashMap2 = xk5.g;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.t;
                if (searchView$SearchAutoComplete.w) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.w = false;
                    return;
                }
                return;
            case 10:
                ((RecyclerView) ((p8) this.t).g).performHapticFeedback(0);
                return;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((StaggeredGridLayoutManager) this.t).Q0();
                return;
            case 12:
                b35 b35Var = (b35) this.t;
                synchronized (b35Var) {
                    b35Var.l++;
                    u25VarY = b35Var.y();
                }
                if (u25VarY == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    u25 u25Var = u25VarY;
                    try {
                        threadCurrentThread.setName(u25Var.g);
                        Logger logger = ((b35) this.t).y;
                        a35 a35Var = u25Var.r;
                        a35Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            fh6.y(logger, u25Var, a35Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jR = u25Var.r();
                            if (zIsLoggable) {
                                fh6.y(logger, u25Var, a35Var, "finished run in " + fh6.g(System.nanoTime() - jNanoTime));
                            }
                            b35 b35Var2 = (b35) this.t;
                            synchronized (b35Var2) {
                                b35Var2.g(u25Var, jR, true);
                                u25VarY = b35Var2.y();
                            }
                        } catch (Throwable th3) {
                            if (zIsLoggable) {
                                fh6.y(logger, u25Var, a35Var, "failed a run in " + fh6.g(System.nanoTime() - jNanoTime));
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            b35 b35Var3 = (b35) this.t;
                            synchronized (b35Var3) {
                                b35Var3.g(u25Var, -1L, false);
                                if (!(th4 instanceof InterruptedException)) {
                                    throw th4;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th5) {
                            threadCurrentThread.setName(name);
                            throw th5;
                        }
                    }
                } while (u25VarY != null);
                threadCurrentThread.setName(name);
                return;
            case 13:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.t).a.c;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 14:
                ActionMenuView actionMenuView = ((Toolbar) this.t).j;
                if (actionMenuView == null || (z3Var = actionMenuView.A) == null) {
                    return;
                }
                z3Var.q();
                return;
            case kq2.x /* 15 */:
                gw4 gw4Var = (gw4) this.t;
                ml mlVar = (ml) gw4Var.r;
                k12 k12Var = (k12) gw4Var.y;
                RecyclerView recyclerView4 = k12Var.g;
                int iG2 = (int) (k12Var.g() * 0.125f);
                int i4 = ((Point) gw4Var.v).y;
                if (i4 <= iG2) {
                    iG = i4 - iG2;
                } else {
                    iG = i4 >= k12Var.g() - iG2 ? (((Point) gw4Var.v).y - k12Var.g()) + iG2 : 0;
                }
                if (iG == 0) {
                    return;
                }
                if (!gw4Var.g) {
                    if (Math.abs(((Point) gw4Var.n).y - ((Point) gw4Var.v).y) < ((int) (k12Var.g() * 0.125f * 0.25f))) {
                        return;
                    }
                }
                gw4Var.g = true;
                if (iG <= iG2) {
                    iG2 = iG;
                }
                int iG3 = (int) (k12Var.g() * 0.125f);
                int iSignum = (int) Math.signum(iG2);
                int iPow = (int) (iSignum * 70 * ((float) Math.pow(Math.min(1.0f, Math.abs(iG2) / iG3), 10.0d)));
                if (iPow != 0) {
                    iSignum = iPow;
                }
                recyclerView4.U(0, iSignum, null);
                recyclerView4.removeCallbacks(mlVar);
                WeakHashMap weakHashMap3 = xk5.g;
                recyclerView4.postOnAnimation(mlVar);
                return;
            case 16:
                ((el5) this.t).w(0);
                return;
            case 17:
                Worker worker = (Worker) this.t;
                try {
                    worker.w.a(worker.t());
                    return;
                } catch (Throwable th6) {
                    worker.w.m(th6);
                    return;
                }
            case 18:
                ((su5) this.t).r();
                return;
            case 19:
                com.google.android.gms.common.internal.g gVar = ((su5) ((ha5) this.t).t).n;
                gVar.r(gVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 20:
                ((cv5) this.t).a.y(new kq0(4, null, null));
                return;
            case 21:
                throw null;
            case 22:
                try {
                    ((o00) ((wh4) this.t).t).F.r();
                    return;
                } catch (Throwable th7) {
                    i06.t("BillingClient", "Exception calling onBillingServiceDisconnected.", th7);
                    return;
                }
            case 23:
                h36 h36Var = (h36) this.t;
                if (h36Var == null || (a36Var = h36Var.i) == null) {
                    return;
                }
                this.t = null;
                if (a36Var.isDone()) {
                    Object obj2 = h36Var.j;
                    if (obj2 == null) {
                        if (a36Var.isDone()) {
                            if (t16.c.j(h36Var, null, h36.j(a36Var))) {
                                h36.a(h36Var);
                                return;
                            }
                            return;
                        }
                        j16 j16Var = new j16(h36Var, a36Var);
                        if (t16.c.j(h36Var, null, j16Var)) {
                            try {
                                a36Var.y(j16Var, b26.j);
                                return;
                            } catch (Throwable th8) {
                                try {
                                    l16Var = new l16(th8);
                                    break;
                                } catch (Error | Exception unused) {
                                    l16Var = l16.y;
                                }
                                t16.c.j(h36Var, j16Var, l16Var);
                                return;
                            }
                        }
                        obj2 = h36Var.j;
                    }
                    if (obj2 instanceof i16) {
                        a36Var.cancel(((i16) obj2).g);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = h36Var.b;
                    h36Var.b = null;
                    String str3 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str3 = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th9) {
                            if (t16.c.j(h36Var, null, new l16(new e36(str3)))) {
                                h36.a(h36Var);
                            }
                            throw th9;
                        }
                    }
                    if (t16.c.j(h36Var, null, new l16(new e36(str3 + ": " + a36Var.toString())))) {
                        h36.a(h36Var);
                    }
                    a36Var.cancel(true);
                    return;
                } catch (Throwable th10) {
                    a36Var.cancel(true);
                    throw th10;
                }
            case 24:
                g();
                return;
            default:
                if (((x25) this.t).r(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ml(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    public /* synthetic */ ml() {
        this.j = (byte) 23;
    }

    public ml(cv5 cv5Var) {
        this.j = (byte) 20;
        Objects.requireNonNull(cv5Var);
        this.t = cv5Var;
    }
}
