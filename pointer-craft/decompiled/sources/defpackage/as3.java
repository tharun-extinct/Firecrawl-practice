package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class as3 extends m1 {
    public final ur3 j;

    public as3(ur3 ur3Var) {
        this.j = ur3Var;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        ur3 ur3Var = this.j;
        Object obj2 = ur3Var.get(key);
        if (obj2 != null) {
            return obj2.equals(entry.getValue());
        }
        return entry.getValue() == null && ur3Var.containsKey(entry.getKey());
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.t;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        od5 od5Var = this.j.j;
        pd5[] pd5VarArr = new pd5[8];
        for (int i = 0; i < 8; i++) {
            pd5VarArr[i] = new qd5();
        }
        return new bs3(od5Var, pd5VarArr);
    }
}
