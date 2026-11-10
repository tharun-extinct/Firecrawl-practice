package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ur4 implements Iterator {
    public Iterator a;
    public int j = -1;
    public final /* synthetic */ sr4 m;
    public boolean t;

    public ur4(sr4 sr4Var) {
        this.m = sr4Var;
    }

    public final Iterator g() {
        Iterator it = this.a;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.m.t.entrySet().iterator();
        this.a = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.j + 1;
        sr4 sr4Var = this.m;
        return i < sr4Var.j.size() || (!sr4Var.t.isEmpty() && g().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.t = true;
        int i = this.j + 1;
        this.j = i;
        sr4 sr4Var = this.m;
        return i < sr4Var.j.size() ? (Map.Entry) sr4Var.j.get(this.j) : (Map.Entry) g().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.t) {
            l0.z("remove() was called before next()");
            return;
        }
        this.t = false;
        int i = sr4.w;
        sr4 sr4Var = this.m;
        sr4Var.y();
        if (this.j >= sr4Var.j.size()) {
            g().remove();
            return;
        }
        int i2 = this.j;
        this.j = i2 - 1;
        sr4Var.j(i2);
    }
}
