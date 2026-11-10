package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ag implements t33 {
    public final /* synthetic */ fl5 g;
    public final /* synthetic */ um2 y;

    public ag(fl5 fl5Var, um2 um2Var) {
        this.g = fl5Var;
        this.y = um2Var;
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        fl5 fl5Var = this.g;
        ViewGroup.LayoutParams layoutParams = fl5Var.getLayoutParams();
        layoutParams.getClass();
        fl5Var.measure(dg.w(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return fl5Var.getMeasuredHeight();
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        fl5 fl5Var = this.g;
        ViewGroup.LayoutParams layoutParams = fl5Var.getLayoutParams();
        layoutParams.getClass();
        fl5Var.measure(dg.w(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return fl5Var.getMeasuredHeight();
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        fl5 fl5Var = this.g;
        int childCount = fl5Var.getChildCount();
        qi1 qi1Var = qi1.j;
        if (childCount == 0) {
            return v33Var.k0(ws0.m(j), ws0.a(j), qi1Var, new l1((byte) 12));
        }
        if (ws0.m(j) != 0) {
            fl5Var.getChildAt(0).setMinimumWidth(ws0.m(j));
        }
        if (ws0.a(j) != 0) {
            fl5Var.getChildAt(0).setMinimumHeight(ws0.a(j));
        }
        int iM = ws0.m(j);
        int iT = ws0.t(j);
        ViewGroup.LayoutParams layoutParams = fl5Var.getLayoutParams();
        layoutParams.getClass();
        int iW = dg.w(iM, iT, layoutParams.width);
        int iA = ws0.a(j);
        int iJ = ws0.j(j);
        ViewGroup.LayoutParams layoutParams2 = fl5Var.getLayoutParams();
        layoutParams2.getClass();
        fl5Var.measure(iW, dg.w(iA, iJ, layoutParams2.height));
        return v33Var.k0(fl5Var.getMeasuredWidth(), fl5Var.getMeasuredHeight(), qi1Var, new vf(fl5Var, this.y, (byte) 2));
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        fl5 fl5Var = this.g;
        ViewGroup.LayoutParams layoutParams = fl5Var.getLayoutParams();
        layoutParams.getClass();
        fl5Var.measure(iMakeMeasureSpec, dg.w(0, i, layoutParams.height));
        return fl5Var.getMeasuredWidth();
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        fl5 fl5Var = this.g;
        ViewGroup.LayoutParams layoutParams = fl5Var.getLayoutParams();
        layoutParams.getClass();
        fl5Var.measure(iMakeMeasureSpec, dg.w(0, i, layoutParams.height));
        return fl5Var.getMeasuredWidth();
    }
}
