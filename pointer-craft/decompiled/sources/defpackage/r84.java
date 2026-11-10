package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class r84 extends p0 {
    public final List j;

    public r84(List list) {
        list.getClass();
        this.j = list;
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= pw5.u(this)) {
            return this.j.get(pw5.u(this) - i);
        }
        StringBuilder sbP = du4.p(i, "Element index ", " must be in range [");
        sbP.append(new me2(0, pw5.u(this), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // defpackage.p0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new q84(this, 0);
    }

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator() {
        return new q84(this, 0);
    }

    @Override // defpackage.p0, java.util.List
    public final ListIterator listIterator(int i) {
        return new q84(this, i);
    }
}
