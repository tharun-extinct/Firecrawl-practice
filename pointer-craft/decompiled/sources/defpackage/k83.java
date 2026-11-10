package defpackage;

import android.util.Log;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class k83 extends b83 {
    public boolean l;
    public final bi6 n;
    public final aj6 r;
    public final bi6 v;
    public boolean x;
    public final ql2 y;

    public k83(d31 d31Var, fa4 fa4Var, ql2 ql2Var, aj6 aj6Var, bi6 bi6Var, bi6 bi6Var2) {
        super(d31Var, fa4Var, bi6Var2);
        xs2.l(ql2Var != null);
        xs2.l(aj6Var != null);
        xs2.l(bi6Var != null);
        this.y = ql2Var;
        this.r = aj6Var;
        this.n = bi6Var;
        this.v = bi6Var2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.x = false;
        ql2 ql2Var = this.y;
        if (ql2Var.r(motionEvent) && !db6.v(motionEvent, 4) && ql2Var.g(motionEvent) != null) {
            this.n.getClass();
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        gm2 gm2VarG;
        if (((motionEvent.getMetaState() & 2) != 0 && db6.v(motionEvent, 1)) || db6.v(motionEvent, 2)) {
            this.l = true;
            ql2 ql2Var = this.y;
            if (ql2Var.r(motionEvent) && (gm2VarG = ql2Var.g(motionEvent)) != null) {
                Long lG = gm2VarG.g();
                d31 d31Var = this.g;
                if (!d31Var.g.contains(lG)) {
                    d31Var.g();
                    g(gm2VarG);
                }
            }
            this.r.getClass();
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (((motionEvent2.getToolType(0) == 1 && motionEvent2.getSource() == 8194) || motionEvent2.getToolType(0) == 3) && motionEvent2.getActionMasked() == 2 && motionEvent2.getButtonState() == 0) {
            z = true;
        }
        return !z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gm2 gm2VarG;
        if (this.x) {
            this.x = false;
            return false;
        }
        if (!this.g.v()) {
            ql2 ql2Var = this.y;
            if (ql2Var.y(motionEvent) && !db6.v(motionEvent, 4) && (gm2VarG = ql2Var.g(motionEvent)) != null) {
                gm2VarG.g();
                this.v.getClass();
                y(gm2VarG, motionEvent);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.l) {
            this.l = false;
            return false;
        }
        ql2 ql2Var = this.y;
        boolean zR = ql2Var.r(motionEvent);
        bi6 bi6Var = this.v;
        d31 d31Var = this.g;
        if (!zR) {
            d31Var.g();
            bi6Var.getClass();
            return false;
        }
        if (db6.v(motionEvent, 4) || !d31Var.v()) {
            return false;
        }
        gm2 gm2VarG = ql2Var.g(motionEvent);
        boolean zV = d31Var.v();
        hi4 hi4Var = d31Var.g;
        if (zV) {
            xs2.l(gm2VarG != null);
            motionEvent.getMetaState();
            if ((motionEvent.getMetaState() & 4096) == 0) {
                gm2VarG.getClass();
                if (!hi4Var.contains(gm2VarG.g())) {
                    d31Var.g();
                }
            }
            if (!hi4Var.contains(gm2VarG.g())) {
                y(gm2VarG, motionEvent);
            } else if (d31Var.n(gm2VarG.g())) {
                bi6Var.getClass();
            }
        } else {
            Log.e("MouseInputHandler", "Call to onItemClick w/o selection.");
        }
        this.x = true;
        return true;
    }

    public final void y(gm2 gm2Var, MotionEvent motionEvent) {
        if ((motionEvent.getMetaState() & 4096) != 0) {
            g(gm2Var);
        } else {
            gm2Var.g();
            this.g.g();
        }
    }
}
