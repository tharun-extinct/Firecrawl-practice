package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf3 {
    public rc3 g;
    public boolean y;

    public abstract ad3 g();

    public void n(List list, wd3 wd3Var) {
        Iterator it = new h51(new h25(new ij0(list, (byte) 0), new ll2(this, wd3Var, (byte) 6), (byte) 1), new vy3((byte) 11)).iterator();
        while (true) {
            ko1 ko1Var = (ko1) it;
            if (!ko1Var.hasNext()) {
                return;
            }
            y().x((mc3) ko1Var.next());
        }
    }

    public ad3 r(ad3 ad3Var) {
        return ad3Var;
    }

    public void v(mc3 mc3Var, boolean z) {
        List list = (List) y().v.j.getValue();
        if (!list.contains(mc3Var)) {
            uo1.A("popBackStack was called with ", mc3Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        mc3 mc3Var2 = null;
        while (x()) {
            mc3Var2 = (mc3) listIterator.previous();
            if (yf2.p(mc3Var2, mc3Var)) {
                break;
            }
        }
        if (mc3Var2 != null) {
            y().n(mc3Var2, z);
        }
    }

    public boolean x() {
        return true;
    }

    public final rc3 y() {
        rc3 rc3Var = this.g;
        if (rc3Var != null) {
            return rc3Var;
        }
        l0.z("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }
}
