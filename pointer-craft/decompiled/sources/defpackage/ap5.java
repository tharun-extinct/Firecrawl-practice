package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ap5 extends gp5 {
    public final WindowInsets.Builder v;

    public ap5(tp5 tp5Var) {
        super(tp5Var);
        WindowInsets windowInsetsX = tp5Var.x();
        this.v = windowInsetsX != null ? we5.l(windowInsetsX) : md2.x();
    }

    @Override // defpackage.gp5
    public void j(nd2 nd2Var) {
        this.v.setSystemWindowInsets(nd2Var.v());
    }

    @Override // defpackage.gp5
    public void l(nd2 nd2Var) {
        this.v.setSystemGestureInsets(nd2Var.v());
    }

    @Override // defpackage.gp5
    public void t(nd2 nd2Var) {
        this.v.setTappableElementInsets(nd2Var.v());
    }

    @Override // defpackage.gp5
    public void v(nd2 nd2Var) {
        this.v.setMandatorySystemGestureInsets(nd2Var.v());
    }

    @Override // defpackage.gp5
    public void x(nd2 nd2Var) {
        this.v.setStableInsets(nd2Var.v());
    }

    @Override // defpackage.gp5
    public tp5 y() {
        g();
        tp5 tp5VarL = tp5.l(null, this.v.build());
        nd2[] nd2VarArr = this.y;
        pp5 pp5Var = tp5VarL.g;
        pp5Var.f(nd2VarArr);
        pp5Var.o(null);
        pp5Var.B(this.r);
        pp5Var.C(this.n);
        return tp5VarL;
    }

    public ap5() {
        this.v = md2.x();
    }
}
