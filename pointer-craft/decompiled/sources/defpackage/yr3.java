package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yr3 implements Iterator, vh2 {
    public final /* synthetic */ byte j = 1;
    public final Iterator t;

    public yr3(sr3 sr3Var) {
        pd5[] pd5VarArr = new pd5[8];
        for (int i = 0; i < 8; i++) {
            pd5VarArr[i] = new sd5(this);
        }
        this.t = new wr3(sr3Var, pd5VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.j) {
            case 0:
                return ((wr3) this.t).a;
            default:
                return this.t.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                return (Map.Entry) ((wr3) this.t).next();
            default:
                return (gj5) this.t.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.j) {
            case 0:
                ((wr3) this.t).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yr3(ej5 ej5Var) {
        this.t = ej5Var.s.iterator();
    }
}
