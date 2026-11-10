package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tp5 {
    public static final tp5 y;
    public final pp5 g;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            y = np5.k;
        } else if (i >= 30) {
            y = lp5.f;
        } else {
            y = pp5.y;
        }
    }

    public tp5(tp5 tp5Var) {
        if (tp5Var == null) {
            this.g = new pp5(this);
            return;
        }
        pp5 pp5Var = tp5Var.g;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (pp5Var instanceof op5)) {
            this.g = new op5(this, (op5) pp5Var);
        } else if (i >= 34 && (pp5Var instanceof np5)) {
            this.g = new np5(this, (np5) pp5Var);
        } else if (i >= 31 && (pp5Var instanceof mp5)) {
            this.g = new mp5(this, (mp5) pp5Var);
        } else if (i >= 30 && (pp5Var instanceof lp5)) {
            this.g = new lp5(this, (lp5) pp5Var);
        } else if (i >= 29 && (pp5Var instanceof kp5)) {
            this.g = new kp5(this, (kp5) pp5Var);
        } else if (i >= 28 && (pp5Var instanceof jp5)) {
            this.g = new jp5(this, (jp5) pp5Var);
        } else if (pp5Var instanceof ip5) {
            this.g = new ip5(this, (ip5) pp5Var);
        } else if (pp5Var instanceof hp5) {
            this.g = new hp5(this, (hp5) pp5Var);
        } else {
            this.g = new pp5(this);
        }
        pp5Var.v(this);
    }

    public static tp5 l(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        tp5 tp5Var = new tp5(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = xk5.g;
            tp5 tp5VarG = qk5.g(view);
            pp5 pp5Var = tp5Var.g;
            pp5Var.d(tp5VarG);
            View rootView = view.getRootView();
            pp5Var.n(rootView);
            pp5Var.b(rootView);
            pp5Var.s();
            pp5Var.A(view.getWindowSystemUiVisibility());
        }
        return tp5Var;
    }

    public static nd2 v(nd2 nd2Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, nd2Var.g - i);
        int iMax2 = Math.max(0, nd2Var.y - i2);
        int iMax3 = Math.max(0, nd2Var.r - i3);
        int iMax4 = Math.max(0, nd2Var.n - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? nd2Var : nd2.r(iMax, iMax2, iMax3, iMax4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tp5) {
            return Objects.equals(this.g, ((tp5) obj).g);
        }
        return false;
    }

    public final int g() {
        return this.g.c().n;
    }

    public final int hashCode() {
        pp5 pp5Var = this.g;
        if (pp5Var == null) {
            return 0;
        }
        return pp5Var.hashCode();
    }

    public final int n() {
        return this.g.c().y;
    }

    public final int r() {
        return this.g.c().r;
    }

    public final WindowInsets x() {
        pp5 pp5Var = this.g;
        if (pp5Var instanceof hp5) {
            return ((hp5) pp5Var).r;
        }
        return null;
    }

    public final int y() {
        return this.g.c().g;
    }

    public tp5(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.g = new op5(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.g = new np5(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.g = new mp5(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.g = new lp5(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.g = new kp5(this, windowInsets);
        } else if (i >= 28) {
            this.g = new jp5(this, windowInsets);
        } else {
            this.g = new ip5(this, windowInsets);
        }
    }
}
