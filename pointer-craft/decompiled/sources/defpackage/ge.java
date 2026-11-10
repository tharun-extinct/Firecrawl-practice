package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ge implements ex3, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long i;
    public boolean a;
    public long c;
    public final View j;
    public boolean w;
    public final PriorityQueue t = new PriorityQueue(11, new ee(0));
    public final Choreographer m = Choreographer.getInstance();
    public final fe q = new fe();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public ge(View view) {
        float refreshRate;
        this.j = view;
        if (i == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            i = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.w = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.w) {
            this.c = j;
            this.j.post(this);
        }
    }

    @Override // defpackage.ex3
    public final void g(dx3 dx3Var) {
        this.t.add(new ay3(1, dx3Var));
        if (this.a) {
            return;
        }
        this.a = true;
        this.j.post(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.w = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.w = false;
        this.j.removeCallbacks(this);
        this.m.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.t;
        if (!priorityQueue.isEmpty() && this.a && this.w) {
            View view = this.j;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * i) + nanos;
                fe feVar = this.q;
                feVar.g = z;
                feVar.y = Math.max(this.c, nanos) + i;
                boolean zY = false;
                while (!priorityQueue.isEmpty() && !zY) {
                    if (feVar.g) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zY = y();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zY = y();
                    }
                }
                if (zY) {
                    this.m.postFrameCallback(this);
                } else {
                    this.a = false;
                }
                pw5.V("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.a = false;
    }

    public final boolean y() {
        fe feVar = this.q;
        long jG = feVar.g();
        pw5.V("compose:lazy:prefetch:available_time_nanos", jG);
        boolean z = true;
        if (jG > 0) {
            PriorityQueue priorityQueue = this.t;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((ay3) objPeek).y().r(feVar)) {
                priorityQueue.poll();
                z = false;
            }
            feVar.g = false;
        }
        return z;
    }
}
