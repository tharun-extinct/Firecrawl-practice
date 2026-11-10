package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ua3 implements ListIterator, vh2 {
    public int a;
    public final /* synthetic */ byte j;
    public final List t;

    public ua3(List list, int i, byte b) {
        this.j = b;
        switch (b) {
            case 1:
                this.t = list;
                this.a = i;
                break;
            default:
                this.t = list;
                this.a = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                int i = this.a + 1;
                this.a = i;
                list.add(i, obj);
                break;
            default:
                list.add(this.a, obj);
                this.a++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                return this.a < list.size() - 1;
            default:
                return this.a < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.j) {
            case 0:
                return this.a >= 0;
            default:
                return this.a > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                int i = this.a + 1;
                this.a = i;
                return list.get(i);
            default:
                int i2 = this.a;
                this.a = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.j) {
            case 0:
                return this.a + 1;
            default:
                return this.a;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                int i = this.a;
                this.a = i - 1;
                return list.get(i);
            default:
                int i2 = this.a - 1;
                this.a = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.j) {
            case 0:
                return this.a;
            default:
                return this.a - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                list.remove(this.a);
                this.a--;
                break;
            default:
                int i = this.a - 1;
                this.a = i;
                list.remove(i);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                list.set(this.a, obj);
                break;
            default:
                list.set(this.a, obj);
                break;
        }
    }
}
