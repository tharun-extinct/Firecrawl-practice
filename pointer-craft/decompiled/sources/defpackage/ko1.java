package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ko1 implements Iterator, vh2 {
    public Object m;
    public final /* synthetic */ bk4 q;
    public final Iterator t;
    public final /* synthetic */ byte j = 1;
    public int a = -1;

    public ko1(h51 h51Var) {
        this.q = h51Var;
        this.t = new yb5((h25) h51Var.y);
    }

    public void g() {
        Object next;
        h51 h51Var = (h51) this.q;
        do {
            Iterator it = this.t;
            if (!it.hasNext()) {
                this.a = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((vy3) h51Var.r).a(next)).booleanValue());
        this.m = next;
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.j) {
            case 0:
                if (this.a == -1) {
                    g();
                }
                return this.a == 1;
            default:
                if (this.a == -1) {
                    y();
                }
                return this.a == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                if (this.a == -1) {
                    g();
                }
                if (this.a == 0) {
                    uo1.b();
                    return null;
                }
                Object obj = this.m;
                this.m = null;
                this.a = -1;
                return obj;
            default:
                if (this.a == -1) {
                    y();
                }
                if (this.a == 0) {
                    uo1.b();
                    return null;
                }
                Object obj2 = this.m;
                this.m = null;
                this.a = -1;
                return obj2;
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

    public void y() {
        Iterator it = this.t;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((h25) this.q).r.a(next)).booleanValue()) {
                this.a = 1;
                this.m = next;
                return;
            }
        }
        this.a = 0;
    }

    public ko1(h25 h25Var) {
        this.q = h25Var;
        this.t = h25Var.y.iterator();
    }
}
