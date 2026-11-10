package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fy5 extends qx5 {
    public final /* synthetic */ jy5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy5(jy5 jy5Var) {
        super((byte) 0);
        this.q = jy5Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        jy5 jy5Var = this.q;
        zq2.G(i, jy5Var.c);
        Object[] objArr = jy5Var.w;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q.c;
    }
}
