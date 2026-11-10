package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class tv2 implements ListIterator, vh2 {
    public int m;
    public final Object q;
    public int t;
    public final /* synthetic */ byte j = 1;
    public int a = -1;

    public tv2(st4 st4Var, int i) {
        this.q = st4Var;
        this.t = i - 1;
        this.m = yf2.K(st4Var);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.j;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                g();
                uv2 uv2Var = (uv2) obj2;
                int i = this.t;
                this.t = i + 1;
                uv2Var.add(i, obj);
                this.a = -1;
                this.m = ((AbstractList) uv2Var).modCount;
                break;
            default:
                y();
                st4 st4Var = (st4) obj2;
                st4Var.add(this.t + 1, obj);
                this.a = -1;
                this.t++;
                this.m = yf2.K(st4Var);
                break;
        }
    }

    public void g() {
        if (((AbstractList) ((uv2) this.q)).modCount != this.m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.j;
        Object obj = this.q;
        switch (b) {
            case 0:
                return this.t < ((uv2) obj).t;
            default:
                return this.t < ((st4) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.j) {
            case 0:
                return this.t > 0;
            default:
                return this.t >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.j;
        Object obj = this.q;
        switch (b) {
            case 0:
                g();
                int i = this.t;
                uv2 uv2Var = (uv2) obj;
                if (i >= uv2Var.t) {
                    uo1.b();
                    return null;
                }
                this.t = i + 1;
                this.a = i;
                return uv2Var.j[i];
            default:
                y();
                int i2 = this.t + 1;
                this.a = i2;
                st4 st4Var = (st4) obj;
                yf2.c0(i2, st4Var.size());
                Object obj2 = st4Var.get(i2);
                this.t = i2;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.j) {
            case 0:
                return this.t;
            default:
                return this.t + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.j;
        Object obj = this.q;
        switch (b) {
            case 0:
                g();
                int i = this.t;
                if (i <= 0) {
                    uo1.b();
                    return null;
                }
                int i2 = i - 1;
                this.t = i2;
                this.a = i2;
                return ((uv2) obj).j[i2];
            default:
                y();
                st4 st4Var = (st4) obj;
                yf2.c0(this.t, st4Var.size());
                int i3 = this.t;
                this.a = i3;
                Object obj2 = st4Var.get(i3);
                this.t--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.j) {
            case 0:
                return this.t - 1;
            default:
                return this.t;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.j;
        Object obj = this.q;
        switch (b) {
            case 0:
                uv2 uv2Var = (uv2) obj;
                g();
                int i = this.a;
                if (i == -1) {
                    l0.z("Call next() or previous() before removing element from the iterator.");
                } else {
                    uv2Var.y(i);
                    this.t = this.a;
                    this.a = -1;
                    this.m = ((AbstractList) uv2Var).modCount;
                }
                break;
            default:
                y();
                st4 st4Var = (st4) obj;
                st4Var.remove(this.a);
                this.t--;
                this.a = -1;
                this.m = yf2.K(st4Var);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.j;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                g();
                int i = this.a;
                if (i == -1) {
                    l0.z("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((uv2) obj2).set(i, obj);
                }
                break;
            default:
                st4 st4Var = (st4) obj2;
                y();
                int i2 = this.a;
                if (i2 < 0) {
                    l0.z("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                } else {
                    st4Var.set(i2, obj);
                    this.m = yf2.K(st4Var);
                }
                break;
        }
    }

    public void y() {
        if (yf2.K((st4) this.q) != this.m) {
            throw new ConcurrentModificationException();
        }
    }

    public tv2(uv2 uv2Var, int i) {
        this.q = uv2Var;
        this.t = i;
        this.m = ((AbstractList) uv2Var).modCount;
    }
}
