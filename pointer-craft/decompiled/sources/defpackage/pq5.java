package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class pq5 {
    public static final hb3 g;

    static {
        long[] jArr = ee4.g;
        g = new hb3();
    }

    public static final to0 g(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof to0) {
            return (to0) tag;
        }
        return null;
    }

    public static final a44 y(View view) {
        fx0 fx0Var;
        qf qfVar;
        if (!view.isAttachedToWindow()) {
            mc2.y("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objS = sp2.s(view);
        while (objS instanceof View) {
            View view2 = (View) objS;
            if (view2.getId() == 16908290) {
                break;
            }
            objS = view2.getParent();
            view = view2;
        }
        to0 to0VarG = g(view);
        if (to0VarG != null) {
            if (to0VarG instanceof a44) {
                return (a44) to0VarG;
            }
            l0.z("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((iq5) jq5.g.get()).getClass();
        fx0 fx0Var2 = ni1.j;
        o05 o05Var = nf.z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fx0Var = (fx0) nf.z.getValue();
        } else {
            fx0Var = (fx0) nf.h.get();
            if (fx0Var == null) {
                l0.z("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        fx0 fx0VarB = fx0Var.b(fx0Var2);
        s73 s73Var = (s73) fx0VarB.h(f73.m);
        if (s73Var != null) {
            qfVar = new qf(s73Var);
            ok2 ok2Var = (ok2) qfVar.a;
            synchronized (ok2Var.y) {
                ok2Var.g = false;
            }
        } else {
            qfVar = null;
        }
        u54 u54Var = new u54();
        fx0 x73Var = (w73) fx0VarB.h(d93.m);
        if (x73Var == null) {
            x73Var = new x73(view.getContext().getApplicationContext());
            u54Var.j = x73Var;
        }
        if (qfVar != null) {
            fx0Var2 = qfVar;
        }
        fx0 fx0VarB2 = fx0VarB.b(fx0Var2).b(x73Var);
        a44 a44Var = new a44(fx0VarB2);
        synchronized (a44Var.n) {
            a44Var.o = true;
        }
        ku0 ku0VarX = k33.x(fx0VarB2);
        gu2 gu2VarC = aq2.c(view);
        ju2 ju2VarA = gu2VarC != null ? gu2VarC.a() : null;
        if (ju2VarA == null) {
            mc2.r("ViewTreeLifecycleOwner not found from " + view);
            l0.x();
            return null;
        }
        view.addOnAttachStateChangeListener(new kq5(view, a44Var));
        ju2VarA.g(new mq5(ku0VarX, qfVar, a44Var, u54Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, a44Var);
        c32 c32Var = c32.j;
        Handler handler = view.getHandler();
        int i = u42.g;
        view.addOnAttachStateChangeListener(new hc(m50.T(c32Var, new t42(handler, "windowRecomposer cleanup", false).w, new op(a44Var, view, (mu0) null), 2), (byte) 3));
        return a44Var;
    }
}
