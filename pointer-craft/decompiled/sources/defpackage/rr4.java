package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class rr4 extends y0 {
    public static final rr4 t = new rr4(new Object[0]);
    public final Object[] j;

    public rr4(Object[] objArr) {
        this.j = objArr;
    }

    @Override // defpackage.y0
    public final y0 a(int i, Object obj) {
        Object[] objArr = this.j;
        br2.j(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new rr4(objArrCopyOf);
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.j;
        br2.j(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.p0, java.util.List
    public final int indexOf(Object obj) {
        return pr.b0(this.j, obj);
    }

    @Override // defpackage.y0
    public final y0 j(int i) {
        Object[] objArr = this.j;
        br2.j(i, objArr.length);
        if (objArr.length == 1) {
            return t;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        pr.O(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new rr4(objArrCopyOf);
    }

    @Override // defpackage.y0
    public final y0 l(w0 w0Var) {
        Object[] objArr = this.j;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) w0Var.a(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? t : new rr4(pr.S(objArrCopyOf, 0, length));
    }

    @Override // defpackage.p0, java.util.List
    public final int lastIndexOf(Object obj) {
        return pr.e0(this.j, obj);
    }

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.j;
        br2.t(i, objArr.length);
        return new e70(objArr, i, objArr.length);
    }

    @Override // defpackage.y0
    public final y0 n(Object obj) {
        Object[] objArr = this.j;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new rr4(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new hs3(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.y0
    public final y0 v(Collection collection) {
        Object[] objArr = this.j;
        if (collection.size() + objArr.length > 32) {
            js3 js3VarX = x();
            js3VarX.addAll(collection);
            return js3VarX.n();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new rr4(objArrCopyOf);
    }

    @Override // defpackage.y0
    public final js3 x() {
        return new js3(this, null, this.j, 0);
    }

    @Override // defpackage.y0
    public final y0 y(int i, Object obj) {
        Object[] objArr = this.j;
        br2.t(i, objArr.length);
        if (i == objArr.length) {
            return n(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            pr.Q(objArr, objArr2, 0, i, 6);
            pr.O(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new rr4(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        pr.O(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new hs3(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }
}
