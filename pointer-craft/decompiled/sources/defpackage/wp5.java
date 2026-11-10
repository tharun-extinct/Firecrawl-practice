package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class wp5 extends aq2 {
    public final Window n;
    public final jy3 r;
    public final WindowInsetsController y;

    public wp5(Window window, jy3 jy3Var) {
        this.y = window.getInsetsController();
        this.r = jy3Var;
        this.n = window;
    }

    @Override // defpackage.aq2
    public void E(boolean z) {
        Window window = this.n;
        if (window != null) {
            if (!z) {
                L(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.y;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.aq2
    public void F(boolean z) {
        Window window = this.n;
        if (window != null) {
            if (!z) {
                L(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.y;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.aq2
    public void G(int i) {
        Window window = this.n;
        if (window == null) {
            this.y.setSystemBarsBehavior(i);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            L(6144);
            return;
        }
        if (i == 1) {
            L(4096);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
        } else {
            if (i != 2) {
                return;
            }
            L(2048);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
        }
    }

    @Override // defpackage.aq2
    public final void H(int i) {
        if ((i & 8) != 0) {
            ((et4) this.r.j).n();
        }
        this.y.show(i & (-9));
    }

    public final void L(int i) {
        View decorView = this.n.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.aq2
    public final void p() {
        this.y.hide(519);
    }

    @Override // defpackage.aq2
    public int s() {
        Window window = this.n;
        if (window == null) {
            return this.y.getSystemBarsBehavior();
        }
        Object tag = window.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }
}
