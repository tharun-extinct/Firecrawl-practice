package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jy5 extends yx5 {
    public final transient int c;
    public final transient uy5 q;
    public final transient Object[] w;

    public jy5(uy5 uy5Var, Object[] objArr, int i) {
        super((byte) 0);
        this.q = uy5Var;
        this.w = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.q.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fx5
    public final int g(Object[] objArr) {
        qx5 fy5Var = this.m;
        if (fy5Var == null) {
            fy5Var = new fy5(this);
            this.m = fy5Var;
        }
        return fy5Var.g(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        qx5 fy5Var = this.m;
        if (fy5Var == null) {
            fy5Var = new fy5(this);
            this.m = fy5Var;
        }
        return fy5Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
