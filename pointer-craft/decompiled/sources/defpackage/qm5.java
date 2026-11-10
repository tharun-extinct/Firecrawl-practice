package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class qm5 extends pm5 {
    @Override // defpackage.pm5
    public final void a(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.pm5
    public final void j(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.pm5
    public final void l(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.fb6
    public final float n(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.pm5
    public final void t(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.fb6
    public final void x(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
