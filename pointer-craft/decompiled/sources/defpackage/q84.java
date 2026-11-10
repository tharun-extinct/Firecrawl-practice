package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class q84 implements ListIterator, vh2 {
    public final ListIterator j;
    public final /* synthetic */ r84 t;

    public q84(r84 r84Var, int i) {
        this.t = r84Var;
        List list = r84Var.j;
        if (i >= 0 && i <= r84Var.g()) {
            this.j = list.listIterator(r84Var.g() - i);
            return;
        }
        StringBuilder sbP = du4.p(i, "Position index ", " must be in range [");
        sbP.append(new me2(0, r84Var.g(), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.j.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.j.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.j.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.t.size() - 1) - this.j.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.j.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.t.size() - 1) - this.j.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
