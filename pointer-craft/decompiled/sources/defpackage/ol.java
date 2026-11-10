package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import io.appground.blek.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ol implements Window.Callback {
    public boolean a;
    public final Window.Callback j;
    public boolean m;
    public final /* synthetic */ tl q;
    public boolean t;

    public ol(tl tlVar, Window.Callback callback) {
        this.q = tlVar;
        if (callback != null) {
            this.j = callback;
        } else {
            l0.u("Window callback may not be null");
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.j.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.a;
        Window.Callback callback = this.j;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.q.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.j.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            tl tlVar = this.q;
            tlVar.d();
            no5 no5Var = tlVar.h;
            if (no5Var == null || !no5Var.j(keyCode, keyEvent)) {
                sl slVar = tlVar.R;
                if (slVar == null || !tlVar.D(slVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (tlVar.R == null) {
                        sl slVarK = tlVar.k(0);
                        tlVar.E(slVarK, keyEvent);
                        boolean zD = tlVar.D(slVarK, keyEvent.getKeyCode(), keyEvent);
                        slVarK.m = false;
                        if (zD) {
                        }
                    }
                    return false;
                }
                sl slVar2 = tlVar.R;
                if (slVar2 != null) {
                    slVar2.q = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.j.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.j.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.j.dispatchTrackballEvent(motionEvent);
    }

    public final void g(Window.Callback callback) {
        try {
            this.t = true;
            callback.onContentChanged();
        } finally {
            this.t = false;
        }
    }

    public final void n(List list, Menu menu, int i) {
        jb6.n(this.j, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.j.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.j.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.j.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.t) {
            this.j.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof i43)) {
            return this.j.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.j.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.j.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.j.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        y(i, menu);
        if (i == 108) {
            tl tlVar = this.q;
            tlVar.d();
            no5 no5Var = tlVar.h;
            if (no5Var != null) {
                no5Var.r(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.m) {
            this.j.onPanelClosed(i, menu);
            return;
        }
        r(i, menu);
        tl tlVar = this.q;
        if (i == 108) {
            tlVar.d();
            no5 no5Var = tlVar.h;
            if (no5Var != null) {
                no5Var.r(false);
                return;
            }
            return;
        }
        if (i == 0) {
            sl slVarK = tlVar.k(i);
            if (slVarK.w) {
                tlVar.s(slVarK, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        tm.j(this.j, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i43 i43Var = menu instanceof i43 ? (i43) menu : null;
        if (i == 0 && i43Var == null) {
            return false;
        }
        if (i43Var != null) {
            i43Var.k(true);
        }
        boolean zOnPreparePanel = this.j.onPreparePanel(i, view, menu);
        if (i43Var != null) {
            i43Var.k(false);
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        i43 i43Var = this.q.k(0).j;
        if (i43Var != null) {
            n(list, i43Var, i);
        } else {
            n(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.j.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.j.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.j.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        tl tlVar = this.q;
        Context context = tlVar.p;
        if (i != 0) {
            return this.j.onWindowStartingActionMode(callback, i);
        }
        ty tyVar = new ty(context, callback);
        d4 d4Var = tlVar.A;
        if (d4Var != null) {
            d4Var.g();
        }
        cd2 cd2Var = new cd2(tlVar, tyVar, (byte) 3);
        tlVar.d();
        no5 no5Var = tlVar.h;
        if (no5Var != null) {
            tlVar.A = no5Var.w(cd2Var);
        }
        if (tlVar.A == null) {
            bm5 bm5Var = tlVar.E;
            if (bm5Var != null) {
                bm5Var.y();
            }
            d4 d4Var2 = tlVar.A;
            if (d4Var2 != null) {
                d4Var2.g();
            }
            byte b = 1;
            byte b2 = 0;
            if (tlVar.B == null) {
                if (tlVar.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        lu0 lu0Var = new lu0(context, 0);
                        lu0Var.getTheme().setTo(themeNewTheme);
                        context = lu0Var;
                    }
                    tlVar.B = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    tlVar.C = popupWindow;
                    vd6.l(popupWindow);
                    tlVar.C.setContentView(tlVar.B);
                    tlVar.C.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    tlVar.B.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    tlVar.C.setHeight(-2);
                    tlVar.D = new ml(tlVar, b2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) tlVar.G.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        tlVar.d();
                        no5 no5Var2 = tlVar.h;
                        Context contextV = no5Var2 != null ? no5Var2.v() : null;
                        if (contextV != null) {
                            context = contextV;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        tlVar.B = (ActionBarContextView) viewStubCompat.g();
                    }
                }
            }
            if (tlVar.B != null) {
                bm5 bm5Var2 = tlVar.E;
                if (bm5Var2 != null) {
                    bm5Var2.y();
                }
                tlVar.B.v();
                hv4 hv4Var = new hv4(tlVar.B.getContext(), tlVar.B, cd2Var);
                if (cd2Var.A(hv4Var, hv4Var.r())) {
                    hv4Var.l();
                    tlVar.B.r(hv4Var);
                    tlVar.A = hv4Var;
                    boolean z = tlVar.F && (viewGroup = tlVar.G) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView = tlVar.B;
                    if (z) {
                        actionBarContextView.setAlpha(0.0f);
                        bm5 bm5VarG = xk5.g(tlVar.B);
                        bm5VarG.g(1.0f);
                        tlVar.E = bm5VarG;
                        bm5VarG.n(new ll(tlVar, b));
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        tlVar.B.setVisibility(0);
                        if (tlVar.B.getParent() instanceof View) {
                            View view = (View) tlVar.B.getParent();
                            WeakHashMap weakHashMap = xk5.g;
                            view.requestApplyInsets();
                        }
                    }
                    if (tlVar.C != null) {
                        tlVar.u.getDecorView().post(tlVar.D);
                    }
                } else {
                    tlVar.A = null;
                }
            }
            tlVar.G();
            tlVar.A = tlVar.A;
        }
        tlVar.G();
        d4 d4Var3 = tlVar.A;
        if (d4Var3 != null) {
            return tyVar.t(d4Var3);
        }
        return null;
    }

    public final void r(int i, Menu menu) {
        this.j.onPanelClosed(i, menu);
    }

    public final boolean y(int i, Menu menu) {
        return this.j.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.j.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
