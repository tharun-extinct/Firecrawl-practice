package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tw5 extends zw5 {
    public final transient zw5 a;

    public tw5(zw5 zw5Var) {
        this.a = zw5Var;
    }

    @Override // defpackage.zw5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zw5 zw5Var = this.a;
        jd6.r(i, zw5Var.size());
        return zw5Var.get((zw5Var.size() - 1) - i);
    }

    @Override // defpackage.zw5, java.util.List
    public final int indexOf(Object obj) {
        zw5 zw5Var = this.a;
        int iLastIndexOf = zw5Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zw5Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.zw5, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final zw5 subList(int i, int i2) {
        zw5 zw5Var = this.a;
        jd6.n(i, i2, zw5Var.size());
        return zw5Var.subList(zw5Var.size() - i2, zw5Var.size() - i).x();
    }

    @Override // defpackage.zw5, java.util.List
    public final int lastIndexOf(Object obj) {
        zw5 zw5Var = this.a;
        int iIndexOf = zw5Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zw5Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.zw5
    public final zw5 x() {
        return this.a;
    }
}
