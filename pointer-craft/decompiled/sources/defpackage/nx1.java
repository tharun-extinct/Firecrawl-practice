package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends pl5 {
    public static final mx1 j = new mx1((byte) 0);
    public final boolean v;
    public final HashMap y = new HashMap();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public boolean x = false;
    public boolean l = false;

    public nx1(boolean z) {
        this.v = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nx1.class != obj.getClass()) {
            return false;
        }
        nx1 nx1Var = (nx1) obj;
        return this.y.equals(nx1Var.y) && this.r.equals(nx1Var.r) && this.n.equals(nx1Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + (this.y.hashCode() * 31)) * 31);
    }

    public final void j(pw1 pw1Var) {
        if (this.l) {
            if (kx1.N(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.y.remove(pw1Var.q) == null || !kx1.N(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + pw1Var);
        }
    }

    public final void l(String str, boolean z) {
        HashMap map = this.r;
        nx1 nx1Var = (nx1) map.get(str);
        if (nx1Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(nx1Var.r.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nx1Var.x((String) obj, true);
                }
            }
            nx1Var.n();
            map.remove(str);
        }
        HashMap map2 = this.n;
        vl5 vl5Var = (vl5) map2.get(str);
        if (vl5Var != null) {
            vl5Var.g();
            map2.remove(str);
        }
    }

    @Override // defpackage.pl5
    public final void n() {
        if (kx1.N(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.x = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.r.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.n.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final void v(pw1 pw1Var, boolean z) {
        if (kx1.N(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pw1Var);
        }
        l(pw1Var.q, z);
    }

    public final void x(String str, boolean z) {
        if (kx1.N(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        l(str, z);
    }
}
