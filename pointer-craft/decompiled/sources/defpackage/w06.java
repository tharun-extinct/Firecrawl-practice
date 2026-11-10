package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w06 extends n06 {
    public final transient c16 a;
    public final transient Object[] m;
    public final transient int q;

    public w06(c16 c16Var, Object[] objArr, int i) {
        this.a = c16Var;
        this.m = objArr;
        this.q = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.a.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tz5
    public final int g(Object[] objArr) {
        return v().g(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return v().listIterator(0);
    }

    @Override // defpackage.n06
    public final a06 j() {
        return new t06(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.q;
    }
}
