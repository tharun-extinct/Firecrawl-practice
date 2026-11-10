package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class sm3 extends p0 implements RandomAccess {
    public final fa0[] j;
    public final int[] t;

    public sm3(fa0[] fa0VarArr, int[] iArr) {
        this.j = fa0VarArr;
        this.t = iArr;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof fa0) {
            return super.contains((fa0) obj);
        }
        return false;
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.j[i];
    }

    @Override // defpackage.p0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof fa0) {
            return super.indexOf((fa0) obj);
        }
        return -1;
    }

    @Override // defpackage.p0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof fa0) {
            return super.lastIndexOf((fa0) obj);
        }
        return -1;
    }
}
