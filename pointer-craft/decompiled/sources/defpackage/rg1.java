package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rg1 extends qg1 {
    @Override // defpackage.pg1, defpackage.ng1, defpackage.sg1
    public void y(v05 v05Var, v05 v05Var2, Window window, View view, boolean z, boolean z2) {
        aq2 vp5Var;
        v05Var.getClass();
        v05Var2.getClass();
        window.getClass();
        view.getClass();
        xs2.F(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof pj0)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        jy3 jy3Var = new jy3(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            vp5Var = new xp5(window, jy3Var);
        } else if (i3 >= 30) {
            vp5Var = new wp5(window, jy3Var);
        } else {
            vp5Var = i3 >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
        }
        vp5Var.F(!z);
        vp5Var.E(!z2);
    }
}
