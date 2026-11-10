package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qo3 extends jv2 {
    public final /* synthetic */ ro3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo3(ro3 ro3Var, Context context) {
        super(context);
        this.s = ro3Var;
    }

    @Override // defpackage.jv2
    public final void j(View view, h54 h54Var) {
        ro3 ro3Var = this.s;
        int[] iArrG = ro3Var.g(ro3Var.g.getLayoutManager(), view);
        int i = iArrG[0];
        int i2 = iArrG[1];
        int iCeil = (int) Math.ceil(((double) v(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            h54Var.g = i;
            h54Var.y = i2;
            h54Var.r = iCeil;
            h54Var.v = this.a;
            h54Var.x = true;
        }
    }

    @Override // defpackage.jv2
    public final float n(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.jv2
    public final int v(int i) {
        return Math.min(100, super.v(i));
    }
}
