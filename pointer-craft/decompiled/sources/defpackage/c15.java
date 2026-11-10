package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c15 extends vd2 {
    public xy1 d;
    public yp5 e;

    @Override // defpackage.qd2, defpackage.i73
    public final void I0() {
        View viewD = c93.D(this);
        WeakHashMap weakHashMap = yp5.k;
        yp5 yp5VarC = v13.c(viewD);
        yp5VarC.g(viewD);
        qo5 qo5Var = (qo5) this.d.a(yp5VarC);
        if (!yf2.p(qo5Var, this.k)) {
            this.k = qo5Var;
            R0();
        }
        this.e = yp5VarC;
        super.I0();
    }

    @Override // defpackage.qd2, defpackage.i73
    public final void J0() {
        View viewD = c93.D(this);
        yp5 yp5Var = this.e;
        if (yp5Var != null) {
            int i = yp5Var.o - 1;
            yp5Var.o = i;
            if (i == 0) {
                WeakHashMap weakHashMap = xk5.g;
                pk5.r(viewD, null);
                yo5.g(viewD, null);
                viewD.removeOnAttachStateChangeListener(yp5Var.f);
            }
        }
        super.J0();
    }
}
