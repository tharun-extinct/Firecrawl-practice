package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class er implements Iterator, vh2 {
    public final Object a;
    public final /* synthetic */ byte j = 1;
    public int t;

    public er(ff1 ff1Var) {
        this.a = ff1Var.g.iterator();
        this.t = ff1Var.y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.j;
        Object obj = this.a;
        switch (b) {
            case 0:
                return this.t < ((Object[]) obj).length;
            default:
                Iterator it = (Iterator) obj;
                while (this.t > 0 && it.hasNext()) {
                    it.next();
                    this.t--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.j;
        Object obj = this.a;
        switch (b) {
            case 0:
                try {
                    int i = this.t;
                    this.t = i + 1;
                    return ((Object[]) obj)[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.t--;
                    l0.s(e.getMessage());
                    return null;
                }
            default:
                Iterator it = (Iterator) obj;
                while (this.t > 0 && it.hasNext()) {
                    it.next();
                    this.t--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public er(Object[] objArr) {
        objArr.getClass();
        this.a = objArr;
    }
}
