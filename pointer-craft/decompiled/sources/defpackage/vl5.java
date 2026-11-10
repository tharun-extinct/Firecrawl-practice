package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vl5 {
    public final LinkedHashMap g = new LinkedHashMap();

    public final void g() {
        LinkedHashMap linkedHashMap = this.g;
        Map mapJ = v13.J(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapJ.values().iterator();
        while (it.hasNext()) {
            ((pl5) it.next()).y();
        }
    }

    public final String toString() {
        String strR = v54.g(vl5.class).r();
        if (strR == null) {
            strR = "ViewModelStore";
        }
        int iHashCode = hashCode();
        a11.x(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strR + "@" + string + "(keys=" + cj0.J0(this.g.keySet()) + ")";
    }
}
