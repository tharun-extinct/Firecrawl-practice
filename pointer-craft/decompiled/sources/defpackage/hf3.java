package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class hf3 {
    public lr2 g;
    public boolean n;
    public List r;
    public kb5 v;
    public List y;

    public hf3(lr2 lr2Var, boolean z) {
        this.g = lr2Var;
        pi1 pi1Var = pi1.j;
        this.y = pi1Var;
        this.r = pi1Var;
        this.n = z;
    }

    public abstract void g();

    public abstract void n(ff3 ff3Var);

    public abstract void r(ff3 ff3Var);

    public final void v() {
        kb5 kb5Var = this.v;
        if (kb5Var == null || !((ya3) kb5Var.a).j(this)) {
            return;
        }
        kf3 kf3Var = (kf3) kb5Var.t;
        if (equals(kf3Var.x)) {
            if (kf3Var.l == -1) {
                g();
            }
            kf3Var.x = null;
            kf3Var.l = 0;
            kf3Var.j = null;
        }
        kf3Var.n.remove(this);
        kf3Var.v.remove(this);
        this.v = null;
        kf3Var.y();
    }

    public final void x(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        kb5 kb5Var = this.v;
        if (kb5Var != null) {
            ((kf3) kb5Var.t).y();
        }
    }

    public abstract void y();
}
