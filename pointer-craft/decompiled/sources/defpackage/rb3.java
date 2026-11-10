package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class rb3 implements RandomAccess {
    public int a = 0;
    public Object[] j;
    public qb3 t;

    public rb3(Object[] objArr) {
        this.j = objArr;
    }

    public final boolean a(Object obj) {
        int i = this.a - 1;
        if (i >= 0) {
            for (int i2 = 0; !yf2.p(this.j[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void c(int i, int i2) {
        if (i2 > i) {
            int i3 = this.a;
            if (i2 < i3) {
                Object[] objArr = this.j;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.a;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.j[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.a = i5;
        }
    }

    public final void g(int i, Object obj) {
        int i2 = this.a + 1;
        if (this.j.length < i2) {
            i(i2);
        }
        Object[] objArr = this.j;
        int i3 = this.a;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.a++;
    }

    public final void i(int i) {
        Object[] objArr = this.j;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.j = objArr2;
    }

    public final void j() {
        Object[] objArr = this.j;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.a = 0;
    }

    public final List l() {
        qb3 qb3Var = this.t;
        if (qb3Var != null) {
            return qb3Var;
        }
        qb3 qb3Var2 = new qb3(this);
        this.t = qb3Var2;
        return qb3Var2;
    }

    public final int m(Object obj) {
        Object[] objArr = this.j;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (yf2.p(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void n(int i, rb3 rb3Var) {
        int i2 = rb3Var.a;
        if (i2 == 0) {
            return;
        }
        int i3 = this.a + i2;
        if (this.j.length < i3) {
            i(i3);
        }
        Object[] objArr = this.j;
        int i4 = this.a;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(rb3Var.j, 0, objArr, i, i2);
        this.a += i2;
    }

    public final boolean q(Object obj) {
        int iM = m(obj);
        if (iM < 0) {
            return false;
        }
        w(iM);
        return true;
    }

    public final void v(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.a + size;
        if (this.j.length < i2) {
            i(i2);
        }
        Object[] objArr = this.j;
        int i3 = this.a;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.a += size;
    }

    public final Object w(int i) {
        Object[] objArr = this.j;
        Object obj = objArr[i];
        int i2 = this.a;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.a - 1;
        this.a = i4;
        objArr[i4] = null;
        return obj;
    }

    public final boolean x(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.a + size;
        if (this.j.length < i3) {
            i(i3);
        }
        Object[] objArr = this.j;
        int i4 = this.a;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                pw5.R();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.a += size;
        return true;
    }

    public final void y(Object obj) {
        int i = this.a + 1;
        if (this.j.length < i) {
            i(i);
        }
        Object[] objArr = this.j;
        int i2 = this.a;
        objArr[i2] = obj;
        this.a = i2 + 1;
    }
}
