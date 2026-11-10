package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox2 {
    public static final vf1 g = new vf1(new sx1((byte) 19), (byte) 0);

    public static vj3 g(h02 h02Var) {
        vj3 vj3Var = (vj3) h02Var.a(g);
        Object obj = null;
        if (vj3Var == null) {
            h02Var.X(1208426157);
            View view = (View) h02Var.a(sa.x);
            view.getClass();
            while (true) {
                if (view == null) {
                    vj3Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                vj3 vj3Var2 = tag instanceof vj3 ? (vj3) tag : null;
                if (vj3Var2 != null) {
                    vj3Var = vj3Var2;
                    break;
                }
                Object objS = sp2.s(view);
                view = objS instanceof View ? (View) objS : null;
            }
        } else {
            h02Var.X(1208423708);
        }
        h02Var.b(false);
        if (vj3Var != null) {
            h02Var.X(1208423789);
            h02Var.b(false);
            return vj3Var;
        }
        h02Var.X(1208428160);
        for (Context baseContext = (Context) h02Var.a(sa.y); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof vj3) {
                obj = baseContext;
                break;
            }
        }
        vj3 vj3Var3 = (vj3) obj;
        h02Var.b(false);
        return vj3Var3;
    }
}
