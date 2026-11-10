package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k13 implements Map.Entry, vh2 {
    public final Object j;
    public final Object t;

    public k13(Object obj, Object obj2) {
        this.j = obj;
        this.t = obj2;
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
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
