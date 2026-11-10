package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class y9 implements Runnable {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ y9(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i;
        Object obj;
        switch (this.j) {
            case 0:
                ba baVar = (ba) this.t;
                baVar.removeCallbacks(this);
                MotionEvent motionEvent = baVar.u0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i2 = 7;
                if (actionMasked == 7) {
                    i = i2;
                } else if (actionMasked != 8) {
                    if (actionMasked != 9) {
                        i2 = 2;
                    }
                    i = i2;
                } else {
                    i = 9;
                }
                baVar.P(motionEvent, i, baVar.v0, false);
                return;
            case 1:
                tl tlVar = (tl) this.t;
                if ((tlVar.e0 & 1) != 0) {
                    tlVar.h(0);
                }
                if ((tlVar.e0 & 4096) != 0) {
                    tlVar.h(108);
                }
                tlVar.d0 = false;
                tlVar.e0 = 0;
                return;
            case 2:
                pw1 pw1Var = (pw1) this.t;
                if (pw1Var.R != null) {
                    pw1Var.v();
                    return;
                }
                return;
            case 3:
                ((kx1) this.t).A(true);
                return;
            case 4:
                synchronized (((ka3) this.t).g) {
                    obj = ((ka3) this.t).x;
                    ((ka3) this.t).x = ka3.m;
                    break;
                }
                ((ka3) this.t).r(obj);
                return;
            case 5:
                try {
                    ((Runnable) this.t).run();
                    return;
                } catch (Exception e) {
                    sp2.w("Executor", "Background execution failure.", e);
                    return;
                }
            default:
                b06 b06Var = (b06) this.t;
                o00 o00Var = b06Var.v;
                o00Var.k(0);
                x20 x20Var = b36.m;
                o00Var.f(24, b06Var.n, x20Var);
                b06Var.r(x20Var);
                return;
        }
    }
}
