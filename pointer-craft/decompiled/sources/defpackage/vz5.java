package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class vz5 extends lw5 implements ListIterator {
    public int a;
    public final a06 m;
    public final int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz5(a06 a06Var, int i) {
        super((byte) 2);
        int size = a06Var.size();
        jr2.H(i, size);
        this.t = size;
        this.a = i;
        this.m = a06Var;
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
