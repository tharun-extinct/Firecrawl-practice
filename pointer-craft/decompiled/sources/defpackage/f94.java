package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class f94 extends p0 implements RandomAccess {
    public int a;
    public final Object[] j;
    public int m;
    public final int t;

    public f94(int i, Object[] objArr) {
        this.j = objArr;
        if (i < 0) {
            l0.t(xi3.j("ring buffer filled size should not be negative but it is ", i));
            throw null;
        }
        if (i <= objArr.length) {
            this.t = objArr.length;
            this.m = i;
        } else {
            StringBuilder sbP = du4.p(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbP.append(objArr.length);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
    }

    @Override // defpackage.o
    public final int g() {
        return this.m;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.m;
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.j[(this.a + i) % this.t];
    }

    @Override // defpackage.p0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e94(this);
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.m;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.m;
        int i3 = this.a;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.j;
            if (i5 >= i2 || i3 >= this.t) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public final void y() {
        if (3 > this.m) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 3, size = " + this.m).toString());
        }
        int i = this.a;
        int i2 = this.t;
        int i3 = (i + 3) % i2;
        Object[] objArr = this.j;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.a = i3;
        this.m -= 3;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }
}
