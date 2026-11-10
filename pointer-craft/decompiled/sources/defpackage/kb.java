package defpackage;

import android.view.ActionMode;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kb implements va1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ kb(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.va1
    public final void g() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                p91 p91Var = (p91) obj;
                p91Var.dismiss();
                p91Var.i.v();
                break;
            case 1:
                sv3 sv3Var = (sv3) obj;
                sv3Var.v();
                sv3Var.setTag(R.id.view_tree_lifecycle_owner, null);
                sv3Var.f.removeViewImmediate(sv3Var);
                break;
            case 2:
                cf cfVar = (cf) obj;
                ut4 ut4Var = cfVar.v;
                d5 d5Var = ut4Var.j;
                if (d5Var != null) {
                    d5Var.y();
                }
                ut4Var.g();
                ActionMode actionMode = cfVar.j;
                if (actionMode != null) {
                    actionMode.finish();
                }
                cfVar.j = null;
                break;
            case 3:
                xy xyVar = (xy) ((yy) obj).r.getValue();
                if (xyVar != null) {
                    xyVar.close();
                }
                break;
            case 4:
                ((ya5) obj).g();
                break;
            case 5:
                ((cl0) obj).r = null;
                break;
            case 6:
                ((b65) obj).w();
                break;
            case 7:
                sm1 sm1Var = (sm1) obj;
                View view = sm1Var.t;
                if (sm1Var.j) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(sm1Var);
                    sm1Var.j = false;
                }
                view.removeOnAttachStateChangeListener(sm1Var);
                break;
            default:
                p63 p63Var = (p63) obj;
                p63Var.dismiss();
                p63Var.b.v();
                break;
        }
    }
}
