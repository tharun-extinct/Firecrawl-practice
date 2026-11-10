package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xa3 {
    public Object[] g;
    public va3 r;
    public int y;

    public xa3(int i) {
        this.g = i == 0 ? ni3.g : new Object[i];
    }

    public final boolean a() {
        return this.y != 0;
    }

    public final void b(int i) {
        StringBuilder sbP = du4.p(i, "Index ", " must be in 0..");
        sbP.append(this.y - 1);
        cf6.t(sbP.toString());
        throw null;
    }

    public final void c(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        pr.O(objArr, objArr2, 0, 0, length);
        this.g = objArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xa3) {
            xa3 xa3Var = (xa3) obj;
            int i = xa3Var.y;
            int i2 = this.y;
            if (i == i2) {
                Object[] objArr = this.g;
                Object[] objArr2 = xa3Var.g;
                me2 me2VarK = xs2.K(0, i2);
                int i3 = me2VarK.j;
                int i4 = me2VarK.t;
                if (i3 > i4) {
                    return true;
                }
                while (yf2.p(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void g(Object obj) {
        int i = this.y + 1;
        Object[] objArr = this.g;
        if (objArr.length < i) {
            c(i, objArr);
        }
        Object[] objArr2 = this.g;
        int i2 = this.y;
        objArr2[i2] = obj;
        this.y = i2 + 1;
    }

    public final int hashCode() {
        Object[] objArr = this.g;
        int i = this.y;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final Object i(int i, Object obj) {
        if (i < 0 || i >= this.y) {
            b(i);
            throw null;
        }
        Object[] objArr = this.g;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final int j(Object obj) {
        Object[] objArr = this.g;
        int i = 0;
        if (obj == null) {
            int i2 = this.y;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.y;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object l(int i) {
        if (i >= 0 && i < this.y) {
            return this.g[i];
        }
        b(i);
        throw null;
    }

    public final boolean m(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        q(iJ);
        return true;
    }

    public final void n() {
        pr.T(0, this.y, null, this.g);
        this.y = 0;
    }

    public final Object q(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.y)) {
            b(i);
            throw null;
        }
        Object[] objArr = this.g;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            pr.O(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.y - 1;
        this.y = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void r(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.y;
        int size = list.size() + i;
        Object[] objArr = this.g;
        if (objArr.length < size) {
            c(size, objArr);
        }
        Object[] objArr2 = this.g;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.y = list.size() + this.y;
    }

    public final boolean t() {
        return this.y == 0;
    }

    public final String toString() {
        ll2 ll2Var = new ll2(this, (byte) 7);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.g;
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) ll2Var.a(obj));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final boolean v(Object obj) {
        return j(obj) >= 0;
    }

    public final void w(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.y) || i2 < 0 || i2 > i3) {
            StringBuilder sbS = du4.s(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbS.append(this.y);
            cf6.t(sbS.toString());
            throw null;
        }
        if (i2 < i) {
            cf6.l("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.g;
                pr.O(objArr, objArr, i, i2, i3);
            }
            int i4 = this.y;
            int i5 = i4 - (i2 - i);
            pr.T(i5, i4, null, this.g);
            this.y = i5;
        }
    }

    public final Object x() {
        if (!t()) {
            return this.g[0];
        }
        cf6.a("ObjectList is empty.");
        throw null;
    }

    public final void y(xa3 xa3Var) {
        xa3Var.getClass();
        if (xa3Var.t()) {
            return;
        }
        int i = this.y + xa3Var.y;
        Object[] objArr = this.g;
        if (objArr.length < i) {
            c(i, objArr);
        }
        pr.O(xa3Var.g, this.g, this.y, 0, xa3Var.y);
        this.y += xa3Var.y;
    }

    public /* synthetic */ xa3() {
        this(16);
    }
}
