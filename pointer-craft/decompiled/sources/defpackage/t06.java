package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t06 extends a06 {
    public final /* synthetic */ w06 a;

    public t06(w06 w06Var) {
        this.a = w06Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        w06 w06Var = this.a;
        jr2.G(i, w06Var.q);
        Object[] objArr = w06Var.m;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.q;
    }

    @Override // defpackage.tz5
    public final boolean x() {
        return true;
    }
}
