package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ns3 extends r0 {
    public final js3 a;
    public int m;
    public nd5 q;
    public int w;

    public ns3(js3 js3Var, int i) {
        super(i, js3Var.i);
        this.a = js3Var;
        this.m = js3Var.x();
        this.w = -1;
        y();
    }

    @Override // defpackage.r0, java.util.ListIterator
    public final void add(Object obj) {
        g();
        int i = this.j;
        js3 js3Var = this.a;
        js3Var.add(i, obj);
        this.j++;
        this.t = js3Var.g();
        this.m = js3Var.x();
        this.w = -1;
        y();
    }

    public final void g() {
        if (this.m != this.a.x()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        g();
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        int i = this.j;
        this.w = i;
        nd5 nd5Var = this.q;
        js3 js3Var = this.a;
        if (nd5Var == null) {
            Object[] objArr = js3Var.c;
            this.j = i + 1;
            return objArr[i];
        }
        if (nd5Var.hasNext()) {
            this.j++;
            return nd5Var.next();
        }
        Object[] objArr2 = js3Var.c;
        int i2 = this.j;
        this.j = i2 + 1;
        return objArr2[i2 - nd5Var.t];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        g();
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        int i = this.j;
        this.w = i - 1;
        nd5 nd5Var = this.q;
        js3 js3Var = this.a;
        if (nd5Var == null) {
            Object[] objArr = js3Var.c;
            int i2 = i - 1;
            this.j = i2;
            return objArr[i2];
        }
        int i3 = nd5Var.t;
        if (i <= i3) {
            this.j = i - 1;
            return nd5Var.previous();
        }
        Object[] objArr2 = js3Var.c;
        int i4 = i - 1;
        this.j = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.r0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        g();
        int i = this.w;
        if (i == -1) {
            throw new IllegalStateException();
        }
        js3 js3Var = this.a;
        js3Var.y(i);
        int i2 = this.w;
        if (i2 < this.j) {
            this.j = i2;
        }
        this.t = js3Var.g();
        this.m = js3Var.x();
        this.w = -1;
        y();
    }

    @Override // defpackage.r0, java.util.ListIterator
    public final void set(Object obj) {
        g();
        int i = this.w;
        if (i == -1) {
            throw new IllegalStateException();
        }
        js3 js3Var = this.a;
        js3Var.set(i, obj);
        this.m = js3Var.x();
        y();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void y() {
        js3 js3Var = this.a;
        Object[] objArr = js3Var.w;
        if (objArr == null) {
            this.q = null;
            return;
        }
        int i = (js3Var.i - 1) & (-32);
        int i2 = this.j;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (js3Var.m / 5) + 1;
        nd5 nd5Var = this.q;
        if (nd5Var == null) {
            this.q = new nd5(objArr, i2, i, i3);
            return;
        }
        nd5Var.j = i2;
        nd5Var.t = i;
        nd5Var.a = i3;
        Object[] objArr2 = nd5Var.m;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            nd5Var.m = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        nd5Var.q = r0;
        nd5Var.y(i2 - r0, 1);
    }
}
