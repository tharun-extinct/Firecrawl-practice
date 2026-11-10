package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class vr3 implements Iterator, vh2 {
    public boolean a = true;
    public final pd5[] j;
    public int t;

    public vr3(od5 od5Var, pd5[] pd5VarArr) {
        this.j = pd5VarArr;
        pd5VarArr[0].g(od5Var.n, Integer.bitCount(od5Var.g) * 2, 0);
        this.t = 0;
        g();
    }

    public final void g() {
        int i = this.t;
        pd5[] pd5VarArr = this.j;
        pd5 pd5Var = pd5VarArr[i];
        if (pd5Var.a < pd5Var.t) {
            return;
        }
        while (-1 < i) {
            int iY = y(i);
            if (iY == -1) {
                pd5 pd5Var2 = pd5VarArr[i];
                int i2 = pd5Var2.a;
                Object[] objArr = pd5Var2.j;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    pd5Var2.a = i2 + 1;
                    iY = y(i);
                }
            }
            if (iY != -1) {
                this.t = iY;
                return;
            }
            if (i > 0) {
                pd5 pd5Var3 = pd5VarArr[i - 1];
                int i3 = pd5Var3.a;
                int length2 = pd5Var3.j.length;
                pd5Var3.a = i3 + 1;
            }
            pd5VarArr[i].g(od5.v.n, 0, 0);
            i--;
        }
        this.a = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.a) {
            uo1.b();
            return null;
        }
        Object next = this.j[this.t].next();
        g();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int y(int i) {
        pd5[] pd5VarArr = this.j;
        pd5 pd5Var = pd5VarArr[i];
        int i2 = pd5Var.a;
        if (i2 < pd5Var.t) {
            return i;
        }
        Object[] objArr = pd5Var.j;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        od5 od5Var = (od5) obj;
        if (i == 6) {
            pd5 pd5Var2 = pd5VarArr[i + 1];
            Object[] objArr2 = od5Var.n;
            pd5Var2.g(objArr2, objArr2.length, 0);
        } else {
            pd5VarArr[i + 1].g(od5Var.n, Integer.bitCount(od5Var.g) * 2, 0);
        }
        return y(i + 1);
    }
}
