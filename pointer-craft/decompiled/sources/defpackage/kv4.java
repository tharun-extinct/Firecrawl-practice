package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kv4 extends x43 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean B;
    public final i43 a;
    public final b53 b;
    public final int c;
    public boolean d;
    public int e;
    public ViewTreeObserver f;
    public View h;
    public final int i;
    public boolean k;
    public final f43 m;
    public e53 o;
    public final boolean q;
    public final Context t;
    public PopupWindow.OnDismissListener u;
    public final int w;
    public View z;
    public final km s = new km(this, 3);
    public final cc0 p = new cc0(this, 4);
    public int A = 0;

    public kv4(int i, int i2, i43 i43Var, Context context, View view, boolean z) {
        this.t = context;
        this.a = i43Var;
        this.q = z;
        this.m = new f43(i43Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.c = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.z = view;
        this.b = new b53(context, null, i, i2);
        i43Var.r(this, context);
    }

    @Override // defpackage.f53
    public final boolean a(ly4 ly4Var) {
        boolean z;
        if (ly4Var.hasVisibleItems()) {
            z43 z43Var = new z43(this.c, this.i, ly4Var, this.t, this.h, this.q);
            e53 e53Var = this.o;
            z43Var.t = e53Var;
            x43 x43Var = z43Var.a;
            if (x43Var != null) {
                x43Var.v(e53Var);
            }
            int size = ly4Var.x.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = ly4Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            z43Var.j = z;
            x43 x43Var2 = z43Var.a;
            if (x43Var2 != null) {
                x43Var2.i(z);
            }
            z43Var.m = this.u;
            this.u = null;
            this.a.n(false);
            b53 b53Var = this.b;
            int width = b53Var.w;
            int iC = b53Var.c();
            if ((Gravity.getAbsoluteGravity(this.A, this.z.getLayoutDirection()) & 7) == 5) {
                width += this.z.getWidth();
            }
            if (!z43Var.y()) {
                if (z43Var.x != null) {
                    z43Var.n(width, iC, true, true);
                }
            }
            e53 e53Var2 = this.o;
            if (e53Var2 != null) {
                e53Var2.d(ly4Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.x43
    public final void b(int i) {
        this.A = i;
    }

    @Override // defpackage.x43
    public final void c(View view) {
        this.z = view;
    }

    @Override // defpackage.mp4
    public final void dismiss() {
        if (g()) {
            this.b.dismiss();
        }
    }

    @Override // defpackage.mp4
    public final boolean g() {
        return !this.k && this.b.G.isShowing();
    }

    @Override // defpackage.x43
    public final void i(boolean z) {
        this.m.r = z;
    }

    @Override // defpackage.mp4
    public final ef1 j() {
        return this.b.a;
    }

    @Override // defpackage.f53
    public final void l() {
        this.d = false;
        f43 f43Var = this.m;
        if (f43Var != null) {
            f43Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.f53
    public final boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.k = true;
        this.a.n(true);
        ViewTreeObserver viewTreeObserver = this.f;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f = this.h.getViewTreeObserver();
            }
            this.f.removeGlobalOnLayoutListener(this.s);
            this.f = null;
        }
        this.h.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener onDismissListener = this.u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.x43
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.u = onDismissListener;
    }

    @Override // defpackage.mp4
    public final void r() {
        View view;
        if (g()) {
            return;
        }
        if (this.k || (view = this.z) == null) {
            l0.z("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.h = view;
        b53 b53Var = this.b;
        em emVar = b53Var.G;
        em emVar2 = b53Var.G;
        emVar.setOnDismissListener(this);
        b53Var.f = this;
        b53Var.F = true;
        emVar2.setFocusable(true);
        View view2 = this.h;
        boolean z = this.f == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.s);
        }
        view2.addOnAttachStateChangeListener(this.p);
        b53Var.o = view2;
        b53Var.u = this.A;
        boolean z2 = this.d;
        Context context = this.t;
        f43 f43Var = this.m;
        if (!z2) {
            this.e = x43.w(f43Var, context, this.w);
            this.d = true;
        }
        b53Var.p(this.e);
        emVar2.setInputMethodMode(2);
        Rect rect = this.j;
        b53Var.E = rect != null ? new Rect(rect) : null;
        b53Var.r();
        ef1 ef1Var = b53Var.a;
        ef1Var.setOnKeyListener(this);
        if (this.B) {
            i43 i43Var = this.a;
            if (i43Var.w != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ef1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(i43Var.w);
                }
                frameLayout.setEnabled(false);
                ef1Var.addHeaderView(frameLayout, null, false);
            }
        }
        b53Var.b(f43Var);
        b53Var.r();
    }

    @Override // defpackage.x43
    public final void s(int i) {
        this.b.w = i;
    }

    @Override // defpackage.x43
    public final void u(boolean z) {
        this.B = z;
    }

    @Override // defpackage.f53
    public final void v(e53 e53Var) {
        this.o = e53Var;
    }

    @Override // defpackage.f53
    public final void y(i43 i43Var, boolean z) {
        if (i43Var != this.a) {
            return;
        }
        dismiss();
        e53 e53Var = this.o;
        if (e53Var != null) {
            e53Var.y(i43Var, z);
        }
    }

    @Override // defpackage.x43
    public final void z(int i) {
        this.b.l(i);
    }
}
