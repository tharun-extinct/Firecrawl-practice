package defpackage;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xx implements View.OnLayoutChangeListener {
    public final /* synthetic */ gy g;

    public xx(gy gyVar) {
        this.g = gyVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LinearLayout linearLayout;
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        tw1 tw1Var = this.g.j0;
        if (tw1Var == null || (linearLayout = tw1Var.j) == null) {
            return;
        }
        linearLayout.requestFocus();
    }
}
