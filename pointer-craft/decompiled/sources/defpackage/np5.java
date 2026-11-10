package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class np5 extends mp5 {
    public static final tp5 k = tp5.l(null, WindowInsets.CONSUMED);

    public np5(tp5 tp5Var, WindowInsets windowInsets) {
        super(tp5Var, windowInsets);
    }

    @Override // defpackage.lp5, defpackage.hp5, defpackage.pp5
    public nd2 a(int i) {
        return nd2.n(this.r.getInsetsIgnoringVisibility(sp5.g(i)));
    }

    @Override // defpackage.lp5, defpackage.hp5, defpackage.pp5
    public boolean h(int i) {
        return this.r.isVisible(sp5.g(i));
    }

    @Override // defpackage.lp5, defpackage.hp5, defpackage.pp5
    public nd2 t(int i) {
        return nd2.n(this.r.getInsets(sp5.g(i)));
    }

    public np5(tp5 tp5Var, np5 np5Var) {
        super(tp5Var, np5Var);
    }

    @Override // defpackage.hp5, defpackage.pp5
    public void b(View view) {
    }
}
