package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yb5 implements Iterator, vh2 {
    public final Object a;
    public final /* synthetic */ byte j = 0;
    public Iterator t;

    public yb5(Iterator it) {
        it.getClass();
        this.a = new ArrayList();
        this.t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.j) {
            case 0:
                break;
        }
        return this.t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.j;
        Object obj = this.a;
        switch (b) {
            case 0:
                return ((h25) obj).r.a(this.t.next());
            default:
                Object next = this.t.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                m0 m0Var = viewGroup != null ? new m0(viewGroup, (byte) 2) : null;
                if (m0Var == null || !m0Var.hasNext()) {
                    while (!this.t.hasNext() && !arrayList.isEmpty()) {
                        this.t = (Iterator) cj0.r0(arrayList);
                        hj0.d0(arrayList);
                    }
                } else {
                    arrayList.add(this.t);
                    this.t = m0Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yb5(h25 h25Var) {
        this.a = h25Var;
        this.t = h25Var.y.iterator();
    }
}
