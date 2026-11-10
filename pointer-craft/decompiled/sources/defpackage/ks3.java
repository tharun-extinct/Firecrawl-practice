package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ks3 extends q0 {
    public final Object[] a;
    public final md5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks3(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        objArr.getClass();
        objArr2.getClass();
        this.a = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.m = new md5(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        md5 md5Var = this.m;
        if (md5Var.hasNext()) {
            this.j++;
            return md5Var.next();
        }
        int i = this.j;
        this.j = i + 1;
        return this.a[i - md5Var.t];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        int i = this.j;
        md5 md5Var = this.m;
        int i2 = md5Var.t;
        if (i <= i2) {
            this.j = i - 1;
            return md5Var.previous();
        }
        int i3 = i - 1;
        this.j = i3;
        return this.a[i3 - i2];
    }
}
