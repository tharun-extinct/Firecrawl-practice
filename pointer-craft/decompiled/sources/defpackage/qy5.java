package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qy5 extends yx5 {
    public final transient uy5 q;
    public final transient sy5 w;

    public qy5(uy5 uy5Var, sy5 sy5Var) {
        super((byte) 0);
        this.q = uy5Var;
        this.w = sy5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.q.get(obj) != null;
    }

    @Override // defpackage.fx5
    public final int g(Object[] objArr) {
        return this.w.g(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.q.w;
    }
}
