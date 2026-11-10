package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lb6 {
    public static ha2 g;

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static rk4 n(Object obj) {
        return new rk4(obj);
    }

    public static void r(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final j73 y(j73 j73Var, xy1 xy1Var) {
        return j73Var.n(new zs1(xy1Var));
    }
}
