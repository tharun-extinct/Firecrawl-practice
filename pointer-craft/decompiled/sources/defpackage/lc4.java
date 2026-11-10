package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lc4 implements Iterable {
    public ic4 j;
    public ic4 t;
    public final WeakHashMap a = new WeakHashMap();
    public int m = 0;

    public final boolean equals(Object obj) {
        hc4 hc4Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lc4)) {
            return false;
        }
        lc4 lc4Var = (lc4) obj;
        if (this.m != lc4Var.m) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = lc4Var.iterator();
        while (true) {
            hc4Var = (hc4) it;
            if (!hc4Var.hasNext()) {
                break;
            }
            hc4 hc4Var2 = (hc4) it2;
            if (!hc4Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) hc4Var.next();
            Object next = hc4Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (hc4Var.hasNext() || ((hc4) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            hc4 hc4Var = (hc4) it;
            if (!hc4Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) hc4Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        hc4 hc4Var = new hc4(this.j, this.t);
        this.a.put(hc4Var, Boolean.FALSE);
        return hc4Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            hc4 hc4Var = (hc4) it;
            if (!hc4Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) hc4Var.next()).toString());
            if (hc4Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
