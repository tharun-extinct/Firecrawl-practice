package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e13 extends d13 implements Iterator, vh2 {
    @Override // java.util.Iterator
    public final Object next() {
        y();
        int i = this.j;
        f13 f13Var = (f13) this.m;
        if (i >= f13Var.w) {
            uo1.b();
            return null;
        }
        this.j = i + 1;
        this.t = i;
        Object[] objArr = f13Var.t;
        objArr.getClass();
        Object obj = objArr[this.t];
        r();
        return obj;
    }
}
