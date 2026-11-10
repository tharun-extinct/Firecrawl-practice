package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fd3 implements Iterator, vh2 {
    public final /* synthetic */ gd3 a;
    public int j = -1;
    public boolean t;

    public fd3(gd3 gd3Var) {
        this.a = gd3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j + 1 < this.a.y.v();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        this.t = true;
        nu4 nu4Var = this.a.y;
        int i = this.j + 1;
        this.j = i;
        return (ad3) nu4Var.x(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.t) {
            l0.z("You must call next() before you can remove an element");
            return;
        }
        nu4 nu4Var = this.a.y;
        ((ad3) nu4Var.x(this.j)).a = null;
        int i = this.j;
        Object[] objArr = nu4Var.a;
        Object obj = objArr[i];
        Object obj2 = c93.f;
        if (obj != obj2) {
            objArr[i] = obj2;
            nu4Var.j = true;
        }
        this.j = i - 1;
        this.t = false;
    }
}
