package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public class z43 {
    public x43 a;
    public final Context g;
    public boolean j;
    public PopupWindow.OnDismissListener m;
    public final int n;
    public final boolean r;
    public e53 t;
    public final int v;
    public View x;
    public final i43 y;
    public int l = 8388611;
    public final y43 q = new y43(this);

    public z43(int i, int i2, i43 i43Var, Context context, View view, boolean z) {
        this.g = context;
        this.y = i43Var;
        this.x = view;
        this.r = z;
        this.n = i;
        this.v = i2;
    }

    public final x43 g() {
        x43 kv4Var;
        x43 x43Var = this.a;
        if (x43Var != null) {
            return x43Var;
        }
        Context context = this.g;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int iMin = Math.min(point.x, point.y);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
        Context context2 = this.g;
        if (iMin >= dimensionPixelSize) {
            kv4Var = new fc0(context2, this.x, this.n, this.v, this.r);
        } else {
            View view = this.x;
            kv4Var = new kv4(this.n, this.v, this.y, context2, view, this.r);
        }
        kv4Var.q(this.y);
        kv4Var.p(this.q);
        kv4Var.c(this.x);
        kv4Var.v(this.t);
        kv4Var.i(this.j);
        kv4Var.b(this.l);
        this.a = kv4Var;
        return kv4Var;
    }

    public final void n(int i, int i2, boolean z, boolean z2) {
        x43 x43VarG = g();
        x43VarG.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.l, this.x.getLayoutDirection()) & 7) == 5) {
                i -= this.x.getWidth();
            }
            x43VarG.s(i);
            x43VarG.z(i2);
            int i3 = (int) ((this.g.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            x43VarG.j = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        x43VarG.r();
    }

    public void r() {
        this.a = null;
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean y() {
        x43 x43Var = this.a;
        return x43Var != null && x43Var.g();
    }
}
