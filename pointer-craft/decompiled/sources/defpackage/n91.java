package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@rf3("dialog")
public final class n91 extends sf3 {
    @Override // defpackage.sf3
    public final ad3 g() {
        return new m91(this);
    }

    @Override // defpackage.sf3
    public final void n(List list, wd3 wd3Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y().x((mc3) it.next());
        }
    }

    @Override // defpackage.sf3
    public final void v(mc3 mc3Var, boolean z) {
        y().v(mc3Var, z);
        int iN0 = cj0.n0((Iterable) y().x.j.getValue(), mc3Var);
        int i = 0;
        for (Object obj : (Iterable) y().x.j.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            mc3 mc3Var2 = (mc3) obj;
            if (i > iN0) {
                y().r(mc3Var2);
            }
            i = i2;
        }
    }
}
