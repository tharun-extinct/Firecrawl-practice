package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kj6 extends qi6 {
    public final /* synthetic */ lj6 a;

    public kj6(lj6 lj6Var) {
        this.a = lj6Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        yc6.n(i, 1);
        Object[] objArr = (Object[]) this.a.q;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
