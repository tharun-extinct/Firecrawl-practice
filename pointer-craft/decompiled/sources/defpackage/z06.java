package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class z06 extends n06 {
    public final transient c16 a;
    public final transient a16 m;

    public z06(c16 c16Var, a16 a16Var) {
        this.a = c16Var;
        this.m = a16Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.tz5
    public final int g(Object[] objArr) {
        return this.m.g(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.m.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.w;
    }

    @Override // defpackage.n06, defpackage.tz5
    public final a06 v() {
        return this.m;
    }
}
