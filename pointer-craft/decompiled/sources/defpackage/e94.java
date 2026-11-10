package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e94 implements Iterator, vh2 {
    public int a;
    public byte j;
    public int m;
    public final /* synthetic */ f94 q;
    public Object t;

    public e94(f94 f94Var) {
        this.q = f94Var;
        this.a = f94Var.m;
        this.m = f94Var.a;
    }

    public final boolean g() {
        this.j = (byte) 3;
        int i = this.a;
        if (i == 0) {
            this.j = (byte) 2;
            return false;
        }
        f94 f94Var = this.q;
        Object[] objArr = f94Var.j;
        int i2 = this.m;
        this.t = objArr[i2];
        this.j = (byte) 1;
        this.m = (i2 + 1) % f94Var.t;
        this.a = i - 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.j;
        if (b == 0) {
            return g();
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        l0.u("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.j;
        if (b == 1) {
            this.j = (byte) 0;
            return this.t;
        }
        if (b == 2 || !g()) {
            uo1.b();
            return null;
        }
        this.j = (byte) 0;
        return this.t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
