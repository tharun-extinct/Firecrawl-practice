package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ul0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public boolean a;
    public final long j = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ yl0 m;
    public Runnable t;

    public ul0(yl0 yl0Var) {
        this.m = yl0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.t = runnable;
        View decorView = this.m.getWindow().getDecorView();
        decorView.getClass();
        if (!this.a) {
            decorView.postOnAnimation(new j4(this, (byte) 4));
        } else if (yf2.p(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void g(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.t;
        yl0 yl0Var = this.m;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.j) {
                this.a = false;
                yl0Var.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.t = null;
        if (((ly1) yl0Var.c.getValue()).y()) {
            this.a = false;
            yl0Var.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
