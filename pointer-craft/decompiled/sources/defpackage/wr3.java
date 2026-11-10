package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
public class wr3 extends vr3 {
    public int c;
    public final sr3 m;
    public Object q;
    public boolean w;

    public wr3(sr3 sr3Var, pd5[] pd5VarArr) {
        super(sr3Var.t, pd5VarArr);
        this.m = sr3Var;
        this.c = sr3Var.m;
    }

    @Override // defpackage.vr3, java.util.Iterator
    public final Object next() {
        if (this.m.m != this.c) {
            throw new ConcurrentModificationException();
        }
        if (!this.a) {
            uo1.b();
            return null;
        }
        pd5 pd5Var = this.j[this.t];
        this.q = pd5Var.j[pd5Var.a];
        this.w = true;
        return super.next();
    }

    public final void r(int i, od5 od5Var, Object obj, int i2) {
        int i3 = i2 * 5;
        pd5[] pd5VarArr = this.j;
        if (i3 <= 30) {
            int iU = 1 << aq2.u(i, i3);
            if (od5Var.j(iU)) {
                pd5VarArr[i2].g(od5Var.n, Integer.bitCount(od5Var.g) * 2, od5Var.x(iU));
                this.t = i2;
                return;
            } else {
                int iZ = od5Var.z(iU);
                od5 od5VarU = od5Var.u(iZ);
                pd5VarArr[i2].g(od5Var.n, Integer.bitCount(od5Var.g) * 2, iZ);
                r(i, od5VarU, obj, i2 + 1);
                return;
            }
        }
        pd5 pd5Var = pd5VarArr[i2];
        Object[] objArr = od5Var.n;
        pd5Var.g(objArr, objArr.length, 0);
        while (true) {
            pd5 pd5Var2 = pd5VarArr[i2];
            if (yf2.p(pd5Var2.j[pd5Var2.a], obj)) {
                this.t = i2;
                return;
            } else {
                pd5VarArr[i2].a += 2;
            }
        }
    }

    @Override // defpackage.vr3, java.util.Iterator
    public final void remove() {
        if (!this.w) {
            throw new IllegalStateException();
        }
        boolean z = this.a;
        sr3 sr3Var = this.m;
        if (!z) {
            ue5.o(sr3Var).remove(this.q);
        } else {
            if (!z) {
                uo1.b();
                return;
            }
            pd5 pd5Var = this.j[this.t];
            Object obj = pd5Var.j[pd5Var.a];
            ue5.o(sr3Var).remove(this.q);
            r(obj != null ? obj.hashCode() : 0, sr3Var.t, obj, 0);
        }
        this.q = null;
        this.w = false;
        this.c = sr3Var.m;
    }
}
