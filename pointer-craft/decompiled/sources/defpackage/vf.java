package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf implements xy1 {
    public final /* synthetic */ um2 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ fl5 t;

    public /* synthetic */ vf(fl5 fl5Var, um2 um2Var, byte b) {
        this.j = b;
        this.t = fl5Var;
        this.a = um2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        WindowInsets windowInsetsX;
        byte b = this.j;
        og5 og5Var = og5.g;
        um2 um2Var = this.a;
        fl5 fl5Var = this.t;
        switch (b) {
            case 0:
                yf2.O(fl5Var, um2Var);
                ((ba) fl5Var.a).K = true;
                int[] iArr = fl5Var.h;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = fl5Var.t;
                view.getLocationOnScreen(iArr);
                long j = fl5Var.o;
                long jL = ((bl2) obj).L();
                fl5Var.o = jL;
                tp5 tp5Var = fl5Var.f;
                if (tp5Var != null && ((i != iArr[0] || i2 != iArr[1] || !qe2.g(j, jL)) && (windowInsetsX = fl5Var.q(tp5Var).x()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsX);
                }
                break;
            case 1:
                View view2 = fl5Var.t;
                pn3 pn3Var = (pn3) obj;
                ba baVar = pn3Var instanceof ba ? (ba) pn3Var : null;
                if (baVar != null) {
                    baVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(fl5Var, um2Var);
                    baVar.getAndroidViewsHandler$ui().addView(fl5Var);
                    baVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(um2Var, fl5Var);
                    fl5Var.setImportantForAccessibility(1);
                    xk5.q(fl5Var, new v9(baVar, um2Var, baVar));
                }
                if (view2.getParent() != fl5Var) {
                    fl5Var.addView(view2);
                }
                break;
            default:
                yf2.O(fl5Var, um2Var);
                break;
        }
        return og5Var;
    }
}
