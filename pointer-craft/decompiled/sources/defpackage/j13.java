package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j13 implements Map.Entry, vh2 {
    public final Object j;
    public final Object t;

    public j13(Object obj, Object obj2) {
        this.j = obj;
        this.t = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && yf2.p(entry.getKey(), this.j) && yf2.p(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.j;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.j;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return this.j + "=" + getValue();
    }
}
