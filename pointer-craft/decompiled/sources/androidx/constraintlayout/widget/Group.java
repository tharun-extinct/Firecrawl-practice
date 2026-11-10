package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ds0;
import defpackage.fs0;

/* JADX INFO: loaded from: classes.dex */
public class Group extends ds0 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ds0
    public final void a() {
        fs0 fs0Var = (fs0) getLayoutParams();
        fs0Var.p0.O(0);
        fs0Var.p0.L(0);
    }

    @Override // defpackage.ds0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        n();
    }

    @Override // defpackage.ds0
    public final void x(ConstraintLayout constraintLayout) {
        v(constraintLayout);
    }
}
