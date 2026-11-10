package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ok5 implements View.OnApplyWindowInsetsListener {
    public tp5 g = null;
    public final /* synthetic */ jj3 r;
    public final /* synthetic */ View y;

    public ok5(View view, jj3 jj3Var) {
        this.y = view;
        this.r = jj3Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        tp5 tp5VarL = tp5.l(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        jj3 jj3Var = this.r;
        if (i < 30) {
            pk5.g(windowInsets, this.y);
            if (tp5VarL.equals(this.g)) {
                return jj3Var.t(view, tp5VarL).x();
            }
        }
        this.g = tp5VarL;
        tp5 tp5VarT = jj3Var.t(view, tp5VarL);
        if (i >= 30) {
            return tp5VarT.x();
        }
        WeakHashMap weakHashMap = xk5.g;
        view.requestApplyInsets();
        return tp5VarT.x();
    }
}
