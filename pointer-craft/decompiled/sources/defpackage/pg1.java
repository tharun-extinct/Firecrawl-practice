package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class pg1 extends og1 {
    @Override // defpackage.ng1, defpackage.sg1
    public void y(v05 v05Var, v05 v05Var2, Window window, View view, boolean z, boolean z2) {
        aq2 vp5Var;
        v05Var.getClass();
        v05Var2.getClass();
        window.getClass();
        view.getClass();
        xs2.F(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        jy3 jy3Var = new jy3(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            vp5Var = new xp5(window, jy3Var);
        } else if (i >= 30) {
            vp5Var = new wp5(window, jy3Var);
        } else {
            vp5Var = i >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
        }
        vp5Var.F(!z);
        vp5Var.E(!z2);
    }
}
