package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class hr4 implements xy1 {
    public final /* synthetic */ ki0 a;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ float q;
    public final /* synthetic */ xy1 t;
    public final /* synthetic */ my1 w;

    public hr4(boolean z, xy1 xy1Var, ki0 ki0Var, boolean z2, float f, my1 my1Var) {
        this.j = z;
        this.t = xy1Var;
        this.a = ki0Var;
        this.m = z2;
        this.q = f;
        this.w = my1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        KeyEvent keyEvent = ((ki2) obj).g;
        if (!this.j) {
            return Boolean.FALSE;
        }
        xy1 xy1Var = this.t;
        if (xy1Var == null) {
            return Boolean.FALSE;
        }
        int iN = mx5.n(keyEvent);
        boolean z = false;
        if (iN == 2) {
            ki0 ki0Var = this.a;
            float f = ki0Var.y;
            float f2 = ki0Var.g;
            float fAbs = Math.abs(f - f2) / 100.0f;
            int i = this.m ? -1 : 1;
            long jN = vx5.n(keyEvent.getKeyCode());
            boolean zG = fi2.g(jN, fi2.n);
            float f3 = this.q;
            if (zG) {
                xy1Var.a(xs2.i(Float.valueOf((i * fAbs) + f3), ki0Var));
            } else if (fi2.g(jN, fi2.v)) {
                xy1Var.a(xs2.i(Float.valueOf(f3 - (i * fAbs)), ki0Var));
            } else if (fi2.g(jN, fi2.l)) {
                xy1Var.a(xs2.i(Float.valueOf((i * fAbs) + f3), ki0Var));
            } else if (fi2.g(jN, fi2.x)) {
                xy1Var.a(xs2.i(Float.valueOf(f3 - (i * fAbs)), ki0Var));
            } else if (fi2.g(jN, fi2.k)) {
                xy1Var.a(Float.valueOf(f2));
            } else if (fi2.g(jN, fi2.d)) {
                xy1Var.a(Float.valueOf(ki0Var.y));
            } else if (fi2.g(jN, fi2.E)) {
                xy1Var.a(xs2.i(Float.valueOf(f3 - (xs2.w(10, 1, 10) * fAbs)), ki0Var));
            } else if (fi2.g(jN, fi2.F)) {
                xy1Var.a(xs2.i(Float.valueOf((xs2.w(10, 1, 10) * fAbs) + f3), ki0Var));
            }
            z = true;
        } else if (iN == 1) {
            long jN2 = vx5.n(keyEvent.getKeyCode());
            if (fi2.g(jN2, fi2.n) || fi2.g(jN2, fi2.v) || fi2.g(jN2, fi2.l) || fi2.g(jN2, fi2.x) || fi2.g(jN2, fi2.k) || fi2.g(jN2, fi2.d) || fi2.g(jN2, fi2.E) || fi2.g(jN2, fi2.F)) {
                my1 my1Var = this.w;
                if (my1Var != null) {
                    my1Var.g();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
