package defpackage;

import android.widget.FrameLayout;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vc5 {
    public static final au g;
    public static final ArrayList r;
    public static final ThreadLocal y;

    static {
        au auVar = new au();
        auVar.J = new ArrayList();
        auVar.M = false;
        auVar.N = 0;
        auVar.K = false;
        auVar.L(new gn1(2));
        auVar.L(new uc0());
        auVar.L(new gn1(1));
        g = auVar;
        y = new ThreadLocal();
        r = new ArrayList();
    }

    public static void g(FrameLayout frameLayout, lc5 lc5Var) {
        ArrayList arrayList = r;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (lc5Var == null) {
            lc5Var = g;
        }
        lc5 lc5VarClone = lc5Var.clone();
        ArrayList arrayList2 = (ArrayList) y().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((lc5) obj).k(frameLayout);
            }
        }
        lc5VarClone.j(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            uo1.B();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        uc5 uc5Var = new uc5();
        uc5Var.j = lc5VarClone;
        uc5Var.t = frameLayout;
        frameLayout.addOnAttachStateChangeListener(uc5Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(uc5Var);
    }

    public static mr y() {
        mr mrVar;
        ThreadLocal threadLocal = y;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (mrVar = (mr) weakReference.get()) != null) {
            return mrVar;
        }
        mr mrVar2 = new mr(0);
        threadLocal.set(new WeakReference(mrVar2));
        return mrVar2;
    }
}
