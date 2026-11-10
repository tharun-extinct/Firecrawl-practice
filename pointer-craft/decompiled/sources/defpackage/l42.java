package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l42 implements Iterator, vh2 {
    public int a;
    public final mr4 j;
    public final int m;
    public final int t;

    public l42(mr4 mr4Var, int i, int i2) {
        this.j = mr4Var;
        this.t = i2;
        this.a = i;
        this.m = mr4Var.i;
        if (mr4Var.c) {
            or4.v();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        mr4 mr4Var = this.j;
        int i = mr4Var.i;
        int i2 = this.m;
        if (i != i2) {
            or4.v();
        }
        int i3 = this.a;
        this.a = mr4Var.j[(i3 * 5) + 3] + i3;
        return new nr4(mr4Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
