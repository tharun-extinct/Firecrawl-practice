package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gs3 extends x0 {
    public final int a;
    public final Object[] j;
    public final int m;
    public final Object[] t;

    public gs3(Object[] objArr, Object[] objArr2, int i, int i2) {
        objArr.getClass();
        objArr2.getClass();
        this.j = objArr;
        this.t = objArr2;
        this.a = i;
        this.m = i2;
        if (g() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + g()).toString());
    }

    @Override // defpackage.o
    public final int g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.a;
        fz5.g(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.t;
        } else {
            Object[] objArr2 = this.j;
            for (int i3 = this.m; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[xz5.y(i, i3)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator(int i) {
        fz5.y(i, this.a);
        return new ks3(this.j, this.t, i, this.a, (this.m / 5) + 1);
    }
}
