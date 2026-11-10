package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ fl5 t;

    public /* synthetic */ wf(fl5 fl5Var, byte b) {
        this.j = b;
        this.t = fl5Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        boolean zDispatchTouchEvent;
        byte b = this.j;
        og5 og5Var = og5.g;
        fl5 fl5Var = this.t;
        switch (b) {
            case 0:
                fl5Var.k = (xy1) obj;
                return og5Var;
            case 1:
                pn3 pn3Var = (pn3) obj;
                ba baVar = pn3Var instanceof ba ? (ba) pn3Var : null;
                if (baVar != null) {
                    baVar.getAndroidViewsHandler$ui().removeViewInLayout(fl5Var);
                    ue5.o(baVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(baVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(fl5Var));
                    fl5Var.setImportantForAccessibility(0);
                }
                fl5Var.removeAllViewsInLayout();
                return og5Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = fl5Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = fl5Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
