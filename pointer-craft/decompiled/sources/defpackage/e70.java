package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e70 extends r0 {
    public final Object[] a;

    public e70(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.a = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        int i = this.j;
        this.j = i + 1;
        return this.a[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        int i = this.j - 1;
        this.j = i;
        return this.a[i];
    }
}
