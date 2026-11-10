package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class s13 implements Map, vh2 {
    public hk1 a;
    public final hb3 j;
    public qi5 m;
    public hk1 t;

    public s13(hb3 hb3Var) {
        this.j = hb3Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.j.r(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.j.n(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        hk1 hk1Var = this.t;
        if (hk1Var != null) {
            return hk1Var;
        }
        hk1 hk1Var2 = new hk1(this.j, (byte) 0);
        this.t = hk1Var2;
        return hk1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s13.class != obj.getClass()) {
            return false;
        }
        return this.j.equals(((s13) obj).j);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.j.l(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.j.t();
    }

    @Override // java.util.Map
    public final Set keySet() {
        hk1 hk1Var = this.a;
        if (hk1Var != null) {
            return hk1Var;
        }
        hk1 hk1Var2 = new hk1(this.j, (byte) 1);
        this.a = hk1Var2;
        return hk1Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.j.v;
    }

    public final String toString() {
        return this.j.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        qi5 qi5Var = this.m;
        if (qi5Var != null) {
            return qi5Var;
        }
        qi5 qi5Var2 = new qi5(this.j);
        this.m = qi5Var2;
        return qi5Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
