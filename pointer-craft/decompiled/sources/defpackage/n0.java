package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends m0 implements ListIterator {
    public final /* synthetic */ p0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, int i) {
        super(p0Var, (byte) 0);
        this.m = p0Var;
        int iG = p0Var.g();
        if (i < 0 || i > iG) {
            l0.p(du4.m(i, iG, "index: ", ", size: "));
            throw null;
        }
        this.t = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.t > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        int i = this.t - 1;
        this.t = i;
        return this.m.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
