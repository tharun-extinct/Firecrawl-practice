package defpackage;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import io.appground.blek.R;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class p91 extends em0 {
    public boolean b;
    public final View c;
    public final l91 i;
    public my1 q;
    public o91 w;

    public p91(my1 my1Var, o91 o91Var, View view, fl2 fl2Var, j51 j51Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.q = my1Var;
        this.w = o91Var;
        this.c = view;
        Window window = getWindow();
        if (window == null) {
            l0.z("Dialog has no window");
            throw null;
        }
        o91 o91Var2 = this.w;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            o91Var2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.w.getClass();
        xs2.F(window, true);
        window.setGravity(17);
        this.w.getClass();
        l91 l91Var = new l91(getContext(), window);
        this.w.getClass();
        setTitle("");
        l91Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        l91Var.setClipChildren(false);
        l91Var.setElevation(j51Var.e(8.0f));
        l91Var.setOutlineProvider(new ei0((byte) 1));
        this.i = l91Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            l(viewGroup);
        }
        setContentView(l91Var);
        l91Var.setTag(R.id.view_tree_lifecycle_owner, aq2.c(view));
        l91Var.setTag(R.id.view_tree_view_model_store_owner, kq2.B(view));
        l91Var.setTag(R.id.view_tree_saved_state_registry_owner, v13.m(view));
        j(this.q, this.w, fl2Var);
        tj3 tj3VarY = y();
        ib ibVar = new ib(this, (byte) 1);
        tj3VarY.getClass();
        tj3VarY.g(this, new uj3(ibVar));
    }

    public static final void l(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof l91) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                l(viewGroup2);
            }
        }
    }

    public final void j(my1 my1Var, o91 o91Var, fl2 fl2Var) {
        int i;
        this.q = my1Var;
        this.w = o91Var;
        ch4 ch4Var = o91Var.r;
        boolean zY = de.y(this.c);
        int iOrdinal = ch4Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zY = true;
            } else {
                if (iOrdinal != 2) {
                    up.y();
                    return;
                }
                zY = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zY ? 8192 : -8193, 8192);
        int iOrdinal2 = fl2Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                up.y();
                return;
            }
            i = 1;
        }
        l91 l91Var = this.i;
        l91Var.setLayoutDirection(i);
        Window window2 = l91Var.s;
        boolean z = (l91Var.h && true == l91Var.u && true == l91Var.z) ? false : true;
        l91Var.u = true;
        l91Var.z = true;
        if (z && (-2 != window2.getAttributes().width || !l91Var.h)) {
            window2.setLayout(-2, -2);
            l91Var.h = true;
        }
        setCanceledOnTouchOutside(o91Var.y);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.w.g || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.q.g();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iZ;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.w.y) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.b = false;
            return zOnTouchEvent;
        }
        l91 l91Var = this.i;
        l91Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = l91Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + l91Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + l91Var.getTop();
            int height = childAt.getHeight() + top;
            int iZ2 = k33.Z(motionEvent.getX());
            if (left <= iZ2 && iZ2 <= width && top <= (iZ = k33.Z(motionEvent.getY())) && iZ <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.b = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.b = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.b = false;
                return zOnTouchEvent;
            }
        } else if (this.b) {
            this.q.g();
            this.b = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
