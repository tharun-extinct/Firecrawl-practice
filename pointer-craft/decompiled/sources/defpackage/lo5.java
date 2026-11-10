package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lo5 extends eb6 {
    public final /* synthetic */ no5 r;
    public final /* synthetic */ byte y;

    public /* synthetic */ lo5(no5 no5Var, byte b) {
        this.y = b;
        this.r = no5Var;
    }

    @Override // defpackage.em5
    public final void g() {
        View view;
        byte b = this.y;
        no5 no5Var = this.r;
        switch (b) {
            case 0:
                if (no5Var.i && (view = no5Var.l) != null) {
                    view.setTranslationY(0.0f);
                    no5Var.n.setTranslationY(0.0f);
                }
                no5Var.n.setVisibility(8);
                no5Var.n.setTransitioning(false);
                no5Var.u = null;
                cd2 cd2Var = no5Var.m;
                if (cd2Var != null) {
                    cd2Var.B(no5Var.a);
                    no5Var.a = null;
                    no5Var.m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = no5Var.r;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = xk5.g;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                no5Var.u = null;
                no5Var.n.requestLayout();
                break;
        }
    }
}
