package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jy4 implements ListIterator, vh2 {
    public final /* synthetic */ s54 j;
    public final /* synthetic */ ky4 t;

    public jy4(s54 s54Var, ky4 ky4Var) {
        this.j = s54Var;
        this.t = ky4Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.j.j < this.t.m - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.j.j >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        s54 s54Var = this.j;
        int i = s54Var.j + 1;
        ky4 ky4Var = this.t;
        yf2.c0(i, ky4Var.m);
        s54Var.j = i;
        return ky4Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.j.j + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        s54 s54Var = this.j;
        int i = s54Var.j;
        ky4 ky4Var = this.t;
        yf2.c0(i, ky4Var.m);
        s54Var.j = i - 1;
        return ky4Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.j.j;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
