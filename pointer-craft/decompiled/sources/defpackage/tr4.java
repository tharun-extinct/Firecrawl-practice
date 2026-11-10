package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tr4 implements Map.Entry, Comparable {
    public final /* synthetic */ sr4 a;
    public final Comparable j;
    public Object t;

    public tr4(sr4 sr4Var, Map.Entry entry) {
        this(sr4Var, (Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.j.compareTo(((tr4) obj).j);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.j;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.t;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Comparable g() {
        return this.j;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.j;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.t;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.a.y();
        Object obj2 = this.t;
        this.t = obj;
        return obj2;
    }

    public final String toString() {
        return this.j + "=" + this.t;
    }

    public tr4(sr4 sr4Var, Comparable comparable, Object obj) {
        this.a = sr4Var;
        this.j = comparable;
        this.t = obj;
    }
}
