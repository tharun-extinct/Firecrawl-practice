package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class es3 extends o {
    public final ur3 j;

    public es3(ur3 ur3Var) {
        this.j = ur3Var;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.j.containsValue(obj);
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.t;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        od5 od5Var = this.j.j;
        pd5[] pd5VarArr = new pd5[8];
        for (int i = 0; i < 8; i++) {
            pd5VarArr[i] = new rd5((byte) 1);
        }
        return new ds3(od5Var, pd5VarArr);
    }
}
