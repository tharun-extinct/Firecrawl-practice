package defpackage;

import android.graphics.ColorSpace;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oc6 {
    public static final yo0 g(wf5 wf5Var, to0 to0Var) {
        return new yo0(to0Var, wf5Var);
    }

    public static Object r(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final ColorSpace y(uj0 uj0Var) {
        if (yf2.p(uj0Var, wj0.o)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (yf2.p(uj0Var, wj0.f)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
