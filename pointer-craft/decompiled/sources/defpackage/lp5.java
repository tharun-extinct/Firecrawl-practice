package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class lp5 extends kp5 {
    public static final tp5 f = tp5.l(null, WindowInsets.CONSUMED);

    public lp5(tp5 tp5Var, WindowInsets windowInsets) {
        super(tp5Var, windowInsets);
    }

    @Override // defpackage.hp5, defpackage.pp5
    public nd2 a(int i) {
        return nd2.n(this.r.getInsetsIgnoringVisibility(qp5.g(i)));
    }

    @Override // defpackage.hp5, defpackage.pp5
    public boolean h(int i) {
        return this.r.isVisible(qp5.g(i));
    }

    @Override // defpackage.hp5, defpackage.pp5
    public nd2 t(int i) {
        return nd2.n(this.r.getInsets(qp5.g(i)));
    }

    public lp5(tp5 tp5Var, lp5 lp5Var) {
        super(tp5Var, lp5Var);
    }

    @Override // defpackage.hp5, defpackage.pp5
    public final void n(View view) {
    }
}
