package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q44 extends Observable {
    public final boolean g() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void n(String str, int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            c31 c31Var = (c31) ((Observable) this).mObservers.get(size);
            switch (c31Var.g) {
                case 0:
                    if (!"Selection-Changed".equals(str)) {
                        ((d31) c31Var.y).a();
                    }
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) c31Var.y;
                    recyclerView.m(null);
                    p5 p5Var = recyclerView.q;
                    ArrayList arrayList = (ArrayList) p5Var.r;
                    arrayList.add(p5Var.j(str, 4, i, 1));
                    p5Var.g = 4 | p5Var.g;
                    if (arrayList.size() == 1) {
                        c31Var.g();
                    }
                    break;
            }
        }
    }

    public final void r(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            c31 c31Var = (c31) ((Observable) this).mObservers.get(size);
            switch (c31Var.g) {
                case 0:
                    d31 d31Var = (d31) c31Var.y;
                    d31Var.j = null;
                    hi4 hi4Var = d31Var.g;
                    Iterator it = hi4Var.t.iterator();
                    while (it.hasNext()) {
                        d31Var.l(it.next(), false);
                    }
                    hi4Var.t.clear();
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) c31Var.y;
                    recyclerView.m(null);
                    p5 p5Var = recyclerView.q;
                    ArrayList arrayList = (ArrayList) p5Var.r;
                    if (i != i2) {
                        arrayList.add(p5Var.j(null, 8, i, i2));
                        p5Var.g |= 8;
                        if (arrayList.size() == 1) {
                            c31Var.g();
                        }
                    }
                    break;
            }
        }
    }

    public final void v(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            c31 c31Var = (c31) ((Observable) this).mObservers.get(size);
            switch (c31Var.g) {
                case 0:
                    d31 d31Var = (d31) c31Var.y;
                    d31Var.j = null;
                    hi4 hi4Var = d31Var.g;
                    Iterator it = hi4Var.t.iterator();
                    while (it.hasNext()) {
                        d31Var.l(it.next(), false);
                    }
                    hi4Var.t.clear();
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) c31Var.y;
                    recyclerView.m(null);
                    p5 p5Var = recyclerView.q;
                    ArrayList arrayList = (ArrayList) p5Var.r;
                    arrayList.add(p5Var.j(null, 1, i, 1));
                    p5Var.g |= 1;
                    if (arrayList.size() == 1) {
                        c31Var.g();
                    }
                    break;
            }
        }
    }

    public final void x(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            c31 c31Var = (c31) ((Observable) this).mObservers.get(size);
            switch (c31Var.g) {
                case 0:
                    d31 d31Var = (d31) c31Var.y;
                    d31Var.j = null;
                    hi4 hi4Var = d31Var.g;
                    Iterator it = hi4Var.t.iterator();
                    while (it.hasNext()) {
                        d31Var.l(it.next(), false);
                    }
                    hi4Var.t.clear();
                    d31Var.a();
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) c31Var.y;
                    recyclerView.m(null);
                    p5 p5Var = recyclerView.q;
                    ArrayList arrayList = (ArrayList) p5Var.r;
                    arrayList.add(p5Var.j(null, 2, i, 1));
                    p5Var.g |= 2;
                    if (arrayList.size() == 1) {
                        c31Var.g();
                    }
                    break;
            }
        }
    }

    public final void y() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            c31 c31Var = (c31) ((Observable) this).mObservers.get(size);
            switch (c31Var.g) {
                case 0:
                    ((d31) c31Var.y).a();
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) c31Var.y;
                    recyclerView.m(null);
                    recyclerView.o0.x = true;
                    recyclerView.b0(true);
                    if (!recyclerView.q.l()) {
                        recyclerView.requestLayout();
                    }
                    break;
            }
        }
    }
}
