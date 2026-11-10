package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ip5 extends hp5 {
    public nd2 u;

    public ip5(tp5 tp5Var, ip5 ip5Var) {
        super(tp5Var, ip5Var);
        this.u = null;
        this.u = ip5Var.u;
    }

    @Override // defpackage.pp5
    public void e(nd2 nd2Var) {
        this.u = nd2Var;
    }

    @Override // defpackage.pp5
    public final nd2 q() {
        nd2 nd2Var = this.u;
        if (nd2Var != null) {
            return nd2Var;
        }
        WindowInsets windowInsets = this.r;
        nd2 nd2VarR = nd2.r(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.u = nd2VarR;
        return nd2VarR;
    }

    @Override // defpackage.pp5
    public tp5 r() {
        return tp5.l(null, this.r.consumeSystemWindowInsets());
    }

    @Override // defpackage.pp5
    public boolean u() {
        return this.r.isConsumed();
    }

    @Override // defpackage.pp5
    public tp5 y() {
        return tp5.l(null, this.r.consumeStableInsets());
    }

    public ip5(tp5 tp5Var, WindowInsets windowInsets) {
        super(tp5Var, windowInsets);
        this.u = null;
    }
}
