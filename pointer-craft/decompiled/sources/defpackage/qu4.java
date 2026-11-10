package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qu4 {
    public final ArrayList a;
    public su4 g;
    public boolean j;
    public boolean l;
    public final ArrayList m;
    public final ArrayList n;
    public final tx1 q;
    public final pw1 r;
    public boolean t;
    public boolean v;
    public boolean x;
    public ru4 y;

    public qu4(su4 su4Var, ru4 ru4Var, tx1 tx1Var) {
        pw1 pw1Var = tx1Var.r;
        this.g = su4Var;
        this.y = ru4Var;
        this.r = pw1Var;
        this.n = new ArrayList();
        this.t = true;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.m = arrayList;
        this.q = tx1Var;
    }

    public final void g(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.j = false;
        if (this.v) {
            return;
        }
        this.v = true;
        if (this.a.isEmpty()) {
            y();
            return;
        }
        Iterator it = cj0.F0(this.m).iterator();
        while (it.hasNext()) {
            ((pu4) it.next()).g(viewGroup);
        }
    }

    public final void n(su4 su4Var, ru4 ru4Var) {
        int iOrdinal = ru4Var.ordinal();
        su4 su4Var2 = su4.t;
        pw1 pw1Var = this.r;
        if (iOrdinal == 0) {
            if (this.g != su4Var2) {
                if (kx1.N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pw1Var + " mFinalState = " + this.g + " -> " + su4Var + ".");
                }
                this.g = su4Var;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.g == su4Var2) {
                if (kx1.N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pw1Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.y + " to ADDING.");
                }
                this.g = su4.a;
                this.y = ru4.t;
                this.t = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            uo1.g();
            return;
        }
        if (kx1.N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pw1Var + " mFinalState = " + this.g + " -> REMOVED. mLifecycleImpact  = " + this.y + " to REMOVING.");
        }
        this.g = su4Var2;
        this.y = ru4.a;
        this.t = true;
    }

    public final void r(pu4 pu4Var) {
        pu4Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.remove(pu4Var) && arrayList.isEmpty()) {
            y();
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.g + " lifecycleImpact = " + this.y + " fragment = " + this.r + "}";
    }

    public final void y() {
        this.j = false;
        if (!this.x) {
            if (kx1.N(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.x = true;
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.r.z = false;
        this.q.m();
    }
}
