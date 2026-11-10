package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class d31 implements j74 {
    public hs0 j;
    public final ui4 n;
    public final fa4 r;
    public final hi4 g = new hi4();
    public final ArrayList y = new ArrayList(1);
    public final v92 v = new v92((Object) this, (byte) 12);
    public final boolean l = true;
    public final c31 x = new c31(this, 0);

    public d31(fa4 fa4Var, ui4 ui4Var, aj6 aj6Var) {
        this.r = fa4Var;
        this.n = ui4Var;
    }

    public final void a() {
        hi4 hi4Var = this.g;
        if (hi4Var.isEmpty()) {
            Log.d("DefaultSelectionTracker", "Ignoring onDataSetChange. No active selection.");
            return;
        }
        hi4Var.t.clear();
        ArrayList arrayList = this.y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((xi4) arrayList.get(size)).getClass();
        }
        ArrayList arrayList2 = null;
        for (Object obj : hi4Var.j) {
            if (this.r.F(obj) != -1) {
                this.n.getClass();
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((xi4) arrayList.get(size2)).g(obj, true);
                }
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(obj);
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i = 0;
            while (i < size3) {
                Object obj2 = arrayList2.get(i);
                i++;
                n(obj2);
            }
        }
        j();
    }

    public final boolean g() {
        int i = 0;
        if (!v()) {
            return false;
        }
        hi4 hi4Var = this.g;
        Iterator it = hi4Var.t.iterator();
        while (it.hasNext()) {
            l(it.next(), false);
        }
        hi4Var.t.clear();
        if (v()) {
            t(y());
            j();
        }
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((xi4) obj).r();
        }
        return true;
    }

    public final void j() {
        ArrayList arrayList = this.y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((xi4) arrayList.get(size)).y();
        }
    }

    public final void l(Object obj, boolean z) {
        xs2.l(obj != null);
        ArrayList arrayList = this.y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((xi4) arrayList.get(size)).g(obj, z);
        }
    }

    public final boolean m(Long l) {
        xs2.l(l != null);
        hi4 hi4Var = this.g;
        if (hi4Var.contains(l)) {
            return false;
        }
        this.n.getClass();
        if (this.l && v()) {
            t(y());
        }
        hi4Var.j.add(l);
        l(l, true);
        j();
        return true;
    }

    public final boolean n(Object obj) {
        xs2.l(obj != null);
        hi4 hi4Var = this.g;
        if (!hi4Var.contains(obj)) {
            return false;
        }
        this.n.getClass();
        hi4Var.j.remove(obj);
        l(obj, false);
        j();
        if (hi4Var.isEmpty() && x()) {
            this.j = null;
            Iterator it = hi4Var.t.iterator();
            while (it.hasNext()) {
                l(it.next(), false);
            }
            hi4Var.t.clear();
        }
        return true;
    }

    @Override // defpackage.j74
    public final boolean r() {
        return v() || x();
    }

    @Override // defpackage.j74
    public final void reset() {
        g();
        this.j = null;
    }

    public final void t(jb3 jb3Var) {
        Iterator it = jb3Var.j.iterator();
        while (it.hasNext()) {
            l(it.next(), false);
        }
        Iterator it2 = jb3Var.t.iterator();
        while (it2.hasNext()) {
            l(it2.next(), false);
        }
    }

    public final boolean v() {
        return !this.g.isEmpty();
    }

    public final boolean x() {
        return this.j != null;
    }

    public final jb3 y() {
        this.j = null;
        jb3 jb3Var = new jb3();
        if (v()) {
            LinkedHashSet linkedHashSet = jb3Var.j;
            linkedHashSet.clear();
            hi4 hi4Var = this.g;
            linkedHashSet.addAll(hi4Var.j);
            LinkedHashSet linkedHashSet2 = jb3Var.t;
            linkedHashSet2.clear();
            linkedHashSet2.addAll(hi4Var.t);
            hi4Var.j.clear();
        }
        return jb3Var;
    }
}
