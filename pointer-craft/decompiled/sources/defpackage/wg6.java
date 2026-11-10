package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wg6 extends kw5 implements ListIterator {
    public int a;
    public final qi6 m;
    public final int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(qi6 qi6Var, int i) {
        super((byte) 0);
        int size = qi6Var.size();
        if (i < 0 || i > size) {
            l0.p(yc6.x(i, size, "index"));
            throw null;
        }
        this.t = size;
        this.a = i;
        this.m = qi6Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object g(int i) {
        return this.m.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.a < this.t;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        int i = this.a;
        this.a = i + 1;
        return g(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        int i = this.a - 1;
        this.a = i;
        return g(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
