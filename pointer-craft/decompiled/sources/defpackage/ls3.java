package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ls3 extends r0 {
    public final Object[] a;
    public final nd5 m;

    public ls3(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.a = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.m = new nd5(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        nd5 nd5Var = this.m;
        if (nd5Var.hasNext()) {
            this.j++;
            return nd5Var.next();
        }
        int i = this.j;
        this.j = i + 1;
        return this.a[i - nd5Var.t];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        int i = this.j;
        nd5 nd5Var = this.m;
        int i2 = nd5Var.t;
        if (i <= i2) {
            this.j = i - 1;
            return nd5Var.previous();
        }
        int i3 = i - 1;
        this.j = i3;
        return this.a[i3 - i2];
    }
}
