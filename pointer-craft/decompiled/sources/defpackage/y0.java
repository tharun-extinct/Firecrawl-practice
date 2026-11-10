package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 extends p0 {
    public abstract y0 a(int i, Object obj);

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.o, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.p0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract y0 j(int i);

    public abstract y0 l(w0 w0Var);

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract y0 n(Object obj);

    @Override // defpackage.p0, java.util.List
    public final List subList(int i, int i2) {
        return new pa2(this, i, i2);
    }

    public y0 v(Collection collection) {
        js3 js3VarX = x();
        js3VarX.addAll(collection);
        return js3VarX.n();
    }

    public abstract js3 x();

    public abstract y0 y(int i, Object obj);
}
