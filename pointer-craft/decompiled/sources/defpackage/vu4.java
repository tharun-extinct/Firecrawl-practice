package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class vu4 {
    public static final float g = ViewConfiguration.getScrollFriction();

    public static final c11 g(h02 h02Var) {
        j51 j51Var = (j51) h02Var.a(hp0.j);
        boolean zR = h02Var.r(j51Var.y());
        Object objK = h02Var.K();
        if (zR || objK == oo0.g) {
            objK = new c11(new et4(j51Var));
            h02Var.i0(objK);
        }
        return (c11) objK;
    }
}
