package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class jx1 implements hx1 {
    public final /* synthetic */ kx1 g;

    public jx1(kx1 kx1Var) {
        this.g = kx1Var;
    }

    @Override // defpackage.hx1
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        boolean zY;
        kx1 kx1Var = this.g;
        ArrayList arrayList3 = kx1Var.c;
        if (kx1.N(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + kx1Var.g);
        }
        if (kx1Var.n.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zY = false;
        } else {
            ArrayList arrayList4 = kx1Var.n;
            fw fwVar = (fw) arrayList4.get(arrayList4.size() - 1);
            kx1Var.j = fwVar;
            ArrayList arrayList5 = fwVar.g;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                pw1 pw1Var = ((wx1) obj).y;
                if (pw1Var != null) {
                    pw1Var.z = true;
                }
            }
            zY = kx1Var.Y(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(kx1.I((fw) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 != null) {
                    uo1.B();
                    return false;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zY;
    }
}
