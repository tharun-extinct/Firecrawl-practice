package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class st4 implements Parcelable, ww4, List, RandomAccess, wh2 {
    public static final Parcelable.Creator<st4> CREATOR = new rt4((byte) 0);
    public lw4 j;

    public st4(y0 y0Var) {
        at4 at4VarJ = it4.j();
        lw4 lw4Var = new lw4(at4VarJ.l(), y0Var);
        if (!(at4VarJ instanceof d32)) {
            lw4Var.y = new lw4(1L, y0Var);
        }
        this.j = lw4Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            y0 y0VarN = y0Var.n(obj);
            if (y0VarN.equals(y0Var)) {
                return false;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i, y0VarN, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            y0 y0VarV = y0Var.v(collection);
            if (yf2.p(y0VarV, y0Var)) {
                return false;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i, y0VarV, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
        return true;
    }

    @Override // defpackage.ww4
    public final void b(yw4 yw4Var) {
        yw4Var.y = this.j;
        this.j = (lw4) yw4Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        at4 at4VarJ;
        lw4 lw4Var = this.j;
        lw4Var.getClass();
        synchronized (it4.r) {
            at4VarJ = it4.j();
            lw4 lw4Var2 = (lw4) it4.f(lw4Var, this, at4VarJ);
            synchronized (yf2.s) {
                lw4Var2.r = rr4.t;
                lw4Var2.n++;
                lw4Var2.v++;
            }
        }
        it4.q(at4VarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return yf2.J(this).r.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return yf2.J(this).r.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return yf2.J(this).r.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return yf2.J(this).r.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return yf2.J(this).r.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final void k(int i, int i2) {
        int i3;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i3 = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            js3 js3VarX = y0Var.x();
            js3VarX.subList(i, i2).clear();
            y0 y0VarN = js3VarX.n();
            if (yf2.p(y0VarN, y0Var)) {
                return;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i3, y0VarN, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return yf2.J(this).r.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new tv2(this, 0);
    }

    @Override // defpackage.ww4
    public final yw4 n() {
        return this.j;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            int iIndexOf = y0Var.indexOf(obj);
            y0 y0VarJ = iIndexOf != -1 ? y0Var.j(iIndexOf) : y0Var;
            if (y0VarJ.equals(y0Var)) {
                return false;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i, y0VarJ, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            y0 y0VarL = y0Var.l(new w0(collection, (byte) 0));
            if (yf2.p(y0VarL, y0Var)) {
                return false;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i, y0VarL, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return yf2.Q(this, new w0(collection, (byte) 3));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        Object obj2 = get(i);
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i2 = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            y0 y0VarA = y0Var.a(i, obj);
            if (y0VarA.equals(y0Var)) {
                break;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i2, y0VarA, false);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return yf2.J(this).r.g();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            aw3.g("fromIndex or toIndex are out of bounds");
        }
        return new ky4(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pw5.S(this);
    }

    public final String toString() {
        lw4 lw4Var = this.j;
        lw4Var.getClass();
        return "SnapshotStateList(value=" + ((lw4) it4.x(lw4Var)).r + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        y0 y0Var = yf2.J(this).r;
        int iG = y0Var.g();
        parcel.writeInt(iG);
        for (int i2 = 0; i2 < iG; i2++) {
            parcel.writeValue(y0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pw5.T(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new tv2(this, i);
    }

    public st4() {
        this(rr4.t);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i2 = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            y0 y0VarY = y0Var.y(i, obj);
            if (y0VarY.equals(y0Var)) {
                return;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i2, y0VarY, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return yf2.Q(this, new v2(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        y0 y0Var;
        at4 at4VarJ;
        boolean zU;
        Object obj = get(i);
        do {
            synchronized (yf2.s) {
                lw4 lw4Var = this.j;
                lw4Var.getClass();
                lw4 lw4Var2 = (lw4) it4.x(lw4Var);
                i2 = lw4Var2.n;
                y0Var = lw4Var2.r;
            }
            y0Var.getClass();
            y0 y0VarJ = y0Var.j(i);
            if (y0VarJ.equals(y0Var)) {
                break;
            }
            lw4 lw4Var3 = this.j;
            lw4Var3.getClass();
            synchronized (it4.r) {
                at4VarJ = it4.j();
                zU = yf2.u((lw4) it4.f(lw4Var3, this, at4VarJ), i2, y0VarJ, true);
            }
            it4.q(at4VarJ, this);
        } while (!zU);
        return obj;
    }
}
