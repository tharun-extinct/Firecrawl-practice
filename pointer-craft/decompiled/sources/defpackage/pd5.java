package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class pd5 implements Iterator, vh2 {
    public int a;
    public Object[] j = od5.v.n;
    public int t;

    public final void g(Object[] objArr, int i, int i2) {
        this.j = objArr;
        this.t = i;
        this.a = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
