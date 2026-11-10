package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class zl0 {
    public static final ViewGroup.LayoutParams g = new ViewGroup.LayoutParams(-2, -2);

    public static void g(yl0 yl0Var, nm0 nm0Var) {
        View childAt = ((ViewGroup) yl0Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(nm0Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(yl0Var, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(nm0Var);
        View decorView = yl0Var.getWindow().getDecorView();
        if (aq2.c(decorView) == null) {
            decorView.setTag(io.appground.blek.R.id.view_tree_lifecycle_owner, yl0Var);
        }
        if (kq2.B(decorView) == null) {
            decorView.setTag(io.appground.blek.R.id.view_tree_view_model_store_owner, yl0Var);
        }
        if (v13.m(decorView) == null) {
            decorView.setTag(io.appground.blek.R.id.view_tree_saved_state_registry_owner, yl0Var);
        }
        yl0Var.setContentView(composeView2, g);
    }
}
