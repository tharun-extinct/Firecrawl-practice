package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qr4 extends x0 {
    public static final qr4 t = new qr4(new Object[0]);
    public final Object[] j;

    public qr4(Object[] objArr) {
        this.j = objArr;
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.j;
        fz5.g(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.p0, java.util.List
    public final int indexOf(Object obj) {
        return pr.b0(this.j, obj);
    }

    @Override // defpackage.p0, java.util.List
    public final int lastIndexOf(Object obj) {
        return pr.e0(this.j, obj);
    }

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.j;
        fz5.y(i, objArr.length);
        return new d70(objArr, i, objArr.length);
    }

    public final is3 y() {
        return new is3(this, null, this.j, 0);
    }
}
