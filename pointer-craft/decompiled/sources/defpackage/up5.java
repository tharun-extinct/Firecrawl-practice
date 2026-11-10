package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public class up5 extends aq2 {
    public final jy3 r;
    public final Window y;

    public up5(Window window, jy3 jy3Var, int i) {
        this.y = window;
        this.r = jy3Var;
    }

    @Override // defpackage.aq2
    public final void F(boolean z) {
        if (!z) {
            M(8192);
            return;
        }
        Window window = this.y;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        L(8192);
    }

    @Override // defpackage.aq2
    public final void G(int i) {
        this.y.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            M(6144);
            return;
        }
        if (i == 1) {
            M(4096);
            L(2048);
        } else {
            if (i != 2) {
                return;
            }
            M(2048);
            L(4096);
        }
    }

    @Override // defpackage.aq2
    public final void H(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    M(4);
                    this.y.clearFlags(1024);
                } else if (i2 == 2) {
                    M(2);
                } else if (i2 == 8) {
                    ((et4) this.r.j).n();
                }
            }
        }
    }

    public final void L(int i) {
        View decorView = this.y.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void M(int i) {
        View decorView = this.y.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.aq2
    public final void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    L(4);
                } else if (i == 2) {
                    L(2);
                } else if (i == 8) {
                    ((et4) this.r.j).g();
                }
            }
        }
    }

    @Override // defpackage.aq2
    public final int s() {
        Object tag = this.y.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }

    public up5(Window window, jy3 jy3Var) {
        this(window, jy3Var, 0);
    }
}
