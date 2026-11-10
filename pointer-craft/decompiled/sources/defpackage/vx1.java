package defpackage;

import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vx1 {
    public static final ux1 g = ux1.g;

    public static ux1 g(pw1 pw1Var) {
        while (pw1Var != null) {
            if (pw1Var.u()) {
                pw1Var.w();
            }
            pw1Var = pw1Var.D;
        }
        return g;
    }

    public static final void n(pw1 pw1Var, ViewGroup viewGroup) {
        y(new px1(pw1Var, "Attempting to use <fragment> tag to add fragment " + pw1Var + " to container " + viewGroup));
        g(pw1Var).getClass();
    }

    public static final void r(pw1 pw1Var, String str) {
        str.getClass();
        y(new px1(pw1Var, "Attempting to reuse fragment " + pw1Var + " with previous ID " + str));
        g(pw1Var).getClass();
    }

    public static final void v(pw1 pw1Var, ViewGroup viewGroup) {
        y(new px1(pw1Var, "Attempting to add fragment " + pw1Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
        g(pw1Var).getClass();
    }

    public static final void x(pw1 pw1Var, pw1 pw1Var2, int i) {
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(pw1Var);
        sb.append(" within the view of parent fragment ");
        sb.append(pw1Var2);
        sb.append(" via container with ID ");
        y(new px1(pw1Var, xi3.m(sb, i, " without using parent's childFragmentManager")));
        g(pw1Var).getClass();
    }

    public static void y(px1 px1Var) {
        if (kx1.N(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(px1Var.j.getClass().getName()), px1Var);
        }
    }
}
