package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class dc0 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public dc0(v92 v92Var, ec0 ec0Var, n43 n43Var, i43 i43Var) {
        this.q = v92Var;
        this.t = ec0Var;
        this.a = n43Var;
        this.m = i43Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Object obj = this.q;
        Object obj2 = this.m;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                fc0 fc0Var = (fc0) ((v92) obj).t;
                n43 n43Var = (n43) obj3;
                ec0 ec0Var = (ec0) obj4;
                if (ec0Var != null) {
                    fc0Var.H = true;
                    ec0Var.y.n(false);
                    fc0Var.H = false;
                }
                if (n43Var.isEnabled() && n43Var.hasSubMenu()) {
                    ((i43) obj2).p(n43Var, null, 4);
                    break;
                }
                break;
            default:
                to5.t((View) obj4, (yo5) obj3, (cd2) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public dc0(View view, yo5 yo5Var, cd2 cd2Var, ValueAnimator valueAnimator) {
        this.t = view;
        this.a = yo5Var;
        this.m = cd2Var;
        this.q = valueAnimator;
    }
}
