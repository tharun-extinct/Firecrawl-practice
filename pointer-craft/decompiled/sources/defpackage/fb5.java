package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class fb5 extends b83 {
    public final j4 j;
    public final ml l;
    public final bi6 n;
    public final ui4 r;
    public final t32 v;
    public final j4 x;
    public final ql2 y;

    public fb5(d31 d31Var, fa4 fa4Var, ql2 ql2Var, ui4 ui4Var, j4 j4Var, t32 t32Var, bi6 bi6Var, bi6 bi6Var2, ml mlVar, j4 j4Var2) {
        super(d31Var, fa4Var, bi6Var2);
        xs2.l(ql2Var != null);
        xs2.l(bi6Var != null);
        xs2.l(t32Var != null);
        this.y = ql2Var;
        this.r = ui4Var;
        this.x = j4Var;
        this.n = bi6Var;
        this.v = t32Var;
        this.l = mlVar;
        this.j = j4Var2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 1 && onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        gm2 gm2VarG;
        boolean z;
        ql2 ql2Var = this.y;
        if (ql2Var.r(motionEvent) && (gm2VarG = ql2Var.g(motionEvent)) != null) {
            this.j.run();
            motionEvent.getMetaState();
            Long lG = gm2VarG.g();
            d31 d31Var = this.g;
            if (d31Var.g.contains(lG)) {
                this.v.getClass();
                return;
            }
            gm2VarG.g();
            ui4 ui4Var = this.r;
            ui4Var.getClass();
            g(gm2VarG);
            switch (ui4Var.g) {
                case 0:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z && d31Var.x()) {
                this.x.run();
            }
            this.l.run();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        gm2 gm2VarG = this.y.g(motionEvent);
        d31 d31Var = this.g;
        if (gm2VarG == null) {
            return d31Var.g();
        }
        gm2VarG.g();
        if (!d31Var.v()) {
            this.n.getClass();
            return false;
        }
        motionEvent.getMetaState();
        if (d31Var.g.contains(gm2VarG.g())) {
            d31Var.n(gm2VarG.g());
            return true;
        }
        g(gm2VarG);
        return true;
    }
}
