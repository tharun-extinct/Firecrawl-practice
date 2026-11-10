package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import io.appground.blek.R;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class p63 extends em0 {
    public final l63 b;
    public long c;
    public final View i;
    public my1 q;
    public c73 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p63(my1 my1Var, c73 c73Var, long j, View view, fl2 fl2Var, j51 j51Var, UUID uuid, qg qgVar, ox0 ox0Var) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        byte b = 0;
        this.q = my1Var;
        this.w = c73Var;
        this.c = j;
        this.i = view;
        Window window = getWindow();
        if (window == null) {
            l0.z("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        xs2.F(window, false);
        l63 l63Var = new l63(getContext());
        l63Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        l63Var.setClipChildren(false);
        l63Var.setElevation(j51Var.e(8.0f));
        l63Var.setOutlineProvider(new ei0((byte) 2));
        this.b = l63Var;
        setContentView(l63Var);
        l63Var.setTag(R.id.view_tree_lifecycle_owner, aq2.c(view));
        l63Var.setTag(R.id.view_tree_view_model_store_owner, kq2.B(view));
        l63Var.setTag(R.id.view_tree_saved_state_registry_owner, v13.m(view));
        l(this.q, this.w, this.c, fl2Var);
        jy3 jy3Var = new jy3(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        aq2 xp5Var = i >= 35 ? new xp5(window, jy3Var) : i >= 30 ? new wp5(window, jy3Var) : i >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
        this.w.getClass();
        xp5Var.F(wa6.x(this.c));
        this.w.getClass();
        xp5Var.E(wa6.x(this.c));
        tj3 tj3VarY = y();
        this.w.getClass();
        tj3VarY.g(this, new o63(ox0Var, qgVar, new m63(this, b)));
    }

    public final void l(my1 my1Var, c73 c73Var, long j, fl2 fl2Var) {
        this.q = my1Var;
        this.w = c73Var;
        this.c = j;
        c73Var.getClass();
        ViewGroup.LayoutParams layoutParams = this.i.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal = fl2Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            up.y();
            return;
        }
        this.b.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.q.g();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
