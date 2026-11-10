package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class qk5 {
    public static tp5 g(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        tp5 tp5VarL = tp5.l(null, rootWindowInsets);
        pp5 pp5Var = tp5VarL.g;
        pp5Var.d(tp5VarL);
        View rootView = view.getRootView();
        pp5Var.n(rootView);
        pp5Var.b(rootView);
        pp5Var.s();
        return tp5VarL;
    }
}
