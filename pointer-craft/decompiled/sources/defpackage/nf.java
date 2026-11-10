package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nf extends hx0 {
    public final Choreographer a;
    public boolean b;
    public final Handler m;
    public boolean s;
    public final qf u;
    public static final o05 z = new o05(new y4(8));
    public static final lf h = new lf();
    public final Object q = new Object();
    public final dr w = new dr();
    public ArrayList c = new ArrayList();
    public ArrayList i = new ArrayList();
    public final mf p = new mf(this);

    public nf(Choreographer choreographer, Handler handler) {
        this.a = choreographer;
        this.m = handler;
        this.u = new qf(choreographer, this);
    }

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        synchronized (this.q) {
            this.w.addLast(runnable);
            if (!this.b) {
                this.b = true;
                this.m.post(this.p);
                if (!this.s) {
                    this.s = true;
                    this.a.postFrameCallback(this.p);
                }
            }
        }
    }

    public final void S() {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (this.q) {
                dr drVar = this.w;
                runnable = (Runnable) (drVar.isEmpty() ? null : drVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.q) {
                    dr drVar2 = this.w;
                    runnable = (Runnable) (drVar2.isEmpty() ? null : drVar2.removeFirst());
                }
            }
            synchronized (this.q) {
                if (this.w.isEmpty()) {
                    z2 = false;
                    this.b = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }
}
