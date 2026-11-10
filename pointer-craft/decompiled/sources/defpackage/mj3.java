package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class mj3 implements OnBackAnimationCallback {
    public final /* synthetic */ kj3 g;

    public mj3(kj3 kj3Var) {
        this.g = kj3Var;
    }

    public final void onBackCancelled() {
        kj3 kj3Var = this.g;
        kb5 kb5Var = kj3Var.g;
        if (kb5Var == null) {
            l0.z("This input is not added to any dispatcher.");
            return;
        }
        if (!kj3Var.y) {
            kb5Var.q(kj3Var, null);
        }
        kf3 kf3Var = (kf3) kb5Var.t;
        if (kj3Var.equals(kf3Var.j) && -1 == kf3Var.l) {
            hf3 hf3VarR = kf3Var.x;
            if (hf3VarR == null) {
                hf3VarR = kf3Var.r(-1);
            }
            kf3Var.x = null;
            kf3Var.l = 0;
            kf3Var.j = null;
            if (hf3VarR != null) {
                hf3VarR.g();
            }
            kf3Var.g.m(null, lf3.y);
        }
        kj3Var.y = false;
    }

    public final void onBackInvoked() {
        this.g.g();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        ff3 ff3VarL = ib6.l(backEvent);
        kj3 kj3Var = this.g;
        kb5 kb5Var = kj3Var.g;
        if (kb5Var == null) {
            l0.z("This input is not added to any dispatcher.");
            return;
        }
        if (kj3Var.y) {
            kf3 kf3Var = (kf3) kb5Var.t;
            if (kj3Var.equals(kf3Var.j) && -1 == kf3Var.l) {
                hf3 hf3VarR = kf3Var.x;
                if (hf3VarR == null) {
                    hf3VarR = kf3Var.r(-1);
                }
                if (hf3VarR != null) {
                    hf3VarR.r(ff3VarL);
                }
                kf3Var.g.m(null, new mf3(ff3VarL));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        ff3 ff3VarL = ib6.l(backEvent);
        kj3 kj3Var = this.g;
        kb5 kb5Var = kj3Var.g;
        if (kb5Var == null) {
            l0.z("This input is not added to any dispatcher.");
        } else {
            if (kj3Var.y) {
                return;
            }
            kb5Var.q(kj3Var, ff3VarL);
            kj3Var.y = true;
        }
    }
}
