package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jf3 {
    public kb5 g;
    public boolean y;

    public final void g() {
        kb5 kb5Var = this.g;
        if (kb5Var == null) {
            l0.z("This input is not added to any dispatcher.");
            return;
        }
        if (!this.y) {
            kb5Var.q(this, null);
        }
        kf3 kf3Var = (kf3) kb5Var.t;
        d5 d5Var = (d5) kb5Var.j;
        if (equals(kf3Var.j) && -1 == kf3Var.l) {
            hf3 hf3VarR = kf3Var.x;
            if (hf3VarR == null) {
                hf3VarR = kf3Var.r(-1);
            }
            kf3Var.x = null;
            kf3Var.l = 0;
            kf3Var.j = null;
            if (hf3VarR == null) {
                ((tj3) d5Var.t).g.run();
            } else {
                hf3VarR.y();
            }
            kf3Var.g.m(null, lf3.y);
        }
        this.y = false;
    }

    public void y(boolean z) {
    }
}
