package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e12 implements Iterator, vh2 {
    public final /* synthetic */ f12 a;
    public Object j;
    public int t = -2;

    public e12(f12 f12Var) {
        this.a = f12Var;
    }

    public final void g() {
        Object objA;
        int i = this.t;
        f12 f12Var = this.a;
        if (i == -2) {
            objA = f12Var.g.g();
        } else {
            xy1 xy1Var = f12Var.y;
            Object obj = this.j;
            obj.getClass();
            objA = xy1Var.a(obj);
        }
        this.j = objA;
        this.t = objA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.t < 0) {
            g();
        }
        return this.t == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.t < 0) {
            g();
        }
        if (this.t == 0) {
            uo1.b();
            return null;
        }
        Object obj = this.j;
        obj.getClass();
        this.t = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
