package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ab3 implements Iterator, vh2 {
    public Object a;
    public final /* synthetic */ byte j;
    public final Object m;
    public int t;

    public ab3(lb3 lb3Var) {
        this.j = (byte) 1;
        this.m = lb3Var;
        this.t = -1;
        this.a = lr2.d(new kb3(lb3Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.j) {
            case 0:
                return ((ck4) this.a).hasNext();
            case 1:
                return ((ck4) this.a).hasNext();
            default:
                return this.t < ((Map) this.m).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                return ((ck4) this.a).next();
            case 1:
                return ((ck4) this.a).next();
            default:
                if (!hasNext()) {
                    uo1.b();
                    return null;
                }
                Object obj = this.a;
                this.t++;
                Object obj2 = ((Map) this.m).get(obj);
                if (obj2 != null) {
                    this.a = ((qv2) obj2).y;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.j;
        Object obj = this.m;
        switch (b) {
            case 0:
                int i = this.t;
                if (i != -1) {
                    ((bb3) obj).t.t(i);
                    this.t = -1;
                    return;
                }
                return;
            case 1:
                int i2 = this.t;
                if (i2 != -1) {
                    ((lb3) obj).t.w(i2);
                    this.t = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ab3(Object obj, Map map) {
        this.j = (byte) 2;
        this.a = obj;
        this.m = map;
    }

    public ab3(bb3 bb3Var) {
        this.j = (byte) 0;
        this.m = bb3Var;
        this.t = -1;
        this.a = lr2.d(new za3(bb3Var, this, null));
    }
}
