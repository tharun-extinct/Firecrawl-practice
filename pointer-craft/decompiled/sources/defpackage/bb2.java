package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb2 implements Iterator, vh2 {
    public boolean a;
    public int j;
    public int t;

    public bb2(int i) {
        this.j = i;
    }

    public abstract Object g(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        Object objG = g(this.t);
        this.t++;
        this.a = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.a) {
            cf6.j("Call next() before removing an element.");
            throw null;
        }
        int i = this.t - 1;
        this.t = i;
        y(i);
        this.j--;
        this.a = false;
    }

    public abstract void y(int i);
}
