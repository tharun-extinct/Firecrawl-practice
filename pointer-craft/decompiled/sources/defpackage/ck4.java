package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class ck4 implements Iterator, mu0, vh2 {
    public Iterator a;
    public byte j;
    public mu0 m;
    public Object t;

    public final RuntimeException g() {
        byte b = this.j;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.j));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            byte b = this.j;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.a;
                it.getClass();
                if (it.hasNext()) {
                    this.j = (byte) 2;
                    return true;
                }
                this.a = null;
            }
            this.j = (byte) 5;
            mu0 mu0Var = this.m;
            mu0Var.getClass();
            this.m = null;
            mu0Var.j(og5.g);
        }
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        js2.o(obj);
        this.j = (byte) 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.j;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            uo1.b();
            return null;
        }
        if (b == 2) {
            this.j = (byte) 1;
            Iterator it = this.a;
            it.getClass();
            return it.next();
        }
        if (b != 3) {
            throw g();
        }
        this.j = (byte) 0;
        Object obj = this.t;
        this.t = null;
        return obj;
    }

    public final void r(mu0 mu0Var, Object obj) {
        this.t = obj;
        this.j = (byte) 3;
        this.m = mu0Var;
        mu0Var.getClass();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return ni1.j;
    }

    public final void y(mu0 mu0Var) {
        this.m = mu0Var;
    }
}
