package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a16 extends a06 {
    public final transient Object[] a;
    public final transient boolean m;
    public final transient int q;

    /* JADX WARN: Multi-variable type inference failed */
    public a16(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.m = i;
        this.q = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jr2.G(i, this.q);
        Object obj = this.a[i + i + (this.m ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }

    @Override // defpackage.tz5
    public final boolean x() {
        return true;
    }
}
