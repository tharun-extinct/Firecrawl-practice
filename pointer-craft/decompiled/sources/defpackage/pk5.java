package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk5 {
    public static void g(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void r(View view, jj3 jj3Var) {
        ok5 ok5Var = jj3Var != null ? new ok5(view, jj3Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, ok5Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (ok5Var != null) {
            view.setOnApplyWindowInsetsListener(ok5Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static tp5 y(View view, tp5 tp5Var, Rect rect) {
        WindowInsets windowInsetsX = tp5Var.x();
        if (windowInsetsX != null) {
            return tp5.l(view, view.computeSystemWindowInsets(windowInsetsX, rect));
        }
        rect.setEmpty();
        return tp5Var;
    }
}
