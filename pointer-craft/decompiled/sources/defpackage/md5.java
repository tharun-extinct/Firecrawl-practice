package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class md5 extends q0 {
    public int a;
    public Object[] m;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public md5(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        objArr.getClass();
        this.a = i3;
        Object[] objArr2 = new Object[i3];
        this.m = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.q = r5;
        objArr2[0] = objArr;
        y(i - r5, 1);
    }

    public final Object g() {
        int i = this.j & 31;
        Object obj = this.m[this.a - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        Object objG = g();
        int i = this.j + 1;
        this.j = i;
        if (i == this.t) {
            this.q = true;
            return objG;
        }
        r(0);
        return objG;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uo1.b();
            return null;
        }
        this.j--;
        if (this.q) {
            this.q = false;
            return g();
        }
        r(31);
        return g();
    }

    public final void r(int i) {
        int i2 = 0;
        while (xz5.y(this.j, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            y(this.j, ((this.a - 1) - (i2 / 5)) + 1);
        }
    }

    public final void y(int i, int i2) {
        int i3 = (this.a - i2) * 5;
        while (i2 < this.a) {
            Object[] objArr = this.m;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[xz5.y(i, i3)];
            i3 -= 5;
            i2++;
        }
    }
}
