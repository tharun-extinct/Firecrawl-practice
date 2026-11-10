package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class b53 extends sw2 implements m43 {
    public static final Method K;
    public v92 J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.sw2
    public final ef1 s(Context context, boolean z) {
        a53 a53Var = new a53(context, z);
        a53Var.setHoverListener(this);
        return a53Var;
    }

    @Override // defpackage.m43
    public final void t(i43 i43Var, MenuItem menuItem) {
        v92 v92Var = this.J;
        if (v92Var != null) {
            v92Var.t(i43Var, menuItem);
        }
    }

    @Override // defpackage.m43
    public final void w(i43 i43Var, n43 n43Var) {
        v92 v92Var = this.J;
        if (v92Var != null) {
            v92Var.w(i43Var, n43Var);
        }
    }
}
