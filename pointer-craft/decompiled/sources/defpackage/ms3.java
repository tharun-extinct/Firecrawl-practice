package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ms3 extends q0 {
    public final is3 a;
    public int m;
    public md5 q;
    public int w;

    public ms3(is3 is3Var, int i) {
        super(i, is3Var.w);
        this.a = is3Var;
        this.m = is3Var.x();
        this.w = -1;
        r();
    }

    @Override // defpackage.q0, java.util.ListIterator
    public final void add(Object obj) {
        g();
        this.a.add(this.j, obj);
        this.j++;
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
        md5 md5Var = this.q;
        is3 is3Var = this.a;
        if (md5Var == null) {
            Object[] objArr = is3Var.q;
            this.j = i + 1;
            return objArr[i];
        }
        if (md5Var.hasNext()) {
            this.j++;
            return md5Var.next();
        }
        Object[] objArr2 = is3Var.q;
        int i2 = this.j;
        this.j = i2 + 1;
        return objArr2[i2 - md5Var.t];
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
        md5 md5Var = this.q;
        is3 is3Var = this.a;
        if (md5Var == null) {
            Object[] objArr = is3Var.q;
            int i2 = i - 1;
            this.j = i2;
            return objArr[i2];
        }
        int i3 = md5Var.t;
        if (i <= i3) {
            this.j = i - 1;
            return md5Var.previous();
        }
        Object[] objArr2 = is3Var.q;
        int i4 = i - 1;
        this.j = i4;
        return objArr2[i4 - i3];
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void r() {
        is3 is3Var = this.a;
        Object[] objArr = is3Var.m;
        if (objArr == null) {
            this.q = null;
            return;
        }
        int i = (is3Var.w - 1) & (-32);
        int i2 = this.j;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (is3Var.j / 5) + 1;
        md5 md5Var = this.q;
        if (md5Var == null) {
            this.q = new md5(objArr, i2, i, i3);
            return;
        }
        md5Var.j = i2;
        md5Var.t = i;
        md5Var.a = i3;
        Object[] objArr2 = md5Var.m;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            md5Var.m = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        md5Var.q = r0;
        md5Var.y(i2 - r0, 1);
    }

    @Override // defpackage.q0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        g();
        int i = this.w;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.a.y(i);
        int i2 = this.w;
        if (i2 < this.j) {
            this.j = i2;
        }
        y();
    }

    @Override // defpackage.q0, java.util.ListIterator
    public final void set(Object obj) {
        g();
        int i = this.w;
        if (i == -1) {
            throw new IllegalStateException();
        }
        is3 is3Var = this.a;
        is3Var.set(i, obj);
        this.m = is3Var.x();
        r();
    }

    public final void y() {
        is3 is3Var = this.a;
        this.t = is3Var.g();
        this.m = is3Var.x();
        this.w = -1;
        r();
    }
}
