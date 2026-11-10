package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j04 {
    public final ArrayList g = new ArrayList();
    public nd2 n;
    public nd2 r;
    public int v;
    public boolean x;
    public final u05 y;

    public j04(u05 u05Var, ArrayList arrayList) {
        nd2 nd2Var = nd2.v;
        this.r = nd2Var;
        this.n = nd2Var;
        g(arrayList, false);
        g(arrayList, true);
        ArrayList arrayList2 = u05Var.y;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            nd2 nd2Var2 = u05Var.r;
            nd2 nd2Var3 = u05Var.n;
            this.r = nd2Var2;
            this.n = nd2Var3;
            r();
            y(u05Var.v);
        }
        this.y = u05Var;
    }

    public final void g(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pj0 pj0Var = (pj0) list.get(i);
            pj0Var.getClass();
            if (true == z) {
                j04 j04Var = pj0Var.r;
                if (j04Var != null) {
                    throw new IllegalStateException(pj0Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + j04Var + " but is still added to " + this);
                }
                pj0Var.r = this;
                this.g.add(pj0Var);
            }
        }
    }

    public final void r() {
        ArrayList arrayList = this.g;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        pj0 pj0Var = (pj0) arrayList.get(size);
        nd2 nd2Var = this.r;
        nd2 nd2Var2 = this.n;
        pj0Var.g = nd2Var;
        pj0Var.y = nd2Var2;
        throw null;
    }

    public final void y(int i) {
        ArrayList arrayList = this.g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pj0 pj0Var = (pj0) arrayList.get(size);
            pj0Var.getClass();
            if (pj0Var.n != i) {
                pj0Var.n = i;
                throw null;
            }
        }
    }
}
